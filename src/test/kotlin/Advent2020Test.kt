import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class Advent2020Test : DescribeSpec({
    describe("helloWorld") {
        it("should return the hellow world string") {
            Advent2020()
                .helloWorld
                .shouldBe("Hello Advent of Code 2020!")
        }
    }
})