package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w8j implements x8j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(758120526);
        t2o.a(758120527);
    }

    @Override // tb.x8j
    public void a(List<z6e> list, List<ozd> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4213f8d", new Object[]{this, list, list2});
        }
    }

    @Override // tb.x8j
    public void b(ndt ndtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620df2f4", new Object[]{this, ndtVar});
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }
}
