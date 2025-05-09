package com.taobao.android.weex_framework;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexFactoryImpl;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.bridge.WeexPlatformCommonBridge;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.performance.WMInstanceApm;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.dwh;
import tb.kq2;
import tb.t2o;
import tb.tvh;
import tb.v8x;
import tb.z1x;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile ConcurrentHashMap<String, ConcurrentLinkedQueue<MUSDKInstance>> f9966a;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.weex_framework.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class C0519b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final b f9967a = new b();

        static {
            t2o.a(982516029);
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3887d8c7", new Object[0]);
            }
            return f9967a;
        }
    }

    static {
        t2o.a(982516027);
    }

    public static b f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("236806ad", new Object[0]);
        }
        return C0519b.a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbee471", new Object[]{this});
        } else if (this.f9966a != null) {
            for (String str : this.f9966a.keySet()) {
                ConcurrentLinkedQueue<MUSDKInstance> concurrentLinkedQueue = this.f9966a.get(str);
                if (concurrentLinkedQueue != null) {
                    while (!concurrentLinkedQueue.isEmpty()) {
                        MUSDKInstance poll = concurrentLinkedQueue.poll();
                        if (poll != null) {
                            poll.destroy();
                        }
                    }
                }
            }
        }
    }

    public com.taobao.android.weex_framework.a b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("3754d91d", new Object[]{this, context});
        }
        return d(context, null);
    }

    public com.taobao.android.weex_framework.a c(Context context, MUSInstanceConfig mUSInstanceConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("68e96b8", new Object[]{this, context, mUSInstanceConfig});
        }
        return d(context, mUSInstanceConfig);
    }

    public final com.taobao.android.weex_framework.a d(Context context, MUSInstanceConfig mUSInstanceConfig) {
        boolean z;
        boolean z2;
        WeexInstanceMode weexInstanceMode;
        WeexRenderType weexRenderType;
        WeexInstanceConfig weexInstanceConfig;
        String str;
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("10b8592e", new Object[]{this, context, mUSInstanceConfig});
        }
        tvh tvhVar = new tvh(context, mUSInstanceConfig);
        IpChange ipChange2 = WeexInstanceMode.$ipChange;
        IpChange ipChange3 = WeexRenderType.$ipChange;
        IpChange ipChange4 = MUSInstanceConfig.MUSRenderType.$ipChange;
        if (mUSInstanceConfig != null) {
            mUSInstanceConfig.d();
            boolean F = mUSInstanceConfig.F();
            z2 = mUSInstanceConfig.G();
            z = F;
            z3 = mUSInstanceConfig.m();
        } else {
            z2 = false;
            z = false;
        }
        if (z3) {
            weexInstanceMode = WeexInstanceMode.SCRIPT;
            weexRenderType = WeexRenderType.NONE;
        } else if (z2) {
            weexInstanceMode = WeexInstanceMode.XR;
            weexRenderType = WeexRenderType.UNICORN;
        } else if (z) {
            weexInstanceMode = WeexInstanceMode.DOM;
            weexRenderType = WeexRenderType.UNICORN;
        } else {
            weexInstanceMode = WeexInstanceMode.MUS;
            weexRenderType = WeexRenderType.UIKIT;
        }
        WeexInstanceConfig weexInstanceConfig2 = null;
        if (mUSInstanceConfig != null) {
            str = mUSInstanceConfig.a();
            if (weexRenderType == WeexRenderType.UNICORN) {
                weexInstanceConfig2 = new WeexInstanceConfig();
                WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
                weexInstanceConfig2.s(weexUnicornConfig);
                weexInstanceConfig2.m(mUSInstanceConfig.b());
                weexInstanceConfig2.t(mUSInstanceConfig.i());
                HashMap<String, String> c = mUSInstanceConfig.c();
                if (c != null) {
                    weexUnicornConfig.b().putAll(c);
                }
                weexUnicornConfig.j(mUSInstanceConfig.h());
                weexUnicornConfig.k(true ^ mUSInstanceConfig.k());
                weexUnicornConfig.i(WeexUnicornConfig.RenderMode.values()[mUSInstanceConfig.f().ordinal()]);
            } else if (weexInstanceMode == WeexInstanceMode.MUS) {
                WeexInstanceConfig weexInstanceConfig3 = new WeexInstanceConfig();
                v8x v8xVar = new v8x();
                weexInstanceConfig3.r(v8xVar);
                weexInstanceConfig3.m(weexInstanceConfig3.b());
                v8xVar.c(mUSInstanceConfig.j());
                v8xVar.d(mUSInstanceConfig.l());
                weexInstanceConfig = weexInstanceConfig3;
            }
            weexInstanceConfig = weexInstanceConfig2;
        } else {
            str = null;
            weexInstanceConfig = null;
        }
        WeexInstanceImpl weexInstanceImpl = (WeexInstanceImpl) ((WeexFactoryImpl) com.taobao.android.weex.a.getInstance()).createInstanceInternal(context, str, weexInstanceMode, weexRenderType, null, weexInstanceConfig, tvhVar, false);
        return tvhVar;
    }

    public b() {
        this.f9966a = new ConcurrentHashMap<>();
    }

    public MUSDKInstance e(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSDKInstance) ipChange.ipc$dispatch("90cbc41d", new Object[]{this, str, jSONObject});
        }
        if (TextUtils.isEmpty(str)) {
            dwh.e("getReadyInstance failed, bizName is null");
            return null;
        }
        boolean z = jSONObject.containsKey(z1x.PRE_RENDER) && jSONObject.getBoolean(z1x.PRE_RENDER).booleanValue();
        ConcurrentLinkedQueue<MUSDKInstance> concurrentLinkedQueue = this.f9966a.get(str);
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return null;
        }
        dwh.o("getCacheInstanceWithURL size---->" + concurrentLinkedQueue.size());
        MUSDKInstance poll = concurrentLinkedQueue.poll();
        if (poll != null) {
            if (poll.isInvalid()) {
                poll.destroy();
                return null;
            }
            poll.fireGlobalEvent("onPageOpen", jSONObject);
        }
        if (z && poll != null) {
            dwh.o("getCacheInstanceWithURL 获取---->" + poll.getInstanceId());
            poll.fireEvent(0, "load", new JSONObject());
            poll.onScreenRendering();
        }
        return poll;
    }

    public void g(Context context, MUSInstanceConfig mUSInstanceConfig, JSONObject jSONObject, int i, int i2) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a87760", new Object[]{this, context, mUSInstanceConfig, jSONObject, new Integer(i), new Integer(i2)});
        } else if (context != null) {
            String string = jSONObject.getString("bizName");
            if (TextUtils.isEmpty(string)) {
                dwh.e("preLoadWeexInstance failed, bizName is null");
                return;
            }
            if (this.f9966a.get(string) == null) {
                this.f9966a.put(string, new ConcurrentLinkedQueue<>());
            }
            jSONObject.getString("wlmUrl");
            String string2 = jSONObject.getString("bundleUrl");
            JSONObject jSONObject2 = jSONObject.getJSONObject("initData");
            JSONObject jSONObject3 = jSONObject.getJSONObject("options");
            boolean z = jSONObject.containsKey(z1x.PRE_RENDER) && jSONObject.getBoolean(z1x.PRE_RENDER).booleanValue();
            boolean z2 = jSONObject.containsKey("onlyInit") && jSONObject.getBoolean("onlyInit").booleanValue();
            if (!TextUtils.isEmpty(string2) && (parse = Uri.parse(string2)) != null && parse.isHierarchical()) {
                string2 = parse.buildUpon().appendQueryParameter("isPreload", "true").build().toString();
            }
            ConcurrentLinkedQueue<MUSDKInstance> concurrentLinkedQueue = this.f9966a.get(string);
            if (concurrentLinkedQueue != null) {
                dwh.o("preInitWithUrl size---->" + concurrentLinkedQueue.size());
                if (concurrentLinkedQueue.size() < 1) {
                    if (mUSInstanceConfig == null) {
                        mUSInstanceConfig = new MUSInstanceConfig();
                    }
                    if (TextUtils.isEmpty(mUSInstanceConfig.a())) {
                        mUSInstanceConfig.p(string2);
                    }
                    mUSInstanceConfig.w(true);
                    MUSDKInstance mUSDKInstance = (MUSDKInstance) c(context, mUSInstanceConfig);
                    if (z) {
                        mUSDKInstance.onPreRendering(i, i2);
                    }
                    if (!(i == 0 || i2 == 0)) {
                        mUSDKInstance.setConstrainedSize(new kq2(i, i2));
                    }
                    mUSDKInstance.initWithURL(Uri.parse(string2));
                    if (z || !z2) {
                        mUSDKInstance.render(jSONObject2, jSONObject3);
                        mUSDKInstance.fireGlobalEvent(Constants.Event.RESUME_EVENT, new Object[0]);
                        if (mUSDKInstance.getWeexInstanceApm() != null) {
                            mUSDKInstance.getWeexInstanceApm().b(WMInstanceApm.KEY_PAGE_PROPERTIES_INSTANCE_PRE_RENDER, "true");
                        }
                    }
                    WeexPlatformCommonBridge.addEngineInfoTag(mUSDKInstance.getInstanceId(), "preCreateLegacy");
                    dwh.o("preInitWithUrl 创建---->" + mUSDKInstance.getInstanceId());
                    concurrentLinkedQueue.add(mUSDKInstance);
                }
            }
        }
    }
}
