package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yi8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f32111a;
    public double b = vu3.b.GEO_NOT_SUPPORT;
    public double c = vu3.b.GEO_NOT_SUPPORT;
    public double d = vu3.b.GEO_NOT_SUPPORT;

    static {
        t2o.a(87031855);
    }

    public void a(double d, double d2, double d3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfdb2d52", new Object[]{this, new Double(d), new Double(d2), new Double(d3), str});
            return;
        }
        this.b = d;
        this.c = d2;
        this.d = d3;
        if (TextUtils.isEmpty(str)) {
            str = "XYZ";
        }
        this.f32111a = str;
    }
}
