package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zqs implements zxd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f32955a;

    static {
        t2o.a(491782303);
        t2o.a(488636487);
    }

    public zqs(String str) {
        this.f32955a = str;
    }

    @Override // tb.zxd
    public void onPageScrolled(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3dde4", new Object[]{this, new Float(f), new Integer(i)});
        }
    }

    @Override // tb.zxd
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
        } else {
            gve.b("page_disappear", this.f32955a, null);
        }
    }

    @Override // tb.zxd
    public void onPageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
        }
    }
}
