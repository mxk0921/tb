package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ah;
import com.xiaomi.push.service.az;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class ei extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    protected int f14850a;

    /* renamed from: a  reason: collision with other field name */
    protected Context f886a;

    public ei(Context context, int i) {
        this.f14850a = i;
        this.f886a = context;
    }

    public static void a(Context context, ik ikVar) {
        eb a2 = ec.a().m602a();
        String a3 = a2 == null ? "" : a2.a();
        if (!TextUtils.isEmpty(a3) && !TextUtils.isEmpty(ikVar.a())) {
            a(context, ikVar, a3);
        }
    }

    private String c() {
        return "dc_job_result_time_" + mo607a();
    }

    private String d() {
        return "dc_job_result_" + mo607a();
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public abstract ie mo607a();

    public abstract String b();

    /* renamed from: b  reason: collision with other method in class */
    public boolean m605b() {
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        String b = b();
        if (!TextUtils.isEmpty(b)) {
            if (mo607a()) {
                b.m410a("DC run job mutual: " + mo607a());
                return;
            }
            eb a2 = ec.a().m602a();
            if (a2 == null) {
                str = "";
            } else {
                str = a2.a();
            }
            if (!TextUtils.isEmpty(str) && m605b()) {
                if (m606c()) {
                    SharedPreferences sharedPreferences = this.f886a.getSharedPreferences("mipush_extra", 0);
                    if (bm.a(b).equals(sharedPreferences.getString(d(), null))) {
                        long j = sharedPreferences.getLong(c(), 0L);
                        int a3 = az.a(this.f886a).a(ih.DCJobUploadRepeatedInterval.a(), 604800);
                        if ((System.currentTimeMillis() - j) / 1000 >= this.f14850a) {
                            if ((System.currentTimeMillis() - j) / 1000 < a3) {
                                b = "same_" + j;
                            }
                        } else {
                            return;
                        }
                    }
                }
                ik ikVar = new ik();
                ikVar.a(b);
                ikVar.a(System.currentTimeMillis());
                ikVar.a(mo607a());
                a(this.f886a, ikVar, str);
            }
        }
    }

    private static void a(Context context, ik ikVar, String str) {
        IOException e;
        BufferedOutputStream bufferedOutputStream;
        RandomAccessFile randomAccessFile;
        File file;
        byte[] b = ee.b(str, jm.a(ikVar));
        if (b != null && b.length != 0) {
            synchronized (ef.f14847a) {
                FileLock fileLock = null;
                try {
                    File file2 = new File(context.getExternalFilesDir(null), "push_cdata.lock");
                    x.m1105a(file2);
                    randomAccessFile = new RandomAccessFile(file2, "rw");
                    try {
                        FileLock lock = randomAccessFile.getChannel().lock();
                        try {
                            file = new File(context.getExternalFilesDir(null), "push_cdata.data");
                            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, true));
                        } catch (IOException e2) {
                            e = e2;
                            bufferedOutputStream = null;
                        } catch (Throwable th) {
                            th = th;
                            bufferedOutputStream = null;
                        }
                        try {
                            bufferedOutputStream.write(ab.a(b.length));
                            bufferedOutputStream.write(b);
                            bufferedOutputStream.flush();
                            file.setLastModified(0L);
                            if (lock != null && lock.isValid()) {
                                try {
                                    lock.release();
                                } catch (IOException unused) {
                                }
                            }
                            x.a(bufferedOutputStream);
                        } catch (IOException e3) {
                            e = e3;
                            fileLock = lock;
                            try {
                                e.printStackTrace();
                                if (fileLock != null && fileLock.isValid()) {
                                    try {
                                        fileLock.release();
                                    } catch (IOException unused2) {
                                    }
                                }
                                x.a(bufferedOutputStream);
                                x.a(randomAccessFile);
                            } catch (Throwable th2) {
                                th = th2;
                                if (fileLock != null && fileLock.isValid()) {
                                    try {
                                        fileLock.release();
                                    } catch (IOException unused3) {
                                    }
                                }
                                x.a(bufferedOutputStream);
                                x.a(randomAccessFile);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileLock = lock;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            x.a(bufferedOutputStream);
                            x.a(randomAccessFile);
                            throw th;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        bufferedOutputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedOutputStream = null;
                    }
                } catch (IOException e5) {
                    e = e5;
                    bufferedOutputStream = null;
                    randomAccessFile = null;
                } catch (Throwable th5) {
                    th = th5;
                    bufferedOutputStream = null;
                    randomAccessFile = null;
                }
                x.a(randomAccessFile);
            }
        }
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m606c() {
        return false;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a  reason: collision with other method in class */
    public boolean mo607a() {
        return ee.a(this.f886a, String.valueOf(mo607a()), this.f14850a);
    }
}
