package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class dg9 {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601421);
        }

        public a() {
        }

        public final byte[] a(InputStream inputStream) {
            tpu.a aVar;
            StringBuilder sb;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("b2c68415", new Object[]{this, inputStream});
            }
            byte[] bArr = null;
            if (inputStream == null) {
                return null;
            }
            try {
                try {
                    bArr = new byte[inputStream.available()];
                    inputStream.read(bArr);
                } catch (IOException e) {
                    tpu.a aVar2 = tpu.Companion;
                    tpu.a.b(aVar2, cg9.TAG, "loadInputStream: " + e.getMessage(), null, 4, null);
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        e = e2;
                        aVar = tpu.Companion;
                        sb = new StringBuilder("loadInputStream: ");
                        sb.append(e.getMessage());
                        tpu.a.b(aVar, cg9.TAG, sb.toString(), null, 4, null);
                        return bArr;
                    }
                }
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    e = e3;
                    aVar = tpu.Companion;
                    sb = new StringBuilder("loadInputStream: ");
                    sb.append(e.getMessage());
                    tpu.a.b(aVar, cg9.TAG, sb.toString(), null, 4, null);
                    return bArr;
                }
                return bArr;
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    tpu.a aVar3 = tpu.Companion;
                    tpu.a.b(aVar3, cg9.TAG, "loadInputStream: " + e4.getMessage(), null, 4, null);
                }
                throw th;
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601420);
    }
}
