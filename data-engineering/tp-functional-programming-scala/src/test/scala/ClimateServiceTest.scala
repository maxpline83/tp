import com.github.polomarcus.utils.ClimateService
import com.github.polomarcus.model.CO2Record
import org.scalatest.funsuite.AnyFunSuite

//@See https://www.scalatest.org/scaladoc/3.1.2/org/scalatest/funsuite/AnyFunSuite.html
class ClimateServiceTest extends AnyFunSuite {
  test("containsWordGlobalWarming - non climate related words should return false") {
    assert( ClimateService.isClimateRelated("pizza") == false)
  }

  test("isClimateRelated - climate related words should return true") {
    assert(ClimateService.isClimateRelated("climate change") == true)
    assert(ClimateService.isClimateRelated("IPCC"))
  }

  //@TODO
  test("parseRawData") {
    // our inputs
    val firstRecord = (2003, 1, 355.2)     //help: to acces 2003 of this tuple, you can do firstRecord._1
    val secondRecord = (2004, 12, 375.2)
    val list1 = List(firstRecord, secondRecord)

    // our output of our method "parseRawData"
    val co2RecordWithType = CO2Record(firstRecord._1, firstRecord._2, firstRecord._3)
    val co2RecordWithType2 = CO2Record(secondRecord._1, secondRecord._2, secondRecord._3)
    val output = List(Some(co2RecordWithType), Some(co2RecordWithType2))

    // we call our function here to test our input and output
    assert(ClimateService.parseRawData(list1) == output)
  }

  //@TODO
  test("filterDecemberData") {
    val firstElement = CO2Record(2001, 7, 358.56)
    val secondElement = CO2Record(2002, 8, 291.23)
    val thirdElement = CO2Record(2005, 12, 456.45)

    val List1 = List(Some(firstElement), Some(secondElement), Some(thirdElement))
    val output = List(firstElement, secondElement)

    assert(ClimateService.filterDecemberData(List1) == output)
  }
}
