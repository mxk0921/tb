package com.taobao.linkmanager.afc.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import org.json.JSONObject;
import tb.kpw;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AfcIdJsBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION = "getAfcId";
    public static final String NAME = "AfcIdHandler";

    static {
        t2o.a(744489051);
    }

    public static /* synthetic */ Object ipc$super(AfcIdJsBridge afcIdJsBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/linkmanager/afc/windvane/AfcIdJsBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!TextUtils.equals(str, ACTION) || wVCallBackContext == null) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("afcId", UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        nsw nswVar = new nsw();
        nswVar.d("data", jSONObject);
        wVCallBackContext.success(nswVar);
        return true;
    }
}
