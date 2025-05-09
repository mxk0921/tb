package com.taobao.android.order.bundle.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class OffsetBodyWrapper extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isResetRunning;
    private b mBusiness;
    private AKVerticalGestureHandler mGestureHandler;
    private int mInitOffset;
    private int mMaxBodyOffset;
    private final String TAG = "OffsetBodyWrapper";
    private boolean mInWeexContainer = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f9122a;

        public a(int i) {
            this.f9122a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (((RecyclerView) OffsetBodyWrapper.this.getChildAt(0)).computeVerticalScrollOffset() == 0) {
                    OffsetBodyWrapper.access$000(OffsetBodyWrapper.this).q(this.f9122a, OffsetBodyWrapper.this, 300.0f);
                }
            } catch (Throwable unused) {
            }
            OffsetBodyWrapper.access$102(OffsetBodyWrapper.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void a();

        int b();

        int c();

        void d(JSONObject jSONObject);

        boolean e();
    }

    static {
        t2o.a(713031980);
        t2o.a(713031974);
    }

    public OffsetBodyWrapper(Context context) {
        super(context);
    }

    public static /* synthetic */ AKVerticalGestureHandler access$000(OffsetBodyWrapper offsetBodyWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AKVerticalGestureHandler) ipChange.ipc$dispatch("6b4d1f8", new Object[]{offsetBodyWrapper});
        }
        return offsetBodyWrapper.mGestureHandler;
    }

    public static /* synthetic */ boolean access$102(OffsetBodyWrapper offsetBodyWrapper, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7520edb", new Object[]{offsetBodyWrapper, new Boolean(z)})).booleanValue();
        }
        offsetBodyWrapper.isResetRunning = z;
        return z;
    }

    private void initOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa694ca", new Object[]{this});
            return;
        }
        AKVerticalGestureHandler aKVerticalGestureHandler = this.mGestureHandler;
        if (aKVerticalGestureHandler != null) {
            aKVerticalGestureHandler.q(0, this, 1000.0f);
        }
    }

    public static /* synthetic */ Object ipc$super(OffsetBodyWrapper offsetBodyWrapper, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/order/bundle/widget/OffsetBodyWrapper");
    }

    private void setBodyOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a68fde", new Object[]{this});
        } else if (this.mMaxBodyOffset != this.mBusiness.c() || this.mInitOffset != this.mBusiness.b()) {
            this.mMaxBodyOffset = this.mBusiness.c();
            int b2 = this.mBusiness.b();
            this.mInitOffset = b2;
            AKVerticalGestureHandler aKVerticalGestureHandler = this.mGestureHandler;
            if (aKVerticalGestureHandler != null) {
                int i = this.mMaxBodyOffset;
                aKVerticalGestureHandler.p(b2, i, i, this);
            }
            if (this.mBusiness.e() || this.mMaxBodyOffset == 0) {
                initOffset();
            }
        }
    }

    public b getBusiness() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b9aa468f", new Object[]{this});
        }
        return this.mBusiness;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        AKVerticalGestureHandler aKVerticalGestureHandler = this.mGestureHandler;
        if (aKVerticalGestureHandler != null) {
            try {
                if (!this.mInWeexContainer) {
                    return aKVerticalGestureHandler.i(motionEvent, this);
                }
                return false;
            } catch (Throwable unused) {
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        AKVerticalGestureHandler aKVerticalGestureHandler = this.mGestureHandler;
        if (aKVerticalGestureHandler != null) {
            try {
                return aKVerticalGestureHandler.j(motionEvent, this);
            } catch (Throwable unused) {
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        AKVerticalGestureHandler aKVerticalGestureHandler = this.mGestureHandler;
        if (aKVerticalGestureHandler != null) {
            aKVerticalGestureHandler.k();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ab759a", new Object[]{this, new Boolean(z)});
            return;
        }
        AKVerticalGestureHandler aKVerticalGestureHandler = this.mGestureHandler;
        if (aKVerticalGestureHandler != null) {
            aKVerticalGestureHandler.l(this, z);
        }
    }

    public void resetState(int i) {
        AKVerticalGestureHandler aKVerticalGestureHandler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c34d01a", new Object[]{this, new Integer(i)});
        } else if (!this.isResetRunning && (aKVerticalGestureHandler = this.mGestureHandler) != null && i != aKVerticalGestureHandler.g() && this.mGestureHandler.g() != 4) {
            this.isResetRunning = true;
            post(new a(i));
        }
    }

    public void setBusiness(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a44282f9", new Object[]{this, bVar});
        } else {
            this.mBusiness = bVar;
        }
    }

    public void setGestureHandler(AKVerticalGestureHandler aKVerticalGestureHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44902a4", new Object[]{this, aKVerticalGestureHandler});
        } else {
            this.mGestureHandler = aKVerticalGestureHandler;
        }
    }

    public void setInWeexContainer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b268734", new Object[]{this, new Boolean(z)});
        } else {
            this.mInWeexContainer = z;
        }
    }

    public void updateBodyOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31e3cc05", new Object[]{this});
            return;
        }
        this.mBusiness.a();
        setBodyOffset();
    }

    public void initBodyWrapper(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b9556", new Object[]{this, jSONObject});
            return;
        }
        b bVar = this.mBusiness;
        if (bVar != null) {
            bVar.d(jSONObject);
            setBodyOffset();
        }
    }

    public OffsetBodyWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OffsetBodyWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
