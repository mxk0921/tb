package com.uc.webview.internal.setup;

import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.io.c;
import com.uc.webview.base.timing.StartupTimingKeys;
import com.uc.webview.base.timing.TraceEvent;
import com.uc.webview.export.extension.IRunningCoreInfo;
import com.uc.webview.export.extension.U4Engine;
import com.uc.webview.internal.setup.m;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class k extends e {
    final n b;
    public int c = 2;
    private final o d = new b((byte) 0);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends U4Engine.InitializerClient {
        private U4Engine.InitializerClient b;

        public a(U4Engine.InitializerClient initializerClient) {
            this.b = initializerClient;
        }

        @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
        public final void onDexReady(ClassLoader classLoader) {
            Log.d("Post.init", "onDexReady:".concat(String.valueOf(classLoader)));
        }

        @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
        public final void onDownloadFinish(String str, File file) {
            Log.d("Post.init", "onDownloadFinish:" + file.getAbsolutePath());
            com.uc.webview.base.timing.a.c(StartupTimingKeys.POST_UPDATE_SUCCESS);
        }

        @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
        public final void onDownloadProgress(int i) {
            Log.d("Post.init", "onDownloadProgress:".concat(String.valueOf(i)));
        }

        @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
        public final boolean onDownloadStart(String str, U4Engine.IDownloadHandle iDownloadHandle) {
            boolean z;
            U4Engine.InitializerClient initializerClient = this.b;
            if (initializerClient != null) {
                n nVar = k.this.b;
                z = initializerClient.onDownloadStart(nVar.h, nVar.i);
            } else {
                z = true;
            }
            if (z) {
                com.uc.webview.base.timing.a.c(StartupTimingKeys.POST_UPDATE_START);
            }
            return z;
        }

        @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
        public final void onExtractFinish(File file) {
            Log.d("Post.init", "onExtractFinish");
        }

        @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
        public final boolean onExtractStart(File file, File file2) {
            Log.d("Post.init", "onExtractStart:" + file2.getAbsolutePath());
            return true;
        }

        @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
        public final void onFailed(IRunningCoreInfo iRunningCoreInfo) {
            Log.d("Post.init", "onFailed:" + iRunningCoreInfo.toString());
        }

        @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
        public final void onInitStart(IRunningCoreInfo iRunningCoreInfo) {
            Log.d("Post.init", "onInitStart:" + iRunningCoreInfo.toString());
        }

        @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
        public final void onSuccess(IRunningCoreInfo iRunningCoreInfo) {
            Log.d("Post.init", "onSuccess:" + iRunningCoreInfo.toString());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b extends o {
        private b() {
        }

        @Override // com.uc.webview.internal.setup.o
        public final void a() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.setup.o
        public final boolean a(n nVar) {
            return true;
        }

        @Override // com.uc.webview.internal.setup.o
        public final l a(n nVar, m.a aVar) {
            return l.a(nVar);
        }
    }

    public k(n nVar) {
        this.b = nVar;
    }

    @Override // com.uc.webview.internal.setup.e
    public final void b() {
        String str;
        StringBuilder sb = new StringBuilder("continueInitCoreLibs ");
        l lVar = this.f14458a;
        if (lVar != null) {
            str = lVar.b();
        } else {
            str = "null";
        }
        sb.append(str);
        Log.d("Post.init", sb.toString());
        UCKnownException e = null;
        try {
            TraceEvent scoped = TraceEvent.scoped((int) StartupTimingKeys.POST_CONTINUE_INIT_LIBS);
            try {
                i.c(this.b.c);
                this.d.a(this.f14458a, this.c);
                if (scoped != null) {
                    scoped.close();
                }
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (UCKnownException e2) {
        } catch (Exception e3) {
            e2 = new UCKnownException(e3);
        } finally {
            a(e2);
        }
    }

    @Override // com.uc.webview.internal.setup.e
    public final String c() {
        return "Post.init";
    }

    @Override // com.uc.webview.internal.setup.e
    public final int d() {
        return StartupTimingKeys.POST_INITIALIZER;
    }

    @Override // com.uc.webview.internal.setup.e
    public final long e() {
        return GlobalSettings.getIntValue(163);
    }

    @Override // com.uc.webview.internal.setup.e
    public final n f() {
        return this.b;
    }

    @Override // com.uc.webview.internal.setup.e
    public final o g() {
        return this.d;
    }

    @Override // com.uc.webview.internal.setup.e, com.uc.webview.export.extension.U4Engine.Initializer
    public final U4Engine.Initializer setClient(U4Engine.InitializerClient initializerClient) {
        super.setClient(new a(initializerClient));
        return this;
    }

    @Override // com.uc.webview.internal.setup.e
    public final void a(UCKnownException uCKnownException) {
        String str;
        l lVar;
        boolean z = uCKnownException == null;
        StringBuilder sb = new StringBuilder("onFinished isSuccess:");
        sb.append(z);
        sb.append(", ");
        l lVar2 = this.f14458a;
        if (lVar2 != null) {
            str = lVar2.toString();
        } else {
            str = "null";
        }
        sb.append(str);
        Log.d("Post.init", sb.toString(), uCKnownException);
        if (this.f14458a != null) {
            o.c().b(this.f14458a.p());
        }
        if (z) {
            l lVar3 = this.f14458a;
            lVar3.a(lVar3.coreClassLoader());
            i.a(this.b.c, this.f14458a);
            c u = this.f14458a.u();
            if (u != null) {
                u.a();
            }
        }
        File t = (!z || (lVar = this.f14458a) == null) ? null : lVar.t();
        n nVar = this.b;
        new com.uc.webview.internal.setup.a(nVar.c, nVar).a(t).a(3000L);
        com.uc.webview.base.timing.a.a((int) StartupTimingKeys.SDK_INIT_READY, 1L);
        com.uc.webview.internal.stats.b.a(false);
    }
}
