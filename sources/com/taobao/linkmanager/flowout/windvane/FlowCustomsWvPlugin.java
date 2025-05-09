package com.taobao.linkmanager.flowout.windvane;

import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONObject;
import tb.hq9;
import tb.jq9;
import tb.kpw;
import tb.t2o;
import tb.vp9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FlowCustomsWvPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_OPEN_URL = "openURL";
    public static final String PLUGIN_NAME = "TBWVOpenHandler";

    static {
        t2o.a(744489102);
    }

    public static /* synthetic */ Object ipc$super(FlowCustomsWvPlugin flowCustomsWvPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/linkmanager/flowout/windvane/FlowCustomsWvPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !str.equals(ACTION_OPEN_URL)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String optString = jSONObject.optString("id");
            String optString2 = jSONObject.optString("failMode");
            String optString3 = jSONObject.optString("url");
            String optString4 = jSONObject.optString(hq9.DEGTAGE_H5URL);
            if (TextUtils.isEmpty(optString)) {
                optString = jSONObject.optString(hq9.VISA);
            }
            HashMap hashMap = new HashMap(16);
            hashMap.put("id", optString);
            hashMap.put("failMode", optString2);
            hashMap.put("url", URLEncoder.encode(optString3, "UTF-8"));
            hashMap.put(hq9.DEGTAGE_H5URL, URLEncoder.encode(optString4, "UTF-8"));
            boolean v = jq9.v(TbFcLinkInit.instance().mApplication, Uri.parse(TFCCommonUtils.e("tbout://m.taobao.com/out.htm?", hashMap)));
            vp9.a("linkx", "FlowCustomsWvPlugin === execute === 跳转是否成功==" + v);
            if (wVCallBackContext != null) {
                if (v) {
                    wVCallBackContext.success();
                } else {
                    wVCallBackContext.error();
                }
            }
        } catch (Exception e) {
            vp9.a("linkx", "FlowCustomsWvPlugin === execute === 跳转异常=" + e);
        }
        return true;
    }
}
