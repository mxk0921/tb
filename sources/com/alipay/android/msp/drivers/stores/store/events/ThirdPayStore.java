package com.alipay.android.msp.drivers.stores.store.events;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.biz.scheme.MspSchemeActivity;
import com.alipay.android.msp.biz.thirdpay.ThirdPayManager;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.frame.MspWindowFrameDispatcher;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.views.EmptySchemeActivity;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.l2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ThirdPayStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ThirdPayStore(int i) {
        super(i);
    }

    public static /* synthetic */ int access$000(ThirdPayStore thirdPayStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22972864", new Object[]{thirdPayStore})).intValue();
        }
        return thirdPayStore.mBizId;
    }

    public static /* synthetic */ MspTradeContext access$100(ThirdPayStore thirdPayStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspTradeContext) ipChange.ipc$dispatch("afcb70c2", new Object[]{thirdPayStore});
        }
        return thirdPayStore.mMspTradeContext;
    }

    public static /* synthetic */ MspTradeContext access$300(ThirdPayStore thirdPayStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspTradeContext) ipChange.ipc$dispatch("85ada1c4", new Object[]{thirdPayStore});
        }
        return thirdPayStore.mMspTradeContext;
    }

    public static /* synthetic */ MspTradeContext access$400(ThirdPayStore thirdPayStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspTradeContext) ipChange.ipc$dispatch("f09eba45", new Object[]{thirdPayStore});
        }
        return thirdPayStore.mMspTradeContext;
    }

    public static /* synthetic */ Object ipc$super(ThirdPayStore thirdPayStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/ThirdPayStore");
    }

    public static /* synthetic */ void access$200(ThirdPayStore thirdPayStore, MspTradeContext mspTradeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b004697", new Object[]{thirdPayStore, mspTradeContext, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                MspWindowFrameDispatcher mspWindowFrameDispatcher = mspTradeContext.getMspUIClient().getMspWindowFrameDispatcher();
                JSONObject parseObject = JSON.parseObject(str);
                JSONObject jSONObject = new JSONObject();
                parseObject.put("type", (Object) MspFlybirdDefine.FLYBIRD_WIN_TYPE_DIALOG);
                jSONObject.put("wnd", (Object) parseObject);
                if (!mspWindowFrameDispatcher.parseRendDataFromUIShow(jSONObject, false, thirdPayStore.mStEvent)) {
                    LogUtil.record(8, "ThirdPayStore", "frame == null");
                }
            } catch (Throwable th) {
                LogUtil.record(8, "ThirdPayStore", "error on dialog");
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(final EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspBasePresenter currentPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        final JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson == null) {
            return ThirdPayManager.ThirdPayInvokeResult.makeErr("failed").toJson().toJSONString();
        }
        final String string = actionParamsJson.getString("type");
        final String string2 = actionParamsJson.getString("jumpFailedDialog");
        final String string3 = actionParamsJson.getString("jumpSucceedDialog");
        MspUIClient mspUIClient = this.mMspUIClient;
        final Activity activity = (mspUIClient == null || (currentPresenter = mspUIClient.getCurrentPresenter()) == null) ? null : currentPresenter.getActivity();
        MspTradeContext mspTradeContext = this.mMspTradeContext;
        if (mspTradeContext == null) {
            LogUtil.record(8, "ThirdPayStore", "error on task 0");
        } else {
            MspBasePresenter mspBasePresenter = mspTradeContext.getMspBasePresenter();
            if (mspBasePresenter == null) {
                LogUtil.record(8, "ThirdPayStore", "error on task 1");
            } else {
                Activity activity2 = mspBasePresenter.getActivity();
                if (activity2 == null) {
                    LogUtil.record(8, "ThirdPayStore", "error on task 2");
                } else if (!DrmManager.getInstance(activity2).isDegrade(DrmKey.DEGRADE_PAYRESULT_SWITCH_FRONT_THIRDPAY, false, activity2)) {
                    final WeakReference weakReference = new WeakReference(activity2);
                    MspSchemeActivity.registerHandler(new MspSchemeActivity.MspSchemeHandler() { // from class: com.alipay.android.msp.drivers.stores.store.events.ThirdPayStore.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.android.msp.biz.scheme.MspSchemeActivity.MspSchemeHandler
                        public String getName() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (String) ipChange2.ipc$dispatch("7c09e698", new Object[]{this});
                            }
                            return "ThirdPayStore";
                        }

                        @Override // com.alipay.android.msp.biz.scheme.MspSchemeActivity.MspSchemeHandler
                        public void handle(Intent intent) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f96ac96c", new Object[]{this, intent});
                                return;
                            }
                            MspSchemeActivity.unregisterHandler(this);
                            Activity activity3 = (Activity) weakReference.get();
                            if (activity3 == null || intent == null || intent.getIntExtra(l2o.COL_TASK, 0) != activity3.getTaskId()) {
                                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.ThirdPayStore.2.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            return;
                                        }
                                        Activity activity4 = (Activity) weakReference.get();
                                        if (activity4 != null && !activity4.isFinishing()) {
                                            activity4.startActivity(new Intent(activity4, EmptySchemeActivity.class));
                                        }
                                    }
                                });
                            }
                        }

                        @Override // com.alipay.android.msp.biz.scheme.MspSchemeActivity.MspSchemeHandler
                        public boolean shouldHandle(Intent intent) {
                            Uri data;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("86262e83", new Object[]{this, intent})).booleanValue();
                            }
                            return intent != null && (data = intent.getData()) != null && "alipay".equals(data.getScheme()) && "processpaymentresult".equals(data.getHost());
                        }
                    });
                }
            }
        }
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.ThirdPayStore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ThirdPayManager.triggerThirdPay(string, actionParamsJson, ThirdPayStore.access$000(ThirdPayStore.this), activity, new ThirdPayManager.ThirdPayFinishCallback() { // from class: com.alipay.android.msp.drivers.stores.store.events.ThirdPayStore.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.android.msp.biz.thirdpay.ThirdPayManager.ThirdPayFinishCallback
                        public void finish(ThirdPayManager.ThirdPayInvokeResult thirdPayInvokeResult) {
                            String str;
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("f2ef8e5", new Object[]{this, thirdPayInvokeResult});
                            } else if (thirdPayInvokeResult == null || thirdPayInvokeResult.invocationErr != null) {
                                LogUtil.record(8, "ThirdPayStore", "res but failed, action: " + string2);
                                ThirdPayStore thirdPayStore = ThirdPayStore.this;
                                ThirdPayStore.access$200(thirdPayStore, ThirdPayStore.access$100(thirdPayStore), string2);
                                EventAction eventAction2 = eventAction;
                                if (thirdPayInvokeResult != null) {
                                    str = thirdPayInvokeResult.toJson().toJSONString();
                                } else {
                                    str = "{}";
                                }
                                Utils.sendToDocument(eventAction2, str);
                            } else if (thirdPayInvokeResult.isJumpSucc()) {
                                LogUtil.record(8, "ThirdPayStore", "jumpSuccess, action: " + string3);
                                ThirdPayStore thirdPayStore2 = ThirdPayStore.this;
                                ThirdPayStore.access$200(thirdPayStore2, ThirdPayStore.access$300(thirdPayStore2), string3);
                            } else {
                                Utils.sendToDocument(eventAction, thirdPayInvokeResult.toJson().toJSONString());
                            }
                        }
                    }, new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.ThirdPayStore.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            LogUtil.record(8, "ThirdPayStore", "failed, action: " + string2);
                            ThirdPayStore thirdPayStore = ThirdPayStore.this;
                            ThirdPayStore.access$200(thirdPayStore, ThirdPayStore.access$400(thirdPayStore), string2);
                            Utils.sendToDocument(eventAction, ThirdPayManager.ThirdPayInvokeResult.makeErr("failed").toJson().toJSONString());
                        }
                    });
                }
            }
        });
        return InvokeActionPlugin.AYSNC_CALLBACK;
    }
}
