package com.alibaba.fastjson2;

import com.alibaba.fastjson2.c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class e {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a extends e {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2464a = new a();

        @Override // com.alibaba.fastjson2.e
        public void a(c.a aVar) {
            Object obj;
            c.a aVar2 = aVar.b;
            if (aVar2 == null) {
                obj = aVar.c;
            } else {
                obj = aVar2.d;
            }
            aVar.d = obj;
        }
    }

    public abstract void a(c.a aVar);
}
