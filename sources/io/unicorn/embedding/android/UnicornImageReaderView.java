package io.unicorn.embedding.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.Locale;
import tb.e1o;
import tb.hdh;
import tb.hs9;
import tb.t2o;
import tb.w4x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class UnicornImageReaderView extends View implements e1o {
    private static final String TAG = "FlutterImageView";
    private Bitmap currentBitmap;
    private Image currentImage;
    private boolean enableSkipSoftware;
    private hs9 flutterRenderer;
    private ImageReader imageReader;
    private boolean isAttachedToFlutterRenderer;
    private SurfaceKind kind;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum SurfaceKind {
        background,
        overlay
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15170a;

        static {
            int[] iArr = new int[SurfaceKind.values().length];
            f15170a = iArr;
            try {
                iArr[SurfaceKind.background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15170a[SurfaceKind.overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        t2o.a(945815643);
        t2o.a(945815718);
    }

    public UnicornImageReaderView(Context context, int i, int i2, SurfaceKind surfaceKind) {
        this(context, createImageReader(i, i2), surfaceKind);
    }

    private void closeCurrentImage() {
        Image image = this.currentImage;
        if (image != null) {
            image.close();
            this.currentImage = null;
        }
    }

    private static ImageReader createImageReader(int i, int i2) {
        int i3;
        int i4;
        ImageReader newInstance;
        if (i <= 0) {
            logW("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i));
            i3 = 1;
        } else {
            i3 = i;
        }
        if (i2 <= 0) {
            logW("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i2));
            i4 = 1;
        } else {
            i4 = i2;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return ImageReader.newInstance(i3, i4, 1, 3);
        }
        newInstance = ImageReader.newInstance(i3, i4, 1, 3, 768L);
        return newInstance;
    }

    private void init() {
        setAlpha(0.0f);
        this.enableSkipSoftware = w4x.s("enable-skip-software", true, true);
    }

    private static void logW(String str, Object... objArr) {
        hdh.f(TAG, String.format(Locale.US, str, objArr));
    }

    private void updateCurrentBitmap() {
        HardwareBuffer hardwareBuffer;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap wrapHardwareBuffer;
        if (Build.VERSION.SDK_INT >= 29) {
            hardwareBuffer = this.currentImage.getHardwareBuffer();
            named = ColorSpace.Named.SRGB;
            colorSpace = ColorSpace.get(named);
            wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
            this.currentBitmap = wrapHardwareBuffer;
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.currentImage.getPlanes();
        if (planes.length == 1) {
            Image.Plane plane = planes[0];
            int rowStride = plane.getRowStride() / plane.getPixelStride();
            int height = this.currentImage.getHeight();
            Bitmap bitmap = this.currentBitmap;
            if (!(bitmap != null && bitmap.getWidth() == rowStride && this.currentBitmap.getHeight() == height)) {
                this.currentBitmap = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
            }
            ByteBuffer buffer = plane.getBuffer();
            buffer.rewind();
            this.currentBitmap.copyPixelsFromBuffer(buffer);
        }
    }

    public boolean acquireLatestImage() {
        ImageReader imageReader;
        if (!this.isAttachedToFlutterRenderer || (imageReader = this.imageReader) == null) {
            return false;
        }
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            closeCurrentImage();
            this.currentImage = acquireLatestImage;
            invalidate();
        }
        if (acquireLatestImage != null) {
            return true;
        }
        return false;
    }

    @Override // tb.e1o
    public void attachToRenderer(hs9 hs9Var) {
        if (this.imageReader != null) {
            if (a.f15170a[this.kind.ordinal()] == 1) {
                hs9Var.x(this.imageReader.getSurface());
            }
            setAlpha(1.0f);
            this.flutterRenderer = hs9Var;
            this.isAttachedToFlutterRenderer = true;
        }
    }

    public void closeImageReader() {
        ImageReader imageReader = this.imageReader;
        if (imageReader != null) {
            imageReader.close();
            this.imageReader = null;
        }
    }

    @Override // tb.e1o
    public void detachFromRenderer() {
        if (this.isAttachedToFlutterRenderer) {
            setAlpha(0.0f);
            acquireLatestImage();
            this.currentBitmap = null;
            closeCurrentImage();
            invalidate();
            this.isAttachedToFlutterRenderer = false;
        }
    }

    @Override // tb.e1o
    public hs9 getAttachedRenderer() {
        return this.flutterRenderer;
    }

    public ImageReader getImageReader() {
        return this.imageReader;
    }

    public Surface getSurface() {
        return this.imageReader.getSurface();
    }

    @Override // tb.e1o
    public void invalid() {
        detachFromRenderer();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.enableSkipSoftware || Build.VERSION.SDK_INT < 29 || canvas.isHardwareAccelerated()) {
            if (this.currentImage != null) {
                updateCurrentBitmap();
            }
            Bitmap bitmap = this.currentBitmap;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        ImageReader imageReader = this.imageReader;
        if (imageReader != null) {
            if (!(i == imageReader.getWidth() && i2 == this.imageReader.getHeight()) && this.kind == SurfaceKind.background && this.isAttachedToFlutterRenderer) {
                resizeIfNeeded(i, i2);
                this.flutterRenderer.x(this.imageReader.getSurface());
            }
        }
    }

    public void resizeIfNeeded(int i, int i2) {
        ImageReader imageReader;
        if (this.flutterRenderer != null && (imageReader = this.imageReader) != null) {
            if (i != imageReader.getWidth() || i2 != this.imageReader.getHeight()) {
                closeCurrentImage();
                closeImageReader();
                this.imageReader = createImageReader(i, i2);
            }
        }
    }

    @Override // tb.e1o
    public void valid() {
        hs9 hs9Var = this.flutterRenderer;
        if (hs9Var != null) {
            attachToRenderer(hs9Var);
        }
    }

    public UnicornImageReaderView(Context context) {
        this(context, 1, 1, SurfaceKind.background);
    }

    public UnicornImageReaderView(Context context, AttributeSet attributeSet) {
        this(context, 1, 1, SurfaceKind.background);
    }

    public UnicornImageReaderView(Context context, ImageReader imageReader, SurfaceKind surfaceKind) {
        super(context, null);
        this.isAttachedToFlutterRenderer = false;
        this.enableSkipSoftware = false;
        this.imageReader = imageReader;
        this.kind = surfaceKind;
        init();
    }

    @Override // tb.e1o
    public void pause() {
    }
}
