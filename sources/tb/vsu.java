package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tao.log.statistics.UploadFileType;
import com.taobao.tao.log.statistics.UploadReason;
import com.taobao.tao.log.statistics.UploadStage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vsu implements fob {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements f5s {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z24 f30230a;
        public final /* synthetic */ String b;
        public final /* synthetic */ e5s c;

        /* compiled from: Taobao */
        /* renamed from: tb.vsu$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C1082a implements ff9 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ h6s f30231a;

            public C1082a(h6s h6sVar) {
                this.f30231a = h6sVar;
            }

            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("59b86ace", new Object[]{this});
                    return;
                }
                h6s h6sVar = this.f30231a;
                if (h6sVar.f) {
                    for (String str : h6sVar.f20447a) {
                        File file = new File(str);
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                }
            }

            @Override // tb.ff9
            public void a(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b47bc65d", new Object[]{this, str, str2});
                } else if (teh.ALL_DONE.equals(str)) {
                    b();
                } else {
                    usu.b(a.this.f30230a);
                    TLogEventHelper.n(v4s.UT_TLOG_FILE_UPLOAD_ONE_SUCCESS, UploadFileType.UDF, UploadReason.SERVER_PULL, a.this.b);
                    s5s s = j5s.j().s();
                    String str3 = b6s.c;
                    String str4 = a.this.b;
                    s.b(str3, str4, "[UDF]File upload successfully: " + str);
                    a.this.c.onUploadDone(true, str);
                }
            }

            @Override // tb.ff9
            public void onError(String str, String str2, String str3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ffe51d4e", new Object[]{this, str, str2, str3});
                    return;
                }
                usu.a(a.this.f30230a, str2, str3);
                TLogEventHelper.n(v4s.UT_TLOG_FILE_UPLOAD_ONE_ERROR, UploadFileType.UDF, UploadReason.SERVER_PULL, a.this.b);
                j5s.j().s().c(b6s.c, a.this.b, "[UDF] File upload filed! errCode：" + str2 + ", errMsg: " + str3 + ", file:" + str);
                a.this.c.onUploadDone(false, str);
                if (ErrorCode.TOKEN_REFUSE_ERROR.getValue().equals(str2) || ErrorCode.TOKEN_REPLY_ERROR.getValue().equals(str2)) {
                    b();
                }
            }
        }

        public a(vsu vsuVar, z24 z24Var, String str, e5s e5sVar) {
            this.f30230a = z24Var;
            this.b = str;
            this.c = e5sVar;
        }

        public final Boolean a(h6s h6sVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("109f97ce", new Object[]{this, h6sVar});
            }
            j5s.j().s().b(b6s.g, this.b, "[UDF] Perpare to upload file!");
            hf9.g(this.b, UploadReason.SERVER_PULL, h6sVar.f20447a, UploadFileType.UDF, "USER_UPLOAD", h6sVar.b, h6sVar.c, new C1082a(h6sVar));
            return Boolean.TRUE;
        }

        public Boolean b(h6s h6sVar) {
            String str;
            List<String> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("e5966aaf", new Object[]{this, h6sVar});
            }
            if (h6sVar != null && !TextUtils.isEmpty(h6sVar.b) && (list = h6sVar.f20447a) != null && !((ArrayList) list).isEmpty()) {
                return a(h6sVar);
            }
            String value = ErrorCode.DATA_EMPTY.getValue();
            if (h6sVar != null) {
                value = h6sVar.d;
                str = h6sVar.e;
            } else {
                str = "[UDF] Upload file list is empty";
            }
            usu.a(this.f30230a, value, str);
            TLogEventHelper.q(UploadFileType.UDF, UploadReason.SERVER_PULL, UploadStage.STAGE_REQ, value, str, this.b);
            j5s.j().s().c(b6s.c, this.b, str);
            return Boolean.FALSE;
        }
    }

    static {
        t2o.a(767557713);
        t2o.a(767557702);
    }

    @Override // tb.fob
    public fob a(z24 z24Var) {
        erv ervVar;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fob) ipChange.ipc$dispatch("5320b9c", new Object[]{this, z24Var});
        }
        String a2 = ten.a();
        z24Var.c = a2;
        UploadFileType uploadFileType = UploadFileType.UDF;
        UploadReason uploadReason = UploadReason.SERVER_PULL;
        TLogEventHelper.n(v4s.UT_TLOG_FILE_UPLOAD_REQ, uploadFileType, uploadReason, a2);
        s5s s = j5s.j().s();
        String str3 = b6s.c;
        s.b(str3, a2, "[UDF] Receive Server Request......");
        try {
            ervVar = new erv();
            ervVar.a(z24Var.h, z24Var);
            str = ervVar.f18785a;
            str2 = ervVar.b;
        } catch (Exception e) {
            String value = ErrorCode.CODE_EXC.getValue();
            String str4 = "[UDF] Exception: " + e.getMessage();
            usu.a(z24Var, value, str4);
            TLogEventHelper.q(UploadFileType.UDF, UploadReason.SERVER_PULL, UploadStage.STAGE_REQ, value, str4, a2);
            j5s.j().s().a(b6s.c, a2, e);
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && "USER_UPLOAD".equals(str)) {
            e5s e5sVar = (e5s) ((ConcurrentHashMap) j5s.j().h).get(str2);
            if (e5sVar != null && str2.equals(e5sVar.getBizCode())) {
                j5s.j().s().b(str3, a2, "[UDF] Execute upload task for: ".concat(str2));
                i6s i6sVar = new i6s();
                i6sVar.f21130a = ervVar.c;
                e5sVar.executeUploadTask(j5s.j().h(), i6sVar, new a(this, z24Var, a2, e5sVar));
                return null;
            }
            String value2 = ErrorCode.NOT_IMPLEMENTED.getValue();
            String str5 = "[UDF] No Uploader for: " + str2;
            usu.a(z24Var, value2, str5);
            TLogEventHelper.q(uploadFileType, uploadReason, UploadStage.STAGE_REQ, value2, str5, a2);
            j5s.j().s().c(str3, a2, str5);
            return null;
        }
        String value3 = ErrorCode.BIZ_ERROR.getValue();
        String str6 = "[UDF] The bizType:" + str + ", bizCode:" + str2 + " is invalid";
        usu.a(z24Var, value3, str6);
        TLogEventHelper.q(uploadFileType, uploadReason, UploadStage.STAGE_REQ, value3, str6, a2);
        j5s.j().s().c(str3, a2, str6);
        return null;
    }
}
