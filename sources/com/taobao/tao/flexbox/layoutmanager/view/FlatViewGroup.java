package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaPositionType;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.taobao.R;
import com.taobao.weex.ui.view.gesture.WXGestureType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.akt;
import tb.ey8;
import tb.i5c;
import tb.igs;
import tb.mx7;
import tb.nwv;
import tb.pg1;
import tb.rbi;
import tb.rgo;
import tb.t2o;
import tb.tfs;
import tb.tkt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FlatViewGroup extends ViewGroup implements mx7.b.a, i5c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Comparator<Pair> childComparator = new a();
    private Component component;
    private Bitmap delegateBitmap;
    private Canvas delegateCanvas;
    private boolean drawFlicker;
    private ey8 fadingEdge;
    private ArrayList<c> floatView;
    private d highLightInfo;
    private Paint highLightPaint;
    private Rect hitRect;
    private Paint hitRectPaint;
    private rbi measureResult;
    private YogaNode node;
    private Path path;
    private List<e> sizeChangedCallbacks;
    private List<f> visibilityChangedCallbacks;
    private ArrayList<b> children = new ArrayList<>();
    private ArrayList<b> popLayerView = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Comparator<Pair> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(Pair pair, Pair pair2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5d4d085f", new Object[]{this, pair, pair2})).intValue();
            }
            return ((Integer) pair.second).intValue() - ((Integer) pair2.second).intValue();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final View f12375a;
        public final boolean b;

        static {
            t2o.a(503317457);
        }

        public c(View view, boolean z) {
            this.f12375a = view;
            this.b = z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public RectF f12376a;
        public RectF b;
        public int c;
        public float[] d;
        public Path e;

        static {
            t2o.a(503317458);
        }

        public d() {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface e {
        void onSizeChanged(int i, int i2, int i3, int i4);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface f {
        void onVisibilityChanged(View view, int i);
    }

    static {
        t2o.a(503317454);
        t2o.a(503317223);
        t2o.a(503316910);
    }

    public FlatViewGroup(Context context) {
        super(context);
    }

    private void dispatchDrawInternal(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c4882e3", new Object[]{this, canvas});
            return;
        }
        try {
            Path path = this.path;
            if (path != null && !path.isEmpty()) {
                canvas.clipPath(this.path);
            }
            super.dispatchDraw(canvas);
            if (getChildCount() == 0) {
                drawDrawableChildren(canvas, this.children);
            }
            Rect rect = this.hitRect;
            if (rect != null) {
                canvas.drawRect(rect, this.hitRectPaint);
            }
            drawFlicker(canvas);
        } catch (Throwable th) {
            tfs.e("FlatViewGroup dispatchDraw", th.getMessage());
        }
    }

    private void drawDrawableChildren(Canvas canvas, ArrayList<b> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42be558d", new Object[]{this, canvas, arrayList});
            return;
        }
        Iterator<b> it = arrayList.iterator();
        while (it.hasNext()) {
            b next = it.next();
            canvas.save();
            YogaNode yogaNode = next.b;
            if (yogaNode != null) {
                canvas.translate(yogaNode.getLayoutX() + next.e, next.b.getLayoutY() + next.f);
                canvas.clipRect(0.0f, 0.0f, next.b.getLayoutWidth(), next.b.getLayoutHeight());
            } else {
                canvas.translate(next.i, next.j);
                canvas.clipRect(0.0f, 0.0f, next.g, next.h);
            }
            int i = 0;
            while (true) {
                Drawable[] drawableArr = next.d;
                if (i < drawableArr.length) {
                    if (drawableArr[i] != null) {
                        if (i == 0) {
                            Drawable drawable = drawableArr[1];
                            if ((drawable instanceof rgo) && ((rgo) drawable).b() != null) {
                            }
                        }
                        if (next.d[i].isVisible()) {
                            next.d[i].draw(canvas);
                        }
                    }
                    i++;
                }
            }
            canvas.restore();
        }
    }

    private void drawFlicker(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("820cfb2a", new Object[]{this, canvas});
        } else if (this.drawFlicker) {
            canvas.drawColor(Color.argb(150, (int) (Math.random() * 256.0d), (int) (Math.random() * 256.0d), (int) (Math.random() * 256.0d)));
            this.drawFlicker = false;
            postInvalidate();
        }
    }

    private n findChildNodeForCompareNode(b bVar, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("ff0df15", new Object[]{this, bVar, nVar});
        }
        n nVar2 = bVar.f12374a;
        while (nVar2 != null && nVar2.Y() != nVar) {
            nVar2 = nVar2.Y();
        }
        return nVar2;
    }

    private ArrayList<b> findDrawablesAfter(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("49dba3e5", new Object[]{this, view});
        }
        ArrayList<b> arrayList = null;
        for (int indexOf = this.children.indexOf((b) view.getTag(R.id.layout_manager_flatviewgroup_child_id)) + 1; indexOf < this.children.size(); indexOf++) {
            b bVar = this.children.get(indexOf);
            if (bVar.c != null) {
                break;
            }
            if (bVar.d != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private ArrayList<b> findDrawablesBefore(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("a078adea", new Object[]{this, view});
        }
        ArrayList<b> arrayList = null;
        for (int indexOf = this.children.indexOf((b) view.getTag(R.id.layout_manager_flatviewgroup_child_id)) - 1; indexOf >= 0; indexOf--) {
            b bVar = this.children.get(indexOf);
            if (bVar.c != null) {
                break;
            }
            if (bVar.d != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(bVar);
            }
        }
        if (arrayList != null) {
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    public static /* synthetic */ Object ipc$super(FlatViewGroup flatViewGroup, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1952076612:
                return new Boolean(super.drawChild((Canvas) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue()));
            case -1894755994:
                return new Boolean(super.verifyDrawable((Drawable) objArr[0]));
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -579605410:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -572887227:
                super.addView((View) objArr[0]);
                return null;
            case 348684699:
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1811093890:
                super.removeView((View) objArr[0]);
                return null;
            case 1889417753:
                super.setBackgroundDrawable((Drawable) objArr[0]);
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/FlatViewGroup");
        }
    }

    private boolean isLastVisibleChild(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("834e2ed6", new Object[]{this, new Integer(i)})).booleanValue();
        }
        do {
            i++;
            if (i >= getChildCount()) {
                return true;
            }
        } while (getChildAt(i).getVisibility() != 0);
        return false;
    }

    private boolean isPopLayerView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("986ff180", new Object[]{this, view})).booleanValue();
        }
        Iterator<b> it = this.popLayerView.iterator();
        while (it.hasNext()) {
            if (it.next().c == view) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bd6cfdf", new Object[]{this, drawable})).booleanValue();
        }
        Iterator<b> it = this.children.iterator();
        while (it.hasNext()) {
            Drawable[] drawableArr = it.next().d;
            if (drawableArr != null && drawableArr[1] == drawable) {
                return true;
            }
        }
        Iterator<b> it2 = this.popLayerView.iterator();
        while (it2.hasNext()) {
            Drawable[] drawableArr2 = it2.next().d;
            if (drawableArr2 != null && drawableArr2[1] == drawable) {
                return true;
            }
        }
        return false;
    }

    private void notifyPoplayerAppear(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ea7a96d", new Object[]{this, nVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sourcePage", "page");
        hashMap.put("type", "page");
        if (nVar != null) {
            nVar.K().sendMessage(130, nVar, "onpageappear", null, hashMap, null);
        }
    }

    private void notifyPoplayerDisAppear(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb812031", new Object[]{this, nVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sourcePage", "page");
        hashMap.put("type", "page");
        if (nVar != null) {
            nVar.K().sendMessage(130, nVar, "onpagedisappear", null, hashMap, null);
        }
    }

    public void addDrawable(Drawable[] drawableArr, YogaNode yogaNode, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8504acac", new Object[]{this, drawableArr, yogaNode, new Integer(i), new Integer(i2)});
            return;
        }
        b bVar = new b((View) null, drawableArr, yogaNode, i, i2);
        for (Drawable drawable : drawableArr) {
            if (drawable != null) {
                drawable.setCallback(this);
            }
        }
        this.children.add(bVar);
        invalidate();
    }

    public void addFloatView(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b879ec9", new Object[]{this, view, new Boolean(z)});
            return;
        }
        if (this.floatView == null) {
            this.floatView = new ArrayList<>();
        }
        this.floatView.add(new c(view, z));
        super.addView(view);
    }

    public void addPopLayerView(n nVar, YogaNode yogaNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee60c9e", new Object[]{this, nVar, yogaNode});
            return;
        }
        View w0 = nVar.w0();
        b bVar = new b(w0, (Drawable[]) null, yogaNode, 0, 0);
        bVar.a(nVar);
        this.popLayerView.add(bVar);
        w0.setTag(R.id.layout_manager_flatviewgroup_child_id, bVar);
        super.addView(w0);
        Component component = this.component;
        if (component != null && component.getNode().z0()) {
            notifyPoplayerAppear(nVar);
        }
    }

    public void addSizeChangedCallback(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c7ca8f", new Object[]{this, eVar});
            return;
        }
        if (this.sizeChangedCallbacks == null) {
            this.sizeChangedCallbacks = new ArrayList();
        }
        if (!this.sizeChangedCallbacks.contains(eVar)) {
            this.sizeChangedCallbacks.add(eVar);
        }
    }

    public void addView(View view, YogaNode yogaNode, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487b06de", new Object[]{this, view, yogaNode, new Integer(i), new Integer(i2)});
            return;
        }
        b bVar = new b(view, (Drawable[]) null, yogaNode, i, i2);
        this.children.add(bVar);
        view.setTag(R.id.layout_manager_flatviewgroup_child_id, bVar);
        super.addView(view);
    }

    public void addVisibilityChangedCallback(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f316d9b1", new Object[]{this, fVar});
            return;
        }
        if (this.visibilityChangedCallbacks == null) {
            this.visibilityChangedCallbacks = new ArrayList();
        }
        if (!this.visibilityChangedCallbacks.contains(fVar)) {
            this.visibilityChangedCallbacks.add(fVar);
        }
    }

    public void bindComponent(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7273a24", new Object[]{this, component});
            return;
        }
        this.component = component;
        this.measureResult = component.getMeasureResult();
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).setTag(R.id.layout_manager_flatviewgroup_child_id, null);
        }
        removeAllViews();
        this.children.clear();
        this.node = null;
        this.measureResult = null;
        this.floatView = null;
        Iterator<b> it = this.popLayerView.iterator();
        while (it.hasNext()) {
            notifyPoplayerDisAppear(it.next().f12374a);
        }
        this.popLayerView.clear();
        Path path = this.path;
        if (path != null) {
            path.reset();
            this.path = null;
        }
        List<f> list = this.visibilityChangedCallbacks;
        if (list != null) {
            list.clear();
            this.visibilityChangedCallbacks = null;
        }
        List<e> list2 = this.sizeChangedCallbacks;
        if (list2 != null) {
            list2.clear();
            this.sizeChangedCallbacks = null;
        }
        this.highLightInfo = null;
        this.delegateBitmap = null;
        this.delegateCanvas = null;
        this.highLightPaint = null;
        ey8 ey8Var = this.fadingEdge;
        if (ey8Var != null) {
            ey8Var.g(null);
            this.fadingEdge = null;
        }
        this.component = null;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
    }

    public boolean containDrawable(Drawable[] drawableArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c327dc4", new Object[]{this, drawableArr})).booleanValue();
        }
        Iterator<b> it = this.children.iterator();
        while (it.hasNext()) {
            if (it.next().d == drawableArr) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        ey8 ey8Var = this.fadingEdge;
        if (ey8Var == null || !ey8Var.c()) {
            dispatchDrawInternal(canvas);
            return;
        }
        int e2 = this.fadingEdge.e(canvas);
        dispatchDrawInternal(canvas);
        this.fadingEdge.f(canvas);
        this.fadingEdge.d(canvas, e2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
        } else if (this.highLightInfo == null || getWidth() <= 0 || getHeight() <= 0) {
            super.draw(canvas);
        } else {
            try {
                if (this.delegateBitmap == null) {
                    this.delegateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                    this.delegateCanvas = new Canvas(this.delegateBitmap);
                    int[] iArr = new int[2];
                    getLocationOnScreen(iArr);
                    this.highLightInfo.b = new RectF(this.highLightInfo.f12376a);
                    this.highLightInfo.b.offset(-iArr[0], -iArr[1]);
                }
                if (this.highLightPaint == null) {
                    Paint paint = new Paint();
                    this.highLightPaint = paint;
                    paint.setColor(0);
                    this.highLightPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    this.highLightPaint.setFlags(1);
                }
                this.delegateBitmap.eraseColor(0);
                super.draw(this.delegateCanvas);
                d dVar = this.highLightInfo;
                float[] fArr = dVar.d;
                if (fArr == null && dVar.c == 0) {
                    this.delegateCanvas.drawRect(dVar.b, this.highLightPaint);
                } else if (fArr != null) {
                    if (dVar.e == null) {
                        dVar.e = new Path();
                        d dVar2 = this.highLightInfo;
                        dVar2.e.addRoundRect(dVar2.b, dVar2.d, Path.Direction.CW);
                    }
                    this.delegateCanvas.drawPath(this.highLightInfo.e, this.highLightPaint);
                } else {
                    Canvas canvas2 = this.delegateCanvas;
                    RectF rectF = dVar.b;
                    int i = dVar.c;
                    canvas2.drawRoundRect(rectF, i, i, this.highLightPaint);
                }
                canvas.drawBitmap(this.delegateBitmap, 0.0f, 0.0f, (Paint) null);
            } catch (Throwable th) {
                tfs.d("drawHighLight" + th.getMessage());
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<b> findDrawablesAfter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ba5acbc", new Object[]{this, canvas, view, new Long(j)})).booleanValue();
        }
        ArrayList<b> findDrawablesBefore = findDrawablesBefore(view);
        if (findDrawablesBefore != null) {
            drawDrawableChildren(canvas, findDrawablesBefore);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        int indexOfChild = indexOfChild(view);
        if ((indexOfChild == getChildCount() - 1 || isLastVisibleChild(indexOfChild)) && !isPopLayerView(view) && (findDrawablesAfter = findDrawablesAfter(view)) != null) {
            drawDrawableChildren(canvas, findDrawablesAfter);
        }
        return drawChild;
    }

    public void flick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("479a9312", new Object[]{this});
            return;
        }
        this.drawFlicker = true;
        invalidate();
    }

    public Component getComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("c95b6449", new Object[]{this});
        }
        return this.component;
    }

    @Override // tb.mx7.b.a
    public void onBoundChanged(mx7.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c45ad660", new Object[]{this, bVar});
        } else if (this.measureResult != null && bVar == getBackground()) {
            Path path = this.path;
            rbi rbiVar = this.measureResult;
            this.path = bVar.d(path, rbiVar.f27261a, rbiVar.b);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (getAlpha() != 0.0f || !akt.y0()) {
            return !isEnabled();
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        igs.a("flatviewgroup onLayout");
        Iterator<b> it = this.children.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            b next = it.next();
            if (next.c != null) {
                YogaNode yogaNode = next.b;
                if (yogaNode != null) {
                    if (yogaNode.getPositionType() == YogaPositionType.ABSOLUTE) {
                        i9 = (int) (i9 + next.b.getLayoutHeight());
                    }
                    next.c.layout(((int) next.b.getLayoutX()) + next.e, ((int) next.b.getLayoutY()) + next.f, (int) (next.b.getLayoutX() + next.e + next.b.getLayoutWidth()), (int) (next.b.getLayoutY() + next.f + next.b.getLayoutHeight()));
                } else {
                    float f2 = next.g;
                    float f3 = next.h;
                    n nVar = next.f12374a;
                    if (nVar == null || nVar.K() == null) {
                        ViewGroup.LayoutParams layoutParams = next.c.getLayoutParams();
                        if (layoutParams != null) {
                            f2 = layoutParams.width;
                            f3 = layoutParams.height;
                        }
                        int i10 = (int) next.i;
                        int i11 = (int) next.j;
                        i7 = (int) (i10 + f2);
                        i6 = (int) (i11 + f3);
                        i5 = i10;
                        i8 = i11;
                    } else {
                        Component K = next.f12374a.K();
                        i5 = K.getLayoutLeft();
                        i8 = K.getLayoutTop();
                        i7 = K.getLayoutRight();
                        i6 = K.getLayoutBottom();
                    }
                    next.c.layout(i5, i8, i7, i6);
                }
            }
        }
        Iterator<b> it2 = this.popLayerView.iterator();
        while (it2.hasNext()) {
            b next2 = it2.next();
            View view = next2.c;
            if (view != null) {
                YogaNode yogaNode2 = next2.b;
                if (yogaNode2 != null) {
                    if (yogaNode2.getPositionType() == YogaPositionType.ABSOLUTE) {
                        i9 = (int) (i9 + next2.b.getLayoutHeight());
                    }
                    next2.c.layout(((int) next2.b.getLayoutX()) + next2.e, ((int) next2.b.getLayoutY()) + next2.f, (int) (next2.b.getLayoutX() + next2.e + next2.b.getLayoutWidth()), (int) (next2.b.getLayoutY() + next2.f + next2.b.getLayoutHeight()));
                } else {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    float f4 = next2.g;
                    float f5 = next2.h;
                    if (layoutParams2 != null) {
                        f4 = layoutParams2.width;
                        f5 = layoutParams2.height;
                    }
                    View view2 = next2.c;
                    float f6 = next2.i;
                    float f7 = next2.j;
                    view2.layout((int) f6, (int) f7, (int) (f6 + f4), (int) (f7 + f5));
                }
            }
        }
        ArrayList<c> arrayList = this.floatView;
        if (arrayList != null) {
            Iterator<c> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                c next3 = it3.next();
                if (next3.b) {
                    next3.f12375a.layout(0, 0, (int) this.node.getLayoutWidth(), (int) this.node.getLayoutHeight());
                } else {
                    next3.f12375a.layout(0, 0, (int) this.node.getLayoutWidth(), ((int) this.node.getLayoutHeight()) - i9);
                }
            }
        }
        igs.c();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        YogaNode yogaNode = this.node;
        if (yogaNode == null && this.measureResult == null) {
            measureChildren(i, i2);
            setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        } else if (yogaNode != null) {
            measureChildren(i, i2);
            setMeasuredDimension((int) this.node.getLayoutWidth(), (int) this.node.getLayoutHeight());
        } else if (this.measureResult != null) {
            measureChildren(i, i2);
            Component component = this.component;
            if (component != null) {
                int layoutWidth = component.getLayoutWidth();
                int layoutHeight = this.component.getLayoutHeight();
                if (layoutWidth < 0 || layoutHeight < 0) {
                    rbi rbiVar = this.measureResult;
                    setMeasuredDimension(rbiVar.f27261a, rbiVar.b);
                    return;
                }
                setMeasuredDimension(layoutWidth, layoutHeight);
                return;
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null || (i3 = layoutParams.width) <= 0 || (i4 = layoutParams.height) <= 0) {
                rbi rbiVar2 = this.measureResult;
                setMeasuredDimension(rbiVar2.f27261a, rbiVar2.b);
                return;
            }
            setMeasuredDimension(i3, i4);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        List<e> list = this.sizeChangedCallbacks;
        if (list != null) {
            for (e eVar : list) {
                eVar.onSizeChanged(i, i2, i3, i4);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (getAlpha() != 0.0f || !akt.y0()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        List<f> list = this.visibilityChangedCallbacks;
        if (list != null) {
            for (f fVar : list) {
                fVar.onVisibilityChanged(view, i);
            }
        }
    }

    public void removeDrawable(Drawable[] drawableArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398d4010", new Object[]{this, drawableArr});
            return;
        }
        Iterator<b> it = this.children.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            b next = it.next();
            if (next.d == drawableArr) {
                this.children.remove(next);
                break;
            }
        }
        invalidate();
    }

    public void removeSizeChangedCallback(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8409bcf2", new Object[]{this, eVar});
            return;
        }
        List<e> list = this.sizeChangedCallbacks;
        if (list != null) {
            list.remove(eVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf31982", new Object[]{this, view});
            return;
        }
        Iterator<b> it = this.children.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            b next = it.next();
            if (next.c == view) {
                this.children.remove(next);
                view.setTag(R.id.layout_manager_flatviewgroup_child_id, null);
                break;
            }
        }
        ArrayList<c> arrayList = this.floatView;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        Iterator<b> it2 = this.popLayerView.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            b next2 = it2.next();
            if (next2.c == view) {
                this.popLayerView.remove(next2);
                view.setTag(R.id.layout_manager_flatviewgroup_child_id, null);
                notifyPoplayerDisAppear(next2.f12374a);
                break;
            }
        }
        super.removeView(view);
    }

    public void removeVisibilityChangedCallback(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a94f94", new Object[]{this, fVar});
            return;
        }
        List<f> list = this.visibilityChangedCallbacks;
        if (list != null) {
            list.remove(fVar);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709e3a19", new Object[]{this, drawable});
            return;
        }
        super.setBackgroundDrawable(drawable);
        if (drawable == null || !(drawable instanceof mx7.b)) {
            Path path = this.path;
            if (path != null) {
                path.reset();
                return;
            }
            return;
        }
        rbi rbiVar = this.measureResult;
        if (rbiVar != null) {
            this.path = ((mx7.b) drawable).d(this.path, rbiVar.f27261a, rbiVar.b);
        }
    }

    @Override // tb.i5c
    public void setFading(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bad10d0", new Object[]{this, iArr});
            return;
        }
        if (this.fadingEdge == null) {
            this.fadingEdge = new ey8(this);
        }
        this.fadingEdge.a(true);
        this.fadingEdge.g(iArr);
    }

    public void setHitRect(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b706fbd", new Object[]{this, rect});
            return;
        }
        this.hitRect = rect;
        if (rect != null && this.hitRectPaint == null) {
            TextPaint textPaint = new TextPaint();
            this.hitRectPaint = textPaint;
            textPaint.setStrokeWidth(4.0f);
            this.hitRectPaint.setStyle(Paint.Style.STROKE);
            this.hitRectPaint.setColor(tkt.DEFAULT_LINK_COLOR);
        }
    }

    public void setMeasure(rbi rbiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b3496ea", new Object[]{this, rbiVar});
        } else {
            this.measureResult = rbiVar;
        }
    }

    public void setNode(YogaNode yogaNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa979c4", new Object[]{this, yogaNode});
        } else {
            this.node = yogaNode;
        }
    }

    public void sortChildren(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2617880e", new Object[]{this, nVar});
        } else if (this.children.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < this.children.size(); i++) {
                n findChildNodeForCompareNode = findChildNodeForCompareNode(this.children.get(i), nVar);
                if (findChildNodeForCompareNode != null) {
                    arrayList.add(new Pair(Integer.valueOf(i), Integer.valueOf(((ArrayList) nVar.d).indexOf(findChildNodeForCompareNode))));
                    arrayList2.add(Integer.valueOf(i));
                }
            }
            Collections.sort(arrayList, childComparator);
            int size = arrayList2.size();
            b[] bVarArr = new b[this.children.size()];
            for (int i2 = 0; i2 < size; i2++) {
                int intValue = ((Integer) arrayList2.get(i2)).intValue();
                bVarArr[intValue] = this.children.get(intValue);
            }
            boolean z = false;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue2 = ((Integer) arrayList2.get(i3)).intValue();
                b bVar = bVarArr[((Integer) ((Pair) arrayList.get(i3)).first).intValue()];
                if (this.children.set(intValue2, bVar) != bVar) {
                    z = true;
                }
            }
            if (z) {
                removeAllViews();
                Iterator<b> it = this.children.iterator();
                while (it.hasNext()) {
                    addView(it.next());
                }
                Iterator<b> it2 = this.popLayerView.iterator();
                while (it2.hasNext()) {
                    addView(it2.next());
                }
                requestLayout();
                invalidate();
            }
        }
    }

    public void updateNewPositionForDrawable(Drawable[] drawableArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492c568b", new Object[]{this, drawableArr, new Integer(i), new Integer(i2)});
            return;
        }
        Iterator<b> it = this.children.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.d == drawableArr) {
                if (next.i != next.b.getLayoutX() || next.j != next.b.getLayoutY() || i != next.e || i2 != next.f || next.b.getLayoutWidth() != next.g || next.b.getLayoutHeight() != next.h) {
                    next.e = i;
                    next.f = i2;
                    next.g = next.b.getLayoutWidth();
                    next.h = next.b.getLayoutHeight();
                    next.i = next.b.getLayoutX();
                    next.j = next.b.getLayoutY();
                    invalidate();
                    return;
                }
                return;
            }
        }
    }

    public void updateNewPositionForView(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad06dd", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        Iterator<b> it = this.children.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.c == view) {
                float f2 = i;
                if (next.i != f2 || next.j != i2 || next.g != i3 || next.h != i4) {
                    next.g = i3;
                    next.h = i4;
                    next.i = f2;
                    next.j = i2;
                    requestLayout();
                    invalidate();
                    return;
                }
                return;
            }
        }
        Iterator<b> it2 = this.popLayerView.iterator();
        while (it2.hasNext()) {
            b next2 = it2.next();
            if (next2.c == view) {
                float f3 = i;
                if (next2.i != f3 || next2.j != i2 || next2.g != i3 || next2.h != i4) {
                    next2.g = i3;
                    next2.h = i4;
                    next2.i = f3;
                    next2.j = i2;
                    requestLayout();
                    invalidate();
                    return;
                }
                return;
            }
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue();
        }
        if (super.verifyDrawable(drawable) || isValidDrawable(drawable)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        RectF rectF;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            d dVar = this.highLightInfo;
            if (!(dVar == null || (rectF = dVar.f12376a) == null || !rectF.contains(rawX, rawY))) {
                Component component = this.component;
                if (component != null) {
                    component.sendMessage(component.getNode(), "onhighlightclick", null, null, null);
                }
                return false;
            }
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    public void setHighLightArea(Map map) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97427bf", new Object[]{this, map});
            return;
        }
        if (map != null) {
            if (this.highLightInfo == null) {
                d dVar = new d(null);
                this.highLightInfo = dVar;
                dVar.f12376a = new RectF();
            }
            int t = nwv.t(map.get(WXGestureType.GestureInfo.SCREEN_X), 0);
            int t2 = nwv.t(map.get(WXGestureType.GestureInfo.SCREEN_Y), 0);
            int t3 = nwv.t(map.get("width"), 0) + t;
            int t4 = nwv.t(map.get("height"), 0) + t2;
            RectF rectF = this.highLightInfo.f12376a;
            float f2 = t;
            if (rectF.left != f2) {
                rectF.left = f2;
                z = true;
            } else {
                z = false;
            }
            float f3 = t2;
            if (rectF.top != f3) {
                rectF.top = f3;
                z = true;
            }
            float f4 = t3;
            if (rectF.right != f4) {
                rectF.right = f4;
                z = true;
            }
            float f5 = t4;
            if (rectF.bottom != f5) {
                rectF.bottom = f5;
                z = true;
            }
            Object obj = map.get(pg1.ATOM_EXT_UDL_border_radius);
            if (obj != null) {
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (list.size() == 1) {
                        int t5 = nwv.t(list.get(0), 0);
                        d dVar2 = this.highLightInfo;
                        if (dVar2.c != t5) {
                            dVar2.c = t5;
                        }
                    } else if (list.size() == 4) {
                        float r = nwv.r(list.get(0), 0);
                        float r2 = nwv.r(list.get(1), 0);
                        float r3 = nwv.r(list.get(2), 0);
                        float r4 = nwv.r(list.get(3), 0);
                        d dVar3 = this.highLightInfo;
                        if (dVar3.d == null) {
                            dVar3.d = new float[8];
                        }
                        float[] fArr = dVar3.d;
                        if (fArr[0] != r) {
                            fArr[1] = r;
                            fArr[0] = r;
                            z = true;
                        }
                        if (fArr[2] != r2) {
                            fArr[3] = r2;
                            fArr[2] = r2;
                            z = true;
                        }
                        if (fArr[4] != r3) {
                            fArr[5] = r3;
                            fArr[4] = r3;
                            z = true;
                        }
                        if (fArr[6] != r4) {
                            fArr[7] = r4;
                            fArr[6] = r4;
                        }
                    }
                } else if (obj instanceof Number) {
                    int t6 = nwv.t(obj, 0);
                    d dVar4 = this.highLightInfo;
                    if (dVar4.c != t6) {
                        dVar4.c = t6;
                    }
                }
            }
        } else {
            d dVar5 = this.highLightInfo;
            this.highLightInfo = null;
            if (dVar5 == null) {
                z = false;
            }
        }
        if (z) {
            this.delegateBitmap = null;
            invalidate();
        }
    }

    public void addFloatView(View view, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56cad5a", new Object[]{this, view, new Boolean(z), new Integer(i)});
            return;
        }
        if (this.floatView == null) {
            this.floatView = new ArrayList<>();
        }
        this.floatView.add(new c(view, z));
        super.addView(view, i);
    }

    public void addView(View view, int i, int i2, int i3, int i4, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30c3906d", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), nVar});
            return;
        }
        b bVar = new b(view, i, i2, i3, i4);
        bVar.a(nVar);
        this.children.add(bVar);
        view.setTag(R.id.layout_manager_flatviewgroup_child_id, bVar);
        super.addView(view);
    }

    public void addDrawable(Drawable[] drawableArr, int i, int i2, int i3, int i4, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b47142df", new Object[]{this, drawableArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), nVar});
            return;
        }
        b bVar = new b(drawableArr, i, i2, i3, i4);
        bVar.a(nVar);
        for (Drawable drawable : drawableArr) {
            if (drawable != null) {
                drawable.setCallback(this);
            }
        }
        this.children.add(bVar);
        invalidate();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public n f12374a;
        public final YogaNode b;
        public final View c;
        public final Drawable[] d;
        public int e;
        public int f;
        public float g;
        public float h;
        public float i;
        public float j;

        static {
            t2o.a(503317456);
        }

        public b(View view, Drawable[] drawableArr, YogaNode yogaNode, int i, int i2) {
            this.c = view;
            this.d = drawableArr;
            this.b = yogaNode;
            this.e = i;
            this.f = i2;
            this.g = yogaNode.getLayoutWidth();
            this.h = yogaNode.getLayoutHeight();
            this.i = yogaNode.getLayoutX();
            this.j = yogaNode.getLayoutY();
        }

        public void a(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddc148d7", new Object[]{this, nVar});
            } else {
                this.f12374a = nVar;
            }
        }

        public b(View view, int i, int i2, int i3, int i4) {
            this.c = view;
            this.g = i3;
            this.h = i4;
            this.i = i;
            this.j = i2;
        }

        public b(Drawable[] drawableArr, int i, int i2, int i3, int i4) {
            this.d = drawableArr;
            this.g = i3;
            this.h = i4;
            this.i = i;
            this.j = i2;
        }
    }

    public void addView(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6dd6d85", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            addView(view, i, i2, i3, i4, null);
        }
    }

    private void addView(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e9ae33c", new Object[]{this, bVar});
            return;
        }
        View view = bVar.c;
        if (view != null) {
            super.addView(view);
        }
    }

    public void updateNewPositionForDrawable(Drawable[] drawableArr, int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40697809", new Object[]{this, drawableArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
            return;
        }
        Iterator<b> it = this.children.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.d == drawableArr) {
                float f2 = i;
                if (next.i != f2 || next.j != i2 || next.g != i3 || next.h != i4) {
                    next.g = i3;
                    next.h = i4;
                    next.i = f2;
                    next.j = i2;
                    invalidate();
                    return;
                } else if (z) {
                    invalidate();
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public void updateNewPositionForView(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532021bd", new Object[]{this, view, new Integer(i), new Integer(i2)});
            return;
        }
        Iterator<b> it = this.children.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.c == view) {
                if (next.i != next.b.getLayoutX() || next.j != next.b.getLayoutY() || i != next.e || i2 != next.f || next.b.getLayoutWidth() != next.g || next.b.getLayoutHeight() != next.h) {
                    next.e = i;
                    next.f = i2;
                    next.g = next.b.getLayoutWidth();
                    next.h = next.b.getLayoutHeight();
                    next.i = next.b.getLayoutX();
                    next.j = next.b.getLayoutY();
                    requestLayout();
                    invalidate();
                    return;
                }
                return;
            }
        }
    }
}
