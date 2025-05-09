package com.taobao.android.live.plugin.atype.flexalocal.good.business.fansClub;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FansClubResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public FansClubResponseData data;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class FansClubResponseData implements INetDataObject {
        public int clubLevel;
        public String clubLevelIcon;
        public String clubLevelWithFavorIcon;
        public int status;

        static {
            t2o.a(295698908);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(295698907);
    }

    public static /* synthetic */ Object ipc$super(FansClubResponse fansClubResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/fansClub/FansClubResponse");
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public FansClubResponseData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FansClubResponseData) ipChange.ipc$dispatch("1e4294e0", new Object[]{this}) : this.data;
    }
}
