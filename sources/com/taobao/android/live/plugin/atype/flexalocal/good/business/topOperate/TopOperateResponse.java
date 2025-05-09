package com.taobao.android.live.plugin.atype.flexalocal.good.business.topOperate;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TopOperateResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TopOperateResponseData data;

    static {
        t2o.a(295698921);
    }

    public static /* synthetic */ Object ipc$super(TopOperateResponse topOperateResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/topOperate/TopOperateResponse");
    }

    public void setData(TopOperateResponseData topOperateResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("934aef9d", new Object[]{this, topOperateResponseData});
        } else {
            this.data = topOperateResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public TopOperateResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TopOperateResponseData) ipChange.ipc$dispatch("2e0603c7", new Object[]{this}) : this.data;
    }
}
