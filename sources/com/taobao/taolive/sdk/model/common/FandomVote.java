package com.taobao.taolive.sdk.model.common;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class FandomVote implements INetDataObject {
    public String materialName;
    public String name;
    public int optionType;
    public ArrayList<Options> options;
    public int votedOption;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Options implements INetDataObject {
        public int id;
        public String name;
        public String picUrl;
        public String rate;

        static {
            t2o.a(806356220);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(806356219);
        t2o.a(806355930);
    }
}
