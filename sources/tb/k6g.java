package tb;

import android.content.Context;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class k6g {
    public static final String TAG = "LOTTIE";

    /* renamed from: a  reason: collision with root package name */
    public static int f22431a;
    public static volatile mtj b;
    public static volatile ftj c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements slh {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f22432a;

        public a(Context context) {
            this.f22432a = context;
        }

        public File a() {
            return new File(this.f22432a.getCacheDir(), "lottie_network_cache");
        }
    }

    public static float a(String str) {
        int i = f22431a;
        if (i > 0) {
            f22431a = i - 1;
        }
        return 0.0f;
    }

    public static ftj b(Context context) {
        Context applicationContext = context.getApplicationContext();
        ftj ftjVar = c;
        if (ftjVar == null) {
            synchronized (ftj.class) {
                try {
                    ftjVar = c;
                    if (ftjVar == null) {
                        ftjVar = new ftj(new a(applicationContext));
                        c = ftjVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ftjVar;
    }

    public static mtj c(Context context) {
        mtj mtjVar = b;
        if (mtjVar == null) {
            synchronized (mtj.class) {
                try {
                    mtjVar = b;
                    if (mtjVar == null) {
                        mtjVar = new mtj(b(context), new qor());
                        b = mtjVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mtjVar;
    }
}
