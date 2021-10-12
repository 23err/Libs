package vboyko.gb.libs.lesson1

class MainPresenter(private val view: MainView) {

    private val model = CountersModel()

    fun counterFirstClick() {
        val nextValue = model.next(0)
        view.setButtonFirstText(nextValue.toString())
    }

    fun counterSecondClick() {
        val nextValue = model.next(1)
        view.setButtonSecondText(nextValue.toString())
    }

    fun counterThirdClick() {
        val nextValue = model.next(2)
        view.setButtonThirdText(nextValue.toString())
    }
}