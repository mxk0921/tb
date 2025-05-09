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
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.Locale;
import tb.e1o;
import tb.hdh;
import tb.hs9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class UnicornImageView extends View implements e1o {
    private static final String TAG = "UnicornImageView";
    private Bitmap currentBitmap;
    private Image currentImage;
    private boolean detachRenderSetNonAlpha;
    private Runnable firstFrameRunable;
    private hs9 flutterRenderer;
    private ImageReader.OnImageAvailableListener imageAvailableListener;
    private ImageReader imageReader;
    private boolean isAttachedToFlutterRenderer;
    private boolean surfaceHasContent;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements ImageReader.OnImageAvailableListener {
        public a() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            UnicornImageView unicornImageView = UnicornImageView.this;
            unicornImageView.surfaceHasContent = true;
            if (unicornImageView.firstFrameRunable != null) {
                unicornImageView.post(unicornImageView.firstFrameRunable);
                unicornImageView.firstFrameRunable = null;
            }
            unicornImageView.acquireLatestImage();
        }
    }

    static {
        t2o.a(945815646);
        t2o.a(945815718);
    }

    public UnicornImageView(Context context, int i, int i2) {
        this(context, createImageReader(i, i2));
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
        ImageReader imageReader = this.imageReader;
        if (imageReader != null) {
            hs9Var.t(imageReader.getSurface());
            setAlpha(1.0f);
        }
        this.flutterRenderer = hs9Var;
        this.isAttachedToFlutterRenderer = true;
    }

    public void closeImageReader() {
        ImageReader imageReader = this.imageReader;
        if (imageReader != null) {
            imageReader.close();
            this.imageReader = null;
        }
    }

    public void destroy() {
        this.currentBitmap = null;
        closeCurrentImage();
        closeImageReader();
    }

    @Override // tb.e1o
    public void detachFromRenderer() {
        if (this.isAttachedToFlutterRenderer) {
            hs9 hs9Var = this.flutterRenderer;
            if (hs9Var != null) {
                hs9Var.v();
            }
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

    public boolean hasContent() {
        return this.surfaceHasContent;
    }

    @Override // tb.e1o
    public void invalid() {
        detachFromRenderer();
        closeImageReader();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.currentImage != null) {
            updateCurrentBitmap();
        }
        Bitmap bitmap = this.currentBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        ImageReader imageReader = this.imageReader;
        if ((imageReader != null && i == imageReader.getWidth() && i2 == this.imageReader.getHeight()) || !this.isAttachedToFlutterRenderer) {
            return;
        }
        if (this.imageReader != null) {
            resizeIfNeeded(i, i2);
            return;
        }
        ImageReader createImageReader = createImageReader(i, i2);
        this.imageReader = createImageReader;
        createImageReader.setOnImageAvailableListener(this.imageAvailableListener, null);
        this.flutterRenderer.t(this.imageReader.getSurface());
        setAlpha(1.0f);
    }

    public void resizeIfNeeded(int i, int i2) {
        if (this.flutterRenderer != null) {
            ImageReader imageReader = this.imageReader;
            if (imageReader == null || i != imageReader.getWidth() || i2 != this.imageReader.getHeight()) {
                if (this.isAttachedToFlutterRenderer) {
                    this.flutterRenderer.v();
                }
                closeCurrentImage();
                this.currentBitmap = null;
                closeImageReader();
                ImageReader createImageReader = createImageReader(i, i2);
                this.imageReader = createImageReader;
                if (this.isAttachedToFlutterRenderer) {
                    createImageReader.setOnImageAvailableListener(this.imageAvailableListener, null);
                    this.flutterRenderer.t(this.imageReader.getSurface());
                }
            }
        }
    }

    public void setFirstFrameRunable(Runnable runnable) {
        this.firstFrameRunable = runnable;
    }

    public void startRendering(int i, int i2) {
        if (this.isAttachedToFlutterRenderer) {
            ImageReader imageReader = this.imageReader;
            if (imageReader == null) {
                ImageReader createImageReader = createImageReader(i, i2);
                this.imageReader = createImageReader;
                createImageReader.setOnImageAvailableListener(this.imageAvailableListener, null);
                this.flutterRenderer.t(this.imageReader.getSurface());
            } else if (i == imageReader.getWidth() && i2 == this.imageReader.getHeight()) {
                this.imageReader.setOnImageAvailableListener(this.imageAvailableListener, null);
                this.flutterRenderer.t(this.imageReader.getSurface());
            } else {
                resizeIfNeeded(i, i2);
            }
        }
    }

    public void stopRendering() {
        if (this.isAttachedToFlutterRenderer) {
            hs9 hs9Var = this.flutterRenderer;
            if (hs9Var != null) {
                hs9Var.v();
            }
            ImageReader imageReader = this.imageReader;
            if (imageReader != null) {
                imageReader.setOnImageAvailableListener(null, null);
                if (Build.VERSION.SDK_INT >= 29) {
                    if (acquireLatestImage() && this.currentImage != null) {
                        updateCurrentBitmap();
                    }
                    this.imageReader.discardFreeBuffers();
                }
            }
        }
    }

    @Override // tb.e1o
    public void valid() {
        if (this.flutterRenderer != null) {
            if (this.imageReader == null) {
                ImageReader createImageReader = createImageReader(getWidth(), getHeight());
                this.imageReader = createImageReader;
                createImageReader.setOnImageAvailableListener(this.imageAvailableListener, null);
            }
            attachToRenderer(this.flutterRenderer);
        }
    }

    public UnicornImageView(Context context) {
        super(context, null);
        this.detachRenderSetNonAlpha = false;
        this.isAttachedToFlutterRenderer = false;
        this.imageAvailableListener = new a();
        init();
    }

    public UnicornImageView(Context context, ImageReader imageReader) {
        super(context, null);
        this.detachRenderSetNonAlpha = false;
        this.isAttachedToFlutterRenderer = false;
        this.imageAvailableListener = new a();
        this.imageReader = imageReader;
        init();
    }

    @Override // tb.e1o
    public void pause() {
    }
}
