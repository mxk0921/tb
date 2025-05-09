package com.taobao.weex.adapter;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.utils.Switch;
import com.taobao.weex.utils.TBWXConfigManger;
import com.taobao.weex.utils.WXExceptionUtils;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXUtils;
import java.util.HashMap;
import java.util.Iterator;
import tb.a0s;
import tb.c8;
import tb.czr;
import tb.fbe;
import tb.h9;
import tb.hij;
import tb.hvw;
import tb.n8;
import tb.n9;
import tb.qj4;
import tb.t2o;
import tb.u8;
import tb.xnj;
import tb.y7;
import tb.zmj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBWXNavProcessor implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String AFC_WEE_THEMIS = "afc_tms_weex";
    private static final String BROWSER_ONLY_CATEGORY = "com.taobao.intent.category.HYBRID_UI";
    private static final String FORCE_THEMIS = "tms_force";
    private static final String FROM = "_wx_f_";
    private static final String FROM_WEEX = "1";
    private static final String FROM_WEEX_DEGRADE_H5 = "2";
    private static final String TAG = "TBWXNavProcessor";
    private static final String WEEX_FORCE_THEMIS = "weex_force_tms";
    private static final String WEEX_ORIGINAL_URL = "weex_original_url";
    private static final String WEEX_POP_ID = "wx_popId";
    private static final String WEEX_POP_INTERCEPT_LOW_DEVICE_DOWNGRADE = "weex_pop_down_grade";
    private static final String WEEX_POP_LOADING = "weex_pop_loading";
    private static final String WEEX_POP_LOW_DEVICE = "pop_low_device";
    private static final String WEEX_POP_PAN_ENABLE = "weex_pop_pan_enable";
    private static volatile int mPopIndex = 0;

    static {
        t2o.a(773849111);
        t2o.a(578814049);
    }

    private boolean checkWaitLoading(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c50a925", new Object[]{this, uri})).booleanValue();
        }
        if ((urlInWaitLoadingList(uri) || uri.getBooleanQueryParameter(qj4.f, false) || Switch.isSwitchOn(".force_WXActivity_loading").booleanValue()) && !Switch.isSwitchOn(".disableWeexRemote").booleanValue()) {
            return true;
        }
        return false;
    }

    private void downgradeToH5(Uri uri, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26d8ffc0", new Object[]{this, uri, intent});
            return;
        }
        intent.addCategory("com.taobao.intent.category.HYBRID_UI");
        intent.removeCategory(qj4.f26780a);
        WXExceptionUtils.commitCriticalExceptionWithDefaultUrl(uri.toString(), null, WXErrorCode.WX_DEGRAD_ERR, "degradeToH5", "degradeToH5 Remote has not installed", null);
    }

    private void preInitWeexInstance(String str, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("967f990d", new Object[]{this, str, uri});
        } else if (uri != null && str != null) {
            Log.e("test->", "try strart preinit for ".concat(str));
            hvw.a().c(uri, str);
        }
    }

    private void processRedimIntent(Intent intent, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80112f41", new Object[]{this, intent, uri});
            return;
        }
        intent.removeCategory(qj4.f26780a);
        intent.setData(uri.buildUpon().authority("tb.cn").path("/n/redim").appendQueryParameter("weex_original_url", uri.toString()).build());
    }

    private boolean urlInWaitLoadingList(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46b9a293", new Object[]{this, uri})).booleanValue();
        }
        try {
            Iterator<Object> it = JSON.parseArray(a0s.b()).iterator();
            while (it.hasNext()) {
                if (uri.toString().contains(String.valueOf(it.next()))) {
                    return true;
                }
            }
        } catch (Throwable th) {
            WXLogUtils.e(TAG, th);
        }
        return false;
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return TAG;
    }

    public void reportExpURL(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0a9c81", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && str.indexOf("h5.m.taobao.com/weex/viewpage.htm") != -1) {
            try {
                WXLogUtils.d(TAG, "degrade:" + TBWXConfigManger.getInstance().isDegrade());
                HashMap hashMap = new HashMap();
                hashMap.put("degradeToWindVaneUrl", str);
                AppMonitor.Alarm.commitFail("weex", "WeexErrorUrl", JSON.toJSONString(hashMap), str2, "url match h5.m.taobao.com/weex/viewpage.htm");
                WXLogUtils.d(TAG, "degrade: url [" + str + "] match h5.m.taobao.com/weex/viewpage.htm");
            } catch (Throwable th) {
                Log.e(TAG, "degrade: url [" + str + "] match h5.m.taobao.com/weex/viewpage.htm error", th);
            }
        }
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    private void interceptWeex2Pop(Uri uri, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8ca95f8", new Object[]{this, uri, zmjVar});
            return;
        }
        n9 n9Var = new n9();
        n9Var.i(zmjVar.d());
        if (!(!(zmjVar.d() instanceof Activity) || ((Activity) zmjVar.d()).getWindow() == null || ((Activity) zmjVar.d()).getWindow().getDecorView() == null)) {
            n9Var.m(((Activity) zmjVar.d()).getWindow().getDecorView());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "showWeex2Pop");
        JSONObject jSONObject2 = new JSONObject();
        String str = "popId" + mPopIndex;
        mPopIndex++;
        Uri build = uri.buildUpon().appendQueryParameter("wx_popId", str).build();
        jSONObject2.put("url", (Object) build.toString());
        jSONObject2.put("popId", (Object) str);
        boolean equals = build.getQueryParameter(WEEX_POP_LOADING) != null ? "true".equals(build.getQueryParameter(WEEX_POP_LOADING)) : false;
        boolean equals2 = build.getQueryParameter(WEEX_POP_PAN_ENABLE) != null ? "true".equals(build.getQueryParameter(WEEX_POP_PAN_ENABLE)) : true;
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("animation", (Object) "fadeInOut");
        jSONObject3.put("tapEnable", (Object) Boolean.TRUE);
        jSONObject3.put("pushType", (Object) "outterJump");
        jSONObject3.put("originHeight", (Object) 1);
        jSONObject3.put("maxHeight", (Object) 1);
        jSONObject3.put(hij.KEY_CORNER_RADIUS, (Object) 0);
        jSONObject3.put("attachMode", (Object) "activity");
        jSONObject3.put("showLoading", (Object) Boolean.valueOf(equals));
        jSONObject3.put("panEnable", (Object) Boolean.valueOf(equals2));
        jSONObject2.put(h9.KEY_POP_CONFIG, (Object) jSONObject3);
        jSONObject.put("params", (Object) jSONObject2);
        new y7().b(new n8(jSONObject), n9Var, new u8() { // from class: com.taobao.weex.adapter.TBWXNavProcessor.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.u8
            public void callback(String str2, c8 c8Var) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc026703", new Object[]{this, str2, c8Var});
                }
            }
        });
    }

    private boolean tryNavToWeex1(final Context context, Uri uri, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ca0c654", new Object[]{this, context, uri, intent})).booleanValue();
        }
        if (WXUtils.checkForceDowngrade(uri.toString())) {
            if (WXEnvironment.isApkDebugable()) {
                WXSDKManager.getInstance().postOnUiThread(new Runnable() { // from class: com.taobao.weex.adapter.TBWXNavProcessor.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            Toast.makeText(context, "Weex1.0即将下线，请尽快迁移", 0).show();
                        }
                    }
                }, 0L);
            }
            downgradeToH5(uri, intent);
            return true;
        } else if (checkWaitLoading(uri)) {
            final Uri build = uri.buildUpon().appendQueryParameter(qj4.f, "true").build();
            czr.b("init", uri.toString(), null, true, new fbe.a() { // from class: com.taobao.weex.adapter.TBWXNavProcessor.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.fbe.a
                public void onError(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ac367d3a", new Object[]{this, str});
                        return;
                    }
                    TLog.loge("Weex", TBWXNavProcessor.TAG, "tryNavToWeex1 failed : " + str);
                }

                @Override // tb.fbe.a
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                        return;
                    }
                    WXLogUtils.e(TBWXNavProcessor.TAG, "tryNavToWeex1 success");
                    intent.addCategory(qj4.f26780a);
                    intent.putExtra(qj4.e, build.toString());
                    intent.setData(build.buildUpon().authority("h5.m.taobao.com").path("/weex/viewpage.htm").appendQueryParameter("weex_original_url", build.toString()).build());
                    intent.setComponent(new ComponentName(context, "com.taobao.weex.WXActivity"));
                    intent.putExtra("weex_original_url", build.toString());
                    try {
                        if (intent.resolveActivity(context.getPackageManager()) == null) {
                            WXLogUtils.e(TBWXNavProcessor.TAG, "cannot resolveActivity!");
                        }
                    } catch (Throwable th) {
                        WXLogUtils.e(TBWXNavProcessor.TAG, th);
                    }
                    WXLogUtils.e(TBWXNavProcessor.TAG, "intent :" + intent.toString());
                    context.startActivity(intent);
                }
            });
            return false;
        } else if (czr.a(context)) {
            intent.putExtra(qj4.e, uri.toString());
            intent.setData(uri.buildUpon().authority("h5.m.taobao.com").path("/weex/viewpage.htm").appendQueryParameter("weex_original_url", uri.toString()).build());
            intent.putExtra("weex_original_url", uri.toString());
            return true;
        } else {
            downgradeToH5(uri, intent);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x03a0 A[ADDED_TO_REGION] */
    @Override // tb.xnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean process(android.content.Intent r21, tb.zmj r22) {
        /*
            Method dump skipped, instructions count: 1329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.adapter.TBWXNavProcessor.process(android.content.Intent, tb.zmj):boolean");
    }
}
