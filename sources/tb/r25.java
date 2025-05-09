package tb;

import com.google.android.material.shape.c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class r25 extends ju4 {

    /* renamed from: a  reason: collision with root package name */
    public final float f27051a = -1.0f;

    @Override // tb.ju4
    public void a(c cVar, float f, float f2, float f3) {
        cVar.n(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double d = f3;
        double d2 = f2;
        cVar.l((float) (Math.sin(Math.toRadians(f)) * d * d2), (float) (Math.sin(Math.toRadians(90.0f - f)) * d * d2));
    }
}
