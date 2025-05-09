package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLogNative;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tao.log.statistics.UploadFileType;
import com.taobao.tao.log.statistics.UploadReason;
import com.taobao.tao.log.statistics.UploadStage;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yfh implements fob {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(767557706);
        t2o.a(767557702);
    }

    @Override // tb.fob
    public fob a(z24 z24Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fob) ipChange.ipc$dispatch("5320b9c", new Object[]{this, z24Var});
        }
        u5s.d();
        TLogNative.appenderFlushData(false);
        try {
            xfh xfhVar = new xfh();
            xfhVar.a(z24Var.h, z24Var);
            String str = xfhVar.c;
            neh[] nehVarArr = xfhVar.b;
            Boolean bool = xfhVar.f31351a;
            UploadFileType uploadFileType = UploadFileType.LOG;
            UploadReason uploadReason = UploadReason.SERVER_PULL;
            TLogEventHelper.n(v4s.UT_TLOG_FILE_UPLOAD_REQ, uploadFileType, uploadReason, str);
            s5s s = j5s.j().s();
            String str2 = b6s.c;
            s.b(str2, str, "[LOG_PULL] Receive Server Request");
            if (bool == null || bool.booleanValue() || n6s.a(j5s.j().h())) {
                List<String> n = b5s.n(nehVarArr);
                if (!(n == null || n.size() == 0)) {
                    na1.a(z24Var, str, n, uploadFileType, null, false);
                    return null;
                }
                String value = ErrorCode.UPLOAD_NO_FILE.getValue();
                TLogEventHelper.q(uploadFileType, uploadReason, UploadStage.STAGE_REQ, value, "[LOG_PULL] Can't find the log file.", str);
                j5s.j().s().c(str2, str, "[LOG_PULL] Can't find the log file.");
                wfh.a(z24Var, str, null, value, "[LOG_PULL] Can't find the log file.", null);
                return null;
            }
            String value2 = ErrorCode.UPLOAD_NOT_WIFI.getValue();
            TLogEventHelper.q(uploadFileType, uploadReason, UploadStage.STAGE_REQ, value2, "[LOG_PULL] Need WIFI!", str);
            wfh.a(z24Var, str, null, value2, "[LOG_PULL] Need WIFI!", null);
            j5s.j().s().c(str2, str, "[LOG_PULL] Need WIFI!");
            return this;
        } catch (Exception e) {
            String value3 = ErrorCode.CODE_EXC.getValue();
            String str3 = "[LOG_PULL] Exception: " + e.getMessage();
            TLogEventHelper.q(UploadFileType.LOG, UploadReason.SERVER_PULL, UploadStage.STAGE_REQ, value3, str3, "");
            j5s.j().s().a(b6s.c, "", e);
            wfh.a(z24Var, "", null, value3, str3, null);
            return null;
        }
    }
}
