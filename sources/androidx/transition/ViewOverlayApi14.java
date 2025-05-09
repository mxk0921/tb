package androidx.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ViewOverlayApi14 implements ViewOverlayImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public OverlayViewGroup mOverlayViewGroup;

    public ViewOverlayApi14(Context context, ViewGroup viewGroup, View view) {
        this.mOverlayViewGroup = new OverlayViewGroup(context, viewGroup, view, this);
    }

    public static ViewOverlayApi14 createFrom(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewOverlayApi14) ipChange.ipc$dispatch("5c5c637a", new Object[]{view});
        }
        ViewGroup contentView = getContentView(view);
        if (contentView == null) {
            return null;
        }
        int childCount = contentView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = contentView.getChildAt(i);
            if (childAt instanceof OverlayViewGroup) {
                return ((OverlayViewGroup) childAt).mViewOverlay;
            }
        }
        return new ViewGroupOverlayApi14(contentView.getContext(), contentView, view);
    }

    public static ViewGroup getContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("b2795852", new Object[]{view});
        }
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // androidx.transition.ViewOverlayImpl
    public void add(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4437b3cc", new Object[]{this, drawable});
        } else {
            this.mOverlayViewGroup.add(drawable);
        }
    }

    @Override // androidx.transition.ViewOverlayImpl
    public void remove(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76dc54af", new Object[]{this, drawable});
        } else {
            this.mOverlayViewGroup.remove(drawable);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class OverlayViewGroup extends ViewGroup {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static Method sInvalidateChildInParentFastMethod;
        private boolean mDisposed;
        public ArrayList<Drawable> mDrawables = null;
        public ViewGroup mHostView;
        public View mRequestingView;
        public ViewOverlayApi14 mViewOverlay;

        static {
            try {
                Class cls = Integer.TYPE;
                sInvalidateChildInParentFastMethod = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        public OverlayViewGroup(Context context, ViewGroup viewGroup, View view, ViewOverlayApi14 viewOverlayApi14) {
            super(context);
            this.mHostView = viewGroup;
            this.mRequestingView = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.mViewOverlay = viewOverlayApi14;
        }

        private void assertNotDisposed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81cc7279", new Object[]{this});
            } else if (this.mDisposed) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void disposeIfEmpty() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d80e718", new Object[]{this});
            } else if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.mDrawables;
                if (arrayList == null || arrayList.size() == 0) {
                    this.mDisposed = true;
                    this.mHostView.removeView(this);
                }
            }
        }

        private void getOffset(int[] iArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f200a9e", new Object[]{this, iArr});
                return;
            }
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.mHostView.getLocationOnScreen(iArr2);
            this.mRequestingView.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public static /* synthetic */ Object ipc$super(OverlayViewGroup overlayViewGroup, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1894755994:
                    return new Boolean(super.verifyDrawable((Drawable) objArr[0]));
                case -572887227:
                    super.addView((View) objArr[0]);
                    return null;
                case 623593120:
                    super.dispatchDraw((Canvas) objArr[0]);
                    return null;
                case 1578337452:
                    return super.invalidateChildInParent((int[]) objArr[0], (Rect) objArr[1]);
                case 1811093890:
                    super.removeView((View) objArr[0]);
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/transition/ViewOverlayApi14$OverlayViewGroup");
            }
        }

        public void add(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4437b3cc", new Object[]{this, drawable});
                return;
            }
            assertNotDisposed();
            if (this.mDrawables == null) {
                this.mDrawables = new ArrayList<>();
            }
            if (!this.mDrawables.contains(drawable)) {
                this.mDrawables.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
                return;
            }
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.mHostView.getLocationOnScreen(iArr);
            this.mRequestingView.getLocationOnScreen(iArr2);
            canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            canvas.clipRect(new Rect(0, 0, this.mRequestingView.getWidth(), this.mRequestingView.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.mDrawables;
            if (arrayList == null) {
                i = 0;
            } else {
                i = arrayList.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                this.mDrawables.get(i2).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
            }
            return false;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewParent) ipChange.ipc$dispatch("5e1384ac", new Object[]{this, iArr, rect});
            }
            if (this.mHostView == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.mHostView instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                getOffset(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public ViewParent invalidateChildInParentFast(int i, int i2, Rect rect) {
            if (!(this.mHostView instanceof ViewGroup) || sInvalidateChildInParentFastMethod == null) {
                return null;
            }
            try {
                getOffset(new int[2]);
                sInvalidateChildInParentFastMethod.invoke(this.mHostView, Integer.valueOf(i), Integer.valueOf(i2), rect);
                return null;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return null;
            }
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c16ae24", new Object[]{this, drawable});
            } else {
                invalidate(drawable.getBounds());
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        }

        public void remove(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76dc54af", new Object[]{this, drawable});
                return;
            }
            ArrayList<Drawable> arrayList = this.mDrawables;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                disposeIfEmpty();
            }
        }

        @Override // android.view.View
        public boolean verifyDrawable(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue();
            }
            if (super.verifyDrawable(drawable)) {
                return true;
            }
            ArrayList<Drawable> arrayList = this.mDrawables;
            if (arrayList == null || !arrayList.contains(drawable)) {
                return false;
            }
            return true;
        }

        public void remove(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("101673e7", new Object[]{this, view});
                return;
            }
            super.removeView(view);
            disposeIfEmpty();
        }

        public void add(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df3d232a", new Object[]{this, view});
                return;
            }
            assertNotDisposed();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.mHostView || viewGroup.getParent() == null || !ViewCompat.isAttachedToWindow(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.mHostView.getLocationOnScreen(iArr2);
                    ViewCompat.offsetLeftAndRight(view, iArr[0] - iArr2[0]);
                    ViewCompat.offsetTopAndBottom(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }
    }
}
