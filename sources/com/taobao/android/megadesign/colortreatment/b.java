package com.taobao.android.megadesign.colortreatment;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.Log;
import androidx.core.graphics.ColorUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_CALCULATE_NUMBER_COLORS = 16;
    public static final int DEFAULT_RESIZE_BITMAP_AREA = 12544;
    public static final String LOG_TAG = "Palette";
    public static final boolean LOG_TIMINGS = false;

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f8918a;
    public final c b = a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f8919a;
        public Rect b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.megadesign.colortreatment.b$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class AsyncTaskC0464a extends AsyncTask<Bitmap, Void, b> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AbstractC0465b f8920a;

            public AsyncTaskC0464a(AbstractC0465b bVar) {
                this.f8920a = bVar;
            }

            public static /* synthetic */ Object ipc$super(AsyncTaskC0464a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/megadesign/colortreatment/Palette$Builder$1");
            }

            /* renamed from: a */
            public b doInBackground(Bitmap... bitmapArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (b) ipChange.ipc$dispatch("fe0c38fa", new Object[]{this, bitmapArr});
                }
                try {
                    return a.this.b();
                } catch (Throwable th) {
                    Log.e(b.LOG_TAG, "Exception thrown during async generate", th);
                    return null;
                }
            }

            /* renamed from: b */
            public void onPostExecute(b bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cbbd66df", new Object[]{this, bVar});
                } else {
                    this.f8920a.a(bVar);
                }
            }
        }

        public a(Bitmap bitmap) {
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            this.f8919a = bitmap;
        }

        public AsyncTask<Bitmap, Void, b> a(AbstractC0465b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AsyncTask) ipChange.ipc$dispatch("9dd57996", new Object[]{this, bVar});
            }
            if (bVar != null) {
                return new AsyncTaskC0464a(bVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f8919a);
            }
            throw new IllegalArgumentException("listener can not be null");
        }

        public b b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c1032b1c", new Object[]{this});
            }
            Bitmap bitmap = this.f8919a;
            if (bitmap != null) {
                Bitmap d = d(bitmap);
                Rect rect = this.b;
                if (!(d == this.f8919a || rect == null)) {
                    double width = d.getWidth() / this.f8919a.getWidth();
                    rect.left = (int) Math.floor(rect.left * width);
                    rect.top = (int) Math.floor(rect.top * width);
                    rect.right = Math.min((int) Math.ceil(rect.right * width), d.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(rect.bottom * width), d.getHeight());
                }
                com.taobao.android.megadesign.colortreatment.a aVar = new com.taobao.android.megadesign.colortreatment.a(c(d), 16);
                if (d != this.f8919a) {
                    d.recycle();
                }
                return new b(aVar.d());
            }
            throw new IllegalStateException("Either a Bitmap source or list of Swatches must be provided");
        }

        public final int[] c(Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (int[]) ipChange.ipc$dispatch("69dd60b9", new Object[]{this, bitmap});
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.b;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.b.height();
            int[] iArr2 = new int[width2 * height2];
            for (int i = 0; i < height2; i++) {
                Rect rect2 = this.b;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * width2, width2);
            }
            return iArr2;
        }

        public final Bitmap d(Bitmap bitmap) {
            double d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("4dba0cea", new Object[]{this, bitmap});
            }
            int width = bitmap.getWidth() * bitmap.getHeight();
            if (width > 12544) {
                d = Math.sqrt(((double) b.DEFAULT_RESIZE_BITMAP_AREA) / width);
            } else {
                d = -1.0d;
            }
            if (d <= vu3.b.GEO_NOT_SUPPORT) {
                return bitmap;
            }
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
        }

        public a e(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9191f384", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            if (this.f8919a != null) {
                if (this.b == null) {
                    this.b = new Rect();
                }
                this.b.set(0, 0, this.f8919a.getWidth(), this.f8919a.getHeight());
                if (!this.b.intersect(i, i2, i3, i4)) {
                    throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
                }
            }
            return this;
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.megadesign.colortreatment.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface AbstractC0465b {
        void a(b bVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f8921a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public float[] f;

        public c(int i, int i2) {
            this.f8921a = Color.red(i);
            this.b = Color.green(i);
            this.c = Color.blue(i);
            this.d = i;
            this.e = i2;
        }

        public float[] a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (float[]) ipChange.ipc$dispatch("2da7868f", new Object[]{this});
            }
            if (this.f == null) {
                this.f = new float[3];
            }
            ColorUtils.RGBToHSL(this.f8921a, this.b, this.c, this.f);
            return this.f;
        }

        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("599bd63d", new Object[]{this})).intValue();
            }
            return this.e;
        }

        public int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("81914a91", new Object[]{this})).intValue();
            }
            return this.d;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.e == cVar.e && this.d == cVar.d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return (this.d * 31) + this.e;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return c.class.getSimpleName() + " [RGB: #" + Integer.toHexString(c()) + "] [HSL: " + Arrays.toString(a()) + "] [Population: " + this.e + ']';
        }
    }

    public b(List<c> list) {
        this.f8918a = list;
    }

    public static a b(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("cba1d24", new Object[]{bitmap});
        }
        return new a(bitmap);
    }

    public final c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("9e1305a", new Object[]{this});
        }
        int size = this.f8918a.size();
        int i = Integer.MIN_VALUE;
        c cVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            c cVar2 = this.f8918a.get(i2);
            if (cVar2.b() > i) {
                i = cVar2.b();
                cVar = cVar2;
            }
        }
        return cVar;
    }

    public int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("afdd7e82", new Object[]{this, new Integer(i)})).intValue();
        }
        c cVar = this.b;
        if (cVar != null) {
            return cVar.c();
        }
        return i;
    }
}
