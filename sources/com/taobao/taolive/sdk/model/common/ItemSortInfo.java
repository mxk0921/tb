package com.taobao.taolive.sdk.model.common;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ItemSortInfo implements INetDataObject {
    public ItemIdentifier currentItemSort;
    public List<ItemIdentifier> customRules;
    public List<ItemIdentifier> sortList;
    public long sortTime;

    static {
        t2o.a(806356225);
        t2o.a(806355930);
    }
}
