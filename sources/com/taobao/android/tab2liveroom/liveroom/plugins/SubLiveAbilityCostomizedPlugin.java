package com.taobao.android.tab2liveroom.liveroom.plugins;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import java.util.HashMap;
import java.util.Map;
import tb.gol;
import tb.sxk;
import tb.t2o;
import tb.tfs;
import tb.x3d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SubLiveAbilityCostomizedPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SubLiveAbilityCostomizedPlugin";
    private TNodeView mTNodeView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements x3d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.x3d
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
            } else if (SubLiveAbilityCostomizedPlugin.access$000(SubLiveAbilityCostomizedPlugin.this) != null) {
                SubLiveAbilityCostomizedPlugin.access$000(SubLiveAbilityCostomizedPlugin.this).onDestroy();
            }
        }

        @Override // tb.x3d
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            } else if (SubLiveAbilityCostomizedPlugin.access$000(SubLiveAbilityCostomizedPlugin.this) != null) {
                SubLiveAbilityCostomizedPlugin.access$000(SubLiveAbilityCostomizedPlugin.this).onPause();
            }
        }

        @Override // tb.x3d
        public void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            } else if (SubLiveAbilityCostomizedPlugin.access$000(SubLiveAbilityCostomizedPlugin.this) != null) {
                SubLiveAbilityCostomizedPlugin.access$000(SubLiveAbilityCostomizedPlugin.this).onResume();
            }
        }

        @Override // tb.x3d
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            } else if (SubLiveAbilityCostomizedPlugin.access$000(SubLiveAbilityCostomizedPlugin.this) != null) {
                SubLiveAbilityCostomizedPlugin.access$000(SubLiveAbilityCostomizedPlugin.this).onStart();
            }
        }

        @Override // tb.x3d
        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            } else if (SubLiveAbilityCostomizedPlugin.access$000(SubLiveAbilityCostomizedPlugin.this) != null) {
                SubLiveAbilityCostomizedPlugin.access$000(SubLiveAbilityCostomizedPlugin.this).onStop();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements TNodeView.l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(SubLiveAbilityCostomizedPlugin subLiveAbilityCostomizedPlugin) {
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.l
        public void onLayoutCompleted(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e800489", new Object[]{this, nVar});
            } else {
                tfs.e(SubLiveAbilityCostomizedPlugin.TAG, "onTNodeView LayoutCompleted");
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.l
        public void onLayoutError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("834776a6", new Object[]{this});
            } else {
                tfs.e(SubLiveAbilityCostomizedPlugin.TAG, "onTNodeView LayoutError");
            }
        }
    }

    static {
        t2o.a(779092149);
    }

    public static /* synthetic */ TNodeView access$000(SubLiveAbilityCostomizedPlugin subLiveAbilityCostomizedPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeView) ipChange.ipc$dispatch("eaf30e3c", new Object[]{subLiveAbilityCostomizedPlugin});
        }
        return subLiveAbilityCostomizedPlugin.mTNodeView;
    }

    private static void addSubLiveAblity(Map map, boolean z, OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdb5c6d0", new Object[]{map, new Boolean(z), openAbilityCompontentTypeEnum});
        } else {
            map.putAll(new sxk(openAbilityCompontentTypeEnum, z, null).a());
        }
    }

    private String constructUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f384a7e1", new Object[]{this});
        }
        gol.k("page_guangguangsidelive", "https://g.alicdn.com/tnode/guangguangsidelive/0.0.10/main.json.json", null);
        return "http://h5.m.taobao.com/tnode/index.htm?tnode=page_guangguangsidelive&pagewidth=656&pagename=Page_TaobaoLiveWatch&spm=a2141.8001249";
    }

    public static Map customizedPluginMap(Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("979c6744", new Object[]{map, map2});
        }
        if (map == null) {
            map = new HashMap();
        }
        addSubLiveAblity(map, true, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedToast);
        addSubLiveAblity(map, true, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_ReplayStatusShowLiveEnd);
        addSubLiveAblity(map, false, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Horizontal_Scrolle);
        addSubLiveAblity(map, true, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedMoreLive);
        return map;
    }

    public x3d createLiveCustomView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3d) ipChange.ipc$dispatch("33ed5cd7", new Object[]{this, viewGroup});
        }
        if (viewGroup == null) {
            return null;
        }
        String constructUrl = constructUrl();
        a aVar = new a();
        TNodeView create = TNodeView.create(viewGroup.getContext(), null, constructUrl, new b(this));
        this.mTNodeView = create;
        viewGroup.addView(create, new ViewGroup.LayoutParams(-1, -1));
        return aVar;
    }
}
