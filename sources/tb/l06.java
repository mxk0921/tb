package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l06 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte DXBinaryLogicProductCategoryFlexa = 2;
    public static final byte DXBinaryLogicProductCategoryHyengine = 1;
    public static final byte DXBinaryLogicProductCategoryInvalid = -1;
    public static final byte DXBinaryLogicProductCategoryJS = 3;
    public static final byte DXBinaryLogicProductCategoryJSV400 = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f23036a = 0;
    public byte b;
    public final m06 c;

    static {
        t2o.a(444597874);
        t2o.a(444597873);
    }

    public l06(m06 m06Var) {
        this.c = m06Var;
    }

    public byte a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fba8638", new Object[]{this})).byteValue();
        }
        return this.b;
    }

    public boolean b(lg5 lg5Var, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2df0ee7", new Object[]{this, lg5Var, dXRuntimeContext})).booleanValue();
        }
        if (this.c.a() < 1) {
            return true;
        }
        int h = lg5Var.h();
        this.f23036a = h;
        if (h <= 4) {
            return true;
        }
        short j = lg5Var.j();
        new String(lg5Var.a(), lg5Var.c(), (int) j);
        lg5Var.l(j);
        this.b = lg5Var.e();
        int i = this.f23036a - (j + 7);
        if (i > 0) {
            lg5Var.l(i);
        }
        h36.a("读取 headerextension结束");
        return true;
    }
}
