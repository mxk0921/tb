package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class qvo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ImageReader f26957a;
    public VirtualDisplay b;
    public final ThreadPoolExecutor c;
    public int d;
    public boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "ScreenRecorder");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements ImageReader.OnImageAvailableListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f26959a;
        public final /* synthetic */ qvo b;
        public final /* synthetic */ Activity c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ Map<String, String> e;

        public c(boolean z, qvo qvoVar, Activity activity, boolean z2, Map<String, String> map) {
            this.f26959a = z;
            this.b = qvoVar;
            this.c = activity;
            this.d = z2;
            this.e = map;
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public final void onImageAvailable(ImageReader imageReader) {
            int i;
            ByteBuffer byteBuffer;
            int i2;
            int i3;
            Image.Plane plane;
            Image.Plane plane2;
            Image.Plane plane3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a1c131a", new Object[]{this, imageReader});
                return;
            }
            Image acquireLatestImage = imageReader.acquireLatestImage();
            if (acquireLatestImage != null) {
                boolean z = this.f26959a;
                qvo qvoVar = this.b;
                Activity activity = this.c;
                boolean z2 = this.d;
                Map<String, String> map = this.e;
                if (z) {
                    i = 2;
                } else {
                    i = lg4.y3();
                }
                int a2 = qvo.a(qvoVar);
                qvo.d(qvoVar, 1 + a2);
                if (a2 < i) {
                    acquireLatestImage.close();
                    return;
                }
                Image.Plane[] planes = acquireLatestImage.getPlanes();
                if (planes == null || (plane3 = (Image.Plane) ic1.F(planes)) == null) {
                    byteBuffer = null;
                } else {
                    byteBuffer = plane3.getBuffer();
                }
                if (byteBuffer != null && byteBuffer.getInt(byteBuffer.capacity() / 2) == 0) {
                    acquireLatestImage.close();
                    return;
                }
                Image.Plane[] planes2 = acquireLatestImage.getPlanes();
                if (planes2 == null || (plane2 = (Image.Plane) ic1.F(planes2)) == null) {
                    i2 = 0;
                } else {
                    i2 = plane2.getRowStride();
                }
                Image.Plane[] planes3 = acquireLatestImage.getPlanes();
                if (planes3 == null || (plane = (Image.Plane) ic1.F(planes3)) == null) {
                    i3 = 0;
                } else {
                    i3 = plane.getPixelStride();
                }
                if (i3 == 0) {
                    acquireLatestImage.close();
                    return;
                }
                int width = acquireLatestImage.getWidth();
                int height = acquireLatestImage.getHeight();
                if (byteBuffer != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(((i2 - (i3 * width)) / i3) + width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(byteBuffer);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, width, height);
                    ckf.f(createBitmap2, IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
                    qvo.c(qvoVar, createBitmap2, activity, z2, map);
                    acquireLatestImage.close();
                }
                imageReader.setOnImageAvailableListener(null, null);
            }
        }
    }

    static {
        t2o.a(481297369);
    }

    public qvo() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 3000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), a.INSTANCE);
        this.c = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static final /* synthetic */ int a(qvo qvoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5303b1b2", new Object[]{qvoVar})).intValue();
        }
        return qvoVar.d;
    }

    public static final /* synthetic */ boolean b(qvo qvoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("411f25bb", new Object[]{qvoVar})).booleanValue();
        }
        return qvoVar.e;
    }

    public static final /* synthetic */ void c(qvo qvoVar, Bitmap bitmap, Activity activity, boolean z, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d344a62a", new Object[]{qvoVar, bitmap, activity, new Boolean(z), map});
        } else {
            qvoVar.f(bitmap, activity, z, map);
        }
    }

    public static final /* synthetic */ void d(qvo qvoVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a84c630", new Object[]{qvoVar, new Integer(i)});
        } else {
            qvoVar.d = i;
        }
    }

    public static final /* synthetic */ void e(qvo qvoVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87bfe409", new Object[]{qvoVar, new Boolean(z)});
        } else {
            qvoVar.e = z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.etao.feimagesearch.model.PhotoFrom$Values, T] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.LinkedHashMap, T] */
    /* JADX WARN: Type inference failed for: r12v8, types: [com.etao.feimagesearch.model.PhotoFrom$Values, T] */
    public final void f(Bitmap bitmap, Activity activity, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad5d44a", new Object[]{this, bitmap, activity, new Boolean(z), map});
            return;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = map;
        if (map == 0) {
            ref$ObjectRef.element = new LinkedHashMap();
        }
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ref$ObjectRef2.element = PhotoFrom.Values.WIDGET;
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        T t = map == 0 ? 0 : map.get("pssource");
        ref$ObjectRef3.element = t;
        if (TextUtils.isEmpty((CharSequence) t)) {
            ref$ObjectRef3.element = "screen_widget";
            ((Map) ref$ObjectRef.element).put("pssource", "screen_widget");
        } else {
            ref$ObjectRef2.element = PhotoFrom.Values.FLOAT_BAR;
        }
        ((Map) ref$ObjectRef.element).put(dwo.FOREGROUND_KEY, String.valueOf(z));
        ((Map) ref$ObjectRef.element).put(wxi.KEY_FROM_OUTER_APP, String.valueOf(z));
        activity.runOnUiThread(new b(bitmap, ref$ObjectRef3, ref$ObjectRef2, ref$ObjectRef, activity));
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        ImageReader imageReader = this.f26957a;
        if (imageReader != null) {
            imageReader.close();
        }
        VirtualDisplay virtualDisplay = this.b;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        ImageReader imageReader2 = this.f26957a;
        if (imageReader2 != null) {
            imageReader2.setOnImageAvailableListener(null, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Bitmap b;
        public final /* synthetic */ Ref$ObjectRef<String> c;
        public final /* synthetic */ Ref$ObjectRef<PhotoFrom.Values> d;
        public final /* synthetic */ Ref$ObjectRef<Map<String, String>> e;
        public final /* synthetic */ Activity f;

        public b(Bitmap bitmap, Ref$ObjectRef<String> ref$ObjectRef, Ref$ObjectRef<PhotoFrom.Values> ref$ObjectRef2, Ref$ObjectRef<Map<String, String>> ref$ObjectRef3, Activity activity) {
            this.b = bitmap;
            this.c = ref$ObjectRef;
            this.d = ref$ObjectRef2;
            this.e = ref$ObjectRef3;
            this.f = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (qvo.b(qvo.this)) {
                this.b.recycle();
            } else {
                pmf.e0();
                qvo.e(qvo.this, true);
                IrpParamModel irpParamModel = new IrpParamModel(this.c.element);
                irpParamModel.setPhotoFrom(this.d.element);
                irpParamModel.getExtraParams().putAll(this.e.element);
                irpParamModel.updateSessionId();
                a8m.g(this.b, irpParamModel, this.d.element);
                nmj.e(this.f, irpParamModel);
                jzu.e("widgetToIrp", new String[0]);
                this.f.finish();
            }
        }
    }

    public final void h(Activity activity, MediaProjection mediaProjection, int i, int i2, int i3, boolean z, boolean z2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ce2de7f", new Object[]{this, activity, mediaProjection, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Boolean(z2), map});
            return;
        }
        ckf.g(activity, "context");
        ckf.g(map, "pageParams");
        this.d = 0;
        ImageReader newInstance = ImageReader.newInstance(i, i2, 1, 3);
        this.f26957a = newInstance;
        if (newInstance != null) {
            newInstance.setOnImageAvailableListener(new c(z, this, activity, z2, map), null);
        }
        if (mediaProjection != null) {
            ImageReader imageReader = this.f26957a;
            this.b = mediaProjection.createVirtualDisplay("plt-screen", i, i2, i3, 16, imageReader == null ? null : imageReader.getSurface(), null, null);
        }
    }
}
