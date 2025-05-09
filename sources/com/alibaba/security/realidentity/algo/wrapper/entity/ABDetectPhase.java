package com.alibaba.security.realidentity.algo.wrapper.entity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum ABDetectPhase {
    INIT(0),
    ADJUST_BEGIN(1),
    ADJUST_END(2),
    ACTION_BEGIN(3),
    ACTION_END(4),
    FACE_DETECT(100),
    FINISH(10000);
    
    public final int value;

    ABDetectPhase(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
