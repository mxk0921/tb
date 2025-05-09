package com.vivo.push.f;

import android.content.Context;
import com.vivo.push.s;
import com.vivo.push.sdk.PushMessageCallback;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f14600a;
    final /* synthetic */ List b;
    final /* synthetic */ List c;
    final /* synthetic */ String d;
    final /* synthetic */ l e;

    public m(l lVar, int i, List list, List list2, String str) {
        this.e = lVar;
        this.f14600a = i;
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
        pushMessageCallback.onDelTags(context, this.f14600a, this.b, this.c, this.d);
    }
}
