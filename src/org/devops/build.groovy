package org.devops

//构建类型
def Build(buildType,buildShell){
		def buildTools = ["maven":"maven","ant":"ant","gradle":"gradle","npm":"npm"]
    println("当前选择的构建类型是：${buildType}")
    buildHome = tool buildTools[buildType]
    
    sh "${buildHome}/bin/${buildType} ${buildShell}"
}
