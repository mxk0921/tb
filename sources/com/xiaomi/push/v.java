package com.xiaomi.push;

import android.content.Context;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class v extends u {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Runnable f15137a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, File file, Runnable runnable) {
        super(context, file, null);
        this.f15137a = runnable;
    }

    @Override // com.xiaomi.push.u
    public void a(Context context) {
        Runnable runnable = this.f15137a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
