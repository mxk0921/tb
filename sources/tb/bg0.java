package tb;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class bg0 implements hu4 {

    /* renamed from: a  reason: collision with root package name */
    public final hu4 f16363a;
    public final float b;

    public bg0(float f, hu4 hu4Var) {
        while (hu4Var instanceof bg0) {
            hu4Var = ((bg0) hu4Var).f16363a;
            f += ((bg0) hu4Var).b;
        }
        this.f16363a = hu4Var;
        this.b = f;
    }

    @Override // tb.hu4
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f16363a.a(rectF) + this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg0)) {
            return false;
        }
        bg0 bg0Var = (bg0) obj;
        if (!this.f16363a.equals(bg0Var.f16363a) || this.b != bg0Var.b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16363a, Float.valueOf(this.b)});
    }
}
