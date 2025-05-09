package mtopsdk.mtop.upload.service;

import anetwork.channel.IBodyHandler;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import mtopsdk.common.util.TBSdkLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class FileStreamUploadBodyHandlerImpl implements IBodyHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.FileStreamUploadBodyHandlerImpl";
    private long fileSize;
    private InputStream fileStream;
    private long offset;
    private long patchSize;
    private boolean isCompleted = false;
    private int postedLength = 0;
    private BufferedInputStream bis = null;

    static {
        t2o.a(595591190);
        t2o.a(607125963);
    }

    public FileStreamUploadBodyHandlerImpl(InputStream inputStream, long j, long j2, long j3) {
        this.fileStream = inputStream;
        this.fileSize = j;
        this.offset = j2;
        this.patchSize = j3;
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
        long j;
        long j2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ed24497", new Object[]{this, bArr})).intValue();
        }
        if (bArr == null || bArr.length == 0 || this.fileStream == null) {
            TBSdkLog.e(TAG, "[read(byte[] buffer)]parameter buffer or fileStream is null");
            this.isCompleted = true;
            return 0;
        }
        int i2 = this.postedLength;
        try {
            try {
            } catch (IOException e) {
                TBSdkLog.e(TAG, "close inputStream error", e);
            }
            if (i2 >= this.patchSize) {
                this.isCompleted = true;
                return 0;
            }
            try {
                j = this.offset;
                j2 = this.fileSize;
            } catch (Exception e2) {
                TBSdkLog.e(TAG, "[read]write Body error", e2);
                this.isCompleted = true;
                BufferedInputStream bufferedInputStream = this.bis;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            }
            if (j < j2 && i2 < j2) {
                if (this.bis == null) {
                    this.bis = new BufferedInputStream(this.fileStream);
                }
                int read = this.bis.read(bArr);
                if (read != -1) {
                    int i3 = this.postedLength;
                    long j3 = this.patchSize;
                    if (i3 + read > j3) {
                        read = (int) (j3 - i3);
                    }
                    i = read;
                    int i4 = i3 + i;
                    this.postedLength = i4;
                    long j4 = this.offset + i;
                    this.offset = j4;
                    if (i4 >= j3 || j4 >= this.fileSize) {
                        this.isCompleted = true;
                    }
                    if (!this.isCompleted) {
                        this.bis.mark((int) this.fileSize);
                        this.bis.reset();
                    }
                }
                BufferedInputStream bufferedInputStream2 = this.bis;
                if (bufferedInputStream2 != null && this.isCompleted) {
                    bufferedInputStream2.close();
                }
                return i;
            }
            this.isCompleted = true;
            BufferedInputStream bufferedInputStream3 = this.bis;
            if (bufferedInputStream3 != null) {
                try {
                    bufferedInputStream3.close();
                } catch (IOException e3) {
                    TBSdkLog.e(TAG, "close inputStream error", e3);
                }
            }
            return 0;
        } catch (Throwable th) {
            BufferedInputStream bufferedInputStream4 = this.bis;
            if (bufferedInputStream4 != null && this.isCompleted) {
                try {
                    bufferedInputStream4.close();
                } catch (IOException e4) {
                    TBSdkLog.e(TAG, "close inputStream error", e4);
                }
            }
            throw th;
        }
    }
}
