package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class aqw implements jqw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856385);
        t2o.a(989856388);
    }

    public void onCoreSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc4fa79", new Object[]{this});
        }
    }

    @Override // tb.jqw
    public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
        }
        kqw kqwVar = new kqw(false);
        if (i == 3016) {
            onUCCorePrepared();
        } else if (i == 3017) {
            onCoreSwitch();
        }
        return kqwVar;
    }

    public void onUCCorePrepared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1aa650", new Object[]{this});
        }
    }
}
