package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hn7 extends av {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596292);
    }

    public static /* synthetic */ Object ipc$super(hn7 hn7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/expression/parser/DinamicSizeByFactorDataParser");
    }

    @Override // tb.av, tb.im7
    public Object a(List list, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ab0b6f88", new Object[]{this, list, bn7Var});
        }
        if (!(list == null || list.size() == 0)) {
            if (vu5.f() && list.size() == 1 && list.get(0) != null) {
                return String.valueOf(pb6.z(DinamicXEngine.x(), vu5.c(pb6.o(DinamicXEngine.x(), String.valueOf(list.get(0)), 0))));
            }
            px5 b = px5.b();
            if (list.size() == 1 && (list.get(0) instanceof Number)) {
                return b.d((Double) list.get(0));
            }
            if (list.size() == 2 && (list.get(0) instanceof Number) && (list.get(1) instanceof Number)) {
                return b.e((Double) list.get(0), (Double) list.get(1));
            }
            if (list.size() == 5 && (list.get(0) instanceof Number) && (list.get(1) instanceof Number) && (list.get(2) instanceof Number) && (list.get(3) instanceof Number) && (list.get(4) instanceof Number)) {
                return b.f((Double) list.get(0), (Double) list.get(1), (Double) list.get(2), (Double) list.get(3), (Double) list.get(4));
            }
            if (list.size() == 1 && list.get(0) != null) {
                return b.g(String.valueOf(list.get(0)));
            }
            if (list.size() == 2 && list.get(0) != null && list.get(1) != null) {
                return b.h(String.valueOf(list.get(0)), String.valueOf(list.get(1)));
            }
            if (list.size() == 5) {
                return b.i(String.valueOf(list.get(0)), String.valueOf(list.get(1)), String.valueOf(list.get(2)), String.valueOf(list.get(3)), String.valueOf(list.get(4)));
            }
        }
        return null;
    }
}
