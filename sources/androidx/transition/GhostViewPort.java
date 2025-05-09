package androidx.transition;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class GhostViewPort extends ViewGroup implements GhostView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Matrix mMatrix;
    private final ViewTreeObserver.OnPreDrawListener mOnPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.transition.GhostViewPort.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
            }
            ViewCompat.postInvalidateOnAnimation(GhostViewPort.this);
            GhostViewPort ghostViewPort = GhostViewPort.this;
            ViewGroup viewGroup = ghostViewPort.mStartParent;
            if (!(viewGroup == null || (view = ghostViewPort.mStartView) == null)) {
                viewGroup.endViewTransition(view);
                ViewCompat.postInvalidateOnAnimation(GhostViewPort.this.mStartParent);
                GhostViewPort ghostViewPort2 = GhostViewPort.this;
                ghostViewPort2.mStartParent = null;
                ghostViewPort2.mStartView = null;
            }
            return true;
        }
    };
    public int mReferences;
    public ViewGroup mStartParent;
    public View mStartView;
    public final View mView;

    public GhostViewPort(View view) {
        super(view.getContext());
        this.mView = view;
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    public static GhostViewPort addGhost(View view, ViewGroup viewGroup, Matrix matrix) {
        GhostViewHolder ghostViewHolder;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GhostViewPort) ipChange.ipc$dispatch("9a603c30", new Object[]{view, viewGroup, matrix});
        }
        if (view.getParent() instanceof ViewGroup) {
            GhostViewHolder holder = GhostViewHolder.getHolder(viewGroup);
            GhostViewPort ghostView = getGhostView(view);
            if (!(ghostView == null || (ghostViewHolder = (GhostViewHolder) ghostView.getParent()) == holder)) {
                i = ghostView.mReferences;
                ghostViewHolder.removeView(ghostView);
                ghostView = null;
            }
            if (ghostView == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    calculateMatrix(view, viewGroup, matrix);
                }
                ghostView = new GhostViewPort(view);
                ghostView.setMatrix(matrix);
                if (holder == null) {
                    holder = new GhostViewHolder(viewGroup);
                } else {
                    holder.popToOverlayTop();
                }
                copySize(viewGroup, holder);
                copySize(viewGroup, ghostView);
                holder.addGhostView(ghostView);
                ghostView.mReferences = i;
            } else if (matrix != null) {
                ghostView.setMatrix(matrix);
            }
            ghostView.mReferences++;
            return ghostView;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    public static void calculateMatrix(View view, ViewGroup viewGroup, Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656e8d39", new Object[]{view, viewGroup, matrix});
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        ViewUtils.transformMatrixToGlobal(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        ViewUtils.transformMatrixToLocal(viewGroup, matrix);
    }

    public static void copySize(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d41479d", new Object[]{view, view2});
        } else {
            ViewUtils.setLeftTopRightBottom(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
        }
    }

    public static GhostViewPort getGhostView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GhostViewPort) ipChange.ipc$dispatch("2c8e4b1d", new Object[]{view});
        }
        return (GhostViewPort) view.getTag(R.id.ghost_view);
    }

    public static /* synthetic */ Object ipc$super(GhostViewPort ghostViewPort, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1705336120) {
            super.setVisibility(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/transition/GhostViewPort");
        }
    }

    public static void removeGhost(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12cdc420", new Object[]{view});
            return;
        }
        GhostViewPort ghostView = getGhostView(view);
        if (ghostView != null) {
            int i = ghostView.mReferences - 1;
            ghostView.mReferences = i;
            if (i <= 0) {
                ((GhostViewHolder) ghostView.getParent()).removeView(ghostView);
            }
        }
    }

    public static void setGhostView(View view, GhostViewPort ghostViewPort) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc79a7", new Object[]{view, ghostViewPort});
        } else {
            view.setTag(R.id.ghost_view, ghostViewPort);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        setGhostView(this.mView, this);
        this.mView.getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        ViewUtils.setTransitionVisibility(this.mView, 4);
        if (this.mView.getParent() != null) {
            ((View) this.mView.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        this.mView.getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        ViewUtils.setTransitionVisibility(this.mView, 0);
        setGhostView(this.mView, null);
        if (this.mView.getParent() != null) {
            ((View) this.mView.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        CanvasUtils.enableZ(canvas, true);
        canvas.setMatrix(this.mMatrix);
        ViewUtils.setTransitionVisibility(this.mView, 0);
        this.mView.invalidate();
        ViewUtils.setTransitionVisibility(this.mView, 4);
        drawChild(canvas, this.mView, getDrawingTime());
        CanvasUtils.enableZ(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // androidx.transition.GhostView
    public void reserveEndViewTransition(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c3eff3", new Object[]{this, viewGroup, view});
            return;
        }
        this.mStartParent = viewGroup;
        this.mStartView = view;
    }

    public void setMatrix(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62136fd2", new Object[]{this, matrix});
        } else {
            this.mMatrix = matrix;
        }
    }

    @Override // android.view.View, androidx.transition.GhostView
    public void setVisibility(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        super.setVisibility(i);
        if (getGhostView(this.mView) == this) {
            if (i == 0) {
                i2 = 4;
            }
            ViewUtils.setTransitionVisibility(this.mView, i2);
        }
    }
}
