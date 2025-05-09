package com.xiaomi.push;

import java.io.ByteArrayOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jq extends ByteArrayOutputStream {
    public jq() {
    }

    public int a() {
        return ((ByteArrayOutputStream) this).count;
    }

    public jq(int i) {
        super(i);
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m934a() {
        return ((ByteArrayOutputStream) this).buf;
    }
}
