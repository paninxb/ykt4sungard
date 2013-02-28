// KsBu.cpp : �������̨Ӧ�ó������ڵ㡣
//
#include "stdafx.h"
#include <stdio.h>
#include <comdef.h>
#include "profile.h"
#include "slist.h"
#include "cpack.h"
//#include "busqc.h"  // �����sqc������ص�ȫ�ֱ����ͺ�������
#include "svrlink.h"
#include "bdefine.h"
#include "logfile.h"
#include "pubfunc.h"
//#include "pubdb.h"
//#include "dbfunc.h"
#include "ksbu.h"
#include "mypub.h"
#include "BDFunc.inl"
#include "LoadDll.h"
#include "DllFun.h"

//#include "PersonInfoApi.h"

ST_BUNIT g_BUnit;		// ����ֻ�е�һҵ������Ԫ
ST_SQLDB g_SqlDB;

CSvrLink *g_pSvrLink;   // ��ҵ��������ĵ�����

//CLogFile g_LogFile;		// ���Ƶ�SvrLink.cpp�У���Ϊϵͳ��Ҫ������

extern TBDefine g_XBDefines[];  // �ھ���ĺ������岿�֣���BDFTest.cpp -> BDFunc.inl��

#ifdef _DYNAMIC_LOAD
	CLoadDll g_LoadDll;
#endif

/* ****** Updated by CHENYH at 2005-11-5 14:51:49 ****** 
����������bupub.cpp���Ƶ������Ϊ�˲�ͬϵͳ�����Լ��Ļ������е���
*******************************************************/
// ������: WriteAppInfo
// ���  : ������ 2004-3-22 15:34:38
// ����  : BCC���һ�����Ӻõ�BU�����һ��ˢ�º�̨�������Ա�ҵ��ģ�鲿���ܹ�����ش���
//     ע�⣺�ú������ڿ�ܳ����ڽ��յ�BCC��WriteAppInfo��ʱ����õġ�
// ����  : int 
// ����  : int bccBaseFuncNo
// ����  : int bccID
int WriteAppInfo(int bccBaseFuncNo,int bccID)
{
	// ������Ҫ����ҵ�����Ͳ�ͬ����Ӧ������

	// ����Ҫ���ö�̬ע�Ṧ�ܵ�ʱ��������Խ��б�BU����BCCע�Ṧ�ܵĴ���
	TBDefine *pBDefine;
	for (pBDefine=g_XBDefines;pBDefine->RequestType!=0;pBDefine++)
	{
		g_pSvrLink->UpdateRegFunction(pBDefine->RequestType,pBDefine->szRTName,pBDefine->szProgrammer,pBDefine->iPriority,pBDefine->bStoped);
	}

	return(0);
}

int ERR_DEAL(char *msg,int retcode)
{
	return(g_pSvrLink->Err_Deal(msg,retcode));
}

/* ****** Updated by CHENYH at 2005-11-5 14:50:13 ****** 
����������bdefine.cpp����ȡ��������Ϊ���ø���ϵͳ���е����������ĵ��÷���
*******************************************************/

#if 0
int CallBDFunc(int fno,TRUSERID *handle,ST_CPACK *rpack,ST_PACK *pArrays,int *iRetCode, char *szMsg)
{
	int rtn;
#ifdef _DEBUG1
	CMemoryState cm1, cm2, cm3;
#endif
	APPFUNC pFunc = g_XBDefines[fno].pFunc;

#ifdef _DEBUG1
	cm1.Checkpoint();
#endif
	rtn = (*pFunc)(handle,rpack->head.RequestType,&rpack->pack,iRetCode,szMsg);
#ifdef _DEBUG1
	cm2.Checkpoint();
	if (cm3.Difference(cm1, cm2))
	{
		BCCMsgLogOut(14444,"��ִ�й��ܺ�:%uʱ�򣬾���飬�ڴ���ִ���!",rpack->head.RequestType);
		g_LogFile.WriteLogEx(14444,"��ִ�й��ܺ�:%uʱ�򣬾���飬�ڴ���ִ���!",rpack->head.RequestType);
		cm3.DumpStatistics();
	}
#endif 

	return(rtn);
}
#endif

int CallBDFunc(int fno,TRUSERID *handle,ST_CPACK *rpack,ST_PACK *pArrays,int *iRetCode, char *szMsg)
{
	int r=0;
	int rtn=0;
	int sendtype=0;
	char param[101]="";
#ifdef _DEBUG1
	CMemoryState cm1, cm2, cm3;
#endif
	APPFUNC pFunc = g_XBDefines[fno].pFunc;

#ifdef _DEBUG1
	cm1.Checkpoint();
#endif
	*iRetCode=0;
	*szMsg=0;
	g_pArrays=pArrays;
	//�ж��Ƿ��ǽ���ʱ��,�������ȴ�����
	sendtype=rpack->head.RequestType/10000;
	switch(sendtype)
	{
	case 93:
		rtn = (*pFunc)(handle,rpack->head.RequestType,&rpack->pack,iRetCode,szMsg);

#ifdef _DEBUG1
		cm2.Checkpoint();
		if (cm3.Difference(cm1, cm2))
		{
			BCCMsgLogOut(14444,"��ִ�й��ܺ�:%uʱ�򣬾���飬�ڴ���ִ���!",rpack->head.RequestType);
			g_LogFile.WriteLogEx(14444,"��ִ�й��ܺ�:%uʱ�򣬾���飬�ڴ���ִ���!",rpack->head.RequestType);
			cm3.DumpStatistics();
		}
#endif 

		break;
	default:
		rtn = (*pFunc)(handle,rpack->head.RequestType,&rpack->pack,iRetCode,szMsg);

#ifdef _DEBUG1
		cm2.Checkpoint();
		if (cm3.Difference(cm1, cm2))
		{
			BCCMsgLogOut(14444,"��ִ�й��ܺ�:%uʱ�򣬾���飬�ڴ���ִ���!",rpack->head.RequestType);
			g_LogFile.WriteLogEx(14444,"��ִ�й��ܺ�:%uʱ�򣬾���飬�ڴ���ִ���!",rpack->head.RequestType);
			cm3.DumpStatistics();
		}
#endif 
		
		break;
	}
	return(rtn);
}

#ifdef WIN32
#include <conio.h>

void setnoblockgetch()
{
}

int mygetch()
{
	if (kbhit())
		return(getch());
	else return(0);
}
#else
#include "unistd.h"
#include <fcntl.h>
#include <errno.h>

void setnoblockgetch()
{
	int oldstatus;
	oldstatus = fcntl(0,F_GETFL);
	fcntl(0,F_SETFL,oldstatus|O_NDELAY);
}

int mygetch()
{
	int rtn;
	char kbuf[2];
	rtn = read(0,kbuf,1);
	if (rtn<=0) return(0);
	else return(kbuf[0]);
}
#endif


bool ReadIni(char *inifile)
{
	TIniFile tf;
	CSList tmpstr;

	char szBuf[256];
	g_LogFile.Open("bulog");  // �ó���Ľ��̺���Ϊ����BU��־�ļ����Ŀ¼

	memset(&g_BUnit,0,sizeof(g_BUnit));
	printf("Begin to read ini-file:%s...\n",inifile);
	if (!tf.Open(inifile))
	{
		sprintf(szBuf,"���ܴ������ļ�<%s>\n",inifile);
		DEBUG_RUNTIME_MSGOUT(szBuf);
		exit(-1000);
	}
	g_LogFile.RemoveOverdueLogFile(tf.ReadInt("COMMON","LOGOVERDUE",10));
	//g_BUnit.iBUnitGourpID = tf.ReadInt("COMMON","GID",1);
	tf.ReadString("COMMON","GID","",g_BUnit.szBUGroupID,sizeof(g_BUnit.szBUGroupID)-1);
	tf.ReadString("BCC","BCCSVR","127.0.0.1:6666",szBuf,sizeof(szBuf)-1);
	if (!tmpstr.FillStrings(szBuf,':') || tmpstr.GetCount()<2)
	{
		sprintf(szBuf,"�����ļ�<%s>��������[BCC] BCCSVR=???? ����! ��ʽΪ��BCCSVR=xxx.xxx.xxx.xxx:port\n",inifile);
		DEBUG_RUNTIME_MSGOUT(szBuf);
		exit(-1000);
	}
	strncpy(g_BUnit.szSvrIP,tmpstr.GetAt(0),sizeof(g_BUnit.szSvrIP)-1);
	g_BUnit.iSvrPort = atoi(tmpstr.GetAt(1));
	g_BUnit.iHBInterval = tf.ReadInt("BCC","HEARTBEAT",5000);
	if (g_BUnit.iHBInterval<100)
		g_BUnit.iHBInterval = 100;
	

	tf.Close();
	return(true);   
}

int main(int argc, char* argv[])
{
	::CoInitialize(NULL);				// ���SQL SERVER2000ʹ��

	int rtn;
	g_pSvrLink = BUPubInitialize(g_XBDefines,CallBDFunc,WriteAppInfo,&g_LogFile);
	SetLogShowLevel(0);
	if (argc<2)
		ReadIni("ksbu.ini");
	else
		ReadIni(argv[1]);

	ResetBPFunctions();
	if (argc>2)
	{
		ListBPFunctions(argv[2]);
	}

#ifdef _DYNAMIC_LOAD	
	// ���ضԽӵ�������̬��
	if (rtn = g_LoadDll.LoadDataInfo("jsdykt.dll"))
	{
		g_LogFile.WriteLogEx(1002, "����jsdykt.dllʧ��--������:[%d]", rtn);
		return rtn;
	}

	g_LogFile.WriteLogEx(1002, "����jsdykt.dll�ɹ�");
#endif

	// ��ʼ����BCC���ӣ�
	do 
	{
		rtn = g_pSvrLink->ToLink(&g_BUnit);
		if (rtn==1)
		{
			DEBUG_RUNTIME_MSGOUT("��ҵ���������(BCC)�����ӳɹ���\n");
			break;
		}
		else if (rtn==-100)
		{
			DEBUG_RUNTIME_MSGOUT("����ҵ���������(BCC)��δ��ʽ���������߼�������е�[SERVER]�����\n");
			mysleep(g_BUnit.iHBInterval);
		}
		else
		{
			// Ӧ�����ڹ��ϣ���Է�������BCC
			return(rtn);
		}
	} while (1);
#ifdef WIN32
	setnoblockgetch();
#endif

	while (g_pSvrLink->LinkOK())
	{
#ifdef WIN32
		switch (mygetch())
		{
		case '?':
		case 'h':
		case 'H':
			printf("\nCommand List:\n");
			printf("\t ? or h: display this Help informations!\n");
			printf("\t x: To eXit this business unit.\n");
			printf("\t d: Display functions status.\n");
			printf("\t l: List functions status into <function.lst>.\n");
			printf("Enter command to select:");
			break;
		case 'x':
		case 'X':
			g_pSvrLink->bExit = true;
			continue;
			break;
		case 'd':
		case 'D':
			ListBPFunctions(NULL);
			break;
		case 'l':
		case 'L':
			ListBPFunctions("function.lst");
			break;
		}
#endif
		g_pSvrLink->Processing(&g_BUnit);
		if (g_pSvrLink->bExit) break;
	}

	g_pSvrLink->Close();
	DEBUG_RUNTIME_MSGOUT("ҵ������ԪBUϵͳ�����˳�!\n");
	g_LogFile.Close();

#ifdef _DYNAMIC_LOAD
	g_LoadDll.UnLoadAllDll();
#endif
	
	::CoUninitialize();
	return(0);
}
