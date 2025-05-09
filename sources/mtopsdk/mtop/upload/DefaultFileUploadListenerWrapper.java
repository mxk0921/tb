package mtopsdk.mtop.upload;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.mtop.upload.domain.UploadFileInfo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class DefaultFileUploadListenerWrapper implements FileUploadBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FileUploadBaseListener listener;
    public long segmentNum;
    public long serverRT;
    private long startTime;
    private long totalTime;
    private AtomicBoolean isCancelled = new AtomicBoolean(false);
    private AtomicBoolean isFinished = new AtomicBoolean(false);
    private AtomicInteger retryTimes = new AtomicInteger(0);

    static {
        t2o.a(595591170);
        t2o.a(595591171);
    }

    public DefaultFileUploadListenerWrapper(FileUploadBaseListener fileUploadBaseListener) {
        this.listener = fileUploadBaseListener;
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else {
            this.isCancelled.set(true);
        }
    }

    public void countRetryTimes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("744489f4", new Object[]{this});
        } else {
            this.retryTimes.incrementAndGet();
        }
    }

    public int getTotalRetryTimes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0d77026", new Object[]{this})).intValue();
        }
        return this.retryTimes.get();
    }

    public long getUploadTotalTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28deec75", new Object[]{this})).longValue();
        }
        return this.totalTime;
    }

    public boolean isCancelled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ff5f452", new Object[]{this})).booleanValue();
        }
        return this.isCancelled.get();
    }

    public AtomicBoolean isFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("5e519fc3", new Object[]{this});
        }
        return this.isFinished;
    }

    @Override // mtopsdk.mtop.upload.FileUploadBaseListener
    public void onError(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe51d4e", new Object[]{this, str, str2, str3});
            return;
        }
        this.totalTime = System.currentTimeMillis() - this.startTime;
        if (this.listener != null && !isCancelled()) {
            this.listener.onError(str, str2, str3);
        }
    }

    @Override // mtopsdk.mtop.upload.FileUploadBaseListener, mtopsdk.mtop.upload.FileUploadListener
    public void onFinish(UploadFileInfo uploadFileInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d514e0", new Object[]{this, uploadFileInfo, str});
            return;
        }
        this.totalTime = System.currentTimeMillis() - this.startTime;
        if (this.listener != null && !isCancelled()) {
            this.listener.onFinish(uploadFileInfo, str);
            cancel();
        }
    }

    @Override // mtopsdk.mtop.upload.FileUploadBaseListener, mtopsdk.mtop.upload.FileUploadListener
    public void onProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
        } else if (this.listener != null && !isCancelled()) {
            this.listener.onProgress(i);
        }
    }

    @Override // mtopsdk.mtop.upload.FileUploadBaseListener, mtopsdk.mtop.upload.FileUploadListener
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        this.startTime = System.currentTimeMillis();
        if (this.listener != null && !isCancelled()) {
            this.listener.onStart();
        }
    }

    @Override // mtopsdk.mtop.upload.FileUploadListener
    @Deprecated
    public void onError(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
        } else if (this.listener != null && !isCancelled()) {
            this.listener.onError(str, str2);
        }
    }

    @Override // mtopsdk.mtop.upload.FileUploadListener
    @Deprecated
    public void onFinish(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99807463", new Object[]{this, str});
        } else if (this.listener != null && !isCancelled()) {
            this.listener.onFinish(str);
        }
    }
}
