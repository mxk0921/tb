package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.frameanim.BKGestureLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g0z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public BKGestureLayout f19669a;

    static {
        t2o.a(352321994);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        BKGestureLayout bKGestureLayout = this.f19669a;
        if (bKGestureLayout != null) {
            return bKGestureLayout.performCloseAnimation();
        }
        return false;
    }
}
