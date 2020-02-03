multibranchPipelineJob('python-deploy') {
	triggers {
		cron('')
	}
	branchSources {
		git {
			id('repo')
			remote('git@github.com:alejovaz/test-jenkins-1.git')
		}
	}
	orphanedItemStrategy {
		discardOldItems {
			numToKeep(20)
		}
	}
}
