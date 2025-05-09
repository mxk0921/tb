package com.taobao.taopai.material.maires;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MaiResDependenceList {
    @JSONField(name = "dependence")
    public List<MaiResDependenceItem> mDependenceList;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class MaiResDependenceItem {
        @JSONField(name = "eagerinit")
        public int eagerInit;
        public int id;
        public boolean isDownloadSuccess;
        public int materialGroup;
        public int materialType;
        public String module;
        public String name;
        public String type;
        public String url;
        public int version;

        static {
            t2o.a(782237775);
        }
    }

    static {
        t2o.a(782237774);
    }
}
