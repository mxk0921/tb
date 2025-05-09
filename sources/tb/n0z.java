package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class n0z implements xpz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f24435a;

    static {
        t2o.a(352322001);
        t2o.a(352322029);
    }

    public n0z(View view) {
        this.f24435a = view;
    }

    @Override // tb.xpz
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fbbbe0d7", new Object[]{this});
        }
        return this.f24435a;
    }

    @Override // tb.xpz
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.xpz
    public boolean onFinishContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc8eea5a", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
