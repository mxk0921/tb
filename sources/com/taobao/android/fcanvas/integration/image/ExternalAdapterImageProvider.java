package com.taobao.android.fcanvas.integration.image;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.Map;
import java.util.Vector;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface ExternalAdapterImageProvider {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        Bitmap getBufferBitmap();

        double getDuration();

        int getFrameCount();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void cancel();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
    }

    b request(String str, int i, int i2, Map<String, String> map, Map<String, String> map2, c cVar);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class Image {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final a animatedBitmap;
        private final Vector<Bitmap> bitmaps;
        private final double duration;
        private final int frameCount;
        private final boolean isSingleBitmapAnimated;

        static {
            t2o.a(945815599);
        }

        public Image(Bitmap bitmap) {
            Vector<Bitmap> vector = new Vector<>();
            this.bitmaps = vector;
            vector.add(bitmap);
            this.duration = vu3.b.GEO_NOT_SUPPORT;
            this.frameCount = 1;
            this.isSingleBitmapAnimated = false;
        }

        public Bitmap getBitmap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("c5e4890a", new Object[]{this});
            }
            if (this.bitmaps.size() > 0) {
                return this.bitmaps.firstElement();
            }
            return null;
        }

        public int getBitmapCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5b159b64", new Object[]{this})).intValue();
            }
            return this.bitmaps.size();
        }

        public Bitmap[] getBitmaps() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap[]) ipChange.ipc$dispatch("1b91bbfa", new Object[]{this});
            }
            Object[] array = this.bitmaps.toArray();
            return (Bitmap[]) Arrays.copyOf(array, array.length, Bitmap[].class);
        }

        public double getDuration() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ed837a7f", new Object[]{this})).doubleValue();
            }
            return this.duration;
        }

        public int getFrameCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9bea4412", new Object[]{this})).intValue();
            }
            return this.frameCount;
        }

        public boolean isMultiframe() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dd1a3229", new Object[]{this})).booleanValue();
            }
            if (this.frameCount > 1) {
                return true;
            }
            return false;
        }

        public boolean isSingleBitmapAnimated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("748fad2f", new Object[]{this})).booleanValue();
            }
            return this.isSingleBitmapAnimated;
        }

        public void start() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
            }
        }

        public void stop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            }
        }

        public Bitmap getBitmap(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("a623b435", new Object[]{this, new Integer(i)});
            }
            if (i < this.bitmaps.size()) {
                return this.bitmaps.elementAt(i);
            }
            return null;
        }

        public Image(Vector<Bitmap> vector, double d) {
            this.bitmaps = vector;
            this.duration = d < vu3.b.GEO_NOT_SUPPORT ? 1.0d : d;
            this.frameCount = vector.size();
            this.isSingleBitmapAnimated = false;
        }

        public Image(a aVar) {
            Vector<Bitmap> vector = new Vector<>();
            this.bitmaps = vector;
            vector.add(aVar.getBufferBitmap());
            this.duration = aVar.getDuration();
            this.frameCount = aVar.getFrameCount();
            this.isSingleBitmapAnimated = true;
        }
    }
}
