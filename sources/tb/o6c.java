package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class o6c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void a(byte[] bArr);

        void onFailed(String str);
    }

    static {
        t2o.a(503316586);
    }

    public byte[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("4d1e2e28", new Object[]{this, str});
        }
        return null;
    }

    public abstract void b(String str, a aVar);

    public void c(String str, boolean z, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("383703e0", new Object[]{this, str, new Boolean(z), aVar});
        }
    }
}
