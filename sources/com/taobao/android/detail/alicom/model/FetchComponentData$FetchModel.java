package com.taobao.android.detail.alicom.model;

import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class FetchComponentData$FetchModel implements Serializable {
    public ComponentData componentData;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class ComponentData implements Serializable {
        public List<Area> area;
        public String areaName;
        public List<Network> network;
        public String networkName;
        public Number phoneNumber;
        public String phoneNumberName;
        public List<Plan> plan;
        public List<Plan> planLite;
        public String planLiteName;
        public String planName;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class Area implements Serializable {
            public List<City> city;
            public String code;
            public String name;

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
            public static class City implements Serializable {
                public String cityInitial;
                public String code;
                public String name;
                public List<String> network;
                public List<String> planIds;
                public String selected;

                static {
                    t2o.a(703594513);
                }
            }

            static {
                t2o.a(703594512);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class Network implements Serializable {
            public String code;
            public String name;

            static {
                t2o.a(703594514);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class Number implements Serializable {
            public int selectNumType;

            static {
                t2o.a(703594515);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class Plan implements Serializable {
            public String contractDesc;
            public String feeRuleMemo;
            public String name;
            public String nativeDesc;
            public String numPreFree;
            public String planId;

            static {
                t2o.a(703594516);
            }
        }

        static {
            t2o.a(703594511);
        }
    }

    static {
        t2o.a(703594510);
    }

    public FetchComponentData$FetchModel(ComponentData componentData) {
        this.componentData = componentData;
    }
}
