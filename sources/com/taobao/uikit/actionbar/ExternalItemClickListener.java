package com.taobao.uikit.actionbar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.model.PageInfoModel;
import com.taobao.uikit.actionbar.util.MenuMonitor;
import com.taobao.uikit.actionbar.util.UrlUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONObject;
import tb.c2v;
import tb.jjx;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ExternalItemClickListener extends DefaultItemClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(927989768);
    }

    public ExternalItemClickListener(Activity activity, PageInfoModel pageInfoModel, TBPublicMenuData tBPublicMenuData, TBPublicMenu tBPublicMenu, TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener, ItemClickProcessor itemClickProcessor) {
        super(activity, pageInfoModel, tBPublicMenuData, tBPublicMenu, tBOnPublicMenuClickListener, itemClickProcessor);
    }

    public static /* synthetic */ Object ipc$super(ExternalItemClickListener externalItemClickListener, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/actionbar/ExternalItemClickListener");
    }

    @Override // com.taobao.uikit.actionbar.DefaultItemClickListener, com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
    public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
            return;
        }
        Activity activity = this.mActivityRef.get();
        if (activity != null && !isClickDefaultItem(activity, tBPublicMenuItem)) {
            UTWrapper.itemClick(tBPublicMenuItem, this.mTbPublicMenu, 2);
            this.mItemClickProcessor.onPublicMenuItemClicked(tBPublicMenuItem);
        }
    }

    @Override // com.taobao.uikit.actionbar.DefaultItemClickListener
    public boolean isClickDefaultItem(Context context, TBPublicMenuItem tBPublicMenuItem) {
        String currentPageName;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52b25ff", new Object[]{this, context, tBPublicMenuItem})).booleanValue();
        }
        String str2 = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            MenuMonitor.countFailed("nav_failed", "context_is_null");
            return true;
        }
        int id = tBPublicMenuItem.getId();
        Bundle pageInfoBundle = this.pageInfoModel.getPageInfoBundle(activity);
        int i = R.id.uik_menu_feedback;
        String str3 = "";
        if (id == i) {
            UTWrapper.itemClick(tBPublicMenuItem, this.mTbPublicMenu);
            TBPublicMenuItem extraMenuUikitItemById = this.mTbPublicMenuData.getExtraMenuUikitItemById(i);
            if (extraMenuUikitItemById == null) {
                return true;
            }
            CT ct = CT.Button;
            TBS.Adv.ctrlClicked(ct, "Feedback", new String[0]);
            if (defaultItemClicked(extraMenuUikitItemById)) {
                return true;
            }
            if (!pageInfoBundle.isEmpty()) {
                String assembledUrl = getAssembledUrl(extraMenuUikitItemById.getNavUrl());
                if (TextUtils.isEmpty(assembledUrl)) {
                    MenuMonitor.countFailed("nav_failed", "feedback_url_is_empty");
                    return true;
                }
                try {
                    Bundle bundle = pageInfoBundle.getBundle(this.pageInfoModel.getExtraBundleKey());
                    if (!(bundle == null || bundle.getBundle(jjx.ZZB_BUNDLE_KEY) == null)) {
                        str2 = bundle.getBundle(jjx.ZZB_BUNDLE_KEY).getString("_f");
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        if (assembledUrl.contains("?")) {
                            assembledUrl = assembledUrl + "&_f=" + URLEncoder.encode(str2, "utf-8");
                        } else {
                            assembledUrl = assembledUrl + "?_f=" + URLEncoder.encode(str2, "utf-8");
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
                                str3 = intent.getData().toString();
                            }
                            str3 = URLEncoder.encode(str3, "utf-8");
                        }
                        sb.append(str3);
                        str = sb.toString();
                    } else {
                        StringBuilder sb2 = new StringBuilder(assembledUrl);
                        sb2.append("?from_page=");
                        sb2.append(URLEncoder.encode(activity.getComponentName().getShortClassName(), "utf-8"));
                        sb2.append("&from_url=");
                        if (intent != null) {
                            if (intent.getData() != null) {
                                str3 = intent.getData().toString();
                            }
                            str3 = URLEncoder.encode(str3, "utf-8");
                        }
                        sb2.append(str3);
                        str = sb2.toString();
                    }
                } catch (Exception e) {
                    String assembledUrl2 = getAssembledUrl(getAssembledUrl(extraMenuUikitItemById.getNavUrl()));
                    MenuMonitor.countFailed("nav_exception", "feedback_" + e.toString());
                    str = assembledUrl2;
                }
                Nav.from(activity).withExtras(pageInfoBundle).toUri(str);
                TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener = this.mDefaultPublicMenuListener;
                if (tBOnPublicMenuClickListener != null) {
                    tBOnPublicMenuClickListener.onPublicMenuItemClicked(extraMenuUikitItemById);
                }
            } else {
                Nav.from(activity).withExtras(pageInfoBundle).toUri(extraMenuUikitItemById.getNavUrl());
                TBS.Adv.ctrlClicked(ct, "Feedback", new String[0]);
                TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener2 = this.mDefaultPublicMenuListener;
                if (tBOnPublicMenuClickListener2 != null) {
                    tBOnPublicMenuClickListener2.onPublicMenuItemClicked(extraMenuUikitItemById);
                }
            }
            return true;
        }
        int i2 = R.id.uik_menu_report;
        if (id == i2) {
            UTWrapper.itemClick(tBPublicMenuItem, this.mTbPublicMenu);
            TBPublicMenuItem extraMenuUikitItemById2 = this.mTbPublicMenuData.getExtraMenuUikitItemById(i2);
            if (extraMenuUikitItemById2 != null) {
                String reportUrl = UrlUtil.getReportUrl(activity);
                if (pageInfoBundle.isEmpty()) {
                    MenuMonitor.countFailed("nav_failed", "report_arg_null");
                }
                String shortClassName = activity.getComponentName().getShortClassName();
                Intent intent2 = activity.getIntent();
                if (!(intent2 == null || intent2.getData() == null)) {
                    str3 = intent2.getData().toString();
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("from_page", shortClassName);
                bundle2.putString("from_url", str3);
                pageInfoBundle.putBundle("ReportData", bundle2);
                StringBuilder sb3 = new StringBuilder(reportUrl);
                try {
                    JSONObject assembleUrlString = UrlUtil.assembleUrlString(pageInfoBundle);
                    if (assembleUrlString != null) {
                        str2 = URLEncoder.encode(assembleUrlString.toString(), "utf-8");
                    }
                } catch (UnsupportedEncodingException e2) {
                    MenuMonitor.countFailed("nav_exception", "report " + e2.toString());
                }
                if (str2 != null) {
                    sb3.append("?args=");
                    sb3.append(str2);
                }
                Nav.from(activity).toUri(sb3.toString());
                TBS.Adv.ctrlClicked(CT.Button, "report", new String[0]);
                TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener3 = this.mDefaultPublicMenuListener;
                if (tBOnPublicMenuClickListener3 != null) {
                    tBOnPublicMenuClickListener3.onPublicMenuItemClicked(extraMenuUikitItemById2);
                }
            }
            return true;
        }
        int i3 = R.id.uik_menu_favor;
        if (id == i3) {
            TBPublicMenuItem extraMenuUikitItemById3 = this.mTbPublicMenuData.getExtraMenuUikitItemById(i3);
            String navUrl = extraMenuUikitItemById3.getNavUrl();
            if (!TextUtils.isEmpty(c2v.getInstance().getCurrentPageName())) {
                try {
                    navUrl = navUrl + "&page_name=" + URLEncoder.encode(currentPageName, "utf-8");
                } catch (UnsupportedEncodingException unused) {
                    navUrl = extraMenuUikitItemById3.getNavUrl();
                }
            }
            Nav.from(activity).withExtras(pageInfoBundle).toUri(navUrl);
        } else {
            int i4 = R.id.uik_menu_service;
            if (id == i4) {
                UTWrapper.itemClick(tBPublicMenuItem, this.mTbPublicMenu);
                if (pageInfoBundle.isEmpty()) {
                    MenuMonitor.countFailed("nav_failed", "service_at" + ("failed page:" + activity.getClass()));
                    return true;
                }
                TBPublicMenuItem extraMenuUikitItemById4 = this.mTbPublicMenuData.getExtraMenuUikitItemById(i4);
                if (extraMenuUikitItemById4 == null) {
                    return true;
                }
                TBS.Adv.ctrlClicked(CT.Button, "handService", new String[0]);
                if (defaultItemClicked(extraMenuUikitItemById4)) {
                    return true;
                }
                Nav.from(activity).withExtras(pageInfoBundle).toUri(getAssembledUrl(extraMenuUikitItemById4.getNavUrl()));
                TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener4 = this.mDefaultPublicMenuListener;
                if (tBOnPublicMenuClickListener4 != null) {
                    tBOnPublicMenuClickListener4.onPublicMenuItemClicked(extraMenuUikitItemById4);
                }
                return true;
            }
        }
        return false;
    }
}
