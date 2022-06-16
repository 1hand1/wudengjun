public void getStaticFilePathOperationVulnerability2() throws Exception {
        }
    }
    @Test
    public void getStaticFilePathOperationVulnerability3() throws Exception {
        HttpGet request = new HttpGet(httpsAdminServerUrl.replace("admin", "static//...//...//...//...//...//...//...//...//.../etc/passwd"));

        try (CloseableHttpResponse response = httpclient.execute(request)) {
            assertEquals(404, response.getStatusLine().getStatusCode());
        }
    }

     @Test
     public void testGetFavIconHttp() throws Exception {
         HttpGet request = new HttpGet(httpServerUrl + "favicon.ico");
