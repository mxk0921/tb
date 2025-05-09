package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bws implements y9c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092308);
        t2o.a(806355907);
    }

    @Override // tb.y9c
    public Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("20ad2258", new Object[]{this});
        }
        if (e7w.h(vx9.d()) != null) {
            return e7w.h(vx9.d()).mVideoInfo;
        }
        return null;
    }

    @Override // tb.y9c
    public Object b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("64a764bc", new Object[]{this});
        }
        return e7w.h(vx9.d());
    }

    @Override // tb.y9c
    public Object g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5382cd8", new Object[]{this});
        }
        if (e7w.h(vx9.d()) != null) {
            return e7w.h(vx9.d()).mFandomInfo;
        }
        return null;
    }
}
