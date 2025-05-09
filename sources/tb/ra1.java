package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo;
import com.taobao.android.tlog.protocol.model.request.base.FileInfo;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tao.log.statistics.UploadFileType;
import com.taobao.tao.log.statistics.UploadReason;
import com.taobao.tao.log.statistics.UploadStage;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ra1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(767557698);
    }

    public static void a(String str, UploadReason uploadReason, List<String> list, UploadFileType uploadFileType, String str2, String str3, Map<String, String> map, ff9 ff9Var, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af69f64", new Object[]{str, uploadReason, list, uploadFileType, str2, str3, map, ff9Var, new Boolean(z), new Integer(i)});
            return;
        }
        try {
            TLogEventHelper.UploadEventInfo uploadEventInfo = new TLogEventHelper.UploadEventInfo();
            uploadEventInfo.fileType = uploadFileType;
            uploadEventInfo.reason = uploadReason;
            uploadEventInfo.bizType = str2;
            uploadEventInfo.bizCode = str3;
            uploadEventInfo.sessionID = str;
            uploadEventInfo.extraInfo = map;
            uploadEventInfo.listener = ff9Var;
            uploadEventInfo.fileList = list;
            uploadEventInfo.isRetry = z;
            uploadEventInfo.flag = i;
            hf9.e(str, uploadEventInfo);
            if ((i & 2) != 2 || n6s.a(j5s.j().h())) {
                TLogEventHelper.m(v4s.UT_TLOG_FILE_UPLOAD_TOKEN_REQ, uploadEventInfo, str);
                j5s.j().s().b(b6s.c, str, "[PUSH_TOKEN_REQ] Request upload token: " + str3);
                ta1 ta1Var = new ta1();
                ta1Var.e = "RDWP_APPLY_UPLOAD";
                ta1Var.f21291a = j5s.j().f();
                ta1Var.b = j5s.j().d();
                ta1Var.c = j5s.q();
                ta1Var.d = j5s.j().r();
                ta1Var.h = j5s.j().e();
                ta1Var.j = str2;
                ta1Var.l = str3;
                ta1Var.k = uploadFileType.getName();
                if (map != null && map.size() > 0) {
                    ta1Var.i = new HashMap();
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        ((HashMap) ta1Var.i).put(entry.getKey(), entry.getValue());
                    }
                }
                tmv b = j5s.j().k().b();
                UploadTokenInfo uploadTokenInfo = new UploadTokenInfo();
                if (b.f28810a.equals("oss") || b.f28810a.equals("arup") || b.f28810a.equals("ceph")) {
                    uploadTokenInfo.put("ossBucketName", j5s.j().d);
                }
                ta1Var.f = b.f28810a;
                ta1Var.g = uploadTokenInfo;
                ArrayList arrayList = new ArrayList();
                for (String str4 : list) {
                    File file = new File(str4);
                    if (file.exists()) {
                        FileInfo fileInfo = new FileInfo();
                        fileInfo.fileName = file.getName();
                        fileInfo.absolutePath = str4;
                        fileInfo.contentLength = Long.valueOf(file.length());
                        fileInfo.lastModified = Long.valueOf(file.lastModified());
                        fileInfo.contentType = uploadFileType.getContentType();
                        fileInfo.contentEncoding = "gzip";
                        arrayList.add(fileInfo);
                    } else {
                        j5s.j().s().c(b6s.c, str, "File not exist: " + str4);
                    }
                }
                if (arrayList.isEmpty()) {
                    String value = ErrorCode.UPLOAD_NO_FILE.getValue();
                    String str5 = "[PUSH_TOKEN_REQ] Upload file is not exist! isRetry: " + z;
                    TLogEventHelper.r(uploadFileType, uploadReason, str2, str3, UploadStage.STAGE_REQ_TOKEN, value, str5, str);
                    j5s.j().s().c(b6s.c, str, str5);
                    if (ff9Var != null) {
                        ff9Var.onError("", value, str5);
                    }
                    hf9.c(str);
                    return;
                }
                ta1Var.m = (FileInfo[]) arrayList.toArray(new FileInfo[0]);
                oap.a(j5s.j().h(), ta1Var.a(str));
                return;
            }
            String value2 = ErrorCode.UPLOAD_NOT_WIFI.getValue();
            TLogEventHelper.r(uploadFileType, uploadReason, str2, str3, UploadStage.STAGE_REQ_TOKEN, value2, "[PUSH_TOKEN_REQ] Need WIFI! ", str);
            j5s.j().s().c(b6s.g, str, "[PUSH_TOKEN_REQ] Need WIFI! ");
            if (ff9Var != null) {
                ff9Var.onError("", value2, "[PUSH_TOKEN_REQ] Need WIFI! ");
            }
        } catch (Exception e) {
            String value3 = ErrorCode.CODE_EXC.getValue();
            String str6 = "[PUSH_TOKEN_REQ] Exception: " + e.getMessage();
            TLogEventHelper.r(uploadFileType, uploadReason, str2, str3, UploadStage.STAGE_REQ_TOKEN, value3, str6, str);
            j5s.j().s().a(b6s.g, str, e);
            if (ff9Var != null) {
                ff9Var.onError("", value3, str6);
            }
        }
    }
}
