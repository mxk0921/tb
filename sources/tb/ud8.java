package tb;

import android.content.res.AssetManager;
import android.util.TypedValue;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ud8 extends t9o {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean g;
    public boolean h;

    static {
        t2o.a(620757086);
    }

    public ud8(int i, boolean z, byte[] bArr, int i2, InputStream inputStream, int i3, TypedValue typedValue) {
        super(i, bArr, i2, inputStream, i3, typedValue);
        boolean z2 = true;
        if (i == 1) {
            this.g = (!z || bArr == null || bArr.length - i2 < i3) ? false : z2;
        } else {
            this.g = z;
        }
    }

    public static /* synthetic */ Object ipc$super(ud8 ud8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/entity/EncodedData");
    }

    public boolean a() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[]{this})).booleanValue();
        }
        if (this.h || (i = this.b) <= 0) {
            return false;
        }
        if (this.f28582a == 1) {
            if (this.c == null || (i2 = this.d) < 0 || i2 >= i) {
                return false;
            }
            return true;
        } else if (this.e != null) {
            return true;
        } else {
            return false;
        }
    }

    public synchronized void b(boolean z) {
        InputStream inputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88058386", new Object[]{this, new Boolean(z)});
        } else if (this.h) {
            if (z) {
                fiv.k("EncodedData", "has been released when trying to release it[type: %d]", Integer.valueOf(this.f28582a));
            }
        } else {
            if (!z) {
                fiv.k("EncodedData", "final release called from finalize[type: %d]", Integer.valueOf(this.f28582a));
            }
            int i = this.f28582a;
            if (i == 1) {
                lp2 a2 = s0m.B().e().a();
                if (a2 != null) {
                    a2.b(this.c);
                }
            } else if (i == 3 && (inputStream = this.e) != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            this.h = true;
        }
    }

    @Override // tb.t9o, tb.swn
    public synchronized void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            b(true);
        }
    }

    public static ud8 c(t9o t9oVar, xpq xpqVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ud8) ipChange.ipc$dispatch("2c33ad82", new Object[]{t9oVar, xpqVar});
        }
        int i = t9oVar.f28582a;
        if (i == 3) {
            InputStream inputStream = t9oVar.e;
            if ((inputStream instanceof FileInputStream) || (inputStream instanceof AssetManager.AssetInputStream)) {
                return new ud8(inputStream, t9oVar.b, t9oVar.f);
            }
            lp2 a2 = s0m.B().e().a();
            if (xpqVar == null) {
                return eqq.a(inputStream, a2, new int[]{t9oVar.b});
            }
            eqq.b(inputStream, a2, xpqVar);
            return xpqVar.a();
        } else if (i == 1) {
            return new ud8(t9oVar.c, t9oVar.d, t9oVar.b);
        } else {
            throw new RuntimeException("unrecognized response type: " + t9oVar.f28582a);
        }
    }

    public ud8(ud8 ud8Var) {
        this(ud8Var.f28582a, ud8Var.g, ud8Var.c, ud8Var.d, ud8Var.e, ud8Var.b, ud8Var.f);
    }

    public ud8(InputStream inputStream, int i, TypedValue typedValue) {
        this(3, true, null, 0, inputStream, i, typedValue);
    }

    public ud8(boolean z, byte[] bArr, int i, int i2) {
        this(1, z, bArr, i, null, i2, null);
    }

    public ud8(byte[] bArr, int i, int i2) {
        this(1, true, bArr, i, null, i2, null);
    }
}
