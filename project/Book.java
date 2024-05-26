package project;

public class Book {
    // 属性
    // 书籍编号
    private int bNo;
    // 书籍名称
    private String bName;
    // 书籍作者
    private String bAuthor;

    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = this.bNo;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }
    // 创建构造器
    public Book(int bNo, String bName, String bAuthor) {
        this.bNo = bNo;
        this.bName = bName;
        this.bAuthor = bAuthor;
    }
}
