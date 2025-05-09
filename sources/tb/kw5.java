package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kw5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f22965a;
    public int b;
    public byte[] c;

    static {
        t2o.a(444597034);
    }

    public byte[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("4b110c76", new Object[]{this});
        }
        return this.c;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf17de74", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f9eac8", new Object[]{this, new Integer(i)});
        } else {
            this.f22965a = i;
        }
    }

    public boolean b(lg5 lg5Var, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2df0ee7", new Object[]{this, lg5Var, dXRuntimeContext})).booleanValue();
        }
        int i = this.b;
        if (i < 0) {
            h36.c("读取新表达式相关逻辑失败");
            return false;
        }
        this.c = new byte[i];
        lg5Var.k(this.f22965a);
        for (int i2 = 0; i2 < this.b; i2++) {
            this.c[i2] = lg5Var.e();
        }
        return true;
    }
}
