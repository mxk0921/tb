package com.uc.webview.internal.setup;

import android.text.TextUtils;
import com.android.alibaba.ip.server.InstantPatcher;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.f;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.io.c;
import com.uc.webview.base.io.d;
import com.uc.webview.export.Build;
import com.uc.webview.export.extension.ICoreVersion;
import com.uc.webview.export.extension.IRunningCoreInfo;
import java.io.File;
import tb.v7b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class l extends IRunningCoreInfo {
    static final /* synthetic */ boolean B = true;
    public String A;

    /* renamed from: a  reason: collision with root package name */
    private ClassLoader f14481a;
    private IRunningCoreInfo.FailedInfo b;
    protected boolean c;
    protected int d;
    protected int e;
    protected boolean f;
    protected boolean g;
    protected boolean h;
    protected boolean i;
    protected File j;
    protected File k;
    protected File l;
    protected File m;
    protected File n;
    protected c o;
    protected File p;
    protected String q;
    protected String r;
    protected String s;
    protected String t;
    protected String u;
    protected String v;
    protected String w;
    protected ICoreVersion x;
    protected boolean y;
    ClassLoader z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public final class a implements IRunningCoreInfo.FailedInfo {
        private final UCKnownException b;

        public a(UCKnownException uCKnownException) {
            this.b = uCKnownException;
        }

        @Override // com.uc.webview.export.extension.IRunningCoreInfo.FailedInfo
        public final int errorCode() {
            return this.b.errCode();
        }

        @Override // com.uc.webview.export.extension.IRunningCoreInfo.FailedInfo
        public final UCKnownException exception() {
            return this.b;
        }

        @Override // com.uc.webview.export.extension.IRunningCoreInfo.FailedInfo
        public final String reason() {
            return this.b.errMsg();
        }

        public final String toString() {
            return errorCode() + ":" + reason() + ":" + Log.a(exception().getCause());
        }
    }

    public l() {
        this.r = Build.CORE_VERSION;
        this.s = Build.CORE_TIME;
        this.b = null;
        this.A = null;
    }

    public static l a(n nVar) {
        return new l(nVar);
    }

    public final boolean A() {
        return this.y;
    }

    public final File B() {
        File file = this.j;
        if (file == null) {
            return file;
        }
        if (!GlobalSettings.getBoolValue(81)) {
            Log.d("RCI", "checkRawDex: use jar");
            return this.j;
        }
        File fileCoreRawDex = PathUtils.getFileCoreRawDex(this.l);
        if (fileCoreRawDex.exists()) {
            return fileCoreRawDex;
        }
        synchronized (PathUtils.a()) {
            try {
                if (d.a(this.j, InstantPatcher.CLASSES_DEX, this.l)) {
                    new File(this.l, InstantPatcher.CLASSES_DEX).renameTo(fileCoreRawDex);
                    if (fileCoreRawDex.exists()) {
                        return fileCoreRawDex;
                    }
                }
                Log.d("RCI", "loadCoreDex: failed and use jar");
                return this.j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        sb.append(c());
        sb.append(", ");
        File file = this.l;
        sb.append(file != null ? file.getPath() : "noroot");
        return sb.toString();
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(new String[]{"UNKNOWN", "NORMAL", "THIN", "THICK", "UPDATE"}[this.e]);
        } catch (Throwable unused) {
            sb.append(v7b.DEFAULT_HTTPS_ERROR_INVALID);
        }
        try {
            sb.append("_");
            sb.append(new String[]{"UK", "LT", "FL", "RI", "LD"}[this.d]);
        } catch (Throwable unused2) {
            sb.append("UK");
        }
        if (this.h) {
            sb.append(", first");
        }
        if (this.i) {
            sb.append(", retry");
        }
        if (this.f) {
            sb.append(", reuse");
        }
        if (this.g) {
            sb.append(", same");
        }
        if (!EnvInfo.is64Bit()) {
            sb.append(", 32b");
        }
        if (this.c != EnvInfo.c()) {
            sb.append(", itcg");
        }
        if (this.y) {
            sb.append(", skv");
        }
        if (!TextUtils.isEmpty(this.A)) {
            sb.append(this.A);
        }
        return sb.toString();
    }

    @Override // com.uc.webview.export.extension.IRunningCoreInfo
    public ClassLoader coreClassLoader() {
        return this.z;
    }

    @Override // com.uc.webview.export.extension.IRunningCoreInfo
    public ICoreVersion coreVersion() {
        return this.x;
    }

    public final String d() {
        return this.r;
    }

    public final String e() {
        return this.s;
    }

    public final int f() {
        return this.d;
    }

    @Override // com.uc.webview.export.extension.IRunningCoreInfo
    public IRunningCoreInfo.FailedInfo failedInfo() {
        return this.b;
    }

    public final boolean g() {
        int i = this.d;
        if (3 == i || 4 == i) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (2 == this.d) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if (4 == this.e) {
            return true;
        }
        return false;
    }

    @Override // com.uc.webview.export.extension.IRunningCoreInfo
    public int integrationType() {
        return this.e;
    }

    @Override // com.uc.webview.export.extension.IRunningCoreInfo
    public boolean isFirstUsed() {
        return this.h;
    }

    @Override // com.uc.webview.export.extension.IRunningCoreInfo
    public boolean isReUsed() {
        return this.f;
    }

    public final boolean j() {
        if (1 == this.e) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (j() || this.f) {
            return true;
        }
        c cVar = this.o;
        if (cVar == null || !cVar.c()) {
            return false;
        }
        return true;
    }

    public final boolean l() {
        return this.c;
    }

    @Override // com.uc.webview.export.extension.IRunningCoreInfo
    public String libPath() {
        File file = this.m;
        if (file != null) {
            return file.getAbsolutePath();
        }
        return null;
    }

    public final String m() {
        return this.t;
    }

    public final String n() {
        return this.u;
    }

    public final String o() {
        return this.v;
    }

    public final File p() {
        return this.j;
    }

    @Override // com.uc.webview.export.extension.IRunningCoreInfo
    public String path() {
        File file = this.l;
        if (file != null) {
            return file.getAbsolutePath();
        }
        return null;
    }

    public final File q() {
        return this.k;
    }

    public final File r() {
        return this.m;
    }

    public final File s() {
        return this.n;
    }

    @Override // com.uc.webview.export.extension.IRunningCoreInfo
    public ClassLoader sdkClassLoader() {
        return this.f14481a;
    }

    public final File t() {
        return this.l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RCI: ");
        sb.append(c());
        File file = this.j;
        String str = null;
        a(sb, "dex", file != null ? file.getPath() : null);
        File file2 = this.k;
        a(sb, "odex", file2 != null ? file2.getPath() : null);
        File file3 = this.l;
        a(sb, "rootDir", file3 != null ? file3.getPath() : null);
        File file4 = this.m;
        a(sb, "libDir", file4 != null ? file4.getPath() : null);
        File file5 = this.n;
        a(sb, "libFile", file5 != null ? file5.getPath() : null);
        File file6 = this.p;
        a(sb, "compressFile", file6 != null ? file6.getPath() : null);
        a(sb, "url", this.q);
        ClassLoader classLoader = this.f14481a;
        a(sb, "sdkLoader", classLoader != null ? classLoader.toString() : null);
        if (!this.c) {
            ClassLoader classLoader2 = this.z;
            a(sb, "coreLoader", classLoader2 != null ? classLoader2.toString() : null);
        }
        IRunningCoreInfo.FailedInfo failedInfo = this.b;
        if (failedInfo != null) {
            str = failedInfo.toString();
        }
        a(sb, "failed", str);
        return sb.toString();
    }

    public final c u() {
        return this.o;
    }

    public final File v() {
        return this.p;
    }

    public final String w() {
        return this.q;
    }

    public final boolean x() {
        return this.g;
    }

    public final void y() {
        this.g = true;
    }

    public final void z() {
        this.i = true;
    }

    public static l a(UCKnownException uCKnownException) {
        return new l().b(uCKnownException);
    }

    public final void a() {
        ClassLoader classLoader = l.class.getClassLoader();
        this.f14481a = classLoader;
        if (!this.c) {
            classLoader = null;
        }
        this.z = classLoader;
    }

    public final void a(File file) {
        if (!this.c) {
            this.j = PathUtils.getFileCoreDex(file);
            this.k = file;
        }
        File dirCoreLib = PathUtils.getDirCoreLib(file);
        this.m = dirCoreLib;
        this.n = PathUtils.getFileCoreLib(dirCoreLib);
        this.o = PathUtils.b(file);
    }

    private l(n nVar) {
        this.r = Build.CORE_VERSION;
        this.s = Build.CORE_TIME;
        this.b = null;
        this.A = null;
        this.c = nVar.f14485a;
        this.d = nVar.b;
        this.A = nVar.k;
        boolean z = true;
        this.e = 1;
        this.h = false;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.q = null;
        a();
        nVar.c();
        int i = nVar.j;
        if (i != 1) {
            int i2 = 3;
            if (i == 2) {
                File file = nVar.e;
                File file2 = nVar.f;
                Log.i("RCI", "configCompressedCore: " + file.getAbsolutePath());
                if (!file.exists()) {
                    ErrorCode.INVALID_COMPRESSED_LIB.report();
                }
                this.p = file;
                this.e = !this.c ? 2 : i2;
                if (file2 != null) {
                    this.l = file2;
                } else {
                    this.l = new File(PathUtils.e(EnvInfo.getContext()), PathUtils.generateName(file));
                }
                a(this.l);
                if (this.n.exists() && PathUtils.a(this.l).c()) {
                    z = false;
                }
                this.h = z;
            } else if (i == 3) {
                File file3 = nVar.g;
                Log.i("RCI", "configDecompressedCore: " + file3.getAbsolutePath());
                this.h = false;
                this.e = !this.c ? 2 : i2;
                this.l = file3;
                a(file3);
                File file4 = this.j;
                if ((file4 != null && !file4.exists()) || !this.n.exists()) {
                    ErrorCode.INVALID_DECOMPRESSED_DIR.report();
                }
            } else if (i != 4) {
                Log.e("RCI", "invalid configs for ".concat(String.valueOf(i)));
                ErrorCode.NEED_AT_LEAST_ONE_LIB_CONFIG.report();
            } else {
                String str = nVar.h;
                Log.i("RCI", "configUpdateCore: ".concat(String.valueOf(str)));
                this.h = true;
                this.e = 4;
                this.q = str;
            }
        } else {
            boolean b = EnvInfo.b(nVar.c);
            this.h = false;
            if (b) {
                File file5 = new File(EnvInfo.d());
                this.l = file5;
                this.m = file5;
                File fileCoreLib = PathUtils.getFileCoreLib(file5);
                this.n = fileCoreLib;
                if (!fileCoreLib.exists()) {
                    ErrorCode.INVALID_ALLIN_CORE.report();
                }
            }
        }
    }

    public final l b(UCKnownException uCKnownException) {
        this.b = new a(uCKnownException);
        return this;
    }

    public final void a(File file, File file2) {
        if (B || i()) {
            this.h = file != null;
            this.n = file;
            this.l = file2;
            a(file2);
            if (!TextUtils.isEmpty(this.q)) {
                d.b("upd", new File(this.l, PathUtils.b(this.q)));
                return;
            }
            return;
        }
        throw new AssertionError("Invalid integration type");
    }

    public final void a(ICoreVersion iCoreVersion) {
        this.x = iCoreVersion;
        this.t = iCoreVersion.version();
        this.u = this.x.buildTimestamp();
        this.v = this.x.minSupportVersion();
    }

    public final void a(ClassLoader classLoader) {
        try {
            ICoreVersion iCoreVersion = (ICoreVersion) f.a(Class.forName("com.uc.sdk_glue.extension.CoreVersionImpl", true, classLoader), "instance", (Class[]) null, (Object[]) null);
            if (iCoreVersion != null) {
                a(iCoreVersion);
            }
        } catch (Throwable th) {
            Log.w("RCI", "setCv failed", th);
        }
    }

    public final void a(boolean z) {
        this.y = z;
    }

    public final boolean a(l lVar) {
        if (lVar == null) {
            return false;
        }
        File file = this.m;
        if (file == null && lVar.m == null) {
            return true;
        }
        return file != null && file.equals(lVar.m);
    }

    private static void a(StringBuilder sb, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            sb.append("\n  ");
            sb.append(str);
            sb.append(": ");
            sb.append(str2);
        }
    }
}
