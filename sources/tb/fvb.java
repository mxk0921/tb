package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class fvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596611);
    }

    public abstract Object getValue(Object obj, String str);

    public boolean setValue(Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8de60fbc", new Object[]{this, obj, str, obj2})).booleanValue();
        }
        return false;
    }

    public abstract Object updateValueWithActions(Object obj, JSONArray jSONArray);
}
