package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.analytics.AnalyticsMgr;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ovv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f25699a;
    public volatile boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25700a;

        public a(String str) {
            this.f25700a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (aaa.e() && ovv.a(ovv.this, this.f25700a) && !ovv.b(ovv.this)) {
                AnalyticsMgr.R();
                vp9.b("linkx", "UtSyncManager === syncPrepose === " + this.f25700a);
                ovv.c(ovv.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25701a;

        public b(String str) {
            this.f25701a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (aaa.e() && ovv.a(ovv.this, this.f25701a) && !ovv.d(ovv.this)) {
                try {
                    g3v.getInstance().saveCacheDataToLocal();
                    Thread.sleep(500L);
                    g3v.getInstance().dispatchLocalHits();
                } catch (Throwable unused) {
                }
                vp9.b("linkx", "UtSyncManager === syncPostpose === " + this.f25701a);
                ovv.e(ovv.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ovv f25702a = new ovv(null);

        static {
            t2o.a(744488993);
        }

        public static /* synthetic */ ovv a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ovv) ipChange.ipc$dispatch("703452d3", new Object[0]);
            }
            return f25702a;
        }
    }

    static {
        t2o.a(744488990);
    }

    public /* synthetic */ ovv(a aVar) {
        this();
    }

    public static /* synthetic */ boolean a(ovv ovvVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b50f165b", new Object[]{ovvVar, str})).booleanValue();
        }
        return ovvVar.f(str);
    }

    public static /* synthetic */ boolean b(ovv ovvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6fceed2", new Object[]{ovvVar})).booleanValue();
        }
        return ovvVar.f25699a;
    }

    public static /* synthetic */ boolean c(ovv ovvVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b0e4388", new Object[]{ovvVar, new Boolean(z)})).booleanValue();
        }
        ovvVar.f25699a = z;
        return z;
    }

    public static /* synthetic */ boolean d(ovv ovvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec90f7d3", new Object[]{ovvVar})).booleanValue();
        }
        return ovvVar.b;
    }

    public static /* synthetic */ boolean e(ovv ovvVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7fb5aa7", new Object[]{ovvVar, new Boolean(z)})).booleanValue();
        }
        ovvVar.b = z;
        return z;
    }

    public static ovv g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ovv) ipChange.ipc$dispatch("d76b764e", new Object[0]);
        }
        return c.a();
    }

    public final boolean f(String str) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc5d511e", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null) {
            return "1".equals(parse.getQueryParameter("afc_link_ut"));
        }
        return false;
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425f167d", new Object[]{this, str});
        } else {
            csg.a(new b(str));
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59b1fc6a", new Object[]{this, str});
        } else {
            csg.a(new a(str));
        }
    }

    public ovv() {
        this.f25699a = false;
        this.b = false;
    }
}
