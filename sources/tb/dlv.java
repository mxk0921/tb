package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tao.log.statistics.UploadStage;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dlv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(767557716);
    }

    public static synchronized void a(z24 z24Var, String str, String str2, UploadTokenInfo[] uploadTokenInfoArr, TLogEventHelper.UploadEventInfo uploadEventInfo) {
        synchronized (dlv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21120267", new Object[]{z24Var, str, str2, uploadTokenInfoArr, uploadEventInfo});
                return;
            }
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(v4s.PARAM_UPLOAD_FILE_TYPE, uploadEventInfo.fileType.getValue());
                hashMap.put("reason", uploadEventInfo.reason.getValue());
                hashMap.put("bizCode", uploadEventInfo.bizCode);
                hashMap.put("bizType", uploadEventInfo.bizType);
                hashMap.put(v4s.PARAM_IS_RETRY, String.valueOf(uploadEventInfo.isRetry));
                hashMap.put(v4s.PARAM_UPLOAD_ID, z24Var.c);
                hashMap.put(v4s.PARAM_TASK_ID, z24Var.c);
                if (uploadTokenInfoArr != null) {
                    hashMap.put(v4s.PARAM_UPLOAD_FILE_COUNT, String.valueOf(uploadTokenInfoArr.length));
                }
                TLogEventHelper.g(v4s.UT_TLOG_FILE_UPLOAD_EXECUTE, hashMap);
                j5s.j().s().b(b6s.c, z24Var.c, "[UploadFile] Prepare for file upload...");
                teh tehVar = new teh(j5s.j().h());
                tehVar.d = str;
                tehVar.e = uploadTokenInfoArr;
                tehVar.c = z24Var;
                tehVar.f = uploadEventInfo;
                for (UploadTokenInfo uploadTokenInfo : uploadTokenInfoArr) {
                    String str3 = uploadTokenInfo.fileInfo.absolutePath;
                    if (!TextUtils.isEmpty(str3)) {
                        tehVar.j(str3);
                    }
                }
                tehVar.m();
            } catch (Exception e) {
                String value = ErrorCode.CODE_EXC.getValue();
                String str4 = "[UploadFile] Exception:" + e.getMessage();
                TLogEventHelper.p(uploadEventInfo, UploadStage.STAGE_UPLOAD, value, str4, z24Var.c);
                j5s.j().s().a(b6s.c, z24Var.c, e);
                if (z24Var.e.equals("RDWP_APPLY_UPLOAD_TOKEN_REPLY")) {
                    wfh.a(z24Var, str, null, value, str4, null);
                } else {
                    pa1.a(z24Var, str, null, value, str4, null);
                }
                ff9 ff9Var = uploadEventInfo.listener;
                if (ff9Var != null) {
                    ff9Var.onError("", value, str4);
                }
            }
        }
    }
}
