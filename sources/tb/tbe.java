package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface tbe {
    public static final int CLOSED = 4;
    public static final int CLOSING = 3;
    public static final int CONNECTING = 1;
    public static final int NOT_YET_CONNECTED = 0;
    public static final int OPEN = 2;

    boolean close();

    int getConnState();

    boolean send(String str);
}
