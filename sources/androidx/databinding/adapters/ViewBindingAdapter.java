package androidx.databinding.adapters;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ViewBindingAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FADING_EDGE_HORIZONTAL = 1;
    public static final int FADING_EDGE_NONE = 0;
    public static final int FADING_EDGE_VERTICAL = 2;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnViewAttachedToWindow {
        void onViewAttachedToWindow(View view);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnViewDetachedFromWindow {
        void onViewDetachedFromWindow(View view);
    }

    private static int pixelsToDimensionPixelSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6a17ca3", new Object[]{new Float(f)})).intValue();
        }
        int i = (int) (0.5f + f);
        if (i != 0) {
            return i;
        }
        int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0;
        }
        if (i2 > 0) {
            return 1;
        }
        return -1;
    }

    public static void setBackground(View view, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142cf15f", new Object[]{view, drawable});
        } else {
            view.setBackground(drawable);
        }
    }

    public static void setClickListener(View view, View.OnClickListener onClickListener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d7bdfcc", new Object[]{view, onClickListener, new Boolean(z)});
            return;
        }
        ViewProxy.setOnClickListener(view, onClickListener);
        view.setClickable(z);
    }

    public static void setOnAttachStateChangeListener(View view, final OnViewDetachedFromWindow onViewDetachedFromWindow, final OnViewAttachedToWindow onViewAttachedToWindow) {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e84939", new Object[]{view, onViewDetachedFromWindow, onViewAttachedToWindow});
            return;
        }
        if (onViewDetachedFromWindow == null && onViewAttachedToWindow == null) {
            onAttachStateChangeListener = null;
        } else {
            onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: androidx.databinding.adapters.ViewBindingAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3d337638", new Object[]{this, view2});
                        return;
                    }
                    OnViewAttachedToWindow onViewAttachedToWindow2 = OnViewAttachedToWindow.this;
                    if (onViewAttachedToWindow2 != null) {
                        onViewAttachedToWindow2.onViewAttachedToWindow(view2);
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view2});
                        return;
                    }
                    OnViewDetachedFromWindow onViewDetachedFromWindow2 = onViewDetachedFromWindow;
                    if (onViewDetachedFromWindow2 != null) {
                        onViewDetachedFromWindow2.onViewDetachedFromWindow(view2);
                    }
                }
            };
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener2 = (View.OnAttachStateChangeListener) ListenerUtil.trackListener(view, onAttachStateChangeListener, R.id.onAttachStateChangeListener);
        if (onAttachStateChangeListener2 != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener2);
        }
        if (onAttachStateChangeListener != null) {
            view.addOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    public static void setOnClick(View view, View.OnClickListener onClickListener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d98f389f", new Object[]{view, onClickListener, new Boolean(z)});
            return;
        }
        ViewProxy.setOnClickListener(view, onClickListener);
        view.setClickable(z);
    }

    public static void setOnLayoutChangeListener(View view, View.OnLayoutChangeListener onLayoutChangeListener, View.OnLayoutChangeListener onLayoutChangeListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20091796", new Object[]{view, onLayoutChangeListener, onLayoutChangeListener2});
            return;
        }
        if (onLayoutChangeListener != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        if (onLayoutChangeListener2 != null) {
            view.addOnLayoutChangeListener(onLayoutChangeListener2);
        }
    }

    public static void setOnLongClick(View view, View.OnLongClickListener onLongClickListener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0019a1f", new Object[]{view, onLongClickListener, new Boolean(z)});
            return;
        }
        ViewProxy.setOnLongClickListener(view, onLongClickListener);
        view.setLongClickable(z);
    }

    public static void setOnLongClickListener(View view, View.OnLongClickListener onLongClickListener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6a2c1cb", new Object[]{view, onLongClickListener, new Boolean(z)});
            return;
        }
        view.setOnLongClickListener(onLongClickListener);
        view.setLongClickable(z);
    }

    public static void setPadding(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42454c84", new Object[]{view, new Float(f)});
            return;
        }
        int pixelsToDimensionPixelSize = pixelsToDimensionPixelSize(f);
        view.setPadding(pixelsToDimensionPixelSize, pixelsToDimensionPixelSize, pixelsToDimensionPixelSize, pixelsToDimensionPixelSize);
    }

    public static void setPaddingBottom(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8af2aa8f", new Object[]{view, new Float(f)});
        } else {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), pixelsToDimensionPixelSize(f));
        }
    }

    public static void setPaddingEnd(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33467541", new Object[]{view, new Float(f)});
        } else {
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), pixelsToDimensionPixelSize(f), view.getPaddingBottom());
        }
    }

    public static void setPaddingLeft(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1e5c2b", new Object[]{view, new Float(f)});
        } else {
            view.setPadding(pixelsToDimensionPixelSize(f), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public static void setPaddingRight(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f7b342", new Object[]{view, new Float(f)});
        } else {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), pixelsToDimensionPixelSize(f), view.getPaddingBottom());
        }
    }

    public static void setPaddingStart(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d9c388", new Object[]{view, new Float(f)});
        } else {
            view.setPaddingRelative(pixelsToDimensionPixelSize(f), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        }
    }

    public static void setPaddingTop(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3235fbb", new Object[]{view, new Float(f)});
        } else {
            view.setPadding(view.getPaddingLeft(), pixelsToDimensionPixelSize(f), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public static void setRequiresFadingEdge(View view, int i) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61db095e", new Object[]{view, new Integer(i)});
            return;
        }
        if ((2 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 1) == 0) {
            z2 = false;
        }
        view.setVerticalFadingEdgeEnabled(z);
        view.setHorizontalFadingEdgeEnabled(z2);
    }
}
