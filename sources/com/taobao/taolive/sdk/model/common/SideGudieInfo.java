package com.taobao.taolive.sdk.model.common;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class SideGudieInfo implements INetDataObject {
    public String gudieIcon;
    public String gudieTitle;
    public String recommendImg;
    public List<RecommendTextList> recommendTextList;
    public String recommendType;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class RecommendTextList implements INetDataObject {
        public String color;
        public String icon;
        public String isBlod;
        public String text;

        static {
            t2o.a(806356251);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(806356250);
        t2o.a(806355930);
    }
}
