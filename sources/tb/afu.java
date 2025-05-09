package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class afu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final afu INSTANCE = new afu();

    /* renamed from: a  reason: collision with root package name */
    public static volatile Boolean f15716a;
    public static volatile String b;
    public static volatile String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("isSuccess", String.valueOf(afu.c()));
            String b = afu.b();
            String str = "";
            if (b == null) {
                b = str;
            }
            linkedHashMap.put("tfs", b);
            String a2 = afu.a();
            if (a2 != null) {
                str = a2;
            }
            linkedHashMap.put("result", str);
            xhv xhvVar = xhv.INSTANCE;
            mzu.p("Page_PhotoSearchResult", "translateFinish", linkedHashMap);
            afu.e(null);
            afu.d(null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;

        public b(boolean z, String str) {
            this.b = z;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z = this.b;
            String str = this.c;
            linkedHashMap.put("isSuccess", String.valueOf(z));
            String b = afu.b();
            if (b == null) {
                b = "";
            }
            linkedHashMap.put("tfs", b);
            linkedHashMap.put("result", str);
            xhv xhvVar = xhv.INSTANCE;
            mzu.p("Page_PhotoSearchResult", "translateFinish", linkedHashMap);
            afu.e(null);
            afu.d(null);
        }
    }

    static {
        t2o.a(481297186);
    }

    public static final /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c348a87a", new Object[0]);
        }
        return b;
    }

    public static final /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc134502", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ Boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("1a4d2349", new Object[0]);
        }
        return f15716a;
    }

    public static final /* synthetic */ void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a9c13c", new Object[]{str});
        } else {
            b = str;
        }
    }

    public static final /* synthetic */ void e(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c75fb9", new Object[]{bool});
        } else {
            f15716a = bool;
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc043f84", new Object[]{this, str});
            return;
        }
        ckf.g(str, "resultTfs");
        c = str;
        if (f15716a != null) {
            z7m.c(a.INSTANCE);
        }
    }

    public final void g(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91c3bf94", new Object[]{this, new Boolean(z), str});
            return;
        }
        ckf.g(str, "result");
        f15716a = Boolean.valueOf(z);
        b = str;
        if (c != null) {
            z7m.c(new b(z, str));
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        f15716a = null;
        b = null;
        c = null;
    }
}
