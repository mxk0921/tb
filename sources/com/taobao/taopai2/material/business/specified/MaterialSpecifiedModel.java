package com.taobao.taopai2.material.business.specified;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import com.taobao.taopai2.material.request.Response;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MaterialSpecifiedModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String filterInfoMap;
    public List<MaterialDetailBean> materialList;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class MaterialSpecifiedResponse extends Response<MaterialSpecifiedModel> {
        static {
            t2o.a(782237910);
        }
    }

    static {
        t2o.a(782237909);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MaterialSpecifiedModel{filterInfoMap='" + this.filterInfoMap + "', materialList=" + this.materialList + '}';
    }
}
