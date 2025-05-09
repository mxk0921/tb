package tb;

import android.view.Menu;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class m0p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Menu f23699a;

    static {
        t2o.a(815793790);
    }

    public m0p(Menu menu) {
        this.f23699a = menu;
    }

    public static m0p a(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m0p) ipChange.ipc$dispatch("c6acbfe4", new Object[]{menu});
        }
        return new m0p(menu);
    }
}
