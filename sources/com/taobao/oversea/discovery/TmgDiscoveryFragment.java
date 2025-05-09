package com.taobao.oversea.discovery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TBBaseFragment;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.byv;
import tb.ix9;
import tb.pyt;
import tb.q17;
import tb.vca;
import tb.vcq;
import tb.xcq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TmgDiscoveryFragment extends TBBaseFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Fragment f11425a;
    public LinearLayout c;
    public TUrlImageView d;
    public Button e = null;
    public View f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TmgDiscoveryFragment.p2(TmgDiscoveryFragment.this).setEnabled(false);
            TmgDiscoveryFragment.r2(TmgDiscoveryFragment.this);
        }
    }

    public static /* synthetic */ Object ipc$super(TmgDiscoveryFragment tmgDiscoveryFragment, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/discovery/TmgDiscoveryFragment");
    }

    public static /* synthetic */ Button p2(TmgDiscoveryFragment tmgDiscoveryFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Button) ipChange.ipc$dispatch("d419aa46", new Object[]{tmgDiscoveryFragment});
        }
        return tmgDiscoveryFragment.e;
    }

    public static /* synthetic */ void r2(TmgDiscoveryFragment tmgDiscoveryFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a089fd71", new Object[]{tmgDiscoveryFragment});
        } else {
            tmgDiscoveryFragment.A2();
        }
    }

    public static /* synthetic */ LinearLayout s2(TmgDiscoveryFragment tmgDiscoveryFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("5d7d8de7", new Object[]{tmgDiscoveryFragment});
        }
        return tmgDiscoveryFragment.c;
    }

    public static /* synthetic */ Fragment u2(TmgDiscoveryFragment tmgDiscoveryFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("13e9407f", new Object[]{tmgDiscoveryFragment});
        }
        return tmgDiscoveryFragment.f11425a;
    }

    public static /* synthetic */ Fragment v2(TmgDiscoveryFragment tmgDiscoveryFragment, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("19240b09", new Object[]{tmgDiscoveryFragment, fragment});
        }
        tmgDiscoveryFragment.f11425a = fragment;
        return fragment;
    }

    public static /* synthetic */ View z2(TmgDiscoveryFragment tmgDiscoveryFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("89de0390", new Object[]{tmgDiscoveryFragment});
        }
        return tmgDiscoveryFragment.f;
    }

    public final void A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f0de0d1", new Object[]{this});
        } else {
            vcq.a(getActivity()).c(xcq.c().i(new q17(getActivity())).p(true).j(ix9.h(getActivity(), "com.taobao.oversea.discovery.TmgDiscoveryRemoteFragment").f(new pyt(this)).a()).n());
        }
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (this.f == null) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_tmg_discovery, viewGroup, false);
            this.f = inflate;
            this.c = (LinearLayout) inflate.findViewById(R.id.page_error);
            this.d = (TUrlImageView) this.f.findViewById(R.id.tips_icon);
            this.e = (Button) this.f.findViewById(R.id.refresh_btn);
        }
        if (byv.a()) {
            if (this.f11425a == null) {
                this.f11425a = Fragment.instantiate(getActivity(), "com.taobao.oversea.discovery.TmgDiscoveryRemoteFragment", null);
            }
            LinearLayout linearLayout = this.c;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            if (!this.f11425a.isAdded()) {
                getChildFragmentManager().beginTransaction().add(this.f.getId(), this.f11425a).commit();
            }
        } else {
            A2();
            if (this.c == null) {
                TUrlImageView tUrlImageView = this.d;
                if (tUrlImageView != null) {
                    tUrlImageView.setImageUrl(vca.URL_ERROR_TIPS);
                }
                this.c.setVisibility(0);
                this.e.setOnClickListener(new a());
            }
        }
        return this.f;
    }
}
