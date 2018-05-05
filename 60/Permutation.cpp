/*
*数学递归
*/
class Solution {
public:
	string getPermutation(int n, int k) {
		string s(n, '0');
		bool use[10];//是否已使用该数字
		for (int i = 0; i < 10; i++)
			use[i] = false;
		int jie[10];//阶乘
		jie[0] = 1;
		for (int i = 1; i <= n; i++)
			jie[i] = jie[i - 1] * i;
		for (int i = 0; i<n; i++){
			int tmp = 0;
			while (k>jie[n - 1 - i]){
				tmp++;
				k -= jie[n - 1 - i];
			}
			int is = 0;
			for (int j = 1; j <= n; j++){
				if (use[j])
					continue;
				if (is >= tmp){
					use[j] = true;
					s[i] = j + '0';
					break;
				}
				if (!use[j])
					is++;
			}

		}
		return s;
	}
};