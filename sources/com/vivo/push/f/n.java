package com.vivo.push.f;

import android.content.Context;
import com.vivo.push.s;
import com.vivo.push.sdk.PushMessageCallback;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f14601a;
    final /* synthetic */ List b;
    final /* synthetic */ List c;
    final /* synthetic */ String d;
    final /* synthetic */ l e;

    public n(l lVar, int i, List list, List list2, String str) {
        this.e = lVar;
        this.f14601a = i;
        this.b = list;
        this.c = list2;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        l lVar = this.e;
        PushMessageCallback pushMessageCallback = ((aa) lVar).b;
        context = ((s) lVar).f14645a;
        pushMessageCallback.onDelAlias(context, this.f14601a, this.b, this.c, this.d);
    }
}
