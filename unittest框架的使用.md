unittest框架的使用：

一、unittest框架分为几个部分：

1. TestCase 

2. TestSuite  测试套件（可将不同的测试类和测试用例组合在一起执行，需要放在TextTestRunner对象的run()方法中执行
3. TestLoader  测试套件（可将多个py文件组合在一个执行），需要放在TextTestRunner对象的run()方法中执行
4. TextTestRunner 运行器，实例化后使用run方法运行测试套件
5. fixture （setUp，tearDown，SetUpClass，tearDownClass，setUpModule，tearDownModule）, 类级别的fixture需要加上@classmethod装饰器

二、使用

1. TestCase 

   每个测试类都需要继承unittest.TestCase类，如图：

   ![](C:\Users\GUOQIN\AppData\Roaming\Typora\typora-user-images\1591690986553.png)

2. TestSuite  

   需要先实例化这个测试类，然后再调用addTest()方法添加测试用例，最后TextTestRunner对象的run()方法运行，使用形如：

   ```python
   import unittest
   
   from scripts.test_login import TestLogin
   
   suite = unittest.TestSuite()
   suite.addTest(TestLogin("test_login"))
   
   
   runner = unittest.TextTestRunner()
   runner.run(suite)
   ```

   ![1591691226661](C:\Users\GUOQIN\AppData\Roaming\Typora\typora-user-images\1591691226661.png)

   3.TextTestRunner 

   ​	需要先实例化这个测试类，然后再调用discover()方法添加测试目录和文件，最后TextTestRunner对象的run()方法运行，使用形如：

   ```python
       import unittest
   
       from scripts.test_login import TestLogin
   
   
       loader = unittest.TestLoader().discover(start_dir="./scripts", pattern="test*.py")
   
       runner = unittest.TextTestRunner()
       runner.run(loader)
   
   ```

![1591691396234](C:\Users\GUOQIN\AppData\Roaming\Typora\typora-user-images\1591691396234.png)

​	4.TextTestRunner 

​		首先实例化TextTestRunner 类，然后调用对象的run()方法，方法中添加测试套件，使用形如：

```python
        import unittest

        from scripts.test_login import TestLogin


        loader = unittest.TestLoader().discover(start_dir="./scripts", pattern="test*.py")

        runner = unittest.TextTestRunner()
        runner.run(loader)
        
```

![1591691547167](C:\Users\GUOQIN\AppData\Roaming\Typora\typora-user-images\1591691547167.png)

 5. fixture

    将fixture方法添加到测试类中，作为用例的前置和后置处理使用，如图：

    ![1591691622609](C:\Users\GUOQIN\AppData\Roaming\Typora\typora-user-images\1591691622609.png)

    