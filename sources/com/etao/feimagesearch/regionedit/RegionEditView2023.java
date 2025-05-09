package com.etao.feimagesearch.regionedit;

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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.caa;
import tb.ckf;
import tb.eid;
import tb.hfn;
import tb.jvn;
import tb.lvn;
import tb.mh7;
import tb.p1p;
import tb.ph7;
import tb.s1e;
import tb.t2o;
import tb.vf0;
import tb.vke;
import tb.wf0;
import tb.xyn;
import tb.zi9;
import tb.zqx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class RegionEditView2023 extends FrameLayout implements eid {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Bitmap bitmap;
    private int currState;
    private final ImageView imageView;
    private boolean isHidePreviewImgView;
    private int lastState;
    private final MaskView maskView;
    private Rect previewImgLocationRect;
    private ph7 regionCallback;
    private int regionCount;
    private a regionEditViewChangeListener;
    private float regionImgDragBottomEdgeHeight;
    private List<xyn> regionParts;
    private lvn selectedObject;
    private lvn selfDefinedObject;
    private final int touchSlop;
    private float regionImgDragTopEdgeHeight = p1p.b(50.0f);
    private final SparseArray<zi9> fingerArray = new SparseArray<>(2);
    private final SparseArray<s1e> touchRegistry = new SparseArray<>();
    private final List<s1e> touchHelpers = new ArrayList();
    private boolean isImageSearchMode = true;
    private final List<lvn> totalObjects = new ArrayList();
    private boolean isTouchEnabled = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
        void A(float f);

        void v(float f);

        void y(float f);
    }

    static {
        t2o.a(481297380);
        t2o.a(481297375);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegionEditView2023(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
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

    private final void addTouchHelper(int i, s1e s1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9f07629", new Object[]{this, new Integer(i), s1eVar});
            return;
        }
        this.touchHelpers.add(s1eVar);
        this.touchRegistry.put(i, s1eVar);
        s1eVar.d(this);
    }

    private final boolean floatEquals(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7255b7c6", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        if (Math.abs(f - f2) <= 1.0E-5f) {
            return true;
        }
        return false;
    }

    private final int getImageMeasureHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72776cf", new Object[]{this, new Integer(i)})).intValue();
        }
        Bitmap bitmap = this.bitmap;
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
        if (this.bitmap == null) {
            return i;
        }
        return caa.h(getContext());
    }

    public static /* synthetic */ Object ipc$super(RegionEditView2023 regionEditView2023, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/regionedit/RegionEditView2023");
    }

    private final boolean isAnimating() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f82717df", new Object[]{this})).booleanValue();
        }
        for (lvn lvnVar : this.totalObjects) {
            if (lvnVar.l()) {
                return true;
            }
        }
        for (s1e s1eVar : this.touchHelpers) {
            if (s1eVar.a()) {
                return true;
            }
        }
        return false;
    }

    private final void onTouchRelease() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e581204e", new Object[]{this});
            return;
        }
        s1e s1eVar = this.touchRegistry.get(this.lastState);
        if (s1eVar != null) {
            s1eVar.b(this.selectedObject, this.totalObjects, this.selfDefinedObject);
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

    private final void setViewScale(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51cc7a98", new Object[]{this, view, new Float(f)});
            return;
        }
        view.setScaleX(f);
        view.setScaleY(f);
    }

    private final void updateRegions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb96c7d", new Object[]{this});
            return;
        }
        for (lvn lvnVar : this.totalObjects) {
            lvnVar.s();
        }
    }

    public final void assignPreviewImgLocation(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a65fd3", new Object[]{this, rect});
        } else if (rect != null) {
            this.previewImgLocationRect = rect;
        }
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
        if (this.isImageSearchMode && (this.selectedObject == null || isAnimating() || this.selfDefinedObject == null)) {
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
                if (next.c(this.fingerArray, this.selectedObject, this.totalObjects, this.selfDefinedObject)) {
                    this.currState = next.getState();
                    break;
                }
            }
        }
        s1e s1eVar = this.touchRegistry.get(this.currState);
        if (s1eVar != null) {
            if (!s1eVar.e(this.fingerArray, this.selectedObject, this.totalObjects, this.selfDefinedObject)) {
                this.currState = 1;
            }
            lvn lvnVar = this.selectedObject;
            if (lvnVar != null) {
                lvnVar.s();
            }
        }
        return true;
    }

    @Override // tb.eid
    public float getDragBottomEdgeLimit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43dc7300", new Object[]{this})).floatValue();
        }
        return this.regionImgDragBottomEdgeHeight;
    }

    @Override // tb.eid
    public float getDragTopEdgeLimit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec9597ea", new Object[]{this})).floatValue();
        }
        return this.regionImgDragTopEdgeHeight;
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
        return this.imageView;
    }

    public final ph7 getRegionCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ph7) ipChange.ipc$dispatch("4d4f006f", new Object[]{this});
        }
        return this.regionCallback;
    }

    public final int getRegionCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71d6133f", new Object[]{this})).intValue();
        }
        return this.regionCount;
    }

    public final a getRegionEditViewChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("90a7780f", new Object[]{this});
        }
        return this.regionEditViewChangeListener;
    }

    @Override // tb.eid
    public int getTouchSlop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa4b321d", new Object[]{this})).intValue();
        }
        return this.touchSlop;
    }

    public final void initTouchHelpers(Float f) {
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d5387c", new Object[]{this, f});
            return;
        }
        if (f == null) {
            f2 = 0.0f;
        } else {
            f2 = f.floatValue();
        }
        this.regionImgDragBottomEdgeHeight = f2;
        if (this.isImageSearchMode) {
            addTouchHelper(5, new vf0(this.regionCallback));
            addTouchHelper(6, new wf0(this.regionCallback));
            addTouchHelper(4, new jvn(this.regionCallback));
        }
        if (this.isTouchEnabled) {
            addTouchHelper(2, new vke(this.regionCallback));
            addTouchHelper(3, new zqx(this.regionCallback));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        Rect rect = this.previewImgLocationRect;
        if (rect != null) {
            this.imageView.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
        generateObjectDraw();
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
        Rect rect = this.previewImgLocationRect;
        if (rect == null) {
            i4 = getImageMeasureWidth(size);
            i3 = getImageMeasureHeight(size2);
        } else {
            ckf.d(rect);
            i4 = rect.width();
            Rect rect2 = this.previewImgLocationRect;
            ckf.d(rect2);
            i3 = rect2.height();
        }
        this.imageView.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        int c = hfn.c(i4, size);
        int c2 = hfn.c(i3, size2);
        this.maskView.measure(View.MeasureSpec.makeMeasureSpec(c, 1073741824), View.MeasureSpec.makeMeasureSpec(c2, 1073741824));
        setMeasuredDimension(c, c2);
    }

    public final void optionRegionTouch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b7b3f7", new Object[]{this, new Boolean(z)});
        } else {
            this.isTouchEnabled = z;
        }
    }

    public final void setBitmap(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61407cf6", new Object[]{this, bitmap});
            return;
        }
        this.bitmap = bitmap;
        this.imageView.setImageBitmap(bitmap);
        if (this.isHidePreviewImgView) {
            this.imageView.setVisibility(4);
        }
    }

    @Override // tb.eid
    public void setImageScale(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eade408", new Object[]{this, new Float(f)});
            return;
        }
        setViewScale(this.imageView, f);
        setViewScale(this.maskView, f);
        a aVar = this.regionEditViewChangeListener;
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
        this.maskView.setTranslationX(f);
        this.imageView.setTranslationX(f);
        a aVar = this.regionEditViewChangeListener;
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
        this.maskView.setTranslationY(f);
        this.imageView.setTranslationY(f);
        a aVar = this.regionEditViewChangeListener;
        if (aVar != null) {
            aVar.v(f);
        }
    }

    public final void setObjects(List<mh7> list) {
        int i;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("962e14ca", new Object[]{this, list});
            return;
        }
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        this.regionCount = i;
        this.regionParts = new ArrayList(this.regionCount);
        if (list != null) {
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                List<xyn> list2 = this.regionParts;
                ckf.d(list2);
                if (i2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                list2.add(new xyn(z, list.get(i2)));
                i2 = i3;
            }
        }
        generateObjectDraw();
    }

    public final void setRegionAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6251cc11", new Object[]{this, new Float(f)});
        } else {
            this.maskView.setAlpha(f);
        }
    }

    public final void setRegionCallback(ph7 ph7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d5bd6d1", new Object[]{this, ph7Var});
        } else {
            this.regionCallback = ph7Var;
        }
    }

    public final void setRegionEditViewChangeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e65c70b", new Object[]{this, aVar});
        } else {
            this.regionEditViewChangeListener = aVar;
        }
    }

    public final void setRegionSelected(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98c4f9c9", new Object[]{this, rectF});
            return;
        }
        ckf.g(rectF, "region");
        for (lvn lvnVar : this.totalObjects) {
            RectF j = lvnVar.j();
            if (floatEquals(rectF.left, j.left) && floatEquals(rectF.top, j.top) && floatEquals(rectF.right, j.right) && floatEquals(rectF.bottom, j.bottom)) {
                setSelectedObject(lvnVar);
                return;
            }
        }
    }

    @Override // tb.eid
    public void setSelfDefinedSelected() {
        lvn lvnVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ad289d", new Object[]{this});
            return;
        }
        lvn lvnVar2 = this.selfDefinedObject;
        if (lvnVar2 != null && (lvnVar = this.selectedObject) != null) {
            lvnVar2.p(lvnVar.j());
            lvnVar.m();
            lvnVar.q(false, false);
            lvnVar2.q(true, false);
            this.selectedObject = lvnVar2;
            lvnVar2.o(true);
            lvnVar2.s();
        }
    }

    public final void triggerAnchorViewHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b965ddbb", new Object[]{this});
        } else {
            this.maskView.setVisibility(8);
        }
    }

    public final void triggerPreviewImgViewHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f16ace1", new Object[]{this});
            return;
        }
        this.isHidePreviewImgView = true;
        this.maskView.triggerMainMaskViewFullOfParent();
    }

    public final void updateRegionImgDragBottomHeight(Float f) {
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3f489a6", new Object[]{this, f});
            return;
        }
        if (f == null) {
            f2 = 0.0f;
        } else {
            f2 = f.floatValue();
        }
        this.regionImgDragBottomEdgeHeight = f2;
    }

    public void updateRegionMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc4152cd", new Object[]{this, new Boolean(z)});
        } else {
            this.isImageSearchMode = z;
        }
    }

    private final void generateObjectDraw() {
        List<xyn> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f03178ff", new Object[]{this});
        } else if (this.imageView.getWidth() != 0 && (list = this.regionParts) != null) {
            if (list.isEmpty()) {
                updateRegions();
                return;
            }
            this.totalObjects.clear();
            ArrayList arrayList = new ArrayList(list.size());
            for (xyn xynVar : list) {
                lvn lvnVar = new lvn(xynVar.a());
                RectF rectF = xynVar.a().f24039a;
                ckf.f(rectF, "part.bean.region");
                lvnVar.p(rectF);
                lvnVar.q(xynVar.b(), true);
                lvnVar.g();
                arrayList.add(lvnVar);
                this.totalObjects.add(lvnVar);
                if (xynVar.b()) {
                    this.selectedObject = lvnVar;
                }
            }
            lvn lvnVar2 = new lvn(null);
            lvnVar2.p(new RectF());
            lvnVar2.o(false);
            lvnVar2.g();
            arrayList.add(lvnVar2);
            this.totalObjects.add(lvnVar2);
            this.selfDefinedObject = lvnVar2;
            list.clear();
            this.maskView.setParts(arrayList);
        }
    }

    public void setSelectedObject(lvn lvnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44dbff49", new Object[]{this, lvnVar});
            return;
        }
        ckf.g(lvnVar, "selectedObject");
        if (!ckf.b(lvnVar, this.selectedObject)) {
            lvn lvnVar2 = this.selectedObject;
            if (lvnVar2 != null) {
                lvnVar2.q(false, true);
            }
            this.selectedObject = lvnVar;
            lvnVar.q(true, true);
            this.maskView.invalidate();
        }
    }
}
