package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class njx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements mjx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ InputStream f24781a;

        public a(InputStream inputStream) {
            this.f24781a = inputStream;
        }

        @Override // tb.mjx
        public OutputStream a(OutputStream outputStream) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OutputStream) ipChange.ipc$dispatch("e48a6df0", new Object[]{this, outputStream});
            }
            gp2.a(this.f24781a, outputStream);
            return outputStream;
        }
    }

    static {
        t2o.a(374341707);
    }

    public static mjx a(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mjx) ipChange.ipc$dispatch("8b1197a0", new Object[]{inputStream});
        }
        return new a(inputStream);
    }
}
