package com.vivo.push.util;

import java.util.concurrent.ThreadFactory;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class h implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f14666a;

    public h(String str) {
        this.f14666a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(this.f14666a);
        thread.setDaemon(true);
        return thread;
    }
}
