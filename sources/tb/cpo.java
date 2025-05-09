package tb;

import java.util.concurrent.CountDownLatch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
class cpo implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CountDownLatch f17219a;
    final /* synthetic */ dpo b;

    public cpo(dpo dpoVar, CountDownLatch countDownLatch) {
        this.f17219a = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        dpo.a(null);
        throw null;
    }
}
