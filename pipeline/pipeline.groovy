pipeline {
    agent any
    parameters {
        gitParameter branchFilter: 'origin/(.*)', defaultValue: 'master', name: 'BRANCH', type: 'PT_BRANCH'
    }
    stages {
        stage('Example') {
            steps {
                git branch: "${params.branch}", url: 'https://github.com/jenkinsci/git-parameter-plugin.git'
            }
        }
    }
}