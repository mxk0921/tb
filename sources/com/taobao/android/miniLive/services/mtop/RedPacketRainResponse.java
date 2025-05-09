package com.taobao.android.miniLive.services.mtop;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RedPacketRainResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RedPacketInfoWrapper data;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class RedPacketInfo implements INetDataObject {
        public String algoType;
        public String anchorId;
        public String anchorName;
        public String applyEndTime;
        public String applyStartTime;
        public String benefitId;
        public String benefitType;
        public String canDrawStartTime;
        public String ename;
        public String limitationType;
        public String liveId;
        public String liveStartTime;
        public String moneyFrom;
        public String planId;
        public String rainStartTime;
        public String subBizType;
        public long totalAmount;
        public String totalQuantity;
        public String useSituation;
        public boolean valid;
        public String xiaoerPlanId;

        static {
            t2o.a(779092056);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class RedPacketInfoWrapper implements INetDataObject {
        public RedPacketInfo data;

        static {
            t2o.a(779092057);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(779092055);
    }

    public static /* synthetic */ Object ipc$super(RedPacketRainResponse redPacketRainResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/miniLive/services/mtop/RedPacketRainResponse");
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    public Object getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4ca84d6b", new Object[]{this});
        }
        return this.data;
    }

    public void setData(RedPacketInfoWrapper redPacketInfoWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e793431", new Object[]{this, redPacketInfoWrapper});
        } else {
            this.data = redPacketInfoWrapper;
        }
    }
}
