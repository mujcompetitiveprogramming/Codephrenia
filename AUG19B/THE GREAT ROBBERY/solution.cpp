#include<bits/stdc++.h>
using namespace std;
int inf=1e8;
vector<vector<int>>dp,vis;
 
int fun(int x,int y,vector<vector<int>>&A){
  if(x==A.size())
      return 0;
  if(y==A[0].size()|| y==-1)
      return -inf;
  int &ans=dp[x][y];
  if(vis[x][y])
        return ans;
  ans=max(ans,A[x][y]+fun(x+1,y,A));
  ans=max(ans,A[x][y]+fun(x+1,y-1,A));
  ans=max(ans,A[x][y]+fun(x+1,y+1,A));
  vis[x][y]=1;
  return ans;
}
 
int solve(vector<vector<int>>&A){
      if(A.empty())
          return 0;
      int cols=A[0].size();
      int rows=A.size();
      dp.resize(rows,vector<int>(cols,INT_MIN));
      vis.resize(rows,vector<int>(cols,0));
      int ans=INT_MIN;
      for(int i=0;i<cols;i++){
          ans=max(ans,fun(0,i,A));
      }
      return ans;
}
 
int main(){
  int n,m;
  cin>>n>>m;
  vector<vector<int>>matrix;
  matrix.resize(n,vector<int>(m,0));
  for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
      cin>>matrix[i][j];
    }
  }
  cout<<solve(matrix)<<endl;
  return 0;
}