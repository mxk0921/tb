package tb;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import tb.nf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tlu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ImageReader b;
    public final Surface c;
    public nf.a d;
    public Handler f;
    public d i;
    public boolean g = false;
    public final Lock h = new ReentrantLock();

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f28790a = Collections.synchronizedList(new ArrayList());
    public final List<c> e = Collections.synchronizedList(new ArrayList());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements ImageReader.OnImageAvailableListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image image;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a1c131a", new Object[]{this, imageReader});
                return;
            }
            tlu.a(tlu.this).lock();
            if (!tlu.b(tlu.this)) {
                try {
                    image = imageReader.acquireNextImage();
                } catch (Exception e) {
                    e.printStackTrace();
                    image = null;
                }
                if (image == null) {
                    tlu.a(tlu.this).unlock();
                    return;
                }
                Image.Plane[] planes = image.getPlanes();
                int width = image.getWidth();
                int height = image.getHeight();
                int pixelStride = planes[0].getPixelStride();
                int rowStride = planes[0].getRowStride();
                int i = pixelStride * width;
                byte[] c = tlu.c(tlu.this, i * height);
                ByteBuffer buffer = planes[0].getBuffer();
                for (int i2 = 0; i2 < height; i2++) {
                    try {
                        try {
                            try {
                                buffer.position(i2 * rowStride);
                                buffer.get(c, i2 * width * pixelStride, i);
                            } catch (Throwable th) {
                                image.close();
                                buffer.clear();
                                throw th;
                            }
                        } catch (IllegalStateException e2) {
                            e2.printStackTrace();
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                tlu.d(tlu.this).add(new c(c, width, height, 1));
                image.close();
                buffer.clear();
                if (tlu.e(tlu.this) != null) {
                    tlu.e(tlu.this).onImageArrive();
                }
            }
            tlu.a(tlu.this).unlock();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            while (tlu.f(tlu.this) != null) {
                if (tlu.d(tlu.this).isEmpty()) {
                    SystemClock.sleep(10L);
                } else {
                    c cVar = (c) tlu.d(tlu.this).remove(0);
                    byte[] bArr = cVar.f28793a;
                    if (tlu.e(tlu.this) != null) {
                        tlu.e(tlu.this).onRawData(bArr, cVar.b, cVar.c, cVar.d);
                    }
                    tlu.g(tlu.this).add(bArr);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f28793a;
        public final int b;
        public final int c;
        public final int d;

        static {
            t2o.a(395313683);
        }

        public c(byte[] bArr, int i, int i2, int i3) {
            this.f28793a = bArr;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface d {
        void onImageArrive();

        void onRawData(byte[] bArr, int i, int i2, int i3);
    }

    static {
        t2o.a(395313680);
    }

    public tlu(int i, int i2, d dVar, Handler handler) {
        this.f = handler;
        this.i = dVar;
        this.b = ImageReader.newInstance(i, i2, 1, 20);
        this.c = this.b.getSurface();
        this.b.setOnImageAvailableListener(new a(), handler);
        nf.a aVar = new nf.a("trtc-encoder-thread");
        this.d = aVar;
        aVar.c(new b());
    }

    public static /* synthetic */ Lock a(tlu tluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Lock) ipChange.ipc$dispatch("219b44e4", new Object[]{tluVar});
        }
        return tluVar.h;
    }

    public static /* synthetic */ boolean b(tlu tluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6f56900", new Object[]{tluVar})).booleanValue();
        }
        return tluVar.g;
    }

    public static /* synthetic */ byte[] c(tlu tluVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d25a295", new Object[]{tluVar, new Integer(i)});
        }
        return tluVar.h(i);
    }

    public static /* synthetic */ List d(tlu tluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fa28c1cd", new Object[]{tluVar});
        }
        return tluVar.e;
    }

    public static /* synthetic */ d e(tlu tluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("98b3550f", new Object[]{tluVar});
        }
        return tluVar.i;
    }

    public static /* synthetic */ ImageReader f(tlu tluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageReader) ipChange.ipc$dispatch("75926df6", new Object[]{tluVar});
        }
        return tluVar.b;
    }

    public static /* synthetic */ List g(tlu tluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e36729d0", new Object[]{tluVar});
        }
        return tluVar.f28790a;
    }

    public final byte[] h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a33263b7", new Object[]{this, new Integer(i)});
        }
        if (this.f28790a.isEmpty()) {
            return new byte[i];
        }
        return this.f28790a.remove(0);
    }

    public Surface i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Surface) ipChange.ipc$dispatch("344b7a2", new Object[]{this});
        }
        return this.c;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        try {
            ((ReentrantLock) this.h).lock();
            this.g = true;
            ImageReader imageReader = this.b;
            if (imageReader != null) {
                imageReader.setOnImageAvailableListener(null, this.f);
                this.b.close();
                this.b = null;
            }
            ((ReentrantLock) this.h).unlock();
            this.d.d(0L);
            this.d = null;
            this.e.clear();
            this.f28790a.clear();
            this.f = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void k(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5db17f0", new Object[]{this, dVar});
        } else {
            this.i = dVar;
        }
    }
}
