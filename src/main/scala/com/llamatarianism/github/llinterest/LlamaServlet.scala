package com.llamatarianism.github.llinterest

import org.scalatra._

class LlamaServlet extends LlinterestStack with ScalateSupport {

  before() {
    contentType = "text/html"
  }

  get("/") {
    ssp("/index")
  }

}
