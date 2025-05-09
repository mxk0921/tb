package com.taobao.message.chatv2.viewcenter;

import com.alibaba.fastjson.JSONObject;
import com.taobao.message.chatv2.viewcenter.config.LayoutInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITemplateService {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface ISyncListener {
        void onSync();
    }

    void addSyncListener(ISyncListener iSyncListener);

    LayoutInfo getLayoutInfo(int i, JSONObject jSONObject);

    void removeSyncListener(ISyncListener iSyncListener);
}
