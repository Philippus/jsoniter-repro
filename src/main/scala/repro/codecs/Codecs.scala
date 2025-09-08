package repro.codecs

import com.github.plokhotnyuk.jsoniter_scala.core.JsonValueCodec
import com.github.plokhotnyuk.jsoniter_scala.macros.JsonCodecMaker
import repro.model.Abc

trait Codecs {
  implicit val abcCodec: JsonValueCodec[Abc]           = JsonCodecMaker.make
}
