package com.taobao.wireless.security.adapter.common;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: com.taobao.wireless.security.adapter.common.г  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0810 {

    /* renamed from: ж  reason: contains not printable characters */
    private static String f558 = "SGLib";

    /* renamed from: а  reason: contains not printable characters */
    private FileChannel f559 = null;

    /* renamed from: б  reason: contains not printable characters */
    private FileLock f560 = null;

    /* renamed from: в  reason: contains not printable characters */
    private RandomAccessFile f561 = null;

    /* renamed from: г  reason: contains not printable characters */
    private File f562 = null;

    /* renamed from: д  reason: contains not printable characters */
    private boolean f563;

    /* renamed from: е  reason: contains not printable characters */
    private String f564;

    /* renamed from: ё  reason: contains not printable characters */
    private Context f565;

    public C0810(Context context, String str) {
        this.f563 = true;
        this.f564 = null;
        this.f565 = null;
        this.f565 = context;
        this.f564 = str;
        this.f563 = m359();
    }

    /* renamed from: б  reason: contains not printable characters */
    private boolean m359() {
        try {
            File filesDir = this.f565.getFilesDir();
            if ((filesDir != null && filesDir.exists()) || ((filesDir = this.f565.getFilesDir()) != null && filesDir.exists())) {
                String absolutePath = filesDir.getAbsolutePath();
                File file = new File(absolutePath + "/" + this.f564);
                this.f562 = file;
                if (!file.exists()) {
                    this.f562.createNewFile();
                }
            }
        } catch (Exception unused) {
            File file2 = this.f562;
            if (file2 != null && !file2.exists()) {
                try {
                    this.f562.createNewFile();
                } catch (Exception unused2) {
                }
            }
        }
        File file3 = this.f562;
        return file3 != null && file3.exists();
    }

    /* renamed from: а  reason: contains not printable characters */
    public boolean m360() {
        boolean z = true;
        if (!this.f563) {
            boolean z2 = m359();
            this.f563 = z2;
            if (!z2) {
                return true;
            }
        }
        try {
            if (this.f562 != null) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f562, "rw");
                this.f561 = randomAccessFile;
                FileChannel channel = randomAccessFile.getChannel();
                this.f559 = channel;
                this.f560 = channel.lock();
            } else {
                z = false;
            }
            return z;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: в  reason: contains not printable characters */
    public boolean m361() {
        boolean z = true;
        if (!this.f563) {
            return true;
        }
        try {
            if (this.f560 != null) {
                this.f560.release();
                this.f560 = null;
            }
        } catch (IOException unused) {
            z = false;
        }
        try {
            if (this.f559 != null) {
                this.f559.close();
                this.f559 = null;
            }
        } catch (IOException unused2) {
            z = false;
        }
        try {
            if (this.f561 != null) {
                this.f561.close();
                this.f561 = null;
            }
            return z;
        } catch (IOException unused3) {
            return false;
        }
    }
}
