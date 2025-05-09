package tb;

import android.text.TextUtils;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.ui.WebConstant;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo;
import com.taobao.android.tlog.protocol.model.request.base.FileInfo;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ta1 extends ifh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String j;
    public String k;
    public String l;
    public FileInfo[] m;

    static {
        t2o.a(856686621);
    }

    public static /* synthetic */ Object ipc$super(ta1 ta1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tlog/protocol/model/request/ApplyUploadRequest");
    }

    public p5o a(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p5o) ipChange.ipc$dispatch("af120c4b", new Object[]{this, str});
        }
        String a2 = ten.a();
        if (TextUtils.isEmpty(str)) {
            str = ten.a();
        }
        JSONObject b = kn2.b(this, a2, str);
        JSONObject jSONObject = new JSONObject();
        String str2 = this.k;
        if (str2 != null) {
            jSONObject.put("debugType", (Object) str2);
        }
        String str3 = this.j;
        if (str3 != null) {
            jSONObject.put("bizType", (Object) str3);
        }
        String str4 = this.l;
        if (str4 != null) {
            jSONObject.put("bizCode", (Object) str4);
        }
        String str5 = this.f;
        if (str5 != null) {
            jSONObject.put(WebConstant.WEB_LOGIN_TOKEN_TYPE, (Object) str5);
        }
        UploadTokenInfo uploadTokenInfo = this.g;
        if (uploadTokenInfo != null) {
            jSONObject.put(ApiConstants.ApiField.TOKEN_INFO, (Object) uploadTokenInfo);
        }
        FileInfo[] fileInfoArr = this.m;
        if (fileInfoArr != null) {
            jSONObject.put("fileInfos", (Object) kn2.a(fileInfoArr));
        }
        Map<String, Object> map = this.i;
        if (map != null) {
            jSONObject.put("extraInfo", (Object) map);
        }
        return kn2.c(jSONObject, b, mcs.EVENT_REQUEST, a2, str, str);
    }
}
