# c++常用函数

cin.getline(字符串变量，输入长度，字符串结束符)

* 字符串长度是指我们在输入字符串时所能接收的最大字符长度(包括结束符)

* 字符串结束符默认为'\n'

  ```
  char str[30];
  cin.getline(str,10,'\n');
  ```

   freopen("E:\project folds\ACM\acm\in.txt","r",stdin);