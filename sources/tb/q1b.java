package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.adapter.RecyclerArrayAdapter;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.HomeMainSecondFragment;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class q1b implements RecyclerArrayAdapter.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeMainSecondFragment f26445a;

    public q1b(HomeMainSecondFragment homeMainSecondFragment) {
        this.f26445a = homeMainSecondFragment;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7effe9b", new Object[]{this});
        } else if (HomeMainSecondFragment.D2(this.f26445a) != null) {
            HomeMainSecondFragment.D2(this.f26445a).onLoadMore();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82599ef8", new Object[]{this});
        } else if (HomeMainSecondFragment.D2(this.f26445a) != null) {
            HomeMainSecondFragment.D2(this.f26445a).onLoadMore();
        }
    }
}
