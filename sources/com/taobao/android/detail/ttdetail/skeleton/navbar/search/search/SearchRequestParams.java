package com.taobao.android.detail.ttdetail.skeleton.navbar.search.search;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.MtopRequestParams;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SearchRequestParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String appId;
    public Params params;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class Params implements Serializable {
        public String area;
        public String itemId;
        public String nick;
        public String shopId;
        public String ttid;
        public String userId;
        public String utdid;

        static {
            t2o.a(912262625);
        }
    }

    static {
        t2o.a(912262624);
        t2o.a(912262184);
    }

    public String getParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63f8f7fd", new Object[]{this});
        }
        return JSON.toJSONString(this.params);
    }

    @Override // com.taobao.android.detail.ttdetail.request.params.MtopRequestParams
    public String toData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("add28f54", new Object[]{this});
        }
        return JSON.toJSONString(this);
    }
}
