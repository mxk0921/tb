package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GoodListSearchResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public GoodListSearchResponseData data;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class GoodListSearchResponseData implements INetDataObject {
        public boolean hasNext;
        public List<ItemlistV2ResponseData.ItemListv1> itemListv1;
        public JSONObject searchTransferInfo;
        public int totalNum;

        static {
            t2o.a(295698862);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(295698861);
    }

    public static /* synthetic */ Object ipc$super(GoodListSearchResponse goodListSearchResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/GoodListSearchResponse");
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public GoodListSearchResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GoodListSearchResponseData) ipChange.ipc$dispatch("7095f733", new Object[]{this}) : this.data;
    }
}
