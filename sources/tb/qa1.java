package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tao.log.statistics.UploadStage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qa1 implements fob {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(767557697);
        t2o.a(767557702);
    }

    @Override // tb.fob
    public fob a(z24 z24Var) {
        String str;
        Exception e;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fob) ipChange.ipc$dispatch("5320b9c", new Object[]{this, z24Var});
        }
        TLogEventHelper.UploadEventInfo b = hf9.b(z24Var.c);
        String str4 = b.sessionID;
        ff9 ff9Var = b.listener;
        try {
            TLogEventHelper.m(v4s.UT_TLOG_FILE_UPLOAD_TOKEN_RES, b, z24Var.c);
            s5s s = j5s.j().s();
            str2 = b6s.c;
            s.b(str2, str4, "[PUSH_TOKEN_RES] Reply token: " + z24Var.d);
        } catch (Exception e2) {
            e = e2;
            str = "";
        }
        if (!"200".equals(z24Var.d)) {
            String str5 = "[PUSH_TOKEN_RES] Token reply error: " + z24Var.d;
            if ("403".equals(z24Var.d)) {
                str3 = ErrorCode.TOKEN_REFUSE_ERROR.getValue();
            } else {
                str3 = ErrorCode.TOKEN_REPLY_ERROR.getValue();
            }
            hf9.c(str4);
            TLogEventHelper.p(b, UploadStage.STAGE_RES_TOKEN, str3, z24Var.d, z24Var.c);
            j5s.j().s().c(str2, "", str5);
            if (ff9Var != null) {
                ff9Var.onError("", str3, str5);
            }
            return this;
        }
        sa1 sa1Var = new sa1();
        sa1Var.a(z24Var.h, z24Var);
        String str6 = sa1Var.f27898a;
        try {
            b.uploadID = str6;
            UploadTokenInfo[] uploadTokenInfoArr = sa1Var.c;
            if (uploadTokenInfoArr == null || uploadTokenInfoArr.length <= 0) {
                String value = ErrorCode.TOKEN_NO_NEED_UPLOAD.getValue();
                TLogEventHelper.p(b, UploadStage.STAGE_RES_TOKEN, value, "[PUSH_TOKEN_RES] No file need to upload!", z24Var.c);
                j5s.j().s().b(str2, str4, "[PUSH_TOKEN_RES] No file need to upload!");
                pa1.a(z24Var, str6, null, value, "[PUSH_TOKEN_RES] No file need to upload!", null);
                if (ff9Var != null) {
                    ff9Var.onError("", value, "[PUSH_TOKEN_RES] No file need to upload!");
                }
            } else {
                dlv.a(z24Var, str6, sa1Var.b, uploadTokenInfoArr, b);
            }
        } catch (Exception e3) {
            e = e3;
            str = str6;
            ErrorCode errorCode = ErrorCode.CODE_EXC;
            String value2 = errorCode.getValue();
            String str7 = "[PUSH_TOKEN_RES] Exception: " + e.getMessage();
            TLogEventHelper.p(b, UploadStage.STAGE_RES_TOKEN, value2, str7, z24Var.c);
            j5s.j().s().a(b6s.c, str4, e);
            pa1.a(z24Var, str, null, value2, str7, null);
            if (ff9Var != null) {
                ff9Var.onError("", errorCode.getValue(), str7);
            }
            return this;
        }
        return this;
    }
}
