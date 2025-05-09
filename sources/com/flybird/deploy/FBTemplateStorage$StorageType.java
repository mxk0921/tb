package com.flybird.deploy;

import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum FBTemplateStorage$StorageType {
    DEFAULT(0, "default"),
    GRAY(1, pg1.ATOM_EXT_gray),
    EXP(2, "exp");
    
    public final int intVal;
    public final String pathPart;

    FBTemplateStorage$StorageType(int i, String str) {
        this.intVal = i;
        this.pathPart = str;
    }
}
