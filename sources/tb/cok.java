package tb;

import com.google.android.material.shape.c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class cok extends e78 {

    /* renamed from: a  reason: collision with root package name */
    public final e78 f17202a;
    public final float b;

    public cok(e78 e78Var, float f) {
        this.f17202a = e78Var;
        this.b = f;
    }

    @Override // tb.e78
    public boolean a() {
        return this.f17202a.a();
    }

    @Override // tb.e78
    public void b(float f, float f2, float f3, c cVar) {
        this.f17202a.b(f, f2 - this.b, f3, cVar);
    }
}
