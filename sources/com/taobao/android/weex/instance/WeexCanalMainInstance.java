package com.taobao.android.weex.instance;

import android.content.Context;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.bridge.WeexPlatformInstanceBridge;
import com.taobao.android.weex.config.WeexInstanceConfig;
import java.util.ArrayList;
import java.util.HashMap;
import tb.b9x;
import tb.c6x;
import tb.d6x;
import tb.g6x;
import tb.q6x;
import tb.t2o;
import tb.tvh;
import tb.vvh;
import tb.x8x;
import tb.xpc;
import tb.z9x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexCanalMainInstance extends WeexScriptOnlyInstance implements d6x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private c6x mEngineGroup;
    private final ArrayList<String> mUnicornConfigStrings;

    static {
        t2o.a(982515915);
        t2o.a(982515875);
    }

    private WeexCanalMainInstance(g6x g6xVar) {
        super(g6xVar);
        ArrayList<String> arrayList = new ArrayList<>();
        this.mUnicornConfigStrings = arrayList;
        HashMap hashMap = new HashMap();
        hashMap.put("enable-share-thread", "false");
        x8x.M(arrayList, hashMap, getInstanceId() + "");
        arrayList.addAll(getRenderEngineOptions());
    }

    public static WeexCanalMainInstance create(g6x g6xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexCanalMainInstance) ipChange.ipc$dispatch("9d8027cb", new Object[]{g6xVar});
        }
        WeexCanalMainInstance weexCanalMainInstance = new WeexCanalMainInstance(g6xVar);
        WeexInstanceImpl.postInstanceCreate(weexCanalMainInstance, g6xVar.n);
        z9x.d(weexCanalMainInstance.getInstanceId(), xpc.RECORD_CREATE_CANAL_MAIN_INSTANCE, g6xVar.d, g6xVar.h);
        return weexCanalMainInstance;
    }

    public static /* synthetic */ Object ipc$super(WeexCanalMainInstance weexCanalMainInstance, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 743373420) {
            return super.getExtend((Class) objArr[0]);
        }
        if (hashCode == 939513102) {
            super.onDestroyStart();
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/weex/instance/WeexCanalMainInstance");
    }

    @Override // tb.d6x
    public WeexInstance createChildInstance(Context context, String str, JSONObject jSONObject, WeexInstanceConfig weexInstanceConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("3affaa17", new Object[]{this, context, str, jSONObject, weexInstanceConfig});
        }
        Pair<String, String> c = b9x.c(str);
        WeexCanalSubInstance create = WeexCanalSubInstance.create(context, (String) c.first, (String) c.second, this, jSONObject, weexInstanceConfig, new tvh(context, null), null, 0);
        z9x.d(create.getInstanceId(), xpc.RECORD_CREATE_CANAL_CHILD_INSTANCE, Integer.valueOf(getInstanceId()), str, jSONObject, create);
        z9x.d(create.getInstanceId(), "environment", null, null, vvh.h());
        return create;
    }

    public c6x getEngineGroup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c6x) ipChange.ipc$dispatch("ac67160d", new Object[]{this});
        }
        return this.mEngineGroup;
    }

    @Override // com.taobao.android.weex.instance.WeexScriptOnlyInstance, com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public <T> T getExtend(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2c4efa6c", new Object[]{this, cls});
        }
        if (cls == d6x.class) {
            return this;
        }
        return (T) super.getExtend(cls);
    }

    public ArrayList<String> getUnicornConfigStrings() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("57e5f47f", new Object[]{this});
        }
        return this.mUnicornConfigStrings;
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void onDestroyStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37ffd50e", new Object[]{this});
            return;
        }
        c6x c6xVar = this.mEngineGroup;
        if (c6xVar != null) {
            c6xVar.b();
        }
        super.onDestroyStart();
    }

    @Override // tb.d6x
    public void registerSourceMapURL(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648f8dcc", new Object[]{this, str, str2});
        } else if (!isDestroyed()) {
            WeexPlatformInstanceBridge.registerSourceMapURL(this.mNativePtr, str, str2);
        }
    }

    public void setEngineGroup(c6x c6xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5431187", new Object[]{this, c6xVar});
        } else {
            this.mEngineGroup = c6xVar;
        }
    }

    @Override // tb.d6x
    public WeexInstance createChildInstance(Context context, String str, JSONObject jSONObject, WeexInstanceConfig weexInstanceConfig, WeexInstance weexInstance, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("61b1a6ec", new Object[]{this, context, str, jSONObject, weexInstanceConfig, weexInstance, new Integer(i)});
        }
        Pair<String, String> c = b9x.c(str);
        x8x x8xVar = (x8x) weexInstance.getExtend(q6x.class);
        WeexCanalSubInstance create = WeexCanalSubInstance.create(context, (String) c.first, (String) c.second, this, jSONObject, weexInstanceConfig, new tvh(context, null), (WeexInstanceImpl) weexInstance, i);
        x8xVar.i0(i, create);
        return create;
    }
}
