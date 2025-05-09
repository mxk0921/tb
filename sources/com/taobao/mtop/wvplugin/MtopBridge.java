package com.taobao.mtop.wvplugin;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.login4android.session.constants.SessionConstants;
import com.taobao.message.message_open_api.ICallService;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.js.MtopJSBridge;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopAccountSiteUtils;
import mtopsdk.mtop.stat.IUploadStats;
import mtopsdk.mtop.upload.domain.UploadConstants;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.jk;
import tb.nz9;
import tb.ov2;
import tb.rb;
import tb.x6j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicBoolean e = new AtomicBoolean(false);
    public static final ScheduledExecutorService f = Executors.newScheduledThreadPool(1, new c());

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<MtopWVPlugin> f11152a;
    public String b = "";
    public String c = "";
    public final Handler d = new a(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class MtopBridgeListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Map<String, Object> jsParamMap;
        private WVCallBackContext wvCallBackContext;

        public MtopBridgeListener(WVCallBackContext wVCallBackContext, Map<String, Object> map) {
            this.wvCallBackContext = wVCallBackContext;
            this.jsParamMap = map;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            MtopBridge mtopBridge = MtopBridge.this;
            MtopBridge.e(mtopBridge, MtopBridge.f(mtopBridge, this.wvCallBackContext, mtopResponse, this.jsParamMap));
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            MtopBridge mtopBridge = MtopBridge.this;
            MtopBridge.e(mtopBridge, MtopBridge.f(mtopBridge, this.wvCallBackContext, mtopResponse, this.jsParamMap));
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            MtopBridge mtopBridge = MtopBridge.this;
            MtopBridge.e(mtopBridge, MtopBridge.f(mtopBridge, this.wvCallBackContext, mtopResponse, this.jsParamMap));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mtop/wvplugin/MtopBridge$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what == 500 && (message.obj instanceof x6j)) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                    TBSdkLog.d("mtopsdk.MtopBridge", "call result, retString: " + ((x6j) message.obj).toString());
                }
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    TBSdkLog.e("mtopsdk.MtopBridge", "call result, retString requestKey: " + MtopBridge.a(MtopBridge.this) + ", falcoid: " + MtopBridge.b(MtopBridge.this));
                }
                MtopWVPlugin mtopWVPlugin = (MtopWVPlugin) MtopBridge.c(MtopBridge.this).get();
                if (mtopWVPlugin != null) {
                    try {
                        mtopWVPlugin.wvCallback((x6j) message.obj);
                    } catch (Exception e) {
                        TBSdkLog.e("mtopsdk.MtopBridge", "execute  plugin.wvCallback error.", e);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nz9 f11154a;
        public final /* synthetic */ String b;
        public final /* synthetic */ WVCallBackContext c;

        public b(nz9 nz9Var, String str, WVCallBackContext wVCallBackContext) {
            this.f11154a = nz9Var;
            this.b = str;
            this.c = wVCallBackContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map map;
            Exception e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String str = null;
            try {
                map = MtopBridge.d(MtopBridge.this, this.f11154a);
                try {
                    if (map == null) {
                        TBSdkLog.e("mtopsdk.MtopBridge", "MtopBridge parseJSParams failed. params:" + this.b);
                        MtopBridge.this.g(null, null, "MtopBridge parseJSParams failed.", "HY_PARAM_ERR", null);
                        x6j x6jVar = new x6j(this.c);
                        x6jVar.b(rb.RESULT_KEY, new JSONArray().put("HY_PARAM_ERR"));
                        x6jVar.a("code", "MtopBridge parseJSParams failed.");
                        MtopBridge.e(MtopBridge.this, x6jVar);
                        return;
                    }
                    MtopJSBridge.h(map, new MtopBridgeListener(this.c, map));
                } catch (Exception e2) {
                    e = e2;
                    TBSdkLog.e("mtopsdk.MtopBridge", "MtopJSBridge sendMtopRequest failed.params:" + this.b, e);
                    String str2 = map != null ? (String) map.get("api") : null;
                    if (map != null) {
                        str = (String) map.get("v");
                    }
                    MtopBridge.this.g(str2, str, "MtopJSBridge sendMtopRequest failed.", "HY_FAILED", null);
                    x6j x6jVar2 = new x6j(this.c);
                    x6jVar2.b(rb.RESULT_KEY, new JSONArray().put("HY_FAILED"));
                    x6jVar2.a("code", "MtopJSBridge sendMtopRequest failed.");
                    MtopBridge.e(MtopBridge.this, x6jVar2);
                }
            } catch (Exception e3) {
                e = e3;
                map = null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AtomicInteger d = new AtomicInteger(1);

        /* renamed from: a  reason: collision with root package name */
        public final ThreadGroup f11155a;
        public final AtomicInteger b = new AtomicInteger(1);
        public final String c;

        public c() {
            ThreadGroup threadGroup;
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f11155a = threadGroup;
            this.c = "mtopPlugin pool-" + d.getAndIncrement() + "-thread-";
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            ThreadGroup threadGroup = this.f11155a;
            Thread thread = new Thread(threadGroup, runnable, this.c + this.b.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    public MtopBridge(MtopWVPlugin mtopWVPlugin) {
        this.f11152a = null;
        this.f11152a = new WeakReference<>(mtopWVPlugin);
    }

    public static /* synthetic */ String a(MtopBridge mtopBridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("362e410", new Object[]{mtopBridge});
        }
        return mtopBridge.b;
    }

    public static /* synthetic */ String b(MtopBridge mtopBridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bdd88491", new Object[]{mtopBridge});
        }
        return mtopBridge.c;
    }

    public static /* synthetic */ WeakReference c(MtopBridge mtopBridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("48e0e11c", new Object[]{mtopBridge});
        }
        return mtopBridge.f11152a;
    }

    public static /* synthetic */ Map d(MtopBridge mtopBridge, nz9 nz9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4252f488", new Object[]{mtopBridge, nz9Var});
        }
        return mtopBridge.k(nz9Var);
    }

    public static /* synthetic */ void e(MtopBridge mtopBridge, x6j x6jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83b32e07", new Object[]{mtopBridge, x6jVar});
        } else {
            mtopBridge.i(x6jVar);
        }
    }

    public static /* synthetic */ x6j f(MtopBridge mtopBridge, WVCallBackContext wVCallBackContext, MtopResponse mtopResponse, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x6j) ipChange.ipc$dispatch("a1c161fb", new Object[]{mtopBridge, wVCallBackContext, mtopResponse, map});
        }
        return mtopBridge.l(wVCallBackContext, mtopResponse, map);
    }

    public void g(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86512455", new Object[]{this, str, str2, str3, str4, str5});
        } else {
            h(str, str2, str3, str4, str5, "0");
        }
    }

    public final void i(x6j x6jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eecedd4", new Object[]{this, x6jVar});
        } else if (x6jVar != null) {
            this.d.obtainMessage(500, x6jVar).sendToTarget();
        }
    }

    public boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d64b67e4", new Object[]{this, str})).booleanValue();
        }
        if (MtopAccountSiteUtils.getInstanceId(str) != null) {
            return true;
        }
        return false;
    }

    public void m(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93822c35", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.MtopBridge", "MtopBridge JSParams: " + str);
        }
        nz9 nz9Var = new nz9(str);
        MtopWVPlugin mtopWVPlugin = this.f11152a.get();
        if (mtopWVPlugin != null) {
            nz9Var.b = mtopWVPlugin.getUserAgent();
            nz9Var.c = mtopWVPlugin.getCurrentUrl();
        }
        f.submit(new b(nz9Var, str, wVCallBackContext));
    }

    public final Map<String, Object> k(nz9 nz9Var) {
        HashMap hashMap;
        String str;
        Throwable th;
        boolean z;
        String str2;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7e1004c", new Object[]{this, nz9Var});
        }
        if (nz9Var == null || StringUtils.isBlank(nz9Var.f25045a)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(nz9Var.f25045a);
            hashMap = new HashMap();
            try {
                hashMap.put("api", jSONObject.getString("api"));
                hashMap.put("v", jSONObject.optString("v", "*"));
                hashMap.put("data", jSONObject.optJSONObject("param"));
                hashMap.put(ov2.ALIPAY_ACCOUNT_SITE, jSONObject.optString(ov2.ALIPAY_ACCOUNT_SITE, ""));
                if (!jSONObject.isNull(ICallService.KEY_NEED_LOGIN)) {
                    z = jSONObject.optBoolean(ICallService.KEY_NEED_LOGIN);
                } else {
                    z = jSONObject.optInt(SessionConstants.ECODE, 0) != 0;
                }
                String optString = jSONObject.optString("sessionOption");
                hashMap.put(ICallService.KEY_NEED_LOGIN, Boolean.valueOf(z));
                hashMap.put("sessionOption", optString);
                String str3 = "GET";
                if (!jSONObject.isNull("method")) {
                    str3 = jSONObject.optString("method");
                } else if (jSONObject.optInt("post", 0) != 0) {
                    str3 = "POST";
                }
                hashMap.put("method", str3);
                if (!jSONObject.isNull("dataType")) {
                    str2 = jSONObject.optString("dataType");
                } else {
                    str2 = jSONObject.optString("type");
                }
                hashMap.put("dataType", str2);
                if (!jSONObject.isNull("secType")) {
                    i = jSONObject.optInt("secType");
                } else {
                    i = jSONObject.optInt("isSec", 0);
                }
                hashMap.put("secType", Integer.valueOf(i));
                int i3 = 20000;
                if (!jSONObject.isNull("timeout")) {
                    i2 = jSONObject.optInt("timeout", 20000);
                } else {
                    i2 = jSONObject.optInt("timer", 20000);
                }
                if (i2 >= 0) {
                    i3 = 60000;
                    if (i2 <= 60000) {
                        i3 = i2;
                    }
                }
                hashMap.put("timeout", Integer.valueOf(i3));
                hashMap.put("ext_headers", jSONObject.optJSONObject("ext_headers"));
                hashMap.put("ignorePrefetch", jSONObject.optJSONObject("ignorePrefetch"));
                hashMap.put("user-agent", nz9Var.b);
                hashMap.put("ttid", jSONObject.optString("ttid"));
                String optString2 = jSONObject.optString("pageUrl");
                if (!TextUtils.isEmpty(optString2)) {
                    hashMap.put("pageUrl", optString2);
                } else {
                    hashMap.put("pageUrl", nz9Var.c);
                }
                hashMap.put("ext_querys", jSONObject.optJSONObject("ext_querys"));
                hashMap.put("mpHost", jSONObject.optString("mpHost"));
                hashMap.put(Constants.KEY_USER_ID, jSONObject.optString(Constants.KEY_USER_ID));
                hashMap.put(HttpHeaderConstant.X_UA, nz9Var.b);
                hashMap.put("retryForbidden", Boolean.valueOf(jSONObject.optBoolean("retryForbidden")));
                hashMap.put("bizId", jSONObject.optString("bizId"));
                hashMap.put(MtopModule.KEY_MTOP_BIZ_TOPIC, jSONObject.optString(MtopModule.KEY_MTOP_BIZ_TOPIC));
                String str4 = nz9Var.c;
                if (!TextUtils.isEmpty(str4)) {
                    try {
                        int indexOf = str4.indexOf("?");
                        if (indexOf != -1) {
                            str4 = str4.substring(0, indexOf);
                        } else {
                            int indexOf2 = str4.indexOf("#");
                            if (indexOf2 != -1) {
                                str4 = str4.substring(0, indexOf2);
                            }
                        }
                    }
                }
                hashMap.put("referer", str4);
                if (!jSONObject.isNull("allowSwitchToPOST")) {
                    hashMap.put("allowSwitchToPOST", jSONObject.opt("allowSwitchToPOST"));
                }
            } catch (Throwable th2) {
                th = th2;
                str = "mtopsdk.MtopBridge";
                TBSdkLog.e(str, "parseJSParams error.params =" + nz9Var.f25045a, th);
                return hashMap;
            }
        } catch (Throwable th3) {
            th = th3;
            str = "mtopsdk.MtopBridge";
            hashMap = null;
        }
        return hashMap;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:33:0x012c
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:90)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public final tb.x6j l(android.taobao.windvane.jsbridge.WVCallBackContext r24, mtopsdk.mtop.domain.MtopResponse r25, java.util.Map<java.lang.String, java.lang.Object> r26) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mtop.wvplugin.MtopBridge.l(android.taobao.windvane.jsbridge.WVCallBackContext, mtopsdk.mtop.domain.MtopResponse, java.util.Map):tb.x6j");
    }

    public void h(String str, String str2, String str3, String str4, String str5, String str6) {
        Object obj;
        IUploadStats iUploadStats;
        Object obj2;
        Object obj3;
        Object obj4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b627c2df", new Object[]{this, str, str2, str3, str4, str5, str6});
            return;
        }
        try {
            IUploadStats iUploadStats2 = Mtop.instance(Mtop.Id.INNER, (Context) null).getMtopConfig().uploadStats;
            if (iUploadStats2 != null) {
                if (e.compareAndSet(false, true)) {
                    HashSet hashSet = new HashSet();
                    hashSet.add("api");
                    hashSet.add("v");
                    hashSet.add(rb.RESULT_KEY);
                    hashSet.add("code");
                    hashSet.add(jk.KEY_RET_CODE);
                    obj2 = "api";
                    obj = "v";
                    obj4 = rb.RESULT_KEY;
                    iUploadStats = iUploadStats2;
                    obj3 = "code";
                    iUploadStats2.onRegister(UploadConstants.UPLOAD_MODULE, "jsStats", hashSet, null, false);
                } else {
                    iUploadStats = iUploadStats2;
                    obj2 = "api";
                    obj = "v";
                    obj4 = rb.RESULT_KEY;
                    obj3 = "code";
                }
                HashMap hashMap = new HashMap();
                hashMap.put(obj2, str);
                hashMap.put(obj, str2);
                hashMap.put(obj4, str4);
                hashMap.put(obj3, str3);
                hashMap.put(jk.KEY_RET_CODE, str5);
                hashMap.put("timeout", str6);
                iUploadStats.onCommit(UploadConstants.UPLOAD_MODULE, "jsStats", hashMap, null);
            }
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.MtopBridge", "commitMtopJSStat error.", th);
        }
    }
}
