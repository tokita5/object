package basic.inspection;

class Result {
    private String id;//検査を受けた人の ID
    private String name;//検査を受けた人の名前
    private String dateTime;//検査日時
    private double bT;//体温
    private int pulse;//脈拍
    private int sBP;//収縮期血圧
    private int dBP;//拡張期血圧

    public Result(String id, String name, String dateTime, double bT, int pulse, int sBP, int dBP) {
        this.id = id;
        this.name = name;
        this.dateTime = dateTime;
        this.bT = bT;
        this.pulse = pulse;
        this.sBP = sBP;
        this.dBP = dBP;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateTime() {
        return dateTime;
    }

    public double getbT() {
        return bT;
    }

    public int getPulse() {
        return pulse;
    }

    public int getsBP() {
        return sBP;
    }

    public int getdBP() {
        return dBP;
    }

    public double getMBP() {
        return dBP+(sBP-dBP)/3.0;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%.1f,%d,%d,%d,%.1f",
        id,name,dateTime,bT,pulse,sBP,dBP,getMBP());
    }
}