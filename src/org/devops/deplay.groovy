package org.devops

//saltstack

def SaltDeplay(host,func){
		sh " salt \"${host}\" \"${func}\" "
}
