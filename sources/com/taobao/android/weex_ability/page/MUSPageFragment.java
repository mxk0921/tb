package com.taobao.android.weex_ability.page;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.page.a;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.b;
import com.taobao.android.weex_framework.c;
import com.taobao.search.musie.MUSPageActivity;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.awh;
import tb.dwh;
import tb.n8j;
import tb.npc;
import tb.swh;
import tb.t2o;
import tb.uvh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MUSPageFragment extends Fragment implements npc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FRAGMENT_TAG = "ali_mus_fragment_tag";
    public static final String MUS_NAVIGATION_ADAPTER = "ali_ms_navigation";

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f9949a;
    public FrameLayout c;
    public com.taobao.android.weex_framework.a d;
    public com.taobao.android.weex_ability.page.a e;
    public npc f;
    public a.AbstractC0517a g = null;
    public boolean h;
    public boolean i;
    public a j;
    public long k;
    public String l;
    public String m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
    }

    static {
        t2o.a(980418665);
        t2o.a(982515990);
    }

    public static /* synthetic */ Object ipc$super(MUSPageFragment mUSPageFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/page/MUSPageFragment");
        }
    }

    public static MUSPageFragment z2(String str, String str2, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSPageFragment) ipChange.ipc$dispatch("69ef97c6", new Object[]{str, str2, jSONObject, map});
        }
        long currentTimeMillis = System.currentTimeMillis();
        Bundle bundle = new Bundle();
        bundle.putString("wlmUrl", str);
        bundle.putString("bundleUrl", str2);
        if (jSONObject != null) {
            bundle.putSerializable("initData", jSONObject);
        }
        if (map != null) {
            bundle.putString("options", JSON.toJSONString(map));
        }
        MUSPageFragment mUSPageFragment = new MUSPageFragment();
        mUSPageFragment.setArguments(bundle);
        mUSPageFragment.B2(str, str2, currentTimeMillis);
        return mUSPageFragment;
    }

    public final void A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf8ae9b3", new Object[]{this});
            return;
        }
        a aVar = this.j;
        if (aVar != null) {
            ((MUSPageActivity) aVar).onDowngrade();
        }
    }

    public void B2(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e5b41c1", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        this.k = j;
        this.m = str;
        this.l = str2;
    }

    public final void C2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfb5703", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.d;
        if (aVar != null) {
            aVar.destroy();
            this.d = null;
        }
        FrameLayout frameLayout = this.f9949a;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.f9949a = null;
        }
        this.i = false;
    }

    public final void D2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713877a2", new Object[]{this});
            return;
        }
        String originalUrl = getOriginalUrl();
        if (originalUrl != null) {
            try {
                Uri parse = Uri.parse(originalUrl);
                if (awh.f(parse)) {
                    originalUrl = parse.buildUpon().clearQuery().toString();
                }
            } catch (Exception e) {
                dwh.i(e);
            }
            swh.a().c(originalUrl);
        }
    }

    public final void E2(long j) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a372c241", new Object[]{this, new Long(j)});
        } else if (this.l != null && v2() != null) {
            double performance = v2().getPerformance(1);
            try {
                str = Uri.parse(this.l).getPath();
            } catch (Exception e) {
                e.printStackTrace();
                str = "";
            }
            n8j.f(j, performance, str);
        }
    }

    public void J2(a.AbstractC0517a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("533bd3b4", new Object[]{this, aVar});
        } else {
            this.g = aVar;
        }
    }

    public void K2(com.taobao.android.weex_ability.page.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52bc44a6", new Object[]{this, aVar});
            return;
        }
        this.e = aVar;
        com.taobao.android.weex_framework.a aVar2 = this.d;
        if (aVar2 != null) {
            aVar2.setTag("ali_ms_navigation", aVar);
        }
    }

    public void M2(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9450e04", new Object[]{this, aVar});
        } else {
            this.j = aVar;
        }
    }

    public void N2(npc npcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6adff9a", new Object[]{this, npcVar});
        } else {
            this.f = npcVar;
        }
    }

    public final Map<String, Object> O2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("15026c6e", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return hashMap;
    }

    public String getOriginalUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd9dbb51", new Object[]{this});
        }
        return getArguments().getString("wlmUrl");
    }

    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        a.AbstractC0517a aVar = this.g;
        if (aVar == null) {
            return false;
        }
        aVar.a(0);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (this.i) {
            return this.f9949a;
        }
        this.i = true;
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.fragment_mus_page, viewGroup, false);
        this.f9949a = frameLayout;
        this.c = (FrameLayout) frameLayout.findViewById(R.id.render_container);
        try {
            String path = Uri.parse(this.l).getPath();
            if (path != null && !path.startsWith("/muise_scan_dev") && !path.startsWith("/muise_dev")) {
                path.startsWith("/muise_scan");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        p2(layoutInflater.getContext(), null);
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        C2();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.onDestroyView();
        C2();
    }

    @Override // tb.npc
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            return;
        }
        npc npcVar = this.f;
        if (npcVar != null) {
            npcVar.onDestroyed(mUSDKInstance);
        }
    }

    @Override // tb.npc
    public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
            return;
        }
        n8j.g(this.l, str);
        npc npcVar = this.f;
        if (npcVar != null) {
            npcVar.onJSException(aVar, i, str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        com.taobao.android.weex_framework.a aVar = this.d;
        if (aVar != null) {
            aVar.onActivityPause();
        }
    }

    @Override // tb.npc
    public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
            return;
        }
        npc npcVar = this.f;
        if (npcVar != null) {
            npcVar.onPrepareSuccess(aVar);
        }
    }

    @Override // tb.npc
    public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        n8j.g(this.l, str);
        npc npcVar = this.f;
        if (npcVar != null) {
            npcVar.onRefreshFailed(aVar, i, str, z);
        }
    }

    @Override // tb.npc
    public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
            return;
        }
        E2(System.currentTimeMillis() - this.k);
        npc npcVar = this.f;
        if (npcVar != null) {
            npcVar.onRefreshSuccess(aVar);
        }
    }

    @Override // tb.npc
    public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        n8j.g(this.l, str);
        r2();
        npc npcVar = this.f;
        if (npcVar != null) {
            npcVar.onRenderFailed(aVar, i, str, z);
        }
        D2();
    }

    @Override // tb.npc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            return;
        }
        npc npcVar = this.f;
        if (npcVar != null) {
            npcVar.onRenderSuccess(aVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        com.taobao.android.weex_framework.a aVar = this.d;
        if (aVar != null) {
            aVar.onActivityResume();
        }
    }

    public void r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5467727c", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.d;
        c cVar = null;
        if (aVar != null) {
            c monitorInfo = aVar.getMonitorInfo();
            this.d.destroy();
            this.d = null;
            cVar = monitorInfo;
        }
        if (cVar == null) {
            cVar = new c(this.l, this.m);
        }
        MUSAppMonitor.a(cVar);
        FrameLayout frameLayout = this.c;
        if (frameLayout == null) {
            this.h = true;
            A2();
            return;
        }
        frameLayout.removeAllViews();
        A2();
    }

    public void s2(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f0e3fb", new Object[]{this, str, jSONObject});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.d;
        if (aVar != null) {
            aVar.sendInstanceMessage(str, jSONObject);
        }
    }

    public com.taobao.android.weex_framework.a v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("e88d359f", new Object[]{this});
        }
        return this.d;
    }

    public final void p2(Context context, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d6e8ea", new Object[]{this, context, jSONObject});
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null && this.c != null && !this.h) {
            String string = arguments.getString("wlmUrl");
            if (!TextUtils.isEmpty(string)) {
                String string2 = arguments.getString("bundleUrl");
                Map<String, Object> map = null;
                try {
                    str = u2(string2);
                } catch (Throwable unused) {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    Uri parse = Uri.parse(str);
                    if (!parse.isHierarchical() || TextUtils.isEmpty(parse.getQueryParameter("_mus_tpl"))) {
                        string = str;
                        string2 = string;
                    } else {
                        string = parse.getQueryParameter("_mus_tpl");
                        string2 = str;
                    }
                }
                MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
                mUSInstanceConfig.p(string2);
                com.taobao.android.weex_framework.a c = b.f().c(context, mUSInstanceConfig);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", (Object) string);
                jSONObject2.put("bundleUrl", (Object) string2);
                c.addInstanceEnv("instanceInfo", jSONObject2.toJSONString());
                String string3 = arguments.getString("options");
                if (string3 != null) {
                    try {
                        map = O2(JSON.parseObject(string3));
                    } catch (Exception e) {
                        dwh.i(e);
                    }
                }
                if (jSONObject == null) {
                    Serializable serializable = arguments.getSerializable("initData");
                    if (serializable instanceof JSONObject) {
                        jSONObject = (JSONObject) serializable;
                    } else if (serializable != null && (serializable instanceof Map)) {
                        jSONObject = new JSONObject((Map) serializable);
                    }
                }
                c.renderByUrl(string, string2, jSONObject, map);
                c.registerRenderListener(this);
                com.taobao.android.weex_ability.page.a aVar = this.e;
                if (aVar != null) {
                    c.setTag("ali_ms_navigation", aVar);
                }
                this.d = c;
                c.getRenderRoot().setFitsSystemWindows(false);
                this.c.addView(this.d.getRenderRoot(), new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }

    public final String u2(String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b921d638", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || !"true".equals(uvh.f().i().getConfig("weex_v2_config", "enable", "false"))) {
            return null;
        }
        String config = uvh.f().i().getConfig("weex_v2_config", "url_map", "");
        if (!TextUtils.isEmpty(config)) {
            Uri parse = Uri.parse(str);
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            String uri = clearQuery.build().toString();
            HashSet<String> hashSet = parse.isHierarchical() ? new HashSet(parse.getQueryParameterNames()) : null;
            JSONObject parseObject = JSON.parseObject(config);
            Set<String> keySet = parseObject.keySet();
            if (keySet != null) {
                for (String str2 : keySet) {
                    if (uri.contains(str2)) {
                        String string = parseObject.getString(str2);
                        if (string.endsWith(".wlm")) {
                            if (hashSet != null && hashSet.contains("_mus_tpl")) {
                                hashSet.remove("_mus_tpl");
                            }
                            clearQuery.appendQueryParameter("_mus_tpl", string);
                            if (hashSet != null) {
                                for (String str3 : hashSet) {
                                    clearQuery.appendQueryParameter(str3, parse.getQueryParameter(str3));
                                }
                            }
                            return clearQuery.build().toString();
                        }
                        Uri.Builder builder = new Uri.Builder();
                        builder.scheme(parse.getScheme()).encodedAuthority(string);
                        if (hashSet != null) {
                            for (String str4 : hashSet) {
                                if ("wh_weex".equals(str4)) {
                                    builder.appendQueryParameter(str4, "true");
                                    z = true;
                                } else if (!"_mus_tpl".equals(str4)) {
                                    builder.appendQueryParameter(str4, parse.getQueryParameter(str4));
                                }
                            }
                            if (!z) {
                                builder.appendQueryParameter("wh_weex", "true");
                            }
                        }
                        return builder.build().toString();
                    }
                }
            }
        }
        return null;
    }
}
