package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import androidx.core.graphics.BitmapCompat;
import androidx.core.view.GravityCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class RoundedBitmapDrawableFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RoundedBitmapDrawableFa";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class DefaultRoundedBitmapDrawable extends RoundedBitmapDrawable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public DefaultRoundedBitmapDrawable(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        public static /* synthetic */ Object ipc$super(DefaultRoundedBitmapDrawable defaultRoundedBitmapDrawable, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/graphics/drawable/RoundedBitmapDrawableFactory$DefaultRoundedBitmapDrawable");
        }

        @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
        public void gravityCompatApply(int i, int i2, int i3, Rect rect, Rect rect2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7667887e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), rect, rect2});
            } else {
                GravityCompat.apply(i, i2, i3, rect, rect2, 0);
            }
        }

        @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
        public boolean hasMipMap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3f87d2d", new Object[]{this})).booleanValue();
            }
            Bitmap bitmap = this.mBitmap;
            if (bitmap == null || !BitmapCompat.hasMipMap(bitmap)) {
                return false;
            }
            return true;
        }

        @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
        public void setMipMap(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f15d4403", new Object[]{this, new Boolean(z)});
                return;
            }
            Bitmap bitmap = this.mBitmap;
            if (bitmap != null) {
                BitmapCompat.setHasMipMap(bitmap, z);
                invalidateSelf();
            }
        }
    }

    private RoundedBitmapDrawableFactory() {
    }

    public static RoundedBitmapDrawable create(Resources resources, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RoundedBitmapDrawable) ipChange.ipc$dispatch("842d545e", new Object[]{resources, bitmap}) : new RoundedBitmapDrawable21(resources, bitmap);
    }

    public static RoundedBitmapDrawable create(Resources resources, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RoundedBitmapDrawable) ipChange.ipc$dispatch("33572fb6", new Object[]{resources, str});
        }
        RoundedBitmapDrawable create = create(resources, BitmapFactory.decodeFile(str));
        if (create.getBitmap() == null) {
            new StringBuilder("RoundedBitmapDrawable cannot decode ").append(str);
        }
        return create;
    }

    public static RoundedBitmapDrawable create(Resources resources, InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RoundedBitmapDrawable) ipChange.ipc$dispatch("594c5803", new Object[]{resources, inputStream});
        }
        RoundedBitmapDrawable create = create(resources, BitmapFactory.decodeStream(inputStream));
        if (create.getBitmap() == null) {
            new StringBuilder("RoundedBitmapDrawable cannot decode ").append(inputStream);
        }
        return create;
    }
}
