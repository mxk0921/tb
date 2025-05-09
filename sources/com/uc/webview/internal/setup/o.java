package com.uc.webview.internal.setup;

import android.content.Context;
import com.taobao.artc.internal.ArtcParams;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.b;
import com.uc.webview.base.f;
import com.uc.webview.base.i;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.task.c;
import com.uc.webview.base.timing.StartupTimingKeys;
import com.uc.webview.base.timing.TraceEvent;
import com.uc.webview.export.Build;
import com.uc.webview.export.extension.ICoreVersion;
import com.uc.webview.export.extension.IRunningCoreInfo;
import com.uc.webview.internal.e;
import com.uc.webview.internal.interfaces.IStartupController;
import com.uc.webview.internal.setup.m;
import com.uc.webview.internal.setup.p;
import com.uc.webview.internal.setup.verify.d;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class o {
    static final /* synthetic */ boolean c = true;

    /* renamed from: a  reason: collision with root package name */
    public final h f14486a = new h();
    private final Object d = new Object();
    private ClassLoader e = o.class.getClassLoader();
    l b = null;
    private boolean f = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final o f14487a;
        public static final p b;
        public static final c c;

        static {
            o oVar = new o();
            f14487a = oVar;
            b = new p(oVar);
            c = new c(oVar);
        }
    }

    public static o b() {
        return a.f14487a;
    }

    public static p c() {
        return a.b;
    }

    public static c d() {
        return a.c;
    }

    public static void e() {
        EnvInfo.is64Bit();
        EnvInfo.h();
        b.a();
        Log.rInfo("Setup.ctrl", "wk_ucCoreInterfaceVersion: ".concat("5.18.6.0_250225095214_8d89a58f764487f68071cf577b4218096789d6f0"));
        b.a("wk_ucCoreInterfaceVersion", "5.18.6.0_250225095214_8d89a58f764487f68071cf577b4218096789d6f0");
        a.c.a();
    }

    public static /* synthetic */ void j() {
        ICoreVersion iCoreVersion = ICoreVersion.Instance.get();
        if (iCoreVersion != null) {
            Build.UCM_VERSION = iCoreVersion.version();
            Build.UCM_SUPPORT_SDK_MIN = iCoreVersion.minSupportVersion();
            Build.Version.API_LEVEL = iCoreVersion.apiLevel();
            Build.CORE_VERSION = iCoreVersion.version();
            Build.CORE_TIME = iCoreVersion.buildTimestamp();
            Log.d("Setup.ctrl", "versionInfo {\n  ucbs: " + Build.Version.NAME + "_" + Build.TIME + "\n  impl: " + Build.UCM_VERSION + "_" + Build.CORE_TIME + "\n  apiLevel: " + Build.Version.API_LEVEL + "\n  minSupport: " + Build.UCM_SUPPORT_SDK_MIN + "\n}");
        }
    }

    public final boolean f() {
        return this.f14486a.a(32);
    }

    public final l g() {
        l lVar;
        synchronized (this) {
            lVar = this.b;
        }
        return lVar;
    }

    public final ClassLoader h() {
        if (!this.f14486a.a(128)) {
            Log.w("Setup.ctrl", "getCoreCL maybe error because of not inited", new Throwable());
        }
        return this.e;
    }

    public final IStartupController i() {
        if (!this.f14486a.a(128)) {
            Log.w("Setup.ctrl", "getCoreCtrl maybe error because of not inited", new Throwable());
        }
        return IStartupController.Instance.get();
    }

    public final File a(Context context, boolean z) {
        IRunningCoreInfo iRunningCoreInfo;
        i a2;
        if (e.f() || z) {
            iRunningCoreInfo = IRunningCoreInfo.Instance.get();
        } else {
            iRunningCoreInfo = g();
            if (iRunningCoreInfo == null && (a2 = i.a(context)) != null && a2.f14471a) {
                iRunningCoreInfo = a2;
            }
        }
        if (iRunningCoreInfo == null) {
            return null;
        }
        return new File(iRunningCoreInfo.path());
    }

    public synchronized l a(n nVar, m.a aVar) {
        TraceEvent scoped;
        l lVar;
        scoped = TraceEvent.scoped((int) StartupTimingKeys.CREATE_RUNNING_CORE_INFO);
        synchronized (this) {
            try {
                if (this.b != null) {
                    ErrorCode.REPEAT_INITIALIZATION.report();
                }
                m mVar = new m(nVar, aVar, false);
                l lVar2 = mVar.f14483a;
                this.b = lVar2;
                this.f = lVar2.A();
                Log.d("Setup.ctrl", "createCoreInfo reason:" + mVar.b + ", RCI: " + this.b.b());
                lVar = this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
        if (scoped != null) {
            scoped.close();
        }
        return lVar;
    }

    public void a() {
        this.f14486a.a(32, "STARTED", false);
    }

    public boolean a(n nVar) {
        if (this.f14486a.a(2048) || this.f14486a.a(4096) || this.f14486a.a(8192) || this.f14486a.a(128)) {
            Log.w("Setup.ctrl", "restStatus: not support for " + this.f14486a.b.get());
            return false;
        }
        Log.d("Setup.ctrl", "restStatus to STARTED");
        this.f14486a.b.set(32);
        synchronized (this) {
            this.e = null;
            this.f = false;
            l a2 = l.a(nVar);
            this.b = a2;
            a2.z();
            Log.i("Setup.ctrl", "createReExtractCoreInfo: {\n" + this.b.toString() + "\n}");
        }
        return true;
    }

    private static void a(File file, File file2, File file3) {
        if (file != null) {
            GlobalSettings.set(174, file.getAbsolutePath());
            GlobalSettings.set((int) ArtcParams.SD180pVideoParams.HEIGHT, file2.getAbsolutePath());
        }
        GlobalSettings.set(175, file3 == null ? "" : file3.getAbsolutePath());
    }

    public final synchronized ClassLoader a(l lVar) {
        String str;
        try {
            if (!this.f14486a.a(128)) {
                final File p = lVar.p();
                File q = lVar.q();
                File r = lVar.r();
                ClassLoader classLoader = o.class.getClassLoader();
                c cVar = null;
                if (p != null) {
                    boolean z = c;
                    if (!z && !p.exists()) {
                        throw new AssertionError();
                    }
                    str = "thin";
                    ClassLoader a2 = a.b.a(p);
                    if (a2 != null) {
                        File B = lVar.B();
                        this.e = a2;
                        a(B, q, r);
                        if (!z && this.f14486a.a(64)) {
                            throw new AssertionError();
                        }
                        this.f14486a.a(64, "DEX_VF", false);
                    } else {
                        final File t = lVar.t();
                        if (!this.f && !this.f14486a.a(64)) {
                            final int a3 = d.a();
                            if (d.a(a3)) {
                                Log.d("Setup.ctrl", "vfDex disabled");
                            } else {
                                cVar = new c() { // from class: com.uc.webview.internal.setup.o.2
                                    @Override // com.uc.webview.base.task.c, java.util.concurrent.Callable
                                    public final /* synthetic */ c.C0833c call() throws Exception {
                                        return call();
                                    }

                                    @Override // com.uc.webview.base.task.c
                                    public final void d() {
                                        o.a(o.this, t, p, a3);
                                    }

                                    @Override // com.uc.webview.base.task.c
                                    public final String e() {
                                        return "Setup.ctrl.vfDex";
                                    }
                                }.a();
                            }
                        }
                        File B2 = lVar.B();
                        a(B2, q, r);
                        this.e = i.a(B2, q, r, classLoader);
                        a(cVar);
                    }
                    this.b.z = this.e;
                } else {
                    str = "thick";
                    this.e = classLoader;
                    a((File) null, (File) null, r);
                }
                Log.rInfo("Setup.ctrl", str + ", loadCoreDex finished classLoader: " + this.e);
            }
            if (this.f14486a.a(128, "DEX_READY", false)) {
                a.b.f14488a.set(true);
                f.a(this.e);
                i();
                com.uc.webview.base.task.d.a(new c() { // from class: com.uc.webview.internal.setup.o.1
                    @Override // com.uc.webview.base.task.c, java.util.concurrent.Callable
                    public final /* synthetic */ c.C0833c call() throws Exception {
                        return call();
                    }

                    @Override // com.uc.webview.base.task.c
                    public final void d() {
                        com.uc.webview.internal.b.a();
                        o.j();
                    }

                    @Override // com.uc.webview.base.task.c
                    public final String e() {
                        return "dexReady";
                    }

                    @Override // com.uc.webview.base.task.c
                    public final int f() {
                        return StartupTimingKeys.INIT_CORE_FACTORY;
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.e;
    }

    public final synchronized void a(l lVar, String[] strArr) {
        try {
            if (!this.f14486a.a(2048)) {
                final File r = lVar.r();
                String absolutePath = r != null ? r.getAbsolutePath() : "";
                p pVar = a.b;
                if (r != null) {
                    System.currentTimeMillis();
                    synchronized (p.b.f14490a) {
                        p.b bVar = pVar.c;
                        if (bVar != null) {
                            int i = bVar.b;
                            if (i != 2) {
                                if (i == 1) {
                                    if (!r.equals(bVar.c)) {
                                        Log.e("Setup.prl", "csLib unmatched libDir, now:" + r + ", loaded:" + pVar.c.c);
                                        ErrorCode.LOAD_NATIVE_LIB_NOT_MATCH_WITH_PRELOAD.report();
                                    }
                                }
                            }
                        }
                    }
                }
                final File t = lVar.t();
                c cVar = null;
                if (!this.f && !this.f14486a.a(1024)) {
                    final int a2 = d.a();
                    if (d.a(a2)) {
                        Log.d("Setup.ctrl", "vfLib disabled");
                    } else {
                        cVar = new c() { // from class: com.uc.webview.internal.setup.o.3
                            @Override // com.uc.webview.base.task.c, java.util.concurrent.Callable
                            public final /* synthetic */ c.C0833c call() throws Exception {
                                return call();
                            }

                            @Override // com.uc.webview.base.task.c
                            public final void d() {
                                o oVar = o.this;
                                oVar.a(t, r, a2, oVar.h());
                            }

                            @Override // com.uc.webview.base.task.c
                            public final String e() {
                                return "Setup.ctrl.vfLib";
                            }
                        }.a();
                    }
                }
                d.a(strArr, this.f);
                a(cVar);
                try {
                    i().initCoreEngine(EnvInfo.getContext());
                } catch (UCKnownException e) {
                    if (ErrorCode.LOAD_NATIVE_LIB_FAILED.equals(e)) {
                        if (this.f) {
                            if (com.uc.webview.base.io.d.a(lVar.t(), lVar.l())) {
                                d.a(lVar.t(), lVar.r(), 2, lVar.coreClassLoader(), true);
                            } else {
                                Log.d("Setup.ctrl", "initNL failed: maybe no files");
                                throw e;
                            }
                        }
                        try {
                            Log.d("Setup.ctrl", "initNL: retry");
                            i().initCoreEngine(EnvInfo.getContext());
                        } catch (UCKnownException e2) {
                            Log.d("Setup.ctrl", "initNL: retry failed", e2);
                            if (ErrorCode.LOAD_NATIVE_LIB_FAILED.equals(e2)) {
                                d.a(lVar);
                            }
                            throw e2;
                        }
                    } else {
                        Log.d("Setup.ctrl", "initNL failed: other exception");
                        throw e;
                    }
                }
                Log.i("Setup.ctrl", "initCoreEngine finished path:".concat(String.valueOf(absolutePath)));
                if (this.f14486a.a(2048, "ENGINE_INITED", false)) {
                    a.b.b.set(true);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(l lVar, int i) {
        File t = lVar.t();
        File r = lVar.r();
        ClassLoader a2 = a.b.a(lVar, i, null);
        if (a2 == null) {
            a2 = o.class.getClassLoader();
        }
        lVar.z = a2;
        Log.d("Setup.ctrl", "preVerifyDexAndLib " + lVar.toString());
        a(t, r, i, a2);
    }

    public static boolean a(File file, boolean z, Object[] objArr) {
        Log.d("Setup.ctrl", "verifyCoreFiles target:" + file + ", forceVerify:" + z);
        if (file == null) {
            return false;
        }
        File d = file.isFile() ? PathUtils.d(file) : file;
        File file2 = file.isFile() ? file : null;
        boolean exists = PathUtils.getFileCoreDex(d).exists();
        boolean z2 = !exists;
        Log.d("Setup.ctrl", "verifyCoreFiles rootDir:" + d + ", targetFile:" + file2);
        try {
            l a2 = l.a(n.a(z2, d, 1));
            int i = z ? 2 : 1;
            ClassLoader a3 = a.b.a(a2, i, objArr);
            if (!file.isFile() || !file.equals(a2.p())) {
                return d.a(d, file2, i, a3, objArr);
            }
            Log.w("Setup.ctrl", "verifyCoreFiles dex is " + exists);
            return exists && a3 != null;
        } catch (Throwable unused) {
            if (objArr != null && objArr.length > 0) {
                objArr[1] = 1;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(File file, File file2, int i, ClassLoader classLoader) {
        synchronized (this.d) {
            try {
                if (this.f14486a.a(1024)) {
                    Log.d("Setup.ctrl", "verifyLib had finished");
                    return;
                }
                d.a(file, file2, i, classLoader, false);
                this.f14486a.a(1024, "LIB_VF", false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void a(c cVar) {
        if (cVar != null) {
            cVar.b();
        }
    }

    public final void a(int i, boolean z) {
        if (256 == i || 512 == i) {
            this.f14486a.a(i, 512 == i ? "SCLFA" : "SCLF", true);
        } else {
            a.c.a(i, z);
        }
    }

    public static /* synthetic */ void a(o oVar, File file, File file2, int i) {
        synchronized (oVar.d) {
            try {
                if (oVar.f14486a.a(64)) {
                    Log.d("Setup.ctrl", "verifyDex had finished");
                    return;
                }
                d.a(EnvInfo.getContext(), file, file2, i);
                oVar.f14486a.a(64, "DEX_VF", false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
