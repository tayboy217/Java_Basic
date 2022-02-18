# Java基礎知識
## 出力の命令
System.out.println() 「()の中身を出力（表示）せよ」という「命令」
## 文字列【String型】
String name = "Justin"
System.out.println(name) → Justin
## 整数・数値【int型(long,byte,short)】
int number = 217
System.out.println(number)　→ 217
## 小数【浮動小数型（double型・float型）
double number = 2.17
System.out.println(number)　→ 2.17
## 論理演算子【boolean型】
- &&	「かつ」「条件1 && 条件2」は「条件1がtrueかつ条件2もtrue」であれば結果もtrueになり、どちらか一方でもfalseであれば結果はfalseになる
- ||	「または」は||で表現し、「条件1 || 条件2」は、「条件1または条件2のどちらか一方でもtrue」であれば結果はtrue
- !	  「〜でない」を表現できる　EX）!(x >= 30)は「xが30以上でない（つまり30より小さい）」ときtrueになり、「xが30以上」のときfalseになる
# 条件分岐
## if文 （最もよく使う条件分岐はif文 「もし〜であれば」）
- else（ifとelseを組み合わせると、「もし〜なら◯◯、そうでなければ△△」という条件分岐）
- even if（ifとelse if、elseを組み合わせると、「もし〜なら◯◯、そうではなくてもし××なら△△、どちらでもない場合は□□」という条件分岐）
## switch文 (条件の値がcaseの値と一致するとき、処理が実行される)
- break（switch文ではbreakが非常に重要！　breakとはswitch文を終了する命令）
- どのcaseとも一致しなかったときに実行する処理を、defaultに指定することができる（if文のelseに似てる）
# 繰り返し処理
