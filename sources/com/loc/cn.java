package com.loc;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class cn extends co {

    /* renamed from: a  reason: collision with root package name */
    protected int f5632a;
    protected long b;
    private String d;
    private Context e;

    public cn(Context context, int i, String str, co coVar) {
        super(coVar);
        this.f5632a = i;
        this.d = str;
        this.e = context;
    }

    @Override // com.loc.co
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            String str = this.d;
            long currentTimeMillis = System.currentTimeMillis();
            this.b = currentTimeMillis;
            at.a(this.e, str, String.valueOf(currentTimeMillis));
        }
    }

    @Override // com.loc.co
    public final boolean a() {
        long j = 0;
        if (this.b == 0) {
            String a2 = at.a(this.e, this.d);
            if (!TextUtils.isEmpty(a2)) {
                j = Long.parseLong(a2);
            }
            this.b = j;
        }
        return System.currentTimeMillis() - this.b >= ((long) this.f5632a);
    }
}
