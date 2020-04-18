deviceTypesCommon = require '@resin.io/device-types/common'
{ networkOptions, commonImg, instructions } = deviceTypesCommon

module.exports =
	version: 1
	slug: 'firefly-rk3288'
	aliases: [ 'firefly-rk3288' ]
	name: 'FireFly rk3288'
	arch: 'armv7hf'
	state: 'released'

	instructions: commonImg.instructions

	gettingStartedLink:
		windows: 'https://www.balena.io/'
		osx: 'https://www.balena.io/'
		linux: 'https://www.balena.io/'

	supportsBlink: true

	yocto:
		machine: 'firefly-rk3288'
		image: 'resin-image'
		fstype: 'resinos-img'
		version: 'yocto-sumo'
		deployArtifact: 'resin-image-firefly-rk3288.resinos-img'
		compressed: true

	options: [ networkOptions.group ]

	configuration:
		config:
			partition:
				primary: 1
			path: '/config.json'

	initialization: commonImg.initialization
