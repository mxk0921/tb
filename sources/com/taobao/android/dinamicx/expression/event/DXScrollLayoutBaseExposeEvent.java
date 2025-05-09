package com.taobao.android.dinamicx.expression.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.mw5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXScrollLayoutBaseExposeEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXSCROLLLAYOUTBASE_ONEXPOSURE = 6278152710403332930L;

    static {
        t2o.a(444596815);
    }

    public DXScrollLayoutBaseExposeEvent(int i, Object obj) {
        super(DXSCROLLLAYOUTBASE_ONEXPOSURE);
        setData(i, obj);
    }

    public static /* synthetic */ Object ipc$super(DXScrollLayoutBaseExposeEvent dXScrollLayoutBaseExposeEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/event/DXScrollLayoutBaseExposeEvent");
    }

    private void setData(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f015f8c", new Object[]{this, new Integer(i), obj});
            return;
        }
        if (this.args == null) {
            this.args = new HashMap();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("index", mw5.K(i));
        if (obj instanceof JSONObject) {
            hashMap.put("data", mw5.N((JSONObject) obj));
        } else if (obj != null) {
            hashMap.put("data", mw5.L(obj));
        }
        setArgs(hashMap);
    }
}
