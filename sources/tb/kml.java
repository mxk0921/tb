package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kml {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f22762a;

    static {
        t2o.a(993001678);
    }

    public kml(String str) {
        this.f22762a = str;
    }

    public static kml a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kml) ipChange.ipc$dispatch("3759db40", new Object[]{str});
        }
        return new kml(str);
    }
}
