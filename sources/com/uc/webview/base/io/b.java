package com.uc.webview.base.io;

import android.text.TextUtils;
import com.uc.webview.base.Log;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final File f14273a;
    public final String b;
    private final boolean c;
    private RandomAccessFile d;
    private FileChannel e;
    private FileLock f;

    public b(File file) {
        this(file, false);
    }

    public final void a() {
        if (this.f == null) {
            try {
                this.d = new RandomAccessFile(this.f14273a, "rw");
            } catch (Throwable th) {
                try {
                    Log.w(this.b, "lock raf failed", th);
                    if (this.d == null) {
                        Log.w(this.b, "lock raf null");
                        return;
                    }
                } catch (Throwable th2) {
                    if (this.d == null) {
                        Log.w(this.b, "lock raf null");
                        return;
                    }
                    throw th2;
                }
            }
            this.e = this.d.getChannel();
            if (!this.c) {
                String str = this.b;
                Log.d(str, "locking " + this.f14273a.getPath());
            }
            try {
                this.f = this.e.lock();
                if (!this.c) {
                    String str2 = this.b;
                    Log.d(str2, this.f14273a.getPath() + " locked");
                }
            } catch (Throwable th3) {
                Log.w(this.b, "lock error ", th3);
            }
        } else if (!this.c) {
            Log.d("FileLocker", "lock already");
        }
    }

    public final void b() {
        FileLock fileLock = this.f;
        if (fileLock != null) {
            try {
                fileLock.release();
            } catch (Throwable th) {
                String str = this.b;
                Log.w(str, "unlock failed: " + this.f14273a.getPath(), th);
            }
            this.f = null;
        }
        a(this.e);
        this.e = null;
        a(this.d);
        this.d = null;
        if (!this.c) {
            String str2 = this.b;
            Log.d(str2, this.f14273a.getPath() + " unlocked");
        }
    }

    public b(File file, boolean z) {
        this(file, z, null);
    }

    public b(File file, boolean z, String str) {
        this.c = z;
        this.f14273a = new File(file.getAbsolutePath() + ".lk");
        this.b = TextUtils.isEmpty(str) ? "FileLocker" : "FileLocker.".concat(String.valueOf(str));
    }

    private void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                Log.w(this.b, "close failed", th);
            }
        }
    }
}
