package com.taobao.android.layoutmanager.module;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.content.business.ContentBusinessModel;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import org.json.JSONException;
import tb.gat;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class BusinessModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502268098);
        t2o.a(503316559);
    }

    public static void reportBusiness(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8abd29f8", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            gat gatVar = new gat();
            ContentBusinessModel contentBusinessModel = new ContentBusinessModel();
            contentBusinessModel.adUserId = jSONObject.getString(gat.ACCOUNT_ID);
            contentBusinessModel.itemId = jSONObject.getString("itemId");
            contentBusinessModel.contentId = jSONObject.getString("contentId");
            contentBusinessModel.ct = jSONObject.getString(gat.CT);
            contentBusinessModel.sId = jSONObject.getString(gat.SID);
            contentBusinessModel.scenceId = jSONObject.getString(gat.BIZ_TYPE);
            contentBusinessModel.pageName = jSONObject.getString("pageName");
            contentBusinessModel.tcpBid = jSONObject.getString(gat.TCP_BID);
            contentBusinessModel.sourceType = jSONObject.getString("sourceType");
            try {
                contentBusinessModel.context = new org.json.JSONObject(jSONObject.getJSONObject("extObject").toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            gatVar.e(contentBusinessModel, null);
        }
    }
}
