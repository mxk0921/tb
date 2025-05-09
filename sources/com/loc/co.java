package com.loc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class co {
    co c;

    public co() {
    }

    public void a(int i) {
        co coVar = this.c;
        if (coVar != null) {
            coVar.a(i);
        }
    }

    public abstract boolean a();

    public int b() {
        int i;
        co coVar = this.c;
        if (coVar != null) {
            i = coVar.b();
        } else {
            i = Integer.MAX_VALUE;
        }
        return Math.min(Integer.MAX_VALUE, i);
    }

    public final boolean c() {
        boolean z;
        co coVar = this.c;
        if (coVar != null) {
            z = coVar.c();
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        return a();
    }

    public co(co coVar) {
        this.c = coVar;
    }

    public void a(boolean z) {
        co coVar = this.c;
        if (coVar != null) {
            coVar.a(z);
        }
    }
}
