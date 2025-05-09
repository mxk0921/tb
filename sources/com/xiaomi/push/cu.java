package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cu extends co {

    /* renamed from: a  reason: collision with root package name */
    co f14812a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ cs f822a;
    final /* synthetic */ co b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu(cs csVar, String str, co coVar) {
        super(str);
        this.f822a = csVar;
        this.b = coVar;
        this.f14812a = coVar;
        ((co) this).f808b = ((co) this).f808b;
        if (coVar != null) {
            this.f = coVar.f;
        }
    }

    @Override // com.xiaomi.push.co
    public synchronized ArrayList<String> a(boolean z) {
        ArrayList<String> arrayList;
        try {
            arrayList = new ArrayList<>();
            co coVar = this.f14812a;
            if (coVar != null) {
                arrayList.addAll(coVar.a(true));
            }
            Map<String, co> map = cs.b;
            synchronized (map) {
                co coVar2 = map.get(((co) this).f808b);
                if (coVar2 != null) {
                    Iterator<String> it = coVar2.a(true).iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (arrayList.indexOf(next) == -1) {
                            arrayList.add(next);
                        }
                    }
                    arrayList.remove(((co) this).f808b);
                    arrayList.add(((co) this).f808b);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    @Override // com.xiaomi.push.co
    public boolean b() {
        return false;
    }

    @Override // com.xiaomi.push.co
    public synchronized void a(String str, cn cnVar) {
        co coVar = this.f14812a;
        if (coVar != null) {
            coVar.a(str, cnVar);
        }
    }
}
