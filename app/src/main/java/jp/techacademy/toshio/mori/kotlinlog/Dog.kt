package jp.techacademy.toshio.mori.kotlinlog
import android.util.Log

open class Dog: Animal, Thinkable {
    // 引数付きコンストラクタ
    constructor(name: String, age: Int): super(name, age) {

    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    // Movableインターフェイスのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }
}