package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.api.assets.CheckAssetsResult;
import com.taobao.android.remoteso.index.d;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ywn implements lid {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final d f32395a;
    public final agd b;

    static {
        RSoLog.e("remo-assets");
    }

    public ywn(d dVar, agd agdVar) {
        this.f32395a = dVar;
        this.b = agdVar;
    }

    @Override // tb.lid
    public w2l a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w2l) ipChange.ipc$dispatch("7df8ac43", new Object[]{this, str});
        }
        try {
            a7o b = this.b.c(str).b();
            if (b.j()) {
                return new w2l(str, new BufferedInputStream(new FileInputStream(b.f())), null);
            }
            RSoException b2 = b.b();
            if (b2 != null) {
                return new w2l(str, null, b2);
            }
            return new w2l(str, null, RSoException.error(8001));
        } catch (Throwable th) {
            throw new RuntimeException("error in RemoAssetsImpl", th);
        }
    }

    @Override // tb.lid
    public CheckAssetsResult b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CheckAssetsResult) ipChange.ipc$dispatch("bc930abe", new Object[]{this, str});
        }
        return new CheckAssetsResult(str, 1 ^ this.f32395a.c(str));
    }
}
