package com.loc;

import android.content.Context;
import android.text.TextUtils;
import mtopsdk.common.util.SymbolExpUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class cl extends co {
    private Context b;
    private boolean d;
    private int e;
    private int f;

    /* renamed from: a  reason: collision with root package name */
    private String f5630a = "iKey";
    private int g = 0;

    public cl(Context context, boolean z, int i, int i2, String str) {
        a(context, z, i, i2, str, 0);
    }

    @Override // com.loc.co
    public final void a(int i) {
        if (o.j(this.b) != 1) {
            String a2 = x.a(System.currentTimeMillis(), "yyyyMMdd");
            String a3 = at.a(this.b, this.f5630a);
            if (!TextUtils.isEmpty(a3)) {
                String[] split = a3.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
                if (split == null || split.length < 2) {
                    at.b(this.b, this.f5630a);
                } else if (a2.equals(split[0])) {
                    i += Integer.parseInt(split[1]);
                }
            }
            Context context = this.b;
            String str = this.f5630a;
            at.a(context, str, a2 + "|" + i);
        }
    }

    @Override // com.loc.co
    public final int b() {
        int i;
        if ((o.j(this.b) == 1 || (i = this.e) <= 0) && ((i = this.g) <= 0 || i >= Integer.MAX_VALUE)) {
            i = Integer.MAX_VALUE;
        }
        co coVar = this.c;
        if (coVar != null) {
            return Math.max(i, coVar.b());
        }
        return i;
    }

    public cl(Context context, boolean z, int i, int i2, String str, int i3) {
        a(context, z, i, i2, str, i3);
    }

    private void a(Context context, boolean z, int i, int i2, String str, int i3) {
        this.b = context;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.f5630a = str;
        this.g = i3;
    }

    @Override // com.loc.co
    public final boolean a() {
        if (o.j(this.b) == 1) {
            return true;
        }
        if (!this.d) {
            return false;
        }
        String a2 = at.a(this.b, this.f5630a);
        if (TextUtils.isEmpty(a2)) {
            return true;
        }
        String[] split = a2.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
        if (split == null || split.length < 2) {
            at.b(this.b, this.f5630a);
            return true;
        }
        return !x.a(System.currentTimeMillis(), "yyyyMMdd").equals(split[0]) || Integer.parseInt(split[1]) < this.f;
    }
}
