package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class c {
    public static final c f = new c("$", new ArrayList(), true, false);
    public static final c g = new c("#-1", new ArrayList(), false, true);
    public static final JSONReader.c h = JSONFactory.b();

    /* renamed from: a  reason: collision with root package name */
    public JSONWriter.a f2461a;
    public final String b;
    public final List<e> c;
    public final boolean d;
    public final boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final c f2462a;
        public final a b;
        public Object c;
        public Object d;

        public a(c cVar, a aVar, e eVar, e eVar2, long j) {
            this.f2462a = cVar;
            this.b = aVar;
        }
    }

    public c(String str, List<e> list, boolean z, boolean z2) {
        this.b = str;
        this.c = list;
        this.d = z;
        this.e = z2;
    }

    public static c b(String str) {
        if ("#-1".equals(str)) {
            return g;
        }
        return new d(str).a();
    }

    public Object a(Object obj) {
        e eVar;
        if (this.d) {
            return obj;
        }
        List<e> list = this.c;
        int size = list.size();
        if (size == 0) {
            return obj;
        }
        int i = 0;
        a aVar = null;
        while (i < size) {
            e eVar2 = list.get(i);
            int i2 = i + 1;
            if (i2 < size) {
                eVar = list.get(i2);
            } else {
                eVar = null;
            }
            a aVar2 = new a(this, aVar, eVar2, eVar, 0L);
            if (i == 0) {
                aVar2.c = obj;
            }
            eVar2.a(aVar2);
            i = i2;
            aVar = aVar2;
        }
        return aVar.d;
    }

    public final String toString() {
        return this.b;
    }
}
