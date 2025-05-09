package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class jt2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f22195a;
    public byte[] b;
    public String c;

    static {
        t2o.a(478150916);
    }

    public jt2() {
        this(null, null, null, 7, null);
    }

    public final JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f387b43d", new Object[]{this});
        }
        return this.f22195a;
    }

    public final byte[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a5e58f2e", new Object[]{this});
        }
        return this.b;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e847dd7", new Object[]{this});
        }
        return this.c;
    }

    public final void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6f98d7f", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "<set-?>");
        this.f22195a = jSONObject;
    }

    public final void e(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badf45a2", new Object[]{this, bArr});
        } else {
            this.b = bArr;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof jt2) {
                jt2 jt2Var = (jt2) obj;
                if (!ckf.b(this.f22195a, jt2Var.f22195a) || !ckf.b(this.b, jt2Var.b) || !ckf.b(this.c, jt2Var.c)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d75e7f", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.c = str;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        JSONObject jSONObject = this.f22195a;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        byte[] bArr = this.b;
        if (bArr != null) {
            i2 = Arrays.hashCode(bArr);
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str = this.c;
        if (str != null) {
            i3 = str.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CacheResponse(cacheData=" + this.f22195a + ", zcacheData=" + Arrays.toString(this.b) + ", zcacheDataType=" + this.c + f7l.BRACKET_END_STR;
    }

    public jt2(JSONObject jSONObject, byte[] bArr, String str) {
        ckf.g(jSONObject, pl4.KEY_CACHE_DATA);
        ckf.g(str, "zcacheDataType");
        this.f22195a = jSONObject;
        this.b = bArr;
        this.c = str;
    }

    public /* synthetic */ jt2(JSONObject jSONObject, byte[] bArr, String str, int i, a07 a07Var) {
        this((i & 1) != 0 ? new JSONObject() : jSONObject, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? "none" : str);
    }
}
