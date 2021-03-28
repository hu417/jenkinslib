#!groovy
@Library('jenkinslib') _     
def tools = new org.devops.tools()
String workspace = "/opt/jenkins/workspace"
pipeline {
    agent { node {  label "master" }}
    stages {
        //下载代码
        stage("GetCode"){ 
            steps{  
                timeout(time:5, unit:"MINUTES"){   
                    script{ 
                        tools.PrintMes("获取代码",'green')
                    }
                }
            }
        }
    }
}
