# AWT-Scroll-Label
Awt Scroll label

AWTを使用したスクロールするラベルです

実装目標は下記の通りです
* ・ラベルの背景を透過すること
* ・スクロール時にちらつかないこと


ポイントは下記の通りです
* ・ラベルと背景を描画するコンポーネントを軽量コンポーネントとする→透過可能となる
* ・軽量コンポーネントを扱うコンテナでダブルバッファリングを行う→ちらつき軽減
