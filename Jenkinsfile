#!groovy
@Library('jenkinslib') _     
def tools = new org.devops.tools()
pipeline {
    agent { node { label "master" }}
    stages {
        //下载代码
        stage("GetCode"){ 
            steps{  
                timeout(time:1, unit:"MINUTES"){   
                    script{ 
                        tools.PrintMes("hello world!")
                    }
                }
            }
        }
    }
}
