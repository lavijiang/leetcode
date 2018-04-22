/**
 * 从低位到高位
 * 10=1010二进制
 * @author lavi
 * @date 2018/4/22
 */
class SuperPow {
    public int superPow(int a, int[] b) {
        int len = b.length,res=1,mod=1337,tmp=a%mod,tmp8,tmp4;
        for(int i=len-1;i>=0;i--){
            for(int j=0;j<b[i];j++){
                res=res*tmp%mod;
            }
            tmp=tmp*tmp%mod;//2
            tmp4=tmp*tmp%mod;//4
            tmp8=tmp4*tmp4%mod;//8
            tmp=tmp*tmp8%mod;//10
        }
        return res;
    }
}