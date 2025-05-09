package com.taobao.android.address.themis;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.c9x;
import tb.ff0;
import tb.h1p;
import tb.kf0;
import tb.rf0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ThemisConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SCENE_CART = "cart";
    public static final String SCENE_CHANGE = "change";
    public static final String SCENE_EDIT = "edit";
    public static final String SCENE_LBS_LIST = "lbs_list";
    public static final String SCENE_MANAGER = "manager";
    public static final String SCENE_PURCHASE = "purchase";
    public static final String SCENE_SELECT = "select";
    public static final String SCENE_TMALLMARKET = "tmallMarket";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface Scene {
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8bfcb834", new Object[]{str, str2});
        }
        return b(str, str2, false);
    }

    public static String b(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96d87338", new Object[]{str, str2, new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder(h1p.HTTPS_PREFIX);
        if (ff0.d()) {
            sb.append("bp.wapa.taobao.com/");
        } else {
            sb.append("bp.m.taobao.com/");
        }
        sb.append("app/vip/receiver-address-weex2/");
        if (TextUtils.equals(str, SCENE_MANAGER)) {
            sb.append("lists?voiceMode=true&isUnfrequent=true&pageType=1");
        } else if (TextUtils.equals(str, SCENE_SELECT)) {
            sb.append("lists?voiceMode=true&isUnfrequent=true&pageType=0");
        } else if (TextUtils.equals(str, "change")) {
            sb.append("change?wx_opaque=0&is_loading=0");
        } else if (TextUtils.equals(str, SCENE_LBS_LIST)) {
            sb.append("lbs-list?voiceMode=true");
        } else if (TextUtils.equals(str, "cart")) {
            sb.append("lists?wx_statusbar_hidden=true&wx_opaque=0&is_loading=0&isNewBuy=true&uniVessel=true&bizId=iCart");
        } else {
            sb.append("lists?wx_statusbar_hidden=true&wx_opaque=0&is_loading=0&isUnfrequent=true&pageType=0&bizId=");
            sb.append(str);
        }
        sb.append("&wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&x-ssr=true");
        String f = rf0.f(str, sb.toString());
        if (z) {
            f = rf0.b(f, "addressClientScene=" + str);
        }
        if (!TextUtils.isEmpty(str2)) {
            f = rf0.b(f, str2);
        }
        return (TextUtils.equals(str, SCENE_MANAGER) || TextUtils.equals(str, SCENE_SELECT)) ? rf0.a(ff0.a(), f) : f;
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7094eda1", new Object[]{str});
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                return parse.getQueryParameter("bizId");
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String d(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a03c562", new Object[]{str, str2, new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder(h1p.HTTPS_PREFIX);
        if (ff0.d()) {
            sb.append("web.wapa.taobao.com/");
        } else {
            sb.append("web.m.taobao.com/");
        }
        sb.append("app/vip/receiver-address-wx2/address-pro?wh_weex=true&weex_mode=dom&renderMode=texture&wx_opaque=0&wx_navbar_hidden=true&wx_statusbar_hidden=true&x-ssr=true");
        String f = rf0.f(str, sb.toString());
        if (z) {
            f = rf0.b(f, "addressClientScene=" + str);
        }
        if (!TextUtils.isEmpty(str2)) {
            f = rf0.b(f, str2);
        }
        return rf0.a(ff0.a(), f);
    }

    public static String g(Activity activity, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2699e75e", new Object[]{activity, str, str2, new Integer(i)});
        }
        return h(activity, str, str2, i, null);
    }

    public static String h(Activity activity, String str, String str2, int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf9e3ace", new Object[]{activity, str, str2, new Integer(i), bundle});
        }
        String a2 = a(str, str2);
        if (!TextUtils.isEmpty(a2)) {
            Nav.from(activity).withFlags(i).withExtras(bundle).toUri(kf0.a(activity, a2));
            if ((TextUtils.equals(str, SCENE_MANAGER) || TextUtils.equals(str, SCENE_SELECT)) && rf0.m()) {
                activity.overridePendingTransition(R.anim.address_slide_in_from_right, R.anim.address_fade_out);
            }
        }
        return a2;
    }

    public static boolean e(String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c94c1829", new Object[]{str})).booleanValue();
        }
        if (TextUtils.equals(str, SCENE_MANAGER) || TextUtils.equals(str, SCENE_SELECT)) {
            z = rf0.j("isAddressMgrUseWeex2");
        } else if (TextUtils.equals(str, "change")) {
            z = rf0.j("isAddressChangeUserWeex");
        } else if (TextUtils.equals(str, "cart")) {
            z = rf0.j("isAddressCartUseWeex2");
        } else if (TextUtils.equals(str, SCENE_LBS_LIST)) {
            z = rf0.j("isAddressLbsUserWeex2");
        } else if (TextUtils.equals(str, "purchase")) {
            z = rf0.j("isAddressPurchaseWeex2");
        } else if (TextUtils.equals(str, SCENE_TMALLMARKET)) {
            z = rf0.j("isAddressTmallMarketWeex2");
        } else if (TextUtils.equals(str, "edit")) {
            z = rf0.j("isAddressEditWeex2");
        } else {
            return rf0.j("isAddressUseWeex2_" + str);
        }
        return rf0.j("isAddressUseWeex2") && z;
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7e29c38", new Object[]{str})).booleanValue();
        }
        String c = c(str);
        return TextUtils.equals(c9x.CART_BIZ_NAME, c) || TextUtils.equals("purchase", c) || TextUtils.equals(SCENE_TMALLMARKET, c);
    }
}
