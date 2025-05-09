package com.meizu.cloud.pushsdk.f.e;

import com.meizu.cloud.pushsdk.f.b.a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f5872a;
    private final AtomicLong b = new AtomicLong(0);
    private final Map<Long, byte[]> c = new ConcurrentHashMap();
    private final List<Long> d = new CopyOnWriteArrayList();

    public c(int i) {
        this.f5872a = i;
    }

    @Override // com.meizu.cloud.pushsdk.f.e.d
    public void a(a aVar) {
        b(aVar);
    }

    @Override // com.meizu.cloud.pushsdk.f.e.d
    public long b() {
        return this.d.size();
    }

    @Override // com.meizu.cloud.pushsdk.f.e.d
    public com.meizu.cloud.pushsdk.f.c.c c() {
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList();
        int b = (int) b();
        int i = this.f5872a;
        if (b > i) {
            b = i;
        }
        for (int i2 = 0; i2 < b; i2++) {
            Long l = this.d.get(i2);
            if (l != null) {
                com.meizu.cloud.pushsdk.f.b.c cVar = new com.meizu.cloud.pushsdk.f.b.c();
                cVar.a(a.a(this.c.get(l)));
                com.meizu.cloud.pushsdk.f.g.c.c("MemoryStore", " current key " + l + " payload " + cVar, new Object[0]);
                linkedList.add(l);
                arrayList.add(cVar);
            }
        }
        return new com.meizu.cloud.pushsdk.f.c.c(arrayList, linkedList);
    }

    @Override // com.meizu.cloud.pushsdk.f.e.d
    public boolean a() {
        return true;
    }

    public long b(a aVar) {
        byte[] a2 = a.a(aVar.a());
        long andIncrement = this.b.getAndIncrement();
        this.d.add(Long.valueOf(andIncrement));
        this.c.put(Long.valueOf(andIncrement), a2);
        return andIncrement;
    }

    @Override // com.meizu.cloud.pushsdk.f.e.d
    public boolean a(long j) {
        return this.d.remove(Long.valueOf(j)) && this.c.remove(Long.valueOf(j)) != null;
    }
}
