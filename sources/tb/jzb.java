package tb;

import android.content.Context;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface jzb {
    public static final a Companion = a.$$INSTANCE;
    public static final String DEVICE_LEVEL_HIGH = "HIGH";
    public static final String DEVICE_LEVEL_LOW = "LOW";
    public static final String DEVICE_LEVEL_MEDIUM = "MEDIUM";
    public static final String DEVICE_LEVEL_UNKNOWN = "UNKNOWN";
    public static final String DEVICE_TYPE_PAD = "PAD";
    public static final String DEVICE_TYPE_PHONE = "PHONE";
    public static final String SCREEN_TYPE_FOLD = "FOLD";
    public static final String SCREEN_TYPE_NORMAL = "NORMAL";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final String DEVICE_LEVEL_HIGH = "HIGH";
        public static final String DEVICE_LEVEL_LOW = "LOW";
        public static final String DEVICE_LEVEL_MEDIUM = "MEDIUM";
        public static final String DEVICE_LEVEL_UNKNOWN = "UNKNOWN";
        public static final String DEVICE_TYPE_PAD = "PAD";
        public static final String DEVICE_TYPE_PHONE = "PHONE";
        public static final String SCREEN_TYPE_FOLD = "FOLD";
        public static final String SCREEN_TYPE_NORMAL = "NORMAL";

        static {
            t2o.a(144703557);
        }
    }

    String a(Context context);

    float b();

    float c();

    String d(Context context);

    boolean e(Context context);

    String getDeviceLevel();
}
