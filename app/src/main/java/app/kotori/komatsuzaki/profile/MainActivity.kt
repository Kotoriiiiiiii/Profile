package app.kotori.komatsuzaki.profile

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import app.kotori.komatsuzaki.profile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // バインディングクラスの変数
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root)}


        // プロフィールのボタンがタップされた時に
        binding.showProfileButton.setOnClickListener {
            // 画像をImageViewに反映する
            binding.profileImage.setImageResource(R.drawable.kotori)
            // ラベルをTextViewに反映する
            binding.profileLabelText.text = "名前"
            // コメントをTextViewに反映する
            binding.profileCommentText.text = "マイクラコースのことりだよ！"

            // 押されたボタンの色を変える
            binding.showProfileButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(220, 0,100))

            // 他のボタンの色を灰色に変える
            binding.showSportButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150,150,150))
            binding.showFoodButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150,150,150))
            binding.showHobbyButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150,150,150))

        }

        //スポーツのボタンがタップされた時に
        binding.showSportButton.setOnClickListener {
            // 画像をImageViewに反映する
            binding.profileImage.setImageResource(R.drawable.volley)
            //　ラベルをTextViewに反映する
            binding.profileLabelText.text = "スポーツ"
            // コメントをTextViewに反映する
            binding.profileCommentText.text = "バレーボールが大好き！アタッカーでボールをバンバン打っていたよ！"

            // 押されたボタンの色を変える
            binding.showSportButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(0, 0,120))

            // 他のボタンの色を灰色に変える
            binding.showProfileButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150,150,150))
            binding.showFoodButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150,150,150))
            binding.showHobbyButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150,150,150))
        }

        //好物のボタンがタップされた時に
        binding.showFoodButton.setOnClickListener {
            // 画像をImageViewに反映する
            binding.profileImage.setImageResource(R.drawable.noodle)
            //　ラベルをTextViewに反映する
            binding.profileLabelText.text = "好きな食べ物"
            // コメントをTextViewに反映する
            binding.profileCommentText.text = "ラーメンが好きだよ！あっさりもコッテリも家系二郎系なんでも大好きなんだぁ！！"

            // 押されたボタンの色を変える
            binding.showFoodButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(0, 180,120))

            // 他のボタンの色を灰色に変える
            binding.showProfileButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150,150,150))
            binding.showSportButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150,150,150))
            binding.showHobbyButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150,150,150))
        }

        //趣味のボタンがタップされた時に
        binding.showHobbyButton.setOnClickListener {
            // 画像をImageViewに反映する
            binding.profileImage.setImageResource(R.drawable.book)
            //　ラベルをTextViewに反映する
            binding.profileLabelText.text = "趣味"
            // コメントをTextViewに反映する
            binding.profileCommentText.text = "読書が趣味だよ！おすすめの本があったら小鳥に教えてね〜〜！"

            // 押されたボタンの色を変える
            binding.showHobbyButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(220, 100,0))

            // 他のボタンの色を灰色に変える
            binding.showProfileButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150,150,150))
            binding.showSportButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150,150,150))
            binding.showFoodButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150,150,150))
        }

    }
}