package com.vivo.push.ups;

import com.vivo.push.IPushActionListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class d implements IPushActionListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UPSTurnCallback f14654a;
    final /* synthetic */ VUpsManager b;

    public d(VUpsManager vUpsManager, UPSTurnCallback uPSTurnCallback) {
        this.b = vUpsManager;
        this.f14654a = uPSTurnCallback;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        this.f14654a.onResult(new CodeResult(i));
    }
}
