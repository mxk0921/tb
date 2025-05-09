package tb;

import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.ColorUtils;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class za8 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f32645a;
    public final int b;
    public final int c;
    public final float d;

    public za8(Context context) {
        this.f32645a = k6i.b(context, R.attr.elevationOverlayEnabled, false);
        this.b = l7i.a(context, R.attr.elevationOverlayColor, 0);
        this.c = l7i.a(context, R.attr.colorSurface, 0);
        this.d = context.getResources().getDisplayMetrics().density;
    }

    public float a(float f) {
        float f2 = this.d;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i, float f) {
        float a2 = a(f);
        return ColorUtils.setAlphaComponent(l7i.f(ColorUtils.setAlphaComponent(i, 255), this.b, a2), Color.alpha(i));
    }

    public int c(int i, float f) {
        if (!this.f32645a || !e(i)) {
            return i;
        }
        return b(i, f);
    }

    public boolean d() {
        return this.f32645a;
    }

    public final boolean e(int i) {
        if (ColorUtils.setAlphaComponent(i, 255) == this.c) {
            return true;
        }
        return false;
    }
}
