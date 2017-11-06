## maven多模块项目搭建

__框架/工具__
> Maven SpringBoot Myatis MySQL Tomcat

### 记录：
1. maven统一打包命令(跳过测试)
    ```
    mvn package —Dmaven.test.skip=true
    ```

2. 编译/打包报错程序包xxx.xxx.xxx不存在，尝试
    ```
    mvn clean
    ```

3. 子模块间的引用要写在各自的pom文件里的 `<dependencies>`中，父模块配置`<modules>`即可
