package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ItemlistV2Response extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ItemlistV2ResponseData data;

    static {
        t2o.a(295698874);
    }

    public static /* synthetic */ Object ipc$super(ItemlistV2Response itemlistV2Response, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/ItemlistV2Response");
    }

    public void setData(ItemlistV2ResponseData itemlistV2ResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc4077e1", new Object[]{this, itemlistV2ResponseData});
        } else {
            this.data = itemlistV2ResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public ItemlistV2ResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ItemlistV2ResponseData) ipChange.ipc$dispatch("fb24067d", new Object[]{this}) : this.data;
    }
}
