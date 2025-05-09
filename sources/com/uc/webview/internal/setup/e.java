package com.uc.webview.internal.setup;

import android.content.Context;
import android.text.TextUtils;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.b;
import com.uc.webview.base.g;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.task.c;
import com.uc.webview.base.task.d;
import com.uc.webview.base.timing.StartupTimingKeys;
import com.uc.webview.base.timing.TraceEvent;
import com.uc.webview.export.extension.ICoreVersion;
import com.uc.webview.export.extension.IRunningCoreInfo;
import com.uc.webview.export.extension.IUrlDownloader;
import com.uc.webview.export.extension.U4Engine;
import com.uc.webview.internal.setup.download.IDownloadHandle;
import com.uc.webview.internal.setup.m;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class e implements U4Engine.Initializer, m.a {
    private final n b = n.a();
    private U4Engine.InitializerClient c = null;
    private IUrlDownloader d = null;

    /* renamed from: a  reason: collision with root package name */
    protected l f14458a = null;
    private boolean e = true;
    private int f = 0;
    private int g = 0;
    private UCKnownException h = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f14464a = new e();
    }

    static {
        Log.d("Setup.init", "prepare");
        d.a("initEnv", new Runnable() { // from class: com.uc.webview.internal.setup.e.1
            @Override // java.lang.Runnable
            public final void run() {
                o.b();
                o.e();
            }
        });
    }

    public e() {
        com.uc.webview.base.timing.a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        com.uc.webview.base.timing.a.c(StartupTimingKeys.EXTRACTOR_START);
        new d().setContext(f().c).setCompressedFile(f().e).setSpecifiedDir(f().f).setClient(new U4Engine.Extractor.Client() { // from class: com.uc.webview.internal.setup.e.3
            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final void onExists(File file, File file2) {
                com.uc.webview.base.timing.a.c(StartupTimingKeys.EXTRACTOR_EXISTS);
                e.this.b();
            }

            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final void onFailed(UCKnownException uCKnownException) {
                com.uc.webview.base.timing.a.a((int) StartupTimingKeys.EXTRACTOR_FAILED_CODE, uCKnownException.errCode());
                e.this.a(uCKnownException);
            }

            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final boolean onStart(File file, File file2) {
                e eVar = e.this;
                eVar.e = eVar.c != null ? e.this.c.onExtractStart(file, file2) : true;
                b.a("wk_ucbsExtractInter", String.valueOf(e.this.e));
                return e.this.e;
            }

            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final void onSuccess(File file) {
                com.uc.webview.base.timing.a.c(StartupTimingKeys.EXTRACTOR_SUCCESS);
                if (e.this.c != null) {
                    e.this.c.onExtractFinish(file);
                }
                e.this.b();
            }
        }).start();
    }

    private boolean i() {
        if (this.f14458a.x() && GlobalSettings.getBoolValue(89)) {
            Log.d(c(), "postInit: same core");
            return false;
        } else if (this.f14458a.h()) {
            Log.d(c(), "postInit: full cap");
            return false;
        } else if (this.f14458a.g()) {
            Log.d(c(), "postInit: db");
            return false;
        } else {
            Log.d(c(), "postInit: start");
            try {
                new k(f()).setClient(this.c).setDownloader(this.d).start();
                return true;
            } catch (Throwable th) {
                Log.w(c(), "postInit: failed", th);
                return false;
            }
        }
    }

    public int d() {
        return StartupTimingKeys.INITIALIZER;
    }

    public long e() {
        return 0L;
    }

    public n f() {
        return this.b;
    }

    public o g() {
        return o.b();
    }

    @Override // com.uc.webview.export.extension.U4Engine.Initializer
    public U4Engine.Initializer setAuthKey(String str) {
        Log.d(c(), "setAuthKey:".concat(String.valueOf(str)));
        return setAuthKey(new String[]{str});
    }

    @Override // com.uc.webview.export.extension.U4Engine.Initializer
    public U4Engine.Initializer setClient(U4Engine.InitializerClient initializerClient) {
        Log.d(c(), "setClient:".concat(String.valueOf(initializerClient)));
        this.c = initializerClient;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Initializer
    public U4Engine.Initializer setCompressedFile(File file) {
        String str;
        String c = c();
        StringBuilder sb = new StringBuilder("setCompressedFile:");
        if (file != null) {
            str = file.getAbsolutePath();
        } else {
            str = "null";
        }
        sb.append(str);
        Log.d(c, sb.toString());
        f().e = file;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Initializer
    public U4Engine.Initializer setContext(final Context context) {
        Log.d(c(), "setContext:".concat(String.valueOf(context)));
        f().c = context.getApplicationContext();
        EnvInfo.a(context);
        d.a("initLRCI", new Runnable() { // from class: com.uc.webview.internal.setup.e.5
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    PathUtils.d(context);
                    PathUtils.e(context);
                } catch (Throwable unused) {
                }
                i.b(context);
            }
        });
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Initializer
    public U4Engine.Initializer setDecompressedDir(File file) {
        String str;
        String c = c();
        StringBuilder sb = new StringBuilder("setDecompressedDir:");
        if (file != null) {
            str = file.getAbsolutePath();
        } else {
            str = "null";
        }
        sb.append(str);
        Log.d(c, sb.toString());
        f().g = file;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Initializer
    public U4Engine.Initializer setDownloader(IUrlDownloader iUrlDownloader) {
        Log.d(c(), "setDownloader:".concat(String.valueOf(iUrlDownloader)));
        this.d = iUrlDownloader;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Initializer
    public U4Engine.Initializer setSpecifiedDir(File file) {
        String str;
        String c = c();
        StringBuilder sb = new StringBuilder("setSpecifiedDir:");
        if (file != null) {
            str = file.getAbsolutePath();
        } else {
            str = "null";
        }
        sb.append(str);
        Log.d(c, sb.toString());
        f().f = file;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Initializer
    public U4Engine.Initializer setUrl(String str) {
        Log.d(c(), "setUrl:".concat(String.valueOf(str)));
        f().h = str;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Initializer
    public void start() throws UCKnownException {
        UCKnownException e;
        try {
            Log.d(c(), "start");
            g().a();
            f().b();
            c cVar = new c() { // from class: com.uc.webview.internal.setup.e.7
                @Override // com.uc.webview.base.task.c, java.util.concurrent.Callable
                public final /* synthetic */ c.C0833c call() throws Exception {
                    return call();
                }

                @Override // com.uc.webview.base.task.c
                public final void d() {
                    e.d(e.this);
                }

                @Override // com.uc.webview.base.task.c
                public final String e() {
                    return e.this.c();
                }

                @Override // com.uc.webview.base.task.c
                public final int f() {
                    return e.this.d();
                }
            };
            cVar.f14283a = new c.b() { // from class: com.uc.webview.internal.setup.e.6
                @Override // com.uc.webview.base.task.c.b
                public final void a(UCKnownException uCKnownException) {
                    e.this.a(uCKnownException);
                }
            };
            cVar.a(e());
            e = null;
        } catch (UCKnownException e2) {
            e = e2;
        } catch (Throwable th) {
            e = new UCKnownException(th);
        }
        if (e != null) {
            a(e);
            throw e;
        }
    }

    public static /* synthetic */ void d(e eVar) {
        EnvInfo.getContext();
        eVar.f14458a = eVar.g().a(eVar.f(), eVar);
        int intValue = GlobalSettings.getIntValue(157);
        eVar.f = intValue;
        if (intValue < 0) {
            eVar.f = 0;
        }
        U4Engine.InitializerClient initializerClient = eVar.c;
        if (initializerClient != null) {
            initializerClient.onInitStart(eVar.f14458a);
        }
        if (eVar.f14458a.isFirstUsed()) {
            if (eVar.f14458a.i()) {
                if (!com.uc.webview.internal.e.f()) {
                    Log.d(eVar.c(), "download core try use system webview");
                    eVar.a(3);
                }
                final IDownloadHandle iDownloadHandle = eVar.f().i;
                final String str = eVar.f().h;
                iDownloadHandle.setUrl(str).setSpecifiedDir(PathUtils.getDirCacheUpdate(eVar.f().c)).setDownloader(eVar.d).setClient(new IDownloadHandle.Client() { // from class: com.uc.webview.internal.setup.e.2
                    private File d = null;

                    private File a(long j, long j2) {
                        if (this.d == null) {
                            this.d = PathUtils.a(e.this.f().c, str, j, j2);
                            String c = e.this.c();
                            Log.d(c, "downloadExtractDir:" + this.d.getAbsolutePath() + ", for url:" + str);
                        }
                        return this.d;
                    }

                    @Override // com.uc.webview.internal.setup.download.IDownloadHandle.Client
                    public final void onFailed(UCKnownException uCKnownException) {
                        String c = e.this.c();
                        Log.w(c, "Download.onFailed:" + uCKnownException.errMsg());
                        if (uCKnownException.errCode() == ErrorCode.UPDATE_DOWNLOAD_INTERRUPTED.code) {
                            Log.w(e.this.c(), "Download.onInterrupted wait for restart");
                            return;
                        }
                        com.uc.webview.base.timing.a.a((int) StartupTimingKeys.UPDATE_FAILED_CODE, uCKnownException.errCode());
                        e.this.a(uCKnownException);
                    }

                    @Override // com.uc.webview.internal.setup.download.IDownloadHandle.Client
                    public final boolean onGetSizeInfo(String str2, long j, long j2) {
                        com.uc.webview.base.timing.a.c(StartupTimingKeys.UPDATE_HEAD_VALIDITY);
                        File a2 = a(j, j2);
                        if (!PathUtils.a(a2).c()) {
                            return true;
                        }
                        com.uc.webview.base.timing.a.c(StartupTimingKeys.UPDATE_EXISTS);
                        e.this.f().f = a2;
                        File a3 = o.b().a(e.this.f().c, false);
                        if (a3 == null || !a3.equals(a2)) {
                            Log.d(e.this.c(), "Download.onGetSizeInfo:u4 exists but new");
                            e.this.f14458a.a(null, a2);
                            e.this.b();
                        } else {
                            Log.d(e.this.c(), "Download.onGetSizeInfo:u4 exists");
                        }
                        return false;
                    }

                    @Override // com.uc.webview.internal.setup.download.IDownloadHandle.Client
                    public final void onProgress(int i) {
                        if (e.this.c != null) {
                            e.this.c.onDownloadProgress(i);
                        }
                    }

                    @Override // com.uc.webview.internal.setup.download.IDownloadHandle.Client
                    public final boolean onStart(String str2) {
                        boolean z;
                        Log.d(e.this.c(), "Download.onStart:".concat(String.valueOf(str2)));
                        if (e.this.c != null) {
                            z = e.this.c.onDownloadStart(str, iDownloadHandle);
                        } else {
                            z = true;
                        }
                        if (z) {
                            com.uc.webview.base.timing.a.c(StartupTimingKeys.UPDATE_START);
                        }
                        return z;
                    }

                    @Override // com.uc.webview.internal.setup.download.IDownloadHandle.Client
                    public final void onSuccess(File file, long j, long j2) {
                        File a2 = a(j, j2);
                        String c = e.this.c();
                        Log.d(c, "Download.onSuccess:" + file.getAbsolutePath() + ", extractDir:" + a2.getAbsolutePath());
                        if (e.this.c != null) {
                            e.this.c.onDownloadFinish(str, file);
                        }
                        e.this.f().e = file;
                        e.this.f().f = a2;
                        e.this.f14458a.a(file, a2);
                        com.uc.webview.base.timing.a.c(StartupTimingKeys.UPDATE_SUCCESS);
                        e.this.h();
                    }
                }).start();
                return;
            } else if (eVar.f().e != null) {
                eVar.h();
                return;
            }
        }
        eVar.b();
    }

    public void b() {
        UCKnownException e = null;
        try {
            try {
                g a2 = g.a();
                try {
                    Log.d(c(), "continueInitCoreLibs");
                    com.uc.webview.base.timing.a.c(StartupTimingKeys.CONTINUE_INIT_LIBS);
                    EnvInfo.getContext();
                    o g = g();
                    TraceEvent scoped = TraceEvent.scoped((int) StartupTimingKeys.LOAD_DEX);
                    ClassLoader a3 = g.a(this.f14458a);
                    U4Engine.InitializerClient initializerClient = this.c;
                    if (initializerClient != null) {
                        initializerClient.onDexReady(a3);
                    }
                    if (scoped != null) {
                        scoped.close();
                    }
                    TraceEvent scoped2 = TraceEvent.scoped((int) StartupTimingKeys.INIT_CORE_ENGINE);
                    g.a(this.f14458a, f().d);
                    U4Engine.InitializerClient initializerClient2 = this.c;
                    if (initializerClient2 != null) {
                        initializerClient2.onNativeReady(this.f14458a.r());
                    }
                    if (scoped2 != null) {
                        scoped2.close();
                    }
                    IRunningCoreInfo.Instance.set(this.f14458a);
                    if (a2 != null) {
                        a2.close();
                    }
                } catch (Throwable th) {
                    if (a2 != null) {
                        try {
                            a2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (UCKnownException e2) {
            } catch (Exception e3) {
                e2 = new UCKnownException(e3);
            }
        } finally {
            a(e2);
        }
    }

    public String c() {
        return "Setup.init";
    }

    public static e a() {
        return a.f14464a;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Initializer
    public U4Engine.Initializer setAuthKey(String[] strArr) {
        f().d = strArr;
        return this;
    }

    public void a(UCKnownException e) {
        final boolean z = e == null;
        String c = c();
        StringBuilder sb = new StringBuilder("onFinished isSuccess:");
        sb.append(z);
        sb.append(", coreInfo: ");
        l lVar = this.f14458a;
        sb.append(lVar != null ? lVar.b() : " null");
        Log.d(c, sb.toString(), e);
        if (z) {
            com.uc.webview.internal.e.a(3, 1);
            U4Engine.InitializerClient initializerClient = this.c;
            if (initializerClient != null) {
                initializerClient.onCoreTypeReady(com.uc.webview.internal.e.c(), 1);
            }
            o g = g();
            if (g.f14486a.a(4096, "SUCCESS", false) && !com.uc.webview.internal.e.e()) {
                com.uc.webview.internal.b.a();
                g.g().a(ICoreVersion.Instance.get());
                com.uc.webview.base.timing.a.c(StartupTimingKeys.INIT_FINISHED);
                g.i().onSdkReady();
            }
        } else if (!ErrorCode.REPEAT_INITIALIZATION.equals(e) || !com.uc.webview.internal.e.f()) {
            try {
                l lVar2 = this.f14458a;
                if (lVar2 == null) {
                    Log.d(c(), "tryReExtract: no rci");
                } else if (lVar2.j()) {
                    Log.d(c(), "tryReExtract: allin");
                } else if (f().g != null) {
                    Log.d(c(), "tryReExtract: specific dir");
                } else if (!ErrorCode.isErrorShouldReExtract(e.errCode())) {
                    c();
                    e.errMsg();
                    Log.b();
                } else if (!this.e && ErrorCode.VERIFY_LIB_FAILED.equals(e)) {
                    c();
                    Log.b();
                    ErrorCode.CUSTOM_EXTRACTION_AND_VERIFY_FAILED.report(e);
                } else if (this.f14458a.l() || !ErrorCode.LOAD_NATIVE_LIB_FAILED_AND_FILE_INVALID.equals(e)) {
                    UCKnownException uCKnownException = this.h;
                    if (uCKnownException == null || uCKnownException.errCode() != e.errCode()) {
                        this.h = e;
                        int i = this.g + 1;
                        this.g = i;
                        b.a("ucbsExtractRetry", String.valueOf(i));
                        if (this.g > this.f) {
                            String c2 = c();
                            Log.w(c2, "tryReExtract reach max limit:" + this.f + ", error:" + e.errMsg());
                            ErrorCode.EXTRACT_MULIT_TIMES_AND_ALWAYS_INIT_FAILED.report(e.errMsg());
                        }
                        String c3 = c();
                        Log.w(c3, "tryReExtract:" + this.g + ", max:" + this.f + ", error:" + e.errMsg());
                        o g2 = g();
                        if (g2.a(f())) {
                            com.uc.webview.base.io.d.a(c() + "-re", this.f14458a.t());
                            this.f14458a = g2.g();
                            if (ErrorCode.DECOMPRESS_SEVENZIP_ERROR_NOSPC.equals(e)) {
                                n nVar = this.b;
                                new com.uc.webview.internal.setup.a(nVar.c, nVar).h();
                            }
                            h();
                            return;
                        }
                    } else {
                        c();
                        e.errCode();
                        Log.b();
                    }
                } else {
                    c();
                    Log.b();
                }
            } catch (UCKnownException e2) {
                e = e2;
            } catch (Throwable th) {
                e = new UCKnownException(th);
            }
            a(2);
            o g3 = g();
            n f = f();
            if (g3.f14486a.a(8192, "FAILED", false)) {
                com.uc.webview.base.timing.a.c(StartupTimingKeys.INIT_FINISHED);
                if (e != null) {
                    int errCode = e.errCode();
                    com.uc.webview.base.timing.a.a((int) StartupTimingKeys.INIT_FAILED_CODE, errCode);
                    Log.rInfo("Setup.ctrl", "u4 init failed", e);
                    b.a("wk_ucbsInitFailed", e.toString());
                    String errMsg = e.errMsg();
                    if (!TextUtils.isEmpty(errMsg)) {
                        if (ErrorCode.DECOMPRESS_SEVENZIP_ERROR.equals(errCode) || ErrorCode.EXTRACT_MULIT_TIMES_AND_ALWAYS_INIT_FAILED.equals(errCode)) {
                            try {
                                com.uc.webview.base.timing.a.a((int) StartupTimingKeys.EXTRACTOR_7Z_FAILED_CODE, errMsg.substring(8, errMsg.length()));
                            } catch (Throwable unused) {
                            }
                        }
                        if (ErrorCode.isUnknownError(errCode) || ErrorCode.isErrorHasDetailMessage(errCode)) {
                            errMsg.replace('`', '@').replace('=', '@');
                            if (errMsg.length() > 128) {
                                errMsg = errMsg.substring(0, 128);
                            }
                            com.uc.webview.base.timing.a.a((int) StartupTimingKeys.INIT_FAILED_MESSAGE, errMsg);
                        }
                    }
                }
                synchronized (g3) {
                    try {
                        l lVar3 = g3.b;
                        if (lVar3 != null) {
                            lVar3.b(e);
                        } else {
                            g3.b = l.a(e);
                        }
                        IRunningCoreInfo.Instance.set(g3.b);
                        if (GlobalSettings.getBoolValue(80)) {
                            f h = f.h();
                            h.c = f;
                            h.d = g3.b;
                            h.a(1000L);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                com.uc.webview.internal.stats.b.a(true);
            }
        } else {
            a(false);
            return;
        }
        com.uc.webview.base.timing.a.a((int) StartupTimingKeys.RE_EXTRACT_COUNT, this.g);
        a(z);
        d.a("handleRCIF", new Runnable() { // from class: com.uc.webview.internal.setup.e.4
            @Override // java.lang.Runnable
            public final void run() {
                e.b(e.this, z);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void b(com.uc.webview.internal.setup.e r4, boolean r5) {
        /*
            com.uc.webview.internal.setup.n r0 = r4.f()
            android.content.Context r1 = r0.c
            r2 = 0
            com.uc.webview.internal.setup.l r3 = r4.f14458a     // Catch: all -> 0x0018
            if (r3 == 0) goto L_0x001e
            boolean r3 = r3.isReUsed()     // Catch: all -> 0x0018
            if (r3 == 0) goto L_0x001e
            if (r5 == 0) goto L_0x001a
            boolean r4 = r4.i()     // Catch: all -> 0x0018
            goto L_0x003a
        L_0x0018:
            r5 = move-exception
            goto L_0x0030
        L_0x001a:
            com.uc.webview.internal.setup.i.c(r1)     // Catch: all -> 0x0018
            goto L_0x0039
        L_0x001e:
            if (r5 == 0) goto L_0x0039
            java.lang.String r5 = r4.c()     // Catch: all -> 0x0018
            java.lang.String r3 = "prepare to saveLRCI"
            com.uc.webview.base.Log.d(r5, r3)     // Catch: all -> 0x0018
            com.uc.webview.internal.setup.l r5 = r4.f14458a     // Catch: all -> 0x0018
            com.uc.webview.internal.setup.i.a(r1, r5)     // Catch: all -> 0x0018
            goto L_0x0039
        L_0x0030:
            java.lang.String r4 = r4.c()
            java.lang.String r3 = "handleReuse failed"
            com.uc.webview.base.Log.w(r4, r3, r5)
        L_0x0039:
            r4 = 0
        L_0x003a:
            if (r4 != 0) goto L_0x0051
            com.uc.webview.internal.setup.a r4 = new com.uc.webview.internal.setup.a
            r4.<init>(r1, r0)
            r0 = 3000(0xbb8, double:1.482E-320)
            r4.a(r0)
            r4 = 4063745(0x3e0201, float:5.69452E-39)
            r0 = 1
            com.uc.webview.base.timing.a.a(r4, r0)
            com.uc.webview.internal.stats.b.a(r2)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.setup.e.b(com.uc.webview.internal.setup.e, boolean):void");
    }

    private void a(boolean z) {
        if (this.c != null) {
            try {
                IRunningCoreInfo iRunningCoreInfo = IRunningCoreInfo.Instance.get();
                if (z) {
                    this.c.onSuccess(iRunningCoreInfo);
                } else {
                    this.c.onFailed(iRunningCoreInfo);
                }
            } catch (Throwable th) {
                Log.rInfo(c(), "onFinished: client handle failed", th);
                if (z && GlobalSettings.getBoolValue(80)) {
                    f h = f.h();
                    h.c = f();
                    h.d = this.f14458a;
                    h.e = new UCKnownException(ErrorCode.EMBEDER_INIT_FINISHED_CALLBACK_FAILED, (String) null, th);
                    h.a(1000L);
                }
            }
        }
    }

    private void a(int i) {
        if (GlobalSettings.getBoolValue(95)) {
            Log.d(c(), "fallbackToSystemWebView");
            com.uc.webview.internal.e.a(2, i);
            U4Engine.InitializerClient initializerClient = this.c;
            if (initializerClient != null) {
                initializerClient.onCoreTypeReady(com.uc.webview.internal.e.c(), i);
            }
        }
    }

    @Override // com.uc.webview.internal.setup.m.a
    public final l a(l lVar, l lVar2) {
        U4Engine.InitializerClient initializerClient = this.c;
        if (initializerClient != null) {
            return (l) initializerClient.onDecideCore(lVar, lVar2);
        }
        return null;
    }
}
