package com.taobao.uikit.actionbar;

import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.util.Tools;
import com.taobao.weex.common.Constants;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.c2v;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UTWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int suffix = 0;
    public static boolean closeByButton = false;

    static {
        t2o.a(927989837);
    }

    public static int getItemIndex(TBPublicMenuItem tBPublicMenuItem, TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79ad8a16", new Object[]{tBPublicMenuItem, tBPublicMenu})).intValue();
        }
        PublicMenuPresenter presenter = tBPublicMenu.getPresenter();
        List<TBPublicMenuItem> defaultPublicMenus = presenter.getMenuData().getDefaultPublicMenus();
        for (int i = 0; i < defaultPublicMenus.size(); i++) {
            if (tBPublicMenuItem == defaultPublicMenus.get(i)) {
                return i;
            }
        }
        ArrayList arrayList = new ArrayList(presenter.getMenuData().getCustomMenus());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TBPublicMenuItem tBPublicMenuItem2 = (TBPublicMenuItem) it.next();
            if (Localization.q(R.string.app_share).equals(Tools.subTitle(tBPublicMenuItem2.getTitle())) || Localization.q(R.string.taobao_app_1012_1_16460).equals(Tools.subTitle(tBPublicMenuItem2.getTitle()))) {
                it.remove();
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (tBPublicMenuItem == arrayList.get(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private static int getSuffix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9fd62341", new Object[0])).intValue();
        }
        int i = suffix;
        if (i < Integer.MAX_VALUE) {
            suffix = i + 1;
            return i;
        }
        suffix = 0;
        return 0;
    }

    private static UTHitBuilders$UTControlHitBuilder getUtControlHitBuilder(int i, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTHitBuilders$UTControlHitBuilder) ipChange.ipc$dispatch("87991cef", new Object[]{new Integer(i), str});
        }
        if (i == 0) {
            str2 = "Button-More-Item-Click-Share";
        } else if (i != 2) {
            str2 = "Button-More-Item-Click";
        } else {
            str2 = "Button-More-Item-Click-Custom";
        }
        return new UTHitBuilders$UTControlHitBuilder(str, str2);
    }

    public static void itemClick(TBPublicMenuItem tBPublicMenuItem, TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce94a68f", new Object[]{tBPublicMenuItem, tBPublicMenu});
        } else {
            itemClick(tBPublicMenuItem, tBPublicMenu, 1);
        }
    }

    public static void menuDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70fcb332", new Object[0]);
        } else if (closeByButton) {
            closeByButton = false;
        } else {
            String currentPageName = c2v.getInstance().getCurrentPageName();
            if (currentPageName != null) {
                UTAnalytics.getInstance().getDefaultTracker().send(new UTHitBuilders$UTControlHitBuilder(currentPageName, "Button-More-Close").build());
            }
        }
    }

    public static void overflowClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61eb142d", new Object[0]);
            return;
        }
        String currentPageName = c2v.getInstance().getCurrentPageName();
        if (currentPageName != null) {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTHitBuilders$UTControlHitBuilder(currentPageName, "Button-More").build());
        }
    }

    public static void shareItemExposure(final List<TBPublicMenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f387f3b1", new Object[]{list});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.uikit.actionbar.UTWrapper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JSONArray jSONArray = new JSONArray();
                    List<TBPublicMenuItem> list2 = list;
                    if (list2 != null) {
                        for (TBPublicMenuItem tBPublicMenuItem : list2) {
                            if (tBPublicMenuItem != null) {
                                String subTitle = Tools.subTitle(tBPublicMenuItem.mTitle);
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("title", (Object) subTitle);
                                jSONObject.put("index", (Object) Integer.valueOf(tBPublicMenuItem.getOrder()));
                                jSONArray.add(jSONObject);
                            }
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("popoverItem", jSONArray.toJSONString());
                        hashMap.put("is_NEW", "true");
                        String currentPageName = c2v.getInstance().getCurrentPageName();
                        if (currentPageName != null) {
                            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(currentPageName, 2201, "MorePopoverExposureShare", null, null, hashMap).build());
                        }
                    }
                }
            });
        }
    }

    public static void itemClick(TBPublicMenuItem tBPublicMenuItem, TBPublicMenu tBPublicMenu, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4009e54", new Object[]{tBPublicMenuItem, tBPublicMenu, new Integer(i)});
        } else {
            itemClick(Tools.subTitle(tBPublicMenuItem.getTitle()), getItemIndex(tBPublicMenuItem, tBPublicMenu), i);
        }
    }

    public static void newMenuExposure(TBPublicMenuData tBPublicMenuData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd66fc2", new Object[]{tBPublicMenuData});
        } else if (tBPublicMenuData != null) {
            JSONArray jSONArray = new JSONArray();
            List<TBPublicMenuItem> defaultPublicMenus = tBPublicMenuData.getDefaultPublicMenus();
            if (defaultPublicMenus != null) {
                int size = defaultPublicMenus.size();
                for (int i = 0; i < size; i++) {
                    String subTitle = Tools.subTitle(defaultPublicMenus.get(i).mTitle);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("title", (Object) subTitle);
                    jSONObject.put("index", (Object) Integer.valueOf(i));
                    jSONArray.add(jSONObject);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("popoverItem", jSONArray.toJSONString());
                hashMap.put("is_NEW", "true");
                String currentPageName = c2v.getInstance().getCurrentPageName();
                if (currentPageName != null) {
                    UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(currentPageName, 2201, "MorePopoverExposure", null, null, hashMap).build());
                }
                JSONArray jSONArray2 = new JSONArray();
                ArrayList arrayList = new ArrayList(tBPublicMenuData.getCustomMenus());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    TBPublicMenuItem tBPublicMenuItem = (TBPublicMenuItem) it.next();
                    if (Localization.q(R.string.app_share).equals(Tools.subTitle(tBPublicMenuItem.getTitle())) || Localization.q(R.string.taobao_app_1012_1_16460).equals(Tools.subTitle(tBPublicMenuItem.getTitle()))) {
                        it.remove();
                    }
                }
                if (!arrayList.isEmpty()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        String subTitle2 = Tools.subTitle(((TBPublicMenuItem) arrayList.get(i2)).getTitle());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("title", (Object) subTitle2);
                        jSONObject2.put("index", (Object) Integer.valueOf(i2));
                        jSONArray2.add(jSONObject2);
                    }
                    if (!jSONArray2.isEmpty()) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("popoverItem", jSONArray2.toJSONString());
                        hashMap2.put(Constants.Name.SUFFIX, String.valueOf(getSuffix()));
                        hashMap2.put("is_NEW", "true");
                        if (currentPageName != null) {
                            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(currentPageName, 2201, "MorePopoverExposureCustom", null, null, hashMap2).build());
                        }
                    }
                }
            }
        }
    }

    public static void itemClick(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4d79e6", new Object[]{str, new Integer(i), new Integer(i2)});
            return;
        }
        String currentPageName = c2v.getInstance().getCurrentPageName();
        if (currentPageName != null) {
            UTHitBuilders$UTControlHitBuilder utControlHitBuilder = getUtControlHitBuilder(i2, currentPageName);
            utControlHitBuilder.setProperty("title", str);
            utControlHitBuilder.setProperty("index", String.valueOf(i));
            UTAnalytics.getInstance().getDefaultTracker().send(utControlHitBuilder.build());
        }
    }
}
