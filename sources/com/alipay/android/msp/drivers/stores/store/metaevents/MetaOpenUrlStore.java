package com.alipay.android.msp.drivers.stores.store.metaevents;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.sys.DeviceInfo;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.base.OnResultReceived;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MetaOpenUrlStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Activity f3582a;

    public MetaOpenUrlStore(int i) {
        super(i);
    }

    public static /* synthetic */ void access$000(MetaOpenUrlStore metaOpenUrlStore, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47167fcd", new Object[]{metaOpenUrlStore, str});
        } else {
            metaOpenUrlStore.c(str);
        }
    }

    public static /* synthetic */ Object ipc$super(MetaOpenUrlStore metaOpenUrlStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/metaevents/MetaOpenUrlStore");
    }

    public final boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("265ed169", new Object[]{this, jSONObject})).booleanValue();
        }
        try {
            if (jSONObject.containsKey(MonitorItemConstants.KEY_URL)) {
                final String string = jSONObject.getString(MonitorItemConstants.KEY_URL);
                if (Integer.parseInt(jSONObject.getString("delay")) > 0) {
                    TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.metaevents.MetaOpenUrlStore.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                MetaOpenUrlStore.access$000(MetaOpenUrlStore.this, string);
                            }
                        }
                    });
                } else {
                    c(string);
                }
                return true;
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return false;
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b82b147f", new Object[]{this, str});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addCategory("android.intent.category.BROWSABLE");
        MspBasePresenter currentPresenter = this.mMspContext.getMspUIClient().getCurrentPresenter();
        if (currentPresenter == null || currentPresenter.getIView() == null) {
            Activity activity = this.f3582a;
            if (activity != null) {
                activity.startActivity(intent);
                return;
            }
            return;
        }
        currentPresenter.getIView().openActivity(intent, new OnResultReceived() { // from class: com.alipay.android.msp.drivers.stores.store.metaevents.MetaOpenUrlStore.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.ui.base.OnResultReceived
            public void onReceiveResult(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e1927912", new Object[]{this, str2});
                }
            }
        });
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ebf11", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            StEvent stEvent = this.mStEvent;
            stEvent.onStatistic("action", "metaOpenUrl|" + Utils.truncateString(str, 100));
            if (str.startsWith(MspGlobalDefine.AFWEALTH_SCHEME)) {
                LogUtil.record(4, "", "OpenUrlStore::processUrl", "OpenUrl by AFWEALTH_SCHEME:".concat(str));
                Intent intent = new Intent();
                intent.setAction(MspGlobalDefine.AFWEALTH_OPNEURL_ACTION);
                intent.putExtra(MspGlobalDefine.AFWEALTH_OPENURL_PARAM, str);
                LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(intent);
            } else if (!str.startsWith(MspGlobalDefine.ALIPAY_SCHEME) || DeviceInfo.hasAlipayWallet(this.mContext)) {
                String packageName = this.f3582a.getPackageName();
                if (TextUtils.equals(packageName, MspGlobalDefine.PACKAGE_AFWEALTH) && str.startsWith(MspGlobalDefine.ALIPAYS_SCHEME)) {
                    str = str.replaceFirst(MspGlobalDefine.ALIPAYS_SCHEME, MspGlobalDefine.AFWEALTH_SCHEME);
                } else if (TextUtils.equals(packageName, "hk.alipay.wallet") && str.startsWith(MspGlobalDefine.ALIPAYS_SCHEME)) {
                    str = str.replaceFirst(MspGlobalDefine.ALIPAYS_SCHEME, MspGlobalDefine.ALIPAYHK_SCHEME);
                }
                MspContext mspContext = this.mMspContext;
                if (mspContext != null && mspContext.isFromWallet()) {
                    try {
                        MspBasePresenter currentPresenter = this.mMspContext.getMspUIClient().getCurrentPresenter();
                        if (currentPresenter == null || currentPresenter.getIView() == null) {
                            PhoneCashierMspEngine.getMspJump().processUrl(this.f3582a, str);
                            return;
                        } else if (!currentPresenter.getIView().openUrl(str, new OnResultReceived() { // from class: com.alipay.android.msp.drivers.stores.store.metaevents.MetaOpenUrlStore.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.msp.ui.base.OnResultReceived
                            public void onReceiveResult(String str2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("e1927912", new Object[]{this, str2});
                                }
                            }
                        })) {
                            b(str);
                            return;
                        } else {
                            return;
                        }
                    } catch (Exception e) {
                        LogUtil.printExceptionStackTrace(e);
                    }
                }
                b(str);
            } else {
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.VIEW");
                intent2.setData(Uri.parse("https://ds.alipay.com/help/guide.htm?page=forgotpwd"));
                MspBasePresenter currentPresenter2 = this.mMspContext.getMspUIClient().getCurrentPresenter();
                if (currentPresenter2 != null && currentPresenter2.getIView() != null) {
                    currentPresenter2.getIView().openActivity(intent2, null);
                }
            }
        } else {
            MspContext mspContext2 = this.mMspContext;
            if (mspContext2 != null) {
                mspContext2.getStatisticInfo().addError(ErrorType.DEFAULT, ErrorCode.DEFAULT_OPEN_URL_EMPTY, "toOpenUri:".concat(String.valueOf(str)));
            }
        }
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        try {
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        if (this.mMspContext == null) {
            return null;
        }
        MspUIClient mspUIClient = this.mMspUIClient;
        if (mspUIClient != null) {
            this.f3582a = mspUIClient.getCurrentPresenter().getActivity();
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson != null) {
            z = a(actionParamsJson);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.valueOf(z));
        return jSONObject.toJSONString();
    }
}
