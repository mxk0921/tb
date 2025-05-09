package tb;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.android.split.core.splitcompat.Reflector;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.appbundle.a;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.tao.TaobaoApplication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class n1r {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CAN_USE_HISTORY_FEATURES = "can_use_history_features";
    public static final String CAN_USE_PRELOAD_FEATURES = "can_use_preload_features";
    public static final String DISABLED_HIS_PATCH_VERSIONS = "disabled_his_patch_versions";
    public static final String DISABLED_USE_HISTORY_FEATURES = "disabled_use_history_features";
    public static final String DISABLED_USE_PRELOAD_FEATURES = "disabled_use_preload_features";
    public static final String FLEX_INSTALL_FEATURE_FROM_CHANNEL = "flexa_install_feature_from_channel";
    public static final List<String> PRE_COMPILE_FEATURES;
    public static final Map<String, bjb> b;
    public static String d;

    /* renamed from: a  reason: collision with root package name */
    public static wnc f24451a = null;
    public static SharedPreferences c = null;

    public static void A(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f048593b", new Object[]{context, str, new Boolean(z)});
        } else {
            o(context).edit().putBoolean(str, z).commit();
        }
    }

    public static boolean B(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf1a697a", new Object[]{context})).booleanValue();
        }
        SharedPreferences o = o(context);
        return o.getBoolean("flexa_add_split_to_loadedapk_" + p(context), true);
    }

    public static boolean C(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c42ed34a", new Object[]{context, str})).booleanValue();
        }
        SharedPreferences o = o(context);
        return o.getStringSet("disabled_use_history_features_" + p(context), new HashSet()).contains(str);
    }

    public static boolean D(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19510dff", new Object[]{context, str})).booleanValue();
        }
        SharedPreferences o = o(context);
        return o.getStringSet("disabled_use_preload_features_" + p(context), new HashSet()).contains(str);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e32eb2c", new Object[]{context})).booleanValue();
        }
        SharedPreferences o = o(context);
        return o.getBoolean("flexa_install_feature_from_channel_" + p(context), true);
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("738034d3", new Object[]{context})).booleanValue();
        }
        SharedPreferences o = o(context);
        return o.getBoolean("can_use_history_features_" + p(context), true);
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5ac343e", new Object[]{context})).booleanValue();
        }
        SharedPreferences o = o(context);
        return o.getBoolean("can_use_preload_features_" + p(context), false);
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e684e7ef", new Object[]{context})).booleanValue();
        }
        SharedPreferences o = o(context);
        return o.getBoolean("flexa_clean_hisfeatures_features_" + p(context), true);
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9abaf44", new Object[]{context})).booleanValue();
        }
        SharedPreferences o = o(context);
        return o.getBoolean("flexa_disabled_verify_" + p(context), true);
    }

    public static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d9db0ac", new Object[]{context})).booleanValue();
        }
        SharedPreferences o = o(context);
        return o.getBoolean("deffered_download_feature_enabled_" + p(context), true);
    }

    public static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22249ffb", new Object[]{context})).booleanValue();
        }
        SharedPreferences o = o(context);
        return o.getBoolean("flexa_delegate_resources_enabled_" + p(context), false);
    }

    public static Set<String> h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("5f70580d", new Object[]{context});
        }
        SharedPreferences o = o(context);
        return o.getStringSet("disabled_his_patch_versions_" + p(context), new HashSet());
    }

    public static Set<String> i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("d06941a1", new Object[]{context});
        }
        HashSet hashSet = new HashSet();
        SharedPreferences o = o(context);
        String string = o.getString("disableFeatures_" + p(context), "");
        if (!TextUtils.isEmpty(string)) {
            hashSet.addAll(Arrays.asList(string.split(",")));
        }
        return hashSet;
    }

    public static boolean j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("875ed87f", new Object[]{context})).booleanValue();
        }
        SharedPreferences o = o(context);
        return o.getBoolean("download_feature_enabled_" + p(context), true);
    }

    public static boolean k(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7705d00d", new Object[]{context, str})).booleanValue();
        }
        return i(context).contains(str);
    }

    public static boolean l(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd84b0ca", new Object[]{context, str})).booleanValue();
        }
        SharedPreferences o = o(context);
        String string = o.getString("disableUpdateFeatures_" + p(context), "");
        if (!TextUtils.isEmpty(string)) {
            return Arrays.asList(string.split(",")).contains(str);
        }
        return false;
    }

    public static boolean m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd0bde76", new Object[]{context})).booleanValue();
        }
        SharedPreferences o = o(context);
        return o.getBoolean("flexa_enabled_" + p(context), true);
    }

    public static boolean n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46f5195d", new Object[]{context})).booleanValue();
        }
        SharedPreferences o = o(context);
        return o.getBoolean("flexa_force_enabled_" + p(context), true);
    }

    public static SharedPreferences o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("71f5d2c6", new Object[]{context});
        }
        if (c == null) {
            c = context.getSharedPreferences("dynamic_features_config", 0);
        }
        return c;
    }

    public static String p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("904e852c", new Object[]{context});
        }
        if (!TextUtils.isEmpty(d)) {
            return d;
        }
        String str = TaobaoApplication.sAppVersion;
        d = str;
        return str;
    }

    public static boolean q(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3227be7", new Object[]{context, str, new Boolean(z)})).booleanValue();
        }
        SharedPreferences o = o(context);
        return o.getBoolean("flexa_feature_diff_opened_" + p(context) + "_" + str, z);
    }

    public static boolean s(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("418e639f", new Object[]{context, str})).booleanValue();
        }
        if (PRE_COMPILE_FEATURES.contains(str)) {
            return true;
        }
        SharedPreferences o = o(context);
        return o.getStringSet("flexa_pre_compile_features_" + p(context), new HashSet()).contains(str);
    }

    public static boolean t(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7eca3ebb", new Object[]{context, str})).booleanValue();
        }
        SharedPreferences o = o(context);
        return o.getStringSet("flexa_open_inject_activities_" + p(context), new HashSet()).contains(str);
    }

    public static boolean w(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3d433e3", new Object[]{context})).booleanValue();
        }
        SharedPreferences o = o(context);
        return o.getBoolean("flexa_opt_service_" + p(context), true);
    }

    public static boolean x(Context context, String str, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bcbf708", new Object[]{context, str, set})).booleanValue();
        }
        return o(context).edit().putStringSet(str, set).commit();
    }

    public static boolean y(Context context, String str, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c15427bd", new Object[]{context, str, set})).booleanValue();
        }
        return o(context).edit().putStringSet(str, set).commit();
    }

    public static void z(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ba0f19", new Object[]{context, str, new Boolean(z)});
        } else {
            o(context).edit().putBoolean(str, z).commit();
        }
    }

    public static boolean u(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8372690", new Object[]{context})).booleanValue();
        }
        return o(context).getBoolean(gjv.SO_LOAD_FEATURES_KEY, false);
    }

    public static boolean v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adebb003", new Object[]{context})).booleanValue();
        }
        SharedPreferences o = o(context);
        return o.getBoolean("open_flexa_scene_" + p(context), true);
    }

    static {
        t2o.a(676331560);
        HashMap hashMap = new HashMap();
        b = hashMap;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        PRE_COMPILE_FEATURES = arrayList;
        arrayList.add("taobao_wangxin");
        arrayList.add("messagesdkwrapper");
        arrayList.add(a.TAOPAI_SDK_FEATURE);
        arrayList.add("triver_taobao");
        arrayList.add("rxandroid");
        arrayList.add(FlexaLiveX.ATYPE);
        arrayList.add("taobao_weex_adapter");
        arrayList.add(FlexaLiveX.BTYPE);
        arrayList.add(tbt.MORE_FEATURE);
        arrayList.add("fluid_framework");
        arrayList.add(FlexaLiveX.TAOLIVE_HOMEPAGE);
        arrayList.add(FlexaLiveX.TBLIVE_GIFT);
        hashMap.put("com.taobao.tmgdeliverybase.TMGDeliveryPurchaseActivity", d7o.b("com.taobao.tmgdeliverybase.TMGDeliveryPurchaseActivity").b("tmgdelivery").d(false).a());
        hashMap.put("com.alibaba.triver.triver_shop.newShop.NativeShopActivity", d7o.b("com.alibaba.triver.triver_shop.newShop.NativeShopActivity").b("triver_taobao").d(false).a());
        hashMap.put("com.tmall.wireless.mirrorlife.base.MirrorBaseActivity", d7o.b("com.tmall.wireless.mirrorlife.base.MirrorBaseActivity").b("tmallandroid_MirrorLifeAndroid").d(false).a());
        hashMap.put("com.taobao.oversea.live.TmgLiveHomepageActivity", d7o.b("com.taobao.oversea.live.TmgLiveHomepageActivity").b("tmgbusiness4androidremote").d(false).a());
        hashMap.put("com.taobao.ugc.framework.UGCContainerActivity", d7o.b("com.taobao.ugc.framework.UGCContainerActivity").c("ugc_component_rate", "ugc_core").d(false).a());
        hashMap.put("com.taobao.imagesearch.xr.lib.XRCameraActivity", d7o.b("com.taobao.imagesearch.xr.lib.XRCameraActivity").c("image_search_xr_aar", "TB3DSpace").d(false).a());
        hashMap.put("com.taobao.android.detail.wrapper.activity.DetailActivity", d7o.b("com.taobao.android.detail.wrapper.activity.DetailActivity").d(true).a());
        hashMap.put("com.taobao.search.searchdoor.SearchDoorActivity", d7o.b("com.taobao.search.searchdoor.SearchDoorActivity").d(true).a());
        hashMap.put("com.taobao.search.sf.MainSearchResultActivity", d7o.b("com.taobao.search.sf.MainSearchResultActivity").d(true).a());
        hashMap.put("com.taobao.android.order.bundle.TBOrderListActivity", d7o.b("com.taobao.android.order.bundle.TBOrderListActivity").d(true).a());
        hashMap.put("com.taobao.android.order.bundle.TBOrderDetailActivity", d7o.b("com.taobao.android.order.bundle.TBOrderDetailActivity").d(true).a());
        hashMap.put("com.taobao.bootimage.activity.BootImageActivity", d7o.b("com.taobao.bootimage.activity.BootImageActivity").d(true).a());
        hashMap.put("com.taobao.browser.BrowserActivity", d7o.b("com.taobao.browser.BrowserActivity").d(true).a());
        hashMap.put("com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity", d7o.b("com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity").d(true).a());
        hashMap.put("com.taobao.mytaobao.newsetting.NewAboutTaobaoActivity", d7o.b("com.taobao.mytaobao.newsetting.NewAboutTaobaoActivity").d(true).a());
        hashMap.put("com.taobao.themis.container.app.TMSActivity", d7o.b("com.taobao.themis.container.app.TMSActivity").b("umipublish").d(false).a());
        hashMap.put("com.taobao.themis.container.app.TMSBaseActivity", d7o.b("com.taobao.themis.container.app.TMSBaseActivity").d(true).a());
        hashMap.put("com.taobao.android.layoutmanager.container.CommonContainerActivity", d7o.b("com.taobao.android.layoutmanager.container.CommonContainerActivity").d(true).a());
        hashMap.put("com.taobao.detail.rate.RateViewPagerActivity", d7o.b("com.taobao.detail.rate.RateViewPagerActivity").b("ratefeature").d(false).a());
        hashMap.put("com.taobao.android.detail.alittdetail.TTDetailActivity", d7o.b("com.taobao.android.detail.alittdetail.TTDetailActivity").b("dtao_liveshop_ttdetail").d(false).a());
        hashMap.put(BundleSplitUtil.ACTIVITY_NAME, d7o.b(BundleSplitUtil.ACTIVITY_NAME).d(true).a());
        hashMap.put("com.taobao.message.activity.ChatActivityV2", d7o.b("com.taobao.message.activity.ChatActivityV2").d(true).a());
        hashMap.put(FlexaLiveX.TAO_LIVE_HOME_ACTIVITY, d7o.b(FlexaLiveX.TAO_LIVE_HOME_ACTIVITY).c(FlexaLiveX.TAOLIVE_HOMEPAGE, FlexaLiveX.BTYPE, FlexaLiveX.ATYPE, FlexaLiveX.TBLIVE_GIFT).d(false).a());
        hashMap.put("com.alibaba.triver.triver_shop.newShop.ShopActivity", d7o.b("com.alibaba.triver.triver_shop.newShop.ShopActivity").c("tbsearch_remote", "triver_taobao", FlexaLiveX.ATYPE).d(false).a());
        hashMap.put(FlexaLiveX.TAO_LIVE_VIDEO_ACTIVITY, d7o.b(FlexaLiveX.TAO_LIVE_VIDEO_ACTIVITY).c(FlexaLiveX.TAOLIVE_HOMEPAGE, FlexaLiveX.BTYPE, FlexaLiveX.ATYPE, FlexaLiveX.TBLIVE_GIFT).d(false).a());
        hashMap.put("com.taobao.pha.tb.tabcontainer.TabFrameActivity", d7o.b("com.taobao.pha.tb.tabcontainer.TabFrameActivity").d(false).b("umipublish").a());
        hashMap.put("com.taobao.weex.weexv2.page.WeexV2Activity", d7o.b("com.taobao.weex.weexv2.page.WeexV2Activity").d(true).a());
        hashMap.put("com.taobao.android.detail.ttdetail.TTDetailBaseActivity", d7o.b("com.taobao.android.detail.ttdetail.TTDetailBaseActivity").d(true).a());
        hashMap.put("com.taobao.android.tucaoba.ondemand.EntryActivity", d7o.b("com.taobao.android.tucaoba.ondemand.EntryActivity").d(false).b("tucaobafeature").a());
        hashMap.put("com.taobao.android.detail.alittdetail.TTDetailActivity", d7o.b("com.taobao.android.detail.alittdetail.TTDetailActivity").d(true).a());
        hashMap.put("com.etao.feimagesearch.IrpActivity", d7o.b("com.etao.feimagesearch.IrpActivity").d(true).a());
        hashMap.put("com.etao.feimagesearch.capture.CaptureActivity", d7o.b("com.etao.feimagesearch.capture.CaptureActivity").d(true).a());
        hashMap.put("com.taobao.android.layoutmanager.container.MultiPageContainerActivity", d7o.b("com.taobao.android.layoutmanager.container.MultiPageContainerActivity").d(true).a());
        hashMap.put("com.taobao.login4android.membercenter.security.SecurityEntranceActivity", d7o.b("com.taobao.login4android.membercenter.security.SecurityEntranceActivity").d(true).a());
        hashMap.put("com.taobao.android.auth.AuthEntranceActivity", d7o.b("com.taobao.android.auth.AuthEntranceActivity").d(true).a());
        hashMap.put("com.taobao.android.address.WeexPopContainer", d7o.b("com.taobao.android.address.WeexPopContainer").d(true).a());
        hashMap.put("com.taobao.android.address.H5PopActivity", d7o.b("com.taobao.android.address.H5PopActivity").d(true).a());
        hashMap.put("com.taobao.message.chatv2.aura.AuraContainerActivity", d7o.b("com.taobao.message.chatv2.aura.AuraContainerActivity").d(true).a());
        hashMap.put("com.taobao.message.chatv2.aura.MyExpressActivity", d7o.b("com.taobao.message.chatv2.aura.MyExpressActivity").d(true).a());
        hashMap.put("com.taobao.android.address.wrapper.AddressEntranceActivity", d7o.b("com.taobao.android.address.wrapper.AddressEntranceActivity").b(u58.DYNAMIC_NAME_TAOBAO_ANDROID_ADDRESS_DYNAMIC).d(false).a());
        hashMap.put("com.taobao.login4android.membercenter.security.SecurityEntranceActivity", d7o.b("com.taobao.login4android.membercenter.security.SecurityEntranceActivity").d(true).a());
        hashMap.put("com.taobao.android.auth.AuthEntranceActivity", d7o.b("com.taobao.android.auth.AuthEntranceActivity").d(true).a());
        hashMap.put("com.taobao.android.address.WeexPopContainer", d7o.b("com.taobao.android.address.WeexPopContainer").d(true).a());
        hashMap.put("com.taobao.android.address.H5PopActivity", d7o.b("com.taobao.android.address.H5PopActivity").d(true).a());
        hashMap.put("com.alipay.android.app.pay.MiniLaucherActivity", d7o.b("com.alipay.android.app.pay.MiniLaucherActivity").d(true).a());
        hashMap.put("com.taobao.tao.alipay.cashdesk.CashDeskActivity", d7o.b("com.taobao.tao.alipay.cashdesk.CashDeskActivity").d(true).a());
        hashMap.put("com.alipay.android.msp.ui.views.MspContainerActivity", d7o.b("com.alipay.android.msp.ui.views.MspContainerActivity").d(true).a());
        hashMap.put("com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridActivity", d7o.b("com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridActivity").d(true).a());
        hashMap.put("com.taobao.android.layoutmanager.container.MultiPageTransparentContainerActivity", d7o.b("com.taobao.android.layoutmanager.container.MultiPageTransparentContainerActivity").b("umipublish").d(false).a());
        hashMap.put("com.taobao.browser.exbrowser.BrowserUpperActivity", d7o.b("com.taobao.browser.exbrowser.BrowserUpperActivity").d(true).a());
        hashMap.put("com.taobao.android.tbabilitykit.pop.StdPopActivityGroup", d7o.b("com.taobao.android.tbabilitykit.pop.StdPopActivityGroup").d(true).a());
        hashMap.put("com.taobao.android.tbabilitykit.pop.StdPopContainerActivity", d7o.b("com.taobao.android.tbabilitykit.pop.StdPopContainerActivity").d(true).a());
        hashMap.put("com.taobao.favorites.components.category.offerout.FavCategoryPopupActivity", d7o.b("com.taobao.favorites.components.category.offerout.FavCategoryPopupActivity").b("taobao_favorite_aar").d(false).a());
        hashMap.put("com.taobao.login4android.membercenter.account.MultiAccountActivity", d7o.b("com.taobao.login4android.membercenter.account.MultiAccountActivity").d(true).a());
        hashMap.put("com.alibaba.triver.container.TriverMainActivity", d7o.b("com.alibaba.triver.container.TriverMainActivity").b("triver_taobao").d(false).a());
        hashMap.put("com.alibaba.triver.kit.pub.impl.TBAppInterceptBackProxyImpl", d7o.b("com.alibaba.triver.kit.pub.impl.TBAppInterceptBackProxyImpl").b("triver_taobao").d(false).a());
        hashMap.put("com.alibaba.triver.kit.pub.impl.PubAppLoadProxyImpl", d7o.b("com.alibaba.triver.kit.pub.impl.PubAppLoadProxyImpl").b("triver_taobao").d(false).a());
        hashMap.put("com.taobao.android.order.bundle.TBOrderSearchOrFilterActivity", d7o.b("com.taobao.android.order.bundle.TBOrderSearchOrFilterActivity").d(true).a());
        hashMap.put("com.taobao.weex.WXActivity", d7o.b("com.taobao.weex.WXActivity").b("taobao_weex_adapter").c("triver_taobao").d(false).a());
        hashMap.put("com.taobao.search.common.SearchInShopRouteActivity", d7o.b("com.taobao.search.common.SearchInShopRouteActivity").d(true).a());
        hashMap.put("com.taobao.search.sf.InshopResultActivity", d7o.b("com.taobao.search.sf.InshopResultActivity").d(true).a());
        hashMap.put("com.taobao.tao.msgcenter.activity.MsgCenterThirdPushActivity", d7o.b("com.taobao.tao.msgcenter.activity.MsgCenterThirdPushActivity").b("taobao_wangxin").d(false).a());
        hashMap.put("com.taobao.message.chat.interactive.InteractiveDetailActivity", d7o.b("com.taobao.message.chat.interactive.InteractiveDetailActivity").b("taobao_wangxin").d(false).a());
        hashMap.put("com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridActivity", d7o.b("com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridActivity").d(true).a());
    }

    public static boolean r(Context context, String str) {
        Map<String, bjb> map;
        Context baseContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98ddfa1c", new Object[]{context, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (f24451a == null) {
            f24451a = (wnc) d62.b(wnc.class, "SplitCompat");
        }
        if (str.endsWith("$ipReplace")) {
            str = str.substring(0, str.length() - 10);
        }
        try {
            map = b;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (((HashMap) map).containsKey(str)) {
            ((bjb) ((HashMap) map).get(str)).a(context);
            wnc wncVar = f24451a;
            if (wncVar != null) {
                wncVar.c("skip inject Activity %s because it is bind to features", str);
            }
            return true;
        }
        if ((context instanceof ContextWrapper) && TextUtils.equals(str, "androidx.appcompat.app.AppCompatDelegate") && (baseContext = ((ContextWrapper) context).getBaseContext()) != null) {
            str = ((Context) Reflector.s(baseContext).g("mOuterContext").j()).getClass().getName();
        }
        if (BundleInfoManager.instance().isDynamicActivity(str) || t(context, str)) {
            if (BundleInfoManager.instance().isDynamicActivity(str) && BundleInfoManager.instance().getBundleInfoFromActivity(str) != null) {
                String str2 = BundleInfoManager.instance().getBundleInfoFromActivity(str).c;
                d7o.b(str).b(str2).c((String[]) BundleInfoManager.instance().getDynamicFeatureInfo(str2).dependencies.toArray(new String[0])).d(false).a().a(context);
                wnc wncVar2 = f24451a;
                if (wncVar2 != null) {
                    wncVar2.c("skip inject dynamic Activity %s because it is bind to feature %s", str, str2);
                }
                return true;
            }
            return o(context).getStringSet(gjv.FLEXA_CLOSE_ACTIVITY_INSTALL_RESOURCES, new HashSet()).contains(str);
        }
        wnc wncVar3 = f24451a;
        if (wncVar3 != null) {
            wncVar3.c("skip inject Activity %s because it is not dynamic activity", str);
        }
        return true;
    }
}
