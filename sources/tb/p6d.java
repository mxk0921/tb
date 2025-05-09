package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface p6d {
    public static final int CREATED = 0;
    public static final a Companion = a.$$INSTANCE;
    public static final int DESTROYED = 5;
    public static final int PAUSED = 3;
    public static final int RESUMED = 2;
    public static final int STARTED = 1;
    public static final int STOPPED = 4;
    public static final int UNKNOWN = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final int CREATED = 0;
        public static final int DESTROYED = 5;
        public static final int PAUSED = 3;
        public static final int RESUMED = 2;
        public static final int STARTED = 1;
        public static final int STOPPED = 4;
        public static final int UNKNOWN = -1;

        static {
            t2o.a(919601323);
        }
    }

    void onPageCreate();

    void onPageDestroy();

    void onPagePause();

    void onPageResume();

    void onPageStart();

    void onPageStop();
}
