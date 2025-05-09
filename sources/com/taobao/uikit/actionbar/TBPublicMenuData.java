package com.taobao.uikit.actionbar;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.SparseArray;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.model.PublicMenuItemProvider;
import com.taobao.uikit.actionbar.util.MenuLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBPublicMenuData {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBPublicMenuData";
    private static final SparseArray<String> sDefaultMenuUrls;
    public static final List<TBPublicMenuItem> sDefaultPublicMenus = new ArrayList();
    public static final List<TBPublicMenuItem> sDefaultExtraMenus = new ArrayList();
    public final List<TBPublicMenuItem> mCustomMenus = new ArrayList();
    public List<TBPublicMenuItem> mDefaultPublicMenus = new ArrayList();
    private final List<TBPublicMenuItem> mShareMenus = new ArrayList();
    private volatile boolean isInit = false;
    private String menuIdentifies = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class LocalizationChangeListener implements Localization.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(927989830);
            t2o.a(82837508);
        }

        private LocalizationChangeListener() {
        }

        @Override // com.alibaba.ability.localization.Localization.a
        public void onChange(Language language, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c58b74d", new Object[]{this, language, str});
            } else {
                TBPublicMenuData.access$100();
            }
        }
    }

    static {
        t2o.a(927989828);
        SparseArray<String> sparseArray = new SparseArray<>();
        sDefaultMenuUrls = sparseArray;
        sparseArray.put(R.id.uik_menu_wangxin, "http://m.taobao.com/go/msgcentercategory");
        sparseArray.put(R.id.uik_menu_service, "https://ai.alimebot.taobao.com/intl/index.htm?from=ggxyKH67aq&amp;sourceType=SUPERME");
        sparseArray.put(R.id.uik_menu_home, "http://m.taobao.com/index.htm");
        sparseArray.put(R.id.uik_menu_mytaobao, "https://h5.m.taobao.com/awp/mtb/mtb.htm");
        sparseArray.put(R.id.uit_menu_shopping_cart, "https://main.m.taobao.com/cart/index.html?hasback=true");
        sparseArray.put(R.id.uik_menu_footpoint, "https://web.m.taobao.com/app/message-social-front/footprint/home?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_statusbar_hidden=true");
        sparseArray.put(R.id.uik_menu_feedback, "https://market.m.taobao.com/app/motu/emas-mpop-tucaobar/web/index.html#/?x=1");
        sparseArray.put(R.id.uik_menu_report, "https://market.m.taobao.com/app/msd/buyer-aqcenter/index.html?source=271#/report-center/");
        initMenuItems();
    }

    public static /* synthetic */ void access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bc42b8", new Object[0]);
        } else {
            initMenuItems();
        }
    }

    private static void initMenuItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f7b678", new Object[0]);
            return;
        }
        List<TBPublicMenuItem> list = sDefaultPublicMenus;
        list.clear();
        List<TBPublicMenuItem> list2 = sDefaultExtraMenus;
        list2.clear();
        TBPublicMenuItem provide = PublicMenuItemProvider.provide(R.id.uik_menu_wangxin);
        if (provide != null) {
            list.add(provide);
        }
        TBPublicMenuItem provide2 = PublicMenuItemProvider.provide(R.id.uik_menu_home);
        if (provide2 != null) {
            list.add(provide2);
        }
        TBPublicMenuItem provide3 = PublicMenuItemProvider.provide(R.id.uik_menu_mytaobao);
        if (provide3 != null) {
            list.add(provide3);
        }
        TBPublicMenuItem provide4 = PublicMenuItemProvider.provide(R.id.uit_menu_shopping_cart);
        if (provide3 != null) {
            list.add(provide4);
        }
        TBPublicMenuItem provide5 = PublicMenuItemProvider.provide(R.id.uik_menu_orderList);
        if (provide5 != null) {
            list.add(provide5);
        }
        TBPublicMenuItem provide6 = PublicMenuItemProvider.provide(R.id.uik_menu_footpoint);
        if (provide6 != null) {
            list.add(provide6);
        }
        int i = R.id.uik_menu_service;
        TBPublicMenuItem provide7 = PublicMenuItemProvider.provide(i);
        if (provide7 != null) {
            provide7.setNavUrl(sDefaultMenuUrls.get(i));
            list2.add(provide7);
        }
        int i2 = R.id.uik_menu_feedback;
        TBPublicMenuItem provide8 = PublicMenuItemProvider.provide(i2);
        if (provide8 != null) {
            provide8.setNavUrl(sDefaultMenuUrls.get(i2));
            list2.add(provide8);
        }
        int i3 = R.id.uik_menu_report;
        TBPublicMenuItem provide9 = PublicMenuItemProvider.provide(i3);
        if (provide9 != null) {
            provide9.setNavUrl(sDefaultMenuUrls.get(i3));
            list2.add(provide9);
        }
    }

    private void try2SetItemUrl(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e8ef50", new Object[]{this, context, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            TBPublicMenuItem extraMenuUikitItemById = getExtraMenuUikitItemById(i);
            if (extraMenuUikitItemById != null) {
                extraMenuUikitItemById.setNavUrl(context.getString(i2));
            } else {
                MenuLog.block(TAG, "item is null");
            }
        } catch (Resources.NotFoundException unused) {
            MenuLog.block(TAG, "Can't get string in this context.");
        }
    }

    public void addCustomMenu(TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57ae786e", new Object[]{this, tBPublicMenuItem});
        } else {
            this.mCustomMenus.add(tBPublicMenuItem);
        }
    }

    public void addCustomMenus(List<TBPublicMenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a1491a", new Object[]{this, list});
        } else {
            this.mCustomMenus.addAll(list);
        }
    }

    public void addShareMenus(List<TBPublicMenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25a064e", new Object[]{this, list});
            return;
        }
        for (TBPublicMenuItem tBPublicMenuItem : list) {
            if (tBPublicMenuItem != null) {
                tBPublicMenuItem.mType = 2;
            }
        }
        this.mShareMenus.addAll(list);
    }

    public void addShowItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("538dce8b", new Object[]{this, new Integer(i)});
        }
    }

    public void cleanExternMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96ffc32", new Object[]{this});
        } else {
            this.mCustomMenus.clear();
        }
    }

    public void cleanShareMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34af0b05", new Object[]{this});
        } else {
            this.mShareMenus.clear();
        }
    }

    public void clearExternalCustomiseItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73be1755", new Object[]{this});
            return;
        }
        Iterator<TBPublicMenuItem> it = this.mCustomMenus.iterator();
        while (it.hasNext()) {
            TBPublicMenuItem next = it.next();
            if (next != null && !next.isAddByUikit()) {
                it.remove();
            }
        }
    }

    public List<TBPublicMenuItem> getCustomMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6eb198f3", new Object[]{this});
        }
        return this.mCustomMenus;
    }

    public List<TBPublicMenuItem> getDefaultPublicMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c1f6efe0", new Object[]{this});
        }
        return this.mDefaultPublicMenus;
    }

    public TBPublicMenuItem getExtraAndCustomizeMenuById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("1a8b3a3b", new Object[]{this, new Integer(i)});
        }
        TBPublicMenuItem extraMenuUikitItemById = getExtraMenuUikitItemById(i);
        if (extraMenuUikitItemById != null) {
            return extraMenuUikitItemById;
        }
        return getItemFromListById(this.mCustomMenus, i);
    }

    public TBPublicMenuItem getExtraMenuByType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("664d7a91", new Object[]{this, str});
        }
        for (TBPublicMenuItem tBPublicMenuItem : sDefaultExtraMenus) {
            if (tBPublicMenuItem != null && TextUtils.equals(tBPublicMenuItem.getName(), str)) {
                return tBPublicMenuItem;
            }
        }
        return null;
    }

    public TBPublicMenuItem getExtraMenuUikitItemById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("5bf7c5a4", new Object[]{this, new Integer(i)});
        }
        return getItemFromListById(sDefaultExtraMenus, i);
    }

    public TBPublicMenuItem getItemFromListById(List<TBPublicMenuItem> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("51465c7e", new Object[]{this, list, new Integer(i)});
        }
        for (TBPublicMenuItem tBPublicMenuItem : list) {
            if (tBPublicMenuItem != null && tBPublicMenuItem.getId() == i) {
                return tBPublicMenuItem;
            }
        }
        return null;
    }

    public String getMenuIdentifies() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("216deffa", new Object[]{this});
        }
        return this.menuIdentifies;
    }

    public TBPublicMenuItem getPublicMenu(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("f37b4d54", new Object[]{this, new Integer(i)});
        }
        return getItemFromListById(this.mDefaultPublicMenus, i);
    }

    public List<TBPublicMenuItem> getShareMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("921c3ab5", new Object[]{this});
        }
        return this.mShareMenus;
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (!this.isInit) {
            resetDefaultMenus();
            initExternalMenu(context);
            Localization.a(new LocalizationChangeListener());
            this.isInit = true;
        }
    }

    public void initExternalMenu(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("786f4667", new Object[]{this, context});
            return;
        }
        try2SetItemUrl(context, R.id.uik_menu_service, R.string.zh_helper_url);
        try2SetItemUrl(context, R.id.uik_menu_feedback, R.string.appcompat_feedback_url);
        try2SetItemUrl(context, R.id.uik_menu_report, R.string.uik_menu_report_url_online_new);
    }

    public void removeExtraMenuItemByType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("263c4a40", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            Iterator<TBPublicMenuItem> it = this.mCustomMenus.iterator();
            while (it.hasNext()) {
                TBPublicMenuItem next = it.next();
                if (str.equals(next.getName()) && next.isAddByUikit()) {
                    it.remove();
                }
            }
        }
    }

    public void resetCustomMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0edd7bb", new Object[]{this});
        } else {
            this.mCustomMenus.addAll(sDefaultExtraMenus);
        }
    }

    public void resetDefaultMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cb927a9", new Object[]{this});
        } else {
            this.mDefaultPublicMenus = sDefaultPublicMenus;
        }
    }

    public void resetDefaultMenusUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa683f4", new Object[]{this});
            return;
        }
        for (TBPublicMenuItem tBPublicMenuItem : this.mDefaultPublicMenus) {
            String str = sDefaultMenuUrls.get(tBPublicMenuItem.getId());
            if (!TextUtils.isEmpty(str)) {
                tBPublicMenuItem.setNavUrl(str);
            }
        }
    }

    public void setMenuIdentifies() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea93f72", new Object[]{this});
        } else {
            this.menuIdentifies = String.valueOf(System.currentTimeMillis());
        }
    }

    public void setShareItem(TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e8f08ef", new Object[]{this, tBPublicMenuItem});
        }
    }

    public void setMenuIdentifies(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d1c30bc", new Object[]{this, str});
        } else {
            this.menuIdentifies = str;
        }
    }
}
