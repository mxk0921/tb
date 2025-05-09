package com.alipay.android.msp.drivers.stores.store.events;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspBaseDefine;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.drivers.stores.storecenter.ActionStoreCenter;
import com.alipay.android.msp.framework.hardwarepay.base.IDialogActionListener;
import com.alipay.android.msp.framework.hardwarepay.old.MspHardwarePayUtil;
import com.alipay.android.msp.framework.hardwarepay.old.dialog.ValidateDialogProxy;
import com.alipay.android.msp.framework.statisticsv2.value.CountValue;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.presenters.MspContainerPresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AuthStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static BroadcastReceiver f;
    public static BroadcastReceiver g;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3571a;
    public BroadcastReceiver b;
    public int c = 0;
    public ValidateDialogProxy d = null;
    public boolean e = false;

    public AuthStore(int i) {
        super(i);
    }

    public static /* synthetic */ MspContext access$000(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("8aafbf34", new Object[]{authStore});
        }
        return authStore.mMspContext;
    }

    public static /* synthetic */ MspContext access$100(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("c5e193", new Object[]{authStore});
        }
        return authStore.mMspContext;
    }

    public static /* synthetic */ MspContext access$1000(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("1bb8ea65", new Object[]{authStore});
        }
        return authStore.mMspContext;
    }

    public static /* synthetic */ int access$1100(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb76da3b", new Object[]{authStore})).intValue();
        }
        return authStore.mBizId;
    }

    public static /* synthetic */ Context access$1200(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("8e563dc1", new Object[]{authStore});
        }
        return authStore.mContext;
    }

    public static /* synthetic */ Context access$1300(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("74019a42", new Object[]{authStore});
        }
        return authStore.mContext;
    }

    public static /* synthetic */ BroadcastReceiver access$1400(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("a3ff8a02", new Object[]{authStore});
        }
        return authStore.b;
    }

    public static /* synthetic */ MspTradeContext access$1500(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspTradeContext) ipChange.ipc$dispatch("276ca09c", new Object[]{authStore});
        }
        return authStore.mMspTradeContext;
    }

    public static /* synthetic */ MspTradeContext access$1600(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspTradeContext) ipChange.ipc$dispatch("b5f8219d", new Object[]{authStore});
        }
        return authStore.mMspTradeContext;
    }

    public static /* synthetic */ boolean access$1700(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3603752", new Object[]{authStore})).booleanValue();
        }
        return authStore.e;
    }

    public static /* synthetic */ boolean access$1702(AuthStore authStore, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1835e08", new Object[]{authStore, new Boolean(z)})).booleanValue();
        }
        authStore.e = z;
        return z;
    }

    public static /* synthetic */ void access$1900(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86035650", new Object[]{authStore});
        } else {
            authStore.e();
        }
    }

    public static /* synthetic */ ValidateDialogProxy access$200(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValidateDialogProxy) ipChange.ipc$dispatch("adf8859e", new Object[]{authStore});
        }
        return authStore.d;
    }

    public static /* synthetic */ int access$2000(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4305ab59", new Object[]{authStore})).intValue();
        }
        return authStore.c;
    }

    public static /* synthetic */ int access$2002(AuthStore authStore, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("568c2d0e", new Object[]{authStore, new Integer(i)})).intValue();
        }
        authStore.c = i;
        return i;
    }

    public static /* synthetic */ int access$2008(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21118961", new Object[]{authStore})).intValue();
        }
        int i = authStore.c;
        authStore.c = 1 + i;
        return i;
    }

    public static /* synthetic */ MspContext access$2100(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("de7d3645", new Object[]{authStore});
        }
        return authStore.mMspContext;
    }

    public static /* synthetic */ MspContext access$2200(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("549358a4", new Object[]{authStore});
        }
        return authStore.mMspContext;
    }

    public static /* synthetic */ MspTradeContext access$2300(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspTradeContext) ipChange.ipc$dispatch("4d3a3db9", new Object[]{authStore});
        }
        return authStore.mMspTradeContext;
    }

    public static /* synthetic */ Context access$2400(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("296d2a62", new Object[]{authStore});
        }
        return authStore.mContext;
    }

    public static /* synthetic */ Context access$2500(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("f1886e3", new Object[]{authStore});
        }
        return authStore.mContext;
    }

    public static /* synthetic */ Context access$2600(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("f4c3e364", new Object[]{authStore});
        }
        return authStore.mContext;
    }

    public static /* synthetic */ void access$300(AuthStore authStore, ValidateDialogProxy validateDialogProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc9d5599", new Object[]{authStore, validateDialogProxy});
        } else {
            authStore.a(validateDialogProxy);
        }
    }

    public static /* synthetic */ String access$400(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92a46c71", new Object[]{str, str2});
        }
        return d(str, str2);
    }

    public static /* synthetic */ void access$500(AuthStore authStore, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e7f1d7b", new Object[]{authStore, str, str2, str3});
        } else {
            authStore.b(str, str2, str3);
        }
    }

    public static /* synthetic */ Context access$600(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("ad2a57d6", new Object[]{authStore});
        }
        return authStore.mContext;
    }

    public static /* synthetic */ MspContext access$700(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("c54aafcd", new Object[]{authStore});
        }
        return authStore.mMspContext;
    }

    public static /* synthetic */ MspContext access$800(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("3b60d22c", new Object[]{authStore});
        }
        return authStore.mMspContext;
    }

    public static /* synthetic */ boolean access$900(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d325e165", new Object[]{authStore})).booleanValue();
        }
        return authStore.f3571a;
    }

    public static String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75b9023f", new Object[]{str, str2});
        }
        return "{\"status\":\"" + str + "\",\"tip\":\"" + str2 + "\"}";
    }

    public static /* synthetic */ Object ipc$super(AuthStore authStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/AuthStore");
    }

    public final void a(ValidateDialogProxy validateDialogProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5d792ac", new Object[]{this, validateDialogProxy});
            return;
        }
        this.d = validateDialogProxy;
        if (this.mMspContext.getStoreCenter() != null) {
            ((ActionStoreCenter) this.mMspContext.getStoreCenter()).setDialog(validateDialogProxy);
        }
    }

    public void beforeFrameChangedClean(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ac6cf9", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            e();
            if (this.b != null) {
                LocalBroadcastManager.getInstance(this.mMspContext.getContext()).unregisterReceiver(this.b);
                this.b = null;
            }
            ValidateDialogProxy validateDialogProxy = this.d;
            if (validateDialogProxy != null && (!this.f3571a || !(i == 12 || i == 10))) {
                validateDialogProxy.dismiss(0);
                a(null);
            }
            MspHardwarePayUtil.getInstance().cancel(this.mContext);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    public static /* synthetic */ void access$1800(AuthStore authStore, String str, JSONObject jSONObject, BroadcastReceiver broadcastReceiver, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53ae3653", new Object[]{authStore, str, jSONObject, broadcastReceiver, new Integer(i)});
            return;
        }
        LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "AuthStore.toSubmitPay", "action:".concat(String.valueOf(str)));
        if (MspFlybirdDefine.FLYBIRD_ACTION_CASHIER_PAY.equals(str) || MspFlybirdDefine.FLYBIRD_ACTION_CASHIER_PAYMENT.equals(str)) {
            authStore.mMspContext.getMspNetHandler().setNetErrorCode("6004");
        }
        MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(authStore.mBizId);
        if (tradeContextByBizId != null) {
            ActionsCreator.get(tradeContextByBizId).createSubmitEventAction(str, jSONObject.toJSONString(), EventAction.SubmitType.CommonRequest, i + 10);
        }
        LocalBroadcastManager.getInstance(authStore.mMspContext.getContext()).unregisterReceiver(broadcastReceiver);
    }

    public final void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        EventAction eventAction = new EventAction(str2);
        LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "AuthStore.executeEvent", "biz:" + str + " eventAction:" + eventAction + " EventData:" + str3);
        eventAction.setActionData(str3);
        ActionsCreator.get(this.mMspContext).createEventAction(eventAction);
    }

    public final void e() {
        MspContext mspContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        try {
            LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "AuthStore.toUnregisterReceiver", "toUnregisterReceiver");
            if (!(g == null || (mspContext = this.mMspContext) == null || mspContext.getContext() == null)) {
                this.mMspContext.getContext().unregisterReceiver(g);
            }
            g = null;
            if (f != null) {
                LocalBroadcastManager.getInstance(this.mContext).unregisterReceiver(f);
            }
            f = null;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c1, code lost:
        if (r8.getIntValue("fpProtocolType") == 1) goto L_0x00c3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c3, code lost:
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c5, code lost:
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
        if (r7.getIntValue("fpProtocolType") == 1) goto L_0x00c3;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2 A[Catch: Exception -> 0x0064, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0064, blocks: (B:18:0x0055, B:20:0x005f, B:24:0x0069, B:26:0x006f, B:38:0x00b7, B:40:0x00bd, B:47:0x00ce, B:53:0x00de, B:56:0x00e5, B:60:0x00f2, B:65:0x0103, B:71:0x010c), top: B:112:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f8 A[Catch: Exception -> 0x0180, TRY_ENTER, TryCatch #0 {Exception -> 0x0180, blocks: (B:8:0x0036, B:11:0x003b, B:13:0x003f, B:16:0x0045, B:29:0x0078, B:32:0x0084, B:35:0x00a5, B:45:0x00c8, B:50:0x00d6, B:58:0x00ec, B:62:0x00f8, B:63:0x00fe, B:68:0x0108, B:74:0x0111, B:76:0x0143, B:78:0x0147, B:80:0x0168, B:82:0x016e, B:84:0x0174, B:87:0x0184, B:88:0x018f, B:90:0x01a1, B:91:0x01a9, B:92:0x01d7, B:94:0x01e3, B:96:0x0221, B:98:0x0229, B:99:0x024a, B:101:0x0250, B:102:0x0255, B:103:0x025a, B:105:0x0260, B:107:0x0269), top: B:111:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0103 A[Catch: Exception -> 0x0064, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0064, blocks: (B:18:0x0055, B:20:0x005f, B:24:0x0069, B:26:0x006f, B:38:0x00b7, B:40:0x00bd, B:47:0x00ce, B:53:0x00de, B:56:0x00e5, B:60:0x00f2, B:65:0x0103, B:71:0x010c), top: B:112:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010c A[Catch: Exception -> 0x0064, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0064, blocks: (B:18:0x0055, B:20:0x005f, B:24:0x0069, B:26:0x006f, B:38:0x00b7, B:40:0x00bd, B:47:0x00ce, B:53:0x00de, B:56:0x00e5, B:60:0x00f2, B:65:0x0103, B:71:0x010c), top: B:112:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0110  */
    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String onMspAction(com.alipay.android.msp.drivers.actions.EventAction r22, com.alipay.android.msp.drivers.actions.EventAction.MspEvent r23) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.AuthStore.onMspAction(com.alipay.android.msp.drivers.actions.EventAction, com.alipay.android.msp.drivers.actions.EventAction$MspEvent):java.lang.String");
    }

    public final void c(final String[] strArr, JSONObject jSONObject, final boolean z, final JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7484a75", new Object[]{this, strArr, jSONObject, new Boolean(z), jSONObject2});
            return;
        }
        MspContext mspContext = this.mMspContext;
        if (!(mspContext == null || mspContext.getContext() == null)) {
            final String localizedStringForKey = LanguageHelper.localizedStringForKey("flybird_bl_val_ok", this.mMspContext.getContext().getString(R.string.flybird_bl_val_ok), new Object[0]);
            final String str = strArr.length > 5 ? strArr[5] : null;
            LogUtil.record(1, "phonecashier#bracelet", "AuthStore.handleBLAuthResponseReceiver", "FlybirdWindowManager发起支付手环校验请求");
            for (int i = 0; i < strArr.length; i++) {
                LogUtil.record(1, "phonecashier#bracelet", "AuthStore.handleBLAuthResponseReceiver", "actionParams" + i + ":" + strArr[i]);
            }
            this.c = 0;
            a(null);
            MspUIClient mspUIClient = this.mMspUIClient;
            if (mspUIClient != null) {
                final MspBasePresenter currentPresenter = mspUIClient.getCurrentPresenter();
                if (this.b != null) {
                    try {
                        LocalBroadcastManager.getInstance(this.mMspContext.getContext()).unregisterReceiver(this.b);
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
                this.b = new BroadcastReceiver() { // from class: com.alipay.android.msp.drivers.stores.store.events.AuthStore.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str2, Object... objArr) {
                        str2.hashCode();
                        int hashCode = str2.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/AuthStore$1");
                    }

                    /* JADX WARN: Removed duplicated region for block: B:38:0x01c5  */
                    /* JADX WARN: Removed duplicated region for block: B:46:0x022b  */
                    @Override // android.content.BroadcastReceiver
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void onReceive(android.content.Context r11, android.content.Intent r12) {
                        /*
                            Method dump skipped, instructions count: 594
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.AuthStore.AnonymousClass1.onReceive(android.content.Context, android.content.Intent):void");
                    }
                };
                if (z) {
                    TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.AuthStore.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            AuthStore authStore = AuthStore.this;
                            AuthStore.access$300(authStore, new ValidateDialogProxy(2, AuthStore.access$1300(authStore)));
                            AuthStore.access$200(AuthStore.this).showDialog(currentPresenter.getActivity(), 2, localizedStringForKey, new IDialogActionListener() { // from class: com.alipay.android.msp.drivers.stores.store.events.AuthStore.2.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.alipay.android.msp.framework.hardwarepay.base.IDialogActionListener
                                public void onDialogAction(int i2) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("2d7a4c5f", new Object[]{this, new Integer(i2)});
                                    } else if (AuthStore.access$200(AuthStore.this) == null || AuthStore.access$200(AuthStore.this).isShown() || i2 == 100) {
                                        if (i2 == 0) {
                                            AnonymousClass2 r4 = AnonymousClass2.this;
                                            if (currentPresenter instanceof MspContainerPresenter) {
                                                AuthStore.access$500(AuthStore.this, CountValue.T_BL, MspEventTypes.ACTION_STRING_BNCB, "{\"status\":\"0009\"}");
                                            }
                                        } else if (i2 == 2) {
                                            AuthStore.access$500(AuthStore.this, CountValue.T_BL, MspEventTypes.ACTION_STRING_BNCB, "{\"status\":\"0005\"}");
                                        } else if (AuthStore.access$200(AuthStore.this) != null && !AuthStore.access$200(AuthStore.this).isValidateOk()) {
                                            AuthStore.access$500(AuthStore.this, CountValue.T_BL, "back", MspBaseDefine.ACTION_LOC_BACK);
                                        }
                                        if (AuthStore.access$1400(AuthStore.this) != null) {
                                            LocalBroadcastManager.getInstance(AuthStore.access$1500(AuthStore.this).getContext()).unregisterReceiver(AuthStore.access$1400(AuthStore.this));
                                        }
                                    }
                                }
                            });
                            AuthStore.access$200(AuthStore.this).updateMsg(LanguageHelper.localizedStringForKey("flybird_bl_val_ok", AuthStore.access$1600(AuthStore.this).getContext().getString(R.string.flybird_bl_val_ok), new Object[0]), 200, -16777216);
                        }
                    });
                }
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(MspGlobalDefine.BL_AUTHENTICATE_ACTION);
                LocalBroadcastManager.getInstance(this.mMspTradeContext.getContext()).registerReceiver(this.b, intentFilter);
                MspHardwarePayUtil.getInstance().execute(this.mMspTradeContext.getContext(), 2, jSONObject);
            }
        }
    }
}
