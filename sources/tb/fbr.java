package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class fbr implements hzb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989855756);
        t2o.a(989855838);
    }

    @Override // tb.hzb
    public int getScreenHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[]{this})).intValue();
        }
        return d7r.e(yaa.n, false);
    }

    @Override // tb.hzb
    public int getScreenWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[]{this})).intValue();
        }
        return d7r.f(yaa.n, false);
    }
}
