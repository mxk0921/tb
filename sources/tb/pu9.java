package tb;

import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.widget.FontDO;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.gpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pu9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Handler c = new Handler(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Set<WeakReference<f>>> f26309a;
    public final Map<String, FontDO> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements gpc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26310a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(String str, String str2, String str3) {
            this.f26310a = str;
            this.b = str2;
            this.c = str3;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[Catch: all -> 0x0029, TryCatch #0 {, blocks: (B:8:0x001a, B:10:0x0022, B:12:0x002b, B:18:0x0045, B:20:0x0049, B:22:0x0055, B:23:0x0060, B:25:0x0066, B:27:0x006d, B:29:0x007d, B:30:0x0081), top: B:34:0x001a, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[Catch: all -> 0x0029, TryCatch #0 {, blocks: (B:8:0x001a, B:10:0x0022, B:12:0x002b, B:18:0x0045, B:20:0x0049, B:22:0x0055, B:23:0x0060, B:25:0x0066, B:27:0x006d, B:29:0x007d, B:30:0x0081), top: B:34:0x001a, inners: #1 }] */
        @Override // tb.gpc.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(tb.dxh r6) {
            /*
                r5 = this;
                r0 = 1
                r1 = 0
                java.lang.String r2 = "IWXHttpAdapter onHttpFinish statusCode:"
                com.android.alibaba.ip.runtime.IpChange r3 = tb.pu9.a.$ipChange
                boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r4 == 0) goto L_0x0017
                java.lang.String r2 = "ebddd68c"
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r4[r1] = r5
                r4[r0] = r6
                r3.ipc$dispatch(r2, r4)
                return
            L_0x0017:
                tb.pu9 r3 = tb.pu9.this
                monitor-enter(r3)
                java.lang.String r4 = r6.f18133a     // Catch: all -> 0x0029
                boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: all -> 0x0029
                if (r4 != 0) goto L_0x003c
                java.lang.String r4 = r6.f18133a     // Catch: all -> 0x0029, NumberFormatException -> 0x002b
                int r2 = java.lang.Integer.parseInt(r4)     // Catch: all -> 0x0029, NumberFormatException -> 0x002b
                goto L_0x003d
            L_0x0029:
                r6 = move-exception
                goto L_0x0083
            L_0x002b:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: all -> 0x0029
                r4.<init>(r2)     // Catch: all -> 0x0029
                java.lang.String r2 = r6.f18133a     // Catch: all -> 0x0029
                r4.append(r2)     // Catch: all -> 0x0029
                java.lang.String r2 = r4.toString()     // Catch: all -> 0x0029
                tb.dwh.e(r2)     // Catch: all -> 0x0029
            L_0x003c:
                r2 = 0
            L_0x003d:
                r4 = 200(0xc8, float:2.8E-43)
                if (r2 < r4) goto L_0x006b
                r4 = 299(0x12b, float:4.19E-43)
                if (r2 > r4) goto L_0x006b
                byte[] r6 = r6.b     // Catch: all -> 0x0029
                if (r6 == 0) goto L_0x006b
                java.lang.String r1 = r5.b     // Catch: all -> 0x0029
                android.app.Application r2 = tb.vvh.c()     // Catch: all -> 0x0029
                boolean r1 = tb.xvh.d(r1, r6, r2)     // Catch: all -> 0x0029
                if (r1 == 0) goto L_0x0060
                tb.pu9 r6 = tb.pu9.this     // Catch: all -> 0x0029
                java.lang.String r1 = r5.b     // Catch: all -> 0x0029
                java.lang.String r2 = r5.c     // Catch: all -> 0x0029
                boolean r1 = tb.pu9.a(r6, r1, r2, r0)     // Catch: all -> 0x0029
                goto L_0x006b
            L_0x0060:
                boolean r6 = tb.dwh.r()     // Catch: all -> 0x0029
                if (r6 == 0) goto L_0x006b
                java.lang.String r6 = "downloadFontByNetwork() onHttpFinish success, but save file failed."
                tb.dwh.v(r6)     // Catch: all -> 0x0029
            L_0x006b:
                if (r1 != 0) goto L_0x0081
                tb.pu9 r6 = tb.pu9.this     // Catch: all -> 0x0029
                java.util.Map r6 = tb.pu9.b(r6)     // Catch: all -> 0x0029
                java.lang.String r0 = r5.c     // Catch: all -> 0x0029
                java.lang.Object r6 = r6.get(r0)     // Catch: all -> 0x0029
                com.taobao.android.weex_framework.widget.FontDO r6 = (com.taobao.android.weex_framework.widget.FontDO) r6     // Catch: all -> 0x0029
                if (r6 == 0) goto L_0x0081
                r0 = 3
                r6.h(r0)     // Catch: all -> 0x0029
            L_0x0081:
                monitor-exit(r3)     // Catch: all -> 0x0029
                return
            L_0x0083:
                monitor-exit(r3)     // Catch: all -> 0x0029
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.pu9.a.a(tb.dxh):void");
        }

        @Override // tb.gpc.a
        public void onHeadersReceived(int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6683fc51", new Object[]{this, new Integer(i), map});
            }
        }

        @Override // tb.gpc.a
        public void onHttpResponseProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c1a5c7", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.gpc.a
        public void onHttpStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5005ca2", new Object[]{this});
            } else if (dwh.r()) {
                dwh.o("downloadFontByNetwork begin url:" + this.f26310a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ FontDO d;

        public b(FontDO fontDO) {
            this.d = fontDO;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/widget/FontManager$2");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            Set set = (Set) pu9.c(pu9.this).get(this.d.b());
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    f fVar = (f) ((WeakReference) it.next()).get();
                    if (fVar == null) {
                        it.remove();
                    } else {
                        fVar.a(this.d);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;
        public final /* synthetic */ f e;

        public c(String str, f fVar) {
            this.d = str;
            this.e = fVar;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/widget/FontManager$3");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            Set set = (Set) pu9.c(pu9.this).get(this.d);
            if (set == null) {
                set = new HashSet();
                pu9.c(pu9.this).put(this.d, set);
            }
            set.add(new WeakReference(this.e));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;
        public final /* synthetic */ f e;

        public d(String str, f fVar) {
            this.d = str;
            this.e = fVar;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/widget/FontManager$4");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            Set set = (Set) pu9.c(pu9.this).get(this.d);
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    f fVar = (f) ((WeakReference) it.next()).get();
                    if (fVar == null || fVar == this.e) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final pu9 f26311a = new pu9(null);

        static {
            t2o.a(982516287);
        }

        public static /* synthetic */ pu9 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (pu9) ipChange.ipc$dispatch("69482c7e", new Object[0]);
            }
            return f26311a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface f {
        void a(FontDO fontDO);
    }

    static {
        t2o.a(982516282);
    }

    public /* synthetic */ pu9(a aVar) {
        this();
    }

    public static /* synthetic */ boolean a(pu9 pu9Var, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6d3694b", new Object[]{pu9Var, str, str2, new Boolean(z)})).booleanValue();
        }
        return pu9Var.i(str, str2, z);
    }

    public static /* synthetic */ Map b(pu9 pu9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c99ecfcf", new Object[]{pu9Var});
        }
        return pu9Var.b;
    }

    public static /* synthetic */ Map c(pu9 pu9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fd4cfa90", new Object[]{pu9Var});
        }
        return pu9Var.f26309a;
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9ed6f69", new Object[0]);
        }
        return vvh.c().getCacheDir() + "/font-family";
    }

    public static pu9 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pu9) ipChange.ipc$dispatch("54285a64", new Object[0]);
        }
        return e.a();
    }

    public static void h(FontDO fontDO, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74f36cbb", new Object[]{fontDO, str});
            return;
        }
        try {
            Typeface createFromAsset = Typeface.createFromAsset(vvh.c().getAssets(), str);
            if (createFromAsset != null) {
                if (dwh.r()) {
                    dwh.a("[FontManager] font " + fontDO.b() + " load asset file success");
                }
                fontDO.h(2);
                fontDO.i(createFromAsset);
                return;
            }
            dwh.e("[FontManager] Font " + fontDO.b() + " asset file not found " + fontDO.f());
        } catch (Exception e2) {
            dwh.i(e2);
        }
    }

    public final void d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c42d59c5", new Object[]{this, str, str2, str3});
            return;
        }
        gpc f2 = r3x.f();
        if (f2 == null) {
            dwh.e("downloadFontByNetwork() IMUSHttpAdapter == null");
            return;
        }
        bxh bxhVar = new bxh();
        bxhVar.c = str;
        bxhVar.d = "GET";
        f2.a(bxhVar, new a(str, str2, str3));
    }

    public synchronized FontDO e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FontDO) ipChange.ipc$dispatch("3e056fbe", new Object[]{this, str});
        }
        return (FontDO) ((HashMap) this.b).get(str);
    }

    public synchronized void j(FontDO fontDO, boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c9aac80", new Object[]{this, fontDO, new Boolean(z)});
            return;
        }
        epc h = r3x.h();
        if (fontDO == null || h == null || !h.a(fontDO.b())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (fontDO != null && fontDO.e() == null && (fontDO.c() == 3 || fontDO.c() == 0 || z2)) {
            fontDO.h(1);
            if (z2) {
                Typeface b2 = h.b(fontDO.b());
                if (b2 != null) {
                    fontDO.i(b2);
                    fontDO.h(2);
                    if (z) {
                        k(fontDO);
                    }
                }
            } else if (fontDO.d() == 3) {
                h(fontDO, Uri.parse(fontDO.f()).getPath().substring(1));
            } else if (fontDO.d() == 1) {
                String f2 = fontDO.f();
                String b3 = fontDO.b();
                String a2 = xvh.a(f2);
                File file = new File(f());
                if (!file.exists()) {
                    file.mkdirs();
                }
                String str = file.getAbsolutePath() + File.separator + a2;
                if (!i(str, b3, false)) {
                    d(f2, str, b3);
                }
            } else if ((fontDO.d() == 2 || fontDO.d() == 5) && !i(fontDO.f(), fontDO.b(), false)) {
                fontDO.h(3);
            }
            return;
        }
        if (z) {
            k(fontDO);
        }
    }

    public final void k(FontDO fontDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc26da80", new Object[]{this, fontDO});
        } else {
            c.post(new b(fontDO));
        }
    }

    public synchronized void l(FontDO fontDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db782313", new Object[]{this, fontDO});
        } else {
            ((HashMap) this.b).put(fontDO.b(), fontDO);
        }
    }

    public void m(String str, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44bb4561", new Object[]{this, str, fVar});
            return;
        }
        c cVar = new c(str, fVar);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            cVar.run();
        } else {
            c.post(cVar);
        }
    }

    public void n(String str, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("544a7da8", new Object[]{this, str, fVar});
            return;
        }
        d dVar = new d(str, fVar);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            dVar.run();
        } else {
            c.post(dVar);
        }
    }

    public pu9() {
        this.f26309a = new HashMap();
        this.b = new HashMap();
    }

    public final boolean i(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d60aa6d", new Object[]{this, str, str2, new Boolean(z)})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                if (!new File(str).exists()) {
                    return false;
                }
                Typeface createFromFile = Typeface.createFromFile(str);
                if (createFromFile != null) {
                    FontDO fontDO = (FontDO) ((HashMap) this.b).get(str2);
                    if (fontDO != null) {
                        fontDO.h(2);
                        fontDO.i(createFromFile);
                        fontDO.g(str);
                        if (dwh.r()) {
                            dwh.o("[FontManager] font " + str2 + "load local font file success");
                        }
                        k(fontDO);
                        return true;
                    }
                } else {
                    dwh.e("[FontManager] load local font file failed, can't create font.");
                }
            } catch (Exception e2) {
                dwh.i(e2);
            }
        }
        return false;
    }
}
