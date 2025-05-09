package tb;

import android.text.TextUtils;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.ui.WebConstant;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.RemoteFileInfo;
import com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class oa1 extends ifh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String j;
    public RemoteFileInfo[] k;

    static {
        t2o.a(856686620);
    }

    public static /* synthetic */ Object ipc$super(oa1 oa1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tlog/protocol/model/request/ApplyUploadCompleteRequest");
    }

    public p5o a(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p5o) ipChange.ipc$dispatch("1e64d681", new Object[]{this, str, str2});
        }
        String a2 = ten.a();
        String a3 = ten.a();
        return kn2.c(b(str, str2), kn2.b(this, a2, a3), mcs.EVENT_REQUEST, a2, a3, ten.a());
    }

    public final JSONObject b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("46858c73", new Object[]{this, str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        String str3 = this.j;
        if (str3 != null) {
            jSONObject.put("uploadId", (Object) str3);
        }
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("errorCode", (Object) str);
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("errorMessage", (Object) str2);
        }
        RemoteFileInfo[] remoteFileInfoArr = this.k;
        if (remoteFileInfoArr != null) {
            jSONObject.put("remoteFileInfos", (Object) remoteFileInfoArr);
        }
        String str4 = this.f;
        if (str4 != null) {
            jSONObject.put(WebConstant.WEB_LOGIN_TOKEN_TYPE, (Object) str4);
        }
        UploadTokenInfo uploadTokenInfo = this.g;
        if (uploadTokenInfo != null) {
            jSONObject.put(ApiConstants.ApiField.TOKEN_INFO, (Object) uploadTokenInfo);
        }
        return jSONObject;
    }
}
