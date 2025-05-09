package androidx.core.util;

import android.util.SizeF;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SizeFCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final float mHeight;
    private final float mWidth;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static SizeF toSizeF(SizeFCompat sizeFCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SizeF) ipChange.ipc$dispatch("55589871", new Object[]{sizeFCompat});
            }
            Preconditions.checkNotNull(sizeFCompat);
            return new SizeF(sizeFCompat.getWidth(), sizeFCompat.getHeight());
        }

        public static SizeFCompat toSizeFCompat(SizeF sizeF) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SizeFCompat) ipChange.ipc$dispatch("c926e3f7", new Object[]{sizeF});
            }
            Preconditions.checkNotNull(sizeF);
            return new SizeFCompat(sizeF.getWidth(), sizeF.getHeight());
        }
    }

    public SizeFCompat(float f, float f2) {
        this.mWidth = Preconditions.checkArgumentFinite(f, "width");
        this.mHeight = Preconditions.checkArgumentFinite(f2, "height");
    }

    public static SizeFCompat toSizeFCompat(SizeF sizeF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SizeFCompat) ipChange.ipc$dispatch("c926e3f7", new Object[]{sizeF});
        }
        return Api21Impl.toSizeFCompat(sizeF);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeFCompat)) {
            return false;
        }
        SizeFCompat sizeFCompat = (SizeFCompat) obj;
        if (sizeFCompat.mWidth == this.mWidth && sizeFCompat.mHeight == this.mHeight) {
            return true;
        }
        return false;
    }

    public float getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e214", new Object[]{this})).floatValue();
        }
        return this.mHeight;
    }

    public float getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d087", new Object[]{this})).floatValue();
        }
        return this.mWidth;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return Float.floatToIntBits(this.mWidth) ^ Float.floatToIntBits(this.mHeight);
    }

    public SizeF toSizeF() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SizeF) ipChange.ipc$dispatch("14875a1c", new Object[]{this});
        }
        return Api21Impl.toSizeF(this);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.mWidth + "x" + this.mHeight;
    }
}
