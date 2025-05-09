package com.taobao.message.uikit.text.style;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.UIHandler;
import java.lang.ref.WeakReference;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LongClickLinkMovementMethod extends LinkMovementMethod {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long DOUBLE_TAP_TIME = 300;
    private static final long LONG_CLICK_TIME = 500;
    private static final long TAP_TIME = 100;
    private static LongClickLinkMovementMethod instance = new LongClickLinkMovementMethod();
    private CheckForLongClick checkForLongClick;
    private CheckForTap checkForTap;
    private boolean doubleTap;
    private Long lastClickTime = 0L;
    private int lastX = 0;
    private int lastY = 0;
    private PerformClick performClick;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class CheckForLongClick implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long clickTime;
        public LongClickableSpan span;
        public WeakReference<TextView> widget;

        static {
            t2o.a(552599731);
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (System.currentTimeMillis() - this.clickTime >= 500 && (textView = this.widget.get()) != null) {
                this.span.onLongClick(textView);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class CheckForTap implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long touchDownTime;
        public WeakReference<TextView> widget;

        static {
            t2o.a(552599732);
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (System.currentTimeMillis() - this.touchDownTime >= 100 && (textView = this.widget.get()) != null) {
                textView.setPressed(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class PerformClick implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public LongClickableSpan span;
        public WeakReference<TextView> widget;

        static {
            t2o.a(552599733);
        }

        private PerformClick() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TextView textView = this.widget.get();
            if (textView != null) {
                this.span.onClick(textView);
            }
        }
    }

    static {
        t2o.a(552599729);
    }

    private LongClickLinkMovementMethod() {
    }

    private void cancelPerformClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8d37a48", new Object[]{this});
            return;
        }
        PerformClick performClick = this.performClick;
        if (performClick != null) {
            UIHandler.removeCallbacks(performClick);
        }
    }

    public static LongClickLinkMovementMethod getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongClickLinkMovementMethod) ipChange.ipc$dispatch("39147fa5", new Object[0]);
        }
        return instance;
    }

    public static /* synthetic */ Object ipc$super(LongClickLinkMovementMethod longClickLinkMovementMethod, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/uikit/text/style/LongClickLinkMovementMethod");
    }

    private void pendingPerformClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead1fb65", new Object[]{this});
            return;
        }
        PerformClick performClick = this.performClick;
        if (performClick != null) {
            UIHandler.postDelayed(performClick, 100L);
        }
    }

    private void removeCallbacks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58438431", new Object[]{this});
            return;
        }
        CheckForLongClick checkForLongClick = this.checkForLongClick;
        if (checkForLongClick != null) {
            UIHandler.removeCallbacks(checkForLongClick);
        }
        CheckForTap checkForTap = this.checkForTap;
        if (checkForTap != null) {
            UIHandler.removeCallbacks(checkForTap);
        }
        this.checkForTap = null;
        this.checkForLongClick = null;
        this.performClick = null;
    }

    public void onDestory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef83c", new Object[]{this});
            return;
        }
        this.checkForTap.widget.clear();
        this.checkForTap.widget = null;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f66a6ef", new Object[]{this, textView, spannable, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            this.lastX = x;
            this.lastY = y;
            Math.abs(0);
            Math.abs(y - this.lastY);
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            int scrollY = totalPaddingTop + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            LongClickableSpan[] longClickableSpanArr = (LongClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, LongClickableSpan.class);
            if (longClickableSpanArr.length != 0) {
                if (action == 1) {
                    textView.setPressed(false);
                    if (this.doubleTap) {
                        this.doubleTap = false;
                        removeCallbacks();
                        longClickableSpanArr[0].onDoubleClick(textView);
                    } else if (System.currentTimeMillis() - this.lastClickTime.longValue() < 500) {
                        removeCallbacks();
                        PerformClick performClick = new PerformClick();
                        this.performClick = performClick;
                        performClick.span = longClickableSpanArr[0];
                        performClick.widget = new WeakReference<>(textView);
                        pendingPerformClick();
                    }
                } else if (action == 0) {
                    if (System.currentTimeMillis() - this.lastClickTime.longValue() < 300) {
                        cancelPerformClick();
                        this.doubleTap = true;
                    }
                    this.lastClickTime = Long.valueOf(System.currentTimeMillis());
                    if (this.checkForLongClick == null) {
                        this.checkForLongClick = new CheckForLongClick();
                    }
                    if (this.checkForTap == null) {
                        this.checkForTap = new CheckForTap();
                    }
                    Selection.setSelection(spannable, spannable.getSpanStart(longClickableSpanArr[0]), spannable.getSpanEnd(longClickableSpanArr[0]));
                    this.checkForLongClick.clickTime = this.lastClickTime.longValue();
                    this.checkForLongClick.widget = new WeakReference<>(textView);
                    this.checkForLongClick.span = longClickableSpanArr[0];
                    this.checkForTap.touchDownTime = this.lastClickTime.longValue();
                    this.checkForTap.widget = new WeakReference<>(textView);
                    UIHandler.postDelayed(this.checkForTap, 100L);
                    UIHandler.postDelayed(this.checkForLongClick, 500L);
                }
                return true;
            }
            Selection.removeSelection(spannable);
        } else if (action == 3 || action == 4) {
            textView.setPressed(false);
            removeCallbacks();
        }
        return false;
    }
}
