package com.taobao.message.lab.comfrm.support;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.inner2.DeltaItem;
import com.taobao.message.lab.comfrm.inner2.DeltaItemMerger;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class CustomResourceDeltaItemMerger implements DeltaItemMerger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(537919765);
        t2o.a(537919592);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.DeltaItemMerger
    public DeltaItem merge(DeltaItem... deltaItemArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeltaItem) ipChange.ipc$dispatch("a3d8e740", new Object[]{this, deltaItemArr});
        }
        if (deltaItemArr.length == 2) {
            HashMap hashMap = new HashMap((Map) deltaItemArr[0].getDataChange());
            hashMap.putAll((Map) deltaItemArr[1].getDataChange());
            return new DeltaItem(deltaItemArr[0].getDataType(), hashMap);
        }
        throw new IllegalArgumentException("ListDeltaItemMerger|NOTSUPPORT");
    }
}
