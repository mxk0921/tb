package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class u5l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f29160a;
    public final String b;
    public final String c;

    static {
        t2o.a(573571099);
    }

    public u5l(String str, String str2, String str3) {
        this.b = str2;
        this.c = str3;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f29160a = Integer.parseInt(str);
            } catch (Throwable th) {
                th.printStackTrace();
                jgh.a("OpenVideoModel", "boundsTime is not a number.");
            }
        } else {
            this.f29160a = 0;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "OpenVideoModel{boundsTime=" + this.f29160a + ", apngViewId='" + this.b + "', defaultViewId='" + this.c + "'}";
    }
}
