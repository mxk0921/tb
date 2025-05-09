package com.taobao.android.layoutmanager.module;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.ShareContentCallBack;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareBusinessListener;
import com.ut.share.business.ShareContent;
import com.ut.share.business.ShareTargetType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.nwv;
import tb.oj8;
import tb.rb;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ShareModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ShareModule";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements ShareBusinessListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.j f8218a;

        public a(d.j jVar) {
            this.f8218a = jVar;
        }

        @Override // com.ut.share.business.ShareBusinessListener
        public void onFinished(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff43b50d", new Object[]{this, map});
                return;
            }
            d.j jVar = this.f8218a;
            d.k kVar = jVar.c;
            if (kVar != null) {
                kVar.a(jVar, map);
            }
        }

        @Override // com.ut.share.business.ShareBusinessListener
        public void onShare(ShareContent shareContent, ShareTargetType shareTargetType) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a481375", new Object[]{this, shareContent, shareTargetType});
                return;
            }
            d.j jVar = this.f8218a;
            d.k kVar = jVar.c;
            if (kVar != null) {
                if (shareTargetType != null) {
                    str = shareTargetType.toString();
                } else {
                    str = "";
                }
                kVar.a(jVar, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements ShareBusinessListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.j f8219a;

        public b(d.j jVar) {
            this.f8219a = jVar;
        }

        @Override // com.ut.share.business.ShareBusinessListener
        public void onFinished(Map<String, String> map) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff43b50d", new Object[]{this, map});
            } else if (this.f8219a.c != null) {
                HashMap hashMap = new HashMap();
                String str3 = map != null ? map.get(rb.RESULT_KEY) : null;
                if (TextUtils.equals(str3, "success")) {
                    str = "target_success";
                } else if (TextUtils.equals(str3, "fail")) {
                    if (map != null) {
                        str2 = map.get("errorMessage");
                    } else {
                        str2 = "";
                    }
                    hashMap.put("msg", str2);
                    str = "target_failed";
                } else if (TextUtils.equals(str3, "cancel")) {
                    str = "target_canceled";
                } else {
                    str = "close";
                    if (!TextUtils.equals(str3, str)) {
                        str = "unknown";
                    }
                }
                hashMap.put("type", str);
                d.j jVar = this.f8219a;
                jVar.c.a(jVar, hashMap);
            }
        }

        @Override // com.ut.share.business.ShareBusinessListener
        public void onShare(ShareContent shareContent, ShareTargetType shareTargetType) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a481375", new Object[]{this, shareContent, shareTargetType});
            } else if (this.f8219a.c != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", "target_click");
                if (shareTargetType != null) {
                    str = shareTargetType.toString();
                } else {
                    str = "";
                }
                hashMap.put("data", str);
                d.j jVar = this.f8219a;
                jVar.c.a(jVar, hashMap);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements ShareContentCallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareContent f8220a;

        public c(ShareContent shareContent) {
            this.f8220a = shareContent;
        }

        @Override // com.taobao.uikit.actionbar.ShareContentCallBack
        public Object getQueryShareParameters() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("febe4434", new Object[]{this});
            }
            return this.f8220a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d implements ITBPublicMenu {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f8221a;
        public final /* synthetic */ TBPublicMenu b;

        public d(JSONObject jSONObject, TBPublicMenu tBPublicMenu) {
            this.f8221a = jSONObject;
            this.b = tBPublicMenu;
        }

        @Override // com.taobao.uikit.actionbar.ITBPublicMenu
        public TBPublicMenu getPublicMenu() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this});
            }
            return this.b;
        }

        @Override // com.taobao.uikit.actionbar.ITBPublicMenu
        public Bundle pageUserInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
            }
            return ShareModule.access$000(this.f8221a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class f implements TBPublicMenu.TBOnMenuShowedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.j f8223a;

        public f(d.j jVar) {
            this.f8223a = jVar;
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnMenuShowedListener
        public void onMenuShowed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91fdc161", new Object[]{this});
            } else if (this.f8223a.c != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "type", "onShow");
                d.j jVar = this.f8223a;
                jVar.c.a(jVar, jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class g implements TBPublicMenu.TBOnMenuHidedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.j f8224a;
        public final /* synthetic */ TBPublicMenu b;

        public g(d.j jVar, TBPublicMenu tBPublicMenu) {
            this.f8224a = jVar;
            this.b = tBPublicMenu;
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnMenuHidedListener
        public void onMenuHided() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("143e58ab", new Object[]{this});
                return;
            }
            if (this.f8224a.c != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "type", "onHide");
                d.j jVar = this.f8224a;
                jVar.c.a(jVar, jSONObject);
            }
            this.b.clearExternalMenus();
        }
    }

    static {
        t2o.a(502268139);
        t2o.a(503316559);
    }

    public static /* synthetic */ Bundle access$000(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("352416dd", new Object[]{jSONObject});
        }
        return generateReportBundle(jSONObject);
    }

    private static Bundle generateReportBundle(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("bbef1682", new Object[]{jSONObject});
        }
        Bundle bundle = new Bundle();
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONObject) {
                bundle.putBundle(str, generateReportBundle((JSONObject) obj));
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else {
                bundle.putString(str, String.valueOf(obj));
            }
        }
        return bundle;
    }

    private static TBPublicMenu getPublicMenu(d.j jVar) {
        TBPublicMenu tBPublicMenu;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenu) ipChange.ipc$dispatch("4ac49857", new Object[]{jVar});
        }
        Context c2 = jVar.c();
        if (c2 instanceof ITBPublicMenu) {
            tBPublicMenu = ((ITBPublicMenu) c2).getPublicMenu();
        } else {
            tBPublicMenu = null;
        }
        if (tBPublicMenu != null) {
            return tBPublicMenu;
        }
        View rootView = getRootView(jVar);
        if (rootView == null) {
            return null;
        }
        Object tag = rootView.getTag(R.id.share_module_show_more_menu_tag);
        if (tag instanceof TBPublicMenu) {
            return (TBPublicMenu) tag;
        }
        return null;
    }

    private static View getRootView(d.j jVar) {
        o oVar;
        n d0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2e5d2991", new Object[]{jVar});
        }
        if (jVar == null || (oVar = jVar.f11976a) == null || (d0 = oVar.d0()) == null) {
            return null;
        }
        return d0.w0();
    }

    private static ShareContent getShareContent(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("5aa0d335", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("title");
        String string2 = jSONObject.getString("businessId");
        String string3 = jSONObject.getString("contentType");
        String string4 = jSONObject.getString("desc");
        if (TextUtils.isEmpty(string4)) {
            string4 = jSONObject.getString("description");
        }
        if (TextUtils.isEmpty(string4)) {
            string4 = jSONObject.getString("text");
        }
        String string5 = jSONObject.getString("url");
        String string6 = jSONObject.getString("templateId");
        String string7 = jSONObject.getString("image");
        String string8 = jSONObject.getString("shareScene");
        JSONObject jSONObject2 = jSONObject.getJSONObject("templateParams");
        JSONObject jSONObject3 = jSONObject.getJSONObject("extendParams");
        ShareContent shareContent = new ShareContent();
        shareContent.shareScene = string8;
        shareContent.title = string;
        shareContent.imageUrl = string7;
        shareContent.businessId = string2;
        shareContent.description = string4;
        shareContent.contentType = string3;
        shareContent.url = string5;
        shareContent.extendParams = nwv.c(jSONObject3);
        shareContent.templateId = string6;
        shareContent.templateParams = jSONObject2;
        return shareContent;
    }

    public static void reloadMore(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a3bfbe", new Object[]{jVar});
            return;
        }
        JSONObject jSONObject = (JSONObject) jVar.b;
        if (jSONObject == null) {
            tfs.e(TAG, "reloadMore args==null");
            return;
        }
        View rootView = getRootView(jVar);
        if (rootView == null) {
            tfs.e(TAG, "reloadMore rootView==null");
            return;
        }
        Object tag = rootView.getTag(R.id.share_module_show_more_menu_list_tag);
        if (!(tag instanceof ArrayList)) {
            tfs.e(TAG, "reloadMore tag ! instanceof ArrayList");
            return;
        }
        int intValue = jSONObject.getInteger("index").intValue();
        if (intValue >= 0) {
            ArrayList arrayList = (ArrayList) tag;
            if (intValue < arrayList.size()) {
                Object obj = arrayList.get(intValue);
                if (!(obj instanceof TBPublicMenuItem)) {
                    tfs.e(TAG, "reloadMore o ! instanceof TBPublicMenuItem");
                    return;
                }
                TBPublicMenuItem tBPublicMenuItem = (TBPublicMenuItem) obj;
                String string = jSONObject.getString("iconFontName");
                String string2 = jSONObject.getString("title");
                tBPublicMenuItem.setTitle(string + ":" + string2);
                tBPublicMenuItem.update();
                return;
            }
        }
        tfs.e(TAG, "reloadMore index error index=" + intValue);
    }

    public static void share(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7919e18d", new Object[]{jVar});
        } else {
            ShareBusiness.share((Activity) jVar.c(), getShareContent((JSONObject) jVar.b), new a(jVar));
        }
    }

    public static void shareWithCallback(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbd19722", new Object[]{jVar});
        } else {
            ShareBusiness.share((Activity) jVar.c(), getShareContent((JSONObject) jVar.b), new b(jVar));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e implements TBPublicMenu.TBOnPublicMenuClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.j f8222a;

        public e(d.j jVar) {
            this.f8222a = jVar;
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
        public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
            } else if (this.f8222a.c != null && tBPublicMenuItem != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "type", "onItemClick");
                jSONObject.put((JSONObject) "id", (String) Integer.valueOf(tBPublicMenuItem.getId()));
                String title = tBPublicMenuItem.getTitle();
                if (title != null && title.contains(":")) {
                    String[] split = title.split(":");
                    jSONObject.put((JSONObject) "iconFontName", split[0]);
                    jSONObject.put((JSONObject) "title", split[1]);
                }
                d.j jVar = this.f8222a;
                jVar.c.a(jVar, jSONObject);
            }
        }
    }

    public static void showMore(d.j jVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9f30da", new Object[]{jVar});
        } else if (jVar != null && (jSONObject = (JSONObject) jVar.b) != null) {
            View rootView = getRootView(jVar);
            TBPublicMenu publicMenu = getPublicMenu(jVar);
            if (publicMenu == null) {
                Context c2 = jVar.c();
                if (c2 instanceof Activity) {
                    TBPublicMenu tBPublicMenu = new TBPublicMenu((Activity) c2);
                    if (rootView != null) {
                        rootView.setTag(R.id.share_module_show_more_menu_tag, tBPublicMenu);
                    }
                    publicMenu = tBPublicMenu;
                } else {
                    return;
                }
            }
            ShareContent shareContent = getShareContent(jSONObject.getJSONObject(oj8.SHARE_CONTENT_KEY));
            if (shareContent == null || shareContent.businessId == null) {
                publicMenu.setShareContentCallBack(null);
            } else {
                publicMenu.setShareContentCallBack(new c(shareContent));
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("reportArgs");
            if (jSONObject2 != null) {
                publicMenu.setReportArguments(new d(jSONObject2, publicMenu));
            } else {
                publicMenu.setReportArguments(null);
            }
            publicMenu.clearExternalMenus();
            ArrayList<TBPublicMenuItem> arrayList = new ArrayList<>();
            JSONArray jSONArray = jSONObject.getJSONArray("menuList");
            for (int i = 0; jSONArray != null && i < jSONArray.size(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                int intValue = jSONObject3.getIntValue("id");
                String string = jSONObject3.getString("iconFontName");
                String string2 = jSONObject3.getString("title");
                Boolean bool = jSONObject3.getBoolean("closeAfterClick");
                TBPublicMenuItem.Builder builder = new TBPublicMenuItem.Builder();
                TBPublicMenuItem.Builder id = builder.setId(intValue);
                id.setTitle(string + ":" + string2);
                if (bool == null || bool.booleanValue()) {
                    builder.setMenuNeedtoBeClosedAfterItemClicked(true);
                } else {
                    builder.setMenuNeedtoBeClosedAfterItemClicked(false);
                }
                arrayList.add(builder.build());
            }
            if (rootView != null) {
                rootView.setTag(R.id.share_module_show_more_menu_list_tag, arrayList);
            }
            publicMenu.addExternalMenus(arrayList, new e(jVar));
            publicMenu.setOnMenuShowedListener(new f(jVar));
            publicMenu.setOnMenuHidedListener(new g(jVar, publicMenu));
            publicMenu.show();
        }
    }
}
