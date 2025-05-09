package tb;

import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.ui.WebConstant;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fiq extends ifh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String j;
    public String k;
    public String l;
    public Long m;
    public String n;
    public String o;

    static {
        t2o.a(856686625);
    }

    public static /* synthetic */ Object ipc$super(fiq fiqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tlog/protocol/model/request/StartupRequest");
    }

    public p5o a() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p5o) ipChange.ipc$dispatch("a5940095", new Object[]{this});
        }
        String a2 = ten.a();
        String a3 = ten.a();
        String a4 = ten.a();
        JSONObject b = kn2.b(this, a2, a3);
        JSONObject jSONObject = new JSONObject();
        String str = this.h;
        if (str != null) {
            jSONObject.put("appVersion", (Object) str);
        }
        String str2 = this.j;
        if (str2 != null) {
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) str2);
        }
        String str3 = this.d;
        if (str3 != null) {
            jSONObject.put("userNick", (Object) str3);
        }
        String str4 = this.k;
        if (str4 != null) {
            jSONObject.put("osPlatform", (Object) str4);
        }
        String str5 = this.l;
        if (str5 != null) {
            jSONObject.put("osVersion", (Object) str5);
        }
        Long l = this.m;
        if (l != null) {
            jSONObject.put("clientTime", (Object) l);
        }
        String str6 = this.n;
        if (str6 != null) {
            jSONObject.put("brand", (Object) str6);
        }
        String str7 = this.o;
        if (str7 != null) {
            jSONObject.put(pod.IP, (Object) str7);
        }
        String str8 = this.f;
        if (str8 != null) {
            jSONObject.put(WebConstant.WEB_LOGIN_TOKEN_TYPE, (Object) str8);
        }
        UploadTokenInfo uploadTokenInfo = this.g;
        if (uploadTokenInfo != null) {
            jSONObject.put(ApiConstants.ApiField.TOKEN_INFO, (Object) uploadTokenInfo);
        }
        return kn2.c(jSONObject, b, mcs.EVENT_REQUEST, a2, a3, a4);
    }
}
