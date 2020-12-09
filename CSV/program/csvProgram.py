import base64
import time,datetime
import csv
import pandas as pd
from io import StringIO
import os
import time



#Read data from an existing csv file
with open("Mycsv.csv",'r',encoding="utf-8") as f:
    reader = csv.reader(f)
    fieldnames = next(reader)
    # print(fieldnames)
    csv_reader = csv.DictReader(f,fieldnames=fieldnames)
    for row in csv_reader:
        d={}
        for k,v in row.items():
            d[k]=v
        print(d)

print(d["id"])
print(d["name"])
print(d["major"])
print(d["comment"])


print("=======================")
#Write a new csv file
headers = ['class','name','sex','height','year']

rows = [
        [1,'xiaoming','male',168,23],
        [1,'xiaohong','female',162,22],
        [2,'xiaozhang','female',163,21],
        [2,'xiaoli','male',158,21]
    ]

with open('test.csv','w')as f:
    f_csv = csv.writer(f)
    f_csv.writerow(headers)
    f_csv.writerows(rows)


print("=======================")

#Convert csv to xlsx

def csv_to_xls(csv_path, xls_path):
    with open(csv_path, 'r', encoding='gb18030', errors='ignore') as f:
        data = f.read()
    data_file = StringIO(data)
    print(data_file)
    csv_reader = csv.reader(data_file)
    list_csv = []
    for row in csv_reader:
        list_csv.append(row)
    df_csv = pd.DataFrame(list_csv).applymap(str)

    writer = pd.ExcelWriter(xls_path)
    # 写入Excel
    df_csv.to_excel(
        excel_writer=writer,
        index=False,
        header=False
    )

    writer.save()

csv_to_xls("Mycsv.csv","Myxls.xls")

