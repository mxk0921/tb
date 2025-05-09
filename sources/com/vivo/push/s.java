package com.vivo.push;

import android.content.Context;
import com.vivo.push.b.n;
import com.vivo.push.util.u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    protected Context f14645a;
    private int b;
    private v c;

    public s(v vVar) {
        this.b = -1;
        this.c = vVar;
        int b = vVar.b();
        this.b = b;
        if (b >= 0) {
            this.f14645a = m.a().h();
            return;
        }
        throw new IllegalArgumentException("PushTask need a > 0 task id.");
    }

    public final int a() {
        return this.b;
    }

    public abstract void a(v vVar);

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f14645a;
        if (context != null && !(this.c instanceof n)) {
            u.a(context, "[执行指令]" + this.c);
        }
        a(this.c);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        v vVar = this.c;
        if (vVar == null) {
            str = "[null]";
        } else {
            str = vVar.toString();
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
