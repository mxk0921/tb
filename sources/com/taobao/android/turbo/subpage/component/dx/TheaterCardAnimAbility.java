package com.taobao.android.turbo.subpage.component.dx;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.view.DXNativeLinearLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView;
import tb.b65;
import tb.c8;
import tb.k8;
import tb.m8;
import tb.n8;
import tb.t2o;
import tb.tfs;
import tb.tk6;
import tb.u8;
import tb.w8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TheaterCardAnimAbility extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TheaterCardAnim";
    public static final long THEATERCARDANIM = -7443121581807140869L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(916455760);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public TheaterCardAnimAbility build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TheaterCardAnimAbility) ipChange.ipc$dispatch("a96ee417", new Object[]{this, obj});
            }
            return new TheaterCardAnimAbility();
        }
    }

    static {
        t2o.a(916455759);
    }

    public static /* synthetic */ Object ipc$super(TheaterCardAnimAbility theaterCardAnimAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/subpage/component/dx/TheaterCardAnimAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        try {
            DXRootView o = ((tk6) k8Var).o();
            ((DXRecyclerView) DxVideoControlHelper.r(o.getFlattenWidgetNode().queryWidgetNodeByUserId(n8Var.i("listId")).getWRView().get(), DXRecyclerView.class)).addItemDecoration(new CardAnimDecoration(this, n8Var, i(o, n8Var.e("listTop"))));
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final Paint i(DXRootView dXRootView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint) ipChange.ipc$dispatch("3462323e", new Object[]{this, dXRootView, new Integer(i)});
        }
        try {
            View view = dXRootView.getFlattenWidgetNode().queryWidgetNodeByUserId("bgImage").getWRView().get();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(drawingCache, tileMode, tileMode);
            Matrix matrix = new Matrix();
            matrix.setTranslate(0.0f, b65.a(-i));
            bitmapShader.setLocalMatrix(matrix);
            Paint paint = new Paint(1);
            paint.setShader(bitmapShader);
            return paint;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class CardAnimDecoration extends RecyclerView.ItemDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float f9810a;
        public ValueAnimator b;
        public RecyclerView c;
        public ViewGroup d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;
        public final int l;
        public final Paint m;
        public final PorterDuffXfermode n;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f9811a;

            public a(boolean z) {
                this.f9811a = z;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float f;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                CardAnimDecoration cardAnimDecoration = CardAnimDecoration.this;
                if (this.f9811a) {
                    f = 1.0f - valueAnimator.getAnimatedFraction();
                } else {
                    f = valueAnimator.getAnimatedFraction();
                }
                cardAnimDecoration.f9810a = f;
                CardAnimDecoration.this.c.invalidateItemDecorations();
            }
        }

        static {
            t2o.a(916455761);
        }

        public CardAnimDecoration(TheaterCardAnimAbility theaterCardAnimAbility, n8 n8Var, Paint paint) {
            this.g = n8Var.e("animIndex");
            this.e = n8Var.e("bigCardH");
            this.l = n8Var.e("videoCardH");
            this.f = n8Var.e("smallCardH");
            this.h = n8Var.e("cardCount");
            int e = n8Var.e("itemGap");
            this.i = e;
            String i = n8Var.i("gapColor");
            this.j = n8Var.e("cardRadius");
            this.k = n8Var.e("animDuration");
            if (paint == null) {
                paint = new Paint();
                paint.setColor(Color.parseColor(i));
            }
            paint.setStrokeWidth(e * 2);
            this.m = paint;
            this.n = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
        }

        public static /* synthetic */ Object ipc$super(CardAnimDecoration cardAnimDecoration, String str, Object... objArr) {
            if (str.hashCode() == 285712922) {
                super.onDrawOver((Canvas) objArr[0], (RecyclerView) objArr[1], (RecyclerView.State) objArr[2]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/subpage/component/dx/TheaterCardAnimAbility$CardAnimDecoration");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int i;
            int i2;
            float f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
                return;
            }
            try {
                this.c = recyclerView;
                float width = (recyclerView.getWidth() - (this.i * 6)) / 2;
                float width2 = (width * 1.0f) / (recyclerView.getWidth() - (this.i * 4));
                float f2 = (this.f * 1.0f) / this.e;
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                int i3 = this.g;
                if (childAdapterPosition == i3 - 1) {
                    rect.set(0, 1, 0, 0);
                } else if (childAdapterPosition == i3) {
                    StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
                    int i4 = this.f;
                    float f3 = this.f9810a;
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = (int) (((i4 * f3) + ((this.e - (i4 - this.l)) * (1.0f - f3))) - (f3 * 1.0f));
                    float width3 = recyclerView.getWidth() - (this.i * 4);
                    float f4 = this.f9810a;
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = (int) ((width3 * (1.0f - f4)) + (width * f4));
                    view.setLayoutParams(layoutParams);
                    DXNativeLinearLayout dXNativeLinearLayout = (DXNativeLinearLayout) ((ViewGroup) view).getChildAt(0);
                    DXWidgetNode dXWidgetNode = (DXWidgetNode) dXNativeLinearLayout.getTag(DXWidgetNode.TAG_WIDGET_NODE);
                    if (this.f9810a == 0.0f) {
                        int layoutWidth = dXWidgetNode.getLayoutWidth();
                        int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                        if (layoutWidth != i5) {
                            dXWidgetNode.setLayoutWidth(i5);
                            dXWidgetNode.setLayoutHeight(((ViewGroup.MarginLayoutParams) layoutParams).height);
                            dXWidgetNode.measure(View.MeasureSpec.makeMeasureSpec(((ViewGroup.MarginLayoutParams) layoutParams).width, 1073741824), View.MeasureSpec.makeMeasureSpec(((ViewGroup.MarginLayoutParams) layoutParams).height, 1073741824));
                            dXWidgetNode.getReferenceNode().setMeasuredDimension(dXWidgetNode.getMeasuredWidth(), dXWidgetNode.getMeasuredHeight());
                        }
                    }
                    this.d = (ViewGroup) dXNativeLinearLayout.getChildAt(dXNativeLinearLayout.getChildCount() - 1);
                    View childAt = dXNativeLinearLayout.getChildAt(0);
                    childAt.setPivotX(0.0f);
                    childAt.setPivotY(0.0f);
                    float f5 = this.f9810a;
                    childAt.setScaleX((1.0f - f5) + (width2 * f5));
                    childAt.setScaleY((1.0f - f5) + (f2 * f5));
                    float f6 = 2.0f - this.f9810a;
                    int i6 = this.i;
                    rect.set((int) (((int) (((-recyclerView.getWidth()) / ((StaggeredGridLayoutManager) recyclerView.getLayoutManager()).getSpanCount()) * (1.0f - f))) + (f6 * i6)), i6 * 2, i6 * 2, i6);
                    ViewGroup viewGroup = this.d;
                    if (viewGroup != null) {
                        viewGroup.setTranslationY((-((this.l + (this.i * 3)) - 1)) * this.f9810a);
                        if (this.d.getChildCount() == 2) {
                            float f7 = this.f9810a;
                            if (f7 == 1.0f || f7 == 0.0f) {
                                this.d.getChildAt(0).setAlpha(1.0f - this.f9810a);
                                this.d.getChildAt(1).setAlpha(this.f9810a);
                            }
                        }
                    }
                } else if (childAdapterPosition == i3 + 1) {
                    int i7 = this.i;
                    float f8 = this.f9810a;
                    rect.set(i7 * 2, (int) (((((this.e - (this.f - this.l)) * (1.0f - f8)) + (i7 * 2)) + (((1.0f - f8) * 2.0f) * i7)) - 1.0f), i7, i7);
                } else {
                    int i8 = this.h;
                    if (childAdapterPosition < (i3 - 1) + i8 && childAdapterPosition > i3 - 1) {
                        if (childAdapterPosition == (i3 - 2) + i8) {
                            StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
                            ((ViewGroup.MarginLayoutParams) layoutParams2).height = (int) (this.f * this.f9810a);
                            view.setLayoutParams(layoutParams2);
                            view.setAlpha(this.f9810a);
                            int i9 = this.i;
                            float f9 = this.f9810a;
                            rect.set(i9 * 2, (int) (i9 * f9), i9, (int) (i9 * f9));
                            return;
                        }
                        if ((childAdapterPosition - i3) % 2 == 0) {
                            i = this.i;
                        } else {
                            i = this.i * 2;
                        }
                        int i10 = this.i;
                        if ((childAdapterPosition - i3) % 2 == 0) {
                            i2 = i10 * 2;
                        } else {
                            i2 = i10;
                        }
                        rect.set(i, i10, i2, i10);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            RecyclerView recyclerView2 = recyclerView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1107a21a", new Object[]{this, canvas, recyclerView2, state});
                return;
            }
            super.onDrawOver(canvas, recyclerView, state);
            try {
                int childCount = recyclerView.getChildCount();
                int width = (recyclerView.getWidth() - (this.i * 6)) / 2;
                int i6 = this.e - (this.f - this.l);
                int i7 = 0;
                while (i7 < childCount) {
                    View childAt = recyclerView2.getChildAt(i7);
                    int childAdapterPosition = recyclerView2.getChildAdapterPosition(childAt);
                    int i8 = this.g;
                    if (childAdapterPosition == i8) {
                        int top = childAt.getTop();
                        int i9 = this.l;
                        int i10 = this.i + top + i9;
                        float f = this.f9810a;
                        int i11 = (int) ((i6 * (1.0f - f)) + (i9 * f));
                        int i12 = this.l;
                        float f2 = this.f9810a;
                        float top2 = (int) (childAt.getTop() + (((i12 * 2) + (this.i * 2)) * (1.0f - f2)) + (i12 * f2));
                        canvas.drawLine(recyclerView.getWidth() / 2, childAt.getTop(), recyclerView.getWidth() / 2, top2, this.m);
                        canvas.drawLine(recyclerView.getWidth() - this.i, childAt.getTop(), recyclerView.getWidth() - this.i, top2, this.m);
                        int saveLayer = canvas.saveLayer(new RectF((recyclerView.getWidth() / 2) - this.i, childAt.getTop(), recyclerView.getWidth() - (this.i * 2), childAt.getTop() + i11), null, 31);
                        float f3 = i10;
                        canvas.drawLine(recyclerView.getWidth() / 2, f3, recyclerView.getWidth() - (this.i * 2), f3, this.m);
                        int[] iArr = {(recyclerView.getWidth() / 2) + this.i, (recyclerView.getWidth() / 2) + this.i};
                        int[] iArr2 = {childAt.getTop(), i10 + this.i};
                        for (int i13 = 0; i13 < 2; i13++) {
                            int i14 = iArr[i13];
                            int i15 = iArr2[i13];
                            int i16 = this.j;
                            canvas.drawArc(new RectF(i14, i15, i14 + (i16 * 2), i15 + (i16 * 2)), -180.0f, 90.0f, true, this.m);
                            int i17 = iArr[i13];
                            int i18 = this.j;
                            canvas.drawArc(new RectF((i17 + width) - (i18 * 2), iArr2[i13], i17 + width, i5 + (i18 * 2)), -90.0f, 90.0f, true, this.m);
                            int i19 = iArr[i13];
                            int i20 = iArr2[i13];
                            int i21 = this.l;
                            int i22 = this.j;
                            canvas.drawArc(new RectF(i19, (i20 + i21) - (i22 * 2), i19 + (i22 * 2), i20 + i21), 90.0f, 90.0f, true, this.m);
                            int i23 = iArr[i13];
                            int i24 = this.j;
                            int i25 = iArr2[i13];
                            int i26 = this.l;
                            canvas.drawArc(new RectF((i23 + width) - (i24 * 2), (i25 + i26) - (i24 * 2), i23 + width, i25 + i26), 0.0f, 90.0f, true, this.m);
                        }
                        this.m.setXfermode(this.n);
                        for (int i27 = 0; i27 < 2; i27++) {
                            int i28 = iArr[i27];
                            int i29 = iArr2[i27];
                            int i30 = this.j;
                            canvas.drawRect(i28, i29, i28 + i30, i29 + i30, this.m);
                            int i31 = iArr[i27];
                            int i32 = this.j;
                            canvas.drawRect((i31 + width) - i32, iArr2[i27], i31 + width, i4 + i32, this.m);
                            int i33 = iArr[i27];
                            int i34 = iArr2[i27];
                            int i35 = this.l;
                            int i36 = this.j;
                            canvas.drawRect(i33, (i34 + i35) - i36, i33 + i36, i34 + i35, this.m);
                            int i37 = iArr[i27];
                            int i38 = this.j;
                            int i39 = iArr2[i27];
                            int i40 = this.l;
                            canvas.drawRect((i37 + width) - i38, (i39 + i40) - i38, i37 + width, i39 + i40, this.m);
                        }
                        this.m.setXfermode(null);
                        canvas.restoreToCount(saveLayer);
                    } else if (childAdapterPosition == i8 + 1) {
                        View childAt2 = recyclerView2.getChildAt(i7 - 1);
                        if (childAt2 != null) {
                            int top3 = childAt2.getTop() + this.l + this.i;
                            float f4 = this.f9810a;
                            int saveLayer2 = canvas.saveLayer(new RectF(this.i * 2, childAt2.getTop(), recyclerView.getWidth() / 2, (childAt2.getTop() + ((int) ((((i6 * (1.0f - f4)) + (i * 2)) + (((1.0f - f4) * 2.0f) * i)) - 1.0f))) - this.i), null, 31);
                            float f5 = top3;
                            canvas.drawLine(this.i * 2, f5, recyclerView.getWidth() / 2, f5, this.m);
                            int i41 = this.i;
                            int[] iArr3 = {i41 * 2, i41 * 2};
                            int[] iArr4 = {childAt2.getTop(), top3 + this.i};
                            for (int i42 = 0; i42 < 2; i42++) {
                                int i43 = iArr3[i42];
                                int i44 = iArr4[i42];
                                int i45 = this.j;
                                canvas.drawArc(new RectF(i43, i44, i43 + (i45 * 2), i44 + (i45 * 2)), -180.0f, 90.0f, true, this.m);
                                int i46 = iArr3[i42];
                                int i47 = this.j;
                                canvas.drawArc(new RectF((i46 + width) - (i47 * 2), iArr4[i42], i46 + width, i3 + (i47 * 2)), -90.0f, 90.0f, true, this.m);
                                int i48 = iArr3[i42];
                                int i49 = iArr4[i42];
                                int i50 = this.l;
                                int i51 = this.j;
                                canvas.drawArc(new RectF(i48, (i49 + i50) - (i51 * 2), i48 + (i51 * 2), i49 + i50), 90.0f, 90.0f, true, this.m);
                                int i52 = iArr3[i42];
                                int i53 = this.j;
                                int i54 = iArr4[i42];
                                int i55 = this.l;
                                canvas.drawArc(new RectF((i52 + width) - (i53 * 2), (i54 + i55) - (i53 * 2), i52 + width, i54 + i55), 0.0f, 90.0f, true, this.m);
                            }
                            this.m.setXfermode(this.n);
                            for (int i56 = 0; i56 < 2; i56++) {
                                int i57 = iArr3[i56];
                                int i58 = iArr4[i56];
                                int i59 = this.j;
                                canvas.drawRect(i57, i58, i57 + i59, i58 + i59, this.m);
                                int i60 = iArr3[i56];
                                int i61 = this.j;
                                canvas.drawRect((i60 + width) - i61, iArr4[i56], i60 + width, i2 + i61, this.m);
                                int i62 = iArr3[i56];
                                int i63 = iArr4[i56];
                                int i64 = this.l;
                                int i65 = this.j;
                                canvas.drawRect(i62, (i63 + i64) - i65, i62 + i65, i63 + i64, this.m);
                                int i66 = iArr3[i56];
                                int i67 = this.j;
                                int i68 = iArr4[i56];
                                int i69 = this.l;
                                canvas.drawRect((i66 + width) - i67, (i68 + i69) - i67, i66 + width, i68 + i69, this.m);
                            }
                            this.m.setXfermode(null);
                            canvas.restoreToCount(saveLayer2);
                        } else {
                            return;
                        }
                    }
                    i7++;
                    recyclerView2 = recyclerView;
                }
            } catch (Throwable th) {
                th.printStackTrace();
                tfs.d("onDrawOverError:" + th.getMessage());
            }
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a8d797d", new Object[]{this, new Boolean(z)});
                return;
            }
            RecyclerView recyclerView = this.c;
            if (recyclerView != null) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof StaggeredGridLayoutManager) {
                    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                    int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
                    staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
                    int i = iArr[1];
                    if (i > this.g) {
                        tfs.e(TheaterCardAnimAbility.TAG, "主卡片是第一个可见卡片才能执行动画: firstVisibleItemPosition:" + i + " animIndex:" + this.g);
                        return;
                    }
                }
                ValueAnimator valueAnimator = this.b;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.b = valueAnimator2;
                valueAnimator2.setIntValues(0, 1);
                this.b.setDuration(this.k);
                this.b.addUpdateListener(new a(z));
                this.b.start();
            }
        }
    }
}
