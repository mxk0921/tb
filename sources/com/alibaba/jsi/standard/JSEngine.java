package com.alibaba.jsi.standard;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;
import tb.a0y;
import tb.dqf;
import tb.hqf;
import tb.n4y;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class JSEngine extends hqf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(921698317);
    }

    public JSEngine(Object obj, Map<String, String> map, long j, Object obj2) {
        super(obj, map, j, obj2);
    }

    public static JSEngine createInstance(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSEngine) ipChange.ipc$dispatch("eb11b3a8", new Object[]{context, bundle}) : createInstance(context, bundle, null);
    }

    public static /* synthetic */ Object ipc$super(JSEngine jSEngine, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/jsi/standard/JSEngine");
    }

    public static boolean loadSo(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f451abf9", new Object[]{context, bundle})).booleanValue();
        }
        if (context == null) {
            throw new NullPointerException("context can not be null");
        } else if (bundle != null) {
            n4y.d(context);
            String string = bundle.getString("jsiSoPath");
            if (string == null) {
                string = bundle.getString("p8SoPath");
            }
            return hqf.loadSoImpl(string, bundle.getString("jsEngineSoPath"), bundle.getString("engineType"));
        } else {
            throw new NullPointerException("args can not be null");
        }
    }

    public dqf createContext(String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dqf) ipChange.ipc$dispatch("87d12c31", new Object[]{this, str, bundle}) : createContextImpl(str, bundle, null);
    }

    public static JSEngine createInstance(Context context, Bundle bundle, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSEngine) ipChange.ipc$dispatch("85a04cd8", new Object[]{context, bundle, handler});
        }
        if (context == null || bundle == null) {
            throw new NullPointerException("context and args can not be null!");
        }
        String string = bundle.getString("name");
        if (string != null) {
            String string2 = bundle.getString("version", "");
            String string3 = bundle.getString("flags", "");
            String string4 = bundle.getString("datadir", null);
            if (!(string4 == null || string4.trim().length() == 0)) {
                a0y.m("JSEngine \"" + string + "\" is creating with deprecated 'datadir' argument!");
            }
            int i = bundle.getInt("engine", 0);
            int i2 = bundle.getInt("timeout", 0);
            HashMap hashMap = new HashMap();
            hashMap.put("name", string);
            hashMap.put("version", string2);
            hashMap.put("flags", string3);
            hashMap.put("engine", String.valueOf(i));
            hashMap.put("timeout", String.valueOf(i2));
            return hqf.createInstanceImpl(context, hashMap, 0L, handler);
        }
        throw new RuntimeException("'name' not set!");
    }

    public dqf createContext(String str, Bundle bundle, Class<? extends Annotation> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dqf) ipChange.ipc$dispatch("6cb04fb4", new Object[]{this, str, bundle, cls}) : createContextImpl(str, bundle, cls);
    }
}
