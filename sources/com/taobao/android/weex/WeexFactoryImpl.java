package com.taobao.android.weex;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.b;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex.instance.WeexCanalMainInstance;
import com.taobao.android.weex.instance.WeexDOMInstance;
import com.taobao.android.weex.instance.WeexMUSInstance;
import com.taobao.android.weex.instance.WeexScriptOnlyInstance;
import com.taobao.android.weex.instance.WeexXRInstance;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.performance.WMInstanceApm;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import tb.b9x;
import tb.c8x;
import tb.d5x;
import tb.d8x;
import tb.dwh;
import tb.g6x;
import tb.h5x;
import tb.j6x;
import tb.n9x;
import tb.o9x;
import tb.t2o;
import tb.t5x;
import tb.tvh;
import tb.u5x;
import tb.u8x;
import tb.v3x;
import tb.w6x;
import tb.x6x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexFactoryImpl extends com.taobao.android.weex.a implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int mMaxSingleUrlInstanceQueueSize = 1;
    private HashMap<String, LinkedList<WeexInstance>> mWeexInstanceQueuesMap = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$weex$WeexInstanceMode;

        static {
            int[] iArr = new int[WeexInstanceMode.values().length];
            $SwitchMap$com$taobao$android$weex$WeexInstanceMode = iArr;
            try {
                iArr[WeexInstanceMode.DOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexInstanceMode[WeexInstanceMode.MUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexInstanceMode[WeexInstanceMode.XR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexInstanceMode[WeexInstanceMode.CANAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexInstanceMode[WeexInstanceMode.SCRIPT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        t2o.a(982515749);
    }

    public static /* synthetic */ Object ipc$super(WeexFactoryImpl weexFactoryImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexFactoryImpl");
    }

    @Override // com.taobao.android.weex.a
    public WeexInstance createInstance(Context context, String str, WeexInstanceMode weexInstanceMode, WeexRenderType weexRenderType, JSONObject jSONObject, WeexInstanceConfig weexInstanceConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("29953435", new Object[]{this, context, str, weexInstanceMode, weexRenderType, jSONObject, weexInstanceConfig});
        }
        return createInstanceInternal(context, str, weexInstanceMode, weexRenderType, jSONObject, weexInstanceConfig, null, false);
    }

    @Override // com.taobao.android.weex.a
    public t5x createInstanceAsync(Context context, String str, WeexInstanceMode weexInstanceMode, WeexRenderType weexRenderType, JSONObject jSONObject, WeexInstanceConfig weexInstanceConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t5x) ipChange.ipc$dispatch("ee4e4d90", new Object[]{this, context, str, weexInstanceMode, weexRenderType, jSONObject, weexInstanceConfig});
        }
        return new u5x(context, str, weexInstanceMode, weexRenderType, jSONObject, weexInstanceConfig);
    }

    public WeexInstance createInstanceInternal(Context context, String str, WeexInstanceMode weexInstanceMode, WeexRenderType weexRenderType, JSONObject jSONObject, WeexInstanceConfig weexInstanceConfig, tvh tvhVar, boolean z) {
        tvh tvhVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("2d12d9bd", new Object[]{this, context, str, weexInstanceMode, weexRenderType, jSONObject, weexInstanceConfig, tvhVar, new Boolean(z)});
        }
        int incrementAndGet = MUSDKInstance.INSTANCE_ID_COUNTER.incrementAndGet();
        x6x.c(incrementAndGet, "Page", "CreateInstanceInPlatform").f();
        long uptimeMillis = SystemClock.uptimeMillis();
        w6x.r(WeexInstanceMode.SCRIPT);
        try {
            u8x.f("WXCreateInstance");
            if (tvhVar == null) {
                tvhVar2 = new tvh(context, null);
            } else {
                tvhVar2 = tvhVar;
            }
            Pair<String, String> c = b9x.c(str);
            g6x g6xVar = new g6x(incrementAndGet, uptimeMillis, context, (String) c.first, (String) c.second, null, null);
            g6xVar.h = jSONObject;
            g6xVar.i = weexInstanceConfig;
            g6xVar.n = tvhVar2;
            g6xVar.m = z;
            int i = a.$SwitchMap$com$taobao$android$weex$WeexInstanceMode[weexInstanceMode.ordinal()];
            if (i == 1) {
                g6xVar.f = WeexInstanceInternalMode.DOM;
                g6xVar.g = WeexRenderType.UNICORN;
                WeexDOMInstance create = WeexDOMInstance.create(g6xVar);
                u8x.h();
                return create;
            } else if (i == 2) {
                g6xVar.f = WeexInstanceInternalMode.MUS;
                g6xVar.g = WeexRenderType.UIKIT;
                WeexMUSInstance create2 = WeexMUSInstance.create(g6xVar);
                u8x.h();
                return create2;
            } else if (i == 3) {
                g6xVar.f = WeexInstanceInternalMode.XR;
                g6xVar.g = WeexRenderType.UNICORN;
                WeexXRInstance create3 = WeexXRInstance.create(g6xVar);
                u8x.h();
                return create3;
            } else if (i == 4) {
                g6xVar.f = WeexInstanceInternalMode.CANAL_MAIN;
                g6xVar.g = WeexRenderType.NONE;
                WeexCanalMainInstance create4 = WeexCanalMainInstance.create(g6xVar);
                u8x.h();
                return create4;
            } else if (i != 5) {
                u8x.h();
                return null;
            } else {
                g6xVar.f = WeexInstanceInternalMode.SCRIPT;
                g6xVar.g = WeexRenderType.NONE;
                WeexScriptOnlyInstance create5 = WeexScriptOnlyInstance.create(g6xVar);
                u8x.h();
                return create5;
            }
        } catch (Throwable th) {
            u8x.h();
            throw th;
        }
    }

    @Override // com.taobao.android.weex.a
    public void destroyPreInstanceWithUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8926453c", new Object[]{this, str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            dwh.e("clearPreInstanceWithUrl failed, bundleUrl is null");
        }
        LinkedList<WeexInstance> linkedList = this.mWeexInstanceQueuesMap.get(str);
        if (linkedList != null) {
            while (!linkedList.isEmpty()) {
                WeexInstance poll = linkedList.poll();
                if (poll != null) {
                    poll.destroy();
                }
            }
        }
    }

    @Override // com.taobao.android.weex.a
    public c8x getDownloader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8x) ipChange.ipc$dispatch("4e249017", new Object[]{this});
        }
        return d8x.b();
    }

    @Override // com.taobao.android.weex.a
    public d5x getEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d5x) ipChange.ipc$dispatch("53f414c8", new Object[]{this});
        }
        return h5x.m();
    }

    @Override // com.taobao.android.weex.a
    public WeexInstance getPreInstance(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("a7f90fcb", new Object[]{this, context, str});
        }
        if (TextUtils.isEmpty(str)) {
            dwh.e("getPreInstance failed, bundleUrl is null");
            return null;
        }
        LinkedList<WeexInstance> linkedList = this.mWeexInstanceQueuesMap.get(str);
        if (linkedList == null || linkedList.size() < 1) {
            return null;
        }
        dwh.o("getPreInstance size---->" + linkedList.size());
        WeexInstance poll = linkedList.poll();
        if (poll != null) {
            WeexInstanceStatus instanceStatus = poll.getInstanceStatus();
            if (instanceStatus == WeexInstanceStatus.INVALID || instanceStatus == WeexInstanceStatus.DESTROYED) {
                poll.destroy();
            } else {
                poll.resetContext(context);
            }
        }
        return poll;
    }

    @Override // com.taobao.android.weex.a
    public n9x getValueFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n9x) ipChange.ipc$dispatch("a823521a", new Object[]{this});
        }
        return o9x.c();
    }

    @Override // com.taobao.android.weex.a
    public b.a preCreateInstance(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2, WeexInstanceConfig weexInstanceConfig, j6x j6xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.a) ipChange.ipc$dispatch("1b5649a8", new Object[]{this, context, str, jSONObject, jSONObject2, weexInstanceConfig, j6xVar});
        }
        int incrementAndGet = MUSDKInstance.INSTANCE_ID_COUNTER.incrementAndGet();
        x6x.c(incrementAndGet, "Page", "CreateInstanceInPlatform").f();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (TextUtils.isEmpty(str)) {
            dwh.e("preCreateInstance failed, url is null");
            return new b.a(false, "preCreateInstance failed, url is null");
        }
        Pair<String, String> c = b9x.c(str);
        String b = b9x.b(str);
        LinkedList<WeexInstance> linkedList = this.mWeexInstanceQueuesMap.get(b);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            this.mWeexInstanceQueuesMap.put(b, linkedList);
        } else if (linkedList.size() >= 1) {
            dwh.o("queue is full , size = 1");
            return new b.a(false, "queue is full , size = 1");
        }
        g6x g6xVar = new g6x(incrementAndGet, uptimeMillis, context, (String) c.first, (String) c.second, WeexInstanceInternalMode.DOM, WeexRenderType.UNICORN);
        g6xVar.h = jSONObject;
        g6xVar.i = weexInstanceConfig;
        g6xVar.n = new tvh(context, null);
        WeexDOMInstance create = WeexDOMInstance.create(g6xVar);
        create.initWithURL(str);
        create.render(b.e().b(jSONObject2));
        if (j6xVar != null) {
            create.addInstanceListener(j6xVar);
        }
        v3x v3xVar = (v3x) create.getExtend(v3x.class);
        if (v3xVar != null) {
            v3xVar.b(WMInstanceApm.KEY_PAGE_PROPERTIES_INSTANCE_PRE_RENDER, "true");
        }
        dwh.o("preCreateInstance 创建完毕:" + create.getInstanceId());
        linkedList.add(create);
        return new b.a(true, "");
    }
}
