package com.taobao.android.dinamicx.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXJSONObjectForVM extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY = "DX_USER_DEFINED_DATA";

    static {
        t2o.a(444596873);
    }

    public static /* synthetic */ Object ipc$super(DXJSONObjectForVM dXJSONObjectForVM, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/model/DXJSONObjectForVM");
    }

    public Object getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4ca84d6b", new Object[]{this});
        }
        return get(KEY);
    }

    public void setData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f836cf", new Object[]{this, obj});
        } else {
            put(KEY, obj);
        }
    }
}
