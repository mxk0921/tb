package com.taobao.taopai2.material.business.materiallist;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.base.MaterialBaseRequestParams;
import java.io.Serializable;
import tb.sg8;
import tb.t2o;
import tb.ztl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MaterialListRequestParams extends MaterialBaseRequestParams implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int clientVersion;
    public String materialCategoryId;
    public long materialGroupId;
    public int page;
    public int pageSize;
    public String topRankIdList;

    static {
        t2o.a(782237869);
    }

    public MaterialListRequestParams(long j, String str, int i, int i2, int i3, String str2) {
        this.materialGroupId = j;
        this.materialCategoryId = str;
        this.page = i;
        this.pageSize = i2;
        this.clientVersion = i3;
        this.topRankIdList = str2;
    }

    public static /* synthetic */ Object ipc$super(MaterialListRequestParams materialListRequestParams, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taopai2/material/business/materiallist/MaterialListRequestParams");
    }

    @Override // com.taobao.taopai2.material.base.MaterialBaseRequestParams, tb.erc
    public String getAPI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef90fe95", new Object[]{this});
        }
        return "mtop.alibaba.tspeditor.material.extend.material.list";
    }

    @Override // com.taobao.taopai2.material.base.MaterialBaseRequestParams, tb.yqc
    public String getCachePath() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97112b88", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.materialGroupId);
        sb.append("_");
        sb.append(this.materialCategoryId);
        sb.append("_");
        sb.append(this.page);
        sb.append("_");
        sb.append(this.pageSize);
        sb.append("_");
        sb.append(this.topRankIdList);
        sb.append("_");
        if (sg8.a()) {
            str = "1";
        } else {
            str = "0";
        }
        sb.append(str);
        return ztl.f() + "material_list_" + sb.toString();
    }
}
