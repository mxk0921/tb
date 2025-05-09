package com.uc.webview.internal.setup.download.impl;

import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.io.d;
import com.uc.webview.export.extension.IUrlDownloader;
import com.uc.webview.internal.setup.download.impl.b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class a implements IUrlDownloader, b.a {
    private String d = null;

    /* renamed from: a  reason: collision with root package name */
    C0844a f14456a = null;
    int b = 0;
    int c = 0;
    private File e = null;
    private File f = null;
    private com.uc.webview.base.io.b g = null;
    private int h = 0;
    private long i = 0;
    private long j = 0;
    private long k = 0;

    /* compiled from: Taobao */
    /* renamed from: com.uc.webview.internal.setup.download.impl.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class C0844a extends IUrlDownloader.Client {
        public void a(UCKnownException uCKnownException) {
        }

        public void a(File file, long j, long j2) {
        }

        public boolean a(String str, long j, long j2) {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[Catch: all -> 0x001f, UCKnownException -> 0x0022, TryCatch #3 {UCKnownException -> 0x0022, all -> 0x001f, blocks: (B:3:0x0006, B:5:0x0012, B:7:0x0018, B:14:0x0026, B:15:0x0049, B:17:0x005b, B:19:0x0062, B:21:0x00b4, B:23:0x00bc, B:38:0x013c, B:39:0x0141, B:41:0x0188, B:42:0x018d, B:43:0x01a3), top: B:55:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[Catch: all -> 0x001f, UCKnownException -> 0x0022, TryCatch #3 {UCKnownException -> 0x0022, all -> 0x001f, blocks: (B:3:0x0006, B:5:0x0012, B:7:0x0018, B:14:0x0026, B:15:0x0049, B:17:0x005b, B:19:0x0062, B:21:0x00b4, B:23:0x00bc, B:38:0x013c, B:39:0x0141, B:41:0x0188, B:42:0x018d, B:43:0x01a3), top: B:55:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a() {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.setup.download.impl.a.a():boolean");
    }

    @Override // com.uc.webview.export.extension.IUrlDownloader
    public final synchronized void delete() {
        com.uc.webview.base.io.b bVar;
        try {
            if (!(this.f == null || (bVar = this.g) == null)) {
                bVar.a();
                Log.d("UpdDlder", "delete [" + this.f.getAbsolutePath() + "] for url:" + this.d);
                d.c("UpdDlder-dl", this.f);
                this.g.b();
                com.uc.webview.base.io.b bVar2 = this.g;
                d.c(bVar2.b, bVar2.f14273a);
            }
        } catch (Throwable th) {
            Log.w("UpdDlder", "delete failed", th);
        }
    }

    @Override // com.uc.webview.export.extension.IUrlDownloader
    public final synchronized boolean start(String str, String str2, IUrlDownloader.Client client) {
        Log.d("UpdDlder", "start url:" + str + ", savedPath:" + str2);
        this.d = str;
        this.e = new File(str2);
        return a();
    }

    @Override // com.uc.webview.export.extension.IUrlDownloader
    public final synchronized void stop() {
        Log.d("UpdDlder", "stop not support");
    }

    @Override // com.uc.webview.internal.setup.download.impl.b.a
    public final void a(InputStream inputStream) {
        Log.d("UpdDlder", "onBodyReceived stream:".concat(String.valueOf(inputStream)));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f, true);
            byte[] bArr = new byte[51200];
            do {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    int i = 0;
                    fileOutputStream.write(bArr, 0, read);
                    long j = this.j + read;
                    this.j = j;
                    long j2 = this.i;
                    int i2 = 100;
                    if (j2 > 0) {
                        i = j > j2 ? 100 : (int) ((((float) j) * 100.0f) / ((float) j2));
                    }
                    int i3 = this.h;
                    if (i >= i3) {
                        if (i3 <= 80) {
                            i2 = i3 + 20;
                        }
                        this.h = i2;
                        this.f14456a.onProgressChanged(i);
                    }
                }
                if (read <= 0) {
                    break;
                }
            } while (this.j < this.i);
            d.a(fileOutputStream);
        } catch (Throwable th) {
            try {
                Log.d("UpdDlder", "readBody failed", th);
            } finally {
                d.a(inputStream);
            }
        }
    }

    private b a(b.a aVar) {
        b bVar = new b(this.d, aVar);
        int i = this.b;
        if (i > 0) {
            bVar.f14457a = i;
        }
        int i2 = this.c;
        if (i2 > 0) {
            bVar.b = i2;
        }
        return bVar;
    }
}
