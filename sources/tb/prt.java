package tb;

import kotlin.coroutines.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class prt {

    /* renamed from: a  reason: collision with root package name */
    public final d f26265a;
    public final Object[] b;
    public final upt<Object>[] c;
    public int d;

    public prt(d dVar, int i) {
        this.f26265a = dVar;
        this.b = new Object[i];
        this.c = new upt[i];
    }

    public final void a(upt<?> uptVar, Object obj) {
        int i = this.d;
        this.b[i] = obj;
        this.d = i + 1;
        ckf.e(uptVar, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        this.c[i] = uptVar;
    }

    public final void b(d dVar) {
        upt<Object>[] uptVarArr = this.c;
        int length = uptVarArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                upt<Object> uptVar = uptVarArr[length];
                ckf.d(uptVar);
                uptVar.g(dVar, this.b[length]);
                if (i >= 0) {
                    length = i;
                } else {
                    return;
                }
            }
        }
    }
}
