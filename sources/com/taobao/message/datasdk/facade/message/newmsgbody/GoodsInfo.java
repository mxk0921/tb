package com.taobao.message.datasdk.facade.message.newmsgbody;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class GoodsInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String itemId;

    static {
        t2o.a(529530911);
    }

    public String getItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        return this.itemId;
    }

    public void setItemId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7375121", new Object[]{this, str});
        } else {
            this.itemId = str;
        }
    }
}
