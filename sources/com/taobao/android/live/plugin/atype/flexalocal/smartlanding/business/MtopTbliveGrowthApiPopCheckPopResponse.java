package com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MtopTbliveGrowthApiPopCheckPopResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopTbliveGrowthApiPopCheckPopResponseData data;

    static {
        t2o.a(295699721);
    }

    public static /* synthetic */ Object ipc$super(MtopTbliveGrowthApiPopCheckPopResponse mtopTbliveGrowthApiPopCheckPopResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/smartlanding/business/MtopTbliveGrowthApiPopCheckPopResponse");
    }

    public void setData(MtopTbliveGrowthApiPopCheckPopResponseData mtopTbliveGrowthApiPopCheckPopResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400325b4", new Object[]{this, mtopTbliveGrowthApiPopCheckPopResponseData});
        } else {
            this.data = mtopTbliveGrowthApiPopCheckPopResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public MtopTbliveGrowthApiPopCheckPopResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopTbliveGrowthApiPopCheckPopResponseData) ipChange.ipc$dispatch("3b3c0590", new Object[]{this}) : this.data;
    }
}
