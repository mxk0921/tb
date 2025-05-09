package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class l3o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a extends l3o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23095a;
        public final /* synthetic */ byte[] b;

        public a(String str, byte[] bArr) {
            this.f23095a = str;
            this.b = bArr;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/network/domain/RequestBody$1");
        }

        @Override // tb.l3o
        public long contentLength() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("905069ba", new Object[]{this})).longValue();
            }
            return this.b.length;
        }

        @Override // tb.l3o
        public String contentType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f41a3d86", new Object[]{this});
            }
            return this.f23095a;
        }

        @Override // tb.l3o
        public void writeTo(OutputStream outputStream) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90fbe573", new Object[]{this, outputStream});
            } else {
                outputStream.write(this.b);
            }
        }
    }

    static {
        t2o.a(589300031);
    }

    public static l3o create(String str, byte[] bArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l3o) ipChange.ipc$dispatch("f9a1884d", new Object[]{str, bArr});
        }
        if (bArr != null) {
            return new a(str, bArr);
        }
        throw new NullPointerException("content == null");
    }

    public long contentLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("905069ba", new Object[]{this})).longValue();
        }
        return -1L;
    }

    public abstract String contentType();

    public abstract void writeTo(OutputStream outputStream) throws IOException;
}
