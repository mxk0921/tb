package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.TooltipCompatHandler;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TooltipCompatHandler implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long HOVER_HIDE_TIMEOUT_MS = 15000;
    private static final long HOVER_HIDE_TIMEOUT_SHORT_MS = 3000;
    private static final long LONG_CLICK_HIDE_TIMEOUT_MS = 2500;
    private static final String TAG = "TooltipCompatHandler";
    private static TooltipCompatHandler sActiveHandler;
    private static TooltipCompatHandler sPendingHandler;
    private final View mAnchor;
    private int mAnchorX;
    private int mAnchorY;
    private boolean mForceNextChangeSignificant;
    private boolean mFromTouch;
    private final int mHoverSlop;
    private TooltipPopup mPopup;
    private final CharSequence mTooltipText;
    private final Runnable mShowRunnable = new Runnable() { // from class: tb.m2u
        @Override // java.lang.Runnable
        public final void run() {
            TooltipCompatHandler.this.lambda$new$0();
        }
    };
    private final Runnable mHideRunnable = new Runnable() { // from class: tb.n2u
        @Override // java.lang.Runnable
        public final void run() {
            TooltipCompatHandler.this.hide();
        }
    };

    private TooltipCompatHandler(View view, CharSequence charSequence) {
        this.mAnchor = view;
        this.mTooltipText = charSequence;
        this.mHoverSlop = ViewConfigurationCompat.getScaledHoverSlop(ViewConfiguration.get(view.getContext()));
        forceNextChangeSignificant();
        ViewProxy.setOnLongClickListener(view, this);
        view.setOnHoverListener(this);
    }

    private void cancelPendingShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e585e1", new Object[]{this});
        } else {
            this.mAnchor.removeCallbacks(this.mShowRunnable);
        }
    }

    private void forceNextChangeSignificant() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("387c6e8c", new Object[]{this});
        } else {
            this.mForceNextChangeSignificant = true;
        }
    }

    private void scheduleShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ba808bb", new Object[]{this});
        } else {
            this.mAnchor.postDelayed(this.mShowRunnable, ViewConfiguration.getLongPressTimeout());
        }
    }

    private static void setPendingHandler(TooltipCompatHandler tooltipCompatHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea9b84d", new Object[]{tooltipCompatHandler});
            return;
        }
        TooltipCompatHandler tooltipCompatHandler2 = sPendingHandler;
        if (tooltipCompatHandler2 != null) {
            tooltipCompatHandler2.cancelPendingShow();
        }
        sPendingHandler = tooltipCompatHandler;
        if (tooltipCompatHandler != null) {
            tooltipCompatHandler.scheduleShow();
        }
    }

    private boolean updateAnchorPos(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b9361f6", new Object[]{this, motionEvent})).booleanValue();
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.mForceNextChangeSignificant && Math.abs(x - this.mAnchorX) <= this.mHoverSlop && Math.abs(y - this.mAnchorY) <= this.mHoverSlop) {
            return false;
        }
        this.mAnchorX = x;
        this.mAnchorY = y;
        this.mForceNextChangeSignificant = false;
        return true;
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        if (sActiveHandler == this) {
            sActiveHandler = null;
            TooltipPopup tooltipPopup = this.mPopup;
            if (tooltipPopup != null) {
                tooltipPopup.hide();
                this.mPopup = null;
                forceNextChangeSignificant();
                this.mAnchor.removeOnAttachStateChangeListener(this);
            } else {
                Log.e(TAG, "sActiveHandler.mPopup == null");
            }
        }
        if (sPendingHandler == this) {
            setPendingHandler(null);
        }
        this.mAnchor.removeCallbacks(this.mHideRunnable);
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0ef9e47", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (this.mPopup != null && this.mFromTouch) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.mAnchor.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                forceNextChangeSignificant();
                hide();
            }
        } else if (this.mAnchor.isEnabled() && this.mPopup == null && updateAnchorPos(motionEvent)) {
            setPendingHandler(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
        }
        this.mAnchorX = view.getWidth() / 2;
        this.mAnchorY = view.getHeight() / 2;
        show(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
        } else {
            hide();
        }
    }

    public void show(boolean z) {
        long j;
        long longPressTimeout;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb83a50", new Object[]{this, new Boolean(z)});
        } else if (this.mAnchor.isAttachedToWindow()) {
            setPendingHandler(null);
            TooltipCompatHandler tooltipCompatHandler = sActiveHandler;
            if (tooltipCompatHandler != null) {
                tooltipCompatHandler.hide();
            }
            sActiveHandler = this;
            this.mFromTouch = z;
            TooltipPopup tooltipPopup = new TooltipPopup(this.mAnchor.getContext());
            this.mPopup = tooltipPopup;
            tooltipPopup.show(this.mAnchor, this.mAnchorX, this.mAnchorY, this.mFromTouch, this.mTooltipText);
            this.mAnchor.addOnAttachStateChangeListener(this);
            if (this.mFromTouch) {
                j = LONG_CLICK_HIDE_TIMEOUT_MS;
            } else {
                if ((ViewCompat.getWindowSystemUiVisibility(this.mAnchor) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j = j2 - longPressTimeout;
            }
            this.mAnchor.removeCallbacks(this.mHideRunnable);
            this.mAnchor.postDelayed(this.mHideRunnable, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe10c416", new Object[]{this});
        } else {
            show(false);
        }
    }

    public static void setTooltipText(View view, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d88f64c1", new Object[]{view, charSequence});
            return;
        }
        TooltipCompatHandler tooltipCompatHandler = sPendingHandler;
        if (tooltipCompatHandler != null && tooltipCompatHandler.mAnchor == view) {
            setPendingHandler(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            TooltipCompatHandler tooltipCompatHandler2 = sActiveHandler;
            if (tooltipCompatHandler2 != null && tooltipCompatHandler2.mAnchor == view) {
                tooltipCompatHandler2.hide();
            }
            ViewProxy.setOnLongClickListener(view, null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new TooltipCompatHandler(view, charSequence);
    }
}
