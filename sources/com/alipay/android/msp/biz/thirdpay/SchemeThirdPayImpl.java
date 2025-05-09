package com.alipay.android.msp.biz.thirdpay;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.biz.scheme.MspSchemeActivity;
import com.alipay.android.msp.biz.thirdpay.ThirdPayManager;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.ui.base.ActivityResultManager;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SchemeThirdPayImpl implements ThirdPayManager.ThirdPayImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "SchemeThirdPayImpl";
    private static final int THIRD_PAY_REQUEST_CODE = 3100;
    private final MspSchemeActivity.MspSchemeHandler handler;
    private boolean isSupportDCEP = true;
    private final HashMap<String, ThirdPayManager.ThirdPayFinishCallback> schemeCallbacks = new HashMap<>();
    private ThirdPayManager.ThirdPayFinishCallback latestSchemeCallback = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public @interface CallBackTypeVal {
        public static final String VAL_SCHEME = "02";
        public static final String VAL_START_ACTIVITY = "01";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public @interface ResultCodeVal {
        public static final String VAL_ALREADY_CLOSED = "4";
        public static final String VAL_ALREADY_DONE = "3";
        public static final String VAL_CANCEL = "1";
        public static final String VAL_FAIL = "0";
        public static final String VAL_INPUT_ERROR = "101";
        public static final String VAL_IN_PROGRESS = "2";
        public static final String VAL_OK = "-1";
        public static final String VAL_UNKNOWN_ERROR = "102";
    }

    public SchemeThirdPayImpl() {
        MspSchemeActivity.MspSchemeHandler mspSchemeHandler = new MspSchemeActivity.MspSchemeHandler() { // from class: com.alipay.android.msp.biz.thirdpay.SchemeThirdPayImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.biz.scheme.MspSchemeActivity.MspSchemeHandler
            public String getName() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
                }
                return SchemeThirdPayImpl.LOG_TAG;
            }

            @Override // com.alipay.android.msp.biz.scheme.MspSchemeActivity.MspSchemeHandler
            public void handle(Intent intent) {
                ThirdPayManager.ThirdPayFinishCallback thirdPayFinishCallback;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f96ac96c", new Object[]{this, intent});
                    return;
                }
                Uri data = intent != null ? intent.getData() : null;
                LogUtil.record(2, SchemeThirdPayImpl.LOG_TAG, "sc result uri ".concat(String.valueOf(data)));
                if (data != null) {
                    String queryParameter = data.getQueryParameter("callBackParams");
                    if (!SchemeThirdPayImpl.access$000(SchemeThirdPayImpl.this) || !TextUtils.isEmpty(queryParameter)) {
                        thirdPayFinishCallback = (ThirdPayManager.ThirdPayFinishCallback) SchemeThirdPayImpl.access$100(SchemeThirdPayImpl.this).remove(queryParameter);
                    } else {
                        thirdPayFinishCallback = SchemeThirdPayImpl.access$200(SchemeThirdPayImpl.this);
                    }
                    if (thirdPayFinishCallback != null) {
                        SchemeThirdPayImpl.access$300(SchemeThirdPayImpl.this, data, thirdPayFinishCallback);
                    }
                }
            }

            @Override // com.alipay.android.msp.biz.scheme.MspSchemeActivity.MspSchemeHandler
            public boolean shouldHandle(Intent intent) {
                Uri data;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("86262e83", new Object[]{this, intent})).booleanValue();
                }
                if (intent == null || (data = intent.getData()) == null) {
                    return false;
                }
                return ("alipay".equals(data.getScheme()) || "msptaobao".equals(data.getScheme())) && "processpaymentresult".equals(data.getHost());
            }
        };
        this.handler = mspSchemeHandler;
        MspSchemeActivity.registerHandler(mspSchemeHandler);
    }

    public static /* synthetic */ boolean access$000(SchemeThirdPayImpl schemeThirdPayImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccdac3ee", new Object[]{schemeThirdPayImpl})).booleanValue();
        }
        return schemeThirdPayImpl.isSupportDCEP;
    }

    public static /* synthetic */ HashMap access$100(SchemeThirdPayImpl schemeThirdPayImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("fea1e8ce", new Object[]{schemeThirdPayImpl});
        }
        return schemeThirdPayImpl.schemeCallbacks;
    }

    public static /* synthetic */ ThirdPayManager.ThirdPayFinishCallback access$200(SchemeThirdPayImpl schemeThirdPayImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThirdPayManager.ThirdPayFinishCallback) ipChange.ipc$dispatch("9dd1f252", new Object[]{schemeThirdPayImpl});
        }
        return schemeThirdPayImpl.latestSchemeCallback;
    }

    public static /* synthetic */ void access$300(SchemeThirdPayImpl schemeThirdPayImpl, Uri uri, ThirdPayManager.ThirdPayFinishCallback thirdPayFinishCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11221ee2", new Object[]{schemeThirdPayImpl, uri, thirdPayFinishCallback});
        } else {
            schemeThirdPayImpl.sendResult(uri, thirdPayFinishCallback);
        }
    }

    private boolean getDegradeDCEP(Activity activity) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("626ff147", new Object[]{this, activity})).booleanValue();
        }
        if (activity != null && DrmManager.getInstance(activity).isDegrade(DrmKey.DEGRADE_DCEP_UNION_THIRD_PAY, false, activity)) {
            z = false;
        }
        this.isSupportDCEP = z;
        LogUtil.record(2, LOG_TAG, "getDegradeDCEP isSupportDCEP:" + this.isSupportDCEP);
        return this.isSupportDCEP;
    }

    private void invokeByScheme(final ThirdPayManager.ThirdPayFinishCallback thirdPayFinishCallback, Uri uri, String str, final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb538420", new Object[]{this, thirdPayFinishCallback, uri, str, activity});
            return;
        }
        if (this.isSupportDCEP) {
            if (!TextUtils.isEmpty(str)) {
                this.schemeCallbacks.put(str, thirdPayFinishCallback);
            }
            this.latestSchemeCallback = thirdPayFinishCallback;
        } else {
            this.schemeCallbacks.put(str, thirdPayFinishCallback);
        }
        final Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.biz.thirdpay.SchemeThirdPayImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                boolean z = false;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                } catch (Throwable unused) {
                    LogUtil.record(4, SchemeThirdPayImpl.LOG_TAG, "failed to exec intent");
                }
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    activity.startActivity(intent);
                    z = true;
                    ThirdPayManager.ThirdPayFinishCallback thirdPayFinishCallback2 = thirdPayFinishCallback;
                    if (thirdPayFinishCallback2 == null) {
                        return;
                    }
                    if (z) {
                        thirdPayFinishCallback2.finish(ThirdPayManager.ThirdPayInvokeResult.makeJumpSucc());
                    } else {
                        thirdPayFinishCallback2.finish(ThirdPayManager.ThirdPayInvokeResult.makeErr("failed"));
                    }
                } else {
                    throw new ActivityNotFoundException("cannot resolve activity");
                }
            }
        });
    }

    private void invokeByStartActivityForResult(final ThirdPayManager.ThirdPayFinishCallback thirdPayFinishCallback, Uri uri, final String str, final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16b64a10", new Object[]{this, thirdPayFinishCallback, uri, str, activity});
            return;
        }
        ActivityResultManager.registerActivityResultHandler(activity, new ActivityResultManager.ActivityResultHandler() { // from class: com.alipay.android.msp.biz.thirdpay.SchemeThirdPayImpl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.ui.base.ActivityResultManager.ActivityResultHandler
            public void handleResult(Activity activity2, int i, int i2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4207835b", new Object[]{this, activity2, new Integer(i), new Integer(i2), intent});
                } else if (i == 3100) {
                    if (intent == null || intent.getData() == null) {
                        LogUtil.record(8, SchemeThirdPayImpl.LOG_TAG, "result without data");
                        thirdPayFinishCallback.finish(ThirdPayManager.ThirdPayInvokeResult.makeErr("failed"));
                        ActivityResultManager.unregisterActivityResultHandler(this);
                        return;
                    }
                    Uri data = intent.getData();
                    LogUtil.record(2, SchemeThirdPayImpl.LOG_TAG, "result uri " + data.toString());
                    String queryParameter = data.getQueryParameter("callBackParams");
                    if (!TextUtils.equals(queryParameter, str)) {
                        LogUtil.record(8, SchemeThirdPayImpl.LOG_TAG, "callback mismatch " + queryParameter + ", " + str);
                        thirdPayFinishCallback.finish(ThirdPayManager.ThirdPayInvokeResult.makeErr("failed"));
                        ActivityResultManager.unregisterActivityResultHandler(this);
                        return;
                    }
                    SchemeThirdPayImpl.access$300(SchemeThirdPayImpl.this, data, thirdPayFinishCallback);
                    ActivityResultManager.unregisterActivityResultHandler(this);
                }
            }
        });
        final Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.biz.thirdpay.SchemeThirdPayImpl.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    activity.startActivityForResult(intent, 3100);
                }
            }
        });
    }

    private void sendResult(Uri uri, ThirdPayManager.ThirdPayFinishCallback thirdPayFinishCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c433823", new Object[]{this, uri, thirdPayFinishCallback});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, (Object) uri.toString());
        if (this.isSupportDCEP) {
            thirdPayFinishCallback.finish(ThirdPayManager.ThirdPayInvokeResult.makeOk(jSONObject.toString()));
            return;
        }
        String queryParameter = uri.getQueryParameter("resultCode");
        uri.getQueryParameter("resultMsg");
        if ("-1".equals(queryParameter)) {
            jSONObject.put("code", (Object) "success");
            thirdPayFinishCallback.finish(ThirdPayManager.ThirdPayInvokeResult.makeOk(jSONObject.toString()));
            return;
        }
        thirdPayFinishCallback.finish(ThirdPayManager.ThirdPayInvokeResult.makeErr(jSONObject.toString()));
    }

    @Override // com.alipay.android.msp.biz.thirdpay.ThirdPayManager.ThirdPayImpl
    public void doThirdPay(JSONObject jSONObject, int i, Activity activity, ThirdPayManager.ThirdPayFinishCallback thirdPayFinishCallback) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b8bfc0", new Object[]{this, jSONObject, new Integer(i), activity, thirdPayFinishCallback});
            return;
        }
        getDegradeDCEP(activity);
        if (activity == null || activity.isFinishing()) {
            LogUtil.record(8, LOG_TAG, "do: error - missing activity ".concat(String.valueOf(activity)));
            thirdPayFinishCallback.finish(ThirdPayManager.ThirdPayInvokeResult.makeErr("failed"));
            return;
        }
        if (jSONObject != null) {
            str = jSONObject.getString("order");
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.record(8, LOG_TAG, "do: error - missing args ".concat(String.valueOf(str)));
            thirdPayFinishCallback.finish(ThirdPayManager.ThirdPayInvokeResult.makeErr("failed"));
            return;
        }
        try {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("callBackType");
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = "02";
            }
            String queryParameter2 = parse.getQueryParameter("callBackParams");
            if (!this.isSupportDCEP && queryParameter2 == null) {
                LogUtil.e(LOG_TAG, "doThirdPay", "do - error - missing url args " + queryParameter + ", " + queryParameter2);
                thirdPayFinishCallback.finish(ThirdPayManager.ThirdPayInvokeResult.makeErr("failed"));
            } else if ("01".equals(queryParameter)) {
                invokeByStartActivityForResult(thirdPayFinishCallback, parse, queryParameter2, activity);
            } else if ("02".equals(queryParameter)) {
                invokeByScheme(thirdPayFinishCallback, parse, queryParameter2, activity);
            } else {
                LogUtil.e(LOG_TAG, "doThirdPay", "do - error - unknown type ".concat(String.valueOf(queryParameter)));
                thirdPayFinishCallback.finish(ThirdPayManager.ThirdPayInvokeResult.makeErr("failed"));
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(LOG_TAG, "do: error - order is not uri".concat(String.valueOf(str)), th);
            thirdPayFinishCallback.finish(ThirdPayManager.ThirdPayInvokeResult.makeErr("failed"));
        }
    }

    @Override // com.alipay.android.msp.biz.thirdpay.ThirdPayManager.ThirdPayImpl
    public boolean isAvailable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14891cc6", new Object[]{this, context})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.android.msp.biz.thirdpay.ThirdPayManager.ThirdPayImpl
    public String targetType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34616b6e", new Object[]{this});
        }
        return "scheme";
    }
}
