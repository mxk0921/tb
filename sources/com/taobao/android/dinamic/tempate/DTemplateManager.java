package com.taobao.android.dinamic.tempate;

import android.app.Application;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.a;
import com.taobao.android.dinamicx.s;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import tb.bv7;
import tb.f65;
import tb.kn7;
import tb.lm7;
import tb.oit;
import tb.t2o;
import tb.tl7;
import tb.ym7;
import tb.zig;
import tb.zm7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DTemplateManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f7262a;
    public final zig b;
    public final Context e;
    public final LruCache<String, Integer> c = new LruCache<>(100);
    public final LruCache<String, Boolean> d = new LruCache<>(100);
    public final int f = 3000;
    public final com.taobao.android.dinamic.tempate.a g = new com.taobao.android.dinamic.tempate.a();
    public final String h = "dinamic";
    public CacheStrategy i = CacheStrategy.STRATEGY_DEFAULT;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum CacheStrategy {
        STRATEGY_DEFAULT,
        STRATEGY_ALLOW_VERSION_DEGRADE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(CacheStrategy cacheStrategy, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/tempate/DTemplateManager$CacheStrategy");
        }

        public static CacheStrategy valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CacheStrategy) ipChange.ipc$dispatch("e2bc366", new Object[]{str});
            }
            return (CacheStrategy) Enum.valueOf(CacheStrategy.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kn7 f7263a;

        public a(DTemplateManager dTemplateManager, kn7 kn7Var) {
            this.f7263a = kn7Var;
        }

        public void a(bv7 bv7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ae02240", new Object[]{this, bv7Var});
                return;
            }
            kn7 kn7Var = this.f7263a;
            if (kn7Var != null) {
                ((s.a) kn7Var).a(bv7Var);
            } else if (tl7.f()) {
                ym7.m("DTemplateManager", "DinamicTemplateDownloaderCallback is null");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DinamicTemplate f7264a;
        public final /* synthetic */ DinamicTemplate b;
        public final /* synthetic */ long c;

        public b(DinamicTemplate dinamicTemplate, DinamicTemplate dinamicTemplate2, long j) {
            this.f7264a = dinamicTemplate;
            this.b = dinamicTemplate2;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (tl7.f()) {
                ym7.a(tl7.TAG, "fetch exact template=origin template=" + this.f7264a + "exact template=" + this.b + "consuming=" + (this.c / 1000000.0d));
            }
            f65.n().d().g(DTemplateManager.a(DTemplateManager.this), DTemplateManager.b(DTemplateManager.this), this.f7264a, this.b, this.c / 1000000.0d);
        }
    }

    static {
        t2o.a(444596370);
    }

    public DTemplateManager(String str) {
        this.f7262a = str;
        Context a2 = tl7.a();
        this.e = a2;
        if (a2 == null) {
            Application a3 = lm7.a();
            this.e = a3;
            tl7.h(a3);
        }
        zig zigVar = new zig(this.e, str);
        this.b = zigVar;
        zigVar.i(f65.n().b());
    }

    public static /* synthetic */ String a(DTemplateManager dTemplateManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b632369", new Object[]{dTemplateManager});
        }
        return dTemplateManager.f7262a;
    }

    public static /* synthetic */ CacheStrategy b(DTemplateManager dTemplateManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CacheStrategy) ipChange.ipc$dispatch("8d521de3", new Object[]{dTemplateManager});
        }
        return dTemplateManager.i;
    }

    public static DTemplateManager c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DTemplateManager) ipChange.ipc$dispatch("d188ab7", new Object[0]);
        }
        return tl7.c("default").b;
    }

    public static DTemplateManager t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DTemplateManager) ipChange.ipc$dispatch("dc3c7334", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return tl7.c("default").b;
        }
        return tl7.c(str).b;
    }

    public void d(List<DinamicTemplate> list, kn7 kn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4787d259", new Object[]{this, list, kn7Var});
            return;
        }
        a aVar = new a(this, kn7Var);
        a.AsyncTaskC0397a aVar2 = new a.AsyncTaskC0397a(this.b, this.f);
        aVar2.b = aVar;
        aVar2.c = list;
        aVar2.d = this.f7262a;
        this.g.b(aVar2);
    }

    public DinamicTemplate e(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicTemplate) ipChange.ipc$dispatch("2d1e44f7", new Object[]{this, dinamicTemplate});
        }
        return this.b.a(dinamicTemplate);
    }

    public DinamicTemplate f(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicTemplate) ipChange.ipc$dispatch("10abfe10", new Object[]{this, dinamicTemplate});
        }
        if (dinamicTemplate == null) {
            return null;
        }
        long nanoTime = System.nanoTime();
        if (dinamicTemplate.isPreset()) {
            DinamicTemplate j = j(dinamicTemplate);
            n(dinamicTemplate, j, System.nanoTime() - nanoTime);
            return j;
        }
        CacheStrategy cacheStrategy = this.i;
        if (cacheStrategy == CacheStrategy.STRATEGY_DEFAULT) {
            DinamicTemplate m = m(dinamicTemplate);
            if (m != null) {
                n(dinamicTemplate, m, System.nanoTime() - nanoTime);
                return m;
            }
        } else if (cacheStrategy == CacheStrategy.STRATEGY_ALLOW_VERSION_DEGRADE) {
            DinamicTemplate m2 = m(dinamicTemplate);
            if (m2 != null) {
                n(dinamicTemplate, m2, System.nanoTime() - nanoTime);
                return m2;
            }
            DinamicTemplate e = e(dinamicTemplate);
            if (e != null) {
                n(dinamicTemplate, e, System.nanoTime() - nanoTime);
                return e;
            }
        }
        DinamicTemplate j2 = j(dinamicTemplate);
        n(dinamicTemplate, j2, System.nanoTime() - nanoTime);
        return j2;
    }

    public final int g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("12942b94", new Object[]{this, str})).intValue();
        }
        if (this.e == null || TextUtils.isEmpty(str)) {
            return -1;
        }
        Integer num = this.c.get(str);
        if (num == null) {
            try {
                num = Integer.valueOf(this.e.getResources().getIdentifier(str, "layout", this.e.getPackageName()));
                this.c.put(str, num);
            } catch (Exception e) {
                Log.e("DTemplateManager", "Get layout parser exception", e);
            }
        }
        if (num == null || num.intValue() == 0) {
            return -1;
        }
        return num.intValue();
    }

    public zig h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zig) ipChange.ipc$dispatch("54ef858c", new Object[]{this});
        }
        return this.b;
    }

    public XmlResourceParser i(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlResourceParser) ipChange.ipc$dispatch("c37bc4c2", new Object[]{this, dinamicTemplate});
        }
        if (!(this.e == null || dinamicTemplate == null || TextUtils.isEmpty(dinamicTemplate.name))) {
            try {
                int g = g(dinamicTemplate.name);
                if (g > 0) {
                    new StringBuilder("Res parser is applied: ").append(dinamicTemplate.name);
                    return this.e.getResources().getLayout(g);
                }
            } catch (Exception e) {
                Log.e("DTemplateManager", "Get layout parser exception", e);
            }
        }
        return null;
    }

    public DinamicTemplate j(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicTemplate) ipChange.ipc$dispatch("998e5aa0", new Object[]{this, dinamicTemplate});
        }
        if (g(dinamicTemplate.name) > 0) {
            DinamicTemplate dinamicTemplate2 = new DinamicTemplate();
            dinamicTemplate2.name = dinamicTemplate.name;
            dinamicTemplate2.version = "";
            return dinamicTemplate2;
        } else if (!l(dinamicTemplate.name)) {
            return null;
        } else {
            DinamicTemplate dinamicTemplate3 = new DinamicTemplate();
            dinamicTemplate3.name = dinamicTemplate.name;
            dinamicTemplate3.version = "";
            return dinamicTemplate3;
        }
    }

    public String k(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15bb640", new Object[]{this, dinamicTemplate});
        }
        if (dinamicTemplate == null) {
            return null;
        }
        if (dinamicTemplate.isPreset()) {
            return dinamicTemplate.name;
        }
        return dinamicTemplate.name + "_" + dinamicTemplate.version;
    }

    public final boolean l(String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c88b8f7", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Boolean bool = this.d.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        String str2 = str + ".xml";
        try {
            InputStream proxy_open = AssetsDelegate.proxy_open(tl7.a().getAssets(), this.h + "/" + str2);
            LruCache<String, Boolean> lruCache = this.d;
            if (proxy_open != null) {
                z = true;
            } else {
                z = false;
            }
            lruCache.put(str, Boolean.valueOf(z));
            if (proxy_open != null) {
                return true;
            }
            return false;
        } catch (IOException unused) {
            this.d.put(str, Boolean.FALSE);
            return false;
        }
    }

    public DinamicTemplate m(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicTemplate) ipChange.ipc$dispatch("f26cad4c", new Object[]{this, dinamicTemplate});
        }
        if (!this.b.d(k(dinamicTemplate))) {
            return null;
        }
        DinamicTemplate dinamicTemplate2 = new DinamicTemplate();
        dinamicTemplate2.templateUrl = dinamicTemplate.templateUrl;
        dinamicTemplate2.name = dinamicTemplate.name;
        dinamicTemplate2.version = dinamicTemplate.version;
        return dinamicTemplate2;
    }

    public final void n(DinamicTemplate dinamicTemplate, DinamicTemplate dinamicTemplate2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23409806", new Object[]{this, dinamicTemplate, dinamicTemplate2, new Long(j)});
        } else if (f65.n().d() != null && zm7.a()) {
            zm7.b.a(new b(dinamicTemplate, dinamicTemplate2, j));
        }
    }

    public byte[] o(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a94538f0", new Object[]{this, dinamicTemplate});
        }
        return this.b.g(this.h, k(dinamicTemplate));
    }

    public byte[] p(DinamicTemplate dinamicTemplate) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bf74e1bd", new Object[]{this, dinamicTemplate});
        }
        String k = k(dinamicTemplate);
        if (TextUtils.isEmpty(k)) {
            return null;
        }
        return this.b.h(k);
    }

    public void q(oit.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("348bd19f", new Object[]{this, fVar});
        } else {
            this.b.i(fVar);
        }
    }

    public void r(CacheStrategy cacheStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e46e4a3", new Object[]{this, cacheStrategy});
        } else {
            this.i = cacheStrategy;
        }
    }

    public void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("318788b5", new Object[]{this, new Integer(i)});
        } else {
            this.b.j(i);
        }
    }
}
