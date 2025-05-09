package tb;

import android.text.TextUtils;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.ui.WebConstant;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo;
import com.taobao.android.tlog.protocol.model.request.base.FileInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ma1 extends ifh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String j;
    public FileInfo[] k;

    static {
        t2o.a(856686619);
    }

    public static /* synthetic */ Object ipc$super(ma1 ma1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tlog/protocol/model/request/ApplyTokenRequest");
    }

    public p5o a(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p5o) ipChange.ipc$dispatch("af120c4b", new Object[]{this, str});
        }
        String a2 = ten.a();
        String a3 = !TextUtils.isEmpty(str) ? str : ten.a();
        JSONObject b = kn2.b(this, a2, a3);
        JSONObject jSONObject = new JSONObject();
        String str2 = this.j;
        if (str2 != null) {
            jSONObject.put("uploadId", (Object) str2);
        }
        String str3 = this.f;
        if (str3 != null) {
            jSONObject.put(WebConstant.WEB_LOGIN_TOKEN_TYPE, (Object) str3);
        }
        UploadTokenInfo uploadTokenInfo = this.g;
        if (uploadTokenInfo != null) {
            jSONObject.put(ApiConstants.ApiField.TOKEN_INFO, (Object) uploadTokenInfo);
        }
        FileInfo[] fileInfoArr = this.k;
        if (fileInfoArr != null) {
            jSONObject.put("fileInfos", (Object) kn2.a(fileInfoArr));
        }
        return kn2.c(jSONObject, b, mcs.EVENT_REQUEST, a2, a3, this.j);
    }
}
