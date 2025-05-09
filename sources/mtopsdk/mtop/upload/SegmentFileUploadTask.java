package mtopsdk.mtop.upload;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.upload.domain.UploadConstants;
import mtopsdk.mtop.upload.domain.UploadFileInfo;
import mtopsdk.mtop.upload.domain.UploadResult;
import mtopsdk.mtop.upload.domain.UploadToken;
import mtopsdk.mtop.upload.service.UploadFileService;
import mtopsdk.mtop.util.Result;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class SegmentFileUploadTask extends FileUploadTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.SegmentFileUploadTask";
    private long offset;
    private UploadToken token;
    private UploadFileService uploadService;

    static {
        t2o.a(595591179);
    }

    public SegmentFileUploadTask(UploadFileInfo uploadFileInfo, DefaultFileUploadListenerWrapper defaultFileUploadListenerWrapper, UploadToken uploadToken, long j, UploadFileService uploadFileService) {
        super(uploadFileInfo, defaultFileUploadListenerWrapper);
        this.token = uploadToken;
        this.offset = j;
        this.uploadService = uploadFileService;
    }

    public static /* synthetic */ Object ipc$super(SegmentFileUploadTask segmentFileUploadTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/mtop/upload/SegmentFileUploadTask");
    }

    private void parseServerRT(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c47c929", new Object[]{this, str});
        } else if (StringUtils.isNotBlank(str)) {
            try {
                this.listener.serverRT = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                TBSdkLog.w(TAG, "[parseServerRT] invalid X-Server-Rt header. X-Server-Rt=" + str);
            }
        }
    }

    @Override // mtopsdk.mtop.upload.FileUploadTask
    public void upload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f170aa08", new Object[]{this});
        } else if (!isCancelled()) {
            int i = 0;
            do {
                Result<UploadResult> fileUpload = this.uploadService.fileUpload(this.token, this.offset, i);
                if (!isCancelled()) {
                    boolean isSuccess = fileUpload.isSuccess();
                    if (isSuccess) {
                        UploadResult model = fileUpload.getModel();
                        UploadToken uploadToken = this.token;
                        notifyProgress(uploadToken.uploadedLength.addAndGet(Math.min(uploadToken.segmentSize, uploadToken.fileBaseInfo.fileSize - this.offset)), this.token.fileBaseInfo.fileSize);
                        if (fileUpload.getModel().isFinish) {
                            this.listener.onFinish(this.fileInfo, model.location);
                            parseServerRT(model.serverRT);
                            commitUploadStatsRecord(fileUpload, this.token);
                            FileUploadMgr.getInstance().removeTask(this.fileInfo);
                            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                                TBSdkLog.d(TAG, "[upload]entire file upload succeed.");
                                return;
                            }
                            return;
                        } else if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                            TBSdkLog.d(TAG, "[upload] segment upload succeed.offset=" + this.offset);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        if (i == this.token.retryCount && this.listener.isFinished().compareAndSet(false, true)) {
                            this.listener.onError(fileUpload.getErrType(), fileUpload.getErrCode(), fileUpload.getErrInfo());
                            this.listener.cancel();
                            commitUploadStatsRecord(fileUpload, this.token);
                        }
                        this.listener.countRetryTimes();
                        if (UploadConstants.ERRCODE_TOKEN_EXPIRED.equalsIgnoreCase(fileUpload.getErrCode())) {
                            Result<UploadToken> uploadToken2 = this.uploadService.getUploadToken(this.fileInfo);
                            if (uploadToken2.isSuccess()) {
                                this.token = uploadToken2.getModel();
                            }
                        }
                        if (!isSuccess) {
                            i++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            } while (i <= this.token.retryCount);
        }
    }
}
