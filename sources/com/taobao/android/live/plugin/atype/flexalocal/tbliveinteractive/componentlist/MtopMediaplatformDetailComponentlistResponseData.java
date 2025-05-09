package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.componentlist;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MtopMediaplatformDetailComponentlistResponseData implements INetDataObject {
    public boolean enableMultiBatchRender = false;
    public JSONObject extend;
    public ArrayList<Component> result;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class Component implements INetDataObject {
        public String actionUrl;
        public String bundleMD5;
        public String bundleUrl;
        public String comptType;
        public String currentState;
        public String customizedMtop;
        public String downgrade;
        public String features;
        public String fedName;
        public int hideable;
        public String iconAction;
        public String iconUrl;
        public String iconViewStyle;
        public String id;
        public boolean interactivePanelDisplayOnly;
        public String isKeepAlive;
        public String isOffline;
        public String label;
        public boolean migrationFlag;
        public String name;
        public String panelTitle;
        public String priority;
        public boolean rightShowFlag;
        public String schemaId;
        public String type;
        public String unique;
        public String url;
        public String version;
        public int showOrder = -1;
        public int customizedType = 0;

        static {
            t2o.a(295699863);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(295699862);
        t2o.a(806355930);
    }
}
