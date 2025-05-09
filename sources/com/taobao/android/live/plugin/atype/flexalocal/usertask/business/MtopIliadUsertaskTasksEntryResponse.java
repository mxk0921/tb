package com.taobao.android.live.plugin.atype.flexalocal.usertask.business;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MtopIliadUsertaskTasksEntryResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopIliadUsertaskTasksEntryResponseData data;

    static {
        t2o.a(295700110);
    }

    public static /* synthetic */ Object ipc$super(MtopIliadUsertaskTasksEntryResponse mtopIliadUsertaskTasksEntryResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/usertask/business/MtopIliadUsertaskTasksEntryResponse");
    }

    public void setData(MtopIliadUsertaskTasksEntryResponseData mtopIliadUsertaskTasksEntryResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("160d7fca", new Object[]{this, mtopIliadUsertaskTasksEntryResponseData});
        } else {
            this.data = mtopIliadUsertaskTasksEntryResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public MtopIliadUsertaskTasksEntryResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopIliadUsertaskTasksEntryResponseData) ipChange.ipc$dispatch("d1759274", new Object[]{this}) : this.data;
    }
}
