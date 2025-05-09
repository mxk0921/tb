package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class s1p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final s1p d = new s1p();

    /* renamed from: a  reason: collision with root package name */
    public final r1p<ActivateTypedBean> f27748a = new r1p<>(yak.f31939a);
    public final r1p<ActivateTypedBean> b = new r1p<>(yak.f31939a);
    public final ga0 c = new ga0(yak.f31939a);

    static {
        t2o.a(815793092);
    }

    public static s1p c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s1p) ipChange.ipc$dispatch("8d617035", new Object[0]);
        }
        return d;
    }

    public r1p<ActivateTypedBean> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r1p) ipChange.ipc$dispatch("582e60d2", new Object[]{this});
        }
        return this.b;
    }

    public ga0 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ga0) ipChange.ipc$dispatch("7db411d8", new Object[]{this});
        }
        return this.c;
    }

    public r1p<ActivateTypedBean> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r1p) ipChange.ipc$dispatch("8d2d5cf7", new Object[]{this});
        }
        return this.f27748a;
    }
}
