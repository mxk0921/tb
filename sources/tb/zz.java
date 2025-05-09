package tb;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class zz implements hu4 {

    /* renamed from: a  reason: collision with root package name */
    public final float f33113a;

    public zz(float f) {
        this.f33113a = f;
    }

    @Override // tb.hu4
    public float a(RectF rectF) {
        return this.f33113a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zz) && this.f33113a == ((zz) obj).f33113a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f33113a)});
    }
}
