# MiStoreDemo
实验模块打包

做实验证明：
1.api依赖core模块也不能使mi的aar中包含core的代码
2.都通过aar的依赖方式，mi中的资源可以覆盖core中的同名资源
3.当mi通过libs依赖core的aar时，在mi打包aar时，会报错："Direct local .aar file dependencies are not supported when building an AAR"

做实验证明：
1.同样的名字，用mi中的selector可以正确覆盖core中的shape

做实验证明：
1.mi中的activity_core.xml可以覆盖core中的activity_core.xml

做实验证明：
1.可以在mi的AndroidManifest.xml中重新声明core的Activity

做实验证明：
1.[fat-aar](https://github.com/kezong/fat-aar-android)已经两年没有维护了，不支持Gradle 8，不推荐继续使用

做实验证明：
1.在MiStore中直接启动Core中的CoreActivity，CoreActivity同样会被mi中的activity_core.xml覆盖
2.通过mi间接启动Core的CoreActivity，CoreActivity同样会被mi中的activity_core.xml覆盖
3.在MiStore中，无论直接还是间接启动Core中的CoreActivity，Core中的btn_button.xml会被Mi中的btn_button.xml覆盖

