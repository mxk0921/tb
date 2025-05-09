package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class b3z extends a3z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final y2z f16168a;

    static {
        t2o.a(598737006);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3z(y2z y2zVar) {
        super(null);
        ckf.g(y2zVar, "corner");
        this.f16168a = y2zVar;
    }

    public static /* synthetic */ Object ipc$super(b3z b3zVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/graphics/CornerSizeForDp");
    }

    @Override // tb.a3z
    public y2z a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y2z) ipChange.ipc$dispatch("1a1f2e2f", new Object[]{this, new Long(j)});
        }
        return this.f16168a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b3z) && ckf.b(this.f16168a, ((b3z) obj).f16168a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return this.f16168a.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CornerSizeForDp(corner=" + this.f16168a + ')';
    }
}
