package com.taobao.taopai2.material.business.res;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MaterialResource extends MaterialDetailBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String dirPath;
    public String materialJsonPath;

    static {
        t2o.a(782237888);
    }

    public static /* synthetic */ Object ipc$super(MaterialResource materialResource, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taopai2/material/business/res/MaterialResource");
    }

    public String getDirPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a504e5d", new Object[]{this});
        }
        return this.dirPath;
    }

    public String getMaterialJsonPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c840da4f", new Object[]{this});
        }
        return this.materialJsonPath;
    }

    public void setDirPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6bd0621", new Object[]{this, str});
        } else {
            this.dirPath = str;
        }
    }

    public void setMaterialJsonPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1cfe07", new Object[]{this, str});
        } else {
            this.materialJsonPath = str;
        }
    }
}
