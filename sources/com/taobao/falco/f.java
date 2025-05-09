package com.taobao.falco;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface f {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        public static final int TYPE_BATTERY_INFO = 4;
        public static final int TYPE_CPU_INFO = 7;
        public static final int TYPE_DEVICE_PORTRAIT = 9;
        public static final int TYPE_FLOW_SESSION = 1;
        public static final int TYPE_LAUNCH_VISIT = 3;
        public static final int TYPE_MEMORY_INFO = 8;
        public static final int TYPE_NETWORK_INFO = 5;
        public static final int TYPE_PROCESS_VISIT = 2;
        public static final int TYPE_STORAGE_INFO = 6;

        int type();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void a(a... aVarArr);
    }

    l a();

    o b();

    String c();

    c d();

    d e();

    String f();

    p g();

    r h();

    String i();
}
