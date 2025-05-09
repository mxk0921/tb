package com.huawei.hms.common;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum HmsCheckedState {
    UNCHECKED(0),
    NOT_NEED_UPDATE(1),
    NEED_UPDATE(2);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f5290a;

    HmsCheckedState(int i) {
        this.f5290a = i;
    }

    public int getState() {
        return this.f5290a;
    }
}
