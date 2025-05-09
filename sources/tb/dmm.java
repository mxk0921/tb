package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dmm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final u5a f17946a = new u5a();
    public final ich b = new ich(yah.f31937a);

    static {
        t2o.a(789577846);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af840f9", new Object[]{this, str});
            return;
        }
        try {
            if ("android.intent.action.BATTERY_LOW".equals(str)) {
                ich.e = true;
                new StringBuilder("battery is low, mParamConfig.canSampling()=").append(this.b.a());
                this.f17946a.b(yah.f31937a);
            } else if ("android.intent.action.BATTERY_OKAY".equals(str)) {
                ich.e = false;
                new StringBuilder("battery is low, mParamConfig.canSampling()=").append(this.b.a());
                if (this.b.a()) {
                    yah.b = System.currentTimeMillis();
                    this.f17946a.a(yah.f31937a, ich.f);
                }
            }
        } catch (Exception unused) {
        }
    }
}
