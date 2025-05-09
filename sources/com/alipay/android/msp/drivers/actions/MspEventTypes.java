package com.alipay.android.msp.drivers.actions;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface MspEventTypes {
    public static final String ACTION_INVOKE_GATHER_USER_FEEDBACK = "gatherUserFeedback";
    public static final String ACTION_INVOKE_HIDE_LOADING = "hideLoading";
    public static final String ACTION_INVOKE_HTTP = "http";
    public static final String ACTION_INVOKE_LOC = "loc";
    public static final String ACTION_INVOKE_LOCATION = "location";
    public static final String ACTION_INVOKE_MOBILE_AI = "mobileai";
    public static final String ACTION_INVOKE_PAY = "pay";
    public static final String ACTION_INVOKE_PRELOAD = "preload";
    public static final String ACTION_INVOKE_QR_GEN = "qrGen";
    public static final String ACTION_INVOKE_QUERY_EXISTING_ACCOUNTS = "queryExistingAccounts";
    public static final String ACTION_INVOKE_QUERY_INFO = "queryInfo";
    public static final String ACTION_INVOKE_QUERY_SKIN_INFO = "querySkinInfo";
    public static final String ACTION_INVOKE_QUESTIONNAIRE = "questionnaire";
    public static final String ACTION_INVOKE_RPC = "rpc";
    public static final String ACTION_INVOKE_SCAN_CARD = "scanCard";
    public static final String ACTION_INVOKE_SERVICE = "service";
    public static final String ACTION_INVOKE_SHOW_LOADING = "showLoading";
    public static final String ACTION_INVOKE_SHOW_PAGE = "showPage";
    public static final String ACTION_INVOKE_SPM_CREATE = "getSPM";
    public static final String ACTION_INVOKE_THIRD_PAY = "thirdpay";
    public static final String ACTION_INVOKE_TPLUPDATE = "tplupdate";
    public static final String ACTION_INVOKE_VERIFTY_INDENTITY = "verifyIdentity";
    public static final String ACTION_INVOKE_VOICE_RECOGNIZE = "voiceRecognize";
    public static final String ACTION_INVOKE_WIFI_INFO = "wifiInfo";
    public static final String ACTION_META_ALERT = "meta-alert";
    public static final String ACTION_META_EXIT = "meta-exit";
    public static final String ACTION_META_GETBIZDATA = "meta-getBizData";
    public static final String ACTION_META_GETDRMCONFIG = "meta-getDRMConfig";
    public static final String ACTION_META_GETSESSIONDATA = "meta-getSessionData";
    public static final String ACTION_META_IS_APP_INSTALLED = "meta-isAppInstalled";
    public static final String ACTION_META_MSP_LOG_COUNT = "meta-mspLogCount";
    public static final String ACTION_META_MSP_LOG_ERROR = "meta-mspLogError";
    public static final String ACTION_META_MSP_LOG_EVENT = "meta-mspLogEvent";
    public static final String ACTION_META_MSP_LOG_PERF = "meta-mspLogPerf";
    public static final String ACTION_META_OFF_NOTIFICATION = "meta-offNotification";
    public static final String ACTION_META_ON_NOTIFICATION = "meta-onNotification";
    public static final String ACTION_META_ON_OUT_JUMP_RESUME = "meta-onOutJumpResume";
    public static final String ACTION_META_OPENINTENT = "meta-openIntent";
    public static final String ACTION_META_OPENURL = "meta-openURL";
    public static final String ACTION_META_SELECT_CONTACT = "meta-selectContact";
    public static final String ACTION_META_SENDNOTIFICATION = "meta-sendNotification";
    public static final String ACTION_META_SETSESSIONDATA = "meta-setSessionData";
    public static final String ACTION_META_SPM_CLICKED = "meta-spmClicked";
    public static final String ACTION_META_SPM_EXPOSURE = "meta-spmExposure";
    public static final String ACTION_META_SPM_PAGE_CREATE = "meta-spmPageCreate";
    public static final String ACTION_META_SPM_PAGE_DESTROY = "meta-spmPageDestroy";
    public static final String ACTION_META_VIBRATE = "meta-vibrate";
    public static final String ACTION_STRING_ALERT = "alert";
    public static final String ACTION_STRING_ALIPAY = "alipay";
    public static final String ACTION_STRING_AUTH = "auth";
    public static final String ACTION_STRING_BACK = "back";
    public static final String ACTION_STRING_BNCB = "bncb";
    public static final String ACTION_STRING_BNVB = "bnvb";
    public static final String ACTION_STRING_CACHE = "cache";
    public static final String ACTION_STRING_CASHIERMAIN = "cashiermain";
    public static final String ACTION_STRING_CONTINUE = "continue";
    public static final String ACTION_STRING_COPY = "copy";
    public static final String ACTION_STRING_DATABASE = "database";
    public static final String ACTION_STRING_DESTROY = "destroy";
    public static final String ACTION_STRING_DIAGNOSE = "diagnose";
    public static final String ACTION_STRING_DISMISS = "dismiss";
    public static final String ACTION_STRING_EXIT = "exit";
    public static final String ACTION_STRING_FEEDBACK = "feedback";
    public static final String ACTION_STRING_FORK = "fork";
    public static final String ACTION_STRING_HIDE_KEYBOARD = "hideKeyboard";
    public static final String ACTION_STRING_LOADING = "loading";
    public static final String ACTION_STRING_LOG = "log";
    public static final String ACTION_STRING_LOGIN = "login";
    public static final String ACTION_STRING_NATIVE_INVOKE = "nativeinvoke";
    public static final String ACTION_STRING_NONE = "none";
    public static final String ACTION_STRING_NOTIFYTPL = "notifytpl";
    public static final String ACTION_STRING_OCR = "ocr";
    public static final String ACTION_STRING_OPENURL = "openurl";
    public static final String ACTION_STRING_OPENWEB = "openweb";
    public static final String ACTION_STRING_POST_NOTIFICATION = "postNotification";
    public static final String ACTION_STRING_REDO = "redo";
    public static final String ACTION_STRING_RELOAD = "reload";
    public static final String ACTION_STRING_RETURNDATA = "returnData";
    public static final String ACTION_STRING_SCAN = "scan";
    public static final String ACTION_STRING_SENDCHANNELDATA = "sendChannelData";
    public static final String ACTION_STRING_SETRESULT = "setResult";
    public static final String ACTION_STRING_SHARE = "share";
    public static final String ACTION_STRING_SHAREPAY = "shareppay";
    public static final String ACTION_STRING_SHAREPAYPROXY = "shareppayproxy";
    public static final String ACTION_STRING_SHAREPAYSEL = "shareppaysel";
    public static final String ACTION_STRING_SHARETOKEN = "sharetoken";
    public static final String ACTION_STRING_SHOWTPL = "showTpl";
    public static final String ACTION_STRING_SNAPSHOT = "snapshot";
    public static final String ACTION_STRING_STANDARDPAY = "standardpay";
    public static final String ACTION_STRING_SUBMIT = "submit";
    public static final String ACTION_STRING_SWLOAD = "swload";
    public static final String ACTION_STRING_TEL = "tel";
    public static final String ACTION_STRING_TOAST = "toast";
    public static final String ACTION_STRING_TRIGGER_PRERENDER = "triggerPrerender";
    public static final String ACTION_STRING_VERIFYID = "verifyid";
    public static final String ACTION_STRING_VID = "vid";
    public static final String ACTION_STRING_WAPPAY = "wappay";
    public static final String ACTION_TPL_MSG = "tplmsg";
    public static final String ACTION_TPL_UPLOAD_LOG = "uploadLog";
}
