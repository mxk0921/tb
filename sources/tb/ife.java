package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.content.res.ResourcesCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.navigationextern.NavigationExternSwitch;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.navigation.NavigationTabIconSourceType;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ife {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final zt2 f21284a;
    public Context b;
    public final Map<String, xpj> c;
    public final Map<String, com.taobao.tao.navigation.b> d;
    public final Map<String, List<xpj>> e;
    public Map<String, e> f;
    public String g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
            String g = iof.g(ife.a(ife.this));
            boolean d = ife.b(ife.this).d(g);
            jhj.b("IconCache", "cache is successful? " + d + "; cached contents: " + g);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String f = iof.f(ife.c(ife.this));
            boolean c = ife.b(ife.this).c(f);
            jhj.b("IconCache", "cache is successful? " + c + "; cached contents: " + f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Drawable f21287a;
        public final /* synthetic */ String b;

        public c(Drawable drawable, String str) {
            this.f21287a = drawable;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Drawable drawable = this.f21287a;
            if (!(drawable instanceof BitmapDrawable)) {
                jhj.b("IconCache", " saveDrawableFileCache failed.drawable is not instanceof BitmapDrawable");
                return;
            }
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            String d = ife.d(ife.this, this.b);
            if (d == null) {
                jhj.b("IconCache", " saveDrawableFileCache failed. path is null");
                return;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(d);
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
                long allocationByteCount = bitmap.getAllocationByteCount() / 1024;
                if (allocationByteCount > NavigationExternSwitch.f()) {
                    jhj.b("IconCache", " saveDrawableFileCache failed.drawable is too large. fileName: " + this.b + " size: " + allocationByteCount + "KB");
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.b);
                    sb.append(" size: ");
                    sb.append(allocationByteCount);
                    rpj.a("CACHE_ICON_SIZE", sb.toString());
                }
            } catch (Exception e) {
                jhj.b("IconCache", "Error! Img save failed." + e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ife f21288a = new ife(null);

        public static /* synthetic */ ife a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ife) ipChange.ipc$dispatch("8c3bf88e", new Object[0]);
            }
            return f21288a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f21289a;
        public Drawable b;
    }

    public /* synthetic */ ife(a aVar) {
        this();
    }

    public static /* synthetic */ Map a(ife ifeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d88c6c2", new Object[]{ifeVar});
        }
        return ifeVar.e;
    }

    public static /* synthetic */ zt2 b(ife ifeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zt2) ipChange.ipc$dispatch("fad84259", new Object[]{ifeVar});
        }
        return ifeVar.f21284a;
    }

    public static /* synthetic */ Map c(ife ifeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3f8b6a00", new Object[]{ifeVar});
        }
        return ifeVar.c;
    }

    public static /* synthetic */ String d(ife ifeVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c66094ec", new Object[]{ifeVar, str});
        }
        return ifeVar.j(str);
    }

    public static boolean h(xpj xpjVar, List<xpj> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e2cf5de", new Object[]{xpjVar, list})).booleanValue();
        }
        if (list == null || xpjVar == null) {
            return false;
        }
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        for (xpj xpjVar2 : list) {
            if (xpjVar.C() != xpjVar2.C() || xpjVar.D() != xpjVar2.D()) {
                int C = xpjVar.C() & xpjVar2.C();
                if (C != 0) {
                    xpjVar2.X((xpjVar.C() & C) ^ xpjVar2.C());
                    z = true;
                    z2 = true;
                }
                int D = xpjVar.D() & xpjVar2.D();
                if (D != 0) {
                    xpjVar2.Y((xpjVar.D() & D) ^ xpjVar2.D());
                    z = true;
                    z2 = true;
                }
                i++;
            } else if (iof.j(xpjVar, xpjVar2)) {
                return false;
            } else {
                list.set(i, xpjVar);
                i++;
                z2 = true;
            }
        }
        if (z) {
            list.add(xpjVar);
        }
        return z2;
    }

    public static ife s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ife) ipChange.ipc$dispatch("4a3938e8", new Object[0]);
        }
        return d.a();
    }

    public void A(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe528d1f", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (!((ConcurrentHashMap) this.d).isEmpty()) {
            String p = p(str, i, i2);
            if (((ConcurrentHashMap) this.d).containsKey(p)) {
                com.taobao.tao.navigation.b bVar = (com.taobao.tao.navigation.b) ((ConcurrentHashMap) this.d).get(p);
                com.taobao.tao.navigation.a.s0(bVar.m(), bVar);
                ((ConcurrentHashMap) this.d).remove(p(bVar.e(), i, i2));
            }
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faa5c03d", new Object[]{this});
        } else {
            Coordinator.execute(new b());
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffdf1f55", new Object[]{this});
        } else {
            Coordinator.execute(new a());
        }
    }

    public final void D(Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f8a9e0", new Object[]{this, drawable, str});
        } else {
            Coordinator.execute(new c(drawable, str));
        }
    }

    public final void e(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d2ece68", new Object[]{this, str, new Integer(i), new Integer(i2)});
            return;
        }
        int a2 = xe2.a(str);
        if (a2 == -1) {
            jhj.b("IconCache", "cache navigation tab failed. index is -1");
            return;
        }
        com.taobao.tao.navigation.b m = com.taobao.tao.navigation.a.m(a2);
        if (m == null) {
            jhj.b("IconCache", "cache navigation tab failed. tab is null");
        } else {
            ((ConcurrentHashMap) this.d).put(p(str, i, i2), m);
        }
    }

    public void g(int i, com.taobao.tao.navigation.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3126dde", new Object[]{this, new Integer(i), bVar});
        } else if (bVar == null) {
            jhj.b("IconCache", "cache navigation tab failed. tab is null");
        } else {
            xpj b2 = iof.b(bVar);
            if (iof.j(b2, (xpj) ((ConcurrentHashMap) this.c).get(String.valueOf(i)))) {
                jhj.b("IconCache", "cache navigation tab cancel. tab config is the same");
            } else if (b2 == null || b2.N() != NavigationTabIconSourceType.DRAWABLE.ordinal()) {
                jhj.b("IconCache", "cache navigation tab failed. newTabConfig is null");
            } else {
                ((ConcurrentHashMap) this.c).put(String.valueOf(i), b2);
                e r = r(String.valueOf(i));
                r.f21289a = q(((Integer) b2.L()).intValue());
                r.b = q(((Integer) b2.O()).intValue());
                D(r.f21289a, b2.M());
                D(r.b, b2.P());
                B();
                jhj.b("IconCache", "start cache " + ((ConcurrentHashMap) this.c).get(String.valueOf(i)));
            }
        }
    }

    public final void i(xpj xpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d150fe82", new Object[]{this, xpjVar});
        } else if (xpjVar == null) {
            jhj.b("IconCache", "deleteDrawableFileCache failed; tab config is null");
        } else {
            String j = j(xpjVar.M());
            String j2 = j(xpjVar.P());
            if (j == null || j2 == null) {
                jhj.b("IconCache", "deleteDrawableFileCache failed; DrawablePath is null");
                return;
            }
            File file = new File(j);
            File file2 = new File(j2);
            file.deleteOnExit();
            file2.deleteOnExit();
            jhj.b("IconCache", "deleteDrawableFileCache; selectedDrawablePath:".concat(j));
        }
    }

    public final String j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa86a4fe", new Object[]{this, str});
        }
        if (this.b == null) {
            return null;
        }
        if (this.g == null) {
            File filesDir = this.b.getFilesDir();
            File file = new File(filesDir, File.separator + "navigation/icon");
            if (!file.exists()) {
                file.mkdirs();
            }
            this.g = file.getAbsolutePath();
        }
        return this.g + File.separator + str + ".png";
    }

    public xpj k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpj) ipChange.ipc$dispatch("4b54a0d5", new Object[]{this, new Integer(i)});
        }
        return (xpj) ((ConcurrentHashMap) this.c).get(String.valueOf(i));
    }

    public final e l(xpj xpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("1d3798b1", new Object[]{this, xpjVar});
        }
        if (xpjVar != null) {
            return m(String.valueOf(xpjVar.S()), xpjVar.M(), xpjVar.P());
        }
        jhj.b("IconCache", "getCachedTabDrawable failed. tab config is null");
        return null;
    }

    public final e m(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("b6f3eef5", new Object[]{this, str, str2, str3});
        }
        e r = r(str);
        if (r.f21289a != null) {
            return r;
        }
        String j = j(str2);
        String j2 = j(str3);
        if (j == null || j2 == null) {
            jhj.b("IconCache", "getCachedTabDrawable failed. DrawablePath is null. key:" + str);
            return null;
        }
        Drawable createFromPath = Drawable.createFromPath(j);
        if (createFromPath == null) {
            jhj.b("IconCache", "getCachedTabDrawable failed. selected is null. key:" + str);
            return null;
        }
        Drawable createFromPath2 = Drawable.createFromPath(j2);
        if (createFromPath2 == null) {
            jhj.b("IconCache", "getCachedTabDrawable failed. unselected is null. key:" + str);
            return null;
        }
        e r2 = r(str);
        r2.b = createFromPath2;
        r2.f21289a = createFromPath;
        return r2;
    }

    public e n(xpj xpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("d2f971ad", new Object[]{this, xpjVar});
        }
        if (xpjVar == null) {
            jhj.b("IconCache", "getCachedTabDrawable failed. tab config is null");
            return null;
        }
        String K = xpjVar.K();
        return m(K, K + xpjVar.M(), K + xpjVar.P());
    }

    public List<xpj> o(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a82fd6cb", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        ArrayList arrayList = new ArrayList();
        for (List<xpj> list : ((ConcurrentHashMap) this.e).values()) {
            for (xpj xpjVar : list) {
                if (xpjVar.W(i, i2)) {
                    if (!t(xpjVar, i, i2)) {
                        e(xpjVar.E(), i, i2);
                    }
                    arrayList.add(xpjVar);
                }
            }
        }
        return arrayList;
    }

    public final String p(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14d84d3a", new Object[]{this, str, new Integer(i), new Integer(i2)});
        }
        return str + "_" + i + "_" + i2;
    }

    public final Drawable q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("843a7558", new Object[]{this, new Integer(i)});
        }
        Context context = this.b;
        if (context == null) {
            jhj.b("IconCache", " saveDrawableFileCache failed. mContext is null");
            return null;
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) ResourcesCompat.getDrawable(context.getResources(), i, null);
        if (bitmapDrawable == null) {
            jhj.b("IconCache", " saveDrawableFileCache failed. drawable is null");
        }
        return bitmapDrawable;
    }

    public final e r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("32093607", new Object[]{this, str});
        }
        if (this.f == null) {
            this.f = new ConcurrentHashMap(1);
        }
        e eVar = this.f.get(str);
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.f.put(str, eVar2);
        return eVar2;
    }

    public final boolean t(xpj xpjVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a355953", new Object[]{this, xpjVar, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return ((ConcurrentHashMap) this.d).containsKey(p(xpjVar.E(), i, i2));
    }

    public void u(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.b = context;
        v();
        w();
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d94177", new Object[]{this});
            return;
        }
        ((ConcurrentHashMap) this.c).clear();
        Map<String, xpj> a2 = this.f21284a.a();
        if (a2 != null) {
            ((ConcurrentHashMap) this.c).putAll(a2);
            for (String str : ((ConcurrentHashMap) this.c).keySet()) {
                l((xpj) ((ConcurrentHashMap) this.c).get(str));
            }
            jhj.b("IconCache", "cached tab size:" + ((ConcurrentHashMap) this.c).size());
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bed6d9a9", new Object[]{this});
            return;
        }
        ((ConcurrentHashMap) this.e).clear();
        Map<String, List<xpj>> b2 = this.f21284a.b();
        if (b2 != null) {
            ((ConcurrentHashMap) this.e).putAll(b2);
            for (String str : ((ConcurrentHashMap) this.e).keySet()) {
                List<xpj> list = (List) ((ConcurrentHashMap) this.e).get(str);
                if (list != null && !list.isEmpty()) {
                    for (xpj xpjVar : list) {
                        l(xpjVar);
                    }
                }
            }
        }
    }

    public boolean x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbd091f9", new Object[]{this, str})).booleanValue();
        }
        Map<String, List<xpj>> map = this.e;
        if (map == null || ((ConcurrentHashMap) map).get(str) == null || ((List) ((ConcurrentHashMap) this.e).get(str)).isEmpty()) {
            return true;
        }
        return false;
    }

    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed6d6dc4", new Object[]{this, str});
            return;
        }
        i((xpj) ((ConcurrentHashMap) this.c).get(str));
        ((ConcurrentHashMap) this.c).remove(str);
        B();
    }

    public void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ef8110", new Object[]{this, str});
            return;
        }
        for (xpj xpjVar : (List) ((ConcurrentHashMap) this.e).get(str)) {
            i(xpjVar);
            ((ConcurrentHashMap) this.f).remove(xpjVar.K());
        }
        ((ConcurrentHashMap) this.e).remove(str);
        C();
    }

    public ife() {
        this.f21284a = new zt2();
        this.c = new ConcurrentHashMap(1);
        this.d = new ConcurrentHashMap(1);
        this.e = new ConcurrentHashMap(1);
    }

    public int f(String str, tqs tqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d42696f", new Object[]{this, str, tqsVar})).intValue();
        }
        int a2 = xe2.a(str);
        if (a2 == -1) {
            jhj.b("IconCache", "cache navigation tab failed. index is -1");
            return 8;
        }
        com.taobao.tao.navigation.b m = com.taobao.tao.navigation.a.m(a2);
        if (m == null) {
            jhj.b("IconCache", "cache navigation tab failed. newTab is null");
            return 4;
        }
        m.Y(tqsVar.o());
        m.J(tqsVar.n());
        m.D(str);
        m.L(NavigationTabIconSourceType.DRAWABLE);
        xpj c2 = iof.c(m, tqsVar);
        if (c2 == null) {
            jhj.b("IconCache", "cache navigation tab failed. newTabConfig is null");
            return 8;
        }
        List list = (List) ((ConcurrentHashMap) this.e).get(str);
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(c2);
            ((ConcurrentHashMap) this.e).put(str, arrayList);
        } else if (!h(c2, list)) {
            jhj.a("IconCache", "compareAndUpdateTabConfigWithVersion failed. for no config changed");
            return -1;
        }
        e r = r(c2.K());
        r.f21289a = (Drawable) tqsVar.n().second;
        r.b = (Drawable) tqsVar.n().first;
        Drawable drawable = r.f21289a;
        D(drawable, c2.K() + c2.M());
        Drawable drawable2 = r.b;
        D(drawable2, c2.K() + c2.P());
        C();
        jhj.a("IconCache", "start cache to storage. newTabConfig: " + c2);
        return 1;
    }
}
