
import time,datetime
import time


timenow = time.time()


tss1 = '2020-10-10 23:40:00'

# Convert to time array
timeArray = time.strptime(tss1, "%Y-%m-%d %H:%M:%S")
print (timeArray)

# Print year and hour
print ( timeArray.tm_year)   # 2020
print(timeArray.tm_hour)  #23

#  Convert to timestamp
timeStamp = int(time.mktime(timeArray))
print (timeStamp)  # 1381419600

print("=====================")
timeStamp = 1381419600
timeArray = time.localtime(timeStamp)
otherStyleTime = time.strftime("%Y--%m--%d %H:%M:%S", timeArray)
print(otherStyleTime)   # 2013--10--10 23:40:00

# use datetime

dateArray = datetime.datetime.fromtimestamp(timeStamp)
otherStyleTime = dateArray.strftime("%Y--%m--%d %H:%M:%S")
print(otherStyleTime)   # 2013--10--10 23:40:00

# Use datetime, specify utc time

dateArray = datetime.datetime.utcfromtimestamp(timeStamp)
otherStyleTime = dateArray.strftime("%Y--%m--%d %H:%M:%S")
print(otherStyleTime)   # 2013--10--10 15:40:00

