package tb;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import tb.h6c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ggm implements h6c.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final e3b f19975a;

    static {
        t2o.a(491782604);
        t2o.a(488636470);
    }

    public ggm(e3b e3bVar) {
        this.f19975a = e3bVar;
    }

    @Override // tb.h6c.c
    public void n(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb26e08c", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    @Override // tb.h6c.c
    public void onScrollStateChanged(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e409bdce", new Object[]{this, viewGroup, new Integer(i)});
        } else {
            this.f19975a.j().A(viewGroup, i);
        }
    }

    @Override // tb.h6c.c
    public void onScrolled(ViewGroup viewGroup, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f64c91", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
        } else {
            this.f19975a.j().z(i, i2);
        }
    }
}
