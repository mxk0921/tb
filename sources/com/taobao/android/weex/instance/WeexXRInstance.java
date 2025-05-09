package com.taobao.android.weex.instance;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import tb.g6x;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexXRInstance extends WeexDOMInstance {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(982515923);
    }

    private WeexXRInstance(g6x g6xVar) {
        super(g6xVar);
    }

    public static WeexXRInstance create(g6x g6xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexXRInstance) ipChange.ipc$dispatch("ecd66333", new Object[]{g6xVar});
        }
        WeexXRInstance weexXRInstance = new WeexXRInstance(g6xVar);
        WeexInstanceImpl.postInstanceCreate(weexXRInstance, g6xVar.n);
        return weexXRInstance;
    }

    public static /* synthetic */ Object ipc$super(WeexXRInstance weexXRInstance, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/instance/WeexXRInstance");
    }
}
