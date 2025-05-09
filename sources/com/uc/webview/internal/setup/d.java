package com.uc.webview.internal.setup;

import android.content.Context;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.f;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.io.b;
import com.uc.webview.base.task.c;
import com.uc.webview.base.timing.StartupTimingKeys;
import com.uc.webview.base.zip.MultiThreadSevenZip;
import com.uc.webview.base.zip.a;
import com.uc.webview.export.extension.U4Engine;
import com.uc.webview.internal.e;
import java.io.File;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class d implements U4Engine.Extractor {

    /* renamed from: a  reason: collision with root package name */
    private Context f14451a = null;
    private U4Engine.Extractor.Client b = null;
    private boolean c = false;
    private boolean d = true;
    private boolean e = false;
    private File f = null;
    private File g = null;
    private UCKnownException h = null;

    public static /* synthetic */ void d(d dVar) {
        Log.d("Setup.extract", "doExtraction exists, not need to extract");
        if (!dVar.a()) {
            U4Engine.Extractor.Client client = dVar.b;
            if (client != null) {
                client.onFailed(dVar.h);
                return;
            }
            return;
        }
        dVar.c = true;
        U4Engine.Extractor.Client client2 = dVar.b;
        if (client2 != null) {
            client2.onExists(dVar.f, dVar.g);
        }
    }

    public static /* synthetic */ boolean e(d dVar) {
        Log.d("Setup.extract", "doExtraction start file: " + dVar.f.getAbsolutePath() + ", outDir:" + dVar.g.getAbsolutePath());
        U4Engine.Extractor.Client client = dVar.b;
        if (client != null) {
            return client.onStart(dVar.f, dVar.g);
        }
        return true;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Extractor
    public final U4Engine.Extractor setASync(boolean z) {
        this.d = z;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Extractor
    public final U4Engine.Extractor setClient(U4Engine.Extractor.Client client) {
        this.b = client;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Extractor
    public final U4Engine.Extractor setCompressedFile(File file) {
        this.f = file;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Extractor
    public final U4Engine.Extractor setContext(Context context) {
        this.f14451a = context;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Extractor
    public final U4Engine.Extractor setForceVerification(boolean z) {
        this.e = z;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Extractor
    public final U4Engine.Extractor setSpecifiedDir(File file) {
        this.g = file;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Extractor
    public final void start() throws UCKnownException {
        String str;
        if (this.f14451a == null) {
            ErrorCode.CONTEXT_IS_NULL.report();
        }
        if (EnvInfo.getContext() == null) {
            EnvInfo.a(this.f14451a);
        }
        File file = this.f;
        if (file == null || !file.exists()) {
            StringBuilder sb = new StringBuilder("error compressed lib:");
            File file2 = this.f;
            if (file2 != null) {
                str = file2.getAbsolutePath();
            } else {
                str = "null";
            }
            sb.append(str);
            Log.e("Setup.extract", sb.toString());
            ErrorCode.INVALID_COMPRESSED_LIB.report();
        }
        if (this.g == null) {
            File file3 = new File(PathUtils.e(this.f14451a), PathUtils.generateName(this.f));
            this.g = file3;
            com.uc.webview.base.io.d.a(file3);
        }
        c cVar = new c() { // from class: com.uc.webview.internal.setup.d.2
            @Override // com.uc.webview.base.task.c, java.util.concurrent.Callable
            public final /* synthetic */ c.C0833c call() throws Exception {
                return call();
            }

            @Override // com.uc.webview.base.task.c
            public final void d() {
                b bVar;
                a aVar = new a(d.this.f14451a, d.this.f, d.this.g);
                if (aVar.e.c()) {
                    d.d(d.this);
                } else if (d.e(d.this)) {
                    synchronized (PathUtils.a()) {
                        try {
                            try {
                                aVar.f.a();
                                if (aVar.e.c()) {
                                    Log.d("UnZipper", "unzip finished");
                                    aVar.e.a();
                                    if (!TextUtils.isEmpty(null)) {
                                        a.f14298a.remove(null);
                                    }
                                    bVar = aVar.f;
                                } else {
                                    com.uc.webview.base.io.d.a(aVar.d);
                                    com.uc.webview.base.io.c cVar2 = aVar.e;
                                    com.uc.webview.base.io.d.c("FlagMarker-ms", cVar2.b);
                                    com.uc.webview.base.io.d.b("FlagMarker-ms", cVar2.f14274a);
                                    File file4 = aVar.d;
                                    if (aVar.g) {
                                        file4 = new File(PathUtils.i(aVar.b), PathUtils.generateName(aVar.c));
                                        Log.d("UnZipper", "zipFile:" + aVar.c.getAbsolutePath());
                                        Log.d("UnZipper", "tempOutDir:" + file4.getAbsolutePath());
                                    }
                                    com.uc.webview.base.io.d.a(file4);
                                    String absolutePath = file4.getAbsolutePath();
                                    Set<String> set = a.f14298a;
                                    set.add(absolutePath);
                                    if (com.uc.webview.base.io.d.b(aVar.c)) {
                                        Log.d("UnZipper", "start un gzip");
                                        new a.C0836a(aVar.c, file4).a();
                                    } else {
                                        Log.d("UnZipper", "start un sevenzip");
                                        File file5 = aVar.c;
                                        int deccompress = new MultiThreadSevenZip().deccompress(aVar.b, file5.getAbsolutePath(), file4.getAbsolutePath());
                                        if (deccompress != 0) {
                                            Log.rInfo("UnZipper", "7z decode failed:" + deccompress + ", length:" + (file5.length() / 1024) + "KB, freeSize:" + com.uc.webview.base.io.d.d(file4) + ", zipFile:" + file5.getAbsolutePath() + ", outDir:" + file4.getAbsolutePath());
                                            if (28 == deccompress) {
                                                ErrorCode.DECOMPRESS_SEVENZIP_ERROR_NOSPC.report();
                                            }
                                            ErrorCode.DECOMPRESS_SEVENZIP_ERROR.report("7zError=" + String.valueOf(deccompress));
                                        }
                                    }
                                    Log.d("UnZipper", "unzip result: true");
                                    if (aVar.g) {
                                        a.a(file4, aVar.d);
                                    }
                                    aVar.e.a();
                                    if (!TextUtils.isEmpty(absolutePath)) {
                                        set.remove(absolutePath);
                                    }
                                    bVar = aVar.f;
                                }
                                bVar.b();
                            } catch (UCKnownException e) {
                                throw e;
                            } catch (Throwable th) {
                                if ((th.getCause() instanceof ErrnoException) && ((ErrnoException) th.getCause()).errno == OsConstants.ENOSPC) {
                                    ErrorCode.STORAGE_SPACE_NOT_ENOUGH.report();
                                }
                                throw new UCKnownException(th);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } else {
                    Log.d("Setup.extract", "cannot extract internal");
                }
            }

            @Override // com.uc.webview.base.task.c
            public final String e() {
                return "Setup.extract";
            }

            @Override // com.uc.webview.base.task.c
            public final int f() {
                return StartupTimingKeys.EXTRACTOR;
            }
        };
        cVar.f14283a = new c.b() { // from class: com.uc.webview.internal.setup.d.1
            @Override // com.uc.webview.base.task.c.b
            public final void a() {
                d.a(d.this, null);
            }

            @Override // com.uc.webview.base.task.c.b
            public final void a(UCKnownException uCKnownException) {
                d.a(d.this, uCKnownException);
            }
        };
        cVar.b = this.d;
        cVar.a();
    }

    private boolean a() {
        boolean z = false;
        if (!this.e) {
            return true;
        }
        try {
            U4Engine.Extractor.Client client = this.b;
            if (client == null || !f.a(U4Engine.Extractor.Client.class, client.getClass(), "onVerification", File.class, File.class)) {
                Log.d("Setup.extract", "doU4Verification");
                if (!e.f()) {
                    Log.d("Setup.extract", "doU4Verification start");
                    o.b().a(l.a(n.a(this.f14451a, this.f)), GlobalSettings.getIntValue(166));
                    Log.d("Setup.extract", "doU4Verification success");
                }
            } else {
                Log.d("Setup.extract", "doCustomVerification");
                if (!this.b.onVerification(this.f, this.g)) {
                    ErrorCode.DECOMPRESS_CUSTOM_VERIFICATION_FAILED.report();
                }
            }
        } catch (UCKnownException e) {
            this.h = e;
        } catch (Throwable th) {
            this.h = new UCKnownException(th);
        }
        if (this.h == null) {
            z = true;
        }
        Log.d("Setup.extract", "doVerification ".concat(z ? "success" : "failed"));
        return z;
    }

    public static /* synthetic */ void a(d dVar, UCKnownException uCKnownException) {
        U4Engine.Extractor.Client client;
        boolean z = uCKnownException == null;
        Log.d("Setup.extract", "doExtraction finish isSuccess:" + z + ", exists:" + dVar.c + ", mClient:" + dVar.b, uCKnownException);
        if (!dVar.c && (client = dVar.b) != null) {
            if (!z) {
                client.onFailed(uCKnownException);
            } else if (!dVar.a()) {
                dVar.b.onFailed(dVar.h);
            } else {
                dVar.b.onSuccess(dVar.g);
            }
        }
    }
}
