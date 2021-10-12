package vboyko.gb.libs.lesson1

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import vboyko.gb.libs.lesson1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var mainBinding: ActivityMainBinding

    private val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainBinding.btnCounter1.setOnClickListener { presenter.counterFirstClick() }
        mainBinding.btnCounter2.setOnClickListener { presenter.counterSecondClick() }
        mainBinding.btnCounter3.setOnClickListener { presenter.counterThirdClick() }
    }

    override fun setButtonFirstText(text: String) = with(mainBinding) {
        btnCounter1.text = text
    }

    override fun setButtonSecondText(text: String) = with(mainBinding) {
        btnCounter2.text = text
    }

    override fun setButtonThirdText(text: String) = with(mainBinding) {
        btnCounter3.text = text
    }
}