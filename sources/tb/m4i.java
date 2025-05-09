package tb;

import com.google.android.material.shape.c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class m4i extends e78 {

    /* renamed from: a  reason: collision with root package name */
    public final float f23768a;

    public m4i(float f) {
        this.f23768a = f - 0.001f;
    }

    @Override // tb.e78
    public void b(float f, float f2, float f3, c cVar) {
        double d = this.f23768a;
        float sqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow(sqrt, 2.0d));
        cVar.m(f2 - sqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + sqrt2);
        cVar.l(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
        cVar.l(f2 + sqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + sqrt2);
    }
}
