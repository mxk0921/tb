package com.taobao.taopai2.material.business.materialcategory;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import tb.hrc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CategoryResponseModel implements Serializable, hrc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<CategoryInfo> categoryList;

    static {
        t2o.a(782237864);
        t2o.a(782237924);
    }

    @Override // tb.hrc
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (this.categoryList != null) {
            return true;
        }
        return false;
    }
}
