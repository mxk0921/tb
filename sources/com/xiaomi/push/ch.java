package com.xiaomi.push;

import com.xiaomi.push.ah;
import com.xiaomi.push.cg;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ch extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ cg f14803a;

    public ch(cg cgVar) {
        this.f14803a = cgVar;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo607a() {
        return "100957";
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList<cg.a> arrayList6;
        arrayList = this.f14803a.f789a;
        synchronized (arrayList) {
            try {
                arrayList2 = this.f14803a.f789a;
                if (arrayList2.size() > 0) {
                    arrayList3 = this.f14803a.f789a;
                    if (arrayList3.size() > 1) {
                        cg cgVar = this.f14803a;
                        arrayList6 = cgVar.f789a;
                        cgVar.a(arrayList6);
                    } else {
                        cg cgVar2 = this.f14803a;
                        arrayList5 = cgVar2.f789a;
                        cgVar2.b((cg.a) arrayList5.get(0));
                    }
                    arrayList4 = this.f14803a.f789a;
                    arrayList4.clear();
                    System.gc();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
