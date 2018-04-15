# /src/org/pipeline/stdPipeline.groovy
#!/bin/groovy
package org.pipeline;

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
