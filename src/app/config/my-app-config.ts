export default {
  auth: {
    domain: "dev-me1uh7d370lkjh4t.us.auth0.com",
    clientId: "ZxZpzQY5MwcoS8tN250QgMdIpx8katOB",
    authorizationParams: {
      redirect_uri: "https://localhost:4200",
      audience: "http://localhost:8080",
    },
  },
  httpInterceptor: {
    allowedList: [
      'http://localhost:8080/api/orders/**',
      'http://localhost:8080/api/checkout/purchase'
    ],
  },
}