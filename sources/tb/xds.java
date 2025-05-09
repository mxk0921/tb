package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class xds {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(839909980);
    }

    public static final Uri a(Uri uri, bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("957c5d33", new Object[]{uri, bbsVar});
        }
        ckf.g(uri, "<this>");
        ckf.g(bbsVar, "instance");
        try {
            String queryParameter = uri.getQueryParameter(yj4.PARAM_UT_PARAMS);
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(queryParameter)) {
                jSONObject = JSON.parseObject(queryParameter);
                ckf.f(jSONObject, "parseObject(utParam)");
            }
            String b0 = bbsVar.b0();
            ckf.f(b0, "instance.spmOri");
            if (!TextUtils.isEmpty(b0)) {
                jSONObject.put((JSONObject) "spm_ori", b0);
            }
            if (TMSInstanceExtKt.u(bbsVar)) {
                jSONObject.put((JSONObject) "widget_id", bbsVar.L());
            } else {
                jSONObject.put((JSONObject) "miniapp_id", bbsVar.L());
            }
            return uri.buildUpon().appendQueryParameter(yj4.PARAM_UT_PARAMS, jSONObject.toJSONString()).build();
        } catch (Throwable th) {
            TMSLogger.c("TMSUTUtils", "", th);
            return uri;
        }
    }
}
