deviceTypesCommon = require '@resin.io/device-types/common'
{ networkOptions, commonImg, instructions } = deviceTypesCommon

module.exports =
	version: 1
	slug: 'aio-3288c'
	aliases: [ 'aio-3288c' ]
	name: 'AIO 3288C'
	arch: 'armv7hf'
	state: 'released'

	instructions: commonImg.instructions

	gettingStartedLink:
		windows: 'https://www.balena.io/docs/learn/getting-started/asus-tinker-board/nodejs/'
		osx: 'https://www.balena.io/docs/learn/getting-started/asus-tinker-board/nodejs/'
		linux: 'https://www.balena.io/docs/learn/getting-started/asus-tinker-board/nodejs/'

	supportsBlink: true

	yocto:
		machine: 'aio-3288c'
		image: 'resin-image'
		fstype: 'resinos-img'
		version: 'yocto-sumo'
		deployArtifact: 'resin-image-aio-3288c.resinos-img'
		compressed: true

	options: [ networkOptions.group ]

	configuration:
		config:
			partition:
				primary: 1
			path: '/config.json'

	initialization: commonImg.initialization
