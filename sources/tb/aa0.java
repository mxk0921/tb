package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.activate.data.ActivateBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class aa0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ActivateBean f15621a;

    static {
        t2o.a(815793206);
    }

    public aa0(ActivateBean activateBean) {
        this.f15621a = activateBean;
    }

    public static aa0 a(ActivateBean activateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa0) ipChange.ipc$dispatch("4fd0a496", new Object[]{activateBean});
        }
        return new aa0(activateBean);
    }
}
