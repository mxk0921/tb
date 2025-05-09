package tb;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.alibaba.android.split.SplitFileInfo;
import com.alibaba.android.split.core.internal.ObjectInvoker;
import com.alibaba.android.split.core.internal.SplitApkChecker;
import com.alibaba.android.split.core.internal.SplitLoadException;
import com.alibaba.android.split.core.internal.SplitLoaderInternal;
import com.alibaba.android.split.core.splitcompat.FlexaResources;
import com.alibaba.android.split.core.splitcompat.Reflector;
import com.alibaba.android.split.core.splitinstall.SplitInstallException;
import com.alibaba.android.split.core.splitinstall.SplitLoaderHolder;
import com.alibaba.android.split.manager.IPluginContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class acq implements hdq, cad, t5c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_NAME = "com_taobao_plugin";
    public static final AtomicReference<acq> o = new AtomicReference<>(null);
    public static final Map<Pair<String, String>, b> p = new HashMap();
    public volatile boolean d;
    public String f;
    public final com.alibaba.android.split.manager.a g;
    public final jcq i;
    public final Context j;
    public final jvc l;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Integer> f15663a = new ConcurrentHashMap();
    public final wnc b = (wnc) d62.b(wnc.class, "SplitCompat");
    public j49 c = null;
    public volatile boolean e = true;
    public volatile boolean h = true;
    public final ArrayList<WeakReference<Resources>> k = new ArrayList<>();
    public final Set<String> m = new HashSet();
    public final Set<String> n = new HashSet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ File f15664a;
        public final /* synthetic */ String b;

        public a(File file, String str) {
            this.f15664a = file;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            File file = this.f15664a;
            if (file != null && file.exists() && !acq.k(acq.this, this.b, this.f15664a)) {
                this.f15664a.delete();
                o49.b().c().b(this.b, 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b {
        void a();
    }

    static {
        t2o.a(677380222);
        t2o.a(676331558);
        t2o.a(676331635);
        t2o.a(676331538);
    }

    public acq(Context context) {
        this.l = null;
        this.j = context;
        this.l = (jvc) d62.a(jvc.class, new Object[0]);
        try {
            if (dh8.a()) {
                this.i = new jcq(context);
            } else if (dh8.a() || !new jcq(context).r(PLUGIN_NAME)) {
                this.i = new jcq(context, false);
            } else {
                this.i = new jcq(context);
            }
            this.g = b9m.a(this.i.n());
            bcq.c(this);
        } catch (Exception e) {
            throw new SplitLoadException("Failed to initialize FileStorage", e);
        }
    }

    public static boolean A(Context context, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40bccdfd", new Object[]{context, strArr})).booleanValue();
        }
        acq acqVar = new acq(context);
        AtomicReference<acq> atomicReference = o;
        boolean a2 = sng.a(atomicReference, null, acqVar);
        if (!a2) {
            Log.e("SplitCompat", "SplitCompat instance has be set !");
            acqVar = atomicReference.get();
        }
        if (a2) {
            acqVar.y();
        }
        return m(context, false, strArr);
    }

    public static boolean C(Context context, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("600b86fd", new Object[]{context, strArr})).booleanValue();
        }
        return m(context, true, strArr);
    }

    public static boolean F(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("362d094a", new Object[]{context})).booleanValue();
        }
        return tym.a(context).endsWith(":channel");
    }

    public static boolean G(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47c0377e", new Object[]{context})).booleanValue();
        }
        return tym.a(context).equals(context.getPackageName());
    }

    public static boolean J(Context context, boolean z, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab50e31c", new Object[]{context, new Boolean(z), strArr})).booleanValue();
        }
        System.currentTimeMillis();
        try {
            return o.get().g(context, z, strArr);
        } catch (Exception e) {
            e.printStackTrace();
            if (!z) {
                AtomicReference<acq> atomicReference = o;
                if (atomicReference.get().l != null && atomicReference.get().i.r(PLUGIN_NAME) && atomicReference.get().d) {
                    atomicReference.get().l.b(PLUGIN_NAME, false, "load", 0L, -1, e.getCause().getMessage(), p().t());
                    return false;
                }
            }
            boolean z2 = e instanceof SplitInstallException;
            if (z2 && z) {
                AtomicReference<acq> atomicReference2 = o;
                if (atomicReference2.get().l != null && !atomicReference2.get().d) {
                    atomicReference2.get().l.b(e.getMessage(), false, "install", 0L, -1, e.getCause().getMessage(), p().t());
                    return false;
                }
            }
            if (z2 && !z) {
                AtomicReference<acq> atomicReference3 = o;
                if (atomicReference3.get().l != null && !atomicReference3.get().d) {
                    atomicReference3.get().l.b(e.getMessage(), false, "load", 0L, -1, e.getCause().getMessage(), p().t());
                }
            }
            return false;
        }
    }

    public static void Q(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6ec56a", new Object[]{context, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)});
            return;
        }
        acq acqVar = new acq(context);
        if (!sng.a(o, null, acqVar)) {
            Log.e("SplitCompat", "SplitCompat instance has be set !");
            return;
        }
        acqVar.d = z2;
        acqVar.e = z3;
        acqVar.h = z4;
        acqVar.y();
    }

    public static String R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abcf2ad4", new Object[0]);
        }
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace.length > 5) {
                return stackTrace[4].getClassName();
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static /* synthetic */ Context j(acq acqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("bd8b532f", new Object[]{acqVar});
        }
        return acqVar.j;
    }

    public static /* synthetic */ boolean k(acq acqVar, String str, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eda5573d", new Object[]{acqVar, str, file})).booleanValue();
        }
        return acqVar.I(str, file);
    }

    public static boolean m(Context context, boolean z, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e8ffe0", new Object[]{context, new Boolean(z), strArr})).booleanValue();
        }
        if (!n1r.m(context)) {
            return false;
        }
        return J(context, z, strArr);
    }

    public static acq p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (acq) ipChange.ipc$dispatch("84285b84", new Object[0]);
        }
        return o.get();
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18c9965a", new Object[0])).booleanValue();
        }
        if (o.get() != null) {
            return true;
        }
        return false;
    }

    @Deprecated
    public static boolean z(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c1c416a", new Object[]{context})).booleanValue();
        }
        return A(context, new String[0]);
    }

    public final void D(Context context) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db1e403b", new Object[]{this, context});
            return;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.m) {
            try {
                Iterator it = ((HashSet) this.m).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    this.g.n(context, str);
                    if (this.g.i(str) != null) {
                        arrayList.add(this.g.i(str).c());
                    }
                }
                this.g.e(context, arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1bb9fd70", new Object[]{this, str})).booleanValue();
        }
        jcq jcqVar = this.i;
        if (jcqVar != null) {
            return jcqVar.r(str);
        }
        return false;
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("823947b5", new Object[]{this})).booleanValue();
        }
        try {
            jcq jcqVar = this.i;
            if (jcqVar != null) {
                return jcqVar.z().exists();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public final boolean I(String str, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c1832fa", new Object[]{this, str, file})).booleanValue();
        }
        SplitFileInfo a2 = ((qcq) d62.a(qcq.class, new Object[0])).a(str);
        if (a2 == null || TextUtils.isEmpty(a2.md5) || !a2.md5.equals(hbi.b(file))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0315 A[Catch: all -> 0x0360, TRY_ENTER, TryCatch #6 {, blocks: (B:4:0x000c, B:6:0x0012, B:10:0x002f, B:11:0x004e, B:13:0x0054, B:17:0x005e, B:18:0x0064, B:22:0x006c, B:24:0x007f, B:26:0x0082, B:28:0x008c, B:29:0x0091, B:30:0x0095, B:32:0x009b, B:34:0x00ab, B:38:0x00b5, B:42:0x00be, B:43:0x00c7, B:45:0x00cd, B:47:0x00de, B:49:0x00e1, B:53:0x00f8, B:56:0x0105, B:58:0x010b, B:59:0x010e, B:62:0x0115, B:65:0x0120, B:67:0x012a, B:70:0x016a, B:72:0x0178, B:74:0x018c, B:79:0x01b8, B:81:0x01c5, B:83:0x01d4, B:89:0x01ef, B:90:0x0202, B:91:0x023b, B:93:0x0246, B:96:0x024e, B:97:0x0250, B:100:0x0257, B:101:0x025b, B:103:0x0261, B:106:0x0297, B:107:0x0298, B:108:0x029c, B:110:0x02a2, B:112:0x02b7, B:113:0x02b9, B:116:0x02cd, B:119:0x02e0, B:121:0x02e2, B:122:0x02ea, B:124:0x02f0, B:126:0x02fd, B:130:0x030f, B:131:0x0314, B:134:0x031b, B:135:0x031f, B:137:0x0325, B:139:0x032f, B:140:0x0336, B:132:0x0315, B:133:0x031a), top: B:152:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0105 A[Catch: all -> 0x002c, Exception -> 0x01e4, TRY_LEAVE, TryCatch #5 {Exception -> 0x01e4, blocks: (B:29:0x0091, B:30:0x0095, B:38:0x00b5, B:42:0x00be, B:43:0x00c7, B:45:0x00cd, B:53:0x00f8, B:56:0x0105, B:59:0x010e, B:62:0x0115, B:65:0x0120, B:70:0x016a, B:72:0x0178, B:79:0x01b8, B:81:0x01c5), top: B:150:0x0091 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean K(android.content.Context r36, java.lang.String r37, java.lang.String... r38) {
        /*
            Method dump skipped, instructions count: 869
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.acq.K(android.content.Context, java.lang.String, java.lang.String[]):boolean");
    }

    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf3b070", new Object[]{this});
            return;
        }
        try {
            jcq jcqVar = this.i;
            if (jcqVar != null && jcqVar.z().exists()) {
                this.i.z().delete();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5373d63b", new Object[]{this});
            return;
        }
        try {
            jcq jcqVar = this.i;
            if (jcqVar != null && !jcqVar.z().exists()) {
                this.i.z().createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final void N(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad5350e", new Object[]{this, str, str2});
        } else if (str != null) {
            Pair pair = new Pair(str, str2);
            Map<Pair<String, String>, b> map = p;
            if (((HashMap) map).containsKey(pair)) {
                ((b) ((HashMap) map).get(pair)).a();
            }
        }
    }

    public void O(Context context, e9f e9fVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3ef6a7c", new Object[]{this, context, e9fVar});
            return;
        }
        com.alibaba.android.split.manager.a aVar = this.g;
        if (aVar != null) {
            aVar.g(context, e9fVar);
        }
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a52d58b", new Object[]{this});
            return;
        }
        try {
            jcq jcqVar = this.i;
            if (jcqVar != null) {
                jcq.e(jcqVar.P());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override // tb.t5c
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d887232d", new Object[]{this});
        }
        return this.f;
    }

    @Override // tb.hdq
    public void b(j49 j49Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2ec59e2", new Object[]{this, j49Var});
        } else {
            this.c = j49Var;
        }
    }

    @Override // tb.hdq
    public void c(bdq bdqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ce2eb57", new Object[]{this, bdqVar});
            return;
        }
        for (String str : bdqVar.f()) {
            ((ConcurrentHashMap) this.f15663a).put(str, Integer.valueOf(bdqVar.i()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:258:0x032b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0311 A[SYNTHETIC] */
    @Override // tb.hdq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean d(android.content.Context r29, boolean r30, tb.jcq r31, java.lang.String... r32) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1187
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.acq.d(android.content.Context, boolean, tb.jcq, java.lang.String[]):boolean");
    }

    @Override // tb.hdq
    public jcq e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jcq) ipChange.ipc$dispatch("ae100471", new Object[]{this});
        }
        return this.i;
    }

    @Override // tb.hdq
    public void f(Context context, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e80a620", new Object[]{this, context, strArr});
        } else if (context != null && strArr != null && o.get() != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                this.g.n(context, str);
                if (this.g.i(str) != null) {
                    arrayList.add(this.g.i(str).c().getAbsolutePath());
                }
            }
            if (arrayList.size() > 0) {
                try {
                    if (Build.VERSION.SDK_INT >= 24) {
                        r8o.i().j((String[]) arrayList.toArray(new String[0]));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // tb.hdq
    public final boolean g(Context context, boolean z, String... strArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ac3584a", new Object[]{this, context, new Boolean(z), strArr})).booleanValue();
        }
        return d(context, z, this.i, strArr);
    }

    @Override // tb.hdq
    public boolean h(Context context, boolean z, String str, String... strArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37154fbd", new Object[]{this, context, new Boolean(z), str, strArr})).booleanValue();
        }
        if (z) {
            return n(context, str, strArr);
        }
        return K(context, str, strArr);
    }

    @Override // tb.cad
    public com.alibaba.android.split.manager.a i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.split.manager.a) ipChange.ipc$dispatch("e5ebaf11", new Object[]{this});
        }
        return this.g;
    }

    public final void l(boolean z, String str, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a529f928", new Object[]{this, new Boolean(z), str, file});
        } else if (G(p().o()) && z) {
            try {
                rdq.b().a(new a(file, str));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:? -> B:41:0x00fd). Please submit an issue!!! */
    public final boolean n(Context context, String str, String... strArr) throws Exception {
        String str2;
        Exception e;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61e49fe9", new Object[]{this, context, str, strArr})).booleanValue();
        }
        v49 v49Var = new v49(context, str);
        com.alibaba.android.split.manager.a a2 = b9m.a(str);
        a2.d(v49Var);
        Set<ocq> M = v49Var.M();
        if (M.size() == 0) {
            return true;
        }
        for (ocq ocqVar : M) {
            String b2 = ocqVar.b();
            if (strArr == null || strArr.length <= 0 || Arrays.asList(strArr).contains(b2)) {
                if (n1r.l(context, b2)) {
                    continue;
                } else {
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!a2.b(ocqVar)) {
                            a2.h(ocqVar);
                        }
                        if (!a2.a(ocqVar)) {
                            if (!a2.j(context.getClassLoader(), true, false, true, ocqVar)) {
                                w(v49Var.o(), ocqVar, true, 2, true);
                                a2.c(b2);
                            } else if (!a2.o(context.getClassLoader(), ocqVar, true, true)) {
                                w(v49Var.o(), ocqVar, true, 1, true);
                                a2.c(b2);
                            } else {
                                a2.f(b2, IPluginContext.Status.EMULATED);
                                synchronized (this.n) {
                                    try {
                                        ((HashSet) this.n).add(b2);
                                        str2 = b2;
                                        try {
                                            o.get().l.b(str2, true, jvc.ARG_INSTALL_UPDATE, System.currentTimeMillis() - currentTimeMillis, 0, "", p().t());
                                        } catch (Throwable th2) {
                                            th = th2;
                                            try {
                                                throw th;
                                            } catch (Exception e2) {
                                                e = e2;
                                                throw new SplitInstallException(str2, e);
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        str2 = b2;
                                        throw th;
                                    }
                                }
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        str2 = b2;
                    }
                }
            }
        }
        if (strArr == null || this.n.containsAll(Arrays.asList(strArr))) {
            return true;
        }
        return false;
    }

    public Context o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.j;
    }

    public ArrayList<WeakReference<Resources>> q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("92a78e0d", new Object[]{this});
        }
        return this.k;
    }

    public Set<String> r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("e570d5ea", new Object[]{this});
        }
        return this.m;
    }

    public final List s(Context context) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("88727d4a", new Object[]{this, context});
        }
        context.getPackageName();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.m);
        return arrayList;
    }

    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a446ea9", new Object[]{this})).intValue();
        }
        return this.i.m();
    }

    public String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f011eacc", new Object[]{this});
        }
        return this.i.n();
    }

    public final List<String> v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dc6d6084", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            return new ArrayList(this.n);
        }
        return new ArrayList(this.m);
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
            return;
        }
        this.g.d(this.i);
        AtomicReference<acq> atomicReference = o;
        mcq.b(new ncq(atomicReference.get()));
        if (G(this.j)) {
            Executor a2 = irt.a();
            ObjectInvoker objectInvoker = new ObjectInvoker();
            d62.d(b7e.class, new j6o());
            SplitLoaderHolder.set(new SplitLoaderInternal(this.j, a2, new SplitApkChecker(this.j, atomicReference.get().i, objectInvoker), atomicReference.get().i, new ccq()));
            hcq.b(new gcq());
            ddq.b(new u67());
            tcq tcqVar = new tcq(this.j);
            if (this.d) {
                irt.b().schedule(tcqVar, 1L, TimeUnit.SECONDS);
            } else {
                tcqVar.run();
            }
            wbq.l().m(this.j);
            wbq.l().k();
            if (eto.a() != null && cto.a() != null && caq.a() != null && n1r.v(this.j)) {
                rmd a3 = cto.a().a();
                a3.a(this.j, caq.a(), "com.alibaba.android.split.scene.FeatureSceneInfoGenerator");
                eto.a().c(a3);
            }
        }
    }

    public static boolean B(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10ab79b", new Object[]{context})).booleanValue();
        }
        acq acqVar = o.get();
        if (acqVar == null) {
            Log.e("SplitCompat", "SplitCompat.installActivity can only be called if SplitCompat.install is first called at startup on application context.");
            return false;
        }
        Context baseContext = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : context;
        if (baseContext != null) {
            try {
                str = ((Context) Reflector.s(baseContext).g("mOuterContext").j()).getClass().getName();
            } catch (Exception e) {
                String R = R();
                e.printStackTrace();
                str = R;
            }
        } else {
            str = "";
        }
        acqVar.k.add(new WeakReference<>(context.getResources()));
        if (n1r.r(context, str)) {
            Log.e("SplitCompat", "installActivity:" + str + " inject skiped");
            return true;
        }
        Log.e("SplitCompat", "inject Activity:" + str);
        try {
            acqVar.D(context);
            FlexaResources.b(context);
            acqVar.D(acqVar.o());
            return true;
        } catch (Exception e2) {
            Log.e("SplitCompat", "Error installing additional splits", e2);
            return false;
        }
    }

    public final void w(boolean z, ocq ocqVar, boolean z2, int i, boolean z3) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574e06ae", new Object[]{this, new Boolean(z), ocqVar, new Boolean(z2), new Integer(i), new Boolean(z3)});
            return;
        }
        if (i == 0) {
            if (z2) {
                AtomicReference<acq> atomicReference = o;
                if (atomicReference.get().l != null) {
                    jvc jvcVar = atomicReference.get().l;
                    String b2 = ocqVar.b();
                    if (z3) {
                        str2 = jvc.ARG_INSTALL_UPDATE;
                    } else {
                        str2 = "install";
                    }
                    jvcVar.b(b2, false, str2, 0L, -18, "can't add assetsPath:" + ocqVar.c().length(), t());
                }
            }
            if (!z2) {
                AtomicReference<acq> atomicReference2 = o;
                if (atomicReference2.get().l != null) {
                    jvc jvcVar2 = atomicReference2.get().l;
                    String b3 = ocqVar.b();
                    if (z3) {
                        str = "update";
                    } else {
                        str = "load";
                    }
                    jvcVar2.b(b3, false, str, 0L, -18, "can't add assetsPath:" + ocqVar.c().length(), t());
                }
            }
        } else if (i == 1) {
            if (z2) {
                AtomicReference<acq> atomicReference3 = o;
                if (atomicReference3.get().l != null) {
                    jvc jvcVar3 = atomicReference3.get().l;
                    String b4 = ocqVar.b();
                    if (z3) {
                        str4 = jvc.ARG_INSTALL_UPDATE;
                    } else {
                        str4 = "install";
                    }
                    jvcVar3.b(b4, false, str4, 0L, -19, "makePathElement failed:" + ocqVar.c().length(), t());
                }
            }
            if (!z2) {
                AtomicReference<acq> atomicReference4 = o;
                if (atomicReference4.get().l != null) {
                    jvc jvcVar4 = atomicReference4.get().l;
                    String b5 = ocqVar.b();
                    if (z3) {
                        str3 = "update";
                    } else {
                        str3 = "load";
                    }
                    jvcVar4.b(b5, false, str3, 0L, -19, "makePathElement failed:" + ocqVar.c().length(), t());
                }
            }
        } else if (i == 2) {
            if (z2) {
                AtomicReference<acq> atomicReference5 = o;
                if (atomicReference5.get().l != null) {
                    jvc jvcVar5 = atomicReference5.get().l;
                    String b6 = ocqVar.b();
                    if (z3) {
                        str6 = jvc.ARG_INSTALL_UPDATE;
                    } else {
                        str6 = "install";
                    }
                    jvcVar5.b(b6, false, str6, 0L, -20, "extractNativeLibs error:" + ocqVar.c().length(), t());
                }
            }
            if (!z2) {
                AtomicReference<acq> atomicReference6 = o;
                if (atomicReference6.get().l != null) {
                    jvc jvcVar6 = atomicReference6.get().l;
                    String b7 = ocqVar.b();
                    if (z3) {
                        str5 = "update";
                    } else {
                        str5 = "load";
                    }
                    jvcVar6.b(b7, false, str5, 0L, -20, "extractNativeLibs error:" + ocqVar.c().length(), t());
                }
            }
        }
        if (!z3 && z2) {
            l(z, ocqVar.b(), ocqVar.c());
        }
    }
}
