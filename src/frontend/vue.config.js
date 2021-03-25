// vue.config.js
module.exports = {
    // https://cli.vuejs.org/config/#devserver-proxy
    // Prevents clashes with spring boot - port 8080 and directs /api to localhost:8080 : Spring Boot
    devServer: {
        port: 3000,
        proxy: {
            '/api': {
                target: 'http://localhost:8080',
                ws: true,
                changeOrigin: true
            }
        }
    }
}