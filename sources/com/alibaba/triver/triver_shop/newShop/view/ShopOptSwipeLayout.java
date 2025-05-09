package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aqp;
import tb.ckf;
import tb.d1a;
import tb.npp;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ShopOptSwipeLayout extends PerceptionSizeFrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean alreadyDetectSwipeOrientation;
    private boolean alreadyIntercept;
    private boolean alreadySwipeHorizon;
    private boolean alreadyTouch;
    private boolean downEventIntercept;
    private boolean enableInterceptAllEventByDownEventIntercept;
    private d1a<Boolean> expandedStatusGetter;
    private boolean forceIntercept;
    private boolean ignoreVerticalEvent;
    private Boolean inCenterContainerFlag;
    private int lastY;
    private boolean normalMode;
    private VelocityTracker speedDetector;
    private boolean startExpandedStatus;
    private boolean startScroll;
    private int startX;
    private int startY;
    private ShopSwipeListenerLayout.a swipeListener;
    private boolean touchOnce;
    private int scrollThreshold = 50;
    private boolean disableUpAndMoveEventReturn = aqp.Companion.e();

    static {
        t2o.a(766509704);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopOptSwipeLayout(Context context) {
        super(context);
        ckf.g(context, "context");
        VelocityTracker obtain = VelocityTracker.obtain();
        ckf.f(obtain, "obtain()");
        this.speedDetector = obtain;
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
        this.alreadySwipeHorizon = false;
        this.alreadyDetectSwipeOrientation = false;
        this.startExpandedStatus = false;
        this.downEventIntercept = false;
        this.speedDetector.clear();
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

    private final boolean ifSwipeHorizon(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8b2a369", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (Math.abs(this.startX - i) >= this.scrollThreshold) {
            return true;
        }
        return false;
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

    public static /* synthetic */ Object ipc$super(ShopOptSwipeLayout shopOptSwipeLayout, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/ShopOptSwipeLayout");
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

    /* JADX WARN: Code restructure failed: missing block: B:125:0x017b, code lost:
        r2 = r10.swipeListener;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x017d, code lost:
        if (r2 != null) goto L_0x0180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0180, code lost:
        r2.onSwipeUp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0185, code lost:
        if (r10.forceIntercept == false) goto L_0x0188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0187, code lost:
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0157 A[Catch: all -> 0x00bf, TryCatch #0 {all -> 0x00bf, blocks: (B:47:0x0097, B:49:0x009d, B:52:0x00a6, B:55:0x00af, B:56:0x00b3, B:58:0x00bb, B:62:0x00c2, B:64:0x00c6, B:66:0x00cb, B:68:0x00db, B:70:0x00df, B:71:0x00e2, B:73:0x00e6, B:75:0x00ea, B:77:0x00ef, B:85:0x0107, B:87:0x010b, B:91:0x011e, B:95:0x0126, B:98:0x012f, B:100:0x0136, B:103:0x013e, B:105:0x0142, B:108:0x0147, B:109:0x0151, B:111:0x0157, B:114:0x015c, B:115:0x015f, B:118:0x0164, B:120:0x016a, B:123:0x016f, B:125:0x017b, B:128:0x0180, B:129:0x0183, B:132:0x0188, B:133:0x018a), top: B:141:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb A[Catch: all -> 0x00bf, TryCatch #0 {all -> 0x00bf, blocks: (B:47:0x0097, B:49:0x009d, B:52:0x00a6, B:55:0x00af, B:56:0x00b3, B:58:0x00bb, B:62:0x00c2, B:64:0x00c6, B:66:0x00cb, B:68:0x00db, B:70:0x00df, B:71:0x00e2, B:73:0x00e6, B:75:0x00ea, B:77:0x00ef, B:85:0x0107, B:87:0x010b, B:91:0x011e, B:95:0x0126, B:98:0x012f, B:100:0x0136, B:103:0x013e, B:105:0x0142, B:108:0x0147, B:109:0x0151, B:111:0x0157, B:114:0x015c, B:115:0x015f, B:118:0x0164, B:120:0x016a, B:123:0x016f, B:125:0x017b, B:128:0x0180, B:129:0x0183, B:132:0x0188, B:133:0x018a), top: B:141:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012f A[Catch: all -> 0x00bf, TryCatch #0 {all -> 0x00bf, blocks: (B:47:0x0097, B:49:0x009d, B:52:0x00a6, B:55:0x00af, B:56:0x00b3, B:58:0x00bb, B:62:0x00c2, B:64:0x00c6, B:66:0x00cb, B:68:0x00db, B:70:0x00df, B:71:0x00e2, B:73:0x00e6, B:75:0x00ea, B:77:0x00ef, B:85:0x0107, B:87:0x010b, B:91:0x011e, B:95:0x0126, B:98:0x012f, B:100:0x0136, B:103:0x013e, B:105:0x0142, B:108:0x0147, B:109:0x0151, B:111:0x0157, B:114:0x015c, B:115:0x015f, B:118:0x0164, B:120:0x016a, B:123:0x016f, B:125:0x017b, B:128:0x0180, B:129:0x0183, B:132:0x0188, B:133:0x018a), top: B:141:0x0097 }] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.view.ShopOptSwipeLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
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

    public final boolean getEnableInterceptAllEventByDownEventIntercept() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44ec44e", new Object[]{this})).booleanValue();
        }
        return this.enableInterceptAllEventByDownEventIntercept;
    }

    public final d1a<Boolean> getExpandedStatusGetter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("fb6ed9ea", new Object[]{this});
        }
        return this.expandedStatusGetter;
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

    public final ShopSwipeListenerLayout.a getSwipeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopSwipeListenerLayout.a) ipChange.ipc$dispatch("8a4c3f4c", new Object[]{this});
        }
        return this.swipeListener;
    }

    public final boolean getTouchOnce() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f7dcb35", new Object[]{this})).booleanValue();
        }
        return this.touchOnce;
    }

    public final float getYSpeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a7058bb", new Object[]{this})).floatValue();
        }
        this.speedDetector.computeCurrentVelocity(1000);
        return this.speedDetector.getYVelocity();
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

    public final void setEnableInterceptAllEventByDownEventIntercept(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b00fdcd6", new Object[]{this, new Boolean(z)});
        } else {
            this.enableInterceptAllEventByDownEventIntercept = z;
        }
    }

    public final void setExpandedStatusGetter(d1a<Boolean> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f05b2c66", new Object[]{this, d1aVar});
        } else {
            this.expandedStatusGetter = d1aVar;
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

    public final void setSwipeListener(ShopSwipeListenerLayout.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d52e98a", new Object[]{this, aVar});
        } else {
            this.swipeListener = aVar;
        }
    }

    public final void setTouchOnce(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5832b5cf", new Object[]{this, new Boolean(z)});
        } else {
            this.touchOnce = z;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopOptSwipeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
        VelocityTracker obtain = VelocityTracker.obtain();
        ckf.f(obtain, "obtain()");
        this.speedDetector = obtain;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopOptSwipeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
        VelocityTracker obtain = VelocityTracker.obtain();
        ckf.f(obtain, "obtain()");
        this.speedDetector = obtain;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopOptSwipeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ckf.g(context, "context");
        VelocityTracker obtain = VelocityTracker.obtain();
        ckf.f(obtain, "obtain()");
        this.speedDetector = obtain;
    }
}
