job('First-DSL-JOB') 
{
     
     description("First Job")
    scm 
    {
        github('https://github.com/binaryvikash/MavenProject_DSL.git', 'main')
    }
    triggers 
    {
        scm('* * * * *')
    }
    steps 
    {
        maven('clean package', 'SamplePOM/pom.xml')
    }
    publishers 
    {
        archiveArtifacts('**/*.jar')
    }

}
