package com.taobao.android.live.plugin.atype.flexalocal.usertask.business;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MtopIliadUsertaskTasksDotaskResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopIliadUsertaskTasksDotaskResponseData data;

    static {
        t2o.a(295700107);
    }

    public static /* synthetic */ Object ipc$super(MtopIliadUsertaskTasksDotaskResponse mtopIliadUsertaskTasksDotaskResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/usertask/business/MtopIliadUsertaskTasksDotaskResponse");
    }

    public void setData(MtopIliadUsertaskTasksDotaskResponseData mtopIliadUsertaskTasksDotaskResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9be66d4e", new Object[]{this, mtopIliadUsertaskTasksDotaskResponseData});
        } else {
            this.data = mtopIliadUsertaskTasksDotaskResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public MtopIliadUsertaskTasksDotaskResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopIliadUsertaskTasksDotaskResponseData) ipChange.ipc$dispatch("88a46e6a", new Object[]{this}) : this.data;
    }
}
