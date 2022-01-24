package jp.techacademy.toshio.mori.kotlinlog
/*
import android.util.Log

class BigDog: Dog {

    // supperで親クラスのコンストラクタを呼ぶ
    constructor(name: String, age: Int) : super(name, age) {
    }

    override fun say() {
        super.say()
        Log.d("kotlintest", "大きな犬です。")

    }
*/

import android.util.Log

class BigDog: Dog {

    // superで親クラスのコンストラクタを呼ぶ
    constructor(name: String, age: Int): super(name, age) {
    }

    override fun say() {
        super.say()
        Log.d("kotlintest", "大きな犬です。")
    }


}