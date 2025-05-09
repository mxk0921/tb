package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.activate.data.ActivateBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class z90 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ActivateBean f32611a;
    public final int b;
    public final String c;

    static {
        t2o.a(815793205);
    }

    public z90(ActivateBean activateBean, int i, String str) {
        this.f32611a = activateBean;
        this.b = i;
        this.c = str;
    }

    public static z90 a(ActivateBean activateBean, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z90) ipChange.ipc$dispatch("1f62bc7", new Object[]{activateBean, new Integer(i), str});
        }
        return new z90(activateBean, i, str);
    }
}
