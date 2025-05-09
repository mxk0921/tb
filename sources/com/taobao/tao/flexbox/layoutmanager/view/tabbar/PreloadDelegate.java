package com.taobao.tao.flexbox.layoutmanager.view.tabbar;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.collection.LruCache;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IFestival;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ILogin;
import com.taobao.tao.flexbox.layoutmanager.core.f;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import tb.akt;
import tb.igs;
import tb.noh;
import tb.nov;
import tb.nwv;
import tb.od0;
import tb.pl4;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PreloadDelegate {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final LruCache<String, o> h = new LruCache<>(5);
    public static final WeakHashMap<o, String> i = new WeakHashMap<>();
    public static final Set<String> j = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f12413a;
    public final Context b;
    public n c;
    public final b d;
    public final String e;
    public final boolean f;
    public o g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum PreloadHitResult {
        NONE("none"),
        REUSE(f.DSL_TYPE_REUSE),
        WAIT("wait");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String tip;

        PreloadHitResult(String str) {
            this.tip = str;
        }

        public static /* synthetic */ Object ipc$super(PreloadHitResult preloadHitResult, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/tabbar/PreloadDelegate$PreloadHitResult");
        }

        public static PreloadHitResult valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PreloadHitResult) ipChange.ipc$dispatch("e2acdd", new Object[]{str});
            }
            return (PreloadHitResult) Enum.valueOf(PreloadHitResult.class, str);
        }

        public String getTip() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("60e5feb4", new Object[]{this});
            }
            return this.tip;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void a(n nVar);

        void b();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f12417a;
        public n b;
        public b c;

        static {
            t2o.a(503317557);
        }

        public b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ae6c2ade", new Object[]{this});
            }
            return this.c;
        }

        public n b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (n) ipChange.ipc$dispatch("6cb6eb49", new Object[]{this});
            }
            return this.b;
        }

        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("15dabe57", new Object[]{this})).booleanValue();
            }
            return this.f12417a;
        }

        public void d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb01aea9", new Object[]{this, new Boolean(z)});
            } else {
                this.f12417a = z;
            }
        }

        public void e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ac6df1a", new Object[]{this, bVar});
            } else {
                this.c = bVar;
            }
        }

        public void f(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("904268f7", new Object[]{this, nVar});
            } else {
                this.b = nVar;
            }
        }
    }

    static {
        t2o.a(503317551);
    }

    public PreloadDelegate(Context context, o oVar, String str, String str2, Map map, boolean z, int i2, b bVar) {
        JSONObject jSONObject = new JSONObject();
        this.f12413a = jSONObject;
        this.b = context;
        this.g = oVar;
        this.e = e(str, str2);
        this.d = bVar;
        this.f = z;
        jSONObject.put("url", (Object) str);
        jSONObject.put("query", (Object) map);
        if (i2 == 0) {
            jSONObject.put(o.LAYOUT_STRATEGY_KEY, (Object) Boolean.TRUE);
        }
    }

    public static /* synthetic */ JSONObject a(PreloadDelegate preloadDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6a01b268", new Object[]{preloadDelegate});
        }
        return preloadDelegate.f12413a;
    }

    public static /* synthetic */ void b(PreloadDelegate preloadDelegate, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bace521c", new Object[]{preloadDelegate, map});
        } else {
            preloadDelegate.d(map);
        }
    }

    public static /* synthetic */ boolean c(PreloadDelegate preloadDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("589f54e", new Object[]{preloadDelegate})).booleanValue();
        }
        return preloadDelegate.f;
    }

    public static String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b466c6b1", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String k = k(str, str2);
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("tnode");
        if (!TextUtils.isEmpty(queryParameter)) {
            Uri parse2 = Uri.parse(queryParameter);
            if (TextUtils.isEmpty(parse2.getQueryParameter(pl4.KEY_ENGINE_PRELOAD))) {
                parse2 = parse2.buildUpon().appendQueryParameter(pl4.KEY_ENGINE_PRELOAD, k).build();
            }
            parse = nwv.w0(parse, "tnode", parse2.toString());
        }
        return parse.toString();
    }

    public static o f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("dc85ee45", new Object[]{str});
        }
        String g = g(str);
        if (TextUtils.isEmpty(g)) {
            return null;
        }
        synchronized (PreloadDelegate.class) {
            try {
                if (((HashSet) j).contains(g)) {
                    return null;
                }
                o oVar = new o();
                oVar.v1(str);
                h.put(g, oVar);
                i.put(oVar, g);
                return oVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17362123", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String queryParameter = Uri.parse(str).getQueryParameter("tnode");
        String queryParameter2 = !TextUtils.isEmpty(queryParameter) ? Uri.parse(queryParameter).getQueryParameter(pl4.KEY_ENGINE_PRELOAD) : null;
        return TextUtils.isEmpty(queryParameter2) ? k(str, null) : queryParameter2;
    }

    public static boolean j(o oVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c01b21a", new Object[]{oVar, str})).booleanValue();
        }
        return nwv.i(i.get(oVar), g(str));
    }

    public static String k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1322c41", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String b2 = nov.b(str);
        if (!TextUtils.isEmpty(str2)) {
            b2 = b2 + str2;
        }
        return noh.a(b2);
    }

    public static void n(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f65b00", new Object[]{oVar});
        } else if (oVar != null) {
            synchronized (PreloadDelegate.class) {
                try {
                    String remove = i.remove(oVar);
                    if (!TextUtils.isEmpty(remove)) {
                        h.remove(remove);
                        ((HashSet) j).remove(remove);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void o(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91db724e", new Object[]{runnable});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(runnable);
        }
    }

    public static o p(String str) {
        o remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("904ca5a3", new Object[]{str});
        }
        String g = g(str);
        if (TextUtils.isEmpty(g)) {
            return null;
        }
        synchronized (PreloadDelegate.class) {
            ((HashSet) j).add(g);
            remove = h.remove(g);
        }
        return remove;
    }

    public final void d(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2fcca7", new Object[]{this, map});
        } else if (map != null) {
            HashMap hashMap = new HashMap();
            map.put("env", hashMap);
            ILogin q = od0.D().q();
            if (q != null) {
                HashMap hashMap2 = new HashMap();
                hashMap.put("user", hashMap2);
                boolean b2 = q.b();
                hashMap2.put("isLogin", Boolean.valueOf(b2));
                if (b2) {
                    ILogin.a a2 = q.a();
                    hashMap2.put("uId", a2.f12001a);
                    hashMap2.put("nick", a2.b);
                    hashMap2.put("userLogo", a2.c);
                }
            }
            IFestival k = od0.D().k();
            if (k != null) {
                hashMap.put("festival", k.t().toMap());
            }
        }
    }

    public n h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("59438703", new Object[]{this});
        }
        return this.c;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.e;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b1c610", new Object[]{this});
        } else {
            m(0, 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12414a;
        public final /* synthetic */ int b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tao.flexbox.layoutmanager.view.tabbar.PreloadDelegate$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C0707a implements o.v {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0707a() {
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.o.v
            public void a(n nVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("16a2266", new Object[]{this, nVar});
                } else {
                    PreloadDelegate.this.c = nVar;
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.o.w
            public void b(n nVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d402dbd", new Object[]{this, nVar});
                    return;
                }
                PreloadDelegate preloadDelegate = PreloadDelegate.this;
                preloadDelegate.c = nVar;
                b bVar = preloadDelegate.d;
                if (bVar == null) {
                    return;
                }
                if (nVar == null) {
                    bVar.b();
                } else {
                    bVar.a(nVar);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ o.y f12416a;
            public final /* synthetic */ o.v b;

            public b(o.y yVar, o.v vVar) {
                this.f12416a = yVar;
                this.b = vVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    PreloadDelegate.this.g.N0(this.f12416a, this.b);
                }
            }
        }

        public a(int i, int i2) {
            this.f12414a = i;
            this.b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            o.y.a aVar = new o.y.a(PreloadDelegate.this.b);
            aVar.v(PreloadDelegate.this.e);
            PreloadDelegate preloadDelegate = PreloadDelegate.this;
            PreloadDelegate.b(preloadDelegate, PreloadDelegate.a(preloadDelegate));
            aVar.r(PreloadDelegate.a(PreloadDelegate.this));
            aVar.i(PreloadDelegate.c(PreloadDelegate.this));
            aVar.l(this.f12414a);
            aVar.k(this.b);
            o.y d = aVar.d();
            if (d.r() != null && d.r().g) {
                PreloadDelegate preloadDelegate2 = PreloadDelegate.this;
                if (preloadDelegate2.g == null) {
                    preloadDelegate2.g = PreloadDelegate.f(preloadDelegate2.e);
                    StringBuilder sb = new StringBuilder("preload engine result:");
                    if (PreloadDelegate.this.g != null) {
                        z = true;
                    }
                    sb.append(z);
                    sb.append(",url:");
                    sb.append(PreloadDelegate.this.e);
                    tfs.f(sb.toString());
                    PreloadDelegate preloadDelegate3 = PreloadDelegate.this;
                    if (preloadDelegate3.g == null) {
                        b bVar = preloadDelegate3.d;
                        if (bVar != null) {
                            bVar.b();
                            return;
                        }
                        return;
                    }
                }
                PreloadDelegate preloadDelegate4 = PreloadDelegate.this;
                preloadDelegate4.g.v1(preloadDelegate4.e);
                PreloadDelegate.o(new b(d, new C0707a()));
            }
        }
    }

    public void m(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3466e270", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else if (akt.f()) {
            if (this.e == null) {
                tfs.d("preload Url is Null");
                return;
            }
            igs.a("enginePreload");
            a aVar = new a(i2, i3);
            if (akt.E1()) {
                aVar.run();
            } else {
                nwv.z0(aVar, true);
            }
            igs.c();
        }
    }
}
