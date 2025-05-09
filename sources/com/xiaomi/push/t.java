package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f15135a = Collections.synchronizedSet(new HashSet());

    /* renamed from: a  reason: collision with other field name */
    private Context f1665a;

    /* renamed from: a  reason: collision with other field name */
    private RandomAccessFile f1666a;

    /* renamed from: a  reason: collision with other field name */
    private String f1667a;

    /* renamed from: a  reason: collision with other field name */
    private FileLock f1668a;

    private t(Context context) {
        this.f1665a = context;
    }

    public static t a(Context context, File file) {
        b.c("Locking: " + file.getAbsolutePath());
        String str = file.getAbsolutePath() + ".LOCK";
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.getParentFile().mkdirs();
            file2.createNewFile();
        }
        Set<String> set = f15135a;
        if (set.add(str)) {
            t tVar = new t(context);
            tVar.f1667a = str;
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                tVar.f1666a = randomAccessFile;
                tVar.f1668a = randomAccessFile.getChannel().lock();
                b.c("Locked: " + str + " :" + tVar.f1668a);
                if (tVar.f1668a == null) {
                    RandomAccessFile randomAccessFile2 = tVar.f1666a;
                    if (randomAccessFile2 != null) {
                        x.a(randomAccessFile2);
                    }
                    set.remove(tVar.f1667a);
                }
                return tVar;
            } catch (Throwable th) {
                if (tVar.f1668a == null) {
                    RandomAccessFile randomAccessFile3 = tVar.f1666a;
                    if (randomAccessFile3 != null) {
                        x.a(randomAccessFile3);
                    }
                    f15135a.remove(tVar.f1667a);
                }
                throw th;
            }
        } else {
            throw new IOException("abtain lock failure");
        }
    }

    public void a() {
        b.c("unLock: " + this.f1668a);
        FileLock fileLock = this.f1668a;
        if (fileLock != null && fileLock.isValid()) {
            try {
                this.f1668a.release();
            } catch (IOException unused) {
            }
            this.f1668a = null;
        }
        RandomAccessFile randomAccessFile = this.f1666a;
        if (randomAccessFile != null) {
            x.a(randomAccessFile);
        }
        f15135a.remove(this.f1667a);
    }
}
