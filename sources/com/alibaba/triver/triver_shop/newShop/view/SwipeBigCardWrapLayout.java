package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class SwipeBigCardWrapLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean alreadyDetect;
    private int moveEventCount;
    private float startX;
    private float startY;
    private int swipeThreshold;

    static {
        t2o.a(766509741);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeBigCardWrapLayout(Context context) {
        super(context);
        ckf.g(context, "context");
        this.swipeThreshold = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private final void clearStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0cbe1a6", new Object[]{this});
            return;
        }
        this.startX = 0.0f;
        this.startY = 0.0f;
        this.alreadyDetect = false;
        this.moveEventCount = 0;
    }

    private final ShopSwipeListenerLayout findShopSwipeLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopSwipeListenerLayout) ipChange.ipc$dispatch("9f508374", new Object[]{this});
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ShopSwipeListenerLayout) {
                return (ShopSwipeListenerLayout) parent;
            }
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(SwipeBigCardWrapLayout swipeBigCardWrapLayout, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/SwipeBigCardWrapLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            clearStatus();
            ShopSwipeListenerLayout findShopSwipeLayout = findShopSwipeLayout();
            if (findShopSwipeLayout != null) {
                findShopSwipeLayout.setIgnoreVerticalEvent(false);
            }
        }
        if (motionEvent.getAction() == 0) {
            clearStatus();
            this.startX = motionEvent.getX();
            this.startY = motionEvent.getY();
            ShopSwipeListenerLayout findShopSwipeLayout2 = findShopSwipeLayout();
            if (findShopSwipeLayout2 != null) {
                findShopSwipeLayout2.setIgnoreVerticalEvent(true);
            }
        }
        if (motionEvent.getAction() == 2 && !this.alreadyDetect) {
            int i = this.moveEventCount + 1;
            this.moveEventCount = i;
            if (i == 3) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float abs = Math.abs(this.startX - x);
                float abs2 = Math.abs(this.startY - y);
                double d = 2;
                float sqrt = (float) Math.sqrt(((float) Math.pow(abs, d)) + ((float) Math.pow(abs2, d)));
                ShopSwipeListenerLayout findShopSwipeLayout3 = findShopSwipeLayout();
                if (findShopSwipeLayout3 != null) {
                    if (abs2 <= abs && sqrt >= this.swipeThreshold) {
                        z = true;
                    }
                    findShopSwipeLayout3.setIgnoreVerticalEvent(z);
                }
                this.alreadyDetect = true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean getAlreadyDetect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f13b2770", new Object[]{this})).booleanValue();
        }
        return this.alreadyDetect;
    }

    public final int getMoveEventCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79ae98b6", new Object[]{this})).intValue();
        }
        return this.moveEventCount;
    }

    public final float getStartX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ff8f9a3", new Object[]{this})).floatValue();
        }
        return this.startX;
    }

    public final float getStartY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90071124", new Object[]{this})).floatValue();
        }
        return this.startY;
    }

    public final int getSwipeThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f169c41", new Object[]{this})).intValue();
        }
        return this.swipeThreshold;
    }

    public final void setAlreadyDetect(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd55faf4", new Object[]{this, new Boolean(z)});
        } else {
            this.alreadyDetect = z;
        }
    }

    public final void setMoveEventCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69b214", new Object[]{this, new Integer(i)});
        } else {
            this.moveEventCount = i;
        }
    }

    public final void setStartX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c17e1", new Object[]{this, new Float(f)});
        } else {
            this.startX = f;
        }
    }

    public final void setStartY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("740f080", new Object[]{this, new Float(f)});
        } else {
            this.startY = f;
        }
    }

    public final void setSwipeThreshold(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2021fe9", new Object[]{this, new Integer(i)});
        } else {
            this.swipeThreshold = i;
        }
    }
}
