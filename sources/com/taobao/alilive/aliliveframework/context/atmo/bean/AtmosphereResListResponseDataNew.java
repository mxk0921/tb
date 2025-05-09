package com.taobao.alilive.aliliveframework.context.atmo.bean;

import com.taobao.alilive.aliliveframework.context.atmo.bean.AtmosphereResListResponseData;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AtmosphereResListResponseDataNew implements INetDataObject {
    public List<AtmosphereResListResponseData.AtmosphereResItem> otherAtmosphere;
    public List<TabInfo> tabInfoList;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class TabInfo implements INetDataObject {
        public List<AtmosphereResListResponseData.AtmosphereResItem> stickerList;
        public String tabIcon;
        public String tabKey;
        public String unTabIcon;

        static {
            t2o.a(806355007);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(806355006);
        t2o.a(806355930);
    }
}
