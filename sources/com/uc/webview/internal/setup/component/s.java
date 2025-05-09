package com.uc.webview.internal.setup.component;

import com.taobao.artc.api.AConstants;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.task.c;
import com.uc.webview.internal.setup.component.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class s extends c.b {

    /* renamed from: a  reason: collision with root package name */
    private final g.a f14439a;
    private final int b = AConstants.ArtcErrorIceRecvCandidateTimeout;

    public s(g.a aVar) {
        this.f14439a = aVar;
    }

    @Override // com.uc.webview.base.task.c.b
    public final void a() {
    }

    @Override // com.uc.webview.base.task.c.b
    public final void a(UCKnownException uCKnownException) {
        this.f14439a.b(this.b);
    }
}
