package com.taobao.android.tab2liveroom.liveroom.preload.business;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tab2liveroom.liveroom.preload.LivePreloadData;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class PreloadRecommendResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "data")
    public a data;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a {
        @JSONField(name = "code")
        public String code;
        @JSONField(name = "data")
        public LivePreloadData data;

        static {
            t2o.a(779092164);
        }
    }

    static {
        t2o.a(779092163);
    }

    public static /* synthetic */ Object ipc$super(PreloadRecommendResponse preloadRecommendResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tab2liveroom/liveroom/preload/business/PreloadRecommendResponse");
    }

    public LivePreloadData getPreloadResponseData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LivePreloadData) ipChange.ipc$dispatch("34b4322f", new Object[]{this});
        }
        a aVar = this.data;
        if (aVar == null) {
            return null;
        }
        return aVar.data;
    }

    public void setData(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2a04d", new Object[]{this, aVar});
        } else {
            this.data = aVar;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public a getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("5f3e8777", new Object[]{this}) : this.data;
    }
}
