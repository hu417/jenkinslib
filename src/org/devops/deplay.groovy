package org.devops

//saltstack
def SaltDeplay(host,func){
		sh " salt \"${host}\" \"${func}\" "
}

// ansible
def Ansible(host,func){
		sh " ansible \"${host}\" \"${func}\" "
}
