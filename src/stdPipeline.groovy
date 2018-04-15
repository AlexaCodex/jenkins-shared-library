# /src/org/jpipeline/stdPipeline.groovy
#!/bin/groovy
package org.jpipeline;

def execute(Map pipelineParams) {

  node {
		stage('Restore Package(s)...') {
            steps {
                echo 'Restore Package(s)'
				"${env.BUILD_URL}"
				echo 'Testing..' pipelineParams.scmUrl
            }
        }
  }

}
