package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wks extends tls {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String b = "@concat(";
    public static final int c = 8;

    static {
        t2o.a(329252946);
    }

    public static /* synthetic */ Object ipc$super(wks wksVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/operator/TSConcatOperator");
    }

    @Override // tb.tls
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ada0f062", new Object[]{this})).intValue();
        }
        return c;
    }

    @Override // tb.tls
    public Object c(wp8 wp8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f75136", new Object[]{this, wp8Var});
        }
        List<Object> list = this.f28789a;
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Object obj : this.f28789a) {
            Object l = wp8Var.l(obj);
            if (l != null) {
                stringBuffer.append(l.toString());
            }
        }
        return stringBuffer.toString();
    }
}
