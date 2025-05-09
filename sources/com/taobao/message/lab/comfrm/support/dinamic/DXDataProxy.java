package com.taobao.message.lab.comfrm.support.dinamic;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.util.BeanUtil;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import tb.fvb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DXDataProxy extends fvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(537919781);
    }

    public static /* synthetic */ Object ipc$super(DXDataProxy dXDataProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/dinamic/DXDataProxy");
    }

    @Override // tb.fvb
    public Object getValue(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f669ebca", new Object[]{this, obj, str});
        }
        if (obj instanceof List) {
            try {
                return ((List) obj).get(Integer.parseInt(str));
            } catch (Exception unused) {
                return null;
            }
        } else if (obj instanceof Array) {
            try {
                return Array.get(obj, Integer.parseInt(str));
            } catch (Exception unused2) {
                return null;
            }
        } else if (!(obj instanceof Map)) {
            return BeanUtil.getRaw(obj, str);
        } else {
            try {
                return ((Map) obj).get(str);
            } catch (Exception unused3) {
                return null;
            }
        }
    }

    @Override // tb.fvb
    public Object updateValueWithActions(Object obj, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4d4c2bd8", new Object[]{this, obj, jSONArray});
        }
        return null;
    }
}
