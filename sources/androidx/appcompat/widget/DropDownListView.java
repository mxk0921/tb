package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.widget.ListViewAutoScrollHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DropDownListView extends ListView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INVALID_POSITION = -1;
    public static final int NO_POSITION = -1;
    private ViewPropertyAnimatorCompat mClickAnimation;
    private boolean mDrawsInPressedState;
    private boolean mHijackFocus;
    private boolean mListSelectionHidden;
    private int mMotionPosition;
    public ResolveHoverRunnable mResolveHoverRunnable;
    private ListViewAutoScrollHelper mScrollHelper;
    private GateKeeperDrawable mSelector;
    private final Rect mSelectorRect = new Rect();
    private int mSelectionLeftPadding = 0;
    private int mSelectionTopPadding = 0;
    private int mSelectionRightPadding = 0;
    private int mSelectionBottomPadding = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static void drawableHotspotChanged(View view, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b4b6268", new Object[]{view, new Float(f), new Float(f2)});
            } else {
                view.drawableHotspotChanged(f, f2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api33Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api33Impl() {
        }

        public static boolean isSelectedChildViewEnabled(AbsListView absListView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("acf47cf5", new Object[]{absListView})).booleanValue();
            }
            return absListView.isSelectedChildViewEnabled();
        }

        public static void setSelectedChildViewEnabled(AbsListView absListView, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef6613cb", new Object[]{absListView, new Boolean(z)});
            } else {
                absListView.setSelectedChildViewEnabled(z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class GateKeeperDrawable extends DrawableWrapperCompat {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean mEnabled = true;

        public GateKeeperDrawable(Drawable drawable) {
            super(drawable);
        }

        public static /* synthetic */ Object ipc$super(GateKeeperDrawable gateKeeperDrawable, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1665133574:
                    super.draw((Canvas) objArr[0]);
                    return null;
                case -238051052:
                    super.setHotspot(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue());
                    return null;
                case 1110920955:
                    return new Boolean(super.setVisible(((Boolean) objArr[0]).booleanValue(), ((Boolean) objArr[1]).booleanValue()));
                case 1389419753:
                    super.setHotspotBounds(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                    return null;
                case 1944591336:
                    return new Boolean(super.setState((int[]) objArr[0]));
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/widget/DropDownListView$GateKeeperDrawable");
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            } else if (this.mEnabled) {
                super.draw(canvas);
            }
        }

        public void setEnabled(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
            } else {
                this.mEnabled = z;
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1cfa114", new Object[]{this, new Float(f), new Float(f2)});
            } else if (this.mEnabled) {
                super.setHotspot(f, f2);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52d0dce9", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else if (this.mEnabled) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("73e81be8", new Object[]{this, iArr})).booleanValue();
            }
            if (this.mEnabled) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("42374efb", new Object[]{this, new Boolean(z), new Boolean(z2)})).booleanValue();
            }
            if (this.mEnabled) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class PreApi33Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final Field sIsChildViewEnabled;

        private PreApi33Impl() {
        }

        public static boolean isSelectedChildViewEnabled(AbsListView absListView) {
            Field field = sIsChildViewEnabled;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return false;
            }
        }

        public static void setSelectedChildViewEnabled(AbsListView absListView, boolean z) {
            Field field = sIsChildViewEnabled;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            sIsChildViewEnabled = field;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class ResolveHoverRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ResolveHoverRunnable() {
        }

        public void cancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
                return;
            }
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.mResolveHoverRunnable = null;
            dropDownListView.removeCallbacks(this);
        }

        public void post() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d0ccd27", new Object[]{this});
            } else {
                DropDownListView.this.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.mResolveHoverRunnable = null;
            dropDownListView.drawableStateChanged();
        }
    }

    public DropDownListView(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.mHijackFocus = z;
        setCacheColorHint(0);
    }

    private void clearPressedItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98940a4f", new Object[]{this});
            return;
        }
        this.mDrawsInPressedState = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.mMotionPosition - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.mClickAnimation;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
            this.mClickAnimation = null;
        }
    }

    private void clickPressedItem(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30573025", new Object[]{this, view, new Integer(i)});
        } else {
            performItemClick(view, i, getItemIdAtPosition(i));
        }
    }

    private void drawSelectorCompat(Canvas canvas) {
        Drawable selector;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20738639", new Object[]{this, canvas});
        } else if (!this.mSelectorRect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.mSelectorRect);
            selector.draw(canvas);
        }
    }

    public static /* synthetic */ Object ipc$super(DropDownListView dropDownListView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1486587619:
                return new Boolean(super.onHoverEvent((MotionEvent) objArr[0]));
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case 448480424:
                super.drawableStateChanged();
                return null;
            case 541296617:
                return new Boolean(super.hasFocus());
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 816388344:
                return new Boolean(super.isFocused());
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1336320350:
                return new Boolean(super.isInTouchMode());
            case 1629601113:
                return new Boolean(super.hasWindowFocus());
            case 2065829260:
                super.setSelector((Drawable) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/widget/DropDownListView");
        }
    }

    private void positionSelectorCompat(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e1abfc0", new Object[]{this, new Integer(i), view});
            return;
        }
        Rect rect = this.mSelectorRect;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.mSelectionLeftPadding;
        rect.top -= this.mSelectionTopPadding;
        rect.right += this.mSelectionRightPadding;
        rect.bottom += this.mSelectionBottomPadding;
        boolean superIsSelectedChildViewEnabled = superIsSelectedChildViewEnabled();
        if (view.isEnabled() != superIsSelectedChildViewEnabled) {
            superSetSelectedChildViewEnabled(!superIsSelectedChildViewEnabled);
            if (i != -1) {
                refreshDrawableState();
            }
        }
    }

    private void positionSelectorLikeTouchCompat(int i, View view, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b4caa38", new Object[]{this, new Integer(i), view, new Float(f), new Float(f2)});
            return;
        }
        positionSelectorLikeFocusCompat(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            DrawableCompat.setHotspot(selector, f, f2);
        }
    }

    private void setPressedItem(View view, int i, float f, float f2) {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb7dc4b", new Object[]{this, view, new Integer(i), new Float(f), new Float(f2)});
            return;
        }
        this.mDrawsInPressedState = true;
        Api21Impl.drawableHotspotChanged(this, f, f2);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.mMotionPosition;
        if (!(i2 == -1 || (childAt = getChildAt(i2 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.mMotionPosition = i;
        Api21Impl.drawableHotspotChanged(view, f - view.getLeft(), f2 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        positionSelectorLikeTouchCompat(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private void setSelectorEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f134718d", new Object[]{this, new Boolean(z)});
            return;
        }
        GateKeeperDrawable gateKeeperDrawable = this.mSelector;
        if (gateKeeperDrawable != null) {
            gateKeeperDrawable.setEnabled(z);
        }
    }

    private boolean superIsSelectedChildViewEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d918e8b", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.isSelectedChildViewEnabled(this);
        }
        return PreApi33Impl.isSelectedChildViewEnabled(this);
    }

    private void superSetSelectedChildViewEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf299f8b", new Object[]{this, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.setSelectedChildViewEnabled(this, z);
        } else {
            PreApi33Impl.setSelectedChildViewEnabled(this, z);
        }
    }

    private boolean touchModeDrawsInPressedStateCompat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d804dee", new Object[]{this})).booleanValue();
        }
        return this.mDrawsInPressedState;
    }

    private void updateSelectorStateCompat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbcb7d92", new Object[]{this});
            return;
        }
        Drawable selector = getSelector();
        if (selector != null && touchModeDrawsInPressedStateCompat() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        drawSelectorCompat(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1abb44a8", new Object[]{this});
        } else if (this.mResolveHoverRunnable == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            updateSelectorStateCompat();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("204387e9", new Object[]{this})).booleanValue();
        }
        if (this.mHijackFocus || super.hasFocus()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6121bd59", new Object[]{this})).booleanValue();
        }
        if (this.mHijackFocus || super.hasWindowFocus()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean isFocused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30a918f8", new Object[]{this})).booleanValue();
        }
        if (this.mHijackFocus || super.isFocused()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fa6a15e", new Object[]{this})).booleanValue();
        }
        if ((!this.mHijackFocus || !this.mListSelectionHidden) && !super.isInTouchMode()) {
            return false;
        }
        return true;
    }

    public int lookForSelectablePosition(int i, boolean z) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("947cfb14", new Object[]{this, new Integer(i), new Boolean(z)})).intValue();
        }
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z) {
                    i2 = Math.max(0, i);
                    while (i2 < count && !adapter.isEnabled(i2)) {
                        i2++;
                    }
                } else {
                    i2 = Math.min(i, count - 1);
                    while (i2 >= 0 && !adapter.isEnabled(i2)) {
                        i2--;
                    }
                }
                if (i2 < 0 || i2 >= count) {
                    return -1;
                }
                return i2;
            } else if (i >= 0 && i < count) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        this.mResolveHoverRunnable = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r4 != 3) goto L_0x002e;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onForwardedEvent(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = androidx.appcompat.widget.DropDownListView.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0024
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r9)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r2] = r7
            r9[r1] = r8
            r9[r0] = r5
            java.lang.String r8 = "3109a976"
            java.lang.Object r8 = r4.ipc$dispatch(r8, r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x0024:
            int r4 = r8.getActionMasked()
            if (r4 == r1) goto L_0x0036
            if (r4 == r0) goto L_0x0034
            if (r4 == r3) goto L_0x0031
        L_0x002e:
            r9 = 0
            r0 = 1
            goto L_0x0066
        L_0x0031:
            r9 = 0
            r0 = 0
            goto L_0x0066
        L_0x0034:
            r0 = 1
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x003e
            goto L_0x0031
        L_0x003e:
            float r3 = r8.getX(r9)
            int r3 = (int) r3
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r3, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0051
            r9 = 1
            goto L_0x0066
        L_0x0051:
            int r0 = r7.getFirstVisiblePosition()
            int r0 = r5 - r0
            android.view.View r0 = r7.getChildAt(r0)
            float r3 = (float) r3
            float r9 = (float) r9
            r7.setPressedItem(r0, r5, r3, r9)
            if (r4 != r1) goto L_0x002e
            r7.clickPressedItem(r0, r5)
            goto L_0x002e
        L_0x0066:
            if (r0 == 0) goto L_0x006a
            if (r9 == 0) goto L_0x006d
        L_0x006a:
            r7.clearPressedItem()
        L_0x006d:
            if (r0 == 0) goto L_0x0085
            androidx.core.widget.ListViewAutoScrollHelper r9 = r7.mScrollHelper
            if (r9 != 0) goto L_0x007a
            androidx.core.widget.ListViewAutoScrollHelper r9 = new androidx.core.widget.ListViewAutoScrollHelper
            r9.<init>(r7)
            r7.mScrollHelper = r9
        L_0x007a:
            androidx.core.widget.ListViewAutoScrollHelper r9 = r7.mScrollHelper
            r9.setEnabled(r1)
            androidx.core.widget.ListViewAutoScrollHelper r9 = r7.mScrollHelper
            r9.onTouch(r7, r8)
            goto L_0x008c
        L_0x0085:
            androidx.core.widget.ListViewAutoScrollHelper r8 = r7.mScrollHelper
            if (r8 == 0) goto L_0x008c
            r8.setEnabled(r2)
        L_0x008c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.DropDownListView.onForwardedEvent(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a764791d", new Object[]{this, motionEvent})).booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.mResolveHoverRunnable == null) {
            ResolveHoverRunnable resolveHoverRunnable = new ResolveHoverRunnable();
            this.mResolveHoverRunnable = resolveHoverRunnable;
            resolveHoverRunnable.post();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !Api30Impl.canPositionSelectorForHoveredItem()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        Api30Impl.positionSelectorForHoveredItem(this, pointToPosition, childAt);
                    }
                }
                updateSelectorStateCompat();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            this.mMotionPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        ResolveHoverRunnable resolveHoverRunnable = this.mResolveHoverRunnable;
        if (resolveHoverRunnable != null) {
            resolveHoverRunnable.cancel();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb6e6d7", new Object[]{this, new Boolean(z)});
        } else {
            this.mListSelectionHidden = z;
        }
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        GateKeeperDrawable gateKeeperDrawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b220d8c", new Object[]{this, drawable});
            return;
        }
        if (drawable != null) {
            gateKeeperDrawable = new GateKeeperDrawable(drawable);
        } else {
            gateKeeperDrawable = null;
        }
        this.mSelector = gateKeeperDrawable;
        super.setSelector(gateKeeperDrawable);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.mSelectionLeftPadding = rect.left;
        this.mSelectionTopPadding = rect.top;
        this.mSelectionRightPadding = rect.right;
        this.mSelectionBottomPadding = rect.bottom;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api30Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static boolean sHasMethods;
        private static Method sPositionSelector;
        private static Method sSetNextSelectedPositionInt;
        private static Method sSetSelectedPositionInt;

        private Api30Impl() {
        }

        public static boolean canPositionSelectorForHoveredItem() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e345b048", new Object[0])).booleanValue();
            }
            return sHasMethods;
        }

        public static void positionSelectorForHoveredItem(DropDownListView dropDownListView, int i, View view) {
            try {
                sPositionSelector.invoke(dropDownListView, Integer.valueOf(i), view, Boolean.FALSE, -1, -1);
                sSetSelectedPositionInt.invoke(dropDownListView, Integer.valueOf(i));
                sSetNextSelectedPositionInt.invoke(dropDownListView, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                sPositionSelector = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                sSetSelectedPositionInt = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                sSetNextSelectedPositionInt = declaredMethod3;
                declaredMethod3.setAccessible(true);
                sHasMethods = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }

    private void positionSelectorLikeFocusCompat(int i, View view) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd64411", new Object[]{this, new Integer(i), view});
            return;
        }
        Drawable selector = getSelector();
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        positionSelectorCompat(i, view);
        if (z2) {
            Rect rect = this.mSelectorRect;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            DrawableCompat.setHotspot(selector, exactCenterX, exactCenterY);
        }
    }

    public int measureHeightOfChildrenCompat(int i, int i2, int i3, int i4, int i5) {
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f826dc52", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)})).intValue();
        }
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = 0;
        int i9 = 0;
        View view = null;
        int i10 = 0;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                i9 = itemViewType;
                view = null;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            if (i11 > 0) {
                i6 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else {
                i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i6);
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i4) {
                return (i5 < 0 || i8 <= i5 || i10 <= 0 || i7 == i4) ? i4 : i10;
            }
            if (i5 >= 0 && i8 >= i5) {
                i10 = i7;
            }
            i8++;
        }
        return i7;
    }
}
