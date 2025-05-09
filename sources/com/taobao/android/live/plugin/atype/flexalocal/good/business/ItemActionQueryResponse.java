package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ItemActionQueryResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ItemActionQueryData data;

    static {
        t2o.a(295698869);
    }

    public static /* synthetic */ Object ipc$super(ItemActionQueryResponse itemActionQueryResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/ItemActionQueryResponse");
    }

    public void setData(ItemActionQueryData itemActionQueryData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3354778e", new Object[]{this, itemActionQueryData});
        } else {
            this.data = itemActionQueryData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public ItemActionQueryData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ItemActionQueryData) ipChange.ipc$dispatch("8dbba038", new Object[]{this}) : this.data;
    }
}
