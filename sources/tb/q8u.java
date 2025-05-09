package tb;

import androidx.core.os.TraceCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import tb.ud0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class q8u {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f26589a;
    public static boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601376);
        }

        public a() {
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fcca111", new Object[]{this});
            } else if (q8u.a()) {
                TraceCompat.endSection();
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5235938d", new Object[]{this, str});
                return;
            }
            ckf.g(str, "tag");
            if (q8u.a()) {
                if (!q8u.b()) {
                    b();
                    q8u.c(true);
                }
                TraceCompat.beginSection(str);
            }
        }

        public final void b() {
            try {
                Class.forName("android.os.Trace").getDeclaredMethod("setAppTracingAllowed", Boolean.TYPE).invoke(null, Boolean.TRUE);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            }
        }
    }

    static {
        t2o.a(919601375);
        ud0.a aVar = ud0.Companion;
        f26589a = aVar.b().a("enableTurboTrace");
        aVar.b().a("enableTurboMethodTrace");
    }

    public static final /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cb1ae90", new Object[0])).booleanValue();
        }
        return f26589a;
    }

    public static final /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45c11cfe", new Object[0])).booleanValue();
        }
        return b;
    }

    public static final /* synthetic */ void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0a7f48e", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }
}
