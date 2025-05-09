package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ujv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f29423a;
    public int b;
    public String c;

    static {
        t2o.a(806355708);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujv)) {
            return false;
        }
        ujv ujvVar = (ujv) obj;
        if (Float.compare(ujvVar.f29423a, this.f29423a) == 0 && this.b == ujvVar.b && Objects.equals(this.c, ujvVar.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return Objects.hash(Float.valueOf(this.f29423a), Integer.valueOf(this.b), this.c);
    }
}
