package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class uc implements qab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092273);
        t2o.a(806355883);
    }

    @Override // tb.qab
    public boolean A(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eaf3b0c0", new Object[]{this, context})).booleanValue();
        }
        if (!y() || ((!a(context) && !b(context)) || !t(context))) {
            return false;
        }
        return true;
    }

    @Override // tb.qab
    public int B(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8587b906", new Object[]{this, context})).intValue();
        }
        if (context == null || !y()) {
            return 0;
        }
        return (int) (context.getResources().getDisplayMetrics().heightPixels * 0.725f);
    }

    @Override // tb.qab
    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc1a5af5", new Object[]{this, context})).booleanValue();
        }
        if (context != null && y() && TBDeviceUtils.P(context)) {
            return true;
        }
        return false;
    }

    @Override // tb.qab
    public boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afe54a44", new Object[]{this, context})).booleanValue();
        }
        if (context != null && y() && TBDeviceUtils.p(context)) {
            return true;
        }
        return false;
    }

    @Override // tb.qab
    public boolean t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe4c5214", new Object[]{this, context})).booleanValue();
        }
        if (!y() || !nvo.a().b(context)) {
            return false;
        }
        return true;
    }

    @Override // tb.qab
    public int u(Context context) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4907c1ea", new Object[]{this, context})).intValue();
        }
        int b = hw0.b(context, 375.0f);
        if (context == null || !y()) {
            return b;
        }
        int i = context.getResources().getDisplayMetrics().widthPixels;
        int i2 = context.getResources().getDisplayMetrics().heightPixels;
        if (i > i2) {
            f = i2;
        } else {
            f = i;
        }
        int i3 = (int) (f * 0.5f);
        if (i3 < b) {
            return b;
        }
        return i3;
    }

    @Override // tb.qab
    public boolean v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b12cc75", new Object[]{this, context})).booleanValue();
        }
        if (context != null && y() && t(context) && b(context)) {
            return true;
        }
        return false;
    }

    @Override // tb.qab
    public void w(huk hukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df86bb49", new Object[]{this, hukVar});
        } else {
            nvo.a().d(hukVar);
        }
    }

    @Override // tb.qab
    public boolean x(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a28a2397", new Object[]{this, context})).booleanValue();
        }
        if (y()) {
            if (a(context)) {
                return true;
            }
            if (b(context) && t(context)) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.qab
    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("380c662a", new Object[]{this})).booleanValue();
        }
        return sbt.q();
    }

    @Override // tb.qab
    public void z(huk hukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ff0ae2", new Object[]{this, hukVar});
        } else {
            nvo.a().c(hukVar);
        }
    }
}
