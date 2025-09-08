package repro

import com.github.plokhotnyuk.jsoniter_scala.core.readFromString
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import repro.codecs.Codecs

class AbcMarshallingSpec extends AnyFlatSpec with Matchers with Codecs {
  "AbcMarshallingSpec" should "correctly marshall an abc" in {
    (readFromString("""{"ABC": "d"}""")(abcCodec)).value  shouldBe "d"
  }
}
