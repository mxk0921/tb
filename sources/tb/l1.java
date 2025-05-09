package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class l1 extends o1 {
    public static final int MONITOR_URGENCY_DELAYED = 2;
    public static final int MONITOR_URGENCY_REAL_TIME = 1;
    public int g;

    public l1() {
    }

    public int m() {
        return this.g;
    }

    public void n(int i) {
        this.g = i;
    }

    public l1(int i) {
        if (!(i == 1 || i == 2)) {
            i = 2;
        }
        this.g = i;
    }
}
