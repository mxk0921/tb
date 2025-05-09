package com.taobao.taolive.sdk.goodlist;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TemplateListResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TemplateListResponseData data;

    static {
        t2o.a(806356125);
    }

    public static /* synthetic */ Object ipc$super(TemplateListResponse templateListResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/goodlist/TemplateListResponse");
    }

    public void setData(TemplateListResponseData templateListResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b47a4614", new Object[]{this, templateListResponseData});
        } else {
            this.data = templateListResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public TemplateListResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateListResponseData) ipChange.ipc$dispatch("9d920cf0", new Object[]{this}) : this.data;
    }
}
