package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface lr9 {
    public static final int MAX_PENDING_SIZE = 200;
    public static final int STATE_CREATED = 6;
    public static final int STATE_DESTROY = 4;
    public static final int STATE_ERROR = 3;
    public static final int STATE_INIT = 0;
    public static final int STATE_INITIALIZING = 1;
    public static final int STATE_PRE_INITIALIZING = 5;
    public static final int STATE_READY = 2;

    boolean a();

    boolean b();

    boolean j(vrp vrpVar);

    void k(vrp vrpVar);

    void onDestroy();
}
