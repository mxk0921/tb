package io.unicorn.plugin.image;

import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.Map;
import java.util.Vector;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface ExternalAdapterImageProvider {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface AnimatedBitmap {
        Bitmap getBufferBitmap();

        double getDuration();

        int getFrameCount();

        void pause();

        void resume();

        void start();

        void stop();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface Request {
        void cancel();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface Response {
        void finish(Image image);
    }

    void dispatchAsyncThread(long j);

    void log(String str);

    Request request(String str, int i, int i2, Map<String, String> map, Map<String, String> map2, Response response);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class Image {
        private final AnimatedBitmap animatedBitmap;
        private final Vector<Bitmap> bitmaps;
        private int cacheType;
        private final double duration;
        private final int frameCount;
        private final boolean isAnimatedEnd;
        private final boolean isSingleBitmapAnimated;

        static {
            t2o.a(945815786);
        }

        public Image(Bitmap bitmap) {
            Vector<Bitmap> vector = new Vector<>();
            this.bitmaps = vector;
            vector.add(bitmap);
            this.duration = vu3.b.GEO_NOT_SUPPORT;
            this.frameCount = 1;
            this.isSingleBitmapAnimated = false;
            this.animatedBitmap = null;
            this.isAnimatedEnd = false;
            this.cacheType = 0;
        }

        public Bitmap getBitmap() {
            if (this.bitmaps.size() > 0) {
                return this.bitmaps.firstElement();
            }
            return null;
        }

        public int getBitmapCount() {
            return this.bitmaps.size();
        }

        public Bitmap[] getBitmaps() {
            Object[] array = this.bitmaps.toArray();
            return (Bitmap[]) Arrays.copyOf(array, array.length, Bitmap[].class);
        }

        public int getCacheType() {
            return this.cacheType;
        }

        public double getDuration() {
            return this.duration;
        }

        public int getFrameCount() {
            return this.frameCount;
        }

        public boolean isAnimatedEnd() {
            return this.isAnimatedEnd;
        }

        public boolean isMultiframe() {
            if (this.frameCount > 1) {
                return true;
            }
            return false;
        }

        public boolean isSingleBitmapAnimated() {
            return this.isSingleBitmapAnimated;
        }

        public void pause() {
            AnimatedBitmap animatedBitmap = this.animatedBitmap;
            if (animatedBitmap != null) {
                animatedBitmap.pause();
            }
        }

        public void resume() {
            AnimatedBitmap animatedBitmap = this.animatedBitmap;
            if (animatedBitmap != null) {
                animatedBitmap.resume();
            }
        }

        public void setCacheType(int i) {
            this.cacheType = i;
        }

        public void start() {
            AnimatedBitmap animatedBitmap = this.animatedBitmap;
            if (animatedBitmap != null) {
                animatedBitmap.start();
            }
        }

        public void stop() {
            AnimatedBitmap animatedBitmap = this.animatedBitmap;
            if (animatedBitmap != null) {
                animatedBitmap.stop();
            }
        }

        public Bitmap getBitmap(int i) {
            if (i < this.bitmaps.size()) {
                return this.bitmaps.elementAt(i);
            }
            return null;
        }

        public Image(Bitmap bitmap, boolean z) {
            Vector<Bitmap> vector = new Vector<>();
            this.bitmaps = vector;
            vector.add(bitmap);
            this.duration = vu3.b.GEO_NOT_SUPPORT;
            this.frameCount = 1;
            this.isSingleBitmapAnimated = false;
            this.animatedBitmap = null;
            this.isAnimatedEnd = z;
            this.cacheType = 0;
        }

        public Image(Vector<Bitmap> vector, double d) {
            this.bitmaps = vector;
            this.duration = d < vu3.b.GEO_NOT_SUPPORT ? 1.0d : d;
            this.frameCount = vector.size();
            this.isSingleBitmapAnimated = false;
            this.animatedBitmap = null;
            this.isAnimatedEnd = false;
            this.cacheType = 0;
        }

        public Image(AnimatedBitmap animatedBitmap) {
            Vector<Bitmap> vector = new Vector<>();
            this.bitmaps = vector;
            vector.add(animatedBitmap.getBufferBitmap());
            this.duration = animatedBitmap.getDuration();
            this.frameCount = animatedBitmap.getFrameCount();
            this.isSingleBitmapAnimated = true;
            this.animatedBitmap = animatedBitmap;
            this.isAnimatedEnd = false;
            this.cacheType = 0;
        }
    }
}
