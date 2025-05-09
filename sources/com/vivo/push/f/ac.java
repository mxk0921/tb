package com.vivo.push.f;

import android.content.Context;
import com.vivo.push.s;
import com.vivo.push.sdk.PushMessageCallback;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class ac implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f14594a;
    final /* synthetic */ List b;
    final /* synthetic */ List c;
    final /* synthetic */ String d;
    final /* synthetic */ ab e;

    public ac(ab abVar, int i, List list, List list2, String str) {
        this.e = abVar;
        this.f14594a = i;
        this.b = list;
        this.c = list2;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        ab abVar = this.e;
        PushMessageCallback pushMessageCallback = ((aa) abVar).b;
        context = ((s) abVar).f14645a;
        pushMessageCallback.onSetTags(context, this.f14594a, this.b, this.c, this.d);
    }
}
