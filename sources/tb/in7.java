package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.StringTokenizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class in7 extends av {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596293);
    }

    public static /* synthetic */ Object ipc$super(in7 in7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/expression/parser/DinamicSubDataParser");
    }

    @Override // tb.av, tb.im7
    public Object a(List list, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ab0b6f88", new Object[]{this, list, bn7Var});
        }
        return c((String) list.get(0), bn7Var.a());
    }

    @Override // tb.av, tb.im7
    public Object b(String str, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("288c7aaf", new Object[]{this, str, bn7Var});
        }
        return d(bn7Var.c(), str, bn7Var.a(), bn7Var.b());
    }

    @Override // tb.av
    public Object c(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("acbcdf66", new Object[]{this, str, obj});
        }
        if (TextUtils.isEmpty(str)) {
            return obj;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, " .[]", false);
        while (stringTokenizer.hasMoreTokens()) {
            obj = e2w.a(obj, stringTokenizer.nextToken());
        }
        return obj;
    }

    @Override // tb.av
    public Object d(String str, String str2, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dfd85a80", new Object[]{this, str, str2, obj, obj2});
        }
        return c(str2, obj);
    }
}
