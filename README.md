#### 1、变量的使用：


```
// 通过$符号引入变量
<h2>$name</h2>
```
#### 2、设置变量的值：

```
<h2>$name</h2>

<!--通过#set去设置变量的值-->
#set($name="test")

<h3>$name</h3>
```
> 如果引入的变量不存在，页面中会打印表达式，为了避免这个问题，可以使用下面的表达方法：

```
在$和变量之间加入！符号，当nam变量不存在时候显示空白
<h2>$!nam</h2>
<h2>$name</h2>
```
#### 3、循环语法：

```
#foreach($item in $list)

 $item
 // 计数索引，从1开始
 $velocityCount 
 
#end
```
#### 4、条件语句：

```

#if($name!="test")
<h2>!test</h2>

<!--elseif是连起来的-->
#elseif($name=="test")

<h3>test</h3>
#else
<h2>null</h2>
#end
```
#### 5、在Velocity中也有宏的概念，可以将其作为函数来理解，使用#macro声明宏：

```
<!--定义宏-->
#macro(sayHello $word $test)
    say${word}$test
#end

<!--调用宏-->
#sayHello("lizhenghua","test")
```
#### 6、导入外部文件：
> include指令会将外部文件原样输出

```
#include("footer.vm")
```
> parse指令会先对其进行解析再输出(即对外部文件中的vm语法解析)

```
#parse("header.vm")
```