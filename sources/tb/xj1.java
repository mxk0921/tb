package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.StringUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xj1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f31419a;
    public final String b;
    public final boolean c;
    public String d;
    public String e;

    static {
        t2o.a(589299737);
    }

    public xj1(String str, String str2, boolean z) {
        this.f31419a = "DEFAULT_AUTH";
        if (StringUtils.isNotBlank(str)) {
            this.f31419a = str;
        }
        this.b = str2;
        this.c = z;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("AuthParam{ openAppKey=");
        sb.append(this.f31419a);
        sb.append(", bizParam=");
        sb.append(this.b);
        sb.append(", showAuthUI=");
        sb.append(this.c);
        sb.append(", apiInfo=");
        sb.append(this.d);
        sb.append(", failInfo=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
