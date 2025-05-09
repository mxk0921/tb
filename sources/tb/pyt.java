package tb;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.oversea.discovery.TmgDiscoveryFragment;
import tb.b02;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pyt implements b02.b<Fragment> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TmgDiscoveryFragment f26404a;

    public pyt(TmgDiscoveryFragment tmgDiscoveryFragment) {
        this.f26404a = tmgDiscoveryFragment;
    }

    @Override // tb.b02.b
    public void a(String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96fce058", new Object[]{this, str, bundle});
            return;
        }
        if (TmgDiscoveryFragment.s2(this.f26404a) != null) {
            TmgDiscoveryFragment.s2(this.f26404a).setVisibility(0);
        }
        if (TmgDiscoveryFragment.p2(this.f26404a) != null) {
            TmgDiscoveryFragment.p2(this.f26404a).setEnabled(true);
        }
    }

    /* renamed from: c */
    public void b(Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca65d0a", new Object[]{this, fragment, bundle});
            return;
        }
        if (TmgDiscoveryFragment.s2(this.f26404a) != null) {
            TmgDiscoveryFragment.s2(this.f26404a).setVisibility(8);
        }
        if (TmgDiscoveryFragment.p2(this.f26404a) != null) {
            TmgDiscoveryFragment.p2(this.f26404a).setEnabled(true);
        }
        TmgDiscoveryFragment.v2(this.f26404a, fragment);
        TmgDiscoveryFragment tmgDiscoveryFragment = this.f26404a;
        TmgDiscoveryFragment.v2(tmgDiscoveryFragment, Fragment.instantiate(tmgDiscoveryFragment.getActivity(), "com.taobao.oversea.discovery.TmgDiscoveryRemoteFragment", null));
        if (!TmgDiscoveryFragment.u2(this.f26404a).isAdded()) {
            this.f26404a.getChildFragmentManager().beginTransaction().add(TmgDiscoveryFragment.z2(this.f26404a).getId(), TmgDiscoveryFragment.u2(this.f26404a)).commit();
        }
    }
}
