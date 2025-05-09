package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gpe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BASE64_TAG = "data:image";
    public static final String BIN_TAG = "binary";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements ImageLoader.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f20143a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ ImageLoader.b c;
        public final /* synthetic */ Rect d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ Object g;

        public a(b bVar, Context context, ImageLoader.b bVar2, Rect rect, int i, int i2, Object obj) {
            this.f20143a = bVar;
            this.b = context;
            this.c = bVar2;
            this.d = rect;
            this.e = i;
            this.f = i2;
            this.g = obj;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoadFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3feabda6", new Object[]{this});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoaded(BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.d
        public void onImageLoadFailed(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd6d6a1d", new Object[]{this, new Integer(i)});
            } else {
                gpe.b(this.f20143a, this.g, null, i);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.d
        public void onImageLoaded(String str, BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72686e27", new Object[]{this, str, bitmapDrawable});
            } else if (bitmapDrawable != null && this.f20143a != null) {
                gpe.b(this.f20143a, this.g, gpe.a(this.b, this.c, bitmapDrawable, this.d, this.e, this.f), 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void a(Object obj, Drawable drawable);

        void b(Object obj, int i);
    }

    static {
        t2o.a(503317408);
    }

    public static /* synthetic */ Drawable a(Context context, ImageLoader.b bVar, Drawable drawable, Rect rect, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("9351774c", new Object[]{context, bVar, drawable, rect, new Integer(i), new Integer(i2)});
        }
        return c(context, bVar, drawable, rect, i, i2);
    }

    public static /* synthetic */ void b(b bVar, Object obj, Drawable drawable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb122c64", new Object[]{bVar, obj, drawable, new Integer(i)});
        } else {
            h(bVar, obj, drawable, i);
        }
    }

    public static Drawable c(Context context, ImageLoader.b bVar, Drawable drawable, Rect rect, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("c41527d8", new Object[]{context, bVar, drawable, rect, new Integer(i), new Integer(i2)});
        }
        if (drawable instanceof dy0) {
            if (bVar == null || !TextUtils.equals(bVar.d, "png")) {
                ((dy0) drawable).start();
            } else {
                ((dy0) drawable).stop();
            }
            return ((dy0) drawable).a();
        } else if (!(drawable instanceof BitmapDrawable)) {
            return drawable;
        } else {
            if (rect == null || i <= 0 || i2 <= 0) {
                return new BitmapDrawable(context.getResources(), ((BitmapDrawable) drawable).getBitmap());
            }
            return h3k.a(context.getResources(), ((BitmapDrawable) drawable).getBitmap(), rect, i, i2);
        }
    }

    public static String d(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51b46287", new Object[]{nVar});
        }
        if (nVar == null || nVar.c0() == null || nVar.c0().r() == null) {
            return null;
        }
        return nVar.c0().r().a();
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d5c6b5", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (str.endsWith(".gif") || str.endsWith(".apng") || str.endsWith("apng.png") || str.endsWith("9.png")) {
            return true;
        }
        return false;
    }

    public static ImageLoader.f f(ImageLoader imageLoader, o oVar, Object obj, int i, int i2, ImageLoader.b bVar, Rect rect, boolean z, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageLoader.f) ipChange.ipc$dispatch("58bc5937", new Object[]{imageLoader, oVar, obj, new Integer(i), new Integer(i2), bVar, rect, new Boolean(z), bVar2});
        }
        return g(imageLoader, oVar, obj, null, i, i2, bVar, rect, z, false, bVar2);
    }

    public static ImageLoader.f g(ImageLoader imageLoader, o oVar, Object obj, String str, int i, int i2, ImageLoader.b bVar, Rect rect, boolean z, boolean z2, b bVar2) {
        Bitmap bitmap;
        b bVar3;
        Drawable drawable;
        String str2;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageLoader.f) ipChange.ipc$dispatch("1d1d1b5", new Object[]{imageLoader, oVar, obj, str, new Integer(i), new Integer(i2), bVar, rect, new Boolean(z), new Boolean(z2), bVar2});
        }
        if (oVar == null) {
            tfs.d("loadImageSrc engine is null");
        }
        Context M = oVar != null ? oVar.M() : null;
        if (M == null) {
            M = o.J();
        }
        if (obj instanceof String) {
            if (TextUtils.isEmpty(str)) {
                String str3 = (String) obj;
                if (rect == null) {
                    z3 = false;
                }
                str2 = i(oVar, M, str3, i, i2, bVar, z | z3);
            } else {
                str2 = str;
            }
            if (str2 == null || !str2.startsWith(BASE64_TAG) || TextUtils.equals(bVar.d, "apng")) {
                return (imageLoader == null ? od0.D().a() : imageLoader).d(new ImageLoader.c(oVar, M, (String) obj, str2, i, i2, bVar, true), z2, new a(bVar2, M, bVar, rect, i, i2, obj));
            }
            Bitmap a2 = s6o.a(str2);
            h(bVar2, obj, a2 != null ? c(M, bVar, new BitmapDrawable(M.getResources(), a2), rect, i, i2) : null, 0);
            return null;
        } else if (obj instanceof byte[]) {
            try {
                bitmap = BitmapFactory.decodeByteArray((byte[]) obj, 0, ((byte[]) obj).length);
            } catch (Exception e) {
                tfs.d(e.getMessage());
                bitmap = null;
            }
            if (bitmap != null) {
                bVar3 = bVar2;
                drawable = c(M, bVar, new BitmapDrawable(M.getResources(), bitmap), rect, i, i2);
            } else {
                bVar3 = bVar2;
                drawable = null;
            }
            h(bVar3, obj, drawable, 0);
            return null;
        } else {
            h(bVar2, obj, null, 0);
            return null;
        }
    }

    public static void h(b bVar, Object obj, Drawable drawable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e025078b", new Object[]{bVar, obj, drawable, new Integer(i)});
        } else if (bVar == null) {
        } else {
            if (drawable != null) {
                bVar.a(obj, drawable);
            } else {
                bVar.b(obj, i);
            }
        }
    }

    public static String i(o oVar, Context context, String str, int i, int i2, ImageLoader.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe9a26c2", new Object[]{oVar, context, str, new Integer(i), new Integer(i2), bVar, new Boolean(z)});
        }
        if (str == null) {
            return str;
        }
        if (str.startsWith("./")) {
            return nwv.w(context, str, true);
        }
        if (str.startsWith(BASE64_TAG)) {
            return str;
        }
        if (((!e(str) && !z) || nwv.b0()) && i > 0 && i2 > 0) {
            return od0.D().a().b(str, i, i2, bVar);
        }
        return str;
    }
}
