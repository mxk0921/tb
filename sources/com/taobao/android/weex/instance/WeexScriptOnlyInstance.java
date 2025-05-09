package com.taobao.android.weex.instance;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.bridge.WeexPlatformInstanceBridge;
import tb.g6x;
import tb.i6x;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexScriptOnlyInstance extends WeexInstanceImpl implements i6x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(982515922);
        t2o.a(982515877);
    }

    public WeexScriptOnlyInstance(g6x g6xVar) {
        super(g6xVar);
    }

    public static WeexScriptOnlyInstance create(g6x g6xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexScriptOnlyInstance) ipChange.ipc$dispatch("1083c896", new Object[]{g6xVar});
        }
        WeexScriptOnlyInstance weexScriptOnlyInstance = new WeexScriptOnlyInstance(g6xVar);
        WeexInstanceImpl.postInstanceCreate(weexScriptOnlyInstance, g6xVar.n);
        return weexScriptOnlyInstance;
    }

    public static /* synthetic */ Object ipc$super(WeexScriptOnlyInstance weexScriptOnlyInstance, String str, Object... objArr) {
        if (str.hashCode() == 743373420) {
            return super.getExtend((Class) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/instance/WeexScriptOnlyInstance");
    }

    public void execute(WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f92cb53", new Object[]{this, weexValueArr});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.scriptOnlyExecute(this.mNativePtr, weexValueArr);
        }
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public <T> T getExtend(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2c4efa6c", new Object[]{this, cls});
        }
        if (cls == i6x.class) {
            return this;
        }
        return (T) super.getExtend(cls);
    }

    public void legacyDispatchEvent(String str, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a2aa544", new Object[]{this, str, weexValue});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.scriptOnlyDispatchEvent(this.mNativePtr, str, weexValue);
        }
    }

    public void register(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea7341c", new Object[]{this, jSONArray, str});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.scriptOnlyRegister(this.mNativePtr, jSONArray.toJSONString(), str);
        }
    }
}
