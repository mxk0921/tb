package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.business.list;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class InteractiveNeedShowResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private InteractiveShowInfo data;

    static {
        t2o.a(295699847);
    }

    public static /* synthetic */ Object ipc$super(InteractiveNeedShowResponse interactiveNeedShowResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/business/list/InteractiveNeedShowResponse");
    }

    public void setData(InteractiveShowInfo interactiveShowInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf2cc9f6", new Object[]{this, interactiveShowInfo});
        } else {
            this.data = interactiveShowInfo;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public InteractiveShowInfo getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InteractiveShowInfo) ipChange.ipc$dispatch("61bf0ce0", new Object[]{this}) : this.data;
    }
}
