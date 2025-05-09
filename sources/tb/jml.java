package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jml {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f22080a;

    static {
        t2o.a(993001677);
    }

    public jml(String str) {
        this.f22080a = str;
    }

    public static jml a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jml) ipChange.ipc$dispatch("caae4789", new Object[]{str});
        }
        return new jml(str);
    }
}
