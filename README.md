# MiStoreDemo
## 调研分包&编译  
通过做实验证明得到下面这些结论。  

### 无法通过依赖关系，使mi编译成的aar包含core的代码  

1.当mi通过api依赖core模块时，也不能使mi的编译成的aar中包含core的代码  
2.当mi通过libs依赖core的aar时，在mi打包aar时，会报错："Direct local .aar file dependencies are not supported when building an AAR"  

### 不推荐继续使用fat-aar  

1.[fat-aar](https://github.com/kezong/fat-aar-android)已经两年没有维护了，不支持Gradle 8，不推荐继续使用

### 把core和mi分别编译成aar，可以达到同样的效果  

MiStore通过libs依赖core和mi的aar时：  
1.mi中的资源可以覆盖core中的同名资源  
2.同样的名字，mi中的selector可以正确覆盖core中的shape  
3.mi中的activity_core.xml可以覆盖core中的activity_core.xml  
4.可以在mi的AndroidManifest.xml中重新声明core的Activity  
5.在MiStore中直接启动Core中的CoreActivity，CoreActivity同样会被mi中的activity_core.xml覆盖  
6.通过mi间接启动Core的CoreActivity，CoreActivity同样会被mi中的activity_core.xml覆盖  
7.在MiStore中，无论直接还是间接启动Core中的CoreActivity，Core中的btn_button.xml会被Mi中的btn_button.xml覆盖  
8.mi编译成mi-debug.aar，core编译成core-debug.aar之后，mi-debug.aar和core-debug.aar之间并没有依赖关系，所以它们之间的同名资源覆盖关系取决于两个aar文件在app工程中的编译顺序。如果是mi-debug.aar先编译，core-debug.aar后编译，那么core-debug.aar中的同名资源会覆盖mi-debug.aar中的资源，这是不符合我们预期的。而aar文件的名字决定它们的编译顺序。但具体的决定关系我并不清楚，总之大体跟文件名的字母排序有关。
