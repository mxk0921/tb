package com.vivo.push;

import com.vivo.push.restructure.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class p implements IPushActionListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f14619a;

    public p(m mVar) {
        this.f14619a = mVar;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        if (i == 0) {
            a.a().h().b("");
        } else {
            a.a().h().c("");
        }
    }
}
