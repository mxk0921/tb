package com.taobao.taolive.sdk.business.interact.favor;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.model.interact.FavorDO;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class FavorResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FavorDO data;

    static {
        t2o.a(806356015);
    }

    public static /* synthetic */ Object ipc$super(FavorResponse favorResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/interact/favor/FavorResponse");
    }

    public void setData(FavorDO favorDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c8050f", new Object[]{this, favorDO});
        } else {
            this.data = favorDO;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public FavorDO getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FavorDO) ipChange.ipc$dispatch("8974a979", new Object[]{this}) : this.data;
    }
}
