package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.by;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class bz implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ by f15090a;

    public bz(by byVar) {
        this.f15090a = byVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ConcurrentHashMap concurrentHashMap;
        try {
            concurrentHashMap = this.f15090a.f1612a;
            for (by.a aVar : concurrentHashMap.values()) {
                aVar.run();
            }
        } catch (Exception e) {
            b.m410a("Sync job exception :" + e.getMessage());
        }
        this.f15090a.f1613a = false;
    }
}
