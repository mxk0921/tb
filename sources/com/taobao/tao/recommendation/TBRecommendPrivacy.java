package com.taobao.tao.recommendation;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.wireless.aliprivacyext.recommendation.c;
import com.alibaba.wireless.aliprivacyext.recommendation.e;
import com.alibaba.wireless.aliprivacyext.track.model.TrackLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.g01;
import tb.kpw;
import tb.nsw;
import tb.p4y;
import tb.rsx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBRecommendPrivacy extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String GET_STATES = "getStatus";
    private static final String SET_STATUS = "setStatus";
    private static final String TAG = "TBRecommendPrivacy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements p4y {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f12729a;
        public final /* synthetic */ String b;

        public a(WVCallBackContext wVCallBackContext, String str) {
            this.f12729a = wVCallBackContext;
            this.b = str;
        }

        @Override // tb.p4y
        public void onFail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
                return;
            }
            this.f12729a.error();
            TBRecommendPrivacy.access$000(TBRecommendPrivacy.this, this.b, false, str);
        }

        @Override // tb.p4y
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            this.f12729a.success();
            TBRecommendPrivacy.access$000(TBRecommendPrivacy.this, this.b, true, null);
        }
    }

    public static /* synthetic */ void access$000(TBRecommendPrivacy tBRecommendPrivacy, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1f5cfe", new Object[]{tBRecommendPrivacy, str, new Boolean(z), str2});
        } else {
            tBRecommendPrivacy.trackModifyEnd(str, z, str2);
        }
    }

    public static /* synthetic */ Object ipc$super(TBRecommendPrivacy tBRecommendPrivacy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommendation/TBRecommendPrivacy");
    }

    private void trackModifyEnd(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3e16d77", new Object[]{this, str, new Boolean(z), str2});
        } else {
            TrackLog.trackModifyRecommendStatusLogEnd(this.mContext, str, "TBJSBridge", z, str2);
        }
    }

    private void trackModifyStart(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97f984e", new Object[]{this, str});
        } else {
            TrackLog.trackModifyRecommendStatusLogStart(this.mContext, str, "TBJSBridge");
        }
    }

    private void trackQueryStart(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c23b5d40", new Object[]{this, str, str2});
        } else {
            TrackLog.trackQueryRecommendStatusLog(this.mContext, str2, "TBJSBridge", TAG, str, 0L);
        }
    }

    @Override // tb.kpw
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.mContext;
    }

    private boolean getStates(String str, WVCallBackContext wVCallBackContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1572864a", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        nsw nswVar = new nsw();
        try {
            jSONObject = new JSONObject();
        } catch (Throwable th) {
            nswVar.b("errMsg", th.getMessage());
            wVCallBackContext.error(nswVar);
        }
        if (rsx.b(this.mContext)) {
            jSONObject.put("content", rsx.d(this.mContext));
            nswVar.d("result", jSONObject);
            wVCallBackContext.success(nswVar);
            trackQueryStart(str, e.NO_UID.getStatus());
            return true;
        }
        e b = c.R().b("AliPrivacySDK");
        jSONObject.put("content", b.getRecommendSwitchBooleanStatus());
        nswVar.d("result", jSONObject);
        wVCallBackContext.success(nswVar);
        trackQueryStart(str, b.getStatus());
        return true;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        g01.a(TAG, "action:" + str + "==>params:" + str2);
        if (GET_STATES.equals(str)) {
            return getStates(str2, wVCallBackContext);
        }
        if (SET_STATUS.equals(str)) {
            return setStates(str2, wVCallBackContext);
        }
        return false;
    }

    private boolean setStates(String str, WVCallBackContext wVCallBackContext) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef40bb56", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        trackModifyStart(str);
        System.currentTimeMillis();
        nsw nswVar = new nsw();
        try {
            z = new JSONObject(str).getBoolean("status");
        } catch (Throwable th) {
            nswVar.b("errMsg", th.getMessage());
            wVCallBackContext.error(nswVar);
            trackModifyEnd(str, false, th.getMessage());
        }
        if (rsx.b(this.mContext)) {
            rsx.a(this.mContext, z);
            wVCallBackContext.success();
            trackModifyEnd(str, true, null);
            return true;
        }
        c.R().t(z, true, new a(wVCallBackContext, str));
        return true;
    }
}
