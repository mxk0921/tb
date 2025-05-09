package com.taobao.android.weex.instance;

import android.content.Context;
import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexInstanceInternalMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.bridge.WeexPlatformInstanceBridge;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex_framework.MUSDKInstance;
import tb.a6x;
import tb.g6x;
import tb.t2o;
import tb.tvh;
import tb.x6x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexCanalSubInstance extends WeexDOMInstance implements a6x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final WeexCanalMainInstance mParent;

    static {
        t2o.a(982515916);
        t2o.a(982515874);
    }

    private WeexCanalSubInstance(g6x g6xVar) {
        super(g6xVar);
        this.mParent = (WeexCanalMainInstance) g6xVar.j;
    }

    public static WeexCanalSubInstance create(Context context, String str, String str2, WeexCanalMainInstance weexCanalMainInstance, JSONObject jSONObject, WeexInstanceConfig weexInstanceConfig, tvh tvhVar, WeexInstanceImpl weexInstanceImpl, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexCanalSubInstance) ipChange.ipc$dispatch("a911d1e3", new Object[]{context, str, str2, weexCanalMainInstance, jSONObject, weexInstanceConfig, tvhVar, weexInstanceImpl, new Integer(i)});
        }
        int incrementAndGet = MUSDKInstance.INSTANCE_ID_COUNTER.incrementAndGet();
        x6x.c(incrementAndGet, "Page", "CreateInstanceInPlatform").f();
        g6x g6xVar = new g6x(incrementAndGet, SystemClock.uptimeMillis(), context, str, str2, WeexInstanceInternalMode.CANAL_SUB, WeexRenderType.UNICORN);
        g6xVar.j = weexCanalMainInstance;
        g6xVar.h = jSONObject;
        g6xVar.i = weexInstanceConfig;
        g6xVar.k = weexInstanceImpl;
        g6xVar.l = i;
        if (weexInstanceConfig == null) {
            g6xVar.i = new WeexInstanceConfig();
        }
        if (g6xVar.i.f() == null) {
            g6xVar.i.s(new WeexUnicornConfig());
        }
        g6xVar.i.f().b().put("enable-share-thread", "false");
        WeexCanalSubInstance weexCanalSubInstance = new WeexCanalSubInstance(g6xVar);
        weexCanalSubInstance.bindJSThread(weexCanalMainInstance.getJSThreadHandler());
        WeexInstanceImpl.postInstanceCreate(weexCanalSubInstance, tvhVar);
        return weexCanalSubInstance;
    }

    public static /* synthetic */ Object ipc$super(WeexCanalSubInstance weexCanalSubInstance, String str, Object... objArr) {
        if (str.hashCode() == 743373420) {
            return super.getExtend((Class) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/instance/WeexCanalSubInstance");
    }

    @Override // tb.a6x
    public void createAppContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e9b8df1", new Object[]{this});
        } else {
            createAppContext(null);
        }
    }

    public String createEngine(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b2662c6", new Object[]{this, strArr});
        }
        return this.mParent.getEngineGroup().a(getAdapterMUSInstance(), strArr);
    }

    @Override // com.taobao.android.weex.instance.WeexDOMInstance, com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public <T> T getExtend(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2c4efa6c", new Object[]{this, cls});
        }
        if (cls == a6x.class) {
            return this;
        }
        return (T) super.getExtend(cls);
    }

    public void createAppContext(WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("719b2afb", new Object[]{this, weexValue});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.createAppContext(this.mNativePtr, weexValue);
        }
    }
}
