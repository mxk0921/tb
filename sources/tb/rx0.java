package tb;

import android.graphics.PointF;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rx0 implements xx0<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    public final jx0 f27659a;
    public final jx0 b;

    public rx0(jx0 jx0Var, jx0 jx0Var2) {
        this.f27659a = jx0Var;
        this.b = jx0Var2;
    }

    @Override // tb.xx0
    public pw1<PointF, PointF> a() {
        return new dcq(this.f27659a.a(), this.b.a());
    }

    @Override // tb.xx0
    public List<w4g<PointF>> b() {
        zhh.b("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
        return null;
    }

    @Override // tb.xx0
    public boolean c() {
        if (!this.f27659a.c() || !this.b.c()) {
            return false;
        }
        return true;
    }
}
