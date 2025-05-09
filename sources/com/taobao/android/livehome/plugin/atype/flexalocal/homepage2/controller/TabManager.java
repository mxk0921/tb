package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller;

import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.android.ultron.vfw.weex2.module.UltronWeex2PrefetchCacheModule;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.BaseDetailBusiness;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.business.RankTabRequest;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.business.TabMenuRequest;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.b0h;
import tb.fkx;
import tb.j5h;
import tb.lrq;
import tb.lws;
import tb.mbu;
import tb.nvs;
import tb.owg;
import tb.qyg;
import tb.r0h;
import tb.t2o;
import tb.xut;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TabManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String d = TabManager.class.getSimpleName();
    public static TabManager e = null;

    /* renamed from: a  reason: collision with root package name */
    public List<TabBottom> f8810a;
    public List<TabMarketing> b;
    public boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class JSONDataNew implements IMTOPDataObject {
        public JSONTabNew data;

        static {
            t2o.a(310378639);
            t2o.a(589299906);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class JSONTabNew implements IMTOPDataObject {
        public List<TabBottom> bottomTab;
        public boolean hideBottomNavigation;
        public List<TabMarketing> marketingTab;
        public boolean openRankTabPersonalization;

        static {
            t2o.a(310378640);
            t2o.a(589299906);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class RightTopEntryInfo implements IMTOPDataObject, Serializable {
        public String iconUrl;
        public String isOpen;
        public String jumpUrl;

        static {
            t2o.a(310378641);
            t2o.a(589299906);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class TabBottom implements IMTOPDataObject, Serializable {
        public String androidNormalColor;
        public String androidNormalIcon;
        public String androidPressedColor;
        public String androidPressedIcon;
        public String androidTopReturnButton;
        public String androidTopReturnText;
        public int channelId;
        public String channelType;
        public boolean containerToBottom;
        public boolean containerToTop;
        public boolean hideTextOnPressed;
        public boolean isSelected;
        public boolean jumpOut;
        public String jumpUrl;
        public String layoutBackgroundColor;
        public String name;
        public String pageName;
        public String pageType;
        public boolean rightBottomEntryShow;
        public RightTopEntryInfo rightTopEntry;
        public String sjsdIcon;
        public String spm;
        public JSONObject subscriptInfo;
        public JSONObject tabPic;
        public JSONObject tabUT;
        public List<TabUp> topTab;

        static {
            t2o.a(310378642);
            t2o.a(589299906);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TabBottom tabBottom = (TabBottom) obj;
            if (this.channelId != tabBottom.channelId || this.hideTextOnPressed != tabBottom.hideTextOnPressed || this.rightBottomEntryShow != tabBottom.rightBottomEntryShow || this.containerToTop != tabBottom.containerToTop || this.containerToBottom != tabBottom.containerToBottom || this.jumpOut != tabBottom.jumpOut || !j5h.a(this.channelType, tabBottom.channelType) || !j5h.a(this.name, tabBottom.name) || !j5h.a(this.androidNormalIcon, tabBottom.androidNormalIcon) || !j5h.a(this.androidPressedIcon, tabBottom.androidPressedIcon) || !j5h.a(this.androidTopReturnButton, tabBottom.androidTopReturnButton) || !j5h.a(this.androidTopReturnText, tabBottom.androidTopReturnText) || !j5h.a(this.androidNormalColor, tabBottom.androidNormalColor) || !j5h.a(this.androidPressedColor, tabBottom.androidPressedColor) || !j5h.a(this.topTab, tabBottom.topTab) || !j5h.a(this.rightTopEntry, tabBottom.rightTopEntry) || !j5h.a(this.pageType, tabBottom.pageType) || !j5h.a(this.spm, tabBottom.spm) || !j5h.a(this.pageName, tabBottom.pageName) || !j5h.a(this.layoutBackgroundColor, tabBottom.layoutBackgroundColor) || !j5h.a(this.jumpUrl, tabBottom.jumpUrl) || !j5h.a(this.tabPic, tabBottom.tabPic) || !j5h.a(this.subscriptInfo, tabBottom.subscriptInfo)) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class TabMarketing implements IMTOPDataObject {
        public String androidBackGroundPic;
        public String androidSelectedGroundPic;
        public String endTime;
        public boolean hideNaviBarBG;
        public boolean jumpOut;
        public String jumpUrl;
        public String startTime;
        public JSONObject tabUT;

        static {
            t2o.a(310378644);
            t2o.a(589299906);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TabMarketing tabMarketing = (TabMarketing) obj;
            if (!j5h.a(this.androidBackGroundPic, tabMarketing.androidBackGroundPic) || !j5h.a(this.jumpUrl, tabMarketing.jumpUrl) || !j5h.a(this.androidSelectedGroundPic, tabMarketing.androidSelectedGroundPic) || !j5h.a(Boolean.valueOf(this.hideNaviBarBG), Boolean.valueOf(tabMarketing.hideNaviBarBG)) || !j5h.a(Boolean.valueOf(this.jumpOut), Boolean.valueOf(tabMarketing.jumpOut)) || !j5h.a(this.startTime, tabMarketing.startTime) || !j5h.a(this.endTime, tabMarketing.endTime)) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class TabUp implements IMTOPDataObject, Serializable {
        public int channelId;
        public String channelType;
        public JSONObject container;
        public boolean containerToBottom;
        public boolean containerToTop;
        public String endTime;
        public boolean jumpOut;
        public String jumpUrl;
        public String layoutBackgroundColor;
        public String name;
        public String pageName;
        public String pageType;
        public String popLayer;
        public boolean rightBottomEntryShow;
        public boolean rightTopEntryShow;
        public JSONObject sjsdParam;
        public String spm;
        public JSONObject subscript;
        public String tabBubbleText;
        public JSONObject tabMiddle;
        public JSONObject tabPic;
        public JSONObject tabUT;
        public String zcache;

        static {
            t2o.a(310378645);
            t2o.a(589299906);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TabUp)) {
                return false;
            }
            TabUp tabUp = (TabUp) obj;
            if (this.channelId != tabUp.channelId || this.rightTopEntryShow != tabUp.rightTopEntryShow || this.rightBottomEntryShow != tabUp.rightBottomEntryShow || this.containerToTop != tabUp.containerToTop || this.containerToBottom != tabUp.containerToBottom || this.jumpOut != tabUp.jumpOut || !j5h.a(this.channelType, tabUp.channelType) || !j5h.a(this.name, tabUp.name) || !j5h.a(this.tabBubbleText, tabUp.tabBubbleText) || !j5h.a(this.pageType, tabUp.pageType) || !j5h.a(this.spm, tabUp.spm) || !j5h.a(this.pageName, tabUp.pageName) || !j5h.a(this.layoutBackgroundColor, tabUp.layoutBackgroundColor) || !j5h.a(this.jumpUrl, tabUp.jumpUrl) || !j5h.a(this.tabPic, tabUp.tabPic) || !j5h.a(this.endTime, tabUp.endTime) || !j5h.a(this.zcache, tabUp.zcache) || !j5h.a(this.tabUT, tabUp.tabUT) || !j5h.a(this.container, tabUp.container) || !j5h.a(this.tabMiddle, tabUp.tabMiddle) || !j5h.a(this.subscript, tabUp.subscript)) {
                return false;
            }
            return true;
        }
    }

    static {
        t2o.a(310378635);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return d;
    }

    public static /* synthetic */ JSONDataNew b(TabManager tabManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONDataNew) ipChange.ipc$dispatch("891ef5f4", new Object[]{tabManager, str});
        }
        return tabManager.r(str);
    }

    public static /* synthetic */ boolean c(TabManager tabManager, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("febeebca", new Object[]{tabManager, list})).booleanValue();
        }
        return tabManager.h(list);
    }

    public static /* synthetic */ List d(TabManager tabManager, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c24b6884", new Object[]{tabManager, list});
        }
        tabManager.b = list;
        return list;
    }

    public static /* synthetic */ TabUp e(TabManager tabManager, JSONDataNew jSONDataNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabUp) ipChange.ipc$dispatch("b8758ae3", new Object[]{tabManager, jSONDataNew});
        }
        return tabManager.k(jSONDataNew);
    }

    public static /* synthetic */ boolean f(TabManager tabManager, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e54bfe7", new Object[]{tabManager, list})).booleanValue();
        }
        return tabManager.p(list);
    }

    public static TabManager q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabManager) ipChange.ipc$dispatch("658cacfa", new Object[0]);
        }
        if (e == null) {
            e = new TabManager();
        }
        return e;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            e = null;
        }
    }

    public final boolean h(List<TabMarketing> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d7e05b0", new Object[]{this, list})).booleanValue();
        }
        List<TabMarketing> list2 = this.b;
        if (list2 == null && list != null) {
            return true;
        }
        if (!(list2 == null || list == null)) {
            if (list.size() != this.b.size()) {
                return true;
            }
            for (int i = 0; i < list.size(); i++) {
                if (!j5h.a(list.get(i), this.b.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<TabBottom> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("221bdfac", new Object[]{this});
        }
        if (!this.c) {
            return this.f8810a;
        }
        ArrayList arrayList = new ArrayList();
        List<TabBottom> list = this.f8810a;
        if (list == null || list.size() <= 0) {
            return arrayList;
        }
        arrayList.add(this.f8810a.get(0));
        return arrayList;
    }

    public TabUp j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabUp) ipChange.ipc$dispatch("3bc78107", new Object[]{this});
        }
        List<TabBottom> list = this.f8810a;
        if (list == null || list.size() <= 0 || this.f8810a.get(0) == null || this.f8810a.get(0).topTab == null || this.f8810a.get(0).topTab.size() <= 0) {
            return null;
        }
        int size = this.f8810a.get(0).topTab.size();
        for (int i = 0; i < size; i++) {
            if ("followTab".equals(this.f8810a.get(0).topTab.get(i).channelType)) {
                return this.f8810a.get(0).topTab.get(i);
            }
        }
        return null;
    }

    public final TabUp k(JSONDataNew jSONDataNew) {
        JSONTabNew jSONTabNew;
        List<TabBottom> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabUp) ipChange.ipc$dispatch("5dc17c41", new Object[]{this, jSONDataNew});
        }
        if (jSONDataNew == null || (jSONTabNew = jSONDataNew.data) == null || (list = jSONTabNew.bottomTab) == null || list.size() <= 0 || jSONDataNew.data.bottomTab.get(0).topTab == null) {
            return null;
        }
        int size = jSONDataNew.data.bottomTab.get(0).topTab.size();
        for (int i = 0; i < size; i++) {
            TabUp tabUp = jSONDataNew.data.bottomTab.get(0).topTab.get(i);
            if ("followTab".equals(tabUp.channelType)) {
                return tabUp;
            }
        }
        return null;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e65b9182", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public List<TabMarketing> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8df828bb", new Object[]{this});
        }
        return this.b;
    }

    public final boolean p(List<TabBottom> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7d3b22c", new Object[]{this, list})).booleanValue();
        }
        if (list == null) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).subscriptInfo != null) {
                return true;
            }
        }
        return false;
    }

    public final JSONDataNew r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONDataNew) ipChange.ipc$dispatch("6bca5802", new Object[]{this, str});
        }
        return (JSONDataNew) JSON.parseObject(str, JSONDataNew.class);
    }

    public void s(List<TabBottom> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e5d2aa0", new Object[]{this, list});
        } else {
            this.f8810a = list;
        }
    }

    public void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ee3a98a", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void u(TabUp tabUp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b5e17d7", new Object[]{this, tabUp});
            return;
        }
        List<TabBottom> list = this.f8810a;
        if (!(list == null || list.size() <= 0 || this.f8810a.get(0) == null || this.f8810a.get(0).topTab == null || this.f8810a.get(0).topTab.size() <= 0)) {
            int size = this.f8810a.get(0).topTab.size();
            for (int i = 0; i < size; i++) {
                if ("followTab".equals(tabUp.channelType)) {
                    this.f8810a.get(0).topTab.set(i, tabUp);
                    return;
                }
            }
        }
    }

    public void v(String str, Uri uri, b0h b0hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8acf5606", new Object[]{this, str, uri, b0hVar});
        } else {
            l(str, uri, b0hVar);
        }
    }

    public void o(String str, Uri uri, final b0h b0hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ac260b2", new Object[]{this, str, uri, b0hVar});
            return;
        }
        mbu.b("rankTab_request", b0hVar);
        BaseDetailBusiness baseDetailBusiness = new BaseDetailBusiness(new IRemoteBaseListener() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                String a2 = TabManager.a();
                StringBuilder sb = new StringBuilder("getFromNetwork onError. MTOP: ");
                if (mtopResponse != null) {
                    str2 = mtopResponse.toString();
                } else {
                    str2 = "null";
                }
                sb.append(str2);
                r0h.b(a2, sb.toString());
                mbu.b("rankTab_response", b0hVar);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                mbu.b("rankTab_response", b0hVar);
                if (mtopResponse != null && mtopResponse.getBytedata() != null) {
                    qyg.c().e("com.taobao.taolive.update.bottom.update.ranktab", fkx.d(new String(mtopResponse.getBytedata())));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                String a2 = TabManager.a();
                StringBuilder sb = new StringBuilder("tabMenu Mtop response fail,onSystemError. MTOP: ");
                if (mtopResponse != null) {
                    str2 = mtopResponse.toString();
                } else {
                    str2 = "null";
                }
                sb.append(str2);
                r0h.b(a2, sb.toString());
                mbu.b("rankTab_response", b0hVar);
            }
        });
        RankTabRequest rankTabRequest = new RankTabRequest(b0hVar.o);
        rankTabRequest.channelType = str;
        if (uri != null) {
            rankTabRequest.tabSpm = uri.getQueryParameter("tabSpm");
            rankTabRequest.liveHomePageType = uri.getQueryParameter("liveHomePageType");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("livesourcePre", (Object) uri.getQueryParameter("livesource"));
            jSONObject.put("launcherType", (Object) uri.getQueryParameter("launcherType"));
            jSONObject.put("entityId", (Object) uri.getQueryParameter("entityId"));
            jSONObject.put("isPad", (Object) Boolean.valueOf(b0hVar.w()));
            if (!(b0hVar.d() == null || b0hVar.d().getJSONObject("originalQuery") == null)) {
                jSONObject.put("contentId", (Object) b0hVar.d().getJSONObject("originalQuery").getString("contentId"));
            }
            if (!(b0hVar.d() == null || b0hVar.d().getJSONObject("extendParams") == null)) {
                jSONObject.put("queryParams", (Object) b0hVar.d().getJSONObject("extendParams").getJSONObject("queryParams"));
            }
            rankTabRequest.extendParams = jSONObject.toJSONString();
        }
        String str2 = d;
        r0h.d(str2, "tabMenu Mtop request start, requestInfo:" + rankTabRequest.toString());
        baseDetailBusiness.f(true);
        baseDetailBusiness.g(10, rankTabRequest, null);
        mbu.c("requestStart", "firstRequest", rankTabRequest.API_NAME, rankTabRequest.VERSION, b0hVar);
    }

    public final void l(String str, Uri uri, final b0h b0hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f282ccd", new Object[]{this, str, uri, b0hVar});
            return;
        }
        mbu.b("tabMenu_request", b0hVar);
        BaseDetailBusiness baseDetailBusiness = new BaseDetailBusiness(new IRemoteBaseListener() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager$1$a */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
            public class a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ MtopResponse f8811a;
                public final /* synthetic */ String b;
                public final /* synthetic */ JSONDataNew c;

                public a(MtopResponse mtopResponse, String str, JSONDataNew jSONDataNew) {
                    this.f8811a = mtopResponse;
                    this.b = str;
                    this.c = jSONDataNew;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("action", (Object) UltronWeex2PrefetchCacheModule.MODULE_NAME);
                    jSONObject.put("time", (Object) Long.valueOf(System.currentTimeMillis()));
                    jSONObject.put("requestType", (Object) "firstRequest");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("apiName", (Object) this.f8811a.getApi());
                    jSONObject2.put("apiVersion", (Object) this.f8811a.getV());
                    if (!(this.f8811a.getHeaderFields() == null || this.f8811a.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2) == null || this.f8811a.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2).size() <= 0)) {
                        jSONObject2.put("traceID", (Object) this.f8811a.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2).get(0));
                    }
                    jSONObject.put("traceInfo", (Object) jSONObject2);
                    owg.d("live_home_tabs_event", jSONObject.toJSONString());
                    owg.d("live_home_tabs", this.b);
                    if (nvs.O()) {
                        qyg.c().e("com.taobao.taolive.update.bottom.update", this.b);
                    }
                    if (nvs.l() && TabManager.f(TabManager.this, this.c.data.bottomTab)) {
                        qyg.c().e("com.taobao.taolive.update.tab.subscript", this.b);
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                String a2 = TabManager.a();
                StringBuilder sb = new StringBuilder("getFromNetwork onError. MTOP: ");
                if (mtopResponse != null) {
                    str2 = mtopResponse.toString();
                } else {
                    str2 = "null";
                }
                sb.append(str2);
                r0h.b(a2, sb.toString());
                mbu.d("requestError", "firstRequest", mtopResponse, b0hVar);
                mbu.b("tabMenu_response", b0hVar);
                qyg.c().e("com.taobao.taolive.tab.menu.response", null);
                if (nvs.O()) {
                    qyg.c().d("com.taobao.taolive.update.bottom.resfailed");
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                mbu.b("tabMenu_response", b0hVar);
                if (mtopResponse != null && mtopResponse.getBytedata() != null) {
                    String str2 = new String(mtopResponse.getBytedata());
                    if (!lrq.a(str2)) {
                        try {
                            JSONDataNew b = TabManager.b(TabManager.this, str2);
                            if (!(b == null || b.data == null)) {
                                qyg.c().d("com.taobao.taolive.menu.request.success");
                                if (TabManager.c(TabManager.this, b.data.marketingTab)) {
                                    TabManager.d(TabManager.this, b.data.marketingTab);
                                    qyg.c().d("com.taobao.taolive.marking.tab.update");
                                }
                                TabUp e2 = TabManager.e(TabManager.this, b);
                                if (e2 != null) {
                                    qyg.c().e("com.taobao.taolive.follow.number.changed", e2);
                                    qyg.c().e("com.taobao.taolive.main.follow.number.changed", e2.subscript);
                                }
                                String a2 = TabManager.a();
                                r0h.d(a2, "tabMenu Mtop response success,onSuccess:" + mtopResponse.getApi());
                                mbu.d("RequestSuccess", "firstRequest", mtopResponse, b0hVar);
                                AsyncTask.execute(new a(mtopResponse, str2, b));
                            }
                        } catch (Exception e3) {
                            r0h.c(TabManager.a(), "tabMenu Mtop response success, onSuccess exp", e3);
                        }
                    }
                    qyg.c().e("com.taobao.taolive.tab.menu.response", "success");
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                String a2 = TabManager.a();
                StringBuilder sb = new StringBuilder("tabMenu Mtop response fail,onSystemError. MTOP: ");
                if (mtopResponse != null) {
                    str2 = mtopResponse.toString();
                } else {
                    str2 = "null";
                }
                sb.append(str2);
                r0h.b(a2, sb.toString());
                mbu.d("requestError", "firstRequest", mtopResponse, b0hVar);
                mbu.b("tabMenu_response", b0hVar);
                qyg.c().e("com.taobao.taolive.tab.menu.response", null);
            }
        });
        TabMenuRequest tabMenuRequest = new TabMenuRequest(b0hVar.o);
        tabMenuRequest.enableAddH5Tab = nvs.i();
        tabMenuRequest.channelType = str;
        tabMenuRequest.singleStream = "false";
        if (uri != null) {
            tabMenuRequest.tabSpm = uri.getQueryParameter("tabSpm");
            tabMenuRequest.liveHomePageType = uri.getQueryParameter("liveHomePageType");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("livesourcePre", (Object) uri.getQueryParameter("livesource"));
            jSONObject.put("launcherType", (Object) uri.getQueryParameter("launcherType"));
            jSONObject.put("entityId", (Object) uri.getQueryParameter("entityId"));
            jSONObject.put("isPad", (Object) Boolean.valueOf(b0hVar.w()));
            tabMenuRequest.extendParams = jSONObject.toJSONString();
            String a2 = lws.a("taoliveFollowIconSjsdParam");
            if (!TextUtils.isEmpty(a2)) {
                JSONArray b = fkx.b(a2);
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < b.size(); i++) {
                    JSONObject jSONObject2 = b.getJSONObject(i);
                    if (xut.b(jSONObject2.getLongValue("cacheTime"))) {
                        jSONArray.add(jSONObject2);
                    }
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("sjsdParams", (Object) jSONArray);
                tabMenuRequest.recReasonClkList = jSONObject3.toJSONString();
            }
        }
        String str2 = d;
        r0h.d(str2, "tabMenu Mtop request start, requestInfo:" + tabMenuRequest.toString());
        baseDetailBusiness.f(true);
        baseDetailBusiness.g(10, tabMenuRequest, null);
        mbu.c("requestStart", "firstRequest", tabMenuRequest.API_NAME, tabMenuRequest.VERSION, b0hVar);
    }
}
