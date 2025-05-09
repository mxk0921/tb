package mtopsdk.mtop.upload.service;

import anetwork.channel.IBodyHandler;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import mtopsdk.common.util.TBSdkLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class FileUploadBodyHandlerImpl implements IBodyHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.FileUploadBodyHandlerImpl";
    private File file;
    private long offset;
    private long patchSize;
    private boolean isCompleted = false;
    private int postedLength = 0;
    private RandomAccessFile raf = null;

    static {
        t2o.a(595591191);
        t2o.a(607125963);
    }

    public FileUploadBodyHandlerImpl(File file, long j, long j2) {
        this.file = file;
        this.offset = j;
        this.patchSize = j2;
    }

    @Override // anetwork.channel.IBodyHandler
    public boolean isCompleted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c6bb44c", new Object[]{this})).booleanValue();
        }
        return this.isCompleted;
    }

    @Override // anetwork.channel.IBodyHandler
    public int read(byte[] bArr) {
        long length;
        long j;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ed24497", new Object[]{this, bArr})).intValue();
        }
        if (bArr == null || bArr.length == 0 || this.file == null) {
            TBSdkLog.e(TAG, "[read(byte[] buffer)]parameter buffer or file is null");
            this.isCompleted = true;
            return 0;
        }
        try {
            try {
            } catch (IOException e) {
                TBSdkLog.e(TAG, "close RandomAccessFile error", e);
            }
            if (this.postedLength >= this.patchSize) {
                this.isCompleted = true;
                return 0;
            }
            try {
                if (this.raf == null) {
                    this.raf = new RandomAccessFile(this.file, "r");
                }
                length = this.raf.length();
                j = this.offset;
            } catch (Exception e2) {
                TBSdkLog.e(TAG, "[read]write Body error", e2);
                this.isCompleted = true;
                RandomAccessFile randomAccessFile = this.raf;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            }
            if (j < length && this.postedLength < length) {
                this.raf.seek(j);
                int read = this.raf.read(bArr);
                if (read != -1) {
                    int i2 = this.postedLength;
                    long j2 = this.patchSize;
                    if (i2 + read > j2) {
                        read = (int) (j2 - i2);
                    }
                    i = read;
                    int i3 = i2 + i;
                    this.postedLength = i3;
                    long j3 = this.offset + i;
                    this.offset = j3;
                    if (i3 >= j2 || j3 >= length) {
                        this.isCompleted = true;
                    }
                }
                RandomAccessFile randomAccessFile2 = this.raf;
                if (randomAccessFile2 != null && this.isCompleted) {
                    randomAccessFile2.close();
                }
                return i;
            }
            this.isCompleted = true;
            RandomAccessFile randomAccessFile3 = this.raf;
            if (randomAccessFile3 != null) {
                try {
                    randomAccessFile3.close();
                } catch (IOException e3) {
                    TBSdkLog.e(TAG, "close RandomAccessFile error", e3);
                }
            }
            return 0;
        } catch (Throwable th) {
            RandomAccessFile randomAccessFile4 = this.raf;
            if (randomAccessFile4 != null && this.isCompleted) {
                try {
                    randomAccessFile4.close();
                } catch (IOException e4) {
                    TBSdkLog.e(TAG, "close RandomAccessFile error", e4);
                }
            }
            throw th;
        }
    }
}
