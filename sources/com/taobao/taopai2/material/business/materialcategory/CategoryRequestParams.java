package com.taobao.taopai2.material.business.materialcategory;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.base.MaterialBaseRequestParams;
import tb.sg8;
import tb.t2o;
import tb.ztl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CategoryRequestParams extends MaterialBaseRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long materialGroupId;
    public int materialType;

    static {
        t2o.a(782237863);
    }

    public CategoryRequestParams(long j, int i) {
        this.materialGroupId = j;
        this.materialType = i;
    }

    public static /* synthetic */ Object ipc$super(CategoryRequestParams categoryRequestParams, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taopai2/material/business/materialcategory/CategoryRequestParams");
    }

    @Override // com.taobao.taopai2.material.base.MaterialBaseRequestParams, tb.erc
    public String getAPI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef90fe95", new Object[]{this});
        }
        return "mtop.alibaba.tspeditor.material.extend.category.list";
    }

    @Override // com.taobao.taopai2.material.base.MaterialBaseRequestParams, tb.yqc
    public String getCachePath() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97112b88", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ztl.f());
        sb.append("material_category_");
        sb.append(this.materialGroupId);
        sb.append("_");
        sb.append(this.materialType);
        sb.append("_");
        if (sg8.a()) {
            str = "1";
        } else {
            str = "0";
        }
        sb.append(str);
        return sb.toString();
    }

    public CategoryRequestParams(String str, String str2, int i, long j, int i2) {
        super(str, str2, i);
        this.materialGroupId = j;
        this.materialType = i2;
    }
}
