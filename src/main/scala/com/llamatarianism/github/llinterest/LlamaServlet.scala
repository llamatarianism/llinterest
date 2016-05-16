package com.llamatarianism.github.llinterest

import org.scalatra._

class LlamaServlet extends LlinterestStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

}
