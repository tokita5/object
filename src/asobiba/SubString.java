package asobiba;

class SubString {
    public static void main(String[] args) {
        String hiragana = "あいうえお";

        //指定の位置から一文字取得
        System.out.println(hiragana.substring(0, 1));//あ
        System.out.println(hiragana.substring(1, 2));//い
        System.out.println(hiragana.substring(2, 3));//う

        //指定の位置から3文字取得
        System.out.println(hiragana.substring(0,3));//あいう

        //指定の位置から２文字取得
        System.out.println(hiragana.substring(2,4));//えお

        //半角文字の時
        String alphabet = "abcde";
        System.out.println(alphabet.substring(0, 1));//a
        System.out.println(alphabet.substring(1, 3));//b

        //一つ目の引数の開始位置から最後までの文字を返す
        String katakana = "アイウエオ";
        System.out.println(katakana.substring(1));//いうえお
        System.out.println(katakana.substring(2));//うえお
        System.out.println(katakana.substring(3));//えお
        System.out.println(katakana.substring(4));//お

        //文字列の後ろから切り出す
        String kanji = "亜意宇絵尾";
        System.out.println(kanji.substring(kanji.length()-1));//尾
        System.out.println(kanji.substring(kanji.length()-2));//絵尾
        System.out.println(kanji.substring(kanji.length()-3));//宇絵尾
    }
}
