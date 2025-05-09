package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.componentlist;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MtopMediaplatformDetailComponentlistResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopMediaplatformDetailComponentlistResponseData data;

    static {
        t2o.a(295699861);
    }

    public static /* synthetic */ Object ipc$super(MtopMediaplatformDetailComponentlistResponse mtopMediaplatformDetailComponentlistResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/componentlist/MtopMediaplatformDetailComponentlistResponse");
    }

    public void setData(MtopMediaplatformDetailComponentlistResponseData mtopMediaplatformDetailComponentlistResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e409755", new Object[]{this, mtopMediaplatformDetailComponentlistResponseData});
        } else {
            this.data = mtopMediaplatformDetailComponentlistResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public MtopMediaplatformDetailComponentlistResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopMediaplatformDetailComponentlistResponseData) ipChange.ipc$dispatch("bc997971", new Object[]{this}) : this.data;
    }
}
