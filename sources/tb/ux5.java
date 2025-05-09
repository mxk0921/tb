package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dxcommon.expression.DXExprException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ux5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f29655a;
    public int b;
    public final gh5 c;
    public Map<String, Short> d;

    static {
        t2o.a(444597912);
    }

    public ux5(gh5 gh5Var) {
        this.c = gh5Var;
    }

    public Map<String, Short> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("eb3e1895", new Object[]{this});
        }
        return this.d;
    }

    public boolean b(lg5 lg5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a05386f6", new Object[]{this, lg5Var})).booleanValue();
        }
        lg5Var.k(this.f29655a);
        short j = lg5Var.j();
        if (j > 0) {
            this.d = new HashMap();
            for (int i = 0; i < j; i++) {
                this.d.put(this.c.b(lg5Var.h()), Short.valueOf(lg5Var.j()));
            }
        }
        if (lg5Var.c() - this.f29655a == this.b) {
            return true;
        }
        throw new DXExprException("DXFuncIndexToNameSectionLoader 长度无法对上");
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6b780e9", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbcb2e3c", new Object[]{this, new Integer(i)});
        } else {
            this.f29655a = i;
        }
    }
}
