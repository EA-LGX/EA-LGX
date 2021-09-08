#include<iostream> 
using namespace std;

const int MAX=130;	//需设置为大于5+4*30的数
bool map[MAX][MAX]; 

void print(int n)
{
	//通过n计算出打印十字图的规格（N*N）
	int N=5+4*n; 
	//首先标记最内层的十字架
	for(int i=N/2-1;i<=N/2+3;i++)
		map[N/2+1][i]=map[i][N/2+1]=true;	//一横一竖
	//然后从最外层到里层逐个标记十字架
	for(int i=1;i<=n;i++)
	{
		//接下来标记四个边角部分
		int x=2*i+1,y=2*i+1;
		//左上边角
		map[x][y]=map[x][y-1]=map[x-1][y]=true; 
		//右上边角
		y=N-2*i;
		map[x][y]=map[x][y+1]=map[x-1][y]=true;
		//右下边角
		x=N-2*i;
		map[x][y]=map[x][y+1]=map[x+1][y]=true;
		//左下边角
		y=2*i+1;
		map[x][y]=map[x][y-1]=map[x+1][y]=true;
		
		//接下来标记十字架的非边角部位（即“四个墙壁”）
		for(int j=2*i+1;j<=N-2*i;j++)
			map[2*i-1][j]=map[j][N-2*(i-1)]=map[N-2*(i-1)][j]=map[j][2*i-1]=true; 
	} 
	
	//打印
	for(int i=1;i<=N;i++){
		for(int j=1;j<=N;j++)
			if(map[i][j]) cout<<"$";
			else cout<<".";
		cout<<endl;
	} 
}

int main()
{
	int n;
	cin>>n;
	print(n);
	return 0;
}