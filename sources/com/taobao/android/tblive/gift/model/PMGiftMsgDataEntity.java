package com.taobao.android.tblive.gift.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class PMGiftMsgDataEntity implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public GiftInfoDataEntity giftEffectInfo;

    static {
        t2o.a(806355324);
    }

    public GiftInfoDataEntity getGiftEffectInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GiftInfoDataEntity) ipChange.ipc$dispatch("2393262f", new Object[]{this});
        }
        return this.giftEffectInfo;
    }

    public void setGiftEffectInfo(GiftInfoDataEntity giftInfoDataEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d3acdb", new Object[]{this, giftInfoDataEntity});
        } else {
            this.giftEffectInfo = giftInfoDataEntity;
        }
    }
}
