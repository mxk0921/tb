package com.taobao.search.sf.weex.module;

import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.musie.MUSXSearchEventModule;
import tb.dnx;
import tb.h19;
import tb.kpw;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class XSearchEventBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_GET_NAVIGATION_INFO = "getNavigationInfo";
    private static final String ACTION_OPEN_URL = "openUrl";
    private static final String ACTION_SEARCH = "search";
    public static final String API_NAME = "TBSearchWVBridge";
    private dnx mEventImpl = new dnx();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11706a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f11706a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MUSXSearchEventModule.openUrl(XSearchEventBridge.this.getContext(), this.f11706a, this.b);
            }
        }
    }

    static {
        t2o.a(815793530);
    }

    private void getNavigationInfo(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1058a41c", new Object[]{this, wVCallBackContext});
            return;
        }
        JSONObject navigationInfo = MUSXSearchEventModule.getNavigationInfo(getContext());
        if (navigationInfo != null) {
            try {
                nsw nswVar = new nsw();
                nswVar.h(new org.json.JSONObject(navigationInfo.toString()));
                wVCallBackContext.success(nswVar);
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ Object ipc$super(XSearchEventBridge xSearchEventBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/weex/module/XSearchEventBridge");
    }

    private void openUrl(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9355fa4", new Object[]{this, jSONObject});
            return;
        }
        try {
            String string = jSONObject.getString("url");
            String string2 = jSONObject.getString("params");
            if (Looper.getMainLooper() == Looper.myLooper()) {
                MUSXSearchEventModule.openUrl(getContext(), string, string2);
            } else {
                new Handler(Looper.getMainLooper()).post(new a(string, string2));
            }
        } catch (Exception unused) {
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            parseObject = JSON.parseObject(str2);
        } catch (Throwable unused) {
        }
        if (TextUtils.equals(str, "openUrl")) {
            openUrl(parseObject);
            return true;
        } else if (TextUtils.equals(str, ACTION_GET_NAVIGATION_INFO)) {
            getNavigationInfo(wVCallBackContext);
            return true;
        } else {
            JSONObject d = h19.d(parseObject, "message");
            if (d != null && str.equals("search")) {
                this.mEventImpl.r(null, this.mContext, d);
                return true;
            }
            return false;
        }
    }
}
