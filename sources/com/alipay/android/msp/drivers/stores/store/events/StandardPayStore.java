package com.alipay.android.msp.drivers.stores.store.events;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.sdk.app.PayTaskCompat;
import com.alipay.sdk.app.ResultStatus;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class StandardPayStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class StandardPayResult {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f3578a;
        public final String b;
        public final String c;

        public StandardPayResult(String str, String str2, String str3) {
            this.f3578a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String toJSONString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this});
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultStatus", (Object) this.f3578a);
            jSONObject.put("memo", (Object) this.b);
            jSONObject.put("result", (Object) this.c);
            return jSONObject.toJSONString();
        }
    }

    public StandardPayStore(int i) {
        super(i);
    }

    public static /* synthetic */ MspContext access$000(StandardPayStore standardPayStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("28cbac3", new Object[]{standardPayStore});
        }
        return standardPayStore.mMspContext;
    }

    public static /* synthetic */ MspContext access$100(StandardPayStore standardPayStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("1c3bff84", new Object[]{standardPayStore});
        }
        return standardPayStore.mMspContext;
    }

    public static /* synthetic */ MspContext access$200(StandardPayStore standardPayStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("35eb4445", new Object[]{standardPayStore});
        }
        return standardPayStore.mMspContext;
    }

    public static /* synthetic */ MspContext access$300(StandardPayStore standardPayStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("4f9a8906", new Object[]{standardPayStore});
        }
        return standardPayStore.mMspContext;
    }

    public static /* synthetic */ MspContext access$400(StandardPayStore standardPayStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("6949cdc7", new Object[]{standardPayStore});
        }
        return standardPayStore.mMspContext;
    }

    public static /* synthetic */ MspContext access$500(StandardPayStore standardPayStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("82f91288", new Object[]{standardPayStore});
        }
        return standardPayStore.mMspContext;
    }

    public static /* synthetic */ Object ipc$super(StandardPayStore standardPayStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/StandardPayStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(final EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspBasePresenter currentPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson == null || !actionParamsJson.containsKey("orderStr")) {
            ResultStatus resultStatus = ResultStatus.PARAMS_ERROR;
            return new StandardPayResult(String.valueOf(resultStatus.getStatus()), resultStatus.getMemo(), "").toJSONString();
        }
        MspUIClient mspUIClient = this.mMspUIClient;
        final Activity activity = (mspUIClient == null || (currentPresenter = mspUIClient.getCurrentPresenter()) == null) ? null : currentPresenter.getActivity();
        final String string = actionParamsJson.getString("orderStr");
        LogUtil.record(2, "StandardPayStore", "onMspAction", "orderStr=".concat(String.valueOf(string)));
        Thread thread = new Thread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.StandardPayStore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                String str;
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    String str3 = null;
                    Map<String, String> payV2 = new PayTaskCompat(activity, StandardPayStore.access$000(StandardPayStore.this) == null ? null : StandardPayStore.access$100(StandardPayStore.this).getStatisticInfo()).payV2(string, false);
                    if (payV2 != null) {
                        str2 = null;
                        str = null;
                        for (String str4 : payV2.keySet()) {
                            if (TextUtils.equals(str4, "resultStatus")) {
                                str3 = payV2.get(str4);
                            } else if (TextUtils.equals(str4, "result")) {
                                str = payV2.get(str4);
                            } else if (TextUtils.equals(str4, "memo")) {
                                str2 = payV2.get(str4);
                            }
                        }
                    } else {
                        str2 = null;
                        str = null;
                    }
                    if (StandardPayStore.access$200(StandardPayStore.this) != null && !String.valueOf(ResultStatus.SUCCEEDED.getStatus()).equals(str3) && !String.valueOf(ResultStatus.CANCELED.getStatus()).equals(str3)) {
                        StandardPayStore.access$300(StandardPayStore.this).getStatisticInfo().addError("np", "StandardPay-".concat(String.valueOf(str3)), "memo-".concat(String.valueOf(str2)));
                    }
                    LogUtil.record(2, "StandardPayStore", "onMspAction", "resultStatus=".concat(String.valueOf(str3)));
                    Utils.sendToDocument(eventAction, new StandardPayResult(str3, str2, str).toJSONString());
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                    if (StandardPayStore.access$400(StandardPayStore.this) != null) {
                        StandardPayStore.access$500(StandardPayStore.this).getStatisticInfo().addError(ErrorType.DEFAULT, "StandardPay-exception", th.getMessage());
                    }
                    EventAction eventAction2 = eventAction;
                    ResultStatus resultStatus2 = ResultStatus.FAILED;
                    Utils.sendToDocument(eventAction2, new StandardPayResult(String.valueOf(resultStatus2.getStatus()), resultStatus2.getMemo(), "").toJSONString());
                }
            }
        });
        thread.setName("StandardPayStoreThread");
        TaskHelper.execute(thread);
        return InvokeActionPlugin.AYSNC_CALLBACK;
    }
}
