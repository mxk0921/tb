package com.taobao.social.sdk.jsbridge;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.util.Pair;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.social.sdk.net.ISocialBusinessListener;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a9q;
import tb.aix;
import tb.kpw;
import tb.nsw;
import tb.s8q;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class WVSocialPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WVCallBackContext commentCallback;
    private PreBroadcastReceiver mPreBroadcastReceiver;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class PreBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(817889334);
        }

        public PreBroadcastReceiver() {
        }

        public static /* synthetic */ IntentFilter access$100(PreBroadcastReceiver preBroadcastReceiver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IntentFilter) ipChange.ipc$dispatch("2512068d", new Object[]{preBroadcastReceiver});
            }
            return preBroadcastReceiver.a();
        }

        public static /* synthetic */ Object ipc$super(PreBroadcastReceiver preBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/social/sdk/jsbridge/WVSocialPlugin$PreBroadcastReceiver");
        }

        public final IntentFilter a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IntentFilter) ipChange.ipc$dispatch("871e8aa6", new Object[]{this});
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("taobao.comment.publish.broadcast");
            return intentFilter;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && "taobao.comment.publish.broadcast".equalsIgnoreCase(intent.getAction())) {
                String stringExtra = intent.getStringExtra("data");
                if (WVSocialPlugin.access$000(WVSocialPlugin.this) == null) {
                    return;
                }
                if (!TextUtils.isEmpty(stringExtra)) {
                    WVSocialPlugin.access$000(WVSocialPlugin.this).success(stringExtra);
                    return;
                }
                nsw nswVar = new nsw();
                nswVar.j("HY_FAILED");
                String stringExtra2 = intent.getStringExtra("errorMsg");
                if (!TextUtils.isEmpty(stringExtra2)) {
                    nswVar.b("errorMsg", stringExtra2);
                    WVSocialPlugin.access$000(WVSocialPlugin.this).error(nswVar);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ISocialBusinessListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WVCallBackContext val$callBack;

        public a(WVCallBackContext wVCallBackContext) {
            this.val$callBack = wVCallBackContext;
        }

        @Override // com.taobao.social.sdk.net.ISocialBusinessListener
        public void onError(ISocialBusinessListener.ErrorType errorType, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b26a5e33", new Object[]{this, errorType, str, str2});
            } else {
                this.val$callBack.error(str2);
            }
        }

        @Override // com.taobao.social.sdk.net.ISocialBusinessListener
        public void onSuccess(MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eb9888c", new Object[]{this, mtopResponse, obj});
            } else {
                this.val$callBack.success(String.valueOf(mtopResponse.getDataJsonObject()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements ISocialBusinessListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WVCallBackContext val$callBack;

        public b(WVCallBackContext wVCallBackContext) {
            this.val$callBack = wVCallBackContext;
        }

        @Override // com.taobao.social.sdk.net.ISocialBusinessListener
        public void onError(ISocialBusinessListener.ErrorType errorType, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b26a5e33", new Object[]{this, errorType, str, str2});
            } else {
                this.val$callBack.error(str2);
            }
        }

        @Override // com.taobao.social.sdk.net.ISocialBusinessListener
        public void onSuccess(MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eb9888c", new Object[]{this, mtopResponse, obj});
            } else {
                this.val$callBack.success(String.valueOf(mtopResponse.getDataJsonObject()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements ISocialBusinessListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WVCallBackContext val$callBack;

        public c(WVCallBackContext wVCallBackContext) {
            this.val$callBack = wVCallBackContext;
        }

        @Override // com.taobao.social.sdk.net.ISocialBusinessListener
        public void onError(ISocialBusinessListener.ErrorType errorType, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b26a5e33", new Object[]{this, errorType, str, str2});
            } else {
                this.val$callBack.error(str2);
            }
        }

        @Override // com.taobao.social.sdk.net.ISocialBusinessListener
        public void onSuccess(MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eb9888c", new Object[]{this, mtopResponse, obj});
            } else {
                this.val$callBack.success(String.valueOf(mtopResponse.getDataJsonObject()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements ISocialBusinessListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WVCallBackContext val$callBack;

        public d(WVCallBackContext wVCallBackContext) {
            this.val$callBack = wVCallBackContext;
        }

        @Override // com.taobao.social.sdk.net.ISocialBusinessListener
        public void onError(ISocialBusinessListener.ErrorType errorType, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b26a5e33", new Object[]{this, errorType, str, str2});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", (Object) str2);
            this.val$callBack.error(jSONObject.toJSONString());
        }

        @Override // com.taobao.social.sdk.net.ISocialBusinessListener
        public void onSuccess(MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eb9888c", new Object[]{this, mtopResponse, obj});
            } else if (mtopResponse != null) {
                this.val$callBack.success(String.valueOf(mtopResponse.getDataJsonObject()));
            }
        }
    }

    static {
        t2o.a(817889329);
    }

    public static /* synthetic */ WVCallBackContext access$000(WVSocialPlugin wVSocialPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("4eb5da41", new Object[]{wVSocialPlugin});
        }
        return wVSocialPlugin.commentCallback;
    }

    private void cancelLike(String str, WVCallBackContext wVCallBackContext) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c15a9f3f", new Object[]{this, str, wVCallBackContext});
        } else if (!TextUtils.isEmpty(str) && (parseObject = JSON.parseObject(str)) != null) {
            try {
                s8q.getInstance().cancelLike(getRequestParams(parseObject), new b(wVCallBackContext));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void doLike(String str, WVCallBackContext wVCallBackContext) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0b0390", new Object[]{this, str, wVCallBackContext});
        } else if (!TextUtils.isEmpty(str) && (parseObject = JSON.parseObject(str)) != null) {
            try {
                s8q.getInstance().like(getRequestParams(parseObject), new a(wVCallBackContext));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void getCountAndStatus(String str, WVCallBackContext wVCallBackContext) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("803bdc9e", new Object[]{this, str, wVCallBackContext});
        } else if (!TextUtils.isEmpty(str) && (parseObject = JSON.parseObject(str)) != null) {
            try {
                s8q.getInstance().getCountAndStatus(getRequestParams(parseObject), new c(wVCallBackContext));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private Map<String, String> getRequestParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8758721f", new Object[]{this, jSONObject});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            hashMap.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
        }
        return hashMap;
    }

    public static /* synthetic */ Object ipc$super(WVSocialPlugin wVSocialPlugin, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        } else if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/social/sdk/jsbridge/WVSocialPlugin");
        }
    }

    private void report(String str, WVCallBackContext wVCallBackContext) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69eef82", new Object[]{this, str, wVCallBackContext});
        } else if (!TextUtils.isEmpty(str) && (parseObject = JSON.parseObject(str)) != null) {
            try {
                s8q.getInstance().report(getRequestParams(parseObject), new d(wVCallBackContext));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            try {
                a9q.b(context);
                ((Activity) context).getWindow().setSoftInputMode(48);
            } catch (Exception e) {
                e.printStackTrace();
                TLog.loge("commentSDK", "windvane initialize fail:" + e);
            }
        }
        super.initialize(context, iWVWebView);
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        try {
            if (this.mPreBroadcastReceiver != null) {
                LocalBroadcastManager.getInstance(Globals.getApplication()).unregisterReceiver(this.mPreBroadcastReceiver);
                this.mPreBroadcastReceiver = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // tb.kpw
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        Context context = this.mContext;
        if (context instanceof Activity) {
            s8q.updateCurrentActivity((Activity) context);
        }
    }

    private void openPopComment(String str, WVCallBackContext wVCallBackContext) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1747da06", new Object[]{this, str, wVCallBackContext});
            return;
        }
        Uri uri = null;
        if (!TextUtils.isEmpty(str)) {
            JSONObject parseObject2 = JSON.parseObject(str);
            long currentTimeMillis = System.currentTimeMillis();
            if (parseObject2 != null) {
                try {
                    String string = parseObject2.getString("param");
                    Uri.Builder buildUpon = Uri.parse("http://h5.m.taobao.com/comment/poplist.htm?").buildUpon();
                    if (!TextUtils.isEmpty(string) && (parseObject = JSON.parseObject(string)) != null) {
                        new Bundle().putLong("windvaneStartTime", currentTimeMillis);
                        for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
                            buildUpon.appendQueryParameter(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
                        }
                        uri = buildUpon.build();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        Pair<String, Uri> sureSessionId = aix.sureSessionId(uri);
        String str2 = (String) sureSessionId.first;
        Uri uri2 = (Uri) sureSessionId.second;
        aix.registerListener(str2, wVCallBackContext);
        if (uri2 != null) {
            this.commentCallback = wVCallBackContext;
            Nav.from(this.mContext).toUri(uri2);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMsg", (Object) "参数无效");
        aix.commentCallback(str2, false, false, false, jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void openUgc(java.lang.String r5, android.taobao.windvane.jsbridge.WVCallBackContext r6) {
        /*
            r4 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.social.sdk.jsbridge.WVSocialPlugin.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "12c927f5"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            r0 = 1
            r3[r0] = r5
            r5 = 2
            r3[r5] = r6
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0018:
            com.taobao.social.sdk.jsbridge.WVSocialPlugin$PreBroadcastReceiver r1 = new com.taobao.social.sdk.jsbridge.WVSocialPlugin$PreBroadcastReceiver
            r1.<init>()
            r4.mPreBroadcastReceiver = r1
            android.app.Application r1 = com.taobao.tao.Globals.getApplication()     // Catch: all -> 0x0031
            androidx.localbroadcastmanager.content.LocalBroadcastManager r1 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r1)     // Catch: all -> 0x0031
            com.taobao.social.sdk.jsbridge.WVSocialPlugin$PreBroadcastReceiver r2 = r4.mPreBroadcastReceiver     // Catch: all -> 0x0031
            android.content.IntentFilter r3 = com.taobao.social.sdk.jsbridge.WVSocialPlugin.PreBroadcastReceiver.access$100(r2)     // Catch: all -> 0x0031
            r1.registerReceiver(r2, r3)     // Catch: all -> 0x0031
            goto L_0x003d
        L_0x0031:
            r1 = move-exception
            r1.printStackTrace()
            java.lang.String r1 = "commentSDK"
            java.lang.String r2 = "wvplugin  regit Broadcast Receivers error"
            com.taobao.tao.log.TLog.loge(r1, r2)
        L_0x003d:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x0055
            com.alibaba.fastjson.JSONObject r5 = com.alibaba.fastjson.JSON.parseObject(r5)
            if (r5 == 0) goto L_0x0055
            java.lang.String r1 = "url"
            java.lang.String r5 = r5.getString(r1)     // Catch: Exception -> 0x0051
            goto L_0x0056
        L_0x0051:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0055:
            r5 = 0
        L_0x0056:
            android.util.Pair r5 = tb.aix.sureSessionId(r5)
            java.lang.Object r1 = r5.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r5 = r5.second
            android.net.Uri r5 = (android.net.Uri) r5
            tb.aix.registerListener(r1, r6)
            if (r5 == 0) goto L_0x00a2
            boolean r0 = tb.k9l.c()
            if (r0 == 0) goto L_0x0085
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            r6.setData(r5)
            tb.s4v.d()
            java.lang.String r5 = "4"
            tb.znj.h(r6, r5)
            android.app.Activity r5 = tb.c21.i()
            tb.znj.c(r6, r5)
            goto L_0x00bb
        L_0x0085:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "ACTION"
            java.lang.String r2 = "taobao.comment.publish.broadcast"
            r0.putString(r1, r2)
            r4.commentCallback = r6
            android.content.Context r6 = r4.mContext
            com.taobao.android.nav.Nav r6 = com.taobao.android.nav.Nav.from(r6)
            com.taobao.android.nav.Nav r6 = r6.withExtras(r0)
            r6.toUri(r5)
            goto L_0x00bb
        L_0x00a2:
            com.alibaba.fastjson.JSONObject r5 = new com.alibaba.fastjson.JSONObject
            r5.<init>()
            java.lang.String r6 = "isCancel"
            java.lang.String r2 = "false"
            r5.put(r6, r2)
            java.lang.String r6 = "errorMsg"
            java.lang.String r2 = "参数无效"
            r5.put(r6, r2)
            tb.aix.commentCallback(r1, r0, r0, r0, r5)
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.social.sdk.jsbridge.WVSocialPlugin.openUgc(java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):void");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("like".equals(str)) {
            doLike(str2, wVCallBackContext);
            return true;
        } else if ("cancelLike".equals(str)) {
            cancelLike(str2, wVCallBackContext);
            return true;
        } else if ("countAndStatus".equals(str)) {
            getCountAndStatus(str2, wVCallBackContext);
            return true;
        } else if ("report".equals(str)) {
            report(str2, wVCallBackContext);
            return true;
        } else if ("openMiniUgc".equals(str)) {
            openUgc(str2, wVCallBackContext);
            return true;
        } else if (!"openPopComment".equals(str)) {
            return false;
        } else {
            openPopComment(str2, wVCallBackContext);
            return true;
        }
    }
}
