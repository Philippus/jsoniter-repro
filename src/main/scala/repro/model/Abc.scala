package repro.model

import com.github.plokhotnyuk.jsoniter_scala.macros.named

case class Abc(@named("ABC") value: String)
