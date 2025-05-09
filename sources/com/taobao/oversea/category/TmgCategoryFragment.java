package com.taobao.oversea.category;

import android.os.Bundle;
import android.taobao.windvane.extra.uc.WVUCWebViewFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.page.WeexFragment;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.a;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.TBBaseFragment;
import com.taobao.taobao.R;
import tb.npc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TmgCategoryFragment extends TBBaseFragment implements npc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f11424a;
    public final String c = "https://assets-tmw.taobao.com/app/tmall-ovs-rax/tmg-en-category/home?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&is_loading=1&_wx_statusbar_hidden=hidden_dark_text";
    public final String d = "https://assets-tmw.taobao.com/app/tmall-ovs-rax/tmg-en-category/home?wx_navbar_hidden=true&wx_navbar_transparent=true&is_loading=1&disableNav=YES&_wx_statusbar_hidden=true";

    public static /* synthetic */ Object ipc$super(TmgCategoryFragment tmgCategoryFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 1860817453) {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/oversea/category/TmgCategoryFragment");
        }
    }

    @Override // com.taobao.tao.TBBaseFragment
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        return "PAGE_OVS_CATEGORY";
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
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_tmg_discovery, viewGroup, false);
        this.f11424a = inflate;
        return inflate;
    }

    @Override // tb.npc
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    @Override // tb.npc
    public void onJSException(a aVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
        }
    }

    @Override // tb.npc
    public void onPrepareSuccess(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onRefreshFailed(a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
        }
    }

    @Override // tb.npc
    public void onRefreshSuccess(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onRenderFailed(a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
        } else {
            getChildFragmentManager().beginTransaction().replace(R.id.rootView, p2()).addToBackStack(null).commit();
        }
    }

    @Override // tb.npc
    public void onRenderSuccess(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
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
        getChildFragmentManager().beginTransaction().replace(R.id.rootView, r2()).addToBackStack(null).commit();
    }

    public final Fragment p2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("6b91ec7f", new Object[]{this});
        }
        WVUCWebViewFragment wVUCWebViewFragment = new WVUCWebViewFragment();
        Bundle bundle = new Bundle();
        bundle.putString("url", this.d);
        wVUCWebViewFragment.setArguments(bundle);
        return wVUCWebViewFragment;
    }

    public final Fragment r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("90c228fa", new Object[]{this});
        }
        WeexFragment weexFragment = null;
        try {
            weexFragment = WeexFragment.B2(s2(), s2(), null, null, null);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("renderMode", (Object) UltronTradeHybridInstanceRenderMode.TEXTURE);
            Bundle arguments = weexFragment.getArguments();
            if (arguments != null) {
                arguments.putString("config", jSONObject.toString());
                weexFragment.setArguments(arguments);
            }
            weexFragment.T2(this);
        } catch (Exception unused) {
        }
        return weexFragment;
    }

    public final String s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9b36c81", new Object[]{this});
        }
        return OrangeConfig.getInstance().getConfig("tmghomeservice", "categoryUrl", this.c);
    }
}
