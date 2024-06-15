const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  outputDir: '../src/main/resources/static',
  devServer: {
    proxy: {
      '/api': {
        target: 'http://localhost:18080',
        changeOrigin: true
      }
    }
  }
})