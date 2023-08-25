// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
  ssr: false,
  devtools: { enabled: true },
  runtimeConfig: {
    public: {
      baseURL: process.env.BASE_URL || 'http://localhost:8080/'
    },
  },
  modules: [
    '@nuxtjs/tailwindcss',
    '@pinia/nuxt'
  ]
});
