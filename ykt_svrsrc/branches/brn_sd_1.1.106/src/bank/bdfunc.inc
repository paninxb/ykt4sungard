#ifndef BDFUNC_INC
#define BDFUNC_INC
/*  ��ÿ��ҵ���������б�������������һ�У���ϸ�����ʾ�ĺ��壬��BDefine.h�е�������
   {���ܺ�   ,���̺���>    ,"��������"                                     ,"�����Ա����"       ,���ȼ�,false,0,0,0,0,0},
*/
// �����г����кϷ���ҵ�������̺����б���
int F900077(TRUSERID *handle,int iRequest,ST_PACK *in_pack,int *pRetCode,char *szMsg);
#ifdef __cplusplus
extern "C" {
#endif
// �ս���̣��ṩ��ǰ̨һ��button��
#ifdef __cplusplus
}
#endif

// �������ݱ�Ϊ��ҵ������Ԫ�ܴ��������кϷ�ҵ�������̼�����ز���
TBDefine g_BDefines[]=
{
// {���ܺ�,���̺���   ,"��������"                                     ,"�����Ա����"    ,���ȼ�,false,0,0,0,0,0},
   
   {900077,F900077,"ת�ʷ������" ,"hhd",1,false,0,0,0,0,0},
   {0,NULL,"END BPFunctions List","CYH Marked",0,false,0,0,0,0,0},  // the last mark line��Don't remove this line
};
#endif