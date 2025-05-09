package com.taobao.uikit.extend.feature.view;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.feature.view.IGetBitmap;
import com.taobao.uikit.utils.UIKITLog;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import tb.uwn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DrawableProxy extends Drawable implements IGetBitmap {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TUrlImageView mBindView;
    private boolean mIsRecovering = false;
    public BitmapDrawable mRealDrawable;

    private DrawableProxy(BitmapDrawable bitmapDrawable) {
        this.mRealDrawable = bitmapDrawable;
    }

    public static /* synthetic */ Object ipc$super(DrawableProxy drawableProxy, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1215634407:
                return new Integer(super.getMinimumHeight());
            case -1028087344:
                return new Integer(super.getIntrinsicHeight());
            case -575603333:
                return new Boolean(super.getPadding((Rect) objArr[0]));
            case 697349553:
                return new Integer(super.getIntrinsicWidth());
            case 968394312:
                return new Integer(super.getMinimumWidth());
            case 1365572464:
                return super.getTransparentRegion();
            case 1479324538:
                return new Integer(super.getChangingConfigurations());
            case 1529095201:
                return new Boolean(super.isStateful());
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/feature/view/DrawableProxy");
        }
    }

    public static DrawableProxy obtain(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DrawableProxy) ipChange.ipc$dispatch("3ef37530", new Object[]{bitmapDrawable});
        }
        return new DrawableProxy(bitmapDrawable);
    }

    private void tryDowngrade2Passable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3803ce8a", new Object[]{this});
            return;
        }
        BitmapDrawable bitmapDrawable = this.mRealDrawable;
        if (bitmapDrawable instanceof uwn) {
            ((uwn) bitmapDrawable).l();
        }
    }

    public DrawableProxy bindHostView(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DrawableProxy) ipChange.ipc$dispatch("564d905a", new Object[]{this, tUrlImageView});
        }
        this.mBindView = tUrlImageView;
        return this;
    }

    @Override // com.taobao.uikit.feature.view.IGetBitmap
    public Bitmap getBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c5e4890a", new Object[]{this});
        }
        if (this.mRealDrawable == null) {
            return null;
        }
        tryDowngrade2Passable();
        return this.mRealDrawable.getBitmap();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("582cb37a", new Object[]{this})).intValue();
        }
        BitmapDrawable bitmapDrawable = this.mRealDrawable;
        if (bitmapDrawable != null) {
            return bitmapDrawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue();
        }
        BitmapDrawable bitmapDrawable = this.mRealDrawable;
        if (bitmapDrawable != null) {
            return bitmapDrawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue();
        }
        BitmapDrawable bitmapDrawable = this.mRealDrawable;
        if (bitmapDrawable != null) {
            return bitmapDrawable.getIntrinsicWidth();
        }
        return super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b78ae419", new Object[]{this})).intValue();
        }
        BitmapDrawable bitmapDrawable = this.mRealDrawable;
        if (bitmapDrawable != null) {
            return bitmapDrawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39b88648", new Object[]{this})).intValue();
        }
        BitmapDrawable bitmapDrawable = this.mRealDrawable;
        if (bitmapDrawable != null) {
            return bitmapDrawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        BitmapDrawable bitmapDrawable = this.mRealDrawable;
        if (bitmapDrawable != null) {
            return bitmapDrawable.getOpacity();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddb0fd7b", new Object[]{this, rect})).booleanValue();
        }
        BitmapDrawable bitmapDrawable = this.mRealDrawable;
        if (bitmapDrawable != null) {
            return bitmapDrawable.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    public Drawable getRealDrawable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("ba5a8c3f", new Object[]{this, new Boolean(z)});
        }
        if (!z) {
            tryDowngrade2Passable();
        }
        return this.mRealDrawable;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Region) ipChange.ipc$dispatch("5164fb70", new Object[]{this});
        }
        BitmapDrawable bitmapDrawable = this.mRealDrawable;
        if (bitmapDrawable != null) {
            return bitmapDrawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daae6371", new Object[]{this, resources, xmlPullParser, attributeSet});
            return;
        }
        BitmapDrawable bitmapDrawable = this.mRealDrawable;
        if (bitmapDrawable != null) {
            bitmapDrawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    public boolean isContentDifferent(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3e9cf39", new Object[]{this, drawable})).booleanValue();
        }
        if (drawable instanceof DrawableProxy) {
            if (this.mRealDrawable != ((DrawableProxy) drawable).mRealDrawable) {
                return true;
            }
            return false;
        } else if (this != drawable) {
            return true;
        } else {
            return false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b242421", new Object[]{this})).booleanValue();
        }
        BitmapDrawable bitmapDrawable = this.mRealDrawable;
        if (bitmapDrawable != null) {
            return bitmapDrawable.isStateful();
        }
        return super.isStateful();
    }

    public synchronized boolean recover() {
        BitmapDrawable bitmapDrawable;
        TUrlImageView tUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24bf5fef", new Object[]{this})).booleanValue();
        }
        if (this.mIsRecovering || (((bitmapDrawable = this.mRealDrawable) != null && (bitmapDrawable.getBitmap() == null || !this.mRealDrawable.getBitmap().isRecycled())) || (tUrlImageView = this.mBindView) == null)) {
            return false;
        }
        this.mIsRecovering = true;
        tUrlImageView.reload();
        return true;
    }

    public synchronized boolean release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca55112", new Object[]{this})).booleanValue();
        }
        BitmapDrawable bitmapDrawable = this.mRealDrawable;
        if (bitmapDrawable == null) {
            return false;
        }
        if (bitmapDrawable instanceof uwn) {
            ((uwn) bitmapDrawable).m();
        }
        this.mRealDrawable = null;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
            return;
        }
        BitmapDrawable bitmapDrawable = this.mRealDrawable;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
            return;
        }
        BitmapDrawable bitmapDrawable = this.mRealDrawable;
        if (bitmapDrawable != null) {
            bitmapDrawable.setColorFilter(colorFilter);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2271105", new Object[]{this, new Boolean(z)});
            return;
        }
        BitmapDrawable bitmapDrawable = this.mRealDrawable;
        if (bitmapDrawable != null) {
            bitmapDrawable.setDither(z);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b194884", new Object[]{this, new Boolean(z)});
            return;
        }
        BitmapDrawable bitmapDrawable = this.mRealDrawable;
        if (bitmapDrawable != null) {
            bitmapDrawable.setFilterBitmap(z);
            invalidateSelf();
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DrawableProxy@" + Integer.toHexString(hashCode());
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
        } else if (recover()) {
            Integer valueOf = Integer.valueOf(canvas.getWidth());
            Integer valueOf2 = Integer.valueOf(canvas.getHeight());
            TUrlImageView tUrlImageView = this.mBindView;
            UIKITLog.i(TUrlImageView.LOG_TAG, "recover on draw, width=%d, height=%d, id=%s, url=%s", valueOf, valueOf2, tUrlImageView, tUrlImageView.getLoadingUrl());
        } else {
            BitmapDrawable bitmapDrawable = this.mRealDrawable;
            if (bitmapDrawable != null) {
                bitmapDrawable.setChangingConfigurations(getChangingConfigurations());
                this.mRealDrawable.setBounds(getBounds());
                this.mRealDrawable.setCallback(getCallback());
                this.mRealDrawable.draw(canvas);
                this.mRealDrawable.setCallback(null);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc56098e", new Object[]{this, new Integer(i), mode});
            return;
        }
        BitmapDrawable bitmapDrawable = this.mRealDrawable;
        if (bitmapDrawable != null) {
            bitmapDrawable.setColorFilter(i, mode);
        }
    }
}
