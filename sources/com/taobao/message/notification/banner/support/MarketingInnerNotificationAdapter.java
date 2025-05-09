package com.taobao.message.notification.banner.support;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.UTMini;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.nav.Nav;
import com.taobao.message.notification.banner.InnerNotificationAdapter;
import com.taobao.message.notification.banner.InnerPushVO;
import com.taobao.message.notification.banner.dx.DXTemplateItemFetcher;
import com.taobao.message.notification.banner.dx.DXTemplateVO;
import com.taobao.message.notification.banner.dx.DynamicSimpleComponent;
import com.taobao.message.notification.banner.dx.DynamicSimpleProps;
import com.taobao.message.notification.banner.dx.TapEventHandlerProxy;
import com.taobao.message.notification.banner.view.DefaultBannerView;
import com.taobao.message.notification.banner.view.NotificationBannerHelper;
import com.taobao.message.notification.openPushAbility.OpenPushProvider;
import com.taobao.message.notification.openPushAbility.OpenPushService;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.message.notification.util.ParseUtil;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import tb.ob5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MarketingInnerNotificationAdapter extends InnerNotificationAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IN_APP_PUSH = "inAppPush";
    public static final String KEY_IS_INAPPPUSH = "is_in_app";
    public static final String KEY_PUSHUTARGS = "pushUtArgs";
    public static final String ORANGE_CONFIG_BUSINESS = "mpm_business_switch";
    private static final String TAG = "OfficalNotification";
    private static LruCache<String, Long> mClickMap = new LruCache<>(32);
    private static volatile TapHandler mTapHandler;
    private JSONObject agooJSONObject;
    private JSONObject inAppPushTemplateData;
    private Integer inAppPushTemplateId;
    private String mAgooId;
    private JSONObject mBizParams;
    private String mCheckBizCode;
    private DynamicSimpleComponent mDynamicComponent;
    private String mMsgId;
    private JSONObject mNativeStyle;
    private String mPushUTArgs;
    public long mTime;
    public String msgTypeId;
    private boolean stateNew = true;
    private boolean mShowSystemNotification = true;
    private Map<String, String> extData = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class AccountMessageTypeIdValue {
        public static final String MESSAGE_TYPE_ID_HUDONG = "20141013170024";
        public static final String MESSAGE_TYPE_ID_TONGZHI = "1002";
        public static final String MESSAGE_TYPE_ID_WULIU = "821";
        public static final String MESSAGE_TYPE_ID_YOUHUI = "1556181449297";

        static {
            t2o.a(610271259);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class RelationBizTypeValue {
        public static final String ACCOUNT_HUDONG = "20423";
        public static final String ACCOUNT_PINGTAI = "20007";
        public static final String ACCOUNT_TONGZHI = "20422";
        public static final String ACCOUNT_WULIU = "20421";
        public static final String ACCOUNT_YOUHUI = "20424";

        static {
            t2o.a(610271260);
        }
    }

    static {
        t2o.a(610271258);
    }

    public static /* synthetic */ boolean access$000(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38fae185", new Object[]{str})).booleanValue();
        }
        return isClickedIn1s(str);
    }

    public static /* synthetic */ void access$100(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2b2e82", new Object[]{str});
        } else {
            setClicked(str);
        }
    }

    public static /* synthetic */ String access$200(Map map, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("69b818b8", new Object[]{map, bundle});
        }
        return actualClick(map, bundle);
    }

    public static /* synthetic */ void access$300(String str, String str2, Map map, Map map2, String str3, Integer num, boolean z, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf23be3f", new Object[]{str, str2, map, map2, str3, num, new Boolean(z), str4});
        } else {
            actrualPerformUTClick(str, str2, map, map2, str3, num, z, str4);
        }
    }

    private static String getAgooId(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba8b588e", new Object[]{str, str2});
        }
        return (TextUtils.isEmpty(str) || !"1".equals(OrangeConfig.getInstance().getConfig("mpm_business_switch", "useNewClickId", "1"))) ? str2 : str;
    }

    private static String getImbaBizTypeVal(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1445ee2", new Object[]{str});
        }
        if (TextUtils.equals(str, AccountMessageTypeIdValue.MESSAGE_TYPE_ID_WULIU)) {
            return RelationBizTypeValue.ACCOUNT_WULIU;
        }
        if (TextUtils.equals(str, "1002")) {
            return RelationBizTypeValue.ACCOUNT_TONGZHI;
        }
        if (TextUtils.equals(str, AccountMessageTypeIdValue.MESSAGE_TYPE_ID_HUDONG)) {
            return RelationBizTypeValue.ACCOUNT_HUDONG;
        }
        if (TextUtils.equals(str, AccountMessageTypeIdValue.MESSAGE_TYPE_ID_YOUHUI)) {
            return RelationBizTypeValue.ACCOUNT_YOUHUI;
        }
        return null;
    }

    private View getOldView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d21169bf", new Object[]{this});
        }
        this.stateNew = false;
        Context applicationContext = this.mContext.getApplicationContext();
        InnerPushVO innerPushVO = this.mVO;
        DefaultBannerView build = DefaultBannerView.build(applicationContext, innerPushVO.iconUrl, innerPushVO.title, innerPushVO.content, this.mTime, innerPushVO.img);
        if (this.mCheckBizCode != null) {
            build.hideReplyView(this.mNativeStyle);
        } else {
            build.hideReplyView();
        }
        return build.getView();
    }

    private static String getRegisterArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab9c0c23", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("showLoc", "1");
        return JSON.toJSONString(hashMap);
    }

    private static String getUTType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1046090a", new Object[0]);
        }
        return "agoo";
    }

    private HashMap<String, String> getUtArgs() {
        Bundle bundle;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("468dbbc", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        InnerPushVO innerPushVO = this.mVO;
        if (!(innerPushVO == null || (bundle = innerPushVO.mParam) == null)) {
            if (bundle.getBoolean("is_agoo_notify")) {
                str = "true";
            } else {
                str = "false";
            }
            hashMap.put("is_agoo_notify", str);
        }
        String str2 = "agoo^0^" + this.mMsgId;
        String str3 = this.mMsgId;
        String imbaBizTypeVal = getImbaBizTypeVal(this.msgTypeId);
        Bundle bundle2 = this.mVO.mParam;
        HashMap<String, String> createUTData = EnvUtil.createUTData(str2, str3, imbaBizTypeVal, "1", bundle2 != null ? bundle2.getString("type") : null, null, hashMap);
        if (supposeToBeDynamic(this.inAppPushTemplateId.intValue())) {
            createUTData.put("templateId", String.valueOf(this.inAppPushTemplateId));
            createUTData.put("stateNew", String.valueOf(this.stateNew ? 1 : 0));
        }
        String str4 = this.mCheckBizCode;
        if (str4 != null) {
            createUTData.put("checkBizCode", str4);
        }
        HashMap hashMap2 = new HashMap();
        String str5 = this.mPushUTArgs;
        if (str5 != null) {
            try {
                for (Map.Entry<String, Object> entry : JSON.parseObject(str5).entrySet()) {
                    if (entry.getValue() instanceof String) {
                        hashMap2.put(entry.getKey(), (String) entry.getValue());
                    }
                }
                if (!hashMap2.isEmpty()) {
                    createUTData.putAll(hashMap2);
                }
            } catch (Throwable unused) {
            }
        }
        return createUTData;
    }

    public static /* synthetic */ Object ipc$super(MarketingInnerNotificationAdapter marketingInnerNotificationAdapter, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1865040893:
                super.onShow();
                return null;
            case -893949262:
                super.onDismiss();
                return null;
            case 634261907:
                super.onError(((Number) objArr[0]).intValue());
                return null;
            case 979191448:
                super.onDismissActive();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/notification/banner/support/MarketingInnerNotificationAdapter");
        }
    }

    private static boolean isClickedIn1s(String str) {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43ed9319", new Object[]{str})).booleanValue();
        }
        if (str == null || (l = mClickMap.get(str)) == null || SystemClock.elapsedRealtime() - l.longValue() > 1000) {
            return false;
        }
        return true;
    }

    private static void setClicked(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc2d0a36", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            mClickMap.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    private static boolean supposeToBeDynamic(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f0b0fbe", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i != -1) {
            return true;
        }
        return false;
    }

    public JSONObject constructResource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cfec10f6", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cmdName", (Object) str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("interceptBizType", (Object) this.mCheckBizCode);
        jSONObject2.put("bizParams", (Object) this.mBizParams);
        jSONObject2.put(StEvent.SHOW_TIME, (Object) Long.valueOf(this.mVO.time));
        jSONObject.put("data", (Object) jSONObject2);
        return jSONObject;
    }

    public String getcheckBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ecd5e5eb", new Object[]{this});
        }
        return this.mCheckBizCode;
    }

    public boolean getshowSystemNotification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8840378", new Object[]{this})).booleanValue();
        }
        return this.mShowSystemNotification;
    }

    @Override // com.taobao.message.notification.banner.InnerNotificationAdapter, com.taobao.message.notification.banner.IInnerNotificationAdapter
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (this.mCheckBizCode != null) {
            checkByBusiness("click");
            try {
                TaobaoRegister.clickMessage(EnvUtil.getApplication(), getAgooId(this.mAgooId, this.mMsgId), getRegisterArgs());
            } catch (Throwable unused) {
                TLog.loge(TAG, "MarketingInnerNotificationAdapter.onClick For Open Push Tracker Wrong");
            }
        } else if (!this.stateNew || !isClickedIn1s(this.mMsgId)) {
            if (this.stateNew) {
                TLog.loge(DynamicSimpleComponent.TAG, "performClick makeup:" + this.mMsgId);
                AppMonitor.Alarm.commitFail("AgooNotification", "clickNotConsumed", "-1", "新状态触发老点击事件，且1秒前未触发DX点击事件");
            }
            setClicked(this.mMsgId);
            String str = null;
            actualClick(null, this.mVO.mParam);
            Map<String, Object> hashMap = new HashMap<>();
            JSONObject jSONObject = this.agooJSONObject;
            if (!(jSONObject == null || jSONObject.getInnerMap() == null)) {
                hashMap = this.agooJSONObject.getInnerMap();
            }
            String str2 = this.mAgooId;
            String str3 = this.mMsgId;
            Map<String, String> map = this.extData;
            String str4 = this.msgTypeId;
            Integer num = this.inAppPushTemplateId;
            boolean z = this.stateNew;
            Bundle bundle = this.mVO.mParam;
            if (bundle != null) {
                str = bundle.getString("type");
            }
            actrualPerformUTClick(str2, str3, hashMap, map, str4, num, z, str);
        } else {
            TLog.loge(DynamicSimpleComponent.TAG, "performClick isClickedIn1s return:" + this.mMsgId);
        }
    }

    @Override // com.taobao.message.notification.banner.InnerNotificationAdapter, com.taobao.message.notification.banner.IInnerNotificationAdapter
    public void onDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
            return;
        }
        super.onDismiss();
        try {
            TaobaoRegister.dismissMessage(this.mContext.getApplicationContext(), getAgooId(this.mAgooId, this.mMsgId), getRegisterArgs());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 2101, "Page_Push_TBMSGPush_Dismiss", 1, null, EnvUtil.mapToArray(getUtArgs()));
    }

    @Override // com.taobao.message.notification.banner.InnerNotificationAdapter, com.taobao.message.notification.banner.IInnerNotificationAdapter
    public void onDismissActive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a5d4698", new Object[]{this});
            return;
        }
        super.onDismissActive();
        TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 2101, "Page_Push_TBMSGPush_Cancel", 1, null, EnvUtil.mapToArray(getUtArgs()));
    }

    @Override // com.taobao.message.notification.banner.InnerNotificationAdapter, com.taobao.message.notification.banner.IInnerNotificationAdapter
    public void onError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i)});
            return;
        }
        super.onError(i);
        if (i == -3) {
            onShowError(String.valueOf(i), " app isAppBackground");
        } else if (i == -2) {
            onShowError(String.valueOf(i), " msg page filter");
        } else if (i == -1) {
            onShowError(String.valueOf(i), " user close setting");
        }
    }

    public void onInitUT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d813dff5", new Object[]{this});
        } else if (supposeToBeDynamic(this.inAppPushTemplateId.intValue())) {
            TBS.Ext.commitEvent("Page_Extend", 2201, "SendTaoMessage", "Type=" + getUTType(), "msgid=" + this.mMsgId, "isBackground=" + EnvUtil.isAppBackGround(), "templateId=" + this.inAppPushTemplateId);
        } else {
            TBS.Ext.commitEvent("Page_Extend", 2201, "SendTaoMessage", "Type=" + getUTType(), "msgid=" + this.mMsgId, "isBackground=" + EnvUtil.isAppBackGround());
        }
    }

    @Override // com.taobao.message.notification.banner.InnerNotificationAdapter, com.taobao.message.notification.banner.IInnerNotificationAdapter
    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        super.onShow();
        onShowUT();
        try {
            TaobaoRegister.exposureMessage(EnvUtil.getApplication(), getAgooId(this.mAgooId, this.mMsgId), getRegisterArgs());
        } catch (Throwable th) {
            TLog.loge(TAG, "MarketingInnerNotificationAdapter.onShow " + th.getMessage());
        }
    }

    public void onShowError(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("912a8007", new Object[]{this, str, str2});
        }
    }

    public void setshowSystemNotification(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50152954", new Object[]{this, new Boolean(z)});
        } else {
            this.mShowSystemNotification = z;
        }
    }

    private static String actualClick(Map<String, Object> map, Bundle bundle) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8ef5990", new Object[]{map, bundle});
        }
        if (map == null) {
            try {
                map = JSON.parseObject(bundle.getString(AgooConstants.MESSAGE_BODY)).getInnerMap();
            } catch (Throwable unused) {
            }
        }
        if (map == null) {
            map = new HashMap<>();
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(KEY_PUSHUTARGS, true);
        bundle2.putString(KEY_PUSHUTARGS, String.valueOf(map.get(KEY_PUSHUTARGS)));
        Object obj = map.get("jump_url");
        if (obj == null) {
            obj = map.get("url");
            try {
                bundle2.putString("notifyContentIntentBody", bundle.getString(AgooConstants.MESSAGE_BODY));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (obj == null) {
            str = "http://m.taobao.com/go/msgcentercategory";
        } else {
            str = obj.toString();
        }
        TLog.loge(TAG, "performClick, url = " + str);
        Activity topActivity = EnvUtil.getTopActivity();
        String urlSplicingFromParam = ParseUtil.urlSplicingFromParam(str);
        if (topActivity != null) {
            Nav.from(topActivity).withExtras(bundle2).toUri(urlSplicingFromParam);
        } else {
            Nav.from(EnvUtil.getApplication()).withExtras(bundle2).toUri(urlSplicingFromParam);
        }
        return urlSplicingFromParam;
    }

    public boolean checkByBusiness(String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b27919b4", new Object[]{this, str})).booleanValue();
        }
        TLog.logd(TAG, "cmdName is" + str);
        JSONObject jSONObject = this.mBizParams;
        if (jSONObject != null && jSONObject.containsKey(BaseMnnRunUnit.KEY_TASK_NAME)) {
            String string = this.mBizParams.getString(BaseMnnRunUnit.KEY_TASK_NAME);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("interceptBizType", (Object) this.mCheckBizCode);
            jSONObject2.put(BaseMnnRunUnit.KEY_TASK_NAME, (Object) string);
            OpenPushProvider openPushProvider = OpenPushService.getInstance().getOpenPushProvider(jSONObject2);
            if (openPushProvider != null) {
                try {
                    z = openPushProvider.openPushHandler(constructResource(str));
                } catch (Throwable th) {
                    TLog.loge(TAG, "MarketingInnerNotificationAdapter.checkByBusiness " + th.getMessage());
                }
            }
        }
        TLog.loge(TAG, "checkByBusiness result is" + z);
        return z;
    }

    public void onShowUT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7517022", new Object[]{this});
            return;
        }
        EnvUtil.UTShow(getUtArgs(), 1, null);
        TBS.Ext.commitEvent("Page_Extend", 2001, "ShowTaoMessage", "Type=" + getUTType(), "msgid=" + this.mMsgId, "isBackground=" + EnvUtil.isAppBackGround());
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class TapHandler extends ob5 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(610271261);
        }

        public static /* synthetic */ Object ipc$super(TapHandler tapHandler, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/notification/banner/support/MarketingInnerNotificationAdapter$TapHandler");
        }

        @Override // tb.ob5, tb.mvb
        public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
                return;
            }
            TLog.loge(DynamicSimpleComponent.TAG, "handleEvent");
            DXRootView L = dXRuntimeContext.L();
            if (L != null) {
                Object tag = L.getTag(R.id.inapppush_param);
                Object tag2 = L.getTag(R.id.inapppush_msgId);
                Object tag3 = L.getTag(R.id.inapppush_agooId);
                Object tag4 = L.getTag(R.id.inapppush_templateid);
                Object tag5 = L.getTag(R.id.inapppush_msgTypeId);
                Object tag6 = L.getTag(R.id.inapppush_stateNew);
                Object tag7 = L.getTag(R.id.inapppush_extData);
                if (!(tag instanceof Bundle) || !(tag4 instanceof Integer) || !(tag5 instanceof String) || !(tag6 instanceof Boolean) || !(tag7 instanceof Map)) {
                    TLog.loge(DynamicSimpleComponent.TAG, "handleEvent param not correct");
                    return;
                }
                Map<String, Object> map = null;
                String str = tag2 instanceof String ? (String) tag2 : null;
                String str2 = tag3 instanceof String ? (String) tag3 : null;
                if (MarketingInnerNotificationAdapter.access$000(str)) {
                    TLog.loge(DynamicSimpleComponent.TAG, "handleEvent isClickedIn1s return");
                    return;
                }
                Bundle bundle = (Bundle) tag;
                Integer num = (Integer) tag4;
                String str3 = (String) tag5;
                Boolean bool = (Boolean) tag6;
                Map map2 = (Map) tag7;
                try {
                    map = JSON.parseObject(bundle.getString(AgooConstants.MESSAGE_BODY)).getInnerMap();
                } catch (Throwable unused) {
                }
                HashMap hashMap = map == null ? new HashMap() : map;
                if (objArr.length > 1) {
                    Object obj = objArr[1];
                    if ((obj instanceof String) && !TextUtils.isEmpty((String) obj)) {
                        Activity topActivity = EnvUtil.getTopActivity();
                        TLog.loge(DynamicSimpleComponent.TAG, "handleEvent nav with url: " + ((String) objArr[1]));
                        MarketingInnerNotificationAdapter.access$100(str);
                        if (topActivity != null) {
                            Nav.from(topActivity).toUri((String) objArr[1]);
                        } else {
                            Nav.from(EnvUtil.getApplication()).toUri((String) objArr[1]);
                        }
                        NotificationBannerHelper.instance().dismissPushBar();
                        MarketingInnerNotificationAdapter.access$300(str2, str, hashMap, map2, str3, num, bool.booleanValue(), bundle.getString("type"));
                        return;
                    }
                }
                TLog.loge(DynamicSimpleComponent.TAG, "handleEvent default click");
                MarketingInnerNotificationAdapter.access$100(str);
                MarketingInnerNotificationAdapter.access$200(hashMap, bundle);
                MarketingInnerNotificationAdapter.access$300(str2, str, hashMap, map2, str3, num, bool.booleanValue(), bundle.getString("type"));
                return;
            }
            TLog.loge(DynamicSimpleComponent.TAG, "handleEvent rootView == null");
        }
    }

    @Override // com.taobao.message.notification.banner.InnerNotificationAdapter, com.taobao.message.notification.banner.IInnerNotificationAdapter
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        if (this.inAppPushTemplateId.intValue() == -1 || this.inAppPushTemplateData == null) {
            TLog.loge(DynamicSimpleComponent.TAG, "inAppPushTemplateId == -1 || inAppPushTemplateData == null");
            return getOldView();
        }
        DXTemplateItem fetchDXTemplateItem = DXTemplateItemFetcher.fetchDXTemplateItem(this.inAppPushTemplateId.intValue());
        if (fetchDXTemplateItem == null || this.mContext.getApplicationContext() == null) {
            TLog.loge(DynamicSimpleComponent.TAG, "mDXTemplateItem or context is null:" + this.inAppPushTemplateId);
            return getOldView();
        }
        DynamicSimpleComponent dynamicSimpleComponent = new DynamicSimpleComponent(new DynamicSimpleProps(this.inAppPushTemplateId.intValue(), new DXTemplateVO(fetchDXTemplateItem, this.inAppPushTemplateData), this.mContext.getApplicationContext(), null));
        this.mDynamicComponent = dynamicSimpleComponent;
        dynamicSimpleComponent.mount();
        if (this.mDynamicComponent.render()) {
            this.stateNew = true;
            View uIView = this.mDynamicComponent.getUIView();
            uIView.setTag(R.id.inapppush_param, this.mVO.mParam);
            uIView.setTag(R.id.inapppush_msgId, this.mMsgId);
            uIView.setTag(R.id.inapppush_agooId, this.mAgooId);
            uIView.setTag(R.id.inapppush_templateid, this.inAppPushTemplateId);
            uIView.setTag(R.id.inapppush_msgTypeId, this.msgTypeId);
            uIView.setTag(R.id.inapppush_stateNew, Boolean.valueOf(this.stateNew));
            uIView.setTag(R.id.inapppush_extData, this.extData);
            TLog.loge(TAG, "stateNew render: " + this.mMsgId);
            if (mTapHandler == null) {
                mTapHandler = new TapHandler();
                TapEventHandlerProxy.INSTANCE.addHandler(IN_APP_PUSH, mTapHandler);
            }
            uIView.measure(0, 0);
            FrameLayout frameLayout = new FrameLayout(uIView.getContext());
            frameLayout.addView(uIView, new FrameLayout.LayoutParams(uIView.getMeasuredWidth(), uIView.getMeasuredHeight()));
            return frameLayout;
        }
        TLog.loge(DynamicSimpleComponent.TAG, "renderFail:" + this.inAppPushTemplateId);
        return getOldView();
    }

    public MarketingInnerNotificationAdapter(Context context, InnerPushVO innerPushVO) {
        super(context, innerPushVO);
        String str;
        this.mPushUTArgs = null;
        this.mMsgId = null;
        this.mAgooId = null;
        this.inAppPushTemplateId = -1;
        this.mCheckBizCode = null;
        this.mBizParams = null;
        this.mNativeStyle = null;
        String string = innerPushVO.mParam.getString(AgooConstants.MESSAGE_BODY);
        this.msgTypeId = innerPushVO.mParam.getString("msg_type_id");
        if (TextUtils.isEmpty(this.mVO.title)) {
            InnerPushVO innerPushVO2 = this.mVO;
            Bundle bundle = innerPushVO.mParam;
            str = KEY_PUSHUTARGS;
            innerPushVO2.title = bundle.getString("title");
        } else {
            str = KEY_PUSHUTARGS;
        }
        if (TextUtils.isEmpty(this.mVO.content)) {
            this.mVO.content = innerPushVO.mParam.getString("text");
        }
        if (TextUtils.isEmpty(this.mVO.iconUrl)) {
            this.mVO.iconUrl = innerPushVO.mParam.getString("m-icon");
            if (TextUtils.isEmpty(this.mVO.iconUrl)) {
                this.mVO.iconUrl = innerPushVO.mParam.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_AVATAR);
            }
        }
        if (TextUtils.isEmpty(this.mVO.img)) {
            this.mVO.img = innerPushVO.mParam.getString("img");
        }
        this.mMsgId = innerPushVO.mParam.getString("messageId");
        this.mAgooId = innerPushVO.mParam.getString("id");
        this.mTime = System.currentTimeMillis();
        try {
            JSONObject parseObject = JSON.parseObject(string);
            this.agooJSONObject = parseObject;
            if (parseObject != null && parseObject.containsKey(Constants.KEY_EXTS)) {
                JSONObject jSONObject = this.agooJSONObject.getJSONObject(Constants.KEY_EXTS);
                if (jSONObject.containsKey(IN_APP_PUSH)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(IN_APP_PUSH);
                    if (jSONObject2.containsKey("inAppPushTemplateId")) {
                        this.inAppPushTemplateId = jSONObject2.getInteger("inAppPushTemplateId");
                    }
                    if (jSONObject2.containsKey("inAppPushTemplateData")) {
                        this.inAppPushTemplateData = jSONObject2.getJSONObject("inAppPushTemplateData");
                        if (TextUtils.equals(OrangeConfig.getInstance().getConfig("mpm_business_switch", "enableRegisterIntercept", "true"), "true")) {
                            if (this.inAppPushTemplateData.containsKey("checkBizCode")) {
                                this.mCheckBizCode = this.inAppPushTemplateData.getString("checkBizCode");
                            }
                            if (this.mCheckBizCode != null) {
                                setshowSystemNotification(false);
                            }
                            if (this.inAppPushTemplateData.containsKey("nativeStyle")) {
                                this.mNativeStyle = this.inAppPushTemplateData.getJSONObject("nativeStyle");
                            }
                            if (this.inAppPushTemplateData.containsKey("bizParams")) {
                                this.mBizParams = this.inAppPushTemplateData.getJSONObject("bizParams");
                            }
                            TLog.logd(TAG, "mCheckBizCode is " + this.mCheckBizCode + " mNativeStyle is " + this.mNativeStyle.toString() + " bizParamsMock is " + this.mBizParams.toString());
                        }
                    }
                }
                if (jSONObject.containsKey(str)) {
                    String string2 = jSONObject.getString(str);
                    this.mPushUTArgs = string2;
                    this.extData.put(str, string2);
                }
            }
        } catch (Throwable th) {
            TLog.loge(TAG, Log.getStackTraceString(th));
            HashMap hashMap = new HashMap();
            hashMap.put("arg1", "Page_Push_TBMSGPush_Agoo_Exception");
            hashMap.put("pushType", "innerBanner");
            EnvUtil.alarmCommitFail(hashMap, EnvUtil.AGOO_PUSH_DATA_PROCESS_FAIL, "MarketingInnerNotificationAdapter construct error");
        }
        onInitUT();
    }

    private static void actrualPerformUTClick(String str, String str2, Map<String, Object> map, Map<String, String> map2, String str3, Integer num, boolean z, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fcf7a54", new Object[]{str, str2, map, map2, str3, num, new Boolean(z), str4});
            return;
        }
        TBS.Ext.commitEvent("Page_Extend", 2101, "ClickTaoMessage", "Type=" + getUTType(), "msgid=" + str2, "isBackground=" + EnvUtil.isAppBackGround());
        HashMap hashMap = new HashMap();
        if (supposeToBeDynamic(num.intValue())) {
            hashMap.put("templateId", String.valueOf(num));
            hashMap.put("stateNew", String.valueOf(z ? 1 : 0));
        }
        HashMap hashMap2 = new HashMap();
        Object obj = map.get(KEY_PUSHUTARGS);
        String str5 = obj instanceof String ? (String) obj : null;
        if (TextUtils.isEmpty(str5)) {
            str5 = map2.get(KEY_PUSHUTARGS);
        }
        if (str5 != null) {
            try {
                for (Map.Entry<String, Object> entry : JSON.parseObject(str5).entrySet()) {
                    if (entry.getValue() instanceof String) {
                        hashMap2.put(entry.getKey(), (String) entry.getValue());
                    }
                }
                if (!hashMap2.isEmpty()) {
                    hashMap.putAll(hashMap2);
                }
            } catch (Throwable unused) {
            }
        }
        HashMap<String, String> createUTData = EnvUtil.createUTData("agoo^0^" + str2, str2, getImbaBizTypeVal(str3), "1", str4, null, hashMap);
        EnvUtil.UTClick(createUTData, 1, String.valueOf(map.get("url")));
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(createUTData));
        try {
            TaobaoRegister.clickMessage(EnvUtil.getApplication(), getAgooId(str, str2), getRegisterArgs());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
