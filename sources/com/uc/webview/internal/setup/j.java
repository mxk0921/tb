package com.uc.webview.internal.setup;

import android.content.Context;
import android.text.TextUtils;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.io.d;
import com.uc.webview.base.task.c;
import com.uc.webview.base.timing.StartupTimingKeys;
import com.uc.webview.export.extension.IUrlDownloader;
import com.uc.webview.export.extension.U4Engine;
import com.uc.webview.export.extension.UCPlayer;
import com.uc.webview.internal.e;
import com.uc.webview.internal.setup.download.IDownloadHandle;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class j implements UCPlayer.Updater {

    /* renamed from: a  reason: collision with root package name */
    private static AtomicBoolean f14475a = new AtomicBoolean(false);
    private Context b;
    private String c;
    private UCPlayer.UpdaterClient d;
    private IUrlDownloader e;
    private IDownloadHandle f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final j f14479a = new j((byte) 0);
    }

    public /* synthetic */ j(byte b) {
        this();
    }

    public static /* synthetic */ void e(j jVar) {
        Log.d("Setup.player", "odUpdating");
        jVar.f.setUrl(jVar.c).setSpecifiedDir(PathUtils.getDirCacheUpdate(jVar.b)).setDownloader(jVar.e).setClient(new IDownloadHandle.Client() { // from class: com.uc.webview.internal.setup.j.1
            private File b = null;

            private File a(long j, long j2) {
                if (this.b == null) {
                    File file = new File(PathUtils.f(j.this.b), PathUtils.generateName(j.this.c, j, j2));
                    this.b = file;
                    d.a(file);
                    Log.d("Setup.player", "downloadExtractDir:" + this.b.getAbsolutePath() + ", for url:" + j.this.c);
                }
                return this.b;
            }

            @Override // com.uc.webview.internal.setup.download.IDownloadHandle.Client
            public final void onFailed(UCKnownException uCKnownException) {
                Log.w("Setup.player", "Download.onFailed:" + uCKnownException.errMsg());
                j.a(j.this, (File) null, uCKnownException);
            }

            @Override // com.uc.webview.internal.setup.download.IDownloadHandle.Client
            public final boolean onGetSizeInfo(String str, long j, long j2) {
                boolean z;
                if (!PathUtils.a(a(j, j2)).c()) {
                    Log.d("Setup.player", "Download.canReuse url is updated and need download");
                    z = false;
                } else {
                    z = j.b(this.b);
                }
                if (!z) {
                    return true;
                }
                Log.d("Setup.player", "Download.onGetSizeInfo:u4 exists");
                j.a(j.this, this.b, (UCKnownException) null);
                return false;
            }

            @Override // com.uc.webview.internal.setup.download.IDownloadHandle.Client
            public final void onProgress(int i) {
                if (j.this.d != null) {
                    j.this.d.onDownloadProgress(i);
                }
            }

            @Override // com.uc.webview.internal.setup.download.IDownloadHandle.Client
            public final boolean onStart(String str) {
                Log.d("Setup.player", "Download.onStart:".concat(String.valueOf(str)));
                if (j.this.d == null) {
                    return true;
                }
                return j.this.d.onDownloadStart(j.this.c, j.this.f);
            }

            @Override // com.uc.webview.internal.setup.download.IDownloadHandle.Client
            public final void onSuccess(File file, long j, long j2) {
                File a2 = a(j, j2);
                Log.d("Setup.player", "Download.onSuccess:" + file.getAbsolutePath() + ", extractDir:" + a2.getAbsolutePath());
                if (j.this.d != null) {
                    j.this.d.onDownloadFinish(j.this.c, file);
                }
                j.a(j.this, file, a2);
            }
        }).start();
    }

    @Override // com.uc.webview.export.extension.UCPlayer.Updater
    public final UCPlayer.Updater setClient(UCPlayer.UpdaterClient updaterClient) {
        this.d = updaterClient;
        return this;
    }

    @Override // com.uc.webview.export.extension.UCPlayer.Updater
    public final UCPlayer.Updater setContext(Context context) {
        Context context2;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.b = context2;
        return this;
    }

    @Override // com.uc.webview.export.extension.UCPlayer.Updater
    public final UCPlayer.Updater setDownloader(IUrlDownloader iUrlDownloader) {
        this.e = iUrlDownloader;
        return this;
    }

    @Override // com.uc.webview.export.extension.UCPlayer.Updater
    public final UCPlayer.Updater setUrl(String str) {
        this.c = str;
        return this;
    }

    @Override // com.uc.webview.export.extension.UCPlayer.Updater
    public final void start() throws UCKnownException {
        IDownloadHandle create = IDownloadHandle.Instance.create();
        this.f = create;
        if (create == null) {
            Log.w("Setup.player", "update feature is disabled, please update u4sdk or choose other init type");
            ErrorCode.UPDATE_FEATURE_DISABLED.report();
        }
        if (f14475a.getAndSet(true)) {
            ErrorCode.UPDATE_INIT_DUPLICATED.report();
        }
        if (TextUtils.isEmpty(this.c)) {
            ErrorCode.UPDATE_INVALID_URL.report();
        }
        c cVar = new c() { // from class: com.uc.webview.internal.setup.j.4
            @Override // com.uc.webview.base.task.c, java.util.concurrent.Callable
            public final /* synthetic */ c.C0833c call() throws Exception {
                return call();
            }

            @Override // com.uc.webview.base.task.c
            public final void d() {
                if (e.e()) {
                    ErrorCode.UPDATE_FAILED_BECAUSE_FALLBACK_SYSTEM.report();
                }
                if (!GlobalSettings.getBoolValue(100)) {
                    ErrorCode.UPDATE_UC_PLAYER_DISABLED.report();
                }
                j.e(j.this);
            }

            @Override // com.uc.webview.base.task.c
            public final String e() {
                return "Setup.player";
            }

            @Override // com.uc.webview.base.task.c
            public final int f() {
                return StartupTimingKeys.PLAYER_INITIALIZER;
            }
        };
        cVar.f14283a = new c.b() { // from class: com.uc.webview.internal.setup.j.3
            @Override // com.uc.webview.base.task.c.b
            public final void a(UCKnownException uCKnownException) {
                j.a(j.this, (File) null, uCKnownException);
            }
        };
        cVar.a();
    }

    private j() {
        this.d = null;
        this.e = null;
        this.f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(File file) {
        return new File(file, "libu3player.so").exists();
    }

    public static j a() {
        return a.f14479a;
    }

    public static void a(String str) {
        Log.d("Setup.player", "updateLibPath:".concat(String.valueOf(str)));
        GlobalSettings.set(199, "so_dir: ".concat(String.valueOf(str)));
    }

    public static /* synthetic */ void a(j jVar, File file, File file2) {
        U4Engine.createExtractor().setContext(jVar.b).setCompressedFile(file).setSpecifiedDir(file2).setClient(new U4Engine.Extractor.Client() { // from class: com.uc.webview.internal.setup.j.2
            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final void onExists(File file3, File file4) {
                j.a(j.this, file4, (UCKnownException) null);
            }

            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final void onFailed(UCKnownException uCKnownException) {
                j.a(j.this, (File) null, uCKnownException);
            }

            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final boolean onStart(File file3, File file4) {
                return true;
            }

            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final void onSuccess(File file3) {
                j.a(j.this, file3, (UCKnownException) null);
            }
        }).start();
    }

    public static /* synthetic */ void a(j jVar, File file, UCKnownException e) {
        if (e == null) {
            try {
                if (!b(file)) {
                    ErrorCode.UPDATE_MISSING_UCPLAYER_SO.report();
                }
            } catch (UCKnownException e2) {
                e = e2;
            } catch (Throwable th) {
                e = new UCKnownException(th);
            }
        }
        boolean z = e == null;
        Log.d("Setup.player", "onFinished isSuccess:" + z + ", mClient:" + jVar.d, e);
        if (z) {
            a(file.getAbsolutePath());
            jVar.d.onSuccess(file.getAbsolutePath());
            return;
        }
        jVar.d.onFailed(e);
    }
}
