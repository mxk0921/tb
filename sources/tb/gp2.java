package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class gp2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Object c = new Object();
        public static a d;
        public static int e;

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f20141a = new byte[4096];
        public a b;

        static {
            t2o.a(374341748);
        }

        public static a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f966c375", new Object[0]);
            }
            synchronized (c) {
                try {
                    a aVar = d;
                    if (aVar == null) {
                        return new a();
                    }
                    d = aVar.b;
                    aVar.b = null;
                    e--;
                    return aVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51af759a", new Object[]{this});
                return;
            }
            synchronized (c) {
                try {
                    if (e < 2) {
                        c();
                        e++;
                        a aVar = d;
                        if (aVar != null) {
                            this.b = aVar;
                        }
                        d = this;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(374341746);
    }

    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad89413d", new Object[]{inputStream, outputStream})).longValue();
        }
        cpm.a(inputStream);
        cpm.a(outputStream);
        a a2 = a.a();
        try {
            byte[] bArr = a2.f20141a;
            long j = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return j;
                }
                outputStream.write(bArr, 0, read);
                j += read;
            }
        } finally {
            a2.b();
        }
    }
}
