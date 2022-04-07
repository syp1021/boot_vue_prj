const { defineConfig } = require('@vue/cli-service')
const path = require('path')

// module.exports = defineConfig({
//   transpileDependencies: true
// })

module.exports = {
  outputDir: "../src/main/resources/static/dist",
    devServer: {
    port: 8081,
    proxy: 'http://localhost:8080',
  },
  chainWebpack : config => {
    const svgRule = config.module.rule("svg");
    svgRule.uses.clear();
    svgRule.use("vue-svg-loader").loader("vue-svg-loader");
  }
}