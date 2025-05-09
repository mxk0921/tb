package com.taobao.android.ugc.h5;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.ugc.service.ICallback;
import com.taobao.android.ugc.service.a;
import tb.kpw;
import tb.nsw;
import tb.puc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WVMicorPublishPlugin extends kpw implements ICallback {
    public static final String DATA = "data";
    public static final String DISMISS_ACTION = "dismiss";
    public static final String ERROR_CODE = "errorCode";
    public static final String ERROR_MSG = "errorMsg";
    public static final String PUBLISH_ERROR_EVENT_NAME = "WVPublish.Event.Error";
    public static final String PUBLISH_SUCCESS_EVENT_NAME = "WVPublish.Event.Success";
    public static final String RESULT = "result";
    public static final String SHOW_ACTION = "show";
    public static final String TEMPLATE_URL = "templateUrl";
    private WVCallBackContext mCallback;
    private puc mMicroPublish;

    static {
        t2o.a(758120502);
        t2o.a(758120504);
    }

    private void init(Context context) {
        this.mMicroPublish = new a(context);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return null;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        this.mCallback = wVCallBackContext;
        try {
        } catch (Exception e) {
            e.printStackTrace();
            this.mCallback.error(e.getMessage());
        }
        if ("show".equalsIgnoreCase(str)) {
            JSONObject parseObject = JSON.parseObject(str2);
            String string = parseObject.getString(TEMPLATE_URL);
            String string2 = parseObject.getString("data");
            if (TextUtils.isEmpty(string2)) {
                this.mCallback.error("data is invalid!");
                return false;
            }
            ((a) this.mMicroPublish).l(string, string2, this);
            this.mCallback.success();
            return true;
        }
        if ("dismiss".equalsIgnoreCase(str)) {
            ((a) this.mMicroPublish).f();
            this.mCallback.success();
            return true;
        }
        return false;
    }

    @Override // tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView) {
        super.initialize(context, iWVWebView);
        init(context);
    }

    @Override // tb.kpw
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        try {
            ((a) this.mMicroPublish).j(i, i2, intent);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        ((a) this.mMicroPublish).f();
        super.onDestroy();
    }

    @Override // com.taobao.android.ugc.service.ICallback
    public void onFailure(String str, String str2) throws RemoteException {
        nsw nswVar = new nsw();
        nswVar.b("errorCode", str);
        nswVar.b("errorMsg", str2);
        this.mCallback.fireEvent(PUBLISH_ERROR_EVENT_NAME, nswVar.m());
    }

    @Override // com.taobao.android.ugc.service.ICallback
    public void onSuccess(String str) throws RemoteException {
        nsw nswVar = new nsw();
        nswVar.k();
        nswVar.b("result", str);
        this.mCallback.fireEvent(PUBLISH_SUCCESS_EVENT_NAME, nswVar.m());
    }

    @Override // tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView, Object obj) {
        super.initialize(context, iWVWebView, obj);
        init(context);
    }

    @Override // com.taobao.android.ugc.service.ICallback
    public void onResult(float f, float f2) throws RemoteException {
    }
}
