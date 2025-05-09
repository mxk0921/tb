package io.unicorn.embedding.engine.mutatorsstack;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import io.unicorn.embedding.android.AndroidTouchProcessor;
import tb.t2o;
import tb.wgw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class UnicornMutatorView extends FrameLayout {
    ViewTreeObserver.OnGlobalFocusChangeListener activeFocusListener;
    private final AndroidTouchProcessor androidTouchProcessor;
    private int left;
    private FlutterMutatorsStack mutatorsStack;
    private int prevLeft;
    private int prevTop;
    private float screenDensity;
    private int top;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View.OnFocusChangeListener f15198a;
        public final /* synthetic */ View b;

        public a(UnicornMutatorView unicornMutatorView, View.OnFocusChangeListener onFocusChangeListener, View view) {
            this.f15198a = onFocusChangeListener;
            this.b = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            View view3 = this.b;
            this.f15198a.onFocusChange(view3, wgw.b(view3));
        }
    }

    static {
        t2o.a(945815708);
    }

    public UnicornMutatorView(Context context, float f, AndroidTouchProcessor androidTouchProcessor) {
        super(context, null);
        this.screenDensity = f;
        this.androidTouchProcessor = androidTouchProcessor;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.mutatorsStack.getFinalMatrix());
        float f = this.screenDensity;
        matrix.preScale(1.0f / f, 1.0f / f);
        matrix.postTranslate(-this.left, -this.top);
        return matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        for (Path path : this.mutatorsStack.getFinalClippingPaths()) {
            Path path2 = new Path(path);
            path2.offset(-this.left, -this.top);
            canvas.clipPath(path2);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.prevLeft = i;
        this.prevTop = i2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.androidTouchProcessor == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i = this.left;
            this.prevLeft = i;
            int i2 = this.top;
            this.prevTop = i2;
            matrix.postTranslate(i, i2);
        } else if (action != 2) {
            matrix.postTranslate(this.left, this.top);
        } else {
            matrix.postTranslate(this.prevLeft, this.prevTop);
            this.prevLeft = this.left;
            this.prevTop = this.top;
        }
        this.androidTouchProcessor.f(motionEvent, matrix);
        return true;
    }

    public void readyToDisplay(FlutterMutatorsStack flutterMutatorsStack, int i, int i2, int i3, int i4) {
        this.mutatorsStack = flutterMutatorsStack;
        this.left = i;
        this.top = i2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        unsetOnDescendantFocusChangeListener();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.activeFocusListener == null) {
            a aVar = new a(this, onFocusChangeListener, this);
            this.activeFocusListener = aVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(aVar);
        }
    }

    public void unsetOnDescendantFocusChangeListener() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (onGlobalFocusChangeListener = this.activeFocusListener) != null) {
            this.activeFocusListener = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    public UnicornMutatorView(Context context) {
        this(context, 1.0f, null);
    }
}
