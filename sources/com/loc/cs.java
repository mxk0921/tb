package com.loc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class cs implements Runnable {
    a e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void a(cs csVar);
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        try {
            if (!Thread.interrupted()) {
                a();
                if (!Thread.interrupted() && (aVar = this.e) != null) {
                    aVar.a(this);
                }
            }
        } catch (Throwable th) {
            av.b(th, "ThreadTask", "run");
            th.printStackTrace();
        }
    }
}
