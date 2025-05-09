package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager;
import java.util.HashMap;
import java.util.Map;
import tb.b0h;
import tb.nvs;
import tb.r0h;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class HomeNormalFragment extends HomeBaseFragment2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String u = HomeNormalFragment.class.getSimpleName();
    public TabManager.TabBottom t;

    static {
        t2o.a(310378657);
    }

    public static HomeNormalFragment g3(Bundle bundle, b0h b0hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeNormalFragment) ipChange.ipc$dispatch("24efbb51", new Object[]{bundle, b0hVar});
        }
        HomeNormalFragment homeNormalFragment = new HomeNormalFragment();
        homeNormalFragment.setArguments(bundle);
        homeNormalFragment.f3(b0hVar);
        return homeNormalFragment;
    }

    public static /* synthetic */ Object ipc$super(HomeNormalFragment homeNormalFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 303778162) {
            super.T2();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/HomeNormalFragment");
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public String N2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbf611af", new Object[]{this});
        }
        return u;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121b4972", new Object[]{this});
            return;
        }
        super.T2();
        if (this.p.N != null && !TextUtils.isEmpty(this.h)) {
            String str = u;
            r0h.b(str, "onTabAppear " + this.h);
            this.p.N.f("channelType", this.h);
            if (!nvs.S()) {
                this.p.N.g(g4.b.i, null);
            }
        }
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public int getLayoutId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // com.taobao.live.home.view.UTAnalyzeFragment
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        TabManager.TabBottom tabBottom = this.t;
        if (tabBottom != null) {
            return tabBottom.pageName;
        }
        return null;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            TabManager.TabBottom tabBottom = (TabManager.TabBottom) arguments.getSerializable("tab_bottom");
            this.t = tabBottom;
            if (tabBottom != null) {
                this.h = tabBottom.channelType;
            }
        }
    }

    @Override // com.taobao.live.home.view.UTAnalyzeFragment
    public Map<String, String> p2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("16970404", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        TabManager.TabBottom tabBottom = this.t;
        String str = tabBottom != null ? tabBottom.spm : null;
        if (str != null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("spm-url", str);
            s2(hashMap2);
            hashMap.put("spm-cnt", str);
        }
        b0h b0hVar = this.p;
        if (b0hVar != null) {
            hashMap.put("entryLiveSource", b0hVar.f);
            hashMap.put("entrySpm", this.p.g);
        }
        return hashMap;
    }

    @Override // com.taobao.live.home.view.UTAnalyzeFragment
    public boolean r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("615f50a9", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public void v2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb82b62", new Object[]{this, view});
        }
    }
}
