package tb;

import java.util.concurrent.Callable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class y8y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ndy f31914a;
    public final /* synthetic */ Callable b;

    public y8y(ndy ndyVar, Callable callable) {
        this.f31914a = ndyVar;
        this.b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f31914a.b(this.b.call());
        } catch (Exception e) {
            this.f31914a.a(e);
        }
    }
}
