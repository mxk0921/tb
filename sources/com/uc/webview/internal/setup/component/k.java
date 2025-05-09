package com.uc.webview.internal.setup.component;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.internal.setup.component.d;
import com.uc.webview.internal.setup.component.j;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class k {
    static final /* synthetic */ boolean d = true;

    /* renamed from: a  reason: collision with root package name */
    static final Class<?> f14419a = a("com.uc.pars.api.Pars");
    static final Class<?> b = a("com.uc.pars.api.IParsObserver");
    static final int c = 6;
    private static final int[] e = {20, 60, 300, 600, 900};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ boolean f14421a = true;
        private static final Map<String, a> b = new HashMap();
        private final String c;
        private C0843a d;
        private int e = 0;
        private b f;
        private int g;

        /* compiled from: Taobao */
        /* renamed from: com.uc.webview.internal.setup.component.k$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class C0843a implements ValueCallback<g> {

            /* renamed from: a  reason: collision with root package name */
            final HashSet<b> f14422a;

            private C0843a() {
                this.f14422a = new HashSet<>();
            }

            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(g gVar) {
                a(false);
            }

            public final void a(b bVar) {
                synchronized (this.f14422a) {
                    this.f14422a.add(bVar);
                }
            }

            public /* synthetic */ C0843a(a aVar, byte b) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a(final boolean z) {
                boolean z2;
                Set<b> set;
                synchronized (this) {
                    try {
                        if (a.this.e == 1) {
                            a.this.e = 0;
                            m.a(a.this.f);
                            synchronized (this.f14422a) {
                                try {
                                    if (!this.f14422a.isEmpty()) {
                                        Set<b> set2 = (Set) this.f14422a.clone();
                                        synchronized (this) {
                                            try {
                                                z2 = false;
                                                for (b bVar : set2) {
                                                    bVar.a(a.this.g, z);
                                                    if (!z2 && bVar.a()) {
                                                        z2 = true;
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                        if (z2) {
                                            long e = a.e(a.this);
                                            y.a(e);
                                            int unused = a.this.g;
                                            com.uc.webview.base.task.c.a("U4Pars", new Runnable() { // from class: com.uc.webview.internal.setup.component.k.a.a.1
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    a.this.a("U4Pars", z);
                                                }
                                            }, null, e * 1000);
                                            return;
                                        }
                                        synchronized (this.f14422a) {
                                            set = (Set) this.f14422a.clone();
                                            this.f14422a.clear();
                                        }
                                        synchronized (this) {
                                            try {
                                                for (b bVar2 : set) {
                                                    bVar2.b();
                                                }
                                            } finally {
                                            }
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            }

            public final void a(d.h hVar) {
                synchronized (this) {
                    try {
                        Iterator<b> it = this.f14422a.iterator();
                        while (it.hasNext()) {
                            it.next().a(hVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class b implements Runnable {
            private final String b;

            public b(String str) {
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0843a aVar = a.this.d;
                synchronized (aVar.f14422a) {
                    try {
                        if (!aVar.f14422a.isEmpty()) {
                            Set<b> set = (Set) aVar.f14422a.clone();
                            synchronized (aVar) {
                                try {
                                    boolean z = false;
                                    for (b bVar : set) {
                                        if (bVar.a(a.this.g) && !z) {
                                            z = bVar.a();
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
                a.this.d.a(true);
            }

            public final String toString() {
                return this.b;
            }
        }

        private a(String str) {
            this.c = str;
        }

        public static /* synthetic */ long e(a aVar) {
            int i = aVar.g;
            int i2 = k.c;
            int i3 = i / i2;
            if (i3 >= k.e.length) {
                i3 = k.e.length - 1;
                if (aVar.g % i2 == 0) {
                    int i4 = k.e[i3];
                }
            } else if (k.b(aVar.g)) {
                int i5 = k.e[i3];
            }
            return k.e[i3];
        }

        public static a a(String str) {
            a aVar;
            Map<String, a> map = b;
            synchronized (map) {
                try {
                    aVar = map.get(str);
                    if (aVar == null) {
                        aVar = new a(str);
                        map.put(str, aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return aVar;
        }

        public final void a(String str, b bVar) {
            synchronized (a.class) {
                try {
                    if (this.d == null) {
                        this.d = new C0843a(this, (byte) 0);
                    }
                    this.d.a(bVar);
                    if (this.d.f14422a.size() == 1) {
                        a(str, false);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, boolean z) {
            synchronized (this) {
                try {
                    if (this.e == 0) {
                        this.e = 1;
                        if (this.f == null) {
                            this.f = new b(str + ".CheckUpgrade");
                        }
                        this.g++;
                        m.a(this.f, k.e[0] * 1000);
                        a(z);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private void a(boolean z) {
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(this.c)) {
                hashMap.put("target_product", this.c);
            }
            hashMap.put("browser_arch", EnvInfo.is64Bit() ? "armv8" : "armv7-a");
            hashMap.put(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, com.uc.webview.internal.setup.component.c.b);
            hashMap.put("child_ver", com.uc.webview.internal.setup.component.c.c);
            this.d.a(k.b(hashMap, this.d, z, this.g));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a(d.h hVar);

        boolean a();

        boolean a(int i);

        boolean a(int i, boolean z);

        void b();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        void a();

        void a(int i);

        void a(f fVar);

        void b(int i);

        boolean b();

        void c(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        static Method f14425a;
        static Method b;

        static {
            Class<?> cls = k.f14419a;
            f14425a = com.uc.webview.base.f.a(cls, "deleteBundleByVersions", String.class, String[].class, String[].class);
            b = com.uc.webview.base.f.a(cls, "deleteBundleInfoList", String.class);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        final Object f14426a;
        final String b;
        final String c;
        final String d;

        public e(Object obj) {
            this.f14426a = obj;
            if (obj == null) {
                this.d = "";
                this.c = "";
                this.b = "";
                return;
            }
            this.b = (String) com.uc.webview.base.f.a(obj, "getName");
            this.c = (String) com.uc.webview.base.f.a(obj, "getPath");
            this.d = (String) com.uc.webview.base.f.a(obj, "getBundleUrl");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (com.uc.webview.internal.setup.component.d.f14396a) {
                sb.append(this.b);
                sb.append(": {path: ");
                sb.append(this.c);
                sb.append(", url: ");
                sb.append(this.d);
                sb.append('}');
            } else {
                sb.append(this.b);
                if (!TextUtils.isEmpty(this.c)) {
                    sb.append((char) 8595);
                }
                if (!TextUtils.isEmpty(this.d)) {
                    sb.append('@');
                }
            }
            return sb.toString();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        private final List<e> f14428a;

        public g(Object obj) {
            this.f14428a = a(obj);
        }

        private static List<e> a(Object obj) {
            if (obj == null) {
                return new ArrayList();
            }
            try {
                List list = (List) com.uc.webview.base.f.b(obj, "getPackageInfo");
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 != null) {
                            arrayList.add(new e(obj2));
                        }
                    }
                    return arrayList;
                }
            } catch (Exception e) {
                h.a(5, "U4Pars", "getPackageInfo exception", e);
            }
            return new ArrayList();
        }

        public final String toString() {
            return y.a(this.f14428a);
        }
    }

    public static void b(p pVar) {
        try {
            if (!TextUtils.isEmpty(pVar.f)) {
                d.f14425a.invoke(null, pVar.f, null, null);
                d.b.invoke(null, pVar.f);
            }
        } catch (Throwable unused) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        final String f14427a;
        final String b;
        final String c;

        public f(Object obj) throws Exception {
            this.f14427a = a(obj, "getPath");
            String[] a2 = a(a(obj, "getRawHeader"));
            this.b = a2[0];
            this.c = a2[1];
        }

        private static String a(Object obj, String str) throws Exception {
            Object b = com.uc.webview.base.f.b(obj, str);
            return b instanceof String ? (String) b : "";
        }

        public final String toString() {
            String str;
            if (!com.uc.webview.internal.setup.component.d.f14396a) {
                return this.b;
            }
            StringBuilder sb = new StringBuilder("{fname: ");
            sb.append(this.b);
            if (!TextUtils.isEmpty(this.c)) {
                str = ", rseq: " + this.c;
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(", fpath: ");
            sb.append(this.f14427a);
            sb.append("}");
            return sb.toString();
        }

        private static String[] a(Object obj) {
            String str;
            String str2 = "";
            if (obj instanceof String) {
                String[] split = ((String) obj).split("\r\n");
                if (split.length != 0) {
                    str = str2;
                    for (String str3 : split) {
                        if (str3.startsWith("x-pars-fname:")) {
                            str2 = str3.substring(13).trim();
                        } else if (str3.startsWith("x-version:")) {
                            str = y.b(str3.substring(10).trim())[1];
                        }
                    }
                    return new String[]{str2, str};
                }
            }
            str = str2;
            return new String[]{str2, str};
        }
    }

    public static Class<?> a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a(p pVar) {
        try {
            if (!TextUtils.isEmpty(pVar.f)) {
                d.f14425a.invoke(null, pVar.f, null, null);
            }
        } catch (Throwable unused) {
        }
    }

    public static f b(String str) {
        try {
            Object a2 = com.uc.webview.base.f.a(f14419a, "getResource", new Class[]{String.class}, new Object[]{str});
            if (a2 != null) {
                return new f(a2);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Map<String, e> a() {
        try {
            Object a2 = com.uc.webview.base.f.a(f14419a, "getAllLoadedBundleInfos", new Class[0], new Object[0]);
            if (a2 instanceof Map) {
                Map map = (Map) a2;
                HashMap hashMap = new HashMap();
                for (String str : map.keySet()) {
                    hashMap.put(str, new e(map.get(str)));
                }
                return hashMap;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.h b(Map<String, String> map, final ValueCallback<g> valueCallback, boolean z, int i) {
        ValueCallback<Object> valueCallback2;
        d.h hVar;
        p[] pVarArr;
        if (f14419a == null) {
            return new d.C0841d("ParsCls not found", -1);
        }
        if (valueCallback == null) {
            valueCallback2 = null;
        } else {
            try {
                valueCallback2 = new ValueCallback<Object>() { // from class: com.uc.webview.internal.setup.component.k.1
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        valueCallback.onReceiveValue(new g(obj));
                    }
                };
            } catch (Throwable th) {
                hVar = new d.C0841d(th.toString(), -2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (p pVar : q.f14437a) {
            if (pVar != null && pVar.d == 1 && pVar.e == 1) {
                arrayList.add(pVar.f);
            }
        }
        List<String> a2 = n.a(arrayList);
        com.uc.webview.base.f.a(f14419a, "checkUpgrade", new Class[]{Map.class, List.class, ValueCallback.class}, new Object[]{map, a2, valueCallback2});
        hVar = new d.c(a2, map, z, i);
        return hVar;
    }

    public static void a(p pVar, com.uc.webview.internal.setup.component.f fVar, c cVar) {
        if (d || !b()) {
            j.a(pVar, fVar, cVar);
            return;
        }
        throw new AssertionError();
    }

    public static boolean a(int i) {
        int i2 = c;
        return i % i2 == 0 && i / i2 == 1;
    }

    public static boolean b() {
        return f14419a == null || b == null || j.a.a();
    }

    public static /* synthetic */ boolean b(int i) {
        int i2 = c;
        return i % i2 == 0 && i / i2 < e.length - 1;
    }
}
