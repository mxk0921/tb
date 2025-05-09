package com.alibaba.wireless.security.framework.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FileChannel f3428a = null;
    private FileLock b = null;
    private RandomAccessFile c = null;
    private File d = null;
    private boolean e;
    private String f;

    static {
        t2o.a(659554343);
    }

    public b(Context context, String str) {
        this.e = true;
        this.f = str;
        this.e = b();
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        try {
            File file = new File(this.f);
            this.d = file;
            if (!file.exists()) {
                this.d.createNewFile();
            }
        } catch (Exception unused) {
            File file2 = this.d;
            if (file2 != null && !file2.exists()) {
                try {
                    this.d.createNewFile();
                } catch (Exception unused2) {
                }
            }
        }
        File file3 = this.d;
        if (file3 == null || !file3.exists()) {
            return false;
        }
        return true;
    }

    public boolean c() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (!this.e) {
            return true;
        }
        try {
            FileLock fileLock = this.b;
            if (fileLock != null) {
                fileLock.release();
                this.b = null;
            }
        } catch (IOException unused) {
            z = false;
        }
        try {
            FileChannel fileChannel = this.f3428a;
            if (fileChannel != null) {
                fileChannel.close();
                this.f3428a = null;
            }
        } catch (IOException unused2) {
            z = false;
        }
        try {
            RandomAccessFile randomAccessFile = this.c;
            if (randomAccessFile != null) {
                randomAccessFile.close();
                this.c = null;
            }
            return z;
        } catch (IOException unused3) {
            return false;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!this.e) {
            boolean b = b();
            this.e = b;
            if (!b) {
                return true;
            }
        }
        try {
            if (this.d == null) {
                return false;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.d, "rw");
            this.c = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.f3428a = channel;
            this.b = channel.lock();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
