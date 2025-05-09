package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.ak;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hw extends ak.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f14940a;

    public hw(Context context) {
        this.f14940a = context;
    }

    @Override // com.xiaomi.push.ak.b
    /* renamed from: b */
    public void mo598b() {
        Object obj;
        ArrayList arrayList;
        List list;
        List list2;
        obj = hv.f1115a;
        synchronized (obj) {
            list = hv.f1117a;
            arrayList = new ArrayList(list);
            list2 = hv.f1117a;
            list2.clear();
        }
        hv.b(this.f14940a, arrayList);
    }
}
