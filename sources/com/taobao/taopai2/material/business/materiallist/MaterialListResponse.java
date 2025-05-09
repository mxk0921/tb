package com.taobao.taopai2.material.business.materiallist;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import java.io.Serializable;
import java.util.List;
import tb.hrc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MaterialListResponse implements Serializable, hrc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String filterInfoMap;
    public boolean hasNext;
    public List<MaterialDetailBean> materialList;
    public int page;
    public int pageSize;
    public int total;
    public int totalPage;

    static {
        t2o.a(782237870);
        t2o.a(782237924);
    }

    @Override // tb.hrc
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (this.materialList != null) {
            return true;
        }
        return false;
    }
}
