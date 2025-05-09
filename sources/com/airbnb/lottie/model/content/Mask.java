package com.airbnb.lottie.model.content;

import tb.lx0;
import tb.qx0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Mask {

    /* renamed from: a  reason: collision with root package name */
    public final MaskMode f1847a;
    public final qx0 b;
    public final lx0 c;
    public final boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, qx0 qx0Var, lx0 lx0Var, boolean z) {
        this.f1847a = maskMode;
        this.b = qx0Var;
        this.c = lx0Var;
        this.d = z;
    }

    public MaskMode a() {
        return this.f1847a;
    }

    public qx0 b() {
        return this.b;
    }

    public lx0 c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }
}
