
listView('python') {
	description('Python Pipelines')
	jobs {
		regex(/.*python.*/)
	}

	columns {
        	status()
        	weather()
        	name()
        	lastSuccess()
        	lastFailure()
        	lastDuration()
        	buildButton()
	}

}
