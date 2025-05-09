package com.alipay.android.msp.drivers.actions;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.app.template.JSPlugin;
import com.alipay.android.app.template.JSPluginManager;
import com.alipay.android.app.template.JsPluginFactory;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.drivers.legacyapi.DatabaseApi;
import com.alipay.android.msp.drivers.legacyapi.FeedbackApi;
import com.alipay.android.msp.drivers.legacyapi.RpcApi;
import com.alipay.android.msp.drivers.legacyapi.TplMsgApi;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.drivers.stores.store.events.AlertStore;
import com.alipay.android.msp.drivers.stores.store.events.AuthStore;
import com.alipay.android.msp.drivers.stores.store.events.BackStore;
import com.alipay.android.msp.drivers.stores.store.events.BncbStore;
import com.alipay.android.msp.drivers.stores.store.events.BnvbStore;
import com.alipay.android.msp.drivers.stores.store.events.CacheStore;
import com.alipay.android.msp.drivers.stores.store.events.CashierMainStore;
import com.alipay.android.msp.drivers.stores.store.events.ContainerReturnDataStore;
import com.alipay.android.msp.drivers.stores.store.events.CopyStore;
import com.alipay.android.msp.drivers.stores.store.events.DatabaseStore;
import com.alipay.android.msp.drivers.stores.store.events.DestroyStore;
import com.alipay.android.msp.drivers.stores.store.events.DiagnoseStore;
import com.alipay.android.msp.drivers.stores.store.events.ExitStore;
import com.alipay.android.msp.drivers.stores.store.events.FeedbackStore;
import com.alipay.android.msp.drivers.stores.store.events.ForkStore;
import com.alipay.android.msp.drivers.stores.store.events.GatherUserFeedbackStore;
import com.alipay.android.msp.drivers.stores.store.events.GetSpmStore;
import com.alipay.android.msp.drivers.stores.store.events.HideKeyboardStore;
import com.alipay.android.msp.drivers.stores.store.events.HttpStore;
import com.alipay.android.msp.drivers.stores.store.events.InvokeLocStore;
import com.alipay.android.msp.drivers.stores.store.events.InvokeQrGenStore;
import com.alipay.android.msp.drivers.stores.store.events.InvokeQueryInfoStore;
import com.alipay.android.msp.drivers.stores.store.events.InvokeQuerySkinInfoStore;
import com.alipay.android.msp.drivers.stores.store.events.InvokeSetResultStore;
import com.alipay.android.msp.drivers.stores.store.events.InvokeVerifyIdentityStore;
import com.alipay.android.msp.drivers.stores.store.events.LoadingStore;
import com.alipay.android.msp.drivers.stores.store.events.LocationStore;
import com.alipay.android.msp.drivers.stores.store.events.LogStore;
import com.alipay.android.msp.drivers.stores.store.events.LoginStore;
import com.alipay.android.msp.drivers.stores.store.events.MetaVibrateStore;
import com.alipay.android.msp.drivers.stores.store.events.NoneStore;
import com.alipay.android.msp.drivers.stores.store.events.NotifyTplStore;
import com.alipay.android.msp.drivers.stores.store.events.OpenUrlStore;
import com.alipay.android.msp.drivers.stores.store.events.OpenWebStore;
import com.alipay.android.msp.drivers.stores.store.events.PayStore;
import com.alipay.android.msp.drivers.stores.store.events.PostNotificationStore;
import com.alipay.android.msp.drivers.stores.store.events.PreloadStore;
import com.alipay.android.msp.drivers.stores.store.events.QueryAccountsStore;
import com.alipay.android.msp.drivers.stores.store.events.RedoStore;
import com.alipay.android.msp.drivers.stores.store.events.ReloadStore;
import com.alipay.android.msp.drivers.stores.store.events.ReturnDataStore;
import com.alipay.android.msp.drivers.stores.store.events.RpcStore;
import com.alipay.android.msp.drivers.stores.store.events.ScanCardStore;
import com.alipay.android.msp.drivers.stores.store.events.SendChannelDataStore;
import com.alipay.android.msp.drivers.stores.store.events.ServiceStore;
import com.alipay.android.msp.drivers.stores.store.events.SetResultStore;
import com.alipay.android.msp.drivers.stores.store.events.SharePaySelStore;
import com.alipay.android.msp.drivers.stores.store.events.SharePayStore;
import com.alipay.android.msp.drivers.stores.store.events.ShareTokenStore;
import com.alipay.android.msp.drivers.stores.store.events.ShowPageStore;
import com.alipay.android.msp.drivers.stores.store.events.ShowTplStore;
import com.alipay.android.msp.drivers.stores.store.events.SnapShotStore;
import com.alipay.android.msp.drivers.stores.store.events.SubmitStore;
import com.alipay.android.msp.drivers.stores.store.events.SwLoadStore;
import com.alipay.android.msp.drivers.stores.store.events.TelStore;
import com.alipay.android.msp.drivers.stores.store.events.ThirdPayStore;
import com.alipay.android.msp.drivers.stores.store.events.ToastStore;
import com.alipay.android.msp.drivers.stores.store.events.TplMsgStore;
import com.alipay.android.msp.drivers.stores.store.events.TplUpdateStore;
import com.alipay.android.msp.drivers.stores.store.events.TriggerPrerenderStore;
import com.alipay.android.msp.drivers.stores.store.events.VerifyIdStore;
import com.alipay.android.msp.drivers.stores.store.events.VidStore;
import com.alipay.android.msp.drivers.stores.store.events.WapPayStore;
import com.alipay.android.msp.drivers.stores.store.events.WifiInfoStore;
import com.alipay.android.msp.drivers.stores.store.metaevents.MetaAlertStore;
import com.alipay.android.msp.drivers.stores.store.metaevents.MetaExitStore;
import com.alipay.android.msp.drivers.stores.store.metaevents.MetaGetBizDataStore;
import com.alipay.android.msp.drivers.stores.store.metaevents.MetaGetDrmConfigStore;
import com.alipay.android.msp.drivers.stores.store.metaevents.MetaGetSessionDataStore;
import com.alipay.android.msp.drivers.stores.store.metaevents.MetaIsAppInstalledStore;
import com.alipay.android.msp.drivers.stores.store.metaevents.MetaMspLogCountStore;
import com.alipay.android.msp.drivers.stores.store.metaevents.MetaMspLogErrorStore;
import com.alipay.android.msp.drivers.stores.store.metaevents.MetaMspLogEventStore;
import com.alipay.android.msp.drivers.stores.store.metaevents.MetaMspLogPertStore;
import com.alipay.android.msp.drivers.stores.store.metaevents.MetaOffNotificationStore;
import com.alipay.android.msp.drivers.stores.store.metaevents.MetaOnNotificationStore;
import com.alipay.android.msp.drivers.stores.store.metaevents.MetaOnOutJumpResumeStore;
import com.alipay.android.msp.drivers.stores.store.metaevents.MetaOpenIntentStore;
import com.alipay.android.msp.drivers.stores.store.metaevents.MetaOpenUrlStore;
import com.alipay.android.msp.drivers.stores.store.metaevents.MetaSelectContactStore;
import com.alipay.android.msp.drivers.stores.store.metaevents.MetaSendNotificationStore;
import com.alipay.android.msp.drivers.stores.store.metaevents.MetaSetSessionDataStore;
import com.alipay.android.msp.drivers.stores.store.metaevents.MetaSpmClickedStore;
import com.alipay.android.msp.drivers.stores.store.metaevents.MetaSpmExposureStore;
import com.alipay.android.msp.drivers.stores.store.metaevents.MetaSpmPageCreateStore;
import com.alipay.android.msp.drivers.stores.store.metaevents.MetaSpmPageDestroyStore;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.FlybirdUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.birdnest.api.BirdNestEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import java.util.HashMap;
import tb.xpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class InvokeActionPlugin extends JSPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AYSNC_CALLBACK = "{\"type\":\"async_callback\"}";
    public static final String SHOW_LOADING_STYLE_ALIPAY = "alipay";
    public static final String SHOW_LOADING_STYLE_PLAIN = "plain";
    public static boolean e;
    public static boolean jsPluginRegisterAsync;
    public MspBasePresenter b;
    public final String c;
    public final MspContext d;
    public static HashMap<String, Class<? extends LocalEventStore>> mapTradeJsPlugin = new HashMap<>();
    public static HashMap<String, Class<? extends LocalEventStore>> mapRenderJsPlugin = new HashMap<>();
    public static HashMap<String, InvokeActionPlugin> mapCacheInvokeActionPlugin = new HashMap<>();
    public static HashMap<String, Class<? extends LocalEventStore>> mapTradeJsPluginNecessary = new HashMap<>();
    public static HashMap<String, Class<? extends LocalEventStore>> mapTradeJsPluginAsync = new HashMap<>();

    static {
        jsPluginRegisterAsync = false;
        boolean isJsPluginRegisterAsync = MspContext.isJsPluginRegisterAsync();
        jsPluginRegisterAsync = isJsPluginRegisterAsync;
        if (isJsPluginRegisterAsync) {
            mapTradeJsPluginNecessary.put("submit", SubmitStore.class);
            mapTradeJsPluginNecessary.put(MspEventTypes.ACTION_STRING_REDO, RedoStore.class);
            mapTradeJsPluginNecessary.put("exit", ExitStore.class);
            mapTradeJsPluginNecessary.put("login", LoginStore.class);
            mapTradeJsPluginNecessary.put(MspEventTypes.ACTION_STRING_CASHIERMAIN, CashierMainStore.class);
            mapTradeJsPluginNecessary.put(MspEventTypes.ACTION_STRING_BNVB, BnvbStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_STRING_BNCB, BncbStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_INVOKE_QUERY_EXISTING_ACCOUNTS, QueryAccountsStore.class);
            mapTradeJsPluginAsync.put("rpc", RpcStore.class);
            mapTradeJsPluginAsync.put("http", HttpStore.class);
            mapTradeJsPluginAsync.put("service", ServiceStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_INVOKE_LOC, InvokeLocStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_INVOKE_SPM_CREATE, GetSpmStore.class);
            mapTradeJsPluginAsync.put("location", LocationStore.class);
            mapTradeJsPluginAsync.put("loading", LoadingStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_INVOKE_TPLUPDATE, TplUpdateStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_INVOKE_WIFI_INFO, WifiInfoStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_INVOKE_SCAN_CARD, ScanCardStore.class);
            mapTradeJsPluginAsync.put("showLoading", null);
            mapTradeJsPluginAsync.put("hideLoading", null);
            mapTradeJsPluginAsync.put("preload", PreloadStore.class);
            mapTradeJsPluginAsync.put("verifyIdentity", InvokeVerifyIdentityStore.class);
            mapTradeJsPluginAsync.put("pay", PayStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_INVOKE_QR_GEN, InvokeQrGenStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_INVOKE_QUERY_INFO, InvokeQueryInfoStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_INVOKE_QUERY_SKIN_INFO, InvokeQuerySkinInfoStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_INVOKE_SHOW_PAGE, ShowPageStore.class);
            mapTradeJsPluginAsync.put("alert", AlertStore.class);
            mapTradeJsPluginAsync.put("back", BackStore.class);
            mapTradeJsPluginAsync.put("cache", CacheStore.class);
            mapTradeJsPluginAsync.put("continue", null);
            mapTradeJsPluginAsync.put("destroy", DestroyStore.class);
            mapTradeJsPluginAsync.put("diagnose", DiagnoseStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_STRING_DATABASE, DatabaseStore.class);
            mapTradeJsPluginAsync.put("feedback", FeedbackStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_STRING_FORK, ForkStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_STRING_HIDE_KEYBOARD, HideKeyboardStore.class);
            mapTradeJsPluginAsync.put("log", LogStore.class);
            mapTradeJsPluginAsync.put("none", NoneStore.class);
            mapTradeJsPluginAsync.put("dismiss", NoneStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_STRING_POST_NOTIFICATION, PostNotificationStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_STRING_NOTIFYTPL, NotifyTplStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_STRING_OPENURL, OpenUrlStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_STRING_OPENWEB, OpenWebStore.class);
            mapTradeJsPluginAsync.put("reload", ReloadStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_STRING_SENDCHANNELDATA, SendChannelDataStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_STRING_SHAREPAY, SharePayStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_STRING_SHAREPAYSEL, SharePaySelStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_STRING_SHOWTPL, ShowTplStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_STRING_SWLOAD, SwLoadStore.class);
            mapTradeJsPluginAsync.put("tel", TelStore.class);
            mapTradeJsPluginAsync.put("toast", ToastStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_STRING_WAPPAY, WapPayStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_META_SENDNOTIFICATION, MetaSendNotificationStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_META_OPENURL, MetaOpenUrlStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_META_OPENINTENT, MetaOpenIntentStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_META_IS_APP_INSTALLED, MetaIsAppInstalledStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_META_ON_OUT_JUMP_RESUME, MetaOnOutJumpResumeStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_META_EXIT, MetaExitStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_META_VIBRATE, MetaVibrateStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_META_GETDRMCONFIG, MetaGetDrmConfigStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_META_GETSESSIONDATA, MetaGetSessionDataStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_META_SETSESSIONDATA, MetaSetSessionDataStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_META_GETBIZDATA, MetaGetBizDataStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_META_SPM_PAGE_CREATE, MetaSpmPageCreateStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_META_SPM_PAGE_DESTROY, MetaSpmPageDestroyStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_META_SPM_CLICKED, MetaSpmClickedStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_META_SPM_EXPOSURE, MetaSpmExposureStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_META_MSP_LOG_ERROR, MetaMspLogErrorStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_META_MSP_LOG_PERF, MetaMspLogPertStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_META_MSP_LOG_COUNT, MetaMspLogCountStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_META_MSP_LOG_EVENT, MetaMspLogEventStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_META_ALERT, MetaAlertStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_META_ON_NOTIFICATION, MetaOnNotificationStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_META_OFF_NOTIFICATION, MetaOffNotificationStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_META_SELECT_CONTACT, MetaSelectContactStore.class);
            mapTradeJsPluginAsync.put("snapshot", SnapShotStore.class);
            mapTradeJsPluginAsync.put("copy", CopyStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_STRING_SHARETOKEN, ShareTokenStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_INVOKE_THIRD_PAY, ThirdPayStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_STRING_TRIGGER_PRERENDER, TriggerPrerenderStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_TPL_MSG, TplMsgStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_INVOKE_GATHER_USER_FEEDBACK, GatherUserFeedbackStore.class);
            mapTradeJsPluginAsync.put("auth", AuthStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_STRING_VERIFYID, VerifyIdStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_STRING_VID, VidStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_STRING_SETRESULT, SetResultStore.class);
            mapTradeJsPluginAsync.put(MspEventTypes.ACTION_STRING_RETURNDATA, ReturnDataStore.class);
            mapRenderJsPlugin.put("submit", SubmitStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_STRING_BNCB, BncbStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_STRING_REDO, RedoStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_INVOKE_QUERY_EXISTING_ACCOUNTS, QueryAccountsStore.class);
            mapRenderJsPlugin.put("rpc", RpcStore.class);
            mapRenderJsPlugin.put("http", HttpStore.class);
            mapRenderJsPlugin.put("service", ServiceStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_INVOKE_LOC, InvokeLocStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_INVOKE_SPM_CREATE, GetSpmStore.class);
            mapRenderJsPlugin.put("location", LocationStore.class);
            mapRenderJsPlugin.put("loading", LoadingStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_INVOKE_TPLUPDATE, TplUpdateStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_INVOKE_WIFI_INFO, WifiInfoStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_INVOKE_SCAN_CARD, ScanCardStore.class);
            mapRenderJsPlugin.put("showLoading", null);
            mapRenderJsPlugin.put("hideLoading", null);
            mapRenderJsPlugin.put("preload", PreloadStore.class);
            mapRenderJsPlugin.put("verifyIdentity", InvokeVerifyIdentityStore.class);
            mapRenderJsPlugin.put("pay", PayStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_INVOKE_QR_GEN, InvokeQrGenStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_INVOKE_QUERY_INFO, InvokeQueryInfoStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_INVOKE_QUERY_SKIN_INFO, InvokeQuerySkinInfoStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_INVOKE_SHOW_PAGE, ShowPageStore.class);
            mapRenderJsPlugin.put("alert", AlertStore.class);
            mapRenderJsPlugin.put("back", BackStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_STRING_BNVB, BnvbStore.class);
            mapRenderJsPlugin.put("cache", CacheStore.class);
            mapRenderJsPlugin.put("continue", null);
            mapRenderJsPlugin.put("destroy", DestroyStore.class);
            mapRenderJsPlugin.put("diagnose", DiagnoseStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_STRING_DATABASE, DatabaseStore.class);
            mapRenderJsPlugin.put("exit", ExitStore.class);
            mapRenderJsPlugin.put("feedback", FeedbackStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_STRING_FORK, ForkStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_STRING_HIDE_KEYBOARD, HideKeyboardStore.class);
            mapRenderJsPlugin.put("log", LogStore.class);
            mapRenderJsPlugin.put("login", LoginStore.class);
            mapRenderJsPlugin.put("none", NoneStore.class);
            mapRenderJsPlugin.put("dismiss", NoneStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_STRING_POST_NOTIFICATION, PostNotificationStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_STRING_NOTIFYTPL, NotifyTplStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_STRING_OPENURL, OpenUrlStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_STRING_OPENWEB, OpenWebStore.class);
            mapRenderJsPlugin.put("reload", ReloadStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_STRING_SENDCHANNELDATA, SendChannelDataStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_STRING_SHAREPAY, SharePayStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_STRING_SHAREPAYSEL, SharePaySelStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_STRING_SHOWTPL, ShowTplStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_STRING_SWLOAD, SwLoadStore.class);
            mapRenderJsPlugin.put("tel", TelStore.class);
            mapRenderJsPlugin.put("toast", ToastStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_STRING_WAPPAY, WapPayStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_META_SENDNOTIFICATION, MetaSendNotificationStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_META_OPENURL, MetaOpenUrlStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_META_OPENINTENT, MetaOpenIntentStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_META_IS_APP_INSTALLED, MetaIsAppInstalledStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_META_ON_OUT_JUMP_RESUME, MetaOnOutJumpResumeStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_META_EXIT, MetaExitStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_META_VIBRATE, MetaVibrateStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_META_GETDRMCONFIG, MetaGetDrmConfigStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_META_GETSESSIONDATA, MetaGetSessionDataStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_META_SETSESSIONDATA, MetaSetSessionDataStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_META_GETBIZDATA, MetaGetBizDataStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_META_SPM_PAGE_CREATE, MetaSpmPageCreateStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_META_SPM_PAGE_DESTROY, MetaSpmPageDestroyStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_META_SPM_CLICKED, MetaSpmClickedStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_META_SPM_EXPOSURE, MetaSpmExposureStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_META_MSP_LOG_ERROR, MetaMspLogErrorStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_META_MSP_LOG_PERF, MetaMspLogPertStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_META_MSP_LOG_COUNT, MetaMspLogCountStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_META_MSP_LOG_EVENT, MetaMspLogEventStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_META_ALERT, MetaAlertStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_META_ON_NOTIFICATION, MetaOnNotificationStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_META_OFF_NOTIFICATION, MetaOffNotificationStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_META_SELECT_CONTACT, MetaSelectContactStore.class);
            mapRenderJsPlugin.put("snapshot", SnapShotStore.class);
            mapRenderJsPlugin.put("copy", CopyStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_STRING_SHARETOKEN, ShareTokenStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_INVOKE_THIRD_PAY, ThirdPayStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_STRING_TRIGGER_PRERENDER, TriggerPrerenderStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_TPL_MSG, TplMsgStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_INVOKE_GATHER_USER_FEEDBACK, GatherUserFeedbackStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_STRING_SETRESULT, InvokeSetResultStore.class);
            mapRenderJsPlugin.put(MspEventTypes.ACTION_STRING_RETURNDATA, ContainerReturnDataStore.class);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("submit", SubmitStore.class);
        hashMap.put(MspEventTypes.ACTION_STRING_BNCB, BncbStore.class);
        hashMap.put(MspEventTypes.ACTION_STRING_REDO, RedoStore.class);
        hashMap.put(MspEventTypes.ACTION_INVOKE_QUERY_EXISTING_ACCOUNTS, QueryAccountsStore.class);
        hashMap.put("rpc", RpcStore.class);
        hashMap.put("http", HttpStore.class);
        hashMap.put("service", ServiceStore.class);
        hashMap.put(MspEventTypes.ACTION_INVOKE_LOC, InvokeLocStore.class);
        hashMap.put(MspEventTypes.ACTION_INVOKE_SPM_CREATE, GetSpmStore.class);
        hashMap.put("location", LocationStore.class);
        hashMap.put("loading", LoadingStore.class);
        hashMap.put(MspEventTypes.ACTION_INVOKE_TPLUPDATE, TplUpdateStore.class);
        hashMap.put(MspEventTypes.ACTION_INVOKE_WIFI_INFO, WifiInfoStore.class);
        hashMap.put(MspEventTypes.ACTION_INVOKE_SCAN_CARD, ScanCardStore.class);
        hashMap.put("showLoading", null);
        hashMap.put("hideLoading", null);
        hashMap.put("preload", PreloadStore.class);
        hashMap.put("verifyIdentity", InvokeVerifyIdentityStore.class);
        hashMap.put("pay", PayStore.class);
        hashMap.put(MspEventTypes.ACTION_INVOKE_QR_GEN, InvokeQrGenStore.class);
        hashMap.put(MspEventTypes.ACTION_INVOKE_QUERY_INFO, InvokeQueryInfoStore.class);
        hashMap.put(MspEventTypes.ACTION_INVOKE_QUERY_SKIN_INFO, InvokeQuerySkinInfoStore.class);
        hashMap.put(MspEventTypes.ACTION_INVOKE_SHOW_PAGE, ShowPageStore.class);
        hashMap.put("alert", AlertStore.class);
        hashMap.put("back", BackStore.class);
        hashMap.put(MspEventTypes.ACTION_STRING_BNVB, BnvbStore.class);
        hashMap.put("cache", CacheStore.class);
        hashMap.put("continue", null);
        hashMap.put("destroy", DestroyStore.class);
        hashMap.put("diagnose", DiagnoseStore.class);
        hashMap.put(MspEventTypes.ACTION_STRING_DATABASE, DatabaseStore.class);
        hashMap.put("exit", ExitStore.class);
        hashMap.put("feedback", FeedbackStore.class);
        hashMap.put(MspEventTypes.ACTION_STRING_FORK, ForkStore.class);
        hashMap.put(MspEventTypes.ACTION_STRING_HIDE_KEYBOARD, HideKeyboardStore.class);
        hashMap.put("log", LogStore.class);
        hashMap.put("login", LoginStore.class);
        hashMap.put("none", NoneStore.class);
        hashMap.put("dismiss", NoneStore.class);
        hashMap.put(MspEventTypes.ACTION_STRING_POST_NOTIFICATION, PostNotificationStore.class);
        hashMap.put(MspEventTypes.ACTION_STRING_NOTIFYTPL, NotifyTplStore.class);
        hashMap.put(MspEventTypes.ACTION_STRING_OPENURL, OpenUrlStore.class);
        hashMap.put(MspEventTypes.ACTION_STRING_OPENWEB, OpenWebStore.class);
        hashMap.put("reload", ReloadStore.class);
        hashMap.put(MspEventTypes.ACTION_STRING_SENDCHANNELDATA, SendChannelDataStore.class);
        hashMap.put(MspEventTypes.ACTION_STRING_SHAREPAY, SharePayStore.class);
        hashMap.put(MspEventTypes.ACTION_STRING_SHAREPAYSEL, SharePaySelStore.class);
        hashMap.put(MspEventTypes.ACTION_STRING_SHOWTPL, ShowTplStore.class);
        hashMap.put(MspEventTypes.ACTION_STRING_SWLOAD, SwLoadStore.class);
        hashMap.put("tel", TelStore.class);
        hashMap.put("toast", ToastStore.class);
        hashMap.put(MspEventTypes.ACTION_STRING_WAPPAY, WapPayStore.class);
        hashMap.put(MspEventTypes.ACTION_META_SENDNOTIFICATION, MetaSendNotificationStore.class);
        hashMap.put(MspEventTypes.ACTION_META_OPENURL, MetaOpenUrlStore.class);
        hashMap.put(MspEventTypes.ACTION_META_OPENINTENT, MetaOpenIntentStore.class);
        hashMap.put(MspEventTypes.ACTION_META_IS_APP_INSTALLED, MetaIsAppInstalledStore.class);
        hashMap.put(MspEventTypes.ACTION_META_ON_OUT_JUMP_RESUME, MetaOnOutJumpResumeStore.class);
        hashMap.put(MspEventTypes.ACTION_META_EXIT, MetaExitStore.class);
        hashMap.put(MspEventTypes.ACTION_META_VIBRATE, MetaVibrateStore.class);
        hashMap.put(MspEventTypes.ACTION_META_GETDRMCONFIG, MetaGetDrmConfigStore.class);
        hashMap.put(MspEventTypes.ACTION_META_GETSESSIONDATA, MetaGetSessionDataStore.class);
        hashMap.put(MspEventTypes.ACTION_META_SETSESSIONDATA, MetaSetSessionDataStore.class);
        hashMap.put(MspEventTypes.ACTION_META_GETBIZDATA, MetaGetBizDataStore.class);
        hashMap.put(MspEventTypes.ACTION_META_SPM_PAGE_CREATE, MetaSpmPageCreateStore.class);
        hashMap.put(MspEventTypes.ACTION_META_SPM_PAGE_DESTROY, MetaSpmPageDestroyStore.class);
        hashMap.put(MspEventTypes.ACTION_META_SPM_CLICKED, MetaSpmClickedStore.class);
        hashMap.put(MspEventTypes.ACTION_META_SPM_EXPOSURE, MetaSpmExposureStore.class);
        hashMap.put(MspEventTypes.ACTION_META_MSP_LOG_ERROR, MetaMspLogErrorStore.class);
        hashMap.put(MspEventTypes.ACTION_META_MSP_LOG_PERF, MetaMspLogPertStore.class);
        hashMap.put(MspEventTypes.ACTION_META_MSP_LOG_COUNT, MetaMspLogCountStore.class);
        hashMap.put(MspEventTypes.ACTION_META_MSP_LOG_EVENT, MetaMspLogEventStore.class);
        hashMap.put(MspEventTypes.ACTION_META_ALERT, MetaAlertStore.class);
        hashMap.put(MspEventTypes.ACTION_META_ON_NOTIFICATION, MetaOnNotificationStore.class);
        hashMap.put(MspEventTypes.ACTION_META_OFF_NOTIFICATION, MetaOffNotificationStore.class);
        hashMap.put(MspEventTypes.ACTION_META_SELECT_CONTACT, MetaSelectContactStore.class);
        hashMap.put("snapshot", SnapShotStore.class);
        hashMap.put("copy", CopyStore.class);
        hashMap.put(MspEventTypes.ACTION_STRING_SHARETOKEN, ShareTokenStore.class);
        hashMap.put(MspEventTypes.ACTION_INVOKE_THIRD_PAY, ThirdPayStore.class);
        hashMap.put(MspEventTypes.ACTION_STRING_TRIGGER_PRERENDER, TriggerPrerenderStore.class);
        hashMap.put(MspEventTypes.ACTION_TPL_MSG, TplMsgStore.class);
        hashMap.put(MspEventTypes.ACTION_INVOKE_GATHER_USER_FEEDBACK, GatherUserFeedbackStore.class);
        mapTradeJsPlugin.put("auth", AuthStore.class);
        mapTradeJsPlugin.put(MspEventTypes.ACTION_STRING_CASHIERMAIN, CashierMainStore.class);
        mapTradeJsPlugin.put(MspEventTypes.ACTION_STRING_VERIFYID, VerifyIdStore.class);
        mapTradeJsPlugin.put(MspEventTypes.ACTION_STRING_VID, VidStore.class);
        mapTradeJsPlugin.put(MspEventTypes.ACTION_STRING_SETRESULT, SetResultStore.class);
        mapTradeJsPlugin.put(MspEventTypes.ACTION_STRING_RETURNDATA, ReturnDataStore.class);
        mapTradeJsPlugin.putAll(hashMap);
        mapRenderJsPlugin.put(MspEventTypes.ACTION_STRING_SETRESULT, InvokeSetResultStore.class);
        mapRenderJsPlugin.put(MspEventTypes.ACTION_STRING_RETURNDATA, ContainerReturnDataStore.class);
        mapRenderJsPlugin.putAll(hashMap);
    }

    public InvokeActionPlugin(String str, MspContext mspContext) {
        this.d = mspContext;
        this.c = str;
        MspBasePresenter mspBasePresenter = mspContext.getMspBasePresenter();
        if (mspBasePresenter != null && mspBasePresenter.getIView() != null) {
            this.b = mspBasePresenter;
            setContext(mspBasePresenter.getActivity());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
        if (com.alipay.android.msp.framework.helper.MspExperimentHelper.configHit((com.alipay.android.msp.core.context.MspTradeContext) r9, "MQP_INVOKE_ACTION_ABORT") != false) goto L_0x0070;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(com.alipay.android.msp.core.context.MspContext r9, com.alipay.android.msp.ui.presenters.MspBasePresenter r10, java.lang.String r11, java.lang.String r12, com.flybird.FBDocument r13, long r14) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.actions.InvokeActionPlugin.a(com.alipay.android.msp.core.context.MspContext, com.alipay.android.msp.ui.presenters.MspBasePresenter, java.lang.String, java.lang.String, com.flybird.FBDocument, long):java.lang.Object");
    }

    public static synchronized void addInvokeAPIFactory(Context context) {
        synchronized (InvokeActionPlugin.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9facead8", new Object[]{context});
            } else if (!e) {
                e = true;
                LogUtil.record(2, "InvokeActionPlugin:addInvokeAPIFactory", "context=".concat(String.valueOf(context)));
                JSPluginManager.getInstanse().addJsPluginFactory(new JsPluginFactory() { // from class: com.alipay.android.msp.drivers.actions.InvokeActionPlugin.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.android.app.template.JsPluginFactory
                    public JSPlugin createJsPlugin(Context context2, JSPlugin.FromCall fromCall, String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (JSPlugin) ipChange2.ipc$dispatch("8798f317", new Object[]{this, context2, fromCall, str});
                        }
                        LogUtil.record(2, "InvokeActionPlugin:createJsPlugin", "context=" + context2 + " , actionName=" + str);
                        if (TextUtils.equals(str, "feedback")) {
                            return new FeedbackApi();
                        }
                        if (TextUtils.equals(str, MspEventTypes.ACTION_STRING_DATABASE)) {
                            return new DatabaseApi();
                        }
                        if (TextUtils.equals(str, MspEventTypes.ACTION_TPL_MSG)) {
                            return new TplMsgApi();
                        }
                        return null;
                    }
                });
            }
        }
    }

    public static /* synthetic */ Object ipc$super(InvokeActionPlugin invokeActionPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/actions/InvokeActionPlugin");
    }

    public static boolean isJsPluginRegisterAsync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5120dd1e", new Object[0])).booleanValue();
        }
        return jsPluginRegisterAsync;
    }

    public static void registerAsyncTradeLocalInvokeFamily(MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("176d52f9", new Object[]{mspContext});
            return;
        }
        LogUtil.record(2, "InvokeActionPlugin:registerAsyncTradeLocalInvokeFamily", "");
        if (mspContext != null) {
            int bizId = mspContext.getBizId();
            for (String str : mapTradeJsPluginAsync.keySet()) {
                registerMspLocalJsPlugin(bizId, str, mapTradeJsPluginAsync.get(str));
            }
        }
    }

    public static void registerBnJsPlugin(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac8f87b", new Object[]{new Integer(i), str});
            return;
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
        if (mspContextByBizId != null && mspContextByBizId.getStoreCenter() != null) {
            boolean d = d(str);
            MspBasePresenter mspBasePresenter = mspContextByBizId.getMspBasePresenter();
            String concat = "alias-".concat(String.valueOf(str));
            if (mspBasePresenter == null || mspBasePresenter.getIView() == null) {
                if (!mapCacheInvokeActionPlugin.containsKey(str)) {
                    mapCacheInvokeActionPlugin.put(str, new InvokeActionPlugin(str, mspContextByBizId));
                }
                if (d && !mapCacheInvokeActionPlugin.containsKey(concat)) {
                    mapCacheInvokeActionPlugin.put(concat, new InvokeActionPlugin(concat, mspContextByBizId));
                    return;
                }
                return;
            }
            if (!c(mspContextByBizId.getContext(), str)) {
                InvokeActionPlugin remove = mapCacheInvokeActionPlugin.remove(str);
                if (remove != null) {
                    remove.b(mspBasePresenter);
                } else {
                    remove = new InvokeActionPlugin(str, mspContextByBizId);
                }
                JSPluginManager.getInstanse().registerJSPlugin(remove);
            }
            if (d && !c(mspContextByBizId.getContext(), concat)) {
                InvokeActionPlugin remove2 = mapCacheInvokeActionPlugin.remove(concat);
                if (remove2 != null) {
                    remove2.b(mspBasePresenter);
                } else {
                    remove2 = new InvokeActionPlugin(concat, mspContextByBizId);
                }
                JSPluginManager.getInstanse().registerJSPlugin(remove2);
            }
        }
    }

    public static void registerNecessaryTradeLocalInvokeFamily(MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f156ed8c", new Object[]{mspContext});
            return;
        }
        LogUtil.record(2, "InvokeActionPlugin:registerNecessaryTradeLocalInvokeFamily", "");
        if (mspContext != null) {
            int bizId = mspContext.getBizId();
            for (String str : mapTradeJsPluginNecessary.keySet()) {
                registerMspLocalJsPlugin(bizId, str, mapTradeJsPluginNecessary.get(str));
            }
            FlybirdUtil.registerPublicMspInvokeFamily(bizId);
        }
    }

    public static void registerRenderBnInvokeFamily(MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914de85e", new Object[]{mspContext});
            return;
        }
        LogUtil.record(2, "InvokeActionPlugin:registerRenderBnInvokeFamily", "");
        if (mspContext != null) {
            int bizId = mspContext.getBizId();
            for (String str : mapRenderJsPlugin.keySet()) {
                registerBnJsPlugin(bizId, str);
            }
            FlybirdUtil.registerPublicBnInvokeFamily(bizId);
        }
    }

    public static void registerRenderLocalInvokeFamily(MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b6c4eb", new Object[]{mspContext});
            return;
        }
        LogUtil.record(2, "InvokeActionPlugin:registerRenderLocalInvokeFamily", "");
        if (mspContext != null) {
            int bizId = mspContext.getBizId();
            for (String str : mapRenderJsPlugin.keySet()) {
                registerMspLocalJsPlugin(bizId, str, mapRenderJsPlugin.get(str));
            }
            FlybirdUtil.registerPublicMspInvokeFamily(bizId);
        }
    }

    public static void registerTradeBnInvokeFamily(MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8798c6", new Object[]{mspContext});
            return;
        }
        LogUtil.record(2, "InvokeActionPlugin:registerTradeBnInvokeFamily", "");
        if (mspContext != null) {
            int bizId = mspContext.getBizId();
            if (!isJsPluginRegisterAsync()) {
                for (String str : mapTradeJsPlugin.keySet()) {
                    registerBnJsPlugin(bizId, str);
                }
            } else {
                for (String str2 : mapTradeJsPluginNecessary.keySet()) {
                    registerBnJsPlugin(bizId, str2);
                }
                for (String str3 : mapTradeJsPluginAsync.keySet()) {
                    registerBnJsPlugin(bizId, str3);
                }
            }
            FlybirdUtil.registerPublicBnInvokeFamily(bizId);
        }
    }

    public static void registerTradeLocalInvokeFamily(MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a0e5b83", new Object[]{mspContext});
            return;
        }
        LogUtil.record(2, "InvokeActionPlugin:registerTradeLocalInvokeFamily", "");
        if (mspContext != null) {
            int bizId = mspContext.getBizId();
            for (String str : mapTradeJsPlugin.keySet()) {
                registerMspLocalJsPlugin(bizId, str, mapTradeJsPlugin.get(str));
            }
            FlybirdUtil.registerPublicMspInvokeFamily(bizId);
        }
    }

    public final void b(MspBasePresenter mspBasePresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ab5867", new Object[]{this, mspBasePresenter});
            return;
        }
        setContext(mspBasePresenter.getActivity());
        this.b = mspBasePresenter;
    }

    @Override // com.alipay.android.app.template.JSPlugin
    public String pluginName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a669a95b", new Object[]{this});
        }
        return this.c;
    }

    public static void registerMspLocalJsPluginWithPluginName(MspContext mspContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27914f2b", new Object[]{mspContext, str});
            return;
        }
        LogUtil.record(2, "InvokeActionPlugin:registerMspLocalJsPluginWithPluginName", "pluginName-".concat(String.valueOf(str)));
        if (mspContext != null) {
            int bizId = mspContext.getBizId();
            if (mapTradeJsPluginAsync.containsKey(str)) {
                registerMspLocalJsPlugin(bizId, str, mapTradeJsPluginAsync.get(str));
            } else if (mapTradeJsPluginNecessary.containsKey(str)) {
                registerMspLocalJsPlugin(bizId, str, mapTradeJsPluginNecessary.get(str));
            }
        }
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{str})).booleanValue();
        }
        return TextUtils.isEmpty(str) || TextUtils.equals(str, "rpc");
    }

    public static void registerMspLocalJsPlugin(int i, String str, Class<? extends LocalEventStore> cls) {
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
        if (mspContextByBizId != null && mspContextByBizId.getStoreCenter() != null) {
            boolean d = d(str);
            String concat = "alias-".concat(String.valueOf(str));
            LogUtil.record(2, "InvokeActionPlugin:registerMspLocalJsPlugin", "pluginName=" + str + " , needRegisterAlias=" + d);
            LocalEventStore jsPlugin = mspContextByBizId.getStoreCenter().getJsPlugin(str);
            if (jsPlugin != null) {
                jsPlugin.initWithContext();
                return;
            }
            if (cls != null) {
                try {
                    jsPlugin = (LocalEventStore) cls.getConstructor(Integer.TYPE).newInstance(Integer.valueOf(i));
                } catch (Throwable th) {
                    LogUtil.record(8, "InvokeActionPlugin:registerMspLocalJsPlugin", "");
                    StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "registerMspLocalJsPlugin error", th);
                    LogUtil.printExceptionStackTrace(th);
                }
            }
            mspContextByBizId.getStoreCenter().registerJSPlugin(str, jsPlugin);
            if (d) {
                mspContextByBizId.getStoreCenter().registerJSPlugin(concat, jsPlugin);
            }
        }
    }

    public static boolean c(Context context, String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        JSPlugin registeredPlugin = JSPluginManager.getInstanse().getRegisteredPlugin(context, JSPlugin.FromCall.INVOKE, str, false);
        if (registeredPlugin == null || registeredPlugin.getContextHashCode() != context.hashCode()) {
            z = false;
        }
        LogUtil.record(2, "InvokeActionPlugin:isBnJsPluginRegistered", "pluginName=" + str + " , registered=" + z);
        return z;
    }

    @Override // com.alipay.android.app.template.JSPlugin
    public Object execute(JSPlugin.FromCall fromCall, String str, String str2, FBDocument fBDocument, long j, Context context) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("796c594e", new Object[]{this, fromCall, str, str2, fBDocument, new Long(j), context});
        }
        LogUtil.i("InvokeActionPlugin", xpc.RECORD_EXECUTE, str + " " + str2);
        if (fBDocument != null) {
            BirdNestEngine.Params params = fBDocument.param;
            if (params != null) {
                try {
                    i = Integer.parseInt(params.businessId);
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                    i = -1;
                }
                MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
                if (mspContextByBizId != null) {
                    MspBasePresenter mspBasePresenter = mspContextByBizId.getMspBasePresenter();
                    if (mspBasePresenter != null) {
                        return a(mspContextByBizId, mspBasePresenter, str, str2, fBDocument, j);
                    }
                    LogUtil.w("InvokeActionPlugin", xpc.RECORD_EXECUTE, "missing pre");
                } else {
                    LogUtil.w("InvokeActionPlugin", xpc.RECORD_EXECUTE, "missing ctx");
                }
            } else {
                LogUtil.w("InvokeActionPlugin", xpc.RECORD_EXECUTE, "missing args");
            }
        } else {
            LogUtil.w("InvokeActionPlugin", xpc.RECORD_EXECUTE, "missing doc");
        }
        if (TextUtils.equals(str, "feedback")) {
            return new FeedbackApi().execute(fromCall, str, str2, fBDocument, j, context);
        }
        if (TextUtils.equals(str, MspEventTypes.ACTION_STRING_DATABASE)) {
            return new DatabaseApi().execute(fromCall, str, str2, fBDocument, j, context);
        }
        if (TextUtils.equals(str, MspEventTypes.ACTION_TPL_MSG)) {
            return new TplMsgApi().execute(fromCall, str, str2, fBDocument, j, context);
        }
        if (TextUtils.equals(str, "rpc")) {
            return new RpcApi().execute(fromCall, str, str2, fBDocument, j, context);
        }
        return a(this.d, this.b, str, str2, fBDocument, j);
    }
}
