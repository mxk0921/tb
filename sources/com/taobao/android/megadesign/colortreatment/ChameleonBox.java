package com.taobao.android.megadesign.colortreatment;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.megadesign.colortreatment.b;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ChameleonBox extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ALL = 4;
    public static final int EDGE_BOTTOM = 2;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 3;
    public static final int EDGE_TOP = 0;
    private int colorPickArea;
    private int mBackgroundColor;
    private Bitmap mBitmap;
    private ViewTreeObserver.OnPreDrawListener onPreDrawListener;
    private ImageView targetView;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface ColorPickArea {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            Bitmap bitmap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
            }
            if (!(ChameleonBox.access$000(ChameleonBox.this) == null || !(ChameleonBox.access$000(ChameleonBox.this).getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) ChameleonBox.access$000(ChameleonBox.this).getDrawable()).getBitmap()) == null || ChameleonBox.access$100(ChameleonBox.this) == bitmap)) {
                ChameleonBox.access$102(ChameleonBox.this, bitmap);
                try {
                    ChameleonBox.access$300(ChameleonBox.this, ChameleonBox.access$200(ChameleonBox.this, bitmap));
                } catch (Throwable unused) {
                }
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements b.AbstractC0465b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.megadesign.colortreatment.b.AbstractC0465b
        public void a(com.taobao.android.megadesign.colortreatment.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ca8bd79", new Object[]{this, bVar});
            } else if (bVar != null) {
                ChameleonBox.access$402(ChameleonBox.this, bVar.c(0));
                Drawable background = ChameleonBox.this.getBackground();
                if (background instanceof GradientDrawable) {
                    ((GradientDrawable) background).setColor(ChameleonBox.access$400(ChameleonBox.this));
                } else if ((background instanceof ColorDrawable) || background == null) {
                    ChameleonBox chameleonBox = ChameleonBox.this;
                    chameleonBox.setBackgroundColor(ChameleonBox.access$400(chameleonBox));
                }
            }
        }
    }

    public ChameleonBox(Context context) {
        this(context, null);
    }

    public static /* synthetic */ ImageView access$000(ChameleonBox chameleonBox) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("7ab2fbb3", new Object[]{chameleonBox});
        }
        return chameleonBox.targetView;
    }

    public static /* synthetic */ Bitmap access$100(ChameleonBox chameleonBox) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("59931d7a", new Object[]{chameleonBox});
        }
        return chameleonBox.mBitmap;
    }

    public static /* synthetic */ Bitmap access$102(ChameleonBox chameleonBox, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("671bfbf2", new Object[]{chameleonBox, bitmap});
        }
        chameleonBox.mBitmap = bitmap;
        return bitmap;
    }

    public static /* synthetic */ Bitmap access$200(ChameleonBox chameleonBox, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b9a66db1", new Object[]{chameleonBox, bitmap});
        }
        return chameleonBox.extractImagePart(bitmap);
    }

    public static /* synthetic */ void access$300(ChameleonBox chameleonBox, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fda3094", new Object[]{chameleonBox, bitmap});
        } else {
            chameleonBox.autoBackground(bitmap);
        }
    }

    public static /* synthetic */ int access$400(ChameleonBox chameleonBox) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e6cc7aec", new Object[]{chameleonBox})).intValue();
        }
        return chameleonBox.mBackgroundColor;
    }

    public static /* synthetic */ int access$402(ChameleonBox chameleonBox, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e42471f", new Object[]{chameleonBox, new Integer(i)})).intValue();
        }
        chameleonBox.mBackgroundColor = i;
        return i;
    }

    private void autoBackground(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b33ad06a", new Object[]{this, bitmap});
        } else {
            com.taobao.android.megadesign.colortreatment.b.b(bitmap).a(new b());
        }
    }

    private Bitmap extractImagePart(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("60f19f18", new Object[]{this, bitmap});
        }
        if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return null;
        }
        int i = this.colorPickArea;
        if (i == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), (int) (bitmap.getHeight() * 0.1d));
        }
        if (i == 2) {
            return Bitmap.createBitmap(bitmap, 0, (int) (bitmap.getHeight() * 0.9d), bitmap.getWidth(), (int) (bitmap.getHeight() * 0.1d));
        }
        if (i == 1) {
            return Bitmap.createBitmap(bitmap, 0, 0, (int) (bitmap.getWidth() * 0.1d), bitmap.getHeight());
        }
        if (i == 3) {
            return Bitmap.createBitmap(bitmap, (int) (bitmap.getWidth() * 0.9d), 0, (int) (bitmap.getWidth() * 0.1d), this.mBitmap.getHeight());
        }
        return bitmap;
    }

    private void initAttrs(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a733a924", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        initPreDrawListener();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.MegaChameleonBox, i, 0);
            try {
                this.colorPickArea = obtainStyledAttributes.getInt(R.styleable.MegaChameleonBox_colorPickArea, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    private void initPreDrawListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f838432", new Object[]{this});
        } else if (this.onPreDrawListener == null) {
            this.onPreDrawListener = new a();
            getViewTreeObserver().addOnPreDrawListener(this.onPreDrawListener);
        }
    }

    private void initTargetView(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcfdf407", new Object[]{this, imageView});
        } else {
            this.targetView = imageView;
        }
    }

    public static /* synthetic */ Object ipc$super(ChameleonBox chameleonBox, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -6374855) {
            return new Integer(super.getLayoutDirection());
        }
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/megadesign/colortreatment/ChameleonBox");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void layoutChildren(int r18, int r19, int r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.megadesign.colortreatment.ChameleonBox.layoutChildren(int, int, int, int, boolean):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        initPreDrawListener();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        if (this.onPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.onPreDrawListener);
            this.onPreDrawListener = null;
            this.targetView = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            layoutChildren(i, i2, i3, i4, false);
        }
    }

    public void setColorPickArea(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b99712d", new Object[]{this, new Integer(i)});
        } else {
            this.colorPickArea = i;
        }
    }

    public ChameleonBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChameleonBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBackgroundColor = 0;
        this.colorPickArea = 0;
        this.onPreDrawListener = null;
        initAttrs(context, attributeSet, i);
    }
}
