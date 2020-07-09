# linux安装软件：

1.编译安装：

执行./configure文件生成依赖关系。

make 编译

make install 安装文件（新建文件夹、新建文件、拷贝文件）

2.rpm安装

rpm -ivh rpm安装包

![1593855052741](C:\Users\GUOQIN\AppData\Roaming\Typora\typora-user-images\1593855052741.png)



其它命令：

tty 查看当前终端

查看主机名：hostname

查看当前cpu信息：lscpu

查看当前内存信息：free -h

查看硬盘信息：lsblk

查看网卡信息：ip a

查看系统版本：cat /etc/os-release

查看系统内核版本：uname -r

临时关闭图形界面：init 3

重启：init 6   reboot

关机：poweroff

修改提示符格式：

示例：临时修改  PS1="\[\e[1;;42;33m\][\u@\h \W]\ \H \t \$\[\e[0m\]"

​	永久修改 echo 'PS1="\[\e[1;32m\][\[\e[0m\]\t \[\e[1;33m\]\u\[\e[36m\]@\h\[\e[1;31m\] \W\[\e[1;32m\]]\[\e[0m\]\\$"' > /etc/profile.d/env.sh

![1594272753999](C:\Users\GUOQIN\AppData\Roaming\Typora\typora-user-images\1594272753999.png)

给命令起别名：

​	alias 别名='命令'

​	持久化存储别名：echo "alias 别名='命令' " >> .bashrc

​	删除别名：unalias 别名

​	临时使用别名的原始命令：\别名 或  '别名'

查看用户的id（linux中，用户id才是代表权限大小）：id -u 用户名，root账户的id为0

多个命令放在一行执行需要加分号"；"隔开；

以条命令放在多行执行需要加斜杠 \ 分割

查看硬件时间：clock

查看操作系统时间：data

![1594297934709](C:\Users\GUOQIN\AppData\Roaming\Typora\typora-user-images\1594297934709.png)

查看系统开机时间：uptime

![1594298351622](C:\Users\GUOQIN\AppData\Roaming\Typora\typora-user-images\1594298351622.png)