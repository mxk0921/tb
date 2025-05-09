package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.npp;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ShopSwipeListenerLayout extends PerceptionSizeFrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean alreadyIntercept;
    private boolean alreadyTouch;
    private boolean forceIntercept;
    private boolean ignoreVerticalEvent;
    private Boolean inCenterContainerFlag;
    private Boolean isFirstHorizontalScroll;
    private int lastY;
    private boolean normalMode;
    private int scrollThreshold = 50;
    private boolean startScroll;
    private int startX;
    private int startY;
    private a swipeListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class C0102a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(766509709);
            }

            public static void b(a aVar, MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("232e8e56", new Object[]{aVar, motionEvent});
                    return;
                }
                ckf.g(aVar, "this");
                ckf.g(motionEvent, "event");
            }

            public static void c(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b2e01f99", new Object[]{aVar});
                } else {
                    ckf.g(aVar, "this");
                }
            }

            public static void d(a aVar, View view, MotionEvent motionEvent, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f06d4b55", new Object[]{aVar, view, motionEvent, new Integer(i)});
                    return;
                }
                ckf.g(aVar, "this");
                ckf.g(view, "fromTargetView");
                ckf.g(motionEvent, "event");
            }

            public static void e(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("43837d00", new Object[]{aVar});
                } else {
                    ckf.g(aVar, "this");
                }
            }

            public static void f(a aVar, View view, MotionEvent motionEvent, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7fdb4c7c", new Object[]{aVar, view, motionEvent, new Integer(i)});
                    return;
                }
                ckf.g(aVar, "this");
                ckf.g(view, "fromTargetView");
                ckf.g(motionEvent, "event");
            }

            public static boolean a(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("d30ad2f3", new Object[]{aVar})).booleanValue();
                }
                ckf.g(aVar, "this");
                return false;
            }
        }

        void onSwipeCancel(MotionEvent motionEvent);

        void onSwipeDown();

        void onSwipeDown(View view, MotionEvent motionEvent, int i);

        void onSwipeUp();

        void onSwipeUp(View view, MotionEvent motionEvent, int i);
    }

    static {
        t2o.a(766509707);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopSwipeListenerLayout(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    private final void clearStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0cbe1a6", new Object[]{this});
            return;
        }
        this.startScroll = false;
        this.startX = 0;
        this.startY = 0;
        this.lastY = 0;
        this.alreadyIntercept = false;
        this.ignoreVerticalEvent = false;
    }

    private final boolean ifSwipeDown(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88538a4a", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        int i3 = this.startY;
        if (i3 >= i2 || Math.abs(i2 - i3) <= this.scrollThreshold) {
            return false;
        }
        return true;
    }

    private final boolean ifSwipeDownWithLastPosition(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("322c966f", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        int i3 = this.lastY;
        if (i3 >= i2 || Math.abs(i2 - i3) <= 1) {
            return false;
        }
        return true;
    }

    private final boolean ifSwipeUp(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25ad30c3", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        int i3 = this.startY;
        if (i3 <= i2 || Math.abs(i2 - i3) <= this.scrollThreshold) {
            return false;
        }
        return true;
    }

    private final boolean ifSwipeUpWithLastPosition(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43c42ae8", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        int i3 = this.lastY;
        if (i3 <= i2 || Math.abs(i2 - i3) <= 1) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(ShopSwipeListenerLayout shopSwipeListenerLayout, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/ShopSwipeListenerLayout");
    }

    private final void startScroll(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10c4db6", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.startX = i;
        this.startY = i2;
        this.lastY = i2;
        this.startScroll = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x010d, code lost:
        r5 = r8.swipeListener;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x010f, code lost:
        if (r5 != null) goto L_0x0112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0112, code lost:
        r5.onSwipeUp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0117, code lost:
        if (r8.forceIntercept == false) goto L_0x011a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0119, code lost:
        return true;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void forceInterceptAllTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("501f5008", new Object[]{this, new Boolean(z)});
            return;
        }
        this.forceIntercept = z;
        if (z) {
            this.alreadyIntercept = true;
        } else {
            this.alreadyIntercept = false;
        }
    }

    public final boolean getAlreadyTouch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce8e6648", new Object[]{this})).booleanValue();
        }
        return this.alreadyTouch;
    }

    public final boolean getIgnoreVerticalEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e9e9f67", new Object[]{this})).booleanValue();
        }
        return this.ignoreVerticalEvent;
    }

    public final Boolean getInCenterContainerFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("35c1d4a1", new Object[]{this});
        }
        return this.inCenterContainerFlag;
    }

    public final int getLastY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76f8bcc7", new Object[]{this})).intValue();
        }
        return this.lastY;
    }

    public final boolean getNormalMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34ba4bab", new Object[]{this})).booleanValue();
        }
        return this.normalMode;
    }

    public final boolean getStartScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59871ca4", new Object[]{this})).booleanValue();
        }
        return this.startScroll;
    }

    public final int getStartX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ff8f9a6", new Object[]{this})).intValue();
        }
        return this.startX;
    }

    public final int getStartY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90071127", new Object[]{this})).intValue();
        }
        return this.startY;
    }

    public final a getSwipeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("8a4c3f4c", new Object[]{this});
        }
        return this.swipeListener;
    }

    public boolean inCenterContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fa114d2", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.inCenterContainerFlag;
        if (bool == null) {
            return true;
        }
        ckf.d(bool);
        return bool.booleanValue();
    }

    public final Boolean isFirstHorizontalScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("fff002db", new Object[]{this});
        }
        return this.isFirstHorizontalScroll;
    }

    public final boolean isForceIntercept() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f0c01ec", new Object[]{this})).booleanValue();
        }
        return this.forceIntercept;
    }

    public final void setAlreadyTouch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ded52184", new Object[]{this, new Boolean(z)});
        } else {
            this.alreadyTouch = z;
        }
    }

    public final void setFirstHorizontalScroll(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f48c4e7", new Object[]{this, bool});
        } else {
            this.isFirstHorizontalScroll = bool;
        }
    }

    public final void setIgnoreVerticalEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f502c8dd", new Object[]{this, new Boolean(z)});
        } else {
            this.ignoreVerticalEvent = z;
        }
    }

    public final void setInCenterContainerFlag(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac93bb5", new Object[]{this, bool});
        } else {
            this.inCenterContainerFlag = bool;
        }
    }

    public final void setLastY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96439ebb", new Object[]{this, new Integer(i)});
        } else {
            this.lastY = i;
        }
    }

    public final void setNormalMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99667581", new Object[]{this, new Boolean(z)});
        } else {
            this.normalMode = z;
        }
    }

    public final void setScrollThreshold(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8293d980", new Object[]{this, new Integer(i)});
            return;
        }
        int scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        npp.Companion.b(ckf.p("touch slop : ", Integer.valueOf(scaledTouchSlop)));
        if (i <= scaledTouchSlop) {
            i = scaledTouchSlop;
        }
        this.scrollThreshold = i;
    }

    public final void setStartScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b59bf40", new Object[]{this, new Boolean(z)});
        } else {
            this.startScroll = z;
        }
    }

    public final void setStartX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c2324", new Object[]{this, new Integer(i)});
        } else {
            this.startX = i;
        }
    }

    public final void setStartY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("740fbc3", new Object[]{this, new Integer(i)});
        } else {
            this.startY = i;
        }
    }

    public final void setSwipeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d52e98a", new Object[]{this, aVar});
        } else {
            this.swipeListener = aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopSwipeListenerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopSwipeListenerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopSwipeListenerLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ckf.g(context, "context");
    }
}
