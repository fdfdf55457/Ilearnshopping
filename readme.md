## 作业
### -----------------------------------
### 一、git的使用
### 1.git基础配置
######  1）配置用户名（提交时会引用）
######     git config --global username "你的用户名"
#### 2）配置邮箱
######      git config --global user.email "你的邮箱"
####3）编码配置 
######   避免git gui中的中文乱码
######     git config --global gui.encoding utf-8
######   避免 git status 显示的中文文件名乱码
######     git config --global core.quotepath off
#### 4）其它
######   git config --global core.ignorecase false
###  2.git ssh key pair配置
#####  1）在git bash命令行窗口中输入：ssh-keyfen -t rsa -C "你的邮箱"
#####   2）然后一路回车，不要输入任何密码之类，生成ssh key pair
#####   3) 在用户目录下生成ssh文件夹，找到公钥和私钥
######       id_rsa id_rsa.pub
#####   4) 将公钥的内容复制
#####   5） 进入GitHub网站，将公钥添加进去
### 3.其他命令
#####   1）将工作区提交到暂存区
######     git add
#####   2）提交到本地仓库
######     git commit -m "描述"
#####   3）创建本地仓库
######     git init
#####   4) 检查工作区文件状态
######   git status
#####   5）查看提交committied
######      git log
######   6)hard committid 版本回退
######   7） git branch 查看分支

###### 8）git checkout -b dev 创建分支并切换到dev分支
###### 9）git checkout 分支名
######  10）git pull 拉取
######   11）git push -u origin master
######   12)分支合并 git merge branchname
#### git提交到远程仓库
##### 关联：git remote add origin "远程仓库地址"
##### 第一次想远程仓库推送：git push -u -f origin master
##### 以后提交到远程：git push origin master
#### 项目提交到github
##### git add .:提交所有
