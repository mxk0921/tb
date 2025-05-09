package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a47 extends qrn implements l1j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final AtomicInteger e = new AtomicInteger(0);
    public final int f;

    static {
        t2o.a(986710030);
        t2o.a(986710034);
    }

    public a47(String str, int i, boolean z) {
        super(str, i, z);
        this.f = i;
    }

    public static /* synthetic */ Object ipc$super(a47 a47Var, String str, Object... objArr) {
        if (str.hashCode() == -493686155) {
            return a47Var.c();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/pool/mount/DefaultMountPool");
    }

    @Override // tb.l1j
    public Object a(Context context, hvu hvuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f457bd89", new Object[]{this, context, hvuVar});
        }
        Object c = c();
        if (c != null) {
            return c;
        }
        this.e.incrementAndGet();
        return hvuVar.createMountContent(context);
    }

    @Override // tb.l1j
    public void b(Context context, hvu hvuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f31fc23e", new Object[]{this, context, hvuVar});
        } else if (!e() && this.e.getAndIncrement() < this.f) {
            release(hvuVar.createMountContent(context));
        }
    }
}
