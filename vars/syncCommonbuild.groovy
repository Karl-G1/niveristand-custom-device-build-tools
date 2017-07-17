def call(){
  echo 'Cloning commonbuild steps to workspace.'
  def branch = env.library.nivscommonbuild.version  
  if(!branch) {
    branch = 'master'
  }
  
  commonbuildDir = syncRepo('https://github.com/buckd/commonbuild', branch)
  return commonbuildDir
}
