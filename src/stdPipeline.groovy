# /src/org/jpipeline/stdPipeline.groovy
#!/bin/groovy
package org.jpipeline;

def execute() {

  node {
		stage('Restore Package(s)...') {
            steps {
                echo 'Restore Package(s)'
				"${env.BUILD_URL}"
		    echo 'Testing..'
            }
        }
  }

}
