package tb;

import android.content.Context;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface jgb {
    public static final int APP_ENV_DAILY = 2;
    public static final int APP_ENV_PRE = 1;
    public static final int APP_ENV_RELEASE = 0;
    public static final a Companion = a.$$INSTANCE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final int APP_ENV_DAILY = 2;
        public static final int APP_ENV_PRE = 1;
        public static final int APP_ENV_RELEASE = 0;

        static {
            t2o.a(144703552);
        }
    }

    boolean a(Context context);

    int getAppEnv();

    String getTTID();

    String getUTDID();

    boolean isForeground();
}
