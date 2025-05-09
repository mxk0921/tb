package com.alibaba.android.bindingx.core;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.pqf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BindingXJSFunctionRegister {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final BindingXJSFunctionRegister sInstance = new BindingXJSFunctionRegister();
    private final LinkedHashMap<String, pqf> mJSFunctionMap = new LinkedHashMap<>(8);

    static {
        t2o.a(87031820);
    }

    public static BindingXJSFunctionRegister getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BindingXJSFunctionRegister) ipChange.ipc$dispatch("218c5c27", new Object[0]);
        }
        return sInstance;
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.mJSFunctionMap.clear();
        }
    }

    public Map<String, pqf> getJSFunctions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("373e6b8", new Object[]{this});
        }
        return this.mJSFunctionMap;
    }

    public void registerJSFunction(String str, pqf pqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b501ed69", new Object[]{this, str, pqfVar});
        } else if (!TextUtils.isEmpty(str) && pqfVar != null) {
            this.mJSFunctionMap.put(str, pqfVar);
        }
    }

    public boolean unregisterJSFunction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe865052", new Object[]{this, str})).booleanValue();
        }
        return !TextUtils.isEmpty(str) && this.mJSFunctionMap.remove(str) != null;
    }
}
