package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.vrp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class h4x extends vrp.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final pvh c;

    static {
        t2o.a(468714328);
    }

    public h4x(pvh pvhVar) {
        this.c = pvhVar;
    }

    public static /* synthetic */ Object ipc$super(h4x h4xVar, String str, Object... objArr) {
        if (str.hashCode() == 965972421) {
            return new Boolean(super.b((lr9) objArr[0], objArr[1]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/deprecated/message/callback/WeexCallbackV2");
    }

    @Override // tb.vrp.a
    public boolean b(lr9 lr9Var, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("399391c5", new Object[]{this, lr9Var, obj})).booleanValue();
        }
        boolean b = super.b(lr9Var, obj);
        if (b && this.c != null) {
            if (obj instanceof Map) {
                obj = new JSONObject((Map) obj);
            }
            this.c.b(obj);
        }
        return b;
    }
}
