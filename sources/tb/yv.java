package tb;

import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class yv implements mfb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(442499229);
        t2o.a(442499248);
    }

    public abstract void d();

    public abstract LinearLayout e();

    public LinearLayout f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("87e9aacf", new Object[]{this});
        }
        return null;
    }

    public LinearLayout g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("634b76b8", new Object[]{this});
        }
        return null;
    }

    public LinearLayout h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("67d49725", new Object[]{this});
        }
        return null;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebb2a389", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void j(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5cf10c2", new Object[]{this, map});
        }
    }

    public abstract void k();

    public void l(nfb nfbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8024808", new Object[]{this, nfbVar});
        }
    }
}
