package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.decoder.WebPDecoder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ate {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f15989a;
    public final a b;
    public long c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
    }

    static {
        t2o.a(618659876);
    }

    public ate(Bitmap bitmap, long j, a aVar) {
        this.f15989a = bitmap;
        this.c = j;
        this.b = aVar;
    }

    public Bitmap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("8f910da", new Object[]{this});
        }
        return this.f15989a;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9acbfd1a", new Object[]{this})).longValue();
        }
        return this.c;
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        long j = this.c;
        if (j != 0) {
            ((WebPDecoder.b) this.b).a(j);
            this.c = 0L;
        }
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        try {
            c();
            super.finalize();
        } catch (Throwable unused) {
        }
    }
}
