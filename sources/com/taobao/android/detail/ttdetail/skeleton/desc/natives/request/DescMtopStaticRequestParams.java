package com.taobao.android.detail.ttdetail.skeleton.desc.natives.request;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.MtopRequestParams;
import java.util.HashMap;
import java.util.Map;
import tb.ar3;
import tb.cd7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DescMtopStaticRequestParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, String> moduleDescParams;

    static {
        t2o.a(912262442);
        t2o.a(912262184);
    }

    public DescMtopStaticRequestParams(Map<String, String> map) {
        this.moduleDescParams = map;
    }

    @Override // com.taobao.android.detail.ttdetail.request.params.MtopRequestParams
    public String toData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("add28f54", new Object[]{this});
        }
        return JSON.toJSONString(toMap());
    }

    public HashMap<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1c79404b", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("detail_v", "3.3.2");
        if (!ar3.d(this.moduleDescParams)) {
            hashMap.putAll(this.moduleDescParams);
        }
        return hashMap;
    }

    public DescMtopStaticRequestParams(cd7 cd7Var) {
        this.moduleDescParams = new HashMap();
        if (!ar3.d(cd7Var.f16989a)) {
            this.moduleDescParams.putAll(cd7Var.f16989a);
        }
        if (!ar3.d(cd7Var.b)) {
            this.moduleDescParams.putAll(cd7Var.b);
        }
    }
}
