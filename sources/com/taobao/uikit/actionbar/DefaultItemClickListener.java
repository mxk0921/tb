package com.taobao.uikit.actionbar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.model.PageInfoModel;
import com.taobao.uikit.actionbar.util.MenuMonitor;
import com.taobao.uikit.actionbar.util.UrlUtil;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import org.json.JSONObject;
import tb.dbv;
import tb.jjx;
import tb.mop;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DefaultItemClickListener implements TBPublicMenu.TBOnPublicMenuClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final WeakReference<Activity> mActivityRef;
    public TBPublicMenu.MenuCallBack mCallBack;
    public final TBPublicMenu.TBOnPublicMenuClickListener mDefaultPublicMenuListener;
    public final ItemClickProcessor mItemClickProcessor;
    public final TBPublicMenu mTbPublicMenu;
    public final TBPublicMenuData mTbPublicMenuData;
    public final PageInfoModel pageInfoModel;

    static {
        t2o.a(927989767);
        t2o.a(927989827);
    }

    public DefaultItemClickListener(Activity activity, PageInfoModel pageInfoModel, TBPublicMenuData tBPublicMenuData, TBPublicMenu tBPublicMenu, TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener, ItemClickProcessor itemClickProcessor) {
        this.mTbPublicMenu = tBPublicMenu;
        this.mTbPublicMenuData = tBPublicMenuData;
        this.pageInfoModel = pageInfoModel;
        this.mActivityRef = new WeakReference<>(activity);
        this.mDefaultPublicMenuListener = tBOnPublicMenuClickListener;
        this.mItemClickProcessor = itemClickProcessor;
    }

    public boolean checkLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71efb4c", new Object[]{this})).booleanValue();
        }
        return Login.checkSessionValid();
    }

    public boolean defaultItemClicked(TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1f21c10", new Object[]{this, tBPublicMenuItem})).booleanValue();
        }
        TBPublicMenu.MenuCallBack menuCallBack = this.mCallBack;
        if (menuCallBack != null) {
            return menuCallBack.onDefaultItemClicked(tBPublicMenuItem);
        }
        return false;
    }

    public void doLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26139725", new Object[]{this});
        } else if (!Login.checkSessionValid()) {
            Login.login(true);
        }
    }

    public String getAssembledUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de40011c", new Object[]{this, str});
        }
        Activity activity = this.mActivityRef.get();
        String str2 = null;
        if (activity == null) {
            return null;
        }
        Bundle pageInfoBundle = this.pageInfoModel.getPageInfoBundle(activity);
        if (pageInfoBundle.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        try {
            JSONObject assembleUrlString = UrlUtil.assembleUrlString(pageInfoBundle);
            if (assembleUrlString != null) {
                str2 = URLEncoder.encode(assembleUrlString.toString(), "utf-8");
            }
        } catch (UnsupportedEncodingException unused) {
        }
        if (str2 != null) {
            if (str.indexOf(63) != -1) {
                sb.append("&args=");
                sb.append(str2);
            } else {
                sb.append("?args=");
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    public boolean isClickDefaultItem(Context context, TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52b25ff", new Object[]{this, context, tBPublicMenuItem})).booleanValue();
        }
        return false;
    }

    public void setCallBack(TBPublicMenu.MenuCallBack menuCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47ede7d", new Object[]{this, menuCallBack});
        } else {
            this.mCallBack = menuCallBack;
        }
    }

    @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
    public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
        String str;
        String str2;
        TBPublicMenuItem publicMenu;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
            return;
        }
        int id = tBPublicMenuItem.getId();
        if (!tBPublicMenuItem.isNeedLogin() || checkLogin()) {
            Activity activity = this.mActivityRef.get();
            if (activity != null) {
                Bundle pageInfoBundle = this.pageInfoModel.getPageInfoBundle(activity);
                UTWrapper.itemClick(tBPublicMenuItem, this.mTbPublicMenu);
                int i = R.id.uik_menu_wangxin;
                if (id == i) {
                    TBPublicMenuItem publicMenu2 = this.mTbPublicMenuData.getPublicMenu(i);
                    if (publicMenu2 != null) {
                        TBS.Adv.ctrlClicked(CT.Button, mop.KEY_WANG_WANG, new String[0]);
                        Nav.from(activity).toUri(publicMenu2.getNavUrl());
                        TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener = this.mDefaultPublicMenuListener;
                        if (tBOnPublicMenuClickListener != null) {
                            tBOnPublicMenuClickListener.onPublicMenuItemClicked(publicMenu2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                int i2 = R.id.uik_menu_home;
                if (id == i2) {
                    TBPublicMenuItem publicMenu3 = this.mTbPublicMenuData.getPublicMenu(i2);
                    if (publicMenu3 != null) {
                        TBS.Adv.ctrlClicked(CT.Button, "Home", new String[0]);
                        if (!defaultItemClicked(publicMenu3)) {
                            Nav.from(activity).toUri(publicMenu3.getNavUrl());
                            TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener2 = this.mDefaultPublicMenuListener;
                            if (tBOnPublicMenuClickListener2 != null) {
                                tBOnPublicMenuClickListener2.onPublicMenuItemClicked(publicMenu3);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                int i3 = R.id.uik_menu_service;
                if (id != i3) {
                    int i4 = R.id.uik_menu_feedback;
                    String str3 = null;
                    String str4 = "";
                    if (id == i4) {
                        TBPublicMenuItem publicMenu4 = this.mTbPublicMenuData.getPublicMenu(i4);
                        if (publicMenu4 != null) {
                            CT ct = CT.Button;
                            TBS.Adv.ctrlClicked(ct, "Feedback", new String[0]);
                            if (!defaultItemClicked(publicMenu4)) {
                                if (!pageInfoBundle.isEmpty()) {
                                    String assembledUrl = getAssembledUrl(publicMenu4.getNavUrl());
                                    if (!TextUtils.isEmpty(assembledUrl)) {
                                        try {
                                            Bundle bundle = pageInfoBundle.getBundle(this.pageInfoModel.getExtraBundleKey());
                                            if (!(bundle == null || bundle.getBundle(jjx.ZZB_BUNDLE_KEY) == null)) {
                                                str3 = bundle.getBundle(jjx.ZZB_BUNDLE_KEY).getString("_f");
                                            }
                                            if (!TextUtils.isEmpty(str3)) {
                                                if (assembledUrl.contains("?")) {
                                                    assembledUrl = assembledUrl + "&_f=" + URLEncoder.encode(str3, "utf-8");
                                                } else {
                                                    assembledUrl = assembledUrl + "?_f=" + URLEncoder.encode(str3, "utf-8");
                                                }
                                            }
                                            Intent intent = activity.getIntent();
                                            if (assembledUrl.contains("?")) {
                                                StringBuilder sb = new StringBuilder(assembledUrl);
                                                sb.append("&from_page=");
                                                sb.append(URLEncoder.encode(activity.getComponentName().getShortClassName(), "utf-8"));
                                                sb.append("&from_url=");
                                                if (intent != null) {
                                                    if (intent.getData() != null) {
                                                        str4 = intent.getData().toString();
                                                    }
                                                    str4 = URLEncoder.encode(str4, "utf-8");
                                                }
                                                sb.append(str4);
                                                str2 = sb.toString();
                                            } else {
                                                StringBuilder sb2 = new StringBuilder(assembledUrl);
                                                sb2.append("?from_page=");
                                                sb2.append(URLEncoder.encode(activity.getComponentName().getShortClassName(), "utf-8"));
                                                sb2.append("&from_url=");
                                                if (intent != null) {
                                                    if (intent.getData() != null) {
                                                        str4 = intent.getData().toString();
                                                    }
                                                    str4 = URLEncoder.encode(str4, "utf-8");
                                                }
                                                sb2.append(str4);
                                                str2 = sb2.toString();
                                            }
                                        } catch (Exception unused) {
                                            str2 = getAssembledUrl(getAssembledUrl(publicMenu4.getNavUrl()));
                                        }
                                        Nav.from(activity).withExtras(pageInfoBundle).toUri(str2);
                                        TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener3 = this.mDefaultPublicMenuListener;
                                        if (tBOnPublicMenuClickListener3 != null) {
                                            tBOnPublicMenuClickListener3.onPublicMenuItemClicked(publicMenu4);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                Nav.from(activity).withExtras(pageInfoBundle).toUri(publicMenu4.getNavUrl());
                                TBS.Adv.ctrlClicked(ct, "Feedback", new String[0]);
                                TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener4 = this.mDefaultPublicMenuListener;
                                if (tBOnPublicMenuClickListener4 != null) {
                                    tBOnPublicMenuClickListener4.onPublicMenuItemClicked(publicMenu4);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    int i5 = R.id.uik_menu_mytaobao;
                    if (id == i5) {
                        TBPublicMenuItem publicMenu5 = this.mTbPublicMenuData.getPublicMenu(i5);
                        if (publicMenu5 != null) {
                            Nav.from(activity).toUri(publicMenu5.mNavUrl);
                            TBS.Adv.ctrlClicked(CT.Button, "mytaobao", new String[0]);
                            TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener5 = this.mDefaultPublicMenuListener;
                            if (tBOnPublicMenuClickListener5 != null) {
                                tBOnPublicMenuClickListener5.onPublicMenuItemClicked(publicMenu5);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    int i6 = R.id.uit_menu_shopping_cart;
                    if (id == i6) {
                        TBPublicMenuItem publicMenu6 = this.mTbPublicMenuData.getPublicMenu(i6);
                        if (publicMenu6 != null) {
                            Nav.from(activity).toUri(publicMenu6.mNavUrl);
                            TBS.Adv.ctrlClicked(CT.Button, "mycart", new String[0]);
                            TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener6 = this.mDefaultPublicMenuListener;
                            if (tBOnPublicMenuClickListener6 != null) {
                                tBOnPublicMenuClickListener6.onPublicMenuItemClicked(publicMenu6);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    int i7 = R.id.uik_menu_orderList;
                    if (id != i7) {
                        int i8 = R.id.uik_menu_footpoint;
                        if (id == i8) {
                            TBPublicMenuItem publicMenu7 = this.mTbPublicMenuData.getPublicMenu(i8);
                            if (publicMenu7 != null) {
                                if (Localization.o()) {
                                    str = activity.getString(R.string.uik_menu_foot_point_url_i18n);
                                } else {
                                    str = publicMenu7.mNavUrl;
                                }
                                Nav.from(activity).toUri(str);
                                TBS.Adv.ctrlClicked(CT.Button, "footPoint", new String[0]);
                                TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener7 = this.mDefaultPublicMenuListener;
                                if (tBOnPublicMenuClickListener7 != null) {
                                    tBOnPublicMenuClickListener7.onPublicMenuItemClicked(publicMenu7);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        int i9 = R.id.uik_menu_report;
                        if (id == i9) {
                            TBPublicMenuItem publicMenu8 = this.mTbPublicMenuData.getPublicMenu(i9);
                            if (publicMenu8 != null) {
                                String reportUrl = UrlUtil.getReportUrl(activity);
                                if (pageInfoBundle.isEmpty()) {
                                    MenuMonitor.countFailed("nav_failed", "report_arg_null");
                                }
                                String shortClassName = activity.getComponentName().getShortClassName();
                                Intent intent2 = activity.getIntent();
                                if (!(intent2 == null || intent2.getData() == null)) {
                                    str4 = intent2.getData().toString();
                                }
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("from_page", shortClassName);
                                bundle2.putString("from_url", str4);
                                pageInfoBundle.putBundle("ReportData", bundle2);
                                StringBuilder sb3 = new StringBuilder(reportUrl);
                                try {
                                    JSONObject assembleUrlString = UrlUtil.assembleUrlString(pageInfoBundle);
                                    if (assembleUrlString != null) {
                                        str3 = URLEncoder.encode(assembleUrlString.toString(), "utf-8");
                                    }
                                } catch (UnsupportedEncodingException unused2) {
                                }
                                if (str3 != null) {
                                    sb3.append("?args=");
                                    sb3.append(str3);
                                }
                                Nav.from(activity).toUri(sb3.toString());
                                TBS.Adv.ctrlClicked(CT.Button, "report", new String[0]);
                                TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener8 = this.mDefaultPublicMenuListener;
                                if (tBOnPublicMenuClickListener8 != null) {
                                    tBOnPublicMenuClickListener8.onPublicMenuItemClicked(publicMenu8);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        this.mItemClickProcessor.onPublicMenuItemClicked(tBPublicMenuItem);
                    } else if (this.mTbPublicMenuData.getPublicMenu(i7) != null) {
                        Nav.from(activity).toUri(tBPublicMenuItem.mNavUrl);
                        TBS.Adv.ctrlClicked(CT.Button, dbv.BIZ_ORDER_LIST, new String[0]);
                        TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener9 = this.mDefaultPublicMenuListener;
                        if (tBOnPublicMenuClickListener9 != null) {
                            tBOnPublicMenuClickListener9.onPublicMenuItemClicked(tBPublicMenuItem);
                        }
                    }
                } else if (!pageInfoBundle.isEmpty() && (publicMenu = this.mTbPublicMenuData.getPublicMenu(i3)) != null) {
                    TBS.Adv.ctrlClicked(CT.Button, "handService", new String[0]);
                    if (!defaultItemClicked(publicMenu)) {
                        Nav.from(activity).withExtras(pageInfoBundle).toUri(getAssembledUrl(publicMenu.getNavUrl()));
                        TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener10 = this.mDefaultPublicMenuListener;
                        if (tBOnPublicMenuClickListener10 != null) {
                            tBOnPublicMenuClickListener10.onPublicMenuItemClicked(publicMenu);
                        }
                    }
                }
            }
        } else {
            doLogin();
        }
    }
}
