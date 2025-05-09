package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class bzm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16740a;
    public final String b;
    public final String c;
    public final float d;
    public final float e;
    public final float f;
    public final List<JSONObject> g;

    static {
        t2o.a(918552675);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bzm(String str, String str2, String str3, float f, float f2, float f3, List<? extends JSONObject> list) {
        ckf.g(str, "x");
        ckf.g(str2, "y");
        this.f16740a = str;
        this.b = str2;
        this.c = str3;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = list;
    }

    public final float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0b63bc3", new Object[]{this})).floatValue();
        }
        return this.d;
    }

    public final float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0c45344", new Object[]{this})).floatValue();
        }
        return this.e;
    }

    public final List<JSONObject> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3a37a2c7", new Object[]{this});
        }
        return this.g;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof bzm) {
                bzm bzmVar = (bzm) obj;
                if (!ckf.b(this.f16740a, bzmVar.f16740a) || !ckf.b(this.b, bzmVar.b) || !ckf.b(this.c, bzmVar.c) || Float.compare(this.d, bzmVar.d) != 0 || Float.compare(this.e, bzmVar.e) != 0 || Float.compare(this.f, bzmVar.f) != 0 || !ckf.b(this.g, bzmVar.g)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f16740a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int floatToIntBits = (((((((i6 + i3) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31;
        List<JSONObject> list = this.g;
        if (list != null) {
            i4 = list.hashCode();
        }
        return floatToIntBits + i4;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ProcessedAnchor(x=" + this.f16740a + ", y=" + this.b + ", direction=" + this.c + ", displayX=" + this.d + ", displayY=" + this.e + ", maxWidth=" + this.f + ", targetItems=" + this.g + f7l.BRACKET_END_STR;
    }
}
