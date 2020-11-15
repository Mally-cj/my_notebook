```python
#!/usr/bin/env python
# -*- coding: utf-8 -*-
# 读取excel数据
# 小罗的需求，取第二行以下的数据，然后取每行前13列的数据
import xlrd
data = xlrd.open_workbook('1111.xlsx') # 打开xls文件
sheet=data.sheet_by_name("工作表1")
nrows=sheet.nrows
i=4
for i in range(nrows): 	 # 循环逐行打印
	# if i == 0:continue
    print( sheet.row_values(i)[:13])

```

