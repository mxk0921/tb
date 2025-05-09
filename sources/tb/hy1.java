package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class hy1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<AbsMuiseViewHolder<?, ?>> f20957a = new ArrayList<>();

    static {
        t2o.a(993002133);
        t2o.a(993002138);
    }

    public final ArrayList<AbsMuiseViewHolder<?, ?>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e74e74b6", new Object[]{this});
        }
        return this.f20957a;
    }

    public void b(AbsMuiseViewHolder<?, ?> absMuiseViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56008163", new Object[]{this, absMuiseViewHolder});
            return;
        }
        ckf.g(absMuiseViewHolder, "musCell");
        this.f20957a.add(absMuiseViewHolder);
    }
}
