package com.taobao.android.live.plugin.atype.flexalocal.push.business.responses;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.push.business.data.ActionResponseData;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ActionResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ActionResponseData data;

    static {
        t2o.a(295699633);
    }

    public static /* synthetic */ Object ipc$super(ActionResponse actionResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/push/business/responses/ActionResponse");
    }

    public void setData(ActionResponseData actionResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecee1e8e", new Object[]{this, actionResponseData});
        } else {
            this.data = actionResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public ActionResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActionResponseData) ipChange.ipc$dispatch("8e7553b8", new Object[]{this}) : this.data;
    }
}
