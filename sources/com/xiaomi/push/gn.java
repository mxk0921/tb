package com.xiaomi.push;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gn extends Thread {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ gm f14908a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(gm gmVar, String str) {
        super(str);
        this.f14908a = gmVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        gh ghVar;
        try {
            ghVar = this.f14908a.f14907a;
            ghVar.m730a();
        } catch (Exception e) {
            this.f14908a.c(9, e);
        }
    }
}
