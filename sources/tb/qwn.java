package tb;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class qwn implements hu4 {

    /* renamed from: a  reason: collision with root package name */
    public final float f26974a;

    public qwn(float f) {
        this.f26974a = f;
    }

    @Override // tb.hu4
    public float a(RectF rectF) {
        return this.f26974a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof qwn) && this.f26974a == ((qwn) obj).f26974a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f26974a)});
    }
}
