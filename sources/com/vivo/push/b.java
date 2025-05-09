package com.vivo.push;

import com.vivo.push.listener.IPushQueryActionListener;
import com.vivo.push.restructure.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IPushQueryActionListener f14555a;
    final /* synthetic */ a b;

    public b(a aVar, IPushQueryActionListener iPushQueryActionListener) {
        this.b = aVar;
        this.f14555a = iPushQueryActionListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String b = a.a().h().b();
        IPushQueryActionListener iPushQueryActionListener = this.f14555a;
        if (iPushQueryActionListener != null) {
            iPushQueryActionListener.onSuccess(b);
        }
    }
}
