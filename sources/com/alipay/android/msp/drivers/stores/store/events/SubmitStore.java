package com.alipay.android.msp.drivers.stores.store.events;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.edit.EditTextManager;
import com.alipay.android.msp.utils.edit.EditTextUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SubmitStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public MspWindowClient b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3579a = false;
    public final Handler c = new Handler(Looper.getMainLooper()) { // from class: com.alipay.android.msp.drivers.stores.store.events.SubmitStore.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/SubmitStore$1");
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44d6b87", new Object[]{this, message});
                return;
            }
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(SubmitStore.access$000(SubmitStore.this));
            if (message.what == 4 && (mspContextByBizId instanceof MspTradeContext)) {
                MspTradeContext mspTradeContext = (MspTradeContext) mspContextByBizId;
                if (!mspTradeContext.isHasRPC()) {
                    mspTradeContext.setSubmitState(false);
                    StatisticInfo statisticInfo = mspContextByBizId.getStatisticInfo();
                    StringBuilder sb = new StringBuilder();
                    sb.append(mspContextByBizId.getBizId());
                    statisticInfo.addError(ErrorType.DEFAULT, "LoadingTimeout", sb.toString());
                    ActionsCreator.get(mspContextByBizId).createExceptionAction(new RuntimeException(LanguageHelper.localizedStringForKey("msp_request_timeout", mspContextByBizId.getContext().getString(R.string.msp_request_timeout), new Object[0])));
                }
            }
        }
    };

    public SubmitStore(int i) {
        super(i);
    }

    public static /* synthetic */ int access$000(SubmitStore submitStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e979fb", new Object[]{submitStore})).intValue();
        }
        return submitStore.mBizId;
    }

    public static /* synthetic */ MspTradeContext access$100(SubmitStore submitStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspTradeContext) ipChange.ipc$dispatch("7aa42119", new Object[]{submitStore});
        }
        return submitStore.mMspTradeContext;
    }

    public static /* synthetic */ MspTradeContext access$200(SubmitStore submitStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspTradeContext) ipChange.ipc$dispatch("945365da", new Object[]{submitStore});
        }
        return submitStore.mMspTradeContext;
    }

    public static /* synthetic */ MspTradeContext access$300(SubmitStore submitStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspTradeContext) ipChange.ipc$dispatch("ae02aa9b", new Object[]{submitStore});
        }
        return submitStore.mMspTradeContext;
    }

    public static boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c50c34ca", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null || !jSONObject.toString().contains("VIData")) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long c() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.msp.drivers.stores.store.events.SubmitStore.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0016
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "6ccb7f5"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            return r0
        L_0x0016:
            com.alipay.android.msp.plugin.engine.IWalletEngine r0 = com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine.getMspWallet()
            java.lang.String r1 = "MQP_MiniPDialog_outtime"
            java.lang.String r0 = r0.getWalletConfig(r1)
            if (r0 == 0) goto L_0x0031
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x0031
            long r0 = java.lang.Long.parseLong(r0)     // Catch: all -> 0x002d
            goto L_0x0033
        L_0x002d:
            r0 = move-exception
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r0)
        L_0x0031:
            r0 = 0
        L_0x0033:
            r2 = 40000(0x9c40, double:1.97626E-319)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x003b
            r0 = r2
        L_0x003b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.SubmitStore.c():long");
    }

    public static /* synthetic */ Object ipc$super(SubmitStore submitStore, String str, Object... objArr) {
        if (str.hashCode() == -610354464) {
            super.initWithContext();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/SubmitStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public void initWithContext() {
        MspUIClient mspUIClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9ebae0", new Object[]{this});
            return;
        }
        super.initWithContext();
        if (this.mMspTradeContext != null && (mspUIClient = this.mMspUIClient) != null) {
            this.b = (MspWindowClient) mspUIClient;
        }
    }

    public final JSONObject[] a(EventAction eventAction) {
        JSONObject jSONObject;
        String str = "spwd";
        String str2 = "param";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject[]) ipChange.ipc$dispatch("b005a1b8", new Object[]{this, eventAction});
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            this.f3579a = false;
            jSONObject = JSON.parseObject(eventAction.getActionData());
            if (jSONObject.containsKey(str2) || jSONObject.containsKey("params")) {
                if (!jSONObject.containsKey(str2)) {
                    str2 = "params";
                }
                jSONObject2 = jSONObject.getJSONObject(str2);
            }
            if (jSONObject.containsKey("action")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("action");
                if (jSONObject3.containsKey("params")) {
                    jSONObject2 = JsonUtil.merge(jSONObject2, jSONObject3.getJSONObject("params"));
                }
                jSONObject = jSONObject.getJSONObject("action");
                if (jSONObject.containsKey("viChannelMode") && jSONObject.getIntValue("viChannelMode") == 1) {
                    this.f3579a = true;
                }
                if (jSONObject2.containsKey("pwd")) {
                    str = "pwd";
                } else if (!jSONObject2.containsKey(str)) {
                    str = "";
                }
                if (!TextUtils.isEmpty(str) && !this.f3579a) {
                    String editTextContent = EditTextManager.getEditTextContent(this.mBizId);
                    if (TextUtils.isEmpty(editTextContent)) {
                        editTextContent = jSONObject2.getString(str);
                    }
                    jSONObject2.put(str, (Object) editTextContent);
                    EditTextUtil editTextUtils = EditTextManager.getEditTextUtils();
                    if (editTextUtils != null) {
                        editTextUtils.clear(this.mBizId);
                    }
                }
            }
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        return new JSONObject[]{jSONObject2, jSONObject};
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d0  */
    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String onMspAction(com.alipay.android.msp.drivers.actions.EventAction r19, com.alipay.android.msp.drivers.actions.EventAction.MspEvent r20) {
        /*
            Method dump skipped, instructions count: 943
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.SubmitStore.onMspAction(com.alipay.android.msp.drivers.actions.EventAction, com.alipay.android.msp.drivers.actions.EventAction$MspEvent):java.lang.String");
    }
}
