package com.huawei.hms.api;

import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ProtocolNegotiate {
    private static final int MAX_VERSION = 2;
    private static ProtocolNegotiate instance = new ProtocolNegotiate();
    private int version = 1;

    public static ProtocolNegotiate getInstance() {
        return instance;
    }

    public int getVersion() {
        return this.version;
    }

    public int negotiate(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            this.version = 1;
            return 1;
        }
        if (!list.contains(2)) {
            this.version = list.get(list.size() - 1).intValue();
        } else {
            this.version = 2;
        }
        return this.version;
    }
}
