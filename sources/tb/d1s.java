package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import tb.p1s;
import tb.pd9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class d1s implements pd9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Set<String> c;

    /* renamed from: a  reason: collision with root package name */
    public final x0s f17508a;
    public final koq b;

    static {
        HashSet hashSet = new HashSet();
        c = hashSet;
        hashSet.add(LauncherRuntime.PROCESS_UC_SUFFIX);
        hashSet.add(":gpu_process");
    }

    public d1s(x0s x0sVar, koq koqVar) {
        this.f17508a = x0sVar;
        this.b = koqVar;
    }

    public static Callable<String> e(final File file, x0s x0sVar, koq koqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Callable) ipChange.ipc$dispatch("b019eb77", new Object[]{file, x0sVar, koqVar});
        }
        if (h(file, x0sVar, koqVar)) {
            return new Callable() { // from class: tb.a1s
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String i;
                    i = d1s.i(file);
                    return i;
                }
            };
        }
        final boolean g = g(file, x0sVar);
        if (g) {
            return new Callable() { // from class: tb.b1s
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String j;
                    j = d1s.j(file, g);
                    return j;
                }
            };
        }
        return new Callable() { // from class: tb.c1s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String k;
                k = d1s.k(file);
                return k;
            }
        };
    }

    public static boolean g(File file, x0s x0sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ecd87c4", new Object[]{file, x0sVar})).booleanValue();
        }
        if (file.getName().endsWith("anr.log") && o1r.a(x0sVar.g()).b("ignoreAnr", false)) {
            String h = x0sVar.h();
            Iterator it = ((HashSet) c).iterator();
            while (it.hasNext()) {
                if (h.contains((String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ String i(File file) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7358a14b", new Object[]{file});
        }
        return zjj.a(file);
    }

    public static /* synthetic */ String j(File file, boolean z) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aea18082", new Object[]{file, new Boolean(z)});
        }
        return db.b(file, z);
    }

    public static /* synthetic */ String k(File file) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5bd71209", new Object[]{file});
        }
        return kg9.d(file);
    }

    public final void f(File file, int i, pd9.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3578f0", new Object[]{this, file, new Integer(i), aVar});
            return;
        }
        boolean z = aVar instanceof pd9.b;
        if (z) {
            ((pd9.b) aVar).a();
        }
        try {
            boolean p = p(i, file);
            if (z) {
                ((pd9.b) aVar).b(p);
            }
            ((p1s.a) aVar).a(file, p);
        } catch (Throwable th) {
            try {
                ehh.d(th);
            } finally {
                if (z) {
                    ((pd9.b) aVar).b(false);
                }
                ((p1s.a) aVar).a(file, false);
            }
        }
    }

    public final /* synthetic */ void l(String str, File file, pd9.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("254b53c5", new Object[]{this, str, file, aVar});
        } else {
            f(file, q(str), aVar);
        }
    }

    public void m(final File file, final String str, final pd9.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32ccee79", new Object[]{this, file, str, aVar});
        } else {
            v9a.c().a().execute(new Runnable() { // from class: tb.z0s
                @Override // java.lang.Runnable
                public final void run() {
                    d1s.this.l(str, file, aVar);
                }
            });
        }
    }

    public boolean o(String str, int i, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d9c5660", new Object[]{this, str, new Integer(i), str2, str3})).booleanValue();
        }
        return zur.b(this.f17508a, str, i, str2, str3);
    }

    public final boolean p(int i, File file) throws Exception {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94820579", new Object[]{this, new Integer(i), file})).booleanValue();
        }
        String call = e(file, this.f17508a, this.b).call();
        if (TextUtils.isEmpty(call)) {
            ehh.b("TCrashFileSender", "file content is empty");
            l1s.c().a("EMPTY_FILE", "TCrash", file.getName());
            return false;
        }
        if (call != null && call.length() < 1024) {
            call = call + "\nReport Name:" + file.getName() + "\n" + bhh.b(2000) + "\n";
        }
        wh4 f = wh4.f();
        String d = f.d(wh4.adashxServerHost, "h-adashx.ut.taobao.com");
        boolean b = f.b(wh4.enableReportContentCompress, true);
        if (b) {
            str = td2.SEND_FLAG;
        } else {
            str = "MOTU_REPORTER_SDK_3.0.0_PRIVATE";
        }
        if (b) {
            call = up1.g(eoa.a(call.getBytes()));
        }
        return o(d, i, str, call);
    }

    public static boolean h(File file, x0s x0sVar, koq koqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4299f1e2", new Object[]{file, x0sVar, koqVar})).booleanValue();
        }
        i1r a2 = o1r.a(x0sVar.g());
        if (a2.b("OpenLogcatCrash", koqVar.defaultValue())) {
            String name = file.getName();
            return name.endsWith("jni.log") || name.endsWith("native.log");
        } else if (!koqVar.defaultValue() || !a2.b("GreyOpenLogcatCrash", false)) {
            return false;
        } else {
            String name2 = file.getName();
            return name2.endsWith("jni.log") || name2.endsWith("native.log");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int q(String str) {
        char c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52673c6a", new Object[]{str})).intValue();
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1052618729:
                if (str.equals("native")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 96741:
                if (str.equals("anr")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 3254818:
                if (str.equals("java")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 1:
                return 61006;
            case 2:
                return 1;
            default:
                ehh.b("Not Support Type", str);
                return -1;
        }
    }
}
