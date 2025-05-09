package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tao.log.statistics.UploadFileType;
import com.taobao.tao.log.statistics.UploadReason;
import com.taobao.tao.log.statistics.UploadStage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class la1 implements fob {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(767557694);
        t2o.a(767557702);
    }

    @Override // tb.fob
    public fob a(z24 z24Var) {
        UploadReason uploadReason;
        String str;
        String value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fob) ipChange.ipc$dispatch("5320b9c", new Object[]{this, z24Var});
        }
        String str2 = z24Var.c;
        TLogEventHelper.UploadEventInfo b = hf9.b(str2);
        try {
            UploadFileType uploadFileType = b.fileType;
            uploadReason = UploadReason.SERVER_PULL;
            TLogEventHelper.n(v4s.UT_TLOG_FILE_UPLOAD_TOKEN_RES, uploadFileType, uploadReason, str2);
            s5s s = j5s.j().s();
            str = b6s.c;
            s.b(str, str2, "[PULL_TOKEN_RES] Reply token: " + z24Var.d);
        } catch (Exception e) {
            String value2 = ErrorCode.CODE_EXC.getValue();
            String str3 = "[PULL_TOKEN_RES] Exception: " + e.getMessage();
            TLogEventHelper.q(b.fileType, UploadReason.SERVER_PULL, UploadStage.STAGE_RES_TOKEN, value2, str3, str2);
            j5s.j().s().a(b6s.c, str2, e);
            wfh.a(z24Var, str2, null, value2, str3, null);
            ff9 ff9Var = b.listener;
            if (ff9Var != null) {
                ff9Var.onError("", value2, str3);
            }
        }
        if (!"200".equals(z24Var.d)) {
            String str4 = "[PULL_TOKEN_RES] Token reply error: " + z24Var.d;
            if ("403".equals(z24Var.d)) {
                value = ErrorCode.TOKEN_REFUSE_ERROR.getValue();
            } else {
                value = ErrorCode.TOKEN_REPLY_ERROR.getValue();
            }
            hf9.c(str2);
            TLogEventHelper.q(b.fileType, uploadReason, UploadStage.STAGE_RES_TOKEN, value, z24Var.d, str2);
            j5s.j().s().c(str, str2, str4);
            ff9 ff9Var2 = b.listener;
            if (ff9Var2 != null) {
                ff9Var2.onError("", value, str4);
            }
            return this;
        }
        ka1 ka1Var = new ka1();
        ka1Var.a(z24Var.h, z24Var);
        UploadTokenInfo[] uploadTokenInfoArr = ka1Var.b;
        if (uploadTokenInfoArr == null || uploadTokenInfoArr.length <= 0) {
            String value3 = ErrorCode.TOKEN_NO_NEED_UPLOAD.getValue();
            TLogEventHelper.q(b.fileType, uploadReason, UploadStage.STAGE_RES_TOKEN, value3, "[PULL_TOKEN_RES] No file need to upload!", str2);
            wfh.a(z24Var, str2, null, value3, "[PULL_TOKEN_RES] No file need to upload!", null);
            j5s.j().s().c(str, str2, "[PULL_TOKEN_RES] No file need to upload!");
            ff9 ff9Var3 = b.listener;
            if (ff9Var3 != null) {
                ff9Var3.onError("", value3, "[PULL_TOKEN_RES] No file need to upload!");
            }
        } else {
            dlv.a(z24Var, str2, ka1Var.f22507a, uploadTokenInfoArr, b);
        }
        return this;
    }
}
