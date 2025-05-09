package com.taobao.android.detail.ttdetail.skeleton.desc.natives.request;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.MtopRequestParams;
import com.taobao.message.message_open_api.ICallService;
import java.util.HashMap;
import tb.t2o;
import tb.uf7;
import tb.xs4;
import tb.zf8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DescDynamicParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String apiName;
    private HashMap<String, String> data;
    private JSONObject mApiUnit;
    public boolean needEcode;
    public boolean needSession;
    public String version;
    public boolean wua;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements zf8<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(DescDynamicParams descDynamicParams) {
        }

        /* renamed from: b */
        public String a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("be839d4a", new Object[]{this, obj});
            }
            return (String) obj;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements zf8<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(DescDynamicParams descDynamicParams) {
        }

        /* renamed from: b */
        public String a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("be839d4a", new Object[]{this, obj});
            }
            return (String) obj;
        }
    }

    static {
        t2o.a(912262436);
        t2o.a(912262184);
    }

    public DescDynamicParams(JSONObject jSONObject) {
        this.mApiUnit = jSONObject;
        JSONObject parseObject = JSON.parseObject(jSONObject.getString("value"));
        if (parseObject != null) {
            this.apiName = parseObject.getString("API_NAME");
            this.version = parseObject.getString("VERSION");
            this.needSession = "true".equals(parseObject.getString(ICallService.KEY_NEED_LOGIN));
            this.needEcode = "true".equals(xs4.b(parseObject.get(ICallService.KEY_NEED_ECODE)));
            this.wua = "true".equals(parseObject.getString("wua"));
            this.data = new HashMap<>();
            JSONObject jSONObject2 = parseObject.getJSONObject("params");
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                this.data.putAll(uf7.b(jSONObject2, new a(this)));
            }
            JSONObject jSONObject3 = parseObject.getJSONObject("exParams");
            if (jSONObject3 != null && !jSONObject3.isEmpty()) {
                this.data.putAll(uf7.b(jSONObject3, new b(this)));
            }
        }
    }

    @Override // com.taobao.android.detail.ttdetail.request.params.MtopRequestParams
    public String toData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("add28f54", new Object[]{this});
        }
        return JSON.toJSONString(this.data);
    }
}
