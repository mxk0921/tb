package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class c3z extends a3z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f16841a;

    static {
        t2o.a(598737007);
    }

    public c3z(int i) {
        super(null);
        this.f16841a = i;
    }

    public static /* synthetic */ Object ipc$super(c3z c3zVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/graphics/CornerSizeForPercent");
    }

    @Override // tb.a3z
    public y2z a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y2z) ipChange.ipc$dispatch("1a1f2e2f", new Object[]{this, new Long(j)});
        }
        float d = (f7z.d(j) * this.f16841a) / 100.0f;
        return new y2z(d, d, d, d);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c3z) && this.f16841a == ((c3z) obj).f16841a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return this.f16841a;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CornerSizeForPercent(percent=" + this.f16841a + ')';
    }
}
