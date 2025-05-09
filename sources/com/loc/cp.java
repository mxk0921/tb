package com.loc;

import android.content.Context;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class cp extends co {

    /* renamed from: a  reason: collision with root package name */
    private Context f5633a;
    private boolean b = false;

    public cp(Context context) {
        this.f5633a = context;
    }

    @Override // com.loc.co
    public final boolean a() {
        if (o.j(this.f5633a) == 1 || this.b) {
            return true;
        }
        return false;
    }
}
