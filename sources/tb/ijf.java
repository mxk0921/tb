package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ijf implements ypj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ew f21347a;

    static {
        t2o.a(745537741);
    }

    public ijf(ew ewVar) {
        this.f21347a = ewVar;
    }

    @Override // tb.ypj
    public void onCurrentTabLongClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79eae8f7", new Object[]{this});
        }
    }

    @Override // tb.ypj
    public void onNavigationTabMessageChanged(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fd5f3e0", new Object[]{this, str});
        }
    }

    @Override // tb.ypj
    public void onCurrentTabClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f77f6793", new Object[]{this});
            return;
        }
        this.f21347a.A("mtbTabTap", true);
        suv.d(u3j.b, "Page_MyTaobao_click-maintab", "a2141.7631743.1102.1", null, null);
    }

    @Override // tb.ypj
    public void onCurrentTabDoubleTap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c22ad2be", new Object[]{this});
            return;
        }
        this.f21347a.A("mtbTabDoubleTap", true);
        suv.d(u3j.b, "Page_MyTaobao_click-maintab", "a2141.7631743.1102.1", null, null);
    }
}
