# Ruler
a  RulerView for android

#Preview
##Demo
You can click here to [download apk .](https://github.com/panjichang//blob/master/app/app-release-v4.4.6-c446.apk?raw=true)

##Screenshots
![Image](https://github.com/pruas/Ruler/raw/master/test.gif)


#How to use
created by XML like this:
```JAVA
<com.pan.ruler.RulerView
        ruler:minValue ="0"     //最小值
        android:id="@+id/simple_ruler"
        android:paddingBottom="16dp"
        android:background="#11000000"
        ruler:maxValue ="100"   //最大值
        ruler:textSize="18sp"   //文字大小
        ruler:textColor="@android:color/darker_gray"
        ruler:highlightColor="@color/green"            //选中颜色
        ruler:rulerColor="#b3b3b3"                     //没选中颜色
        android:layout_marginTop="30dp"
        ruler:intervalValue="1"
        ruler:selectWidth="3dp"
        ruler:highWidth="2dp"
        ruler:rulerLineWidth="1dp"
        ruler:intervalDistance="10dp"
        android:layout_width="wrap_content"
        android:layout_height="60dp"
        />
```
 or created by code like this :
 ```JAVA
 RulerView s = new RulerView(this);
		s.setMaxValue(2.00f);
		s.setMinValue(1.00f);
		s.setIntervalValue(0.01F);
		s.setRetainLength(2);
		s.setSelectedValue(1.7f);
		s.setOnChangeListener(this);
		...
```		




