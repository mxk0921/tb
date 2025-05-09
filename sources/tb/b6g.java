package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b6g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Date f16207a;
    public final List<z5g> b;

    static {
        t2o.a(407896089);
    }

    public b6g(Date date, List<z5g> list) {
        this.f16207a = date;
        this.b = list;
    }

    public void a(OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11ce8258", new Object[]{this, outputStream});
            return;
        }
        x5g x5gVar = new x5g(outputStream);
        try {
            Charset charset = StandardCharsets.UTF_8;
            x5gVar.write("fast_kv".getBytes(charset));
            x5gVar.write(0);
            x5gVar.write("0.0.1".getBytes(charset));
            x5gVar.write(0);
            long time = this.f16207a.getTime();
            x5gVar.c((int) (time >> 32));
            x5gVar.c((int) time);
            for (z5g z5gVar : this.b) {
                z5gVar.a(x5gVar);
            }
            x5gVar.flush();
            x5gVar.close();
        } finally {
            try {
                throw th;
            } catch (Throwable th) {
            }
        }
    }
}
