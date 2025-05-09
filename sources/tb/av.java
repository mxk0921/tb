package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class av implements im7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596283);
        t2o.a(444596288);
    }

    @Override // tb.im7
    public Object a(List list, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ab0b6f88", new Object[]{this, list, bn7Var});
        }
        return null;
    }

    @Override // tb.im7
    public Object b(String str, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("288c7aaf", new Object[]{this, str, bn7Var});
        }
        return d(bn7Var.c(), str, bn7Var.d(), bn7Var.b());
    }

    public Object c(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("acbcdf66", new Object[]{this, str, obj});
        }
        return null;
    }

    public Object d(String str, String str2, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dfd85a80", new Object[]{this, str, str2, obj, obj2});
        }
        return c(str2, obj);
    }
}
