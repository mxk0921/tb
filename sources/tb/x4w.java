package tb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.deprecated.message.module.proxy.ShortVideoWeexV2ModuleProxy;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class x4w {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final x4w INSTANCE = new x4w();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements PixelCopy.OnPixelCopyFinishedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f31147a;
        public final /* synthetic */ Bitmap b;
        public final /* synthetic */ SurfaceView c;

        public b(a aVar, Bitmap bitmap, SurfaceView surfaceView) {
            this.f31147a = aVar;
            this.b = bitmap;
            this.c = surfaceView;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public final void onPixelCopyFinished(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e30dbf8e", new Object[]{this, new Integer(i)});
                return;
            }
            ir9.b("VideoBitmapUtils", "onPixelCopyFinished, copyResult=" + i);
            ((ShortVideoWeexV2ModuleProxy.a) this.f31147a).a(this.b, this.c);
        }
    }

    static {
        t2o.a(468714556);
    }

    public final SurfaceView a(ViewGroup viewGroup) {
        SurfaceView a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceView) ipChange.ipc$dispatch("22e6c51e", new Object[]{this, viewGroup});
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ir9.b("VideoBitmapUtils", "child= " + childAt);
            if (childAt instanceof SurfaceView) {
                return (SurfaceView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (a2 = a((ViewGroup) childAt)) != null) {
                return a2;
            }
        }
        return null;
    }

    public final View b(ViewParent viewParent) {
        ViewGroup viewGroup;
        int id;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8c30dc97", new Object[]{this, viewParent});
        }
        if (viewParent == null) {
            return null;
        }
        if (!(viewParent instanceof ViewGroup) || ((id = (viewGroup = (ViewGroup) viewParent).getId()) != R.id.carditem_root_host && id != 16908290)) {
            return b(viewParent.getParent());
        }
        return viewGroup.findViewById(R.id.video_host);
    }

    public final Bitmap c(TextureView textureView) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("2538420f", new Object[]{this, textureView});
        }
        if (textureView == null || (context = textureView.getContext()) == null) {
            return null;
        }
        Resources resources = context.getResources();
        ckf.f(resources, "uiContext.resources");
        int i = resources.getDisplayMetrics().widthPixels;
        if (textureView.getWidth() >= i) {
            Bitmap bitmap = textureView.getBitmap(i, textureView.getHeight());
            ckf.f(bitmap, "textureView.getBitmap(de…idth, textureView.height)");
            return bitmap;
        }
        Bitmap bitmap2 = textureView.getBitmap();
        ckf.f(bitmap2, "textureView.bitmap");
        return bitmap2;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bcf9854", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    public final void e(ViewGroup viewGroup, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3c851e", new Object[]{this, viewGroup, aVar});
            return;
        }
        ckf.g(aVar, "callback");
        if (viewGroup == null) {
            ((ShortVideoWeexV2ModuleProxy.a) aVar).a(null, null);
            return;
        }
        TextureView a2 = z74.a(viewGroup);
        ir9.b("VideoBitmapUtils", "requestCopyBitmap, textureView=" + a2);
        if (a2 != null) {
            ((ShortVideoWeexV2ModuleProxy.a) aVar).a(c(a2), a2);
            return;
        }
        SurfaceView a3 = a(viewGroup);
        StringBuilder sb = new StringBuilder("onPixelCopyFinished, surfaceView=");
        sb.append(a3);
        sb.append("; sdkversion=");
        int i = Build.VERSION.SDK_INT;
        sb.append(i);
        ir9.b("VideoBitmapUtils", sb.toString());
        if (a3 == null || a3.getWidth() <= 0 || a3.getHeight() <= 0 || i < 24) {
            ((ShortVideoWeexV2ModuleProxy.a) aVar).a(null, null);
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(a3.getWidth(), a3.getHeight(), Bitmap.Config.ARGB_8888);
        PixelCopy.request(a3, createBitmap, dgy.a(new b(aVar, createBitmap, a3)), new Handler(Looper.getMainLooper()));
    }
}
