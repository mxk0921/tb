package com.taobao.umipublish.extension.windvane.abilities;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.abilities.BaseAbility;
import tb.nsw;
import tb.rb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WVListener implements BaseAbility.Listener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WVCallBackContext f14072a;

    static {
        t2o.a(944767196);
        t2o.a(944767147);
    }

    public WVListener(WVCallBackContext wVCallBackContext) {
        this.f14072a = wVCallBackContext;
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb8b0117", new Object[]{this, str, str2});
            return;
        }
        nsw nswVar = new nsw("HY_FAILED");
        nswVar.b("errorCode", str);
        nswVar.b("errorMsg", str2);
        this.f14072a.error(nswVar);
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
    public void onProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
    public void onSuccess(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put(rb.RESULT_KEY, "HY_SUCCESS");
        this.f14072a.success(jSONObject.toJSONString());
    }
}
