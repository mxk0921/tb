package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.lp0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class wfp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final wfp INSTANCE = new wfp();

    public final boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cb87391", new Object[]{this, context})).booleanValue();
        }
        if (b()) {
            return false;
        }
        return new n81(context).isAutoPlayVideoUnderCurrentNetwork(context);
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0ebee55", new Object[]{this})).booleanValue();
        }
        lp0 d = lp0.d();
        ckf.f(d, "AliHAHardware.getInstance()");
        lp0.e f = d.f();
        ckf.f(f, "AliHAHardware.getInstance().outlineInfo");
        if (f.f23479a == 2) {
            return true;
        }
        return false;
    }
}
