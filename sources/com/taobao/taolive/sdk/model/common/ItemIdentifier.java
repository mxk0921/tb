package com.taobao.taolive.sdk.model.common;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.Objects;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ItemIdentifier implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int goodsIndex;
    public String itemId;
    public int pos;
    public int priority;
    public String trackInfo;
    public JSONObject transferParams;
    public int type;

    static {
        t2o.a(806356224);
        t2o.a(806355930);
    }

    public ItemIdentifier() {
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || ItemIdentifier.class != obj.getClass()) {
            return false;
        }
        ItemIdentifier itemIdentifier = (ItemIdentifier) obj;
        return this.goodsIndex == itemIdentifier.goodsIndex && this.itemId.equals(itemIdentifier.itemId);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return Objects.hash(Integer.valueOf(this.goodsIndex), this.itemId);
    }

    public ItemIdentifier(int i, String str) {
        this.goodsIndex = i;
        this.itemId = str;
    }

    public boolean equals(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1b9c438b", new Object[]{this, new Integer(i), str})).booleanValue() : this.goodsIndex == i && TextUtils.equals(this.itemId, str);
    }
}
