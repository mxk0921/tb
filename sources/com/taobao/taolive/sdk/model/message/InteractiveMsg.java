package com.taobao.taolive.sdk.model.message;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class InteractiveMsg implements INetDataObject {
    public ArrayList<Component> components;
    public String messageSubType;
    public String name;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Component implements INetDataObject {
        public String action;
        public Data data;
        public int duration;
        public String name;
        public String traceInfo;
        public String type;

        static {
            t2o.a(806356321);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Data implements INetDataObject {
        public String message;
        public String replyName;
        public String userNick;

        static {
            t2o.a(806356322);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(806356320);
        t2o.a(806355930);
    }
}
