package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class HomeMainBaseFragment extends HomeBaseFragment2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(310378656);
    }

    public static /* synthetic */ Object ipc$super(HomeMainBaseFragment homeMainBaseFragment, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/HomeMainBaseFragment");
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public String N2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbf611af", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public int getLayoutId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public void v2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb82b62", new Object[]{this, view});
        }
    }
}
