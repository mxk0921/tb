package com.alipay.android.app.template;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.exthub.api.ExtHubApiResponse;
import com.alibaba.exthub.api.ExtHubCallContext;
import com.alibaba.exthub.api.ExtHubCaller;
import com.alibaba.fastjson.JSON;
import com.alipay.android.app.template.JSPlugin;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.platform.Platform;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import tb.l2w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class JSPluginManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INVOKE_NS_EXTHUB = "exthub";
    public static final String INVOKE_NS_FB = "fb";
    public static final String TAG = "JSPluginManager";

    /* renamed from: a  reason: collision with root package name */
    public static JSPluginManager f3519a;
    public static Handler b = new Handler(Looper.getMainLooper());
    public final HashMap<Integer, HashMap<String, JSPlugin>> d = new HashMap<>();
    public List<JsPluginFactory> c = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Evt {
        public String action;
        public String args;
        public Context ctx;
        public FBDocument doc;
        public JSPlugin.FromCall fromCall;
        public long funKey;

        public Evt(String str, String str2, Context context, JSPlugin.FromCall fromCall, FBDocument fBDocument, long j) {
            this.action = str;
            this.args = str2;
            this.ctx = context;
            this.fromCall = fromCall;
            this.doc = fBDocument;
            this.funKey = j;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface ExtHubCallback {
        void a(JSONObject jSONObject);
    }

    public static JSPluginManager getInstanse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSPluginManager) ipChange.ipc$dispatch("214e4bd2", new Object[0]);
        }
        if (f3519a == null) {
            f3519a = new JSPluginManager();
        }
        return f3519a;
    }

    public void addJsPluginFactory(JsPluginFactory jsPluginFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c00fac0f", new Object[]{this, jsPluginFactory});
        } else if (jsPluginFactory != null && !this.c.contains(jsPluginFactory)) {
            this.c.add(jsPluginFactory);
        }
    }

    public void cleanUpContextHandlePlugin(Context context) {
        HashMap<String, JSPlugin> remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4016817b", new Object[]{this, context});
        } else if (context != null) {
            int hashCode = context.hashCode();
            if (this.d.containsKey(Integer.valueOf(hashCode)) && (remove = this.d.remove(Integer.valueOf(hashCode))) != null) {
                remove.clear();
            }
        }
    }

    public void cleanUpEngineHandlePlugin(BirdNestEngine birdNestEngine) {
        HashMap<String, JSPlugin> remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f83c3c8", new Object[]{this, birdNestEngine});
        } else if (birdNestEngine != null) {
            int hashCode = birdNestEngine.hashCode();
            if (this.d.containsKey(Integer.valueOf(hashCode)) && (remove = this.d.remove(Integer.valueOf(hashCode))) != null) {
                remove.clear();
            }
        }
    }

    public boolean containsInvoke(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4866c58", new Object[]{this, context, str})).booleanValue();
        }
        return !TextUtils.isEmpty(str);
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.d.clear();
        }
    }

    public Object executePlugin(Context context, JSPlugin.FromCall fromCall, String str, String str2) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d967d236", new Object[]{this, context, fromCall, str, str2});
        }
        JSPlugin registeredPlugin = getRegisteredPlugin(context, null, fromCall, str, true);
        if (registeredPlugin == null) {
            new Evt(str, str2, context, fromCall, null, 0L);
            IpChange ipChange2 = Platform.$ipChange;
            return Boolean.TRUE;
        }
        try {
            return registeredPlugin.execute(fromCall, str, str2);
        } catch (Throwable th) {
            FBLogger.e(getClass().getName(), th);
            throw new RuntimeException("An Error occur while execute plugin [" + str + "]!");
        }
    }

    public JSPlugin getRegisteredPlugin(Context context, JSPlugin.FromCall fromCall, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSPlugin) ipChange.ipc$dispatch("87d7509a", new Object[]{this, context, fromCall, str, new Boolean(z)}) : getRegisteredPlugin(context, null, fromCall, str, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void invokeOnExtHub(android.content.Context r9, final java.lang.String r10, java.lang.String r11, final com.alipay.android.app.template.JSPluginManager.ExtHubCallback r12, com.alipay.android.app.template.JSPlugin.ISession r13) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.app.template.JSPluginManager.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0021
            java.lang.String r1 = "958aee5f"
            r2 = 6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r8
            r3 = 1
            r2[r3] = r9
            r9 = 2
            r2[r9] = r10
            r9 = 3
            r2[r9] = r11
            r9 = 4
            r2[r9] = r12
            r9 = 5
            r2[r9] = r13
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0021:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "dispatch jsapi, act = "
            r13.<init>(r0)
            r13.append(r10)
            java.lang.String r0 = " in RVE way"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "JSPluginManager"
            com.alipay.birdnest.util.FBLogger.d(r0, r13)
            com.alipay.android.app.template.JSPluginManager$1 r7 = new com.alipay.android.app.template.JSPluginManager$1
            r7.<init>(r8)
            boolean r13 = r9 instanceof android.app.Activity
            r0 = 0
            if (r13 == 0) goto L_0x0047
            android.app.Activity r9 = (android.app.Activity) r9
        L_0x0045:
            r4 = r9
            goto L_0x005c
        L_0x0047:
            com.android.alibaba.ip.runtime.IpChange r9 = com.alipay.birdnest.platform.Platform.$ipChange
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r0)
            java.lang.Object r13 = r9.get()
            if (r13 == 0) goto L_0x005b
            java.lang.Object r9 = r9.get()
            android.app.Activity r9 = (android.app.Activity) r9
            goto L_0x0045
        L_0x005b:
            r4 = r0
        L_0x005c:
            if (r4 == 0) goto L_0x0071
            com.alibaba.exthub.api.ExtHubCallContext r9 = new com.alibaba.exthub.api.ExtHubCallContext
            com.alibaba.fastjson.JSONObject r6 = com.alibaba.fastjson.JSON.parseObject(r11)
            java.lang.String r2 = "200011231"
            java.lang.String r3 = "birdnest"
            r1 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.alibaba.exthub.api.ExtHubCaller.call(r9)
            goto L_0x0074
        L_0x0071:
            r12.a(r0)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.app.template.JSPluginManager.invokeOnExtHub(android.content.Context, java.lang.String, java.lang.String, com.alipay.android.app.template.JSPluginManager$ExtHubCallback, com.alipay.android.app.template.JSPlugin$ISession):void");
    }

    public Object invokeOnJSPlugin(Context context, String str, String str2, FBDocument fBDocument, long j, JSPlugin jSPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bf6b38d4", new Object[]{this, context, str, str2, fBDocument, new Long(j), jSPlugin});
        }
        try {
            return jSPlugin.execute(JSPlugin.FromCall.INVOKE, str, str2, fBDocument, j, context);
        } catch (Throwable th) {
            FBLogger.e(TAG, th);
            throw new RuntimeException("An Error occur while execute plugin [" + str + "]!");
        }
    }

    public boolean isExtHubValid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("955edd3", new Object[]{this, str})).booleanValue();
        }
        return ExtHubCaller.isApiAvaliable(str);
    }

    public String performGetProp(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bd5ec3", new Object[]{this, context, str, str2});
        }
        try {
            Object executePlugin = executePlugin(context, JSPlugin.FromCall.GET_PROP, str, str2);
            if (executePlugin == null) {
                return null;
            }
            return String.valueOf(executePlugin);
        } catch (Throwable th) {
            FBLogger.e(getClass().getName(), th);
            return null;
        }
    }

    public Object performInvoke(Context context, String str, String str2, FBDocument fBDocument, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7ce22cff", new Object[]{this, context, str, str2, fBDocument, new Long(j), new Boolean(z)});
        }
        try {
            Object executePlugin = executePlugin(context, str, str2, fBDocument, j, z);
            if (executePlugin != null) {
                return executePlugin;
            }
            return new JSONObject();
        } catch (Throwable th) {
            FBLogger.e(getClass().getName(), th);
            return Boolean.FALSE;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: AttachTryCatchVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Null type added to not empty exception handler: RuntimeException -> 0x0036
        	at jadx.core.dex.trycatch.ExceptionHandler.addCatchType(ExceptionHandler.java:54)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.createHandler(AttachTryCatchVisitor.java:136)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.convertToHandlers(AttachTryCatchVisitor.java:123)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.initTryCatches(AttachTryCatchVisitor.java:59)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.visit(AttachTryCatchVisitor.java:47)
        */
    public int performSetProp(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.android.app.template.JSPluginManager.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0022
            java.lang.String r3 = "a95259e4"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r6 = 2
            r4[r6] = r7
            r6 = 3
            r4[r6] = r8
            r2.ipc$dispatch(r3, r4)
            r6 = move-result
            java.lang.Number r6 = (java.lang.Number) r6
            r6.intValue()
            r6 = move-result
            return r6
            r2 = -1
            com.alipay.android.app.template.JSPlugin$FromCall r3 = com.alipay.android.app.template.JSPlugin.FromCall.SET_PROP
            r5.executePlugin(r6, r3, r7, r8)
            r6 = move-result
            java.lang.Integer r6 = (java.lang.Integer) r6
            r6.intValue()
            r6 = move-result
            if (r6 <= 0) goto L_0x0032
            return r0
            if (r6 >= 0) goto L_0x0035
            return r2
            return r6
        L_0x0036:
            return r2
        L_0x0037:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.app.template.JSPluginManager.performSetProp(android.content.Context, java.lang.String, java.lang.String):int");
    }

    public void registerJSPlugin(JSPlugin jSPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("946fcae9", new Object[]{this, jSPlugin});
        } else if (jSPlugin == null) {
            FBLogger.e(getClass().getName(), "the plugin should not null!");
        } else if (TextUtils.isEmpty(jSPlugin.pluginName())) {
            FBLogger.e(getClass().getName(), "the plugin name should not be empty!");
        } else {
            String pluginName = jSPlugin.pluginName();
            registerJSPlugin(JSPlugin.FromCall.GET_PROP, pluginName, jSPlugin);
            registerJSPlugin(JSPlugin.FromCall.SET_PROP, pluginName, jSPlugin);
            registerJSPlugin(JSPlugin.FromCall.INVOKE, pluginName, jSPlugin);
        }
    }

    public void registerJSPluginForContext(Context context, JSPlugin.FromCall fromCall, String str, JSPlugin jSPlugin) {
        HashMap<String, JSPlugin> hashMap;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a01cd92", new Object[]{this, context, fromCall, str, jSPlugin});
        } else if (!TextUtils.isEmpty(str) && jSPlugin != null) {
            if (context != null) {
                i = context.hashCode();
            }
            synchronized (this.d) {
                try {
                    if (!this.d.containsKey(Integer.valueOf(i))) {
                        hashMap = new HashMap<>();
                        this.d.put(Integer.valueOf(i), hashMap);
                    } else {
                        hashMap = this.d.get(Integer.valueOf(i));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            String makeName = makeName(fromCall, str);
            if (!hashMap.containsKey(makeName)) {
                hashMap.put(makeName, jSPlugin);
            }
        }
    }

    public void registerJSPluginForEngine(BirdNestEngine birdNestEngine, JSPlugin.FromCall fromCall, String str, JSPlugin jSPlugin) {
        HashMap<String, JSPlugin> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243a2c3b", new Object[]{this, birdNestEngine, fromCall, str, jSPlugin});
        } else if (!TextUtils.isEmpty(str) && jSPlugin != null) {
            int hashCode = birdNestEngine.hashCode();
            synchronized (this.d) {
                try {
                    if (!this.d.containsKey(Integer.valueOf(hashCode))) {
                        hashMap = new HashMap<>();
                        this.d.put(Integer.valueOf(hashCode), hashMap);
                    } else {
                        hashMap = this.d.get(Integer.valueOf(hashCode));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            String makeName = makeName(fromCall, str);
            if (!hashMap.containsKey(makeName)) {
                hashMap.put(makeName, jSPlugin);
            }
        }
    }

    public void removeJsPluginFactory(JsPluginFactory jsPluginFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e55bea72", new Object[]{this, jsPluginFactory});
        } else if (this.c.contains(jsPluginFactory)) {
            this.c.remove(jsPluginFactory);
        }
    }

    public void unregisterJSPlugin(Context context, String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d9aab93", new Object[]{this, context, str});
            return;
        }
        if (context != null) {
            i = context.hashCode();
        }
        unregisterJSPlugin(i, str);
    }

    public JSPlugin getRegisteredPlugin(Context context, BirdNestEngine birdNestEngine, JSPlugin.FromCall fromCall, String str, boolean z) {
        JSPlugin createJsPlugin;
        HashMap<String, JSPlugin> hashMap;
        HashMap<String, JSPlugin> hashMap2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSPlugin) ipChange.ipc$dispatch("d54c9b9a", new Object[]{this, context, birdNestEngine, fromCall, str, new Boolean(z)});
        }
        int hashCode = context == null ? 0 : context.hashCode();
        String makeName = makeName(fromCall, str);
        if (this.d.containsKey(Integer.valueOf(hashCode)) && (hashMap2 = this.d.get(Integer.valueOf(hashCode))) != null && hashMap2.containsKey(makeName)) {
            return hashMap2.get(makeName);
        }
        int hashCode2 = birdNestEngine == null ? 0 : birdNestEngine.hashCode();
        if (this.d.containsKey(Integer.valueOf(hashCode2)) && (hashMap = this.d.get(Integer.valueOf(hashCode2))) != null && hashMap.containsKey(makeName)) {
            return hashMap.get(makeName);
        }
        HashMap<String, JSPlugin> hashMap3 = this.d.get(0);
        if (hashMap3 != null && hashMap3.containsKey(makeName)) {
            return hashMap3.get(makeName);
        }
        if (!z) {
            return null;
        }
        for (JsPluginFactory jsPluginFactory : this.c) {
            if (!(jsPluginFactory == null || (createJsPlugin = jsPluginFactory.createJsPlugin(context, fromCall, str)) == null)) {
                registerJSPlugin(fromCall, str, createJsPlugin);
                return createJsPlugin;
            }
        }
        return null;
    }

    public static String makeName(JSPlugin.FromCall fromCall, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a3b6f5", new Object[]{fromCall, str});
        }
        int ordinal = fromCall.ordinal();
        if (ordinal == 0) {
            return "getProp_" + str;
        } else if (ordinal == 1) {
            return "setProp_" + str;
        } else if (ordinal != 2) {
            return str;
        } else {
            return "invoke_" + str;
        }
    }

    public void unregisterJSPlugin(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3da60d0e", new Object[]{this, new Integer(i), str});
        } else if (TextUtils.isEmpty(str)) {
            FBLogger.e(getClass().getName(), "the plugin name should not be empty!");
        } else if (this.d.containsKey(Integer.valueOf(i))) {
            HashMap<String, JSPlugin> hashMap = this.d.get(Integer.valueOf(i));
            if (hashMap.containsKey(str)) {
                hashMap.remove(str);
            }
            if (hashMap.isEmpty()) {
                this.d.remove(Integer.valueOf(i));
            }
        }
    }

    public void registerJSPlugin(JSPlugin.FromCall fromCall, String str, JSPlugin jSPlugin) {
        HashMap<String, JSPlugin> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c78c188", new Object[]{this, fromCall, str, jSPlugin});
        } else if (!TextUtils.isEmpty(str) && jSPlugin != null) {
            int contextHashCode = jSPlugin.getContextHashCode();
            synchronized (this.d) {
                try {
                    if (!this.d.containsKey(Integer.valueOf(contextHashCode))) {
                        hashMap = new HashMap<>();
                        this.d.put(Integer.valueOf(contextHashCode), hashMap);
                    } else {
                        hashMap = this.d.get(Integer.valueOf(contextHashCode));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            String makeName = makeName(fromCall, str);
            if (!hashMap.containsKey(makeName)) {
                hashMap.put(makeName, jSPlugin);
            }
        }
    }

    public Object executePlugin(Context context, String str, String str2, FBDocument fBDocument, long j, boolean z) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("11e5d64e", new Object[]{this, context, str, str2, fBDocument, new Long(j), new Boolean(z)});
        }
        BirdNestEngine engine = fBDocument != null ? fBDocument.getEngine() : null;
        if (z) {
            String[] d = l2w.d(str);
            String str3 = d[0];
            if (str3 == null) {
                return Boolean.FALSE;
            }
            str3.hashCode();
            if (str3.equals(INVOKE_NS_EXTHUB)) {
                return invokeOnExtHub(context, d[1], str2, fBDocument, j);
            }
            if (!str3.equals(INVOKE_NS_FB)) {
                JSPlugin registeredPlugin = getRegisteredPlugin(context, engine, JSPlugin.FromCall.INVOKE, str, true);
                if (registeredPlugin != null) {
                    return invokeOnJSPlugin(context, str, str2, fBDocument, j, registeredPlugin);
                }
                return FBDocument.NO_RESULT;
            }
            JSPlugin registeredPlugin2 = getRegisteredPlugin(context, engine, JSPlugin.FromCall.INVOKE, d[1], true);
            if (registeredPlugin2 != null) {
                return invokeOnJSPlugin(context, d[1], str2, fBDocument, j, registeredPlugin2);
            }
            return invokeOnExtHub(context, d[1], str2, fBDocument, j);
        }
        JSPlugin registeredPlugin3 = getRegisteredPlugin(context, engine, JSPlugin.FromCall.INVOKE, str, true);
        if (registeredPlugin3 != null) {
            return invokeOnJSPlugin(context, str, str2, fBDocument, j, registeredPlugin3);
        }
        return invokeOnExtHub(context, str, str2, fBDocument, j);
    }

    public Object invokeOnExtHub(Context context, final String str, String str2, final FBDocument fBDocument, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6a213e7f", new Object[]{this, context, str, str2, fBDocument, new Long(j)});
        }
        if (fBDocument == null || fBDocument.n.contains(str) || !ExtHubCaller.isApiAvaliable(str)) {
            FBLogger.d(TAG, "dispatch jsapi " + str + " in RVK way");
            new Evt(str, str2, context, JSPlugin.FromCall.INVOKE, fBDocument, j);
            IpChange ipChange2 = Platform.$ipChange;
            return Boolean.TRUE;
        }
        FBLogger.d(TAG, "dispatch jsapi " + str + " in RVE way");
        ExtHubCaller.call(new ExtHubCallContext("200011231", "birdnest", (Activity) context, str, JSON.parseObject(str2), new ExtHubApiResponse(this) { // from class: com.alipay.android.app.template.JSPluginManager.2
            public void fail(com.alibaba.fastjson.JSONObject jSONObject) {
                try {
                    final Object[] objArr = {new JSONObject(JSON.toJSONString(jSONObject))};
                    JSPluginManager.b.post(new Runnable() { // from class: com.alipay.android.app.template.JSPluginManager.2.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            AnonymousClass2 r0 = AnonymousClass2.this;
                            fBDocument.callJsMethod(j, objArr);
                        }
                    });
                } catch (Throwable th) {
                    FBLogger.e(JSPluginManager.TAG, "jsapi " + str + " callback failed, " + th.getMessage());
                }
            }

            public void success(com.alibaba.fastjson.JSONObject jSONObject) {
                try {
                    final Object[] objArr = {new JSONObject(JSON.toJSONString(jSONObject))};
                    JSPluginManager.b.post(new Runnable() { // from class: com.alipay.android.app.template.JSPluginManager.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            AnonymousClass2 r0 = AnonymousClass2.this;
                            fBDocument.callJsMethod(j, objArr);
                        }
                    });
                } catch (Throwable th) {
                    FBLogger.e(JSPluginManager.TAG, "jsapi " + str + " callback failed, " + th.getMessage());
                }
            }
        }));
        return FBDocument.NO_RESULT;
    }
}
