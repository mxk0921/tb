package com.taobao.tao.flexbox.layoutmanager.core;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.a;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.util.List;
import java.util.Map;
import tb.akt;
import tb.gl4;
import tb.gol;
import tb.igs;
import tb.lgs;
import tb.nwv;
import tb.od0;
import tb.t2o;
import tb.tfs;
import tb.vfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BAD_DSL = "badDSL";
    public static final int DEFAULT_TNODE_VERSION = -1;
    public static final String DSL_PREFIX = "tnode_dsl_";
    public static final String DSL_TYPE_AWP = "awp";
    public static final String DSL_TYPE_CACHE = "cache";
    public static final String DSL_TYPE_LAST_AWP = "last_awp";
    public static final String DSL_TYPE_LOCAL = "local";
    public static final String DSL_TYPE_MAP = "map";
    public static final String DSL_TYPE_NETWORK = "network";
    public static final String DSL_TYPE_REUSE = "reuse";
    public static final String DSL_TYPE_UNKNOWN = "unknown";
    public static final int TNODE_SUPPORT_PAD_VERSION = 3;

    /* renamed from: a  reason: collision with root package name */
    public static final LruCache<String, Map> f12208a = new LruCache<>(10);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements a.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o.y f12209a;
        public final /* synthetic */ g b;

        public a(o.y yVar, g gVar) {
            this.f12209a = yVar;
            this.b = gVar;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.ac.a.c
        public void a(byte[] bArr) {
            Map map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8041160", new Object[]{this, bArr});
                return;
            }
            if (bArr == null || bArr.length <= 0) {
                map = null;
            } else {
                o.y yVar = this.f12209a;
                map = f.f(bArr, yVar.d, yVar.k);
                if (map != null && akt.l0()) {
                    f.s(this.f12209a, bArr);
                }
            }
            g gVar = this.b;
            if (gVar != null) {
                gVar.a(map, this.f12209a.q);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.ac.a.c
        public void onFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8bb1183", new Object[]{this});
                return;
            }
            g gVar = this.b;
            if (gVar != null) {
                gVar.a(null, this.f12209a.q);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IStorage f12210a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public b(IStorage iStorage, String str, Object obj) {
            this.f12210a = iStorage;
            this.b = str;
            this.c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f12210a.d(IStorage.TYPE_DSL, this.b, this.c);
            this.f12210a.h("config", this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c implements a.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o.y f12211a;

        public c(o.y yVar) {
            this.f12211a = yVar;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.ac.a.c
        public void a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8041160", new Object[]{this, bArr});
            } else if (bArr != null && bArr.length > 0) {
                f.s(this.f12211a, bArr);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.ac.a.c
        public void onFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8bb1183", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o.y f12212a;
        public final /* synthetic */ g b;
        public final /* synthetic */ o c;

        public d(o.y yVar, g gVar, o oVar) {
            this.f12212a = yVar;
            this.b = gVar;
            this.c = oVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            boolean j = f.j(this.f12212a);
            byte[] m = f.m(this.f12212a, j);
            if (m != null && m.length != 0) {
                o.y yVar = this.f12212a;
                Map f = f.f(m, yVar.d, yVar.k);
                if (f == null && !TextUtils.isEmpty(this.f12212a.e)) {
                    f = f.h(this.f12212a);
                }
                if (f != null || !akt.p2("recoverDamagedDSL", true)) {
                    f.a(this.f12212a, f, this.b);
                } else {
                    f.b(this.c, this.f12212a, this.b);
                }
            } else if (!j || TextUtils.isEmpty(this.f12212a.e)) {
                f.b(this.c, this.f12212a, this.b);
            } else {
                f.a(this.f12212a, f.h(this.f12212a), this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e implements a.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o.y f12213a;
        public final /* synthetic */ g b;

        public e(o.y yVar, g gVar) {
            this.f12213a = yVar;
            this.b = gVar;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.ac.a.c
        public void a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8041160", new Object[]{this, bArr});
                return;
            }
            if (bArr == null || bArr.length == 0) {
                bArr = f.n(this.f12213a);
            } else {
                f.s(this.f12213a, bArr);
            }
            if (bArr != null && bArr.length != 0) {
                o.y yVar = this.f12213a;
                Map f = f.f(bArr, yVar.d, yVar.k);
                if (f != null) {
                    this.f12213a.q = "network";
                } else if (!TextUtils.isEmpty(this.f12213a.e)) {
                    f = f.h(this.f12213a);
                }
                f.a(this.f12213a, f, this.b);
            } else if (!TextUtils.isEmpty(this.f12213a.e)) {
                f.a(this.f12213a, f.h(this.f12213a), this.b);
            } else {
                f.a(this.f12213a, null, this.b);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.ac.a.c
        public void onFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8bb1183", new Object[]{this});
            } else {
                a(null);
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.flexbox.layoutmanager.core.f$f  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class RunnableC0692f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o.y f12214a;
        public final /* synthetic */ g b;
        public final /* synthetic */ Map c;

        public RunnableC0692f(o.y yVar, g gVar, Map map) {
            this.f12214a = yVar;
            this.b = gVar;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            tfs.g("DSL", "notifyDSLLoadFinish, url:" + this.f12214a.d + ", source:" + this.f12214a.q);
            this.b.a(this.c, this.f12214a.q);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface g {
        void a(Map map, String str);
    }

    static {
        t2o.a(503317031);
    }

    public static /* synthetic */ void a(o.y yVar, Map map, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b08c972", new Object[]{yVar, map, gVar});
        } else {
            p(yVar, map, gVar);
        }
    }

    public static /* synthetic */ void b(o oVar, o.y yVar, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b855c756", new Object[]{oVar, yVar, gVar});
        } else {
            d(oVar, yVar, gVar);
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32fa788a", new Object[0]);
            return;
        }
        LruCache<String, Map> lruCache = f12208a;
        synchronized (lruCache) {
            lruCache.evictAll();
        }
    }

    public static void d(o oVar, o.y yVar, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e694aaba", new Object[]{oVar, yVar, gVar});
        } else {
            com.taobao.tao.flexbox.layoutmanager.ac.a.d().c(yVar.d, !oVar.t0(yVar), new e(yVar, gVar));
        }
    }

    public static Object e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("45b29fce", new Object[]{str});
        }
        IStorage z = od0.D().z();
        Object e2 = z.e(IStorage.TYPE_DSL, str);
        if (e2 == null && (e2 = z.a(str)) != null) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new b(z, str, e2));
        }
        return e2;
    }

    public static Map f(byte[] bArr, String str, boolean z) {
        Map map;
        Exception e2;
        Map map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("14a2000b", new Object[]{bArr, str, new Boolean(z)});
        }
        Map map3 = null;
        if (str == null) {
            return null;
        }
        String l = nwv.l(nwv.u0(str));
        LruCache<String, Map> lruCache = f12208a;
        synchronized (lruCache) {
            map = lruCache.get(l);
        }
        if (map != null || bArr == null || bArr.length <= 0) {
            return map;
        }
        try {
            igs.a("parseDSL:" + l);
            map2 = (Map) com.taobao.tao.flexbox.layoutmanager.core.g.b(bArr);
        } catch (Exception e3) {
            e2 = e3;
        }
        try {
            igs.c();
            if (map2 != null && !map2.isEmpty()) {
                if (o(l, z)) {
                    synchronized (lruCache) {
                        lruCache.put(l, map2);
                    }
                }
                map3 = map2;
            }
            return map3;
        } catch (Exception e4) {
            e2 = e4;
            map = map2;
            tfs.e("TNode", "" + l + " is invalid json " + e2.getMessage());
            return map;
        }
    }

    public static String g(o.y yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bca1bc", new Object[]{yVar});
        }
        if (!TextUtils.isEmpty(yVar.e)) {
            return yVar.e + yVar.t;
        }
        lgs.b bVar = yVar.v;
        if (bVar == null || TextUtils.isEmpty(bVar.i) || !akt.W0()) {
            return null;
        }
        return yVar.v.i;
    }

    public static Map h(o.y yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e82793d", new Object[]{yVar});
        }
        Map f = f(null, yVar.e, yVar.k);
        if (f == null) {
            f = f(nwv.e0(yVar.e, yVar.f12269a), yVar.e, yVar.k);
            if (f != null) {
                yVar.q = "local";
            }
        } else {
            yVar.q = "cache";
        }
        return f;
    }

    public static boolean j(o.y yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cf4d7dc", new Object[]{yVar})).booleanValue();
        }
        if (k(yVar.d)) {
            return false;
        }
        int i = yVar.s;
        if (i == -1) {
            Map map = yVar.j;
            if (map != null) {
                return nwv.o(map.get(o.LAYOUT_STRATEGY_KEY), false);
            }
            return false;
        } else if (i == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b688cf16", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (str.endsWith("/tnode") || str.endsWith("/tnodeb")) {
            return true;
        }
        return false;
    }

    public static void l(o oVar, o.y yVar, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd7789c", new Object[]{oVar, yVar, gVar});
            return;
        }
        Map f = f(null, yVar.d, yVar.k);
        if (f != null) {
            yVar.q = "cache";
            p(yVar, f, gVar);
            return;
        }
        new d(yVar, gVar, oVar).run();
    }

    public static byte[] m(o.y yVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("7ec76a8a", new Object[]{yVar, new Boolean(z)});
        }
        if (TextUtils.isEmpty(yVar.d)) {
            return null;
        }
        igs.a("loadDSLFromCache");
        Object e2 = e(DSL_PREFIX + yVar.d);
        if (e2 != null && (e2 instanceof byte[])) {
            byte[] bArr = (byte[]) e2;
            if (bArr.length > 0) {
                yVar.q = DSL_TYPE_AWP;
                igs.c();
                return bArr;
            }
        }
        igs.c();
        if (!z) {
            return null;
        }
        com.taobao.tao.flexbox.layoutmanager.ac.a.d().a(yVar.d, new c(yVar));
        return n(yVar);
    }

    public static byte[] n(o.y yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("22873b35", new Object[]{yVar});
        }
        String g2 = g(yVar);
        if (TextUtils.isEmpty(g2)) {
            return null;
        }
        igs.a("loadLatestDSLFromCache");
        Object e2 = e(DSL_PREFIX + g2);
        if (e2 != null && (e2 instanceof String)) {
            Object e3 = e(DSL_PREFIX + e2);
            if (e3 != null && (e3 instanceof byte[])) {
                byte[] bArr = (byte[]) e3;
                if (bArr.length > 0) {
                    yVar.q = DSL_TYPE_LAST_AWP;
                    igs.c();
                    return bArr;
                }
            }
        }
        igs.c();
        return null;
    }

    public static boolean o(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c628485b", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        if (k(str) || !z) {
            return false;
        }
        return true;
    }

    public static void p(o.y yVar, Map map, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("263756ef", new Object[]{yVar, map, gVar});
        } else if (gVar != null) {
            nwv.z0(new RunnableC0692f(yVar, gVar, map), true);
        }
    }

    public static void r(o.y yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6776b5c", new Object[]{yVar});
            return;
        }
        IStorage z = od0.D().z();
        String g2 = g(yVar);
        if (!TextUtils.isEmpty(g2)) {
            Object e2 = z.e(IStorage.TYPE_DSL, DSL_PREFIX + g2);
            if ((e2 instanceof String) && TextUtils.equals((CharSequence) e2, yVar.d)) {
                z.h(IStorage.TYPE_DSL, DSL_PREFIX + g2);
            }
        }
        z.h(IStorage.TYPE_DSL, DSL_PREFIX + yVar.d);
    }

    public static void s(o.y yVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eed2c707", new Object[]{yVar, bArr});
        } else if (o(yVar.d, yVar.k)) {
            IStorage z = od0.D().z();
            String g2 = g(yVar);
            if (!TextUtils.isEmpty(g2)) {
                z.d(IStorage.TYPE_DSL, DSL_PREFIX + g2, yVar.d);
            }
            z.d(IStorage.TYPE_DSL, DSL_PREFIX + yVar.d, bArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f12215a;
        public Map b;
        public List c;
        public Map d;
        public String e;
        public String f;
        public Map g;
        public Map h;
        public Map i;
        public Map j;
        public Map k;
        public Map l;
        public boolean m;
        public boolean n;
        public Boolean o;

        static {
            t2o.a(503317039);
        }

        public static h a(h hVar, h hVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("e5b00593", new Object[]{hVar, hVar2});
            }
            if (hVar == null) {
                hVar = new h();
            }
            hVar.f12215a = hVar2.f12215a;
            hVar.b = hVar2.b;
            hVar.c = hVar2.c;
            hVar.d = hVar2.d;
            hVar.e = hVar2.e;
            hVar.f = hVar2.f;
            hVar.g = hVar2.g;
            hVar.h = hVar2.h;
            hVar.i = hVar2.i;
            hVar.j = hVar2.j;
            hVar.k = hVar2.k;
            hVar.l = hVar2.l;
            hVar.m = hVar2.m;
            hVar.n = hVar2.n;
            hVar.o = hVar2.o;
            return hVar;
        }

        public static h b(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("92df7d5d", new Object[]{map});
            }
            h hVar = new h();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                key.hashCode();
                char c = 65535;
                switch (key.hashCode()) {
                    case -928162171:
                        if (key.equals("bindattrs")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 115792:
                        if (key.equals("uid")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3373707:
                        if (key.equals("name")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3575610:
                        if (key.equals("type")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 90810505:
                        if (key.equals("_data")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 93152418:
                        if (key.equals("attrs")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 94742904:
                        if (key.equals("class")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1659526655:
                        if (key.equals("children")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1816696321:
                        if (key.equals("_styles")) {
                            c = '\b';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        hVar.g = (Map) value;
                        break;
                    case 1:
                        ((Integer) value).intValue();
                        break;
                    case 2:
                        hVar.e = (String) value;
                        break;
                    case 3:
                        hVar.f12215a = (String) value;
                        break;
                    case 4:
                        hVar.h = (Map) value;
                        break;
                    case 5:
                        hVar.b = (Map) value;
                        break;
                    case 6:
                        hVar.f = (String) value;
                        break;
                    case 7:
                        hVar.c = (List) value;
                        break;
                    case '\b':
                        hVar.d = (Map) value;
                        break;
                }
            }
            return hVar;
        }
    }

    public static boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b204257", new Object[]{str})).booleanValue();
        }
        String e2 = vfs.g().e("weitao_switch", BAD_DSL, "");
        if (!TextUtils.isEmpty(e2)) {
            for (String str2 : e2.split(",")) {
                if (str2.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void q(o oVar, String str, String str2, String str3, g gVar) {
        Context context;
        Uri parse;
        gol.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae30a94", new Object[]{oVar, str, str2, str3, gVar});
            return;
        }
        if (str != null && str.startsWith(gl4.CONFIG_PAGE_PREFIX)) {
            if (str.equals(gol.TAB2_VIDEO_LINK)) {
                bVar = gol.i(null, str, true);
            } else {
                bVar = gol.h(null, str, true);
            }
            if (str2 == null) {
                str2 = bVar.a();
            }
            if (str3 == null) {
                str3 = bVar.b();
            }
            str = bVar.d;
        }
        boolean z = (str == null || (parse = Uri.parse(str)) == null || !TextUtils.equals("localFirst", parse.getQueryParameter(gl4.CONFIG_POLICY))) ? false : true;
        String u0 = nwv.u0(str);
        if (oVar != null) {
            context = oVar.M();
        } else {
            context = o.J();
        }
        o.y.a aVar = new o.y.a(context);
        aVar.u(u0);
        aVar.o(str2);
        aVar.q(str3);
        aVar.j(true);
        if (z) {
            aVar.m(0);
        }
        o.y d2 = aVar.d();
        d2.m = oVar;
        Map f = f(null, d2.d, d2.k);
        if (f != null) {
            d2.q = "cache";
            if (gVar != null) {
                gVar.a(f, "cache");
                return;
            }
            return;
        }
        boolean j = j(d2);
        byte[] m = m(d2, j);
        if (m != null && m.length != 0) {
            Map f2 = f(m, d2.d, d2.k);
            if (gVar != null) {
                gVar.a(f2, d2.q);
            }
        } else if (!j || TextUtils.isEmpty(d2.e)) {
            d2.q = "network";
            com.taobao.tao.flexbox.layoutmanager.ac.a.d().c(d2.d, false, new a(d2, gVar));
        } else {
            Map h2 = h(d2);
            if (gVar != null) {
                gVar.a(h2, d2.q);
            }
        }
    }
}
