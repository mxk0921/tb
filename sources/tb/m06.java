package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx_v4.loader.DXLoaderException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m06 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAJOR_VERSION = 4;

    /* renamed from: a  reason: collision with root package name */
    public int f23685a;
    public int b;

    static {
        t2o.a(444597867);
        t2o.a(444597873);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff94a9d3", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75807baa", new Object[]{this, new Integer(i)});
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc407cbd", new Object[]{this, new Integer(i)});
        } else {
            this.f23685a = i;
        }
    }

    public boolean b(lg5 lg5Var, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2df0ee7", new Object[]{this, lg5Var, dXRuntimeContext})).booleanValue();
        }
        lg5Var.k(this.f23685a);
        if (hd5.FILE_START_TAG.equals(new String(lg5Var.a(), 0, 5))) {
            lg5Var.l(5);
            if (lg5Var.e() != 4) {
                dXRuntimeContext.m().c.add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", f.DXERROR_PIPELINE_BINARY_MAJOR_VERSION_ERROR));
                return false;
            }
            this.b = lg5Var.j();
            short j = lg5Var.j();
            new String(lg5Var.a(), lg5Var.c(), (int) j);
            lg5Var.l(j);
            lg5Var.i();
            return true;
        }
        throw new DXLoaderException("文件不合法");
    }
}
