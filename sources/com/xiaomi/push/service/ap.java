package com.xiaomi.push.service;

import com.xiaomi.push.gd;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ap implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f15049a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ boolean f1560a;

    public ap(List list, boolean z) {
        this.f15049a = list;
        this.f1560a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean b;
        int i;
        boolean b2;
        b = ao.b("www.baidu.com:80");
        Iterator it = this.f15049a.iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            if (!b) {
                b2 = ao.b(str);
                if (!b2) {
                    b = false;
                    if (!b && !this.f1560a) {
                        break;
                    }
                }
            }
            b = true;
            if (!b) {
            }
        }
        if (!b) {
            i = 2;
        }
        gd.a(i);
    }
}
