Pytest框架的使用

1. 在项目的根目录创建一个pytest.ini的文件

2. 在pytest.ini文件中添加如下配置信息

   ```ini
   [pytest]  # 这是
   addopts = -s --alluredir=./report --html=./report/report.html   
   testpaths = ./scripts
   python_files = test_contact.py
   python_classes = Test*
   python_function = test*
   ```

   3.在Terminal中使用pytest命令运行测试用例

pytest官方使用文档：<https://docs.pytest.org/en/latest/usage.html>