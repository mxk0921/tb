package com.uc.webview.internal.setup.download.impl;

import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.task.f;
import com.uc.webview.export.extension.IUrlDownloader;
import com.uc.webview.internal.setup.download.IDownloadHandle;
import com.uc.webview.internal.setup.download.impl.a;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import tb.m;
import tb.xg4;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DownloadHandle implements IDownloadHandle {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f14453a = new AtomicInteger(0);
    private f b = null;
    private IDownloadHandle.Client c = null;
    private a.C0844a d = null;
    private IUrlDownloader e = null;
    private String f = null;
    private File g = null;
    private File h = null;
    private long i = 0;
    private long j = 0;
    private long k = 0;

    private DownloadHandle() {
    }

    public static IDownloadHandle create() {
        return new DownloadHandle();
    }

    @Override // com.uc.webview.export.extension.U4Engine.IDownloadHandle
    public void cancel() {
        a();
    }

    @Override // com.uc.webview.internal.setup.download.IDownloadHandle
    public void delete() {
        IUrlDownloader iUrlDownloader = this.e;
        if (iUrlDownloader != null) {
            iUrlDownloader.delete();
        }
    }

    public void finalize() throws Throwable {
        a();
    }

    @Override // com.uc.webview.internal.setup.download.IDownloadHandle
    public long getRemoteLastModified() {
        return this.j;
    }

    @Override // com.uc.webview.internal.setup.download.IDownloadHandle
    public long getRemoteSize() {
        return this.i;
    }

    @Override // com.uc.webview.internal.setup.download.IDownloadHandle
    public File getSavedFile() {
        return this.h;
    }

    @Override // com.uc.webview.internal.setup.download.IDownloadHandle
    public String getUrl() {
        return this.f;
    }

    @Override // com.uc.webview.export.extension.U4Engine.IDownloadHandle
    public void restart() {
        cancel();
        a(0L);
    }

    @Override // com.uc.webview.internal.setup.download.IDownloadHandle
    public IDownloadHandle setClient(IDownloadHandle.Client client) {
        this.c = client;
        return this;
    }

    @Override // com.uc.webview.internal.setup.download.IDownloadHandle
    public IDownloadHandle setDownloader(IUrlDownloader iUrlDownloader) {
        this.e = iUrlDownloader;
        return this;
    }

    @Override // com.uc.webview.internal.setup.download.IDownloadHandle
    public IDownloadHandle setSpecifiedDir(File file) {
        this.g = file;
        return this;
    }

    @Override // com.uc.webview.internal.setup.download.IDownloadHandle
    public IDownloadHandle setUrl(String str) {
        this.f = str;
        return this;
    }

    @Override // com.uc.webview.internal.setup.download.IDownloadHandle
    public void start() {
        this.d = new a(this, (byte) 0);
        if (this.e == null) {
            Log.d("DlHandle", "checkConfigs use internal IUrlDownloader");
            com.uc.webview.internal.setup.download.impl.a aVar = new com.uc.webview.internal.setup.download.impl.a();
            aVar.f14456a = this.d;
            aVar.b = GlobalSettings.getIntValue(159);
            aVar.c = GlobalSettings.getIntValue(158);
            this.e = aVar;
        } else {
            Log.d("DlHandle", "checkConfigs use delegate IUrlDownloader");
        }
        a(0L);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends a.C0844a {
        private boolean b;

        private a() {
            this.b = false;
        }

        @Override // com.uc.webview.internal.setup.download.impl.a.C0844a
        public final boolean a(String str, long j, long j2) {
            this.b = true;
            if (DownloadHandle.this.c != null) {
                return DownloadHandle.this.c.onGetSizeInfo(str, j, j2);
            }
            return true;
        }

        @Override // com.uc.webview.export.extension.IUrlDownloader.Client
        public final void onFailed(String str, Throwable th) {
            Log.w("DlHandle", "DClient.onFailed msg:".concat(String.valueOf(str)), th);
            a(new UCKnownException(th));
        }

        @Override // com.uc.webview.export.extension.IUrlDownloader.Client
        public final void onProgressChanged(int i) {
            Log.d("DlHandle", "DClient.onProgressChanged:".concat(String.valueOf(i)));
            if (DownloadHandle.this.c != null) {
                DownloadHandle.this.c.onProgress(i);
            }
        }

        @Override // com.uc.webview.export.extension.IUrlDownloader.Client
        public final boolean onStart() {
            Log.d("DlHandle", "DClient.onStart");
            if (DownloadHandle.this.c != null) {
                return DownloadHandle.this.c.onStart(DownloadHandle.this.f);
            }
            return true;
        }

        @Override // com.uc.webview.export.extension.IUrlDownloader.Client
        public final void onSuccess(String str, long j, long j2) {
            Log.i("DlHandle", "DClient.onSuccess filePath:" + str + ", size:" + j);
            DownloadHandle.this.h = new File(str);
            DownloadHandle.this.i = j;
            DownloadHandle.this.j = j2;
            if (this.b || a(DownloadHandle.this.f, DownloadHandle.this.i, DownloadHandle.this.j)) {
                DownloadHandle.a(DownloadHandle.this, (UCKnownException) null);
                return;
            }
            Log.i("DlHandle", "DClient.onSuccess u4 exists size:" + DownloadHandle.this.i + "lastModified:" + DownloadHandle.this.j + ", url:" + DownloadHandle.this.f);
        }

        public /* synthetic */ a(DownloadHandle downloadHandle, byte b) {
            this();
        }

        @Override // com.uc.webview.internal.setup.download.impl.a.C0844a
        public final void a(File file, long j, long j2) {
            Log.d("DlHandle", "DClient.onFileExists:" + file.getAbsolutePath() + ", length:" + file.length() + ", remoteSize:" + j + ", remoteLastModified:" + j2);
            DownloadHandle.this.h = file;
            DownloadHandle.this.i = j;
            DownloadHandle.this.j = j2;
            DownloadHandle.a(DownloadHandle.this, (UCKnownException) null);
        }

        @Override // com.uc.webview.internal.setup.download.impl.a.C0844a
        public final void a(UCKnownException uCKnownException) {
            Log.d("DlHandle", "DClient.onFailed:" + uCKnownException.errMsg());
            DownloadHandle.a(DownloadHandle.this, uCKnownException);
        }
    }

    private void a() {
        synchronized (this) {
            try {
                f fVar = this.b;
                if (fVar != null) {
                    fVar.f14292a.quitSafely();
                }
                this.b = null;
            } catch (Throwable unused) {
            }
        }
    }

    private void a(long j) {
        Runnable runnable = new Runnable() { // from class: com.uc.webview.internal.setup.download.impl.DownloadHandle.1
            @Override // java.lang.Runnable
            public final void run() {
                DownloadHandle.a(DownloadHandle.this);
            }
        };
        synchronized (this) {
            try {
                if (this.b == null) {
                    this.b = new f(f.a("dl" + f14453a.getAndIncrement()));
                }
                this.b.b.postDelayed(runnable, j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void a(DownloadHandle downloadHandle) {
        Log.d("DlHandle", "startDownload url:" + downloadHandle.f);
        downloadHandle.e.start(downloadHandle.f, downloadHandle.g.getAbsolutePath(), downloadHandle.d);
    }

    public static /* synthetic */ void a(DownloadHandle downloadHandle, UCKnownException uCKnownException) {
        Throwable th;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = uCKnownException == null;
        try {
            if (z3) {
                IDownloadHandle.Client client = downloadHandle.c;
                if (client != null) {
                    client.onSuccess(downloadHandle.h, downloadHandle.i, downloadHandle.j);
                }
                downloadHandle.a();
            } else if (uCKnownException.errCode() == ErrorCode.UPDATE_DOWNLOAD_INTERRUPTED.code) {
                Log.w("DlHandle", "onInterrupted, do not retry");
                downloadHandle.a();
            } else {
                try {
                    long j = downloadHandle.k + m.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT;
                    downloadHandle.k = j;
                    if (j < xg4.DEFAULT_SMALL_MAX_AGE) {
                        Log.w("DlHandle", "onFailed retry after 3 mins", uCKnownException);
                        try {
                            downloadHandle.a(m.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT);
                        } catch (Throwable th2) {
                            th = th2;
                            z2 = true;
                            try {
                                Log.w("DlHandle", "finish failed", th);
                                if (!z3) {
                                    downloadHandle.delete();
                                }
                                if (!z) {
                                    downloadHandle.a();
                                    return;
                                }
                                return;
                            } catch (Throwable th3) {
                                if (z2) {
                                    downloadHandle.delete();
                                }
                                if (!z) {
                                    downloadHandle.a();
                                }
                                throw th3;
                            }
                        }
                    } else {
                        Log.w("DlHandle", "onFailed retry multi times and failed", uCKnownException);
                        IDownloadHandle.Client client2 = downloadHandle.c;
                        if (client2 != null) {
                            client2.onFailed(uCKnownException);
                        }
                        z = false;
                    }
                    downloadHandle.delete();
                    if (!z) {
                        downloadHandle.a();
                    }
                } catch (Throwable th4) {
                    th = th4;
                    z = false;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            z = false;
        }
    }
}
