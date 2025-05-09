package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class lrm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f23531a;
    public final int b;
    public final boolean c;
    public final float d;

    static {
        t2o.a(919601364);
    }

    public lrm() {
        this(null, 0, false, 0.0f, 15, null);
    }

    public final JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f5234f8a", new Object[]{this});
        }
        return this.f23531a;
    }

    public final float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8af54212", new Object[]{this})).floatValue();
        }
        return this.d;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c984c96", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6753ebff", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof lrm) {
                lrm lrmVar = (lrm) obj;
                if (!(ckf.b(this.f23531a, lrmVar.f23531a) && this.b == lrmVar.b && this.c == lrmVar.c && Float.compare(this.d, lrmVar.d) == 0)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        JSONObject jSONObject = this.f23531a;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        }
        int i3 = ((i * 31) + this.b) * 31;
        boolean z = this.c;
        if (!z) {
            i2 = z ? 1 : 0;
        }
        return ((i3 + i2) * 31) + Float.floatToIntBits(this.d);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PreloadConfig(clientConfig=" + this.f23531a + ", limit=" + this.b + ", disablePreloading=" + this.c + ", ctrRankScore=" + this.d + f7l.BRACKET_END_STR;
    }

    public lrm(JSONObject jSONObject, int i, boolean z, float f) {
        this.f23531a = jSONObject;
        this.b = i;
        this.c = z;
        this.d = f;
    }

    public /* synthetic */ lrm(JSONObject jSONObject, int i, boolean z, float f, int i2, a07 a07Var) {
        this((i2 & 1) != 0 ? null : jSONObject, (i2 & 2) != 0 ? Integer.MAX_VALUE : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 0.0f : f);
    }
}
