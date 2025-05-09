package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.push.ah;
import com.xiaomi.push.service.az;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import tb.tca;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ek extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    private Context f14851a;

    /* renamed from: a  reason: collision with other field name */
    private SharedPreferences f887a;

    /* renamed from: a  reason: collision with other field name */
    private az f888a;

    public ek(Context context) {
        this.f14851a = context;
        this.f887a = context.getSharedPreferences("mipush_extra", 0);
        this.f888a = az.a(context);
    }

    private boolean b() {
        if (!this.f888a.a(ih.Upload3GSwitch.a(), true)) {
            return false;
        }
        int max = Math.max((int) RemoteMessageConst.DEFAULT_TTL, this.f888a.a(ih.Upload3GFrequency.a(), 432000));
        if (Math.abs((System.currentTimeMillis() / 1000) - this.f887a.getLong("last_upload_data_timestamp", -1L)) > max) {
            return true;
        }
        return false;
    }

    private boolean c() {
        if (!this.f888a.a(ih.Upload4GSwitch.a(), true)) {
            return false;
        }
        int max = Math.max((int) RemoteMessageConst.DEFAULT_TTL, this.f888a.a(ih.Upload4GFrequency.a(), 259200));
        if (Math.abs((System.currentTimeMillis() / 1000) - this.f887a.getLong("last_upload_data_timestamp", -1L)) > max) {
            return true;
        }
        return false;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo607a() {
        return "1";
    }

    @Override // java.lang.Runnable
    public void run() {
        File file = new File(this.f14851a.getExternalFilesDir(null), "push_cdata.data");
        if (!bg.d(this.f14851a)) {
            if (file.length() > 1863680) {
                file.delete();
            }
        } else if (!m608a() && file.exists()) {
            List<ik> a2 = a(file);
            if (!ac.a(a2)) {
                int size = a2.size();
                if (size > 4000) {
                    a2 = a2.subList(size + tca.LIVE_CARD_TYPE, size);
                }
                iv ivVar = new iv();
                ivVar.a(a2);
                byte[] a3 = x.a(jm.a(ivVar));
                jb jbVar = new jb("-1", false);
                jbVar.c(im.DataCollection.f1168a);
                jbVar.a(a3);
                eb a4 = ec.a().m602a();
                if (a4 != null) {
                    a4.a(jbVar, ic.Notification, null);
                }
                a();
            }
            file.delete();
        }
    }

    private List<ik> a(File file) {
        FileInputStream fileInputStream;
        RandomAccessFile randomAccessFile;
        Throwable th;
        eb a2 = ec.a().m602a();
        String a3 = a2 == null ? "" : a2.a();
        FileLock fileLock = null;
        if (TextUtils.isEmpty(a3)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[4];
        synchronized (ef.f14847a) {
            try {
                File file2 = new File(this.f14851a.getExternalFilesDir(null), "push_cdata.lock");
                x.m1105a(file2);
                randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    FileLock lock = randomAccessFile.getChannel().lock();
                    try {
                        fileInputStream = new FileInputStream(file);
                        while (fileInputStream.read(bArr) == 4) {
                            try {
                                int a4 = ab.a(bArr);
                                byte[] bArr2 = new byte[a4];
                                if (fileInputStream.read(bArr2) != a4) {
                                    break;
                                }
                                byte[] a5 = ee.a(a3, bArr2);
                                if (!(a5 == null || a5.length == 0)) {
                                    ik ikVar = new ik();
                                    jm.a(ikVar, a5);
                                    arrayList.add(ikVar);
                                    a(ikVar);
                                }
                            } catch (Exception unused) {
                                fileLock = lock;
                                if (fileLock != null && fileLock.isValid()) {
                                    try {
                                        fileLock.release();
                                    } catch (IOException unused2) {
                                    }
                                }
                                x.a((Closeable) fileInputStream);
                                x.a(randomAccessFile);
                                return arrayList;
                            } catch (Throwable th2) {
                                th = th2;
                                fileLock = lock;
                                if (fileLock != null && fileLock.isValid()) {
                                    try {
                                        fileLock.release();
                                    } catch (IOException unused3) {
                                    }
                                }
                                x.a((Closeable) fileInputStream);
                                x.a(randomAccessFile);
                                throw th;
                            }
                        }
                        if (lock != null && lock.isValid()) {
                            try {
                                lock.release();
                            } catch (IOException unused4) {
                            }
                        }
                        x.a((Closeable) fileInputStream);
                    } catch (Exception unused5) {
                        fileInputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream = null;
                    }
                } catch (Exception unused6) {
                    fileInputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    fileInputStream = null;
                }
            } catch (Exception unused7) {
                randomAccessFile = null;
                fileInputStream = null;
            } catch (Throwable th5) {
                th = th5;
                randomAccessFile = null;
                fileInputStream = null;
            }
            x.a(randomAccessFile);
        }
        return arrayList;
    }

    private void a() {
        SharedPreferences.Editor edit = this.f887a.edit();
        edit.putLong("last_upload_data_timestamp", System.currentTimeMillis() / 1000);
        edit.commit();
    }

    private void a(ik ikVar) {
        if (ikVar.f1159a == ie.AppInstallList && !ikVar.f1160a.startsWith("same_")) {
            SharedPreferences.Editor edit = this.f887a.edit();
            edit.putLong("dc_job_result_time_4", ikVar.f1158a);
            edit.putString("dc_job_result_4", bm.a(ikVar.f1160a));
            edit.commit();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private boolean m608a() {
        if (bg.e(this.f14851a)) {
            return false;
        }
        if ((bg.g(this.f14851a) || bg.f(this.f14851a)) && !c()) {
            return true;
        }
        return (bg.h(this.f14851a) && !b()) || bg.i(this.f14851a);
    }
}
