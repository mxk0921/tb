package com.taobao.taolive.dinamicext.view.tbliveFllowContent.mtop.dxConfig;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TemplateListResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TemplateListResponseData data;

    static {
        t2o.a(779092486);
    }

    public static /* synthetic */ Object ipc$super(TemplateListResponse templateListResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/dinamicext/view/tbliveFllowContent/mtop/dxConfig/TemplateListResponse");
    }

    public void setData(TemplateListResponseData templateListResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc10764", new Object[]{this, templateListResponseData});
        } else {
            this.data = templateListResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public TemplateListResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateListResponseData) ipChange.ipc$dispatch("67e3a1c0", new Object[]{this}) : this.data;
    }
}
