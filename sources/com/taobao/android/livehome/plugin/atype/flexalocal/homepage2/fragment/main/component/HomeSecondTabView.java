package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.business.FeedListResponse;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.turbo.model.UserModel;
import com.taobao.tao.log.TLog;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.b0h;
import tb.lrq;
import tb.p9m;
import tb.t0b;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class HomeSecondTabView extends t0b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public LiveHomeTabLayout e;
    public List<SecondTab> f;
    public d g;
    public int h = 0;
    public JSONObject i;
    public boolean j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class SecondTab implements IMTOPDataObject, Serializable {
        public JSONObject clickMaidian;
        public String followLiveNum;
        public String name;
        public String pageType;
        public boolean redPoint;
        public boolean selected;
        public JSONObject showMaidian;
        public String showPic;
        public String subChannelType;
        public JSONObject tabShowMaidian;

        static {
            t2o.a(310378749);
            t2o.a(589299906);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements LiveHomeTabLayout.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout.e
        public void a(LiveHomeTabLayout.h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00e0a3d", new Object[]{this, hVar});
            } else if (HomeSecondTabView.d(HomeSecondTabView.this) != null) {
                HomeSecondTabView.d(HomeSecondTabView.this).a(hVar);
            }
        }

        @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout.e
        public void b(LiveHomeTabLayout.h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9631f70", new Object[]{this, hVar});
            }
        }

        @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout.e
        public void c(LiveHomeTabLayout.h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76c7a8d6", new Object[]{this, hVar});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements LiveHomeTabLayout.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a(LiveHomeTabLayout.h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9702b8be", new Object[]{this, hVar});
            } else {
                HomeSecondTabView.e(HomeSecondTabView.this, hVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements LiveHomeTabLayout.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout.g
        public void a(SecondTab secondTab) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd4d861b", new Object[]{this, secondTab});
                return;
            }
            TLog.logi("LiveHomeTabLayout", "onShow-tabName:" + secondTab.name);
            if (!HomeSecondTabView.f(HomeSecondTabView.this)) {
                HomeSecondTabView.g(HomeSecondTabView.this);
            }
        }

        @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout.g
        public void b(SecondTab secondTab) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa083540", new Object[]{this, secondTab});
                return;
            }
            TLog.logi("LiveHomeTabLayout", "onFirstClick-tabName:" + secondTab.name);
            HomeSecondTabView.h(HomeSecondTabView.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
        void a(LiveHomeTabLayout.h hVar);
    }

    static {
        t2o.a(310378744);
    }

    public HomeSecondTabView(ViewGroup viewGroup, Context context, b0h b0hVar) {
        super(viewGroup, context, b0hVar);
    }

    public static /* synthetic */ d d(HomeSecondTabView homeSecondTabView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("ec1e649a", new Object[]{homeSecondTabView});
        }
        return homeSecondTabView.g;
    }

    public static /* synthetic */ void e(HomeSecondTabView homeSecondTabView, LiveHomeTabLayout.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fbb1c28", new Object[]{homeSecondTabView, hVar});
        } else {
            homeSecondTabView.o(hVar);
        }
    }

    public static /* synthetic */ boolean f(HomeSecondTabView homeSecondTabView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1191f8c6", new Object[]{homeSecondTabView})).booleanValue();
        }
        return homeSecondTabView.j;
    }

    public static /* synthetic */ void g(HomeSecondTabView homeSecondTabView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f9e22a1", new Object[]{homeSecondTabView});
        } else {
            homeSecondTabView.r();
        }
    }

    public static /* synthetic */ void h(HomeSecondTabView homeSecondTabView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2daa4c80", new Object[]{homeSecondTabView});
        } else {
            homeSecondTabView.i();
        }
    }

    public static /* synthetic */ Object ipc$super(HomeSecondTabView homeSecondTabView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2122770368) {
            homeSecondTabView.c();
            return null;
        } else if (hashCode == -336807415) {
            return super.a();
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/component/HomeSecondTabView");
        }
    }

    @Override // tb.t0b
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup != null && (viewGroup instanceof LiveHomeTabLayout)) {
            LiveHomeTabLayout liveHomeTabLayout = (LiveHomeTabLayout) viewGroup;
            this.e = liveHomeTabLayout;
            liveHomeTabLayout.addOnTabSelectedListener(new a());
            this.e.setOnTabClickListener(new b());
            this.e.setRightTopMarkListener(new c());
        }
        return super.a();
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62363124", new Object[]{this});
            return;
        }
        m("a2141.8001240.topbar.FollowTabCorner");
        p9m.c("FollowTabCorner", m("a2141.8001240.topbar.FollowTabCorner"));
    }

    public int j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8bb7959a", new Object[]{this, str})).intValue();
        }
        if (lrq.a(str) || this.f == null) {
            return -1;
        }
        for (int i = 0; i < ((ArrayList) this.f).size(); i++) {
            SecondTab secondTab = (SecondTab) ((ArrayList) this.f).get(i);
            if (!(secondTab == null || lrq.a(secondTab.subChannelType) || !str.equals(secondTab.subChannelType))) {
                return i;
            }
        }
        return -1;
    }

    public List<SecondTab> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c525f7d8", new Object[]{this});
        }
        return this.f;
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93c68c7a", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public final Map<String, String> m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("43de2332", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", str);
        b0h b0hVar = this.c;
        if (b0hVar != null) {
            hashMap.put("entryLiveSource", b0hVar.f);
            hashMap.put("entrySpm", this.c.g);
        }
        return hashMap;
    }

    public final void o(LiveHomeTabLayout.h hVar) {
        SecondTab k;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b3a152", new Object[]{this, hVar});
        } else if (hVar != null && (k = hVar.k()) != null && (jSONObject = k.clickMaidian) != null) {
            p9m.b(jSONObject.getString("name"), k.clickMaidian.getString("params"));
        }
    }

    public final void p(SecondTab secondTab) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("910f5a1a", new Object[]{this, secondTab});
        } else if (secondTab != null && (jSONObject = secondTab.showMaidian) != null) {
            p9m.f(jSONObject.getString("name"), secondTab.showMaidian.getString("params"));
        }
    }

    public void q(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8973fcba", new Object[]{this, dVar});
        } else {
            this.g = dVar;
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cad1c92d", new Object[]{this});
            return;
        }
        m("a2141.8001240.topbar.FollowTabCorner");
        p9m.g("Page_Taobaolive_Show-FollowTabCorner", m("a2141.8001240.topbar.FollowTabCorner"));
    }

    public void s(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf1df3d", new Object[]{this, jSONObject});
        } else {
            this.i = jSONObject;
        }
    }

    public void n(Object obj, boolean z) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8358cb4b", new Object[]{this, obj, new Boolean(z)});
            return;
        }
        this.j = z;
        if (obj instanceof FeedListResponse) {
            FeedListResponse feedListResponse = (FeedListResponse) obj;
            if (!(feedListResponse.getData() == null || feedListResponse.getData().tabData == null)) {
                this.f = new ArrayList();
                JSONObject jSONObject2 = feedListResponse.getData().tabData;
                JSONArray jSONArray = jSONObject2.getJSONArray("cardData");
                this.h = Integer.parseInt(jSONObject2.getString(CoreConstants.IN_PARAMS_SELECT_INDEX));
                if (jSONArray != null && jSONArray.size() > 0) {
                    for (int i = 0; i < jSONArray.size(); i++) {
                        SecondTab secondTab = (SecondTab) JSON.parseObject(JSON.toJSONString(jSONArray.getJSONObject(i)), SecondTab.class);
                        if (!z && !lrq.a(secondTab.subChannelType) && secondTab.subChannelType.equals("subChannelFollow") && (jSONObject = this.i) != null) {
                            secondTab.redPoint = jSONObject.getBoolean(UserModel.AvatarIcon.LIGHT_TYPE_RED_POINT).booleanValue();
                            secondTab.followLiveNum = this.i.getString("title");
                        }
                        ((ArrayList) this.f).add(secondTab);
                        if (!z) {
                            p(secondTab);
                        }
                    }
                }
                LiveHomeTabLayout liveHomeTabLayout = this.e;
                if (liveHomeTabLayout != null) {
                    liveHomeTabLayout.setTabData(this.f);
                }
            }
        }
    }
}
