package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zvg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static zvg i;
    public static String j;

    /* renamed from: a  reason: collision with root package name */
    public final String f33040a;
    public Context b;
    public final ux9 c;
    public zlc e;
    public olc f;
    public ukr g;
    public boolean h = false;
    public ylc d = new x2h();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jnr f33041a;

        public a(jnr jnrVar) {
            this.f33041a = jnrVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (zvg.c(zvg.this) != null) {
                String k = zvg.c(zvg.this).k();
                if (!TextUtils.isEmpty(k)) {
                    this.f33041a.h(k);
                } else {
                    this.f33041a.b();
                }
            } else {
                this.f33041a.b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends inr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jnr f33042a;

        public b(zvg zvgVar, jnr jnrVar) {
            this.f33042a = jnrVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/jsbridge/LiveApiEngine$11");
        }

        @Override // tb.inr
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1392128f", new Object[]{this});
            } else {
                this.f33042a.b();
            }
        }

        @Override // tb.inr
        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b54654", new Object[]{this, str});
            } else {
                this.f33042a.h(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends inr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jnr f33043a;

        public c(zvg zvgVar, jnr jnrVar) {
            this.f33043a = jnrVar;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/jsbridge/LiveApiEngine$12");
        }

        @Override // tb.inr
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1392128f", new Object[]{this});
            } else {
                this.f33043a.b();
            }
        }

        @Override // tb.inr
        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b54654", new Object[]{this, str});
            } else {
                this.f33043a.h(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HashMap f33044a;
        public final /* synthetic */ IWVWebView b;
        public final /* synthetic */ jnr c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                HashMap hashMap;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (zvg.c(zvg.this) == null || (hashMap = d.this.f33044a) == null || hashMap.isEmpty()) {
                    d.this.c.b();
                } else {
                    ylc a2 = zvg.a(zvg.this);
                    d dVar = d.this;
                    a2.c(dVar.b, zvg.b(zvg.this), zqq.j((String) d.this.f33044a.get("msgType")));
                    d.this.c.f();
                }
            }
        }

        public d(HashMap hashMap, IWVWebView iWVWebView, jnr jnrVar) {
            this.f33044a = hashMap;
            this.b = iWVWebView;
            this.c = jnrVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                z1i.a().c(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e extends inr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jnr f33046a;

        public e(zvg zvgVar, jnr jnrVar) {
            this.f33046a = jnrVar;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/jsbridge/LiveApiEngine$14");
        }

        @Override // tb.inr
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72e35699", new Object[]{this, str});
            } else {
                this.f33046a.c(str);
            }
        }

        @Override // tb.inr
        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b54654", new Object[]{this, str});
            } else {
                this.f33046a.h(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HashMap f33047a;
        public final /* synthetic */ jnr b;

        public f(HashMap hashMap, jnr jnrVar) {
            this.f33047a = hashMap;
            this.b = jnrVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HashMap hashMap = this.f33047a;
            if (hashMap == null || hashMap.isEmpty() || zvg.a(zvg.this) == null) {
                this.b.b();
                return;
            }
            zvg.a(zvg.this).d(zvg.b(zvg.this), this.f33047a);
            this.b.f();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g extends inr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jnr f33048a;

        public g(zvg zvgVar, jnr jnrVar) {
            this.f33048a = jnrVar;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/jsbridge/LiveApiEngine$2");
        }

        @Override // tb.inr
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1392128f", new Object[]{this});
            } else {
                this.f33048a.b();
            }
        }

        @Override // tb.inr
        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b54654", new Object[]{this, str});
            } else {
                this.f33048a.h(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h extends inr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jnr f33049a;

        public h(zvg zvgVar, jnr jnrVar) {
            this.f33049a = jnrVar;
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/jsbridge/LiveApiEngine$3");
        }

        @Override // tb.inr
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1392128f", new Object[]{this});
            } else {
                this.f33049a.b();
            }
        }

        @Override // tb.inr
        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b54654", new Object[]{this, str});
            } else {
                this.f33049a.h(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class i extends inr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jnr f33050a;

        public i(zvg zvgVar, jnr jnrVar) {
            this.f33050a = jnrVar;
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/jsbridge/LiveApiEngine$4");
        }

        @Override // tb.inr
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72e35699", new Object[]{this, str});
                return;
            }
            this.f33050a.c(str);
            jbu.b("getComponentList_CallBack", "errorCode=error");
        }

        @Override // tb.inr
        public void c(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19a43926", new Object[]{this, jSONObject});
                return;
            }
            this.f33050a.g(jSONObject);
            jbu.b("getComponentList_callback", "errorCode=success");
        }

        @Override // tb.inr
        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b54654", new Object[]{this, str});
                return;
            }
            this.f33050a.h(str);
            jbu.b("getComponentList_callBack", "errorCode=success");
        }

        @Override // tb.inr
        public void e(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f354e551", new Object[]{this, bArr});
                return;
            }
            this.f33050a.j(bArr);
            jbu.b("getComponentList_callback", "errorCode=success");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HashMap f33051a;
        public final /* synthetic */ jnr b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                HashMap hashMap = j.this.f33051a;
                if (hashMap == null || hashMap.isEmpty() || zvg.a(zvg.this) == null) {
                    j.this.b.b();
                    return;
                }
                zvg.a(zvg.this).b(zvg.b(zvg.this), j.this.f33051a);
                j.this.b.f();
            }
        }

        public j(HashMap hashMap, jnr jnrVar) {
            this.f33051a = hashMap;
            this.b = jnrVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                z1i.a().c(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HashMap f33053a;
        public final /* synthetic */ jnr b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                HashMap hashMap = k.this.f33053a;
                if (hashMap == null || hashMap.isEmpty() || zvg.a(zvg.this) == null) {
                    k.this.b.b();
                    return;
                }
                zvg.a(zvg.this).a(zvg.b(zvg.this), k.this.f33053a);
                k.this.b.f();
            }
        }

        public k(HashMap hashMap, jnr jnrVar) {
            this.f33053a = hashMap;
            this.b = jnrVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                z1i.a().c(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class l extends inr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jnr f33055a;

        public l(zvg zvgVar, jnr jnrVar) {
            this.f33055a = jnrVar;
        }

        public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/jsbridge/LiveApiEngine$7");
        }

        @Override // tb.inr
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1392128f", new Object[]{this});
            } else {
                this.f33055a.b();
            }
        }

        @Override // tb.inr
        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b54654", new Object[]{this, str});
            } else {
                this.f33055a.h(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class m extends inr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jnr f33056a;

        public m(zvg zvgVar, jnr jnrVar) {
            this.f33056a = jnrVar;
        }

        public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/jsbridge/LiveApiEngine$8");
        }

        @Override // tb.inr
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1392128f", new Object[]{this});
            } else {
                this.f33056a.b();
            }
        }

        @Override // tb.inr
        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b54654", new Object[]{this, str});
            } else {
                this.f33056a.h(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class n implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ org.json.JSONObject f33057a;
        public final /* synthetic */ jnr b;

        public n(org.json.JSONObject jSONObject, jnr jnrVar) {
            this.f33057a = jSONObject;
            this.b = jnrVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            org.json.JSONObject jSONObject = this.f33057a;
            if (jSONObject != null) {
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    this.b.h(jSONObject2);
                } else {
                    this.b.b();
                }
            } else {
                this.b.b();
            }
        }
    }

    static {
        t2o.a(295699904);
    }

    public zvg() {
    }

    public static /* synthetic */ ylc a(zvg zvgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ylc) ipChange.ipc$dispatch("525cd263", new Object[]{zvgVar});
        }
        return zvgVar.d;
    }

    public static /* synthetic */ ukr b(zvg zvgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ukr) ipChange.ipc$dispatch("89b68a4c", new Object[]{zvgVar});
        }
        return zvgVar.g;
    }

    public static /* synthetic */ zlc c(zvg zvgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zlc) ipChange.ipc$dispatch("ae38e104", new Object[]{zvgVar});
        }
        return zvgVar.e;
    }

    public static zvg h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zvg) ipChange.ipc$dispatch("c9f9f88d", new Object[0]);
        }
        return i;
    }

    public static void l(String str) {
        zvg zvgVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a484684e", new Object[]{str});
        } else if (TextUtils.equals(j, str) && (zvgVar = i) != null) {
            zvgVar.f();
            i = null;
        }
    }

    public static void o(String str, zvg zvgVar) {
        zvg zvgVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4833631", new Object[]{str, zvgVar});
            return;
        }
        if (!TextUtils.equals(j, str) && (zvgVar2 = i) != null) {
            zvgVar2.f();
        }
        j = str;
        i = zvgVar;
    }

    public final boolean d(String str, HashMap<String, String> hashMap) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86aa4ab3", new Object[]{this, str, hashMap})).booleanValue();
        }
        if (!tws.P(str)) {
            return true;
        }
        if (hashMap == null || !hashMap.containsKey("liveToken") || TextUtils.isEmpty(hashMap.get("liveToken")) || (hashMap.containsKey("liveToken") && TextUtils.equals(hashMap.get("liveToken"), this.g.c0()))) {
            z = true;
        } else {
            z = false;
        }
        if (!tws.q() || z) {
            return true;
        }
        return false;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.h = true;
        this.b = null;
        this.g = null;
        zlc zlcVar = this.e;
        if (zlcVar != null) {
            zlcVar.destroy();
            this.e = null;
        }
        olc olcVar = this.f;
        if (olcVar != null) {
            olcVar.destroy();
            this.f = null;
        }
        this.d = null;
    }

    public final void g(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce66a90", new Object[]{this, runnable});
        } else if (runnable != null) {
            if (!phf.a(this.b)) {
                runnable.run();
            } else if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                AsyncTask.execute(runnable);
            } else {
                runnable.run();
            }
        }
    }

    public ukr i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ukr) ipChange.ipc$dispatch("10e034b", new Object[]{this});
        }
        return this.g;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35b933fb", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:267:0x0608, code lost:
        if (r29.equals("glTimeOut") == false) goto L_0x00fd;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean k(android.taobao.windvane.webview.IWVWebView r28, java.lang.String r29, java.util.HashMap<java.lang.String, java.lang.String> r30, java.lang.String r31, tb.jnr r32) {
        /*
            Method dump skipped, instructions count: 4280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.zvg.k(android.taobao.windvane.webview.IWVWebView, java.lang.String, java.util.HashMap, java.lang.String, tb.jnr):boolean");
    }

    public void m(olc olcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c05c3135", new Object[]{this, olcVar});
        } else {
            this.f = olcVar;
        }
    }

    public void n(zlc zlcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fab61db5", new Object[]{this, zlcVar});
        } else {
            this.e = zlcVar;
        }
    }

    public void p(ukr ukrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7537ea05", new Object[]{this, ukrVar});
        } else {
            this.g = ukrVar;
        }
    }

    public final boolean e(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a2797a7", new Object[]{this, str, hashMap})).booleanValue();
        }
        if (!tws.P(str)) {
            return true;
        }
        return !tws.e() || (hashMap != null && hashMap.containsKey("token") && TextUtils.equals(hashMap.get("token"), tws.b()));
    }

    public zvg(String str, Context context, ux9 ux9Var) {
        this.f33040a = str;
        this.b = context;
        this.c = ux9Var;
    }
}
