package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class rsf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Context f27580a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static nol f27581a;
        public static String b;

        public static Map<String, String> a(Activity activity, Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("65d0e09a", new Object[]{activity, uri});
            }
            return d().l(activity, uri);
        }

        public static Map<String, String> b(String str, Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("3ead722", new Object[]{str, uri});
            }
            return d().m(str, uri);
        }

        public static String c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("44afa8ff", new Object[]{str});
            }
            return d().n(str);
        }

        public static synchronized nol d() {
            synchronized (a.class) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (nol) ipChange.ipc$dispatch("968d16c7", new Object[0]);
                }
                if (f27581a == null) {
                    f27581a = new nol(rsf.a(), b);
                }
                return f27581a;
            }
        }

        public static void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a47f70dc", new Object[]{str});
                return;
            }
            f27581a = null;
            b = str;
        }
    }

    public static /* synthetic */ Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("bf71316f", new Object[0]);
        }
        return f27580a;
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else {
            f27580a = context;
        }
    }
}
