package com.taobao.securityjni.tools;

import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class DataContext {
    public int category;
    public byte[] extData;
    public int index;
    public int type;

    static {
        t2o.a(421527586);
    }

    public DataContext() {
        this.index = -1;
        this.extData = null;
        this.category = -1;
        this.type = -1;
    }

    public DataContext(int i, byte[] bArr) {
        this.index = i;
        this.extData = bArr;
    }

    public DataContext(int i, byte[] bArr, int i2, int i3) {
        this.index = i;
        this.extData = bArr;
        this.category = i2;
        this.type = i3;
    }
}
