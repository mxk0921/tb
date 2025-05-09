package com.taobao.android.live.plugin.atype.flexalocal.usertask.business;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MtopIliadUsertaskTasksEntryclickResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopIliadUsertaskTasksEntryclickResponseData data;

    static {
        t2o.a(295700115);
    }

    public static /* synthetic */ Object ipc$super(MtopIliadUsertaskTasksEntryclickResponse mtopIliadUsertaskTasksEntryclickResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/usertask/business/MtopIliadUsertaskTasksEntryclickResponse");
    }

    public void setData(MtopIliadUsertaskTasksEntryclickResponseData mtopIliadUsertaskTasksEntryclickResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ec3c048", new Object[]{this, mtopIliadUsertaskTasksEntryclickResponseData});
        } else {
            this.data = mtopIliadUsertaskTasksEntryclickResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public MtopIliadUsertaskTasksEntryclickResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopIliadUsertaskTasksEntryclickResponseData) ipChange.ipc$dispatch("6382fb64", new Object[]{this}) : this.data;
    }
}
