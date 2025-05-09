package com.taobao.android.abilitykit.ability.pop.render;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class FragmentContainer extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Fragment f6274a;
    public String c;
    public View.OnClickListener d;

    static {
        t2o.a(336593033);
    }

    public static /* synthetic */ Object ipc$super(FragmentContainer fragmentContainer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/pop/render/FragmentContainer");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = layoutInflater.inflate(R.layout.std_pop_fragment_container, viewGroup, false);
        if (this.c != null) {
            ((ViewGroup) inflate.findViewById(R.id.std_pop_title_bar)).setVisibility(0);
            ((TextView) inflate.findViewById(R.id.std_pop_title)).setText(this.c);
            ViewProxy.setOnClickListener(inflate.findViewById(R.id.std_pop_title_bar_close), this.d);
        }
        if (bundle == null && this.f6274a != null) {
            getChildFragmentManager().beginTransaction().replace(R.id.std_pop_fragment_container, this.f6274a).commit();
        }
        return inflate;
    }

    public void p2(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb57ac9", new Object[]{this, fragment});
        } else {
            this.f6274a = fragment;
        }
    }

    public void r2(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d47c5e", new Object[]{this, onClickListener});
        } else {
            this.d = onClickListener;
        }
    }

    public void s2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }
}
