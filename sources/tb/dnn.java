package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dnn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f17972a = -1;

    static {
        t2o.a(486539641);
    }

    public void a(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43c25f7f", new Object[]{this, cfcVar});
        } else {
            this.f17972a = lnn.b(cfcVar);
        }
    }

    public int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5e1b7de", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = this.f17972a;
        if (i2 < 0) {
            fve.e("RecommendRealIndexCreator", "infoFlowCardStartPosition is -1");
            return -1;
        }
        int i3 = i - i2;
        if (i3 >= 0) {
            return i3;
        }
        fve.e("RecommendRealIndexCreator", "recIndex < 0");
        return -1;
    }
}
