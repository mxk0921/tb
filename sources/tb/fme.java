package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class fme {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Context c;
        private final String d;
        private final int e;
        private final b f;
        public boolean g;

        /* compiled from: Taobao */
        /* renamed from: tb.fme$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class C0928a extends zio {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ Bitmap c;
            public final /* synthetic */ long d;

            public C0928a(Bitmap bitmap, long j) {
                this.c = bitmap;
                this.d = j;
            }

            public static /* synthetic */ Object ipc$super(C0928a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/util/ImageLoader$LoadAlbumSingleImageTask$1");
            }

            @Override // tb.zio
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                } else {
                    a.e(a.this, this.c, this.d);
                }
            }
        }

        static {
            t2o.a(481297606);
        }

        public a(Context context, String str, int i, b bVar, boolean z) {
            this.c = context;
            this.d = str;
            this.e = i;
            this.f = bVar;
            this.g = z;
        }

        public static /* synthetic */ void e(a aVar, Bitmap bitmap, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a22d26b9", new Object[]{aVar, bitmap, new Long(j)});
            } else {
                aVar.f(bitmap, j);
            }
        }

        private void f(Bitmap bitmap, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a38e40", new Object[]{this, bitmap, new Long(j)});
            } else if (bitmap == null) {
                agh.r("PltCameraPai", "ImageLoader", "load image failed " + this.d);
                this.f.onFail("10000", "load image failed");
            } else {
                this.f.a(bitmap, j);
            }
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/util/ImageLoader$LoadAlbumSingleImageTask");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            Bitmap a2 = fme.a(this.c, this.d, this.e);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (this.g) {
                vpt.g("onLoadSingleAlbumFinish", new C0928a(a2, currentTimeMillis2));
            } else {
                f(a2, currentTimeMillis2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface b {
        void a(Bitmap bitmap, long j);

        void onFail(String str, String str2);
    }

    static {
        t2o.a(481297605);
    }

    public static Bitmap a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("806c55ab", new Object[]{context, str, new Integer(i)});
        }
        return b(context, str, i);
    }

    public static Bitmap b(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("e3c1d2a2", new Object[]{context, str, new Integer(i)});
        }
        try {
            return gd2.g(Uri.parse(str), 1024, 1, i);
        } catch (Exception unused) {
            return null;
        }
    }
}
