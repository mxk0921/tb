package com.alibaba.wireless.security.framework;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alibaba.wireless.security.framework.utils.FLOG;
import com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge;
import com.alibaba.wireless.security.open.SecException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.modules.WeexZipModule;
import dalvik.system.DexClassLoader;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import tb.f7l;
import tb.jcq;
import tb.kgd;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class d implements ISGPluginManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static Boolean t = null;
    private static Boolean u = null;
    private static String[] v = {"armeabi", kgd.ABI_ARM, "x86", kgd.ABI_ARM64, "x86_64"};
    private static String w = null;
    private static volatile boolean x = true;
    private List<Runnable> b;
    private Context c;

    /* renamed from: a  reason: collision with root package name */
    private HandlerThread f3415a = null;
    private final ConcurrentHashMap<String, com.alibaba.wireless.security.framework.c> d = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Class, Object> e = new ConcurrentHashMap<>();
    private IRouterComponent f = null;
    public com.alibaba.wireless.security.framework.utils.b g = null;
    private boolean h = true;
    private String i = null;
    private String j = null;
    private volatile com.alibaba.wireless.security.framework.b k = null;
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;
    private boolean o = true;
    private boolean p = false;
    private File q = null;
    private File r = null;
    private File s = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3417a;
        public final /* synthetic */ String b;

        static {
            t2o.a(659554331);
        }

        public b(String str, String str2) {
            this.f3417a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                d.a(d.this, this.f3417a, this.b, true);
            } catch (SecException e) {
                FLOG.w("load weak dependency notDelay", e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3418a;
        public final /* synthetic */ String b;

        static {
            t2o.a(659554332);
        }

        public c(String str, String str2) {
            this.f3418a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                d.a(d.this, this.f3418a, this.b, true);
            } catch (SecException e) {
                FLOG.w("load weak dependency", e);
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.wireless.security.framework.d$d  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class RunnableC0107d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(659554333);
        }

        public RunnableC0107d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                d.b(d.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(659554334);
        }

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (d.c(d.this) != null) {
                FLOG.w("quitSafely");
                d.c(d.this).quitSafely();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3421a;
        public final /* synthetic */ int b;

        static {
            t2o.a(659554335);
        }

        public f(String str, int i) {
            this.f3421a = str;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            d.a(d.this, 100048, SecExceptionCode.SEC_ERROR_INIT_DELAY_REPORT_ERROR, "Dynamic update rejected", "Arch=" + this.f3421a, "DeployVersion=" + this.b, "", "");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3422a;
        public final /* synthetic */ File b;
        public final /* synthetic */ File c;

        static {
            t2o.a(659554336);
        }

        public g(String str, File file, File file2) {
            this.f3422a = str;
            this.b = file;
            this.c = file2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            d dVar = d.this;
            d.a(dVar, 100179, 4, "updInfo=" + this.f3422a, this.b.getAbsolutePath(), this.c.getAbsolutePath(), "", "");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ File f3423a;

        static {
            t2o.a(659554337);
        }

        public h(File file) {
            this.f3423a = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                d.a(d.this, 100179, 4, this.f3423a.getAbsolutePath(), "", "", "", "");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ File f3424a;

        static {
            t2o.a(659554338);
        }

        public i(File file) {
            this.f3424a = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                d.a(d.this, 100179, 2, this.f3424a.getAbsolutePath(), "", "", "", "");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public File f3425a;
        public File b;
        public File c;
        public boolean d;

        static {
            t2o.a(659554339);
        }

        public j(File file, File file2, File file3, boolean z) {
            this.f3425a = file;
            this.b = file2;
            this.c = file3;
            this.d = z;
        }
    }

    public static /* synthetic */ Context a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("6752cdfd", new Object[]{dVar}) : dVar.c;
    }

    private int b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65d7b870", new Object[]{this, str, str2})).intValue();
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int length = split.length < split2.length ? split.length : split2.length;
        for (int i2 = 0; i2 < length; i2++) {
            int parseInt = Integer.parseInt(split[i2]);
            int parseInt2 = Integer.parseInt(split2[i2]);
            if (parseInt > parseInt2) {
                return 1;
            }
            if (parseInt < parseInt2) {
                return -1;
            }
        }
        return 0;
    }

    public static /* synthetic */ HandlerThread c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HandlerThread) ipChange.ipc$dispatch("12f3e539", new Object[]{dVar}) : dVar.f3415a;
    }

    private void f() throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        File a2 = a(this.c);
        this.q = a2;
        if (a2 != null) {
            Context context = this.c;
            this.g = new com.alibaba.wireless.security.framework.utils.b(context, this.q + File.separator + "lock.lock");
            this.k = b();
            this.s = a(this.c, this.k);
        }
    }

    private boolean g() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            bool = (Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this});
        } else {
            if (t == null) {
                t = Boolean.valueOf(new File(e(), ".sgdynkp").isFile());
                u = Boolean.valueOf(new File(e(), ".sgcpuv").isFile());
            }
            bool = t;
        }
        return bool.booleanValue();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        List<Runnable> list = this.b;
        if (list != null) {
            try {
                for (Runnable runnable : list) {
                    runnable.run();
                }
            } catch (Exception unused) {
            }
            this.b.clear();
        }
    }

    public File d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("ee166802", new Object[]{this}) : this.q;
    }

    public File e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("b2a84a21", new Object[]{this}) : this.r;
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginManager
    public <T> T getInterface(Class<T> cls) throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9842089f", new Object[]{this, cls});
        }
        return (T) a(cls);
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginManager
    public String getMainPluginName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9dc2d2c", new Object[]{this});
        }
        return "main";
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginManager
    public ISGPluginInfo getPluginInfo(String str) throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISGPluginInfo) ipChange.ipc$dispatch("3bc6a24b", new Object[]{this, str});
        }
        FLOG.i("MockTaobaoChannel - getPluginInfo: " + str);
        return c(str, "", true);
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginManager
    public IRouterComponent getRouter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRouterComponent) ipChange.ipc$dispatch("663bf5e4", new Object[]{this});
        }
        return this.f;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ File f3416a;
        public final /* synthetic */ String b;

        static {
            t2o.a(659554330);
        }

        public a(File file, String str) {
            this.f3416a = file;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            File filesDir;
            File[] listFiles;
            File[] listFiles2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                File file = this.f3416a;
                if (file != null && file.isDirectory() && (listFiles2 = this.f3416a.listFiles()) != null && listFiles2.length > 0) {
                    for (File file2 : listFiles2) {
                        if (file2.isDirectory() && file2.getName().startsWith("app_") && !file2.getName().equals(this.b)) {
                            d.a(d.this, file2);
                        } else if (file2.getName().startsWith("libsg")) {
                            file2.delete();
                        }
                    }
                }
                if (!(d.a(d.this) == null || (filesDir = d.a(d.this).getFilesDir()) == null || !filesDir.isDirectory() || (listFiles = filesDir.listFiles()) == null || listFiles.length <= 0)) {
                    for (File file3 : listFiles) {
                        if (file3.getName().startsWith("libsecuritysdk")) {
                            file3.delete();
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private PackageInfo a(String str, j jVar, String str2) throws SecException {
        PackageInfo packageInfo;
        String str3 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PackageInfo) ipChange.ipc$dispatch("832988e", new Object[]{this, str, jVar, str2});
        }
        try {
            packageInfo = this.c.getPackageManager().getPackageArchiveInfo(jVar.f3425a.getAbsolutePath(), 133);
        } catch (Throwable th) {
            String str4 = str3 + th;
            String d = d(jVar.f3425a.getAbsolutePath() + str3);
            File file = jVar.c;
            a(100043, 133, "getPackageArchiveInfo failed", str4, d, file != null ? d(file.getAbsolutePath()) : str3, str2);
            if (jVar.f3425a.exists() && !e(jVar.f3425a)) {
                jVar.f3425a.delete();
            }
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo;
        }
        String str5 = str + "[" + str2 + "]";
        String d2 = d(jVar.f3425a.getAbsolutePath());
        File file2 = jVar.c;
        if (file2 != null) {
            str3 = d(file2.getAbsolutePath());
        }
        a(100043, 134, "packageInfo == null", str5, d2, str3, i());
        throw new SecException(134);
    }

    private com.alibaba.wireless.security.framework.b b() {
        com.alibaba.wireless.security.framework.b a2;
        String a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.wireless.security.framework.b) ipChange.ipc$dispatch("5b6aff08", new Object[]{this});
        }
        File file = new File(this.q, "update.config");
        File file2 = new File(this.q, "init.config");
        if (this.l) {
            if (!file2.isFile() && g()) {
                a();
            }
            a2 = com.alibaba.wireless.security.framework.b.a(file);
            if (a2 != null) {
                try {
                    this.g.a();
                    file2.delete();
                    file.renameTo(file2);
                } finally {
                }
            } else {
                a2 = com.alibaba.wireless.security.framework.b.a(file2);
                if (a2 != null || (a3 = com.alibaba.wireless.security.framework.utils.a.a(new File(this.q, "dyInit.config"))) == null || !a3.equals(Integer.toString(a2.b()))) {
                    return a2;
                }
                this.b.add(new f(a2.c(), a2.b()));
                return null;
            }
        } else {
            try {
                this.g.a();
                a2 = com.alibaba.wireless.security.framework.b.a(file2);
            } finally {
            }
        }
        return a2 != null ? a2 : a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x024b, code lost:
        r1 = "plugin " + r12 + " not existed";
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0260, code lost:
        if (r13.length() == 0) goto L_0x0276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0262, code lost:
        r1 = r1 + ", depended by " + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0276, code lost:
        a(100044, 110, "", r12, r13, "", "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x028f, code lost:
        throw new com.alibaba.wireless.security.open.SecException(r1, 110);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.alibaba.wireless.security.framework.ISGPluginInfo c(java.lang.String r12, java.lang.String r13, boolean r14) throws com.alibaba.wireless.security.open.SecException {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.d.c(java.lang.String, java.lang.String, boolean):com.alibaba.wireless.security.framework.ISGPluginInfo");
    }

    private String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str});
        }
        if (str == null || str.length() <= 0) {
            return "";
        }
        File file = new File(str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (e(file)) {
            sb.append("->");
            try {
                sb.append(file.getCanonicalPath());
            } catch (Throwable unused) {
            }
        }
        sb.append('[');
        sb.append("exists:" + file.exists() + ",");
        sb.append("size:" + file.length() + ",");
        sb.append("canRead:" + file.canRead() + ",");
        sb.append("canWrite:" + file.canWrite() + ",");
        sb.append("totalSpace:" + file.getTotalSpace() + ",");
        sb.append("freeSpace:" + file.getFreeSpace() + ",");
        sb.append(']');
        return sb.toString();
    }

    private boolean e(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c14126e7", new Object[]{this, file})).booleanValue();
        }
        try {
            File canonicalFile = file.getCanonicalFile();
            if (canonicalFile != null) {
                File parentFile = file.getParentFile();
                File parentFile2 = canonicalFile.getParentFile();
                if (parentFile != null && parentFile2 != null && !parentFile.getCanonicalPath().equals(parentFile2.getCanonicalPath())) {
                    return true;
                }
                if (!file.getName().equals(canonicalFile.getName())) {
                    return true;
                }
            }
        } catch (Throwable th) {
            FLOG.w("", th);
            a(100047, 0, th.toString(), file.getAbsolutePath(), "", "", "");
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: AttachTryCatchVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Null type added to not empty exception handler: JSONException -> 0x00d5
        	at jadx.core.dex.trycatch.ExceptionHandler.addCatchType(ExceptionHandler.java:54)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.createHandler(AttachTryCatchVisitor.java:136)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.convertToHandlers(AttachTryCatchVisitor.java:123)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.initTryCatches(AttachTryCatchVisitor.java:59)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.visit(AttachTryCatchVisitor.java:47)
        */
    private com.alibaba.wireless.security.framework.c a(java.lang.String r44, com.alibaba.wireless.security.framework.d.j r45, android.content.Context r46, java.lang.String r47) throws com.alibaba.wireless.security.open.SecException {
        /*
            Method dump skipped, instructions count: 2014
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.d.a(java.lang.String, com.alibaba.wireless.security.framework.d$j, android.content.Context, java.lang.String):com.alibaba.wireless.security.framework.c");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:27:0x008b, B:33:0x009c, B:35:0x00a2, B:37:0x00a8, B:39:0x00b5, B:41:0x00e2, B:42:0x00e9, B:45:0x00f4, B:48:0x00fc, B:54:0x010c, B:56:0x0116, B:57:0x011e, B:59:0x0124, B:60:0x012b, B:62:0x0154, B:64:0x015a, B:66:0x0160, B:67:0x0166, B:69:0x016f, B:70:0x0175, B:72:0x019e, B:74:0x01aa, B:76:0x01b0), top: B:84:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5 A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:27:0x008b, B:33:0x009c, B:35:0x00a2, B:37:0x00a8, B:39:0x00b5, B:41:0x00e2, B:42:0x00e9, B:45:0x00f4, B:48:0x00fc, B:54:0x010c, B:56:0x0116, B:57:0x011e, B:59:0x0124, B:60:0x012b, B:62:0x0154, B:64:0x015a, B:66:0x0160, B:67:0x0166, B:69:0x016f, B:70:0x0175, B:72:0x019e, B:74:0x01aa, B:76:0x01b0), top: B:84:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4 A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:27:0x008b, B:33:0x009c, B:35:0x00a2, B:37:0x00a8, B:39:0x00b5, B:41:0x00e2, B:42:0x00e9, B:45:0x00f4, B:48:0x00fc, B:54:0x010c, B:56:0x0116, B:57:0x011e, B:59:0x0124, B:60:0x012b, B:62:0x0154, B:64:0x015a, B:66:0x0160, B:67:0x0166, B:69:0x016f, B:70:0x0175, B:72:0x019e, B:74:0x01aa, B:76:0x01b0), top: B:84:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.alibaba.wireless.security.framework.d.j b(java.lang.String r18, java.lang.String r19, boolean r20) throws com.alibaba.wireless.security.open.SecException {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.d.b(java.lang.String, java.lang.String, boolean):com.alibaba.wireless.security.framework.d$j");
    }

    private File c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("aae8cad9", new Object[]{this, str});
        }
        String str2 = this.i;
        if (str2 == null) {
            try {
                str2 = this.c.getApplicationInfo().nativeLibraryDir;
            } catch (Throwable unused) {
            }
        }
        if (str2 != null && str2.length() > 0) {
            File file = new File(str2 + File.separator + "libsg" + str + jcq.SO_EXTENSION);
            if (file.exists()) {
                return file;
            }
        }
        return null;
    }

    private boolean d(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f396c526", new Object[]{this, file})).booleanValue();
        }
        if (file != null) {
            try {
                String absolutePath = file.getAbsolutePath();
                if (absolutePath != null && absolutePath.length() > 0) {
                    if (com.alibaba.wireless.security.framework.utils.e.c(this.c)) {
                        return true;
                    }
                    if (!absolutePath.startsWith("/system/")) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        File file = this.q;
        if (file == null || !file.exists() || !file.isDirectory()) {
            sb.append("not exists!");
        } else {
            try {
                sb.append("[");
                File[] listFiles = file.listFiles();
                for (int i2 = 0; listFiles != null && i2 < listFiles.length; i2++) {
                    File file2 = listFiles[i2];
                    if (file2.getName().startsWith("libsg") && (file2.getName().endsWith(WeexZipModule.NAME) || file2.getName().endsWith(jcq.SO_EXTENSION))) {
                        sb.append(file2.getName());
                        sb.append(f7l.BRACKET_START_STR);
                        sb.append(e(file2) + " , ");
                        sb.append(file2.length());
                        sb.append(") , ");
                    }
                }
                sb.append("]");
            } catch (Throwable unused) {
            }
        }
        return sb.toString();
    }

    static {
        t2o.a(659554329);
        t2o.a(659554311);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.io.File a(android.content.Context r12) throws com.alibaba.wireless.security.open.SecException {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.d.a(android.content.Context):java.io.File");
    }

    private File b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("ce89676d", new Object[]{this, file});
        }
        if (!file.exists() || !file.isDirectory() || !this.l) {
            return file;
        }
        File file2 = new File(file, "main");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2.exists() ? file2 : file;
    }

    private HashMap<String, String> c() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("52df8a4d", new Object[]{this});
        }
        ApplicationInfo applicationInfo = this.c.getApplicationInfo();
        if (applicationInfo == null || (str = applicationInfo.nativeLibraryDir) == null) {
            return null;
        }
        String[] strArr = {"libsgmain", "libsgsecuritybody", "libsgmiddletier"};
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            File file = new File(str, str2 + "so.version.so");
            if (file.isFile()) {
                hashMap.put(str2, com.alibaba.wireless.security.framework.utils.a.a(file));
            }
        }
        return hashMap;
    }

    private boolean d(String str, String str2, boolean z) throws SecException {
        SecException th;
        int i2 = 2;
        char c2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63ea7439", new Object[]{this, str, str2, new Boolean(z)})).booleanValue();
        }
        if (!(str == null || str.trim().length() == 0)) {
            String[] split = str.split(";");
            int i3 = 0;
            while (i3 < split.length) {
                String trim = split[i3].trim();
                if (trim.length() != 0) {
                    String[] split2 = trim.split(":");
                    if (split2.length == i2) {
                        int indexOf = str2.indexOf(split2[c2]);
                        if (indexOf >= 0) {
                            int indexOf2 = str2.indexOf(f7l.BRACKET_START_STR, indexOf);
                            int indexOf3 = str2.indexOf(f7l.BRACKET_END_STR, indexOf);
                            if (indexOf2 < 0 || indexOf3 < 0 || indexOf2 > indexOf3) {
                                a(100040, 129, "indexLeftP < 0 || indexRightP < 0 || indexLeftP > indexRightP", "" + indexOf2, "" + indexOf3, "", "" + i3);
                                throw new SecException(129);
                            }
                            String substring = str2.substring(indexOf2 + 1, indexOf3);
                            if (b(substring, split2[1]) < 0) {
                                String str3 = "version " + substring + " of " + split2[0] + " is not meet the requirement: " + split2[1];
                                if (str2.length() != 0) {
                                    str3 = str3 + ", depended by: " + str2;
                                }
                                if (!z) {
                                    a(100040, 113, "versionCompare(parentPluginVersion, nameVersionPair[1]) < 0", substring, split2[0], split2[1], "" + i3);
                                }
                                throw new SecException(str3, 113);
                            }
                        } else {
                            com.alibaba.wireless.security.framework.c cVar = this.d.get(split2[0]);
                            if (cVar == null) {
                                try {
                                    cVar = c(split2[0], str2, !z);
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (cVar == null) {
                                    if (!z) {
                                        if (th instanceof SecException) {
                                            throw th;
                                        }
                                        a(100040, 130, "throwable in loadPluginInner", "" + th, str, str2, "" + i3);
                                        throw new SecException(str2, 130);
                                    }
                                }
                            }
                            if (b(cVar.getVersion(), split2[1]) < 0) {
                                String str4 = "version " + cVar.getVersion() + " of " + split2[0] + " is not meet the requirement: " + split2[1];
                                if (str2.length() != 0) {
                                    str4 = str4 + ", depended by: " + str2;
                                }
                                if (!z) {
                                    a(100040, 113, "versionCompare(dependPlugin.getVersion(), nameVersionPair[1]) < 0", cVar.getVersion(), split2[0], split2[1], "" + i3);
                                }
                                throw new SecException(str4, 113);
                            }
                        }
                    } else {
                        a(100040, 128, "nameVersionPair.length != 2", trim, str2, "" + z, "" + i3);
                        throw new SecException(128);
                    }
                }
                i3++;
                i2 = 2;
                c2 = 0;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
        if (a(r6, r7.b()) == false) goto L_0x0089;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.io.File a(android.content.Context r6, com.alibaba.wireless.security.framework.b r7) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.wireless.security.framework.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "61617b1e"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r3 = 1
            r2[r3] = r6
            r6 = 2
            r2[r6] = r7
            java.lang.Object r6 = r0.ipc$dispatch(r1, r2)
            java.io.File r6 = (java.io.File) r6
            return r6
        L_0x001b:
            boolean r6 = com.alibaba.wireless.security.framework.utils.e.c(r6)
            r0 = 0
            if (r6 != 0) goto L_0x00da
            if (r7 == 0) goto L_0x00da
            int r6 = r7.b()
            if (r6 == 0) goto L_0x00da
            java.lang.String r6 = r7.c()
            if (r6 == 0) goto L_0x00da
            java.lang.String r6 = r7.c()
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x00da
            boolean r6 = r5.g()
            java.lang.String r1 = "libs"
            if (r6 == 0) goto L_0x0089
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r3 = r5.r
            java.lang.String r3 = r3.getAbsolutePath()
            r2.append(r3)
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            java.lang.String r4 = "upds"
            r2.append(r4)
            r2.append(r3)
            r2.append(r1)
            r2.append(r3)
            int r4 = r7.b()
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = r7.c()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r6.<init>(r2)
            int r2 = r7.b()
            boolean r2 = r5.a(r6, r2)
            if (r2 != 0) goto L_0x008a
        L_0x0089:
            r6 = r0
        L_0x008a:
            if (r6 == 0) goto L_0x0092
            boolean r2 = r6.isDirectory()
            if (r2 != 0) goto L_0x00d0
        L_0x0092:
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r3 = r5.q
            java.lang.String r3 = r3.getAbsolutePath()
            r2.append(r3)
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            r2.append(r1)
            r2.append(r3)
            int r1 = r7.b()
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r7.c()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r6.<init>(r1)
            int r7 = r7.b()
            boolean r7 = r5.a(r6, r7)
            if (r7 != 0) goto L_0x00d0
            r6 = r0
        L_0x00d0:
            if (r6 == 0) goto L_0x00d9
            boolean r7 = r6.exists()
            if (r7 != 0) goto L_0x00d9
            goto L_0x00da
        L_0x00d9:
            r0 = r6
        L_0x00da:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.d.a(android.content.Context, com.alibaba.wireless.security.framework.b):java.io.File");
    }

    private File b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("36a9927a", new Object[]{this, str});
        }
        if (this.i != null) {
            return null;
        }
        String a2 = com.alibaba.wireless.security.framework.utils.e.a(d.class.getClassLoader(), "sg" + str);
        if (a2 == null || a2.length() <= 0) {
            return null;
        }
        return new File(a2);
    }

    private boolean c(File file) {
        String str;
        IOException e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25ec6365", new Object[]{this, file})).booleanValue();
        }
        if (file == null || file.getParentFile() == null || this.s == null) {
            return false;
        }
        String str2 = null;
        try {
            str = file.getParentFile().getCanonicalPath();
        } catch (IOException e3) {
            e2 = e3;
            str = null;
        }
        try {
            str2 = this.s.getCanonicalPath();
        } catch (IOException e4) {
            e2 = e4;
            FLOG.w("", e2);
            if (str == null) {
            }
        }
        return str == null && TextUtils.equals(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.io.File a(java.lang.String r15, java.io.File r16) {
        /*
            r14 = this;
            r9 = r14
            r5 = r15
            r0 = r16
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.alibaba.wireless.security.framework.d.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001f
            java.lang.String r4 = "56dbb984"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r2] = r9
            r6[r1] = r5
            r1 = 2
            r6[r1] = r0
            java.lang.Object r0 = r3.ipc$dispatch(r4, r6)
            java.io.File r0 = (java.io.File) r0
            return r0
        L_0x001f:
            r10 = 0
            android.content.Context r3 = r9.c     // Catch: all -> 0x0029
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: all -> 0x0029
            java.lang.String r3 = r3.sourceDir     // Catch: all -> 0x0029
            goto L_0x002b
        L_0x0029:
            r3 = r10
        L_0x002b:
            if (r3 != 0) goto L_0x002e
            return r10
        L_0x002e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "libsg"
            r4.<init>(r6)
            r4.append(r15)
            java.lang.String r6 = ".so"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "Plugin not existed in the application library path, maybe installed in x86 phone, or the armeabi-v7a existed"
            com.alibaba.wireless.security.framework.utils.FLOG.i(r6)     // Catch: all -> 0x008a, IOException -> 0x008c
            java.util.zip.ZipFile r6 = new java.util.zip.ZipFile     // Catch: all -> 0x008a, IOException -> 0x008c
            r6.<init>(r3)     // Catch: all -> 0x008a, IOException -> 0x008c
            java.lang.String[] r7 = com.alibaba.wireless.security.framework.d.v     // Catch: all -> 0x007d, IOException -> 0x0080
            int r8 = r7.length     // Catch: all -> 0x007d, IOException -> 0x0080
        L_0x004f:
            if (r2 >= r8) goto L_0x0084
            r11 = r7[r2]     // Catch: all -> 0x007d, IOException -> 0x0080
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: all -> 0x007d, IOException -> 0x0080
            r12.<init>()     // Catch: all -> 0x007d, IOException -> 0x0080
            java.lang.String r13 = "lib"
            r12.append(r13)     // Catch: all -> 0x007d, IOException -> 0x0080
            java.lang.String r13 = java.io.File.separator     // Catch: all -> 0x007d, IOException -> 0x0080
            r12.append(r13)     // Catch: all -> 0x007d, IOException -> 0x0080
            r12.append(r11)     // Catch: all -> 0x007d, IOException -> 0x0080
            r12.append(r13)     // Catch: all -> 0x007d, IOException -> 0x0080
            r12.append(r4)     // Catch: all -> 0x007d, IOException -> 0x0080
            java.lang.String r12 = r12.toString()     // Catch: all -> 0x007d, IOException -> 0x0080
            java.util.zip.ZipEntry r13 = r6.getEntry(r12)     // Catch: all -> 0x007d, IOException -> 0x0080
            if (r13 == 0) goto L_0x0082
            com.alibaba.wireless.security.framework.d.w = r11     // Catch: all -> 0x007d, IOException -> 0x0080
            java.io.File r10 = r14.a(r15, r0, r6, r12)     // Catch: all -> 0x007d, IOException -> 0x0080
            goto L_0x0084
        L_0x007d:
            r0 = move-exception
            r10 = r6
            goto L_0x00b1
        L_0x0080:
            r0 = move-exception
            goto L_0x0088
        L_0x0082:
            int r2 = r2 + r1
            goto L_0x004f
        L_0x0084:
            r6.close()     // Catch: all -> 0x0087
        L_0x0087:
            return r10
        L_0x0088:
            r11 = r6
            goto L_0x008e
        L_0x008a:
            r0 = move-exception
            goto L_0x00b1
        L_0x008c:
            r0 = move-exception
            r11 = r10
        L_0x008e:
            java.lang.String r1 = "getPluginFile throws exception"
            com.alibaba.wireless.security.framework.utils.FLOG.w(r1, r0)     // Catch: all -> 0x00af
            java.lang.String r4 = r0.toString()     // Catch: all -> 0x00af
            java.lang.String r6 = r14.d(r3)     // Catch: all -> 0x00af
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            r2 = 100047(0x186cf, float:1.40196E-40)
            r3 = 3
            r1 = r14
            r5 = r15
            r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch: all -> 0x00af
            if (r11 == 0) goto L_0x00ae
            r11.close()     // Catch: all -> 0x00ae
        L_0x00ae:
            return r10
        L_0x00af:
            r0 = move-exception
            r10 = r11
        L_0x00b1:
            if (r10 == 0) goto L_0x00b6
            r10.close()     // Catch: all -> 0x00b6
        L_0x00b6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.d.a(java.lang.String, java.io.File):java.io.File");
    }

    private String b(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c798a8ac", new Object[]{this, cls});
        }
        InterfacePluginInfo interfacePluginInfo = (InterfacePluginInfo) cls.getAnnotation(InterfacePluginInfo.class);
        if (interfacePluginInfo == null) {
            return null;
        }
        return interfacePluginInfo.pluginName();
    }

    private boolean c(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f5b6f1c", new Object[]{this, file, file2})).booleanValue();
        }
        try {
            return file.getCanonicalPath().equals(file2.getCanonicalPath());
        } catch (Throwable th) {
            FLOG.w("", th);
            a(100046, 0, th.toString(), file.getAbsolutePath(), file2.getAbsolutePath(), "", "");
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (r1 == null) goto L_0x0060;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.io.File a(java.lang.String r11, java.io.File r12, java.lang.String r13, java.lang.String r14) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.wireless.security.framework.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0021
            java.lang.String r1 = "5883b570"
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r10
            r3 = 1
            r2[r3] = r11
            r11 = 2
            r2[r11] = r12
            r11 = 3
            r2[r11] = r13
            r11 = 4
            r2[r11] = r14
            java.lang.Object r11 = r0.ipc$dispatch(r1, r2)
            java.io.File r11 = (java.io.File) r11
            return r11
        L_0x0021:
            r0 = 0
            if (r13 == 0) goto L_0x0067
            if (r14 != 0) goto L_0x0027
            goto L_0x0067
        L_0x0027:
            java.lang.String r1 = "Plugin not existed in the application library path, maybe installed in x86 phone, or the armeabi-v7a existed"
            com.alibaba.wireless.security.framework.utils.FLOG.i(r1)     // Catch: all -> 0x003e, IOException -> 0x0040
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch: all -> 0x003e, IOException -> 0x0040
            r1.<init>(r13)     // Catch: all -> 0x003e, IOException -> 0x0040
            java.io.File r0 = r10.a(r11, r12, r1, r14)     // Catch: all -> 0x0039, IOException -> 0x003c
        L_0x0035:
            r1.close()     // Catch: all -> 0x0060
            goto L_0x0060
        L_0x0039:
            r11 = move-exception
            r0 = r1
            goto L_0x0061
        L_0x003c:
            r12 = move-exception
            goto L_0x0042
        L_0x003e:
            r11 = move-exception
            goto L_0x0061
        L_0x0040:
            r12 = move-exception
            r1 = r0
        L_0x0042:
            java.lang.String r14 = "getPluginFile throws exception"
            com.alibaba.wireless.security.framework.utils.FLOG.w(r14, r12)     // Catch: all -> 0x0039
            java.lang.String r5 = r12.toString()     // Catch: all -> 0x0039
            java.lang.String r7 = r10.d(r13)     // Catch: all -> 0x0039
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            r3 = 100047(0x186cf, float:1.40196E-40)
            r4 = 3
            r2 = r10
            r6 = r11
            r2.a(r3, r4, r5, r6, r7, r8, r9)     // Catch: all -> 0x0039
            if (r1 == 0) goto L_0x0060
            goto L_0x0035
        L_0x0060:
            return r0
        L_0x0061:
            if (r0 == 0) goto L_0x0066
            r0.close()     // Catch: all -> 0x0066
        L_0x0066:
            throw r11
        L_0x0067:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.d.a(java.lang.String, java.io.File, java.lang.String, java.lang.String):java.io.File");
    }

    public static /* synthetic */ void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e898fe4", new Object[]{dVar});
        } else {
            dVar.h();
        }
    }

    private File a(String str, File file, ZipFile zipFile, String str2) throws IOException {
        ZipEntry entry;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("39b186fa", new Object[]{this, str, file, zipFile, str2});
        }
        if (!(zipFile == null || str2 == null || (entry = zipFile.getEntry(str2)) == null || !com.alibaba.wireless.security.framework.utils.a.a(entry.getName()))) {
            File file2 = new File(file, "libsg" + str + "_inner" + entry.getTime() + ".zip");
            if ((!file2.exists() || file2.length() != entry.getSize()) && !com.alibaba.wireless.security.framework.utils.e.a(zipFile, entry, file2)) {
                FLOG.i("Extract failed!!");
            } else {
                FLOG.i("Extract success");
                return file2;
            }
        }
        return null;
    }

    private boolean b(File file, File file2) {
        try {
            Class.forName("android.system.Os").getDeclaredMethod("symlink", String.class, String.class).invoke(null, file.getAbsolutePath(), file2.getAbsolutePath());
            return true;
        } catch (Throwable th) {
            FLOG.w("create symbolic link( " + file2.getAbsolutePath() + " -> " + file.getAbsolutePath() + " ) failed", th);
            String th2 = th.toString();
            String absolutePath = file.getAbsolutePath();
            String absolutePath2 = file2.getAbsolutePath();
            a(100047, 1, th2, absolutePath, absolutePath2, "" + Build.VERSION.SDK_INT, "");
            return false;
        }
    }

    private Class<?> a(ClassLoader classLoader, String str) {
        Class<?> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("a95742f9", new Object[]{this, classLoader, str});
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            cls = Class.forName(str, true, classLoader);
        } catch (Throwable th) {
            a(100042, 132, "Class.forName failed", "" + th, str, classLoader.toString(), "");
            cls = null;
        }
        FLOG.i("    loadClassFromClassLoader( " + str + " ) used time: " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        return cls;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r4 >= 3) goto L_0x0072;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r10.equals(r3[r4]) == false) goto L_0x0045;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        r6 = r11.getParent();
        r7 = r3[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
        if (new java.io.File(r6 + "/libsg" + r7 + tb.jcq.SO_EXTENSION).exists() != false) goto L_0x0070;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(java.lang.String r10, java.io.File r11) {
        /*
            r9 = this;
            r0 = 0
            r1 = 3
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = com.alibaba.wireless.security.framework.d.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001f
            java.lang.String r4 = "bd68e9ae"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r9
            r1[r2] = r10
            r10 = 2
            r1[r10] = r11
            java.lang.Object r10 = r3.ipc$dispatch(r4, r1)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L_0x001f:
            java.lang.String r3 = "main"
            java.lang.String r4 = "middletier"
            java.lang.String r5 = "securitybody"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: all -> 0x0072
            r4 = 0
        L_0x002d:
            if (r4 >= r1) goto L_0x0072
            r5 = r3[r4]     // Catch: all -> 0x0072
            boolean r5 = r10.equals(r5)     // Catch: all -> 0x0072
            if (r5 != 0) goto L_0x0039
            int r4 = r4 + r2
            goto L_0x002d
        L_0x0039:
            r4 = 0
        L_0x003a:
            if (r4 >= r1) goto L_0x0072
            r5 = r3[r4]     // Catch: all -> 0x0072
            boolean r5 = r10.equals(r5)     // Catch: all -> 0x0072
            if (r5 == 0) goto L_0x0045
            goto L_0x0070
        L_0x0045:
            java.io.File r5 = new java.io.File     // Catch: all -> 0x0072
            java.lang.String r6 = r11.getParent()     // Catch: all -> 0x0072
            r7 = r3[r4]     // Catch: all -> 0x0072
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: all -> 0x0072
            r8.<init>()     // Catch: all -> 0x0072
            r8.append(r6)     // Catch: all -> 0x0072
            java.lang.String r6 = "/libsg"
            r8.append(r6)     // Catch: all -> 0x0072
            r8.append(r7)     // Catch: all -> 0x0072
            java.lang.String r6 = ".so"
            r8.append(r6)     // Catch: all -> 0x0072
            java.lang.String r6 = r8.toString()     // Catch: all -> 0x0072
            r5.<init>(r6)     // Catch: all -> 0x0072
            boolean r5 = r5.exists()     // Catch: all -> 0x0072
            if (r5 != 0) goto L_0x0070
            goto L_0x0073
        L_0x0070:
            int r4 = r4 + r2
            goto L_0x003a
        L_0x0072:
            r0 = 1
        L_0x0073:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.d.b(java.lang.String, java.io.File):boolean");
    }

    private ClassLoader a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClassLoader) ipChange.ipc$dispatch("d5ce8032", new Object[]{this, str, str2, new Boolean(z)});
        }
        if (!z) {
            try {
                this.g.a();
            } catch (Throwable th) {
                if (!z) {
                    this.g.c();
                }
                throw th;
            }
        }
        ApplicationInfo applicationInfo = this.c.getApplicationInfo();
        StringBuilder sb = new StringBuilder();
        sb.append(applicationInfo.nativeLibraryDir);
        String str3 = File.pathSeparator;
        sb.append(str3);
        sb.append(str2);
        String sb2 = sb.toString();
        if (this.i != null) {
            sb2 = sb2 + str3 + this.i;
            FLOG.i("add path to native classloader " + sb2);
        }
        if (w != null) {
            sb2 = sb2 + str3 + applicationInfo.sourceDir + "!/lib/" + w;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            try {
                new File(str).setReadOnly();
            } catch (Exception unused) {
            }
        }
        ClassLoader pathClassLoader = !"6.0.1".equalsIgnoreCase(Build.VERSION.RELEASE) ? new PathClassLoader(str, sb2, d.class.getClassLoader()) : new DexClassLoader(str, str2, sb2, d.class.getClassLoader());
        if (!z) {
            this.g.c();
        }
        return pathClassLoader;
    }

    public <T> T a(Class<T> cls) throws SecException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bd4d3fd", new Object[]{this, cls});
        }
        Object obj = this.e.get(cls);
        if (obj != null) {
            return cls.cast(obj);
        }
        if (this.k != null) {
            str = this.k.e();
            if (str == null || str.length() == 0) {
                str = this.k.a(cls.getName());
            }
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            str = b((Class<?>) cls);
        }
        if (str == null || str.length() == 0) {
            throw new SecException(150);
        }
        ISGPluginInfo pluginInfo = getPluginInfo(str);
        if (pluginInfo != null) {
            Object obj2 = pluginInfo.getSGPluginEntry().getInterface(cls);
            if (obj2 != null) {
                this.e.put(cls, obj2);
                return cls.cast(obj2);
            }
            a(100045, 112, "", cls.getName(), str + f7l.BRACKET_START_STR + pluginInfo.getVersion() + f7l.BRACKET_END_STR, d(pluginInfo.getPluginPath()), "");
            throw new SecException(112);
        } else if (!this.m || !getMainPluginName().equals(str)) {
            return null;
        } else {
            throw new SecException(110);
        }
    }

    private void a(int i2, int i3, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d22e88ba", new Object[]{this, new Integer(i2), new Integer(i3), str, str2, str3, str4, str5});
            return;
        }
        UserTrackMethodJniBridge.addUtRecord("" + i2, i3, 0, com.alibaba.wireless.security.open.initialize.c.a(), 0L, str, str2, str3, str4, str5);
    }

    public void a(Context context, String str, String str2, boolean z, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9d04751", new Object[]{this, context, str, str2, new Boolean(z), objArr});
            return;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.c = context;
        this.j = str;
        this.l = com.alibaba.wireless.security.framework.utils.e.b(context);
        this.h = z;
        this.b = new ArrayList();
        UserTrackMethodJniBridge.init(this.c);
        if (str2 != null && !str2.isEmpty()) {
            this.i = str2;
        }
        try {
            f();
        } catch (SecException | Exception unused) {
        }
        this.p = this.o;
    }

    private void a(j jVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33cd1d3", new Object[]{this, jVar, str, str2});
        } else if (c(jVar.c)) {
            int b2 = this.k.b();
            String str3 = "PluginName=" + str;
            String str4 = "PluginVersion=" + str2;
            String str5 = "LibDeployVersion=" + b2;
            a(100048, 135, "Write dyInit.config", str3, str4, str5, "write success=" + com.alibaba.wireless.security.framework.utils.a.a(new File(this.q, "dyInit.config"), Integer.toString(b2)));
        }
    }

    public static /* synthetic */ void a(d dVar, int i2, int i3, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63544d7", new Object[]{dVar, new Integer(i2), new Integer(i3), str, str2, str3, str4, str5});
        } else {
            dVar.a(i2, i3, str, str2, str3, str4, str5);
        }
    }

    public static /* synthetic */ void a(d dVar, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de848abc", new Object[]{dVar, file});
        } else {
            dVar.a(file);
        }
    }

    private void a(File file) {
        String[] list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{this, file});
            return;
        }
        if (file.isDirectory() && (list = file.list()) != null) {
            for (String str : list) {
                a(new File(file, str));
            }
        }
        file.delete();
    }

    private void a(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fbe2fe9", new Object[]{this, file, str});
        } else {
            new Thread(new a(file, str), "SGCleanFile").start();
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (g() && str != null) {
            File file = new File(e(), "upds/libs/".concat(str));
            if (file.isDirectory()) {
                File file2 = new File(file, "FBD");
                if (!com.alibaba.wireless.security.framework.utils.a.a(file2, "1")) {
                    this.b.add(new h(file2));
                    return;
                }
                return;
            }
            this.b.add(new i(file));
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.o = true;
            this.m = true;
        } else {
            this.o = this.p;
            this.m = this.n;
        }
    }

    private boolean a() {
        com.alibaba.wireless.security.framework.b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        File file = new File(e(), "upds");
        File file2 = new File(file, "update.config");
        File file3 = new File(d(), "update.config");
        if (!file2.isFile() || (a2 = com.alibaba.wireless.security.framework.b.a(file2)) == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(file);
        String str = File.separator;
        sb.append(str);
        sb.append("libs");
        sb.append(str);
        sb.append(a2.b());
        File file4 = new File(sb.toString(), "FBD");
        HashMap<String, String> d = a2.d();
        HashMap<String, String> c2 = c();
        if (!file4.exists() && d != null && d.equals(c2)) {
            try {
                this.g.a();
                file3.delete();
                String a3 = com.alibaba.wireless.security.framework.utils.a.a(file2);
                if (a3 != null && com.alibaba.wireless.security.framework.utils.a.a(file3, a3)) {
                    return true;
                }
                this.b.add(new g(a3, file3, file2));
            } finally {
                this.g.c();
            }
        }
        return false;
    }

    public static /* synthetic */ boolean a(d dVar, String str, String str2, boolean z) throws SecException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a3f015f", new Object[]{dVar, str, str2, new Boolean(z)})).booleanValue() : dVar.d(str, str2, z);
    }

    private boolean a(File file, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c85ccf08", new Object[]{this, file, new Integer(i2)})).booleanValue() : new File(file, ".finish").isFile();
    }

    private boolean a(File file, File file2) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        Throwable th;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3abf71a", new Object[]{this, file, file2})).booleanValue();
        }
        File file3 = new File(file2.getAbsolutePath() + ".tmp." + Process.myPid());
        try {
            if (file3.exists()) {
                file3.delete();
            }
            FileChannel channel = new FileInputStream(file).getChannel();
            try {
                FileChannel channel2 = new FileOutputStream(file3).getChannel();
                try {
                    channel2.transferFrom(channel, 0L, channel.size());
                    channel.close();
                    try {
                        channel2.close();
                    } catch (Throwable th2) {
                        th = th2;
                        fileChannel2 = null;
                        fileChannel = channel2;
                        try {
                            FLOG.w("", th);
                            a(100047, 2, th.toString(), d(file.getAbsolutePath()), d(file2.getAbsolutePath()), d(file3.getAbsolutePath()), "");
                            if (fileChannel2 != null) {
                                try {
                                    fileChannel2.close();
                                } catch (Throwable th3) {
                                    FLOG.w("", th3);
                                }
                            }
                            if (fileChannel != null) {
                                try {
                                    fileChannel.close();
                                } catch (Throwable th4) {
                                    FLOG.w("", th4);
                                }
                            }
                            z = false;
                            file3.delete();
                            return z;
                        } catch (Throwable th5) {
                            if (fileChannel2 != null) {
                                try {
                                    fileChannel2.close();
                                } catch (Throwable th6) {
                                    FLOG.w("", th6);
                                }
                            }
                            if (fileChannel != null) {
                                try {
                                    fileChannel.close();
                                } catch (Throwable th7) {
                                    FLOG.w("", th7);
                                }
                            }
                            file3.delete();
                            throw th5;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    fileChannel2 = channel;
                }
            } catch (Throwable th9) {
                th = th9;
                fileChannel = null;
                fileChannel2 = channel;
            }
        } catch (Throwable th10) {
            th = th10;
            fileChannel2 = null;
            fileChannel = null;
        }
        if (file3.length() == file.length()) {
            if (file2.exists()) {
                if (file2.length() == file.length()) {
                    file3.delete();
                    return z;
                }
                file2.delete();
            }
            z = file3.renameTo(file2);
            file3.delete();
            return z;
        }
        z = false;
        file3.delete();
        return z;
    }

    private boolean a(String str, String str2) throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        for (Map.Entry<String, com.alibaba.wireless.security.framework.c> entry : this.d.entrySet()) {
            String key = entry.getKey();
            com.alibaba.wireless.security.framework.c value = entry.getValue();
            String a2 = value.a("reversedependencies");
            if (a2 != null) {
                String[] split = a2.split(";");
                for (int i2 = 0; i2 < split.length; i2++) {
                    String trim = split[i2].trim();
                    if (trim.length() != 0) {
                        String[] split2 = trim.split(":");
                        if (split2.length != 2) {
                            a(100041, 131, "nameVersionPair.length != 2", str + f7l.BRACKET_START_STR + str2 + f7l.BRACKET_END_STR, key + f7l.BRACKET_START_STR + value.getVersion() + f7l.BRACKET_END_STR, d(value.getPluginPath()), a2);
                            throw new SecException(131);
                        } else if (split2[0].equalsIgnoreCase(str) && b(str2, split2[1]) < 0) {
                            String str3 = "plugin " + str + f7l.BRACKET_START_STR + str2 + ") is not meet the reverse dependency of " + key + f7l.BRACKET_START_STR + value.getVersion() + "): " + split2[0] + f7l.BRACKET_START_STR + split2[1] + f7l.BRACKET_END_STR;
                            a(100041, 117, str3, d.class.getClassLoader().toString(), d(value.getPluginPath()), a2, "" + i2);
                            throw new SecException(str3, 117);
                        }
                    }
                }
                continue;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x015a, code lost:
        if (r21 == false) goto L_0x01a2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a0, code lost:
        if (r21 == false) goto L_0x01a2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a2, code lost:
        r16.g.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01a8, code lost:
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0173 A[Catch: all -> 0x017d, TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0011, B:6:0x0017, B:10:0x0040, B:14:0x004a, B:19:0x0052, B:21:0x0061, B:23:0x0067, B:25:0x006b, B:29:0x0078, B:32:0x00a8, B:35:0x00af, B:40:0x00c1, B:58:0x0100, B:65:0x0119, B:74:0x014f, B:97:0x01a2, B:85:0x0165, B:87:0x0173, B:91:0x0184, B:95:0x0198), top: B:112:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0184 A[Catch: all -> 0x017d, TRY_ENTER, TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0011, B:6:0x0017, B:10:0x0040, B:14:0x004a, B:19:0x0052, B:21:0x0061, B:23:0x0067, B:25:0x006b, B:29:0x0078, B:32:0x00a8, B:35:0x00af, B:40:0x00c1, B:58:0x0100, B:65:0x0119, B:74:0x014f, B:97:0x01a2, B:85:0x0165, B:87:0x0173, B:91:0x0184, B:95:0x0198), top: B:112:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean a(java.lang.String r17, java.lang.String r18, java.io.File r19, java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.d.a(java.lang.String, java.lang.String, java.io.File, java.lang.String, boolean):boolean");
    }
}
