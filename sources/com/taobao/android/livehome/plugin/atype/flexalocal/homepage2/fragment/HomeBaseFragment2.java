package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.business.BaseListRequest;
import com.taobao.live.home.view.BaseLiveRecyclerFragment;
import tb.ax1;
import tb.b0h;
import tb.bjr;
import tb.lrq;
import tb.r0h;
import tb.t2o;
import tb.zzg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class HomeBaseFragment2 extends BaseLiveRecyclerFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject n;
    public b0h p;
    public boolean q;
    public String h = "jingxuan";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public int o = 0;
    public boolean r = false;
    public boolean s = false;

    static {
        t2o.a(310378652);
    }

    public static /* synthetic */ Object ipc$super(HomeBaseFragment2 homeBaseFragment2, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1126882532:
                return super.onCreateView((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
            case -1010986463:
                super.setUserVisibleHint(((Boolean) objArr[0]).booleanValue());
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/HomeBaseFragment2");
        }
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public void A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("562dcbcb", new Object[]{this});
        }
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public ax1 B2(Bundle bundle, BaseListRequest baseListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ax1) ipChange.ipc$dispatch("3cfa32dd", new Object[]{this, bundle, baseListRequest});
        }
        return null;
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public BaseListRequest C2(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseListRequest) ipChange.ipc$dispatch("d68225e1", new Object[]{this, bundle});
        }
        Q2("onRequestCreate");
        return null;
    }

    public final void D2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd65504c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.s = true;
            T2();
        } else {
            U2();
            this.s = false;
        }
    }

    public String E2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4834b80", new Object[]{this});
        }
        return this.j;
    }

    public String J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19603877", new Object[]{this});
        }
        return this.k;
    }

    public String K2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16f49ae", new Object[]{this});
        }
        return this.i;
    }

    public int M2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62e7f399", new Object[]{this})).intValue();
        }
        return this.o;
    }

    public abstract String N2();

    public String O2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4816a615", new Object[]{this});
        }
        return this.l;
    }

    public final void Q2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        r0h.b("HomeBaseFragment2", N2() + "--" + str);
    }

    public boolean R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48d91480", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void S2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647c2a98", new Object[]{this, new Boolean(z)});
        }
    }

    public void W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("895662e7", new Object[]{this});
            return;
        }
        Q2("onTabPause mSelected:" + this.s + " appear:" + this.r);
    }

    public void X2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d5380a", new Object[]{this});
            return;
        }
        Q2("onTabResume mSelected:" + this.s + " appear:" + this.r);
    }

    public void a3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8fbeb53", new Object[]{this});
            return;
        }
        Q2("onTabStart mSelected:" + this.s + " appear:" + this.r);
    }

    public void b3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("503402df", new Object[]{this});
            return;
        }
        Q2("onTabStop mSelected:" + this.s + " appear:" + this.r);
    }

    public void c3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a25057d", new Object[]{this});
        } else if (!lrq.a(this.m)) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str : this.m.split("&")) {
                    String[] split = str.split("=");
                    if (split.length >= 2) {
                        jSONObject.put(split[0], (Object) split[1]);
                    }
                }
                this.n = jSONObject;
            } catch (Exception e) {
                r0h.c("HomeBaseFragment2", "addQueryParamsOnce exp..", e);
            }
        }
    }

    public void d3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6c53d4", new Object[]{this});
        } else {
            Q2("refreshCurrentPage");
        }
    }

    public void e3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5283552", new Object[]{this});
        }
    }

    public void f3(b0h b0hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e78edcc", new Object[]{this, b0hVar});
        } else {
            this.p = b0hVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        Q2("onActivityResult mSelected:" + this.s + " appear:" + this.r);
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        Q2("onCreateView");
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.q = false;
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment, com.taobao.live.home.view.UTAnalyzeFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        Q2("onPause mSelected:" + this.s + " appear:" + this.r);
        if (this.s) {
            W2();
        }
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment, com.taobao.live.home.view.UTAnalyzeFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        Q2("onResume mSelected:" + this.s + " appear:" + this.r);
        if (this.s) {
            X2();
        }
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        Q2("onStart mSelected:" + this.s + " mAppear:" + this.r);
        if (this.r) {
            a3();
        }
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        Q2("onStop mSelected:" + this.s + " appear:" + this.r);
        if (this.s) {
            b3();
        }
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment, com.taobao.live.home.view.UTAnalyzeFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bd9221", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setUserVisibleHint(z);
        Q2("setUserVisibleHint isVisibleToUser " + z);
        if (this.q) {
            D2(z);
        }
    }

    public void T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121b4972", new Object[]{this});
            return;
        }
        Q2("onTabAppear  mSelected:" + this.s);
        this.r = true;
        b0h b0hVar = this.p;
        if (b0hVar != null && b0hVar.j() != null) {
            if (R2()) {
                this.p.j().c();
            } else {
                this.p.j().a();
            }
        }
    }

    public void U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8c0914", new Object[]{this});
            return;
        }
        Q2("onTabDisappear mSelected:" + this.s);
        this.r = false;
        bjr.d().c(zzg.PLAY_PAGEID, false);
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        Q2("onActivityCreated");
        if (getUserVisibleHint()) {
            D2(true);
        }
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Q2("onCreate");
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.h = arguments.getString("business_type", "jingxuan");
            arguments.getInt(NotificationCompat.TvExtender.EXTRA_CHANNEL_ID, 0);
            this.m = arguments.getString("query_params", "");
            arguments.getString("entryLiveSource", "");
            this.o = arguments.getInt("page_position", 0);
            this.i = arguments.getString("jump_url", "");
            this.l = arguments.getString("tab_title_name", "");
            this.j = arguments.getString("andorid_normal_icon", "");
            this.k = arguments.getString("android_pressed_icon", "");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        Q2("onViewCreated");
        this.q = true;
    }
}
