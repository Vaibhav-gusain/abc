// Online C++ compiler to run C++ program online
#include <iostream>
#include<bits/stdc++.h>
using namespace std;
vector<int> computerLPS(vector<int>&lps,string s)
{
    int n=s.size();
    lps[0]=0;
    
    int i=1;
    int j=0;
    
    while(i<n)
    {
        if(s[i]==s[j])
        {
            j++;
            lps[i]=j;
            i++;
        }
        else
        {
            if(j>0)
            {
                j=lps[j-1];
            }
            else
            {
                lps[i]=0;
                i++;
            }
        }
        return lps;
    }
}
int main() {
    string s="abcababcab";
    int n=s.size();
    vector<int>lps;
    computerLPS(lps,s);
    
    vector<int> result;
    
    for(int i=n-1;i>=0;i--)
    {
        if(i<=0)
        {
            return result;
        }
        result.push_back(lps[i]);
        i=lps[i-1];
    }
    
    for(int j=0;j<result.size();j++)
    {
        cout<<result[j];
    }
    return 0;
}