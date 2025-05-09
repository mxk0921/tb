package com.taobao.taolive.room.business.timemoveReplay;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ReplayTimeMovingBean implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Long StartSeekTime;
    public Long endSeekTime;
    public String itemCover;
    public Long itemId;
    public Integer itemIndex;
    public String itemTitle;

    static {
        t2o.a(779092834);
        t2o.a(806355930);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ReplayTimeMovingBean{StartSeekTime=" + this.StartSeekTime + ", endSeekTime=" + this.endSeekTime + ", itemId=" + this.itemId + ", itemTitle='" + this.itemTitle + "', itemIndex=" + this.itemIndex + ", itemCover='" + this.itemCover + "'}";
    }
}
