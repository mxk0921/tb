package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface sxo {
    public static final int POSITION_TYPE_BOTTOM = 2;
    public static final int POSITION_TYPE_MIDDLE = 1;
    public static final int POSITION_TYPE_TOP = 0;

    int getScrollCount();

    void scrollBy(int i, int i2, boolean z);

    void scrollTo(int i, int i2, boolean z);

    void scrollToPosition(int i, boolean z, int i2);

    void scrollToPositionWithNumber(int i, boolean z, int i2, int i3);
}
