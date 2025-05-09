package com.taobao.android.stdpop.api.viewpager;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStateManager;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.megadesign.viewpager.CustomTabLayout;
import com.taobao.android.megadesign.viewpager.CustomViewPagerAdapter;
import com.taobao.taobao.R;
import java.util.List;
import tb.ckf;
import tb.mpl;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class PanelViewPagerFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<mpl> f9493a;
    public ViewPager c;
    public CustomViewPagerAdapter d;
    public CustomTabLayout e;
    public int f;
    public View.OnClickListener g;
    public CustomTabLayout.a h;

    static {
        t2o.a(786432038);
    }

    public static /* synthetic */ Object ipc$super(PanelViewPagerFragment panelViewPagerFragment, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/stdpop/api/viewpager/PanelViewPagerFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        ckf.g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.std_panel_viewpager_layout, viewGroup, false);
        this.c = (ViewPager) inflate.findViewById(R.id.std_panel_viewpager);
        this.e = (CustomTabLayout) inflate.findViewById(R.id.std_panel_tab_layout);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.std_close_button_container);
        if (frameLayout != null) {
            frameLayout.setOnClickListener(this.g);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        ckf.f(childFragmentManager, FragmentStateManager.CHILD_FRAGMENT_MANAGER_KEY);
        this.d = new CustomViewPagerAdapter(childFragmentManager);
        v2();
        return inflate;
    }

    public final void p2(List<mpl> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88534c5f", new Object[]{this, list});
        } else {
            this.f9493a = list;
        }
    }

    public final void r2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6ba1dd", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public final void s2(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff1203ad", new Object[]{this, onClickListener});
            return;
        }
        ckf.g(onClickListener, DataReceiveMonitor.CB_LISTENER);
        this.g = onClickListener;
    }

    public final void u2(CustomTabLayout.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4f4b20", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
        this.h = aVar;
    }

    public final void v2() {
        CustomTabLayout customTabLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a409228", new Object[]{this});
            return;
        }
        List<mpl> list = this.f9493a;
        if (list != null) {
            for (mpl mplVar : list) {
                if (mplVar.b() != null || !TextUtils.isEmpty(mplVar.d())) {
                    if (mplVar.b() == null) {
                        CustomViewPagerAdapter customViewPagerAdapter = this.d;
                        if (customViewPagerAdapter != null) {
                            customViewPagerAdapter.h(PanelBuildFragment.Companion.a(mplVar), mplVar.c());
                        }
                    } else {
                        CustomViewPagerAdapter customViewPagerAdapter2 = this.d;
                        if (customViewPagerAdapter2 != null) {
                            customViewPagerAdapter2.h(mplVar.b(), mplVar.c());
                        }
                    }
                    CustomTabLayout customTabLayout2 = this.e;
                    if (customTabLayout2 != null) {
                        customTabLayout2.addTab(mplVar.c());
                    }
                }
            }
        }
        ViewPager viewPager = this.c;
        if (viewPager != null) {
            viewPager.setAdapter(this.d);
        }
        CustomTabLayout.a aVar = this.h;
        if (!(aVar == null || (customTabLayout = this.e) == null)) {
            customTabLayout.setOnTabClickListener(aVar);
        }
        CustomTabLayout customTabLayout3 = this.e;
        if (customTabLayout3 != null) {
            customTabLayout3.setInitTabIndex(this.f);
        }
        CustomTabLayout customTabLayout4 = this.e;
        if (customTabLayout4 != null) {
            customTabLayout4.setupWithViewPager(this.c);
        }
    }
}
