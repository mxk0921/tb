package com.taobao.mytaobao.newsetting.business.request;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SettingsRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SettingsRequest";

    static {
        t2o.a(745537827);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3245c2fc", new Object[]{context, str});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.mclaren.menue.reddot");
        mtopRequest.setVersion("1.0");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("aim", (Object) "settingClick");
        jSONObject.put("menuKey", (Object) str);
        mtopRequest.setData(JSON.toJSONString(jSONObject));
        MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, context), mtopRequest, TaoHelper.getTTID()).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.mytaobao.newsetting.business.request.SettingsRequest.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    v7t.d(SettingsRequest.TAG, "onSystemError: response of red dot occur error!");
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else {
                    v7t.a(SettingsRequest.TAG, "onSuccess: response of red dot success.");
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    v7t.d(SettingsRequest.TAG, "onSystemError: response of red dot occur system error!");
                }
            }
        }).startRequest();
    }
}
