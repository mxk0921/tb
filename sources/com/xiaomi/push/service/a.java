package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.x;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f15031a;

    /* renamed from: a  reason: collision with other field name */
    private Context f1531a;
    private volatile String e;
    private volatile String f;

    /* renamed from: a  reason: collision with other field name */
    private final Object f1532a = new Object();
    private final Object b = new Object();

    /* renamed from: a  reason: collision with other field name */
    private final String f1533a = "mipush_region";

    /* renamed from: b  reason: collision with other field name */
    private final String f1534b = "mipush_country_code";
    private final String c = "mipush_region.lock";
    private final String d = "mipush_country_code.lock";

    public a(Context context) {
        this.f1531a = context;
    }

    public static a a(Context context) {
        if (f15031a == null) {
            synchronized (a.class) {
                try {
                    if (f15031a == null) {
                        f15031a = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15031a;
    }

    public String b() {
        if (TextUtils.isEmpty(this.f)) {
            this.f = a(this.f1531a, "mipush_country_code", "mipush_country_code.lock", this.b);
        }
        return this.f;
    }

    public String a() {
        if (TextUtils.isEmpty(this.e)) {
            this.e = a(this.f1531a, "mipush_region", "mipush_region.lock", this.f1532a);
        }
        return this.e;
    }

    public void b(String str, boolean z) {
        if (!TextUtils.equals(str, this.f)) {
            this.f = str;
        }
        if (z) {
            a(this.f1531a, str, "mipush_country_code", "mipush_region.lock", this.f1532a);
        }
    }

    private String a(Context context, String str, String str2, Object obj) {
        Throwable th;
        RandomAccessFile randomAccessFile;
        Exception e;
        FileLock fileLock;
        File file = new File(context.getFilesDir(), str);
        FileLock fileLock2 = null;
        if (!file.exists()) {
            b.m410a("No ready file to get data from " + str);
            return null;
        }
        synchronized (obj) {
            try {
                File file2 = new File(context.getFilesDir(), str2);
                x.m1105a(file2);
                randomAccessFile = new RandomAccessFile(file2, "rw");
            } catch (Exception e2) {
                e = e2;
                randomAccessFile = null;
                fileLock = null;
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = null;
            }
            try {
                fileLock = randomAccessFile.getChannel().lock();
                try {
                    try {
                        String a2 = x.a(file);
                        if (fileLock != null && fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException e3) {
                                b.a(e3);
                            }
                        }
                        x.a(randomAccessFile);
                        return a2;
                    } catch (Exception e4) {
                        e = e4;
                        b.a(e);
                        if (fileLock != null && fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException e5) {
                                b.a(e5);
                            }
                        }
                        x.a(randomAccessFile);
                        return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileLock2 = fileLock;
                    if (fileLock2 != null && fileLock2.isValid()) {
                        try {
                            fileLock2.release();
                        } catch (IOException e6) {
                            b.a(e6);
                        }
                    }
                    x.a(randomAccessFile);
                    throw th;
                }
            } catch (Exception e7) {
                e = e7;
                fileLock = null;
            } catch (Throwable th4) {
                th = th4;
                if (fileLock2 != null) {
                    fileLock2.release();
                }
                x.a(randomAccessFile);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private void a(Context context, String str, String str2, String str3, Object obj) {
        Throwable th;
        RandomAccessFile randomAccessFile;
        Exception e;
        synchronized (obj) {
            FileLock fileLock = null;
            try {
                try {
                    File file = new File(context.getFilesDir(), (String) str3);
                    x.m1105a(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    try {
                        fileLock = randomAccessFile.getChannel().lock();
                        x.a(new File(context.getFilesDir(), str2), str);
                        str3 = randomAccessFile;
                        if (fileLock != null) {
                            str3 = randomAccessFile;
                            if (fileLock.isValid()) {
                                try {
                                    fileLock.release();
                                    str3 = randomAccessFile;
                                } catch (IOException e2) {
                                    b.a(e2);
                                    str3 = randomAccessFile;
                                }
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        b.a(e);
                        str3 = randomAccessFile;
                        if (fileLock != null) {
                            str3 = randomAccessFile;
                            if (fileLock.isValid()) {
                                try {
                                    fileLock.release();
                                    str3 = randomAccessFile;
                                } catch (IOException e4) {
                                    b.a(e4);
                                    str3 = randomAccessFile;
                                }
                            }
                        }
                        x.a((Closeable) str3);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (fileLock != null && fileLock.isValid()) {
                        try {
                            fileLock.release();
                        } catch (IOException e5) {
                            b.a(e5);
                        }
                    }
                    x.a((Closeable) str3);
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
                randomAccessFile = null;
            } catch (Throwable th3) {
                th = th3;
                str3 = 0;
                if (fileLock != null) {
                    fileLock.release();
                }
                x.a((Closeable) str3);
                throw th;
            }
            x.a((Closeable) str3);
        }
    }

    public void a(String str, boolean z) {
        if (!TextUtils.equals(str, this.e)) {
            this.e = str;
        }
        if (z) {
            a(this.f1531a, str, "mipush_region", "mipush_region.lock", this.f1532a);
        }
    }
}
