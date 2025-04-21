# Spring Boot Todo アプリケーション

Spring Bootを使用したシンプルなTodo REST APIアプリケーションです。

## 機能

- Todoの作成
- Todoの一覧表示
- Todoの詳細表示
- Todoの更新
- Todoの削除
- 完了状態によるフィルタリング
- タイトルによる検索

## 技術スタック

- Java 17
- Spring Boot 2.7.1
- Spring Data JPA
- H2 Database (インメモリ)
- Maven

## 開始方法

### 前提条件

- Java 17
- Maven

### ビルドと実行

```bash
# プロジェクトのクローン
git clone https://github.com/yourusername/todo-spring.git
cd todo-spring

# ビルド
mvn clean package

# 実行
java -jar target/todo-0.0.1-SNAPSHOT.jar
```

アプリケーションは http://localhost:8080 で実行されます。

## API エンドポイント

| HTTPメソッド | エンドポイント | 説明 |
|------------|--------------|------|
| GET | /api/todos | すべてのTodoを取得 |
| GET | /api/todos/{id} | 指定したIDのTodoを取得 |
| POST | /api/todos | 新しいTodoを作成 |
| PUT | /api/todos/{id} | 指定したIDのTodoを更新 |
| DELETE | /api/todos/{id} | 指定したIDのTodoを削除 |
| GET | /api/todos/status?completed={true/false} | 完了状態でTodoをフィルタリング |
| GET | /api/todos/search?keyword={keyword} | タイトルでTodoを検索 |

## 使用例

### Todoの作成

```bash
curl -X POST -H "Content-Type: application/json" -d '{"title":"牛乳を買う", "description":"スーパーで牛乳を買う"}' http://localhost:8080/api/todos
```

### すべてのTodoの取得

```bash
curl http://localhost:8080/api/todos
```

### 完了状態でのフィルタリング

```bash
curl "http://localhost:8080/api/todos/status?completed=true"
```

### タイトルでの検索

```bash
curl "http://localhost:8080/api/todos/search?keyword=%E8%B2%B7%E3%81%86"
```

## ライセンス

このプロジェクトはMITライセンスの下で公開されています。 
