package com.etao.feimagesearch.immerse;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.regionedit.MaskView;
import com.etao.feimagesearch.regionedit.RegionEditView2023;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.a07;
import tb.caa;
import tb.ckf;
import tb.eid;
import tb.hfn;
import tb.i04;
import tb.lvn;
import tb.s1e;
import tb.t2o;
import tb.vke;
import tb.xhv;
import tb.zi9;
import tb.zqx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ImgPreviewView extends FrameLayout implements eid {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int STATE_ADJUST_CORNER = 5;
    public static final int STATE_ADJUST_EDGE = 6;
    public static final int STATE_DRAG_REGION = 4;
    public static final int STATE_IMAGE_DRAG = 2;
    public static final int STATE_JUDGING = 1;
    public static final int STATE_NONE = 0;
    public static final int STATE_ZOOM = 3;
    private int currState;
    private int lastState;
    private final MaskView maskView;
    private Bitmap previewBitmap;
    private Rect previewImgLocate;
    private final ImageView previewImgView;
    private RegionEditView2023.a regionEditViewChangeListener;
    private final Map<Integer, s1e> touchRegistry = new LinkedHashMap();
    private List<s1e> touchHelpers = new ArrayList();
    private final SparseArray<zi9> fingerArray = new SparseArray<>(2);
    private RectF dragEdgeRectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481296957);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(481296956);
        t2o.a(481297375);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImgPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
        ImageView imageView = new ImageView(context);
        this.previewImgView = imageView;
        MaskView maskView = new MaskView(context);
        this.maskView = maskView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setPivotX(0.0f);
        imageView.setPivotY(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        layoutParams.gravity = 17;
        addView(imageView, layoutParams);
        addView(maskView, layoutParams);
        maskView.setImageView(imageView);
    }

    private final int getImageMeasureHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72776cf", new Object[]{this, new Integer(i)})).intValue();
        }
        Bitmap bitmap = this.previewBitmap;
        if (bitmap == null) {
            return i;
        }
        return (int) (bitmap.getHeight() * ((caa.h(getContext()) * 1.0f) / bitmap.getWidth()));
    }

    private final int getImageMeasureWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3a7022", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.previewBitmap == null) {
            return i;
        }
        return caa.h(getContext());
    }

    public static /* synthetic */ Object ipc$super(ImgPreviewView imgPreviewView, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/immerse/ImgPreviewView");
    }

    private final void onTouchRelease() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e581204e", new Object[]{this});
            return;
        }
        s1e s1eVar = this.touchRegistry.get(Integer.valueOf(this.lastState));
        if (s1eVar != null) {
            s1eVar.b(null, null, null);
        }
    }

    private final void recordPointer(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32907b88", new Object[]{this, motionEvent});
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i = 0; i < pointerCount; i++) {
                        zi9 zi9Var = this.fingerArray.get(motionEvent.getPointerId(i));
                        if (zi9Var != null) {
                            zi9Var.a(motionEvent, i);
                        }
                    }
                    return;
                } else if (actionMasked == 3) {
                    this.fingerArray.clear();
                    return;
                } else if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return;
                    }
                }
            }
            this.fingerArray.remove(pointerId);
            return;
        }
        this.fingerArray.put(pointerId, new zi9(motionEvent, actionIndex));
    }

    private final boolean resetIfEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e08e91ec", new Object[]{this})).booleanValue();
        }
        if (this.fingerArray.size() != 0) {
            return false;
        }
        this.lastState = this.currState;
        this.currState = 0;
        onTouchRelease();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent == null) {
            return false;
        }
        recordPointer(motionEvent);
        if (resetIfEmpty()) {
            return true;
        }
        if (this.currState == 0) {
            if (this.fingerArray.get(0) == null) {
                return true;
            }
            this.currState = 1;
        }
        if (this.currState == 1) {
            Iterator<s1e> it = this.touchHelpers.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                s1e next = it.next();
                if (next.c(this.fingerArray, null, null, null)) {
                    this.currState = next.getState();
                    break;
                }
            }
        }
        s1e s1eVar = this.touchRegistry.get(Integer.valueOf(this.currState));
        if (s1eVar != null && !s1eVar.e(this.fingerArray, null, null, null)) {
            this.currState = 1;
        }
        return true;
    }

    @Override // tb.eid
    public float getDragBottomEdgeLimit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43dc7300", new Object[]{this})).floatValue();
        }
        return this.dragEdgeRectF.bottom;
    }

    @Override // tb.eid
    public float getDragTopEdgeLimit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec9597ea", new Object[]{this})).floatValue();
        }
        return this.dragEdgeRectF.top;
    }

    @Override // tb.eid
    public View getHolderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("94b05030", new Object[]{this});
        }
        return this;
    }

    @Override // tb.eid
    public View getImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("19152173", new Object[]{this});
        }
        return this.previewImgView;
    }

    public final RegionEditView2023.a getRegionEditViewChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RegionEditView2023.a) ipChange.ipc$dispatch("90a7780f", new Object[]{this});
        }
        return this.regionEditViewChangeListener;
    }

    @Override // tb.eid
    public int getTouchSlop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa4b321d", new Object[]{this})).intValue();
        }
        return ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        Rect rect = this.previewImgLocate;
        if (rect != null) {
            this.previewImgView.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        Rect rect = this.previewImgLocate;
        if (rect == null) {
            i4 = getImageMeasureWidth(size);
            i3 = getImageMeasureHeight(size2);
        } else {
            int width = rect.width();
            i3 = rect.height();
            i4 = width;
        }
        this.previewImgView.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        int c = hfn.c(i4, size);
        int c2 = hfn.c(i3, size2);
        this.maskView.measure(View.MeasureSpec.makeMeasureSpec(c, 1073741824), View.MeasureSpec.makeMeasureSpec(c2, 1073741824));
        setMeasuredDimension(c, c2);
    }

    @Override // tb.eid
    public void setImageScale(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eade408", new Object[]{this, new Float(f)});
            return;
        }
        ImageView imageView = this.previewImgView;
        imageView.setScaleX(f);
        imageView.setScaleY(f);
        MaskView maskView = this.maskView;
        maskView.setScaleX(f);
        maskView.setScaleY(f);
        RegionEditView2023.a aVar = this.regionEditViewChangeListener;
        if (aVar != null) {
            aVar.y(f);
        }
    }

    @Override // tb.eid
    public void setImageTranslationX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9bf7f99", new Object[]{this, new Float(f)});
            return;
        }
        this.previewImgView.setTranslationX(f);
        this.maskView.setTranslationX(f);
        RegionEditView2023.a aVar = this.regionEditViewChangeListener;
        if (aVar != null) {
            aVar.A(f);
        }
    }

    @Override // tb.eid
    public void setImageTranslationY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb745838", new Object[]{this, new Float(f)});
            return;
        }
        this.previewImgView.setTranslationY(f);
        this.maskView.setTranslationY(f);
        RegionEditView2023.a aVar = this.regionEditViewChangeListener;
        if (aVar != null) {
            aVar.v(f);
        }
    }

    public final void setPreviewImage(Bitmap bitmap, Rect rect, RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("363db8b8", new Object[]{this, bitmap, rect, rectF});
        } else if (bitmap != null) {
            this.previewBitmap = bitmap;
            this.previewImgLocate = rect;
            this.previewImgView.setImageBitmap(bitmap);
            if (rectF != null) {
                this.dragEdgeRectF = rectF;
            } else {
                this.dragEdgeRectF = new RectF(this.previewImgView.getTop(), this.previewImgView.getLeft(), this.previewImgView.getRight(), this.previewImgView.getBottom());
            }
            this.touchHelpers.clear();
            this.touchRegistry.clear();
            Map<Integer, s1e> map = this.touchRegistry;
            vke vkeVar = new vke(null);
            vkeVar.d(this);
            xhv xhvVar = xhv.INSTANCE;
            map.put(2, vkeVar);
            Map<Integer, s1e> map2 = this.touchRegistry;
            zqx zqxVar = new zqx(null);
            zqxVar.d(this);
            map2.put(3, zqxVar);
            this.touchHelpers = i04.E0(this.touchRegistry.values());
        }
    }

    public final void setRegionEditViewChangeListener(RegionEditView2023.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e65c70b", new Object[]{this, aVar});
        } else {
            this.regionEditViewChangeListener = aVar;
        }
    }

    public void setSelectedObject(lvn lvnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44dbff49", new Object[]{this, lvnVar});
        } else {
            ckf.g(lvnVar, "selectedObject");
        }
    }

    @Override // tb.eid
    public void setSelfDefinedSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ad289d", new Object[]{this});
        }
    }

    public void updateRegionMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc4152cd", new Object[]{this, new Boolean(z)});
        }
    }
}
