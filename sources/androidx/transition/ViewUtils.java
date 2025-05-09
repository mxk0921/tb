package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ViewUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Property<View, Rect> CLIP_BOUNDS;
    private static final ViewUtilsBase IMPL;
    private static final String TAG = "ViewUtils";
    public static final Property<View, Float> TRANSITION_ALPHA;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            IMPL = new ViewUtilsApi29();
        } else if (i >= 23) {
            IMPL = new ViewUtilsApi23();
        } else if (i >= 22) {
            IMPL = new ViewUtilsApi22();
        } else {
            IMPL = new ViewUtilsApi21();
        }
        TRANSITION_ALPHA = new Property<View, Float>(Float.class, "translationAlpha") { // from class: androidx.transition.ViewUtils.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/transition/ViewUtils$1");
            }

            public Float get(View view) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("abe63b1e", new Object[]{this, view}) : Float.valueOf(ViewUtils.getTransitionAlpha(view));
            }

            public void set(View view, Float f) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d0588b0", new Object[]{this, view, f});
                } else {
                    ViewUtils.setTransitionAlpha(view, f.floatValue());
                }
            }
        };
        CLIP_BOUNDS = new Property<View, Rect>(Rect.class, "clipBounds") { // from class: androidx.transition.ViewUtils.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/transition/ViewUtils$2");
            }

            public Rect get(View view) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("7145a45e", new Object[]{this, view}) : ViewCompat.getClipBounds(view);
            }

            public void set(View view, Rect rect) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("658dfa30", new Object[]{this, view, rect});
                } else {
                    ViewCompat.setClipBounds(view, rect);
                }
            }
        };
    }

    private ViewUtils() {
    }

    public static void clearNonTransitionAlpha(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1977f22", new Object[]{view});
        } else {
            IMPL.clearNonTransitionAlpha(view);
        }
    }

    public static ViewOverlayImpl getOverlay(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewOverlayImpl) ipChange.ipc$dispatch("548b236b", new Object[]{view});
        }
        return new ViewOverlayApi18(view);
    }

    public static float getTransitionAlpha(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6e610a8", new Object[]{view})).floatValue();
        }
        return IMPL.getTransitionAlpha(view);
    }

    public static WindowIdImpl getWindowId(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowIdImpl) ipChange.ipc$dispatch("b87ab69c", new Object[]{view});
        }
        return new WindowIdApi18(view);
    }

    public static void saveNonTransitionAlpha(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a549c9f2", new Object[]{view});
        } else {
            IMPL.saveNonTransitionAlpha(view);
        }
    }

    public static void setAnimationMatrix(View view, Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7620574", new Object[]{view, matrix});
        } else {
            IMPL.setAnimationMatrix(view, matrix);
        }
    }

    public static void setLeftTopRightBottom(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("925cf490", new Object[]{view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            IMPL.setLeftTopRightBottom(view, i, i2, i3, i4);
        }
    }

    public static void setTransitionAlpha(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e9aeb7c", new Object[]{view, new Float(f)});
        } else {
            IMPL.setTransitionAlpha(view, f);
        }
    }

    public static void setTransitionVisibility(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b44f641", new Object[]{view, new Integer(i)});
        } else {
            IMPL.setTransitionVisibility(view, i);
        }
    }

    public static void transformMatrixToGlobal(View view, Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e5693c", new Object[]{view, matrix});
        } else {
            IMPL.transformMatrixToGlobal(view, matrix);
        }
    }

    public static void transformMatrixToLocal(View view, Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e90c74", new Object[]{view, matrix});
        } else {
            IMPL.transformMatrixToLocal(view, matrix);
        }
    }
}
