package jp.techacademy.toshio.mori.kotlinlog
import android.util.Log

open class Human: Animal, Thinkable {
    var hobby: String

    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String): super(name, age) {

        this.hobby = hobby
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
     //   Log.d("kotlintest", this.name + "(" + this.age + "歳)")
        Log.d("kotlintest","私の名前は" + this.name + "です。年齢は" + this.age + "です。")
    }

    // Thinkalbeインターフェイスのメソッドをオーバーライド
    override fun think() {

        Log.d("kotlintest", "私は" + this.hobby + "について考える。")
    }


}