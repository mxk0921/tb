package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o9x implements n9x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final o9x f25237a = new o9x();

    static {
        t2o.a(982515820);
        t2o.a(982515819);
    }

    public static o9x c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o9x) ipChange.ipc$dispatch("febdf29e", new Object[0]);
        }
        return f25237a;
    }

    @Override // tb.n9x
    public WeexValue a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("ce0b312", new Object[]{this, obj});
        }
        return WeexValueImpl.convert(obj);
    }

    @Override // tb.n9x
    public WeexValue b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("498212cf", new Object[]{this, jSONObject});
        }
        return WeexValueImpl.ofJSONObject(jSONObject);
    }
}
