## 笔记
### -----------------------------------
### 一、git的使用
### 1.git基础配置
######  1）配置用户名（提交时会引用）
######     git config --global username "你的用户名"
#### 2）配置邮箱
######      git config --global user.email "你的邮箱"
#### 3）编码配置 
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
######   11）git push -u origin master 提交
######   12)分支合并 git merge branchname
#### git提交到远程仓库
##### 关联：git remote add origin "远程仓库地址"
##### 第一次想远程仓库推送：git push -u -f origin master
##### 以后提交到远程：git push origin master
#### 项目提交到github
##### git add .:提交所有 
##### git commit -m "描述"：提交到本地仓库
##### 然后 git push 提交
### 删除远程仓库的文件
##### 1.git pull origin master
##### 2.git rm -f --cached "文件名"
##### 3.git commit -m "描述"
##### 4.git push -u origin master

## -------------------------------------------------------
# 电商项目-需求分析

### 核心-购买
#### 一、用户模块
##### 登录
##### 注册
##### 忘记密码
##### 获取用户信息
##### 修改密码
##### 登出
### 二、商品模块
##### 后台
##### 添加商品
##### 修改商品
##### 删除商品
##### 商品上下架
##### 查看商品
##### 前台（门户）
##### 搜索商品
##### 查看商品详情
### 三、类别模块
##### 添加类别
##### 修改类别
##### 删除类别
##### 查看类别
##### 查看子类
##### 查看后代类别
### 四、购物车模块
##### 添加到购物车
##### 改购物车中某个商品的数量
##### 删除购物车商品
##### 全选/取消全选 
##### 单选/取消单选 
##### 看购物车中商品数量
### 五、地址模块
##### 添加地址
##### 修改地址
##### 删除地址
##### 查看地址
### 六、订单模块
##### 前台
##### 下订单
##### 订单列表
##### 取消订单
##### 订单详情
##### 后台
##### 订单列表
##### 订单详情
##### 发货
### 七、支付模块
##### 支付宝支付
##### 支付
##### 支付回调
##### 查看支付状态
### 八、线上部署
##### 阿里云部署
