package com.vivo.push.ups;

import com.vivo.push.IPushActionListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class a implements IPushActionListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UPSRegisterCallback f14651a;
    final /* synthetic */ VUpsManager b;

    public a(VUpsManager vUpsManager, UPSRegisterCallback uPSRegisterCallback) {
        this.b = vUpsManager;
        this.f14651a = uPSRegisterCallback;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        this.f14651a.onResult(new TokenResult(i, com.vivo.push.restructure.a.a().h().b()));
    }
}
