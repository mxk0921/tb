package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.View;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jfw;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BlurViewGroup extends FlatViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Drawable originBackground;
    private View targetBlurView;
    private jfw viewPrams;
    private int blurRadius = 25;
    private int scaleRadius = 10;
    private boolean blurCreated = false;

    static {
        t2o.a(503317444);
    }

    public BlurViewGroup(Context context) {
        super(context);
    }

    private Bitmap blurBitmap(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("7f202330", new Object[]{this, bitmap, new Integer(i)});
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            RenderScript create = RenderScript.create(getContext().getApplicationContext());
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            create2.setRadius(i);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            create.destroy();
            bitmap.recycle();
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    private Bitmap getBitmap(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("260c9004", new Object[]{this, view});
        }
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            return drawingCache;
        }
        int width = drawingCache.getWidth();
        int height = drawingCache.getHeight();
        int i = this.scaleRadius;
        return Bitmap.createScaledBitmap(drawingCache, width / i, height / i, false);
    }

    public static /* synthetic */ Object ipc$super(BlurViewGroup blurViewGroup, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/BlurViewGroup");
    }

    public View getTargetBlurView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("45486e1c", new Object[]{this});
        }
        return this.targetBlurView;
    }

    public void refreshBG() {
        View view;
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("768fa4e7", new Object[]{this});
        } else if (!this.blurCreated && (view = this.targetBlurView) != null) {
            view.setDrawingCacheEnabled(true);
            view.buildDrawingCache();
            try {
                bitmap = getBitmap(view);
            } catch (Exception e) {
                e.printStackTrace();
                bitmap = null;
            }
            if (bitmap != null) {
                Bitmap blurBitmap = blurBitmap(bitmap, this.blurRadius);
                if (blurBitmap != null) {
                    RoundedBitmapDrawable create = RoundedBitmapDrawableFactory.create(getResources(), blurBitmap);
                    create.setCornerRadius(this.viewPrams.J);
                    create.setBounds(0, 0, getWidth(), getHeight());
                    if (this.originBackground == null) {
                        setBackgroundDrawable(create);
                    } else {
                        setBackgroundDrawable(new LayerDrawable(new Drawable[]{create, this.originBackground}));
                    }
                }
                this.blurCreated = true;
            }
            view.setDrawingCacheEnabled(false);
        }
    }

    public void setBlurRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5038a61", new Object[]{this, new Integer(i)});
            return;
        }
        if (i <= 0 || i > 25) {
            tfs.d("blur radius 不正确:" + i);
            i = 25;
        }
        this.blurRadius = i;
    }

    public void setOriginBackground(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fe2a7a1", new Object[]{this, drawable});
        } else {
            this.originBackground = drawable;
        }
    }

    public void setScaleRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58d9e6e2", new Object[]{this, new Integer(i)});
        } else {
            this.scaleRadius = i;
        }
    }

    public void setTargetBlurView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb96e8ac", new Object[]{this, view});
        } else {
            this.targetBlurView = view;
        }
    }

    public void setViewParams(jfw jfwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d47cbeb1", new Object[]{this, jfwVar});
        } else {
            this.viewPrams = jfwVar;
        }
    }
}
