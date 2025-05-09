package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.updown.TaoLiveKtUpDownActionType;
import com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class z3t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f32512a;
    public List<TaoLiveKtSwitchModel> b;
    public TaoLiveKtUpDownActionType c;

    static {
        t2o.a(1003487378);
    }

    public final TaoLiveKtUpDownActionType a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtUpDownActionType) ipChange.ipc$dispatch("5906417", new Object[]{this});
        }
        return this.c;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
        }
        return this.f32512a;
    }

    public final List<TaoLiveKtSwitchModel> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4f5eb28f", new Object[]{this});
        }
        return this.b;
    }

    public final void d(TaoLiveKtUpDownActionType taoLiveKtUpDownActionType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd43307", new Object[]{this, taoLiveKtUpDownActionType});
        } else {
            this.c = taoLiveKtUpDownActionType;
        }
    }

    public final void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
        } else {
            this.f32512a = i;
        }
    }

    public final void f(List<TaoLiveKtSwitchModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d974b41d", new Object[]{this, list});
        } else {
            this.b = list;
        }
    }
}
