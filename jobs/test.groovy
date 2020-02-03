project_name = "jenkins-pipeline-python-2"
repo = "git@github.com:alejovaz/test-jenkins-1.git"
repo_name = "repo"


pipelineJob(project_name) {
    definition {
       triggers{
          scm('* * * * *')
       }

        cpsScm{
            scm {
                git {
                    remote {
                    name(repo_name)
                    url(repo)
                    }
                }
                scriptPath("Jenkinsfile")

            }
        }
    }
}

