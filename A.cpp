#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int t;
    cin >> t;

    while (t--){
        int n;
        cin>>n;

        string str;
        cin >> str;

        int count_1 = 0;
        int ans = 0;
        int temp = 0;
        int idx = 0;
        while (idx < n && str[idx] == '1'){
            idx++;
            count_1++;
        }

        for (int i = idx; i < n; i++){
            if (str[i] == '1')
                temp++;
            else{
                ans = max(ans, temp);
                temp = 0;
            }
        }

        ans = count_1 + max(ans, temp);
        cout << ans << endl;
    }
    return 0;
}
