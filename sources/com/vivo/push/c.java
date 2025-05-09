package com.vivo.push;

import com.vivo.push.restructure.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IPushActionListener f14578a;
    final /* synthetic */ a b;

    public c(a aVar, IPushActionListener iPushActionListener) {
        this.b = aVar;
        this.f14578a = iPushActionListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int a2 = a.a().h().a();
        IPushActionListener iPushActionListener = this.f14578a;
        if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(a2);
        }
    }
}
