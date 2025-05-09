package androidx.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewKt;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.acp;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.pg1;
import tb.sbp;
import tb.wbp;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\u0007\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\t\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\t\u0010\b\u001a9\u0010\u000b\u001a\u00020\n*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\r\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\r\u0010\b\u001a9\u0010\u000e\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\u000e\u0010\b\u001a<\u0010\u0014\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000f2\b\b\u0003\u0010\u0012\u001a\u00020\u000f2\b\b\u0003\u0010\u0013\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a<\u0010\u0018\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u0010\u0016\u001a\u00020\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000f2\b\b\u0003\u0010\u0017\u001a\u00020\u000f2\b\b\u0003\u0010\u0013\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b\u0018\u0010\u0015\u001a\u001e\u0010\u001a\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0019\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a,\u0010 \u001a\u00020\u001f*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eH\u0086\b¢\u0006\u0004\b \u0010!\u001a'\u0010\"\u001a\u00020\u001f*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e¢\u0006\u0004\b\"\u0010!\u001a\u001b\u0010&\u001a\u00020%*\u00020\u00002\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'\u001a-\u0010+\u001a\u00020\u0005*\u00020\u00002\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b)H\u0086\b¢\u0006\u0004\b+\u0010\b\u001a9\u0010+\u001a\u00020\u0005\"\n\b\u0000\u0010,\u0018\u0001*\u00020(*\u00020\u00002\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b)H\u0087\b¢\u0006\u0004\b-\u0010\b\"*\u00100\u001a\u00020.*\u00020\u00002\u0006\u0010/\u001a\u00020.8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103\"*\u00104\u001a\u00020.*\u00020\u00002\u0006\u0010/\u001a\u00020.8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00101\"\u0004\b5\u00103\"*\u00106\u001a\u00020.*\u00020\u00002\u0006\u0010/\u001a\u00020.8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00101\"\u0004\b7\u00103\"\u0016\u0010:\u001a\u00020\u000f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b8\u00109\"\u0016\u0010<\u001a\u00020\u000f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b;\u00109\"\u0016\u0010>\u001a\u00020\u000f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b=\u00109\"\u0016\u0010@\u001a\u00020\u000f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b?\u00109\"\u0016\u0010B\u001a\u00020\u000f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\bA\u00109\"\u0016\u0010D\u001a\u00020\u000f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\bC\u00109\"\u001b\u0010I\u001a\b\u0012\u0004\u0012\u00020F0E*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bG\u0010H\"\u001b\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00000E*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bJ\u0010H¨\u0006L"}, d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "view", "Ltb/xhv;", "action", "doOnNextLayout", "(Landroid/view/View;Ltb/g1a;)V", "doOnLayout", "Landroidx/core/view/OneShotPreDrawListener;", "doOnPreDraw", "(Landroid/view/View;Ltb/g1a;)Landroidx/core/view/OneShotPreDrawListener;", "doOnAttach", "doOnDetach", "", "start", "top", "end", "bottom", "updatePaddingRelative", "(Landroid/view/View;IIII)V", "left", "right", "updatePadding", "size", "setPadding", "(Landroid/view/View;I)V", "", "delayInMillis", "Lkotlin/Function0;", "Ljava/lang/Runnable;", "postDelayed", "(Landroid/view/View;JLtb/d1a;)Ljava/lang/Runnable;", "postOnAnimationDelayed", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "drawToBitmap", "(Landroid/view/View;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "Landroid/view/ViewGroup$LayoutParams;", "Lkotlin/ExtensionFunctionType;", pg1.ATOM_EXT_block, "updateLayoutParams", "T", "updateLayoutParamsTyped", "", "value", "isVisible", "(Landroid/view/View;)Z", "setVisible", "(Landroid/view/View;Z)V", "isInvisible", "setInvisible", "isGone", "setGone", "getMarginLeft", "(Landroid/view/View;)I", "marginLeft", "getMarginTop", "marginTop", "getMarginRight", "marginRight", "getMarginBottom", "marginBottom", "getMarginStart", "marginStart", "getMarginEnd", "marginEnd", "Ltb/sbp;", "Landroid/view/ViewParent;", "getAncestors", "(Landroid/view/View;)Ltb/sbp;", "ancestors", "getAllViews", "allViews", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ViewKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final void doOnAttach(final View view, final g1a<? super View, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2110f22", new Object[]{view, g1aVar});
        } else if (view.isAttachedToWindow()) {
            g1aVar.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt$doOnAttach$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3d337638", new Object[]{this, view2});
                        return;
                    }
                    view.removeOnAttachStateChangeListener(this);
                    g1aVar.invoke(view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view2});
                    }
                }
            });
        }
    }

    public static final void doOnDetach(final View view, final g1a<? super View, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77390614", new Object[]{view, g1aVar});
        } else if (!view.isAttachedToWindow()) {
            g1aVar.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt$doOnDetach$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3d337638", new Object[]{this, view2});
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view2});
                        return;
                    }
                    view.removeOnAttachStateChangeListener(this);
                    g1aVar.invoke(view2);
                }
            });
        }
    }

    public static final void doOnLayout(View view, final g1a<? super View, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4fa49d", new Object[]{view, g1aVar});
        } else if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt$doOnLayout$$inlined$doOnNextLayout$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("899df952", new Object[]{this, view2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                        return;
                    }
                    view2.removeOnLayoutChangeListener(this);
                    g1a.this.invoke(view2);
                }
            });
        } else {
            g1aVar.invoke(view);
        }
    }

    public static final void doOnNextLayout(View view, final g1a<? super View, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5432236a", new Object[]{view, g1aVar});
        } else {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt$doOnNextLayout$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("899df952", new Object[]{this, view2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                        return;
                    }
                    view2.removeOnLayoutChangeListener(this);
                    g1aVar.invoke(view2);
                }
            });
        }
    }

    public static final OneShotPreDrawListener doOnPreDraw(final View view, final g1a<? super View, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OneShotPreDrawListener) ipChange.ipc$dispatch("6d564a", new Object[]{view, g1aVar});
        }
        return OneShotPreDrawListener.add(view, new Runnable() { // from class: androidx.core.view.ViewKt$doOnPreDraw$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    g1aVar.invoke(view);
                }
            }
        });
    }

    public static final Bitmap drawToBitmap(View view, Bitmap.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("e5f51677", new Object[]{view, config});
        }
        if (view.isLaidOut()) {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-view.getScrollX(), -view.getScrollY());
            view.draw(canvas);
            return createBitmap;
        }
        throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
    }

    public static /* synthetic */ Bitmap drawToBitmap$default(View view, Bitmap.Config config, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("cc32a21", new Object[]{view, config, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return drawToBitmap(view, config);
    }

    public static final sbp<View> getAllViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sbp) ipChange.ipc$dispatch("5b7aeaad", new Object[]{view});
        }
        return wbp.b(new ViewKt$allViews$1(view, null));
    }

    public static final sbp<ViewParent> getAncestors(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sbp) ipChange.ipc$dispatch("2a620e06", new Object[]{view});
        }
        return acp.f(view.getParent(), ViewKt$ancestors$1.INSTANCE);
    }

    public static final int getMarginEnd(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f2b7167", new Object[]{view})).intValue();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        }
        return 0;
    }

    public static final int getMarginLeft(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("336901b3", new Object[]{view})).intValue();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int getMarginStart(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6dc14d00", new Object[]{view})).intValue();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        }
        return 0;
    }

    public static final boolean isGone(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("242aede6", new Object[]{view})).booleanValue();
        }
        if (view.getVisibility() == 8) {
            return true;
        }
        return false;
    }

    public static final boolean isInvisible(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bd597ec", new Object[]{view})).booleanValue();
        }
        if (view.getVisibility() == 4) {
            return true;
        }
        return false;
    }

    public static final boolean isVisible(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ae32407", new Object[]{view})).booleanValue();
        }
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public static final Runnable postDelayed(View view, long j, final d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("60035312", new Object[]{view, new Long(j), d1aVar});
        }
        Runnable viewKt$postDelayed$runnable$1 = new Runnable() { // from class: androidx.core.view.ViewKt$postDelayed$runnable$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    d1aVar.invoke();
                }
            }
        };
        view.postDelayed(viewKt$postDelayed$runnable$1, j);
        return viewKt$postDelayed$runnable$1;
    }

    public static final Runnable postOnAnimationDelayed(View view, long j, final d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("c00ffed7", new Object[]{view, new Long(j), d1aVar});
        }
        Runnable wewVar = new Runnable() { // from class: tb.wew
            @Override // java.lang.Runnable
            public final void run() {
                ViewKt.postOnAnimationDelayed$lambda$1(d1a.this);
            }
        };
        view.postOnAnimationDelayed(wewVar, j);
        return wewVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postOnAnimationDelayed$lambda$1(d1a d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("403ee9c9", new Object[]{d1aVar});
        } else {
            d1aVar.invoke();
        }
    }

    public static final void setPadding(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("424557c7", new Object[]{view, new Integer(i)});
        } else {
            view.setPadding(i, i, i, i);
        }
    }

    public static final void setVisible(View view, boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("479878f9", new Object[]{view, new Boolean(z)});
            return;
        }
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public static final void updateLayoutParams(View view, g1a<? super ViewGroup.LayoutParams, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4edc05d8", new Object[]{view, g1aVar});
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            g1aVar.invoke(layoutParams);
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void updateLayoutParamsTyped(View view, g1a<? super T, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de1ac60", new Object[]{view, g1aVar});
            return;
        }
        view.getLayoutParams();
        ckf.m(1, "T");
        throw null;
    }

    public static final void updatePadding(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d48023", new Object[]{view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    public static /* synthetic */ void updatePadding$default(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a21e9f9", new Object[]{view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), obj});
            return;
        }
        if ((i5 & 1) != 0) {
            i = view.getPaddingLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingRight();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        view.setPadding(i, i2, i3, i4);
    }

    public static final void updatePaddingRelative(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b46b5b7", new Object[]{view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    public static /* synthetic */ void updatePaddingRelative$default(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88ced7e5", new Object[]{view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), obj});
            return;
        }
        if ((i5 & 1) != 0) {
            i = view.getPaddingStart();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static final int getMarginBottom(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7f1a00f", new Object[]{view})).intValue();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int getMarginRight(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7a97e06", new Object[]{view})).intValue();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int getMarginTop(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff2a4fad", new Object[]{view})).intValue();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final void setGone(View view, boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec62ac6a", new Object[]{view, new Boolean(z)});
            return;
        }
        if (z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public static final void setInvisible(View view, boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9012fb4", new Object[]{view, new Boolean(z)});
            return;
        }
        if (z) {
            i = 4;
        }
        view.setVisibility(i);
    }
}
