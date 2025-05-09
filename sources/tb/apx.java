package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class apx implements dfe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856358);
        t2o.a(996147239);
    }

    @Override // tb.dfe
    public void firstUpdateCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b76ba426", new Object[]{this, new Integer(i)});
        } else if (vrw.getInstance().getUpdateFinishCallback() != null) {
            vrw.getInstance().getUpdateFinishCallback().updateCount("3", i);
        }
    }
}
