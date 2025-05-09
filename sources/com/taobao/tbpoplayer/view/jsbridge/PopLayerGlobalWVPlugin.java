package com.taobao.tbpoplayer.view.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.info.mock.PopLayerMockManager;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kpw;
import tb.nsw;
import tb.rg0;
import tb.rgm;
import tb.t2o;
import tb.uem;
import tb.vem;
import tb.wdm;
import tb.ybu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PopLayerGlobalWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements uem.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f13420a;
        public final /* synthetic */ String b;

        public a(PopLayerGlobalWVPlugin popLayerGlobalWVPlugin, WVCallBackContext wVCallBackContext, String str) {
            this.f13420a = wVCallBackContext;
            this.b = str;
        }

        @Override // tb.uem.b
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30005e67", new Object[]{this, str, str2, str3});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("popId", (Object) str);
            jSONObject.put("protocol", (Object) str2);
            jSONObject.put("onProcess", (Object) "displayed");
            this.f13420a.fireEvent("PopLayerTriggerEvent", jSONObject.toJSONString());
        }

        @Override // tb.uem.b
        public void b(String str, boolean z, boolean z2, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e12c310", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, str3});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("popId", (Object) str);
            jSONObject.put("protocol", (Object) this.b);
            jSONObject.put("onProcess", (Object) IDecisionResult.STATE_CLOSED);
            jSONObject.put("closeReason", (Object) str2);
            jSONObject.put("closeSubReason", (Object) str3);
            this.f13420a.fireEvent("PopLayerTriggerEvent", jSONObject.toJSONString());
        }

        @Override // tb.uem.b
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42b06e87", new Object[]{this, str});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("protocol", (Object) this.b);
            jSONObject.put("onProcess", (Object) "triggerFailed");
            jSONObject.put("closeReason", (Object) str);
            this.f13420a.fireEvent("PopLayerTriggerEvent", jSONObject.toJSONString());
        }
    }

    static {
        t2o.a(790626534);
    }

    private Activity getActivityContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("b26b5e57", new Object[]{this});
        }
        Context context = this.mContext;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return PopLayer.getReference().internalGetCurrentActivity();
    }

    private long getVersionCode(Activity activity, String str) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("beb63146", new Object[]{this, activity, str})).longValue();
        }
        try {
            PackageInfo packageInfo = activity.getPackageManager().getPackageInfo(str, 128);
            if (packageInfo == null) {
                return -1L;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                j = packageInfo.getLongVersionCode();
            } else {
                j = packageInfo.versionCode;
            }
            return j;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    public static /* synthetic */ Object ipc$super(PopLayerGlobalWVPlugin popLayerGlobalWVPlugin, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/view/jsbridge/PopLayerGlobalWVPlugin");
    }

    private boolean jumpApp(Activity activity, Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ede931e9", new Object[]{this, activity, uri, str})).booleanValue();
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setPackage(str);
            intent.setData(uri);
            activity.startActivity(intent);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean enableAddCommentVIVO(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bf9c7b8", new Object[]{this, context})).booleanValue();
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.bbk.appstore", 0);
            if (packageInfo != null) {
                if (packageInfo.versionCode >= 5020) {
                    return true;
                }
                return false;
            }
        } catch (Throwable th) {
            wdm.h("enableAddCommentVIVO.error", th);
        }
        return false;
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    public boolean jumpToCommentOPPO(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2aad093", new Object[]{this, activity})).booleanValue();
        }
        String str = "oaps://mk/developer/comment?pkg=" + activity.getPackageName();
        long j = 84000;
        if (getVersionCode(activity, "com.heytap.market") >= j) {
            return jumpApp(activity, Uri.parse(str), "com.heytap.market");
        }
        if (getVersionCode(activity, "com.oppo.market") >= j) {
            return jumpApp(activity, Uri.parse(str), "com.oppo.market");
        }
        return false;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        nsw nswVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            nswVar = new nsw();
        } catch (Throwable th) {
            wdm.h("PopLayerGlobalWVPlugin.execute." + str + ".error.", th);
            wVCallBackContext.error();
        }
        if (!"recordDisplay".equals(str) && !"recordUserBehavior".equals(str) && !"recordClose".equals(str)) {
            if ("info".equals(str)) {
                nswVar.b("sdkAdapterVersion", "");
                nswVar.a("isSupportConstraintMock", Boolean.TRUE);
                nswVar.a("isMock", Boolean.valueOf(PopLayerMockManager.instance().isMocking()));
                nswVar.a("isPersistentMock", Boolean.valueOf(PopLayerMockManager.instance().isPersistentMocking()));
                wVCallBackContext.success(nswVar);
                return true;
            } else if ("trigger".equals(str)) {
                JSONObject parseObject = JSON.parseObject(str2);
                String string = parseObject.getString("protocol");
                uem.m(string, parseObject.getString("param")).k(parseObject.getString("traceInfo")).j(new a(this, wVCallBackContext, string)).l();
                wVCallBackContext.success(nswVar);
                return true;
            } else if ("postCustomEvent".equals(str)) {
                JSONObject parseObject2 = JSON.parseObject(str2);
                rgm.h().p(parseObject2.getString("sourceName"), parseObject2.getString("event"), parseObject2.getJSONObject("content"), parseObject2.getJSONObject("externalParams"));
                wVCallBackContext.success(nswVar);
                return true;
            } else {
                if ("showStoreReview".equals(str)) {
                    JSONObject parseObject3 = JSON.parseObject(str2);
                    if (!parseObject3.containsKey("jumpFirst") || !parseObject3.getBooleanValue("jumpFirst")) {
                        String lowerCase = Build.BRAND.toLowerCase();
                        if ("vivo".equals(lowerCase)) {
                            if (jumpToCommentVIVO(getActivityContext())) {
                                nswVar.a("show", Boolean.TRUE);
                                nswVar.a(ybu.INTERCEPT_CONFIG_POINT_TRACKER_TYPE_JUMP, Boolean.FALSE);
                                wVCallBackContext.success(nswVar);
                                return true;
                            }
                        } else if ("oppo".equals(lowerCase) && jumpToCommentOPPO(getActivityContext())) {
                            nswVar.a("show", Boolean.TRUE);
                            nswVar.a(ybu.INTERCEPT_CONFIG_POINT_TRACKER_TYPE_JUMP, Boolean.FALSE);
                            wVCallBackContext.success(nswVar);
                            return true;
                        }
                    }
                    if (!parseObject3.containsKey("onlyShow") || !parseObject3.getBooleanValue("onlyShow")) {
                        nswVar.a(ybu.INTERCEPT_CONFIG_POINT_TRACKER_TYPE_JUMP, Boolean.valueOf(vem.i(getActivityContext(), parseObject3.getString(rg0.JUMP_URL))));
                        nswVar.a("show", Boolean.FALSE);
                        wVCallBackContext.success(nswVar);
                        return true;
                    }
                    Boolean bool = Boolean.FALSE;
                    nswVar.a(ybu.INTERCEPT_CONFIG_POINT_TRACKER_TYPE_JUMP, bool);
                    nswVar.a("show", bool);
                    wVCallBackContext.success(nswVar);
                    return true;
                }
                return false;
            }
        }
        wVCallBackContext.success(nswVar);
        return true;
    }

    public boolean jumpToCommentVIVO(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b1a6e9f", new Object[]{this, activity})).booleanValue();
        }
        if (!enableAddCommentVIVO(activity)) {
            return false;
        }
        String packageName = this.mContext.getPackageName();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName + "&th_name=need_comment"));
        intent.setPackage("com.bbk.appstore");
        intent.setFlags(268468224);
        getActivityContext().startActivity(intent);
        return true;
    }
}
