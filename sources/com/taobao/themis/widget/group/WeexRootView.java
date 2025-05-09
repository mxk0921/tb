package com.taobao.themis.widget.group;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.dde;
import tb.pce;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/taobao/themis/widget/group/WeexRootView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ltb/pce;", DataReceiveMonitor.CB_LISTENER, "Ltb/xhv;", "setCustomGestureListener", "(Ltb/pce;)V", "Ltb/dde;", "setCustomScrollListener", "(Ltb/dde;)V", "getGestureListener", "()Ltb/pce;", "getScrollListener", "()Ltb/dde;", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "mCustomGestureEventListener", "Ltb/pce;", "mCustomScrollListener", "Ltb/dde;", "disallowParentIntercept", "Z", "gestureListener", "scrollListener", "themis_widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class WeexRootView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private pce mCustomGestureEventListener;
    private dde mCustomScrollListener;
    private boolean disallowParentIntercept = true;
    private final pce gestureListener = new a();
    private final dde scrollListener = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements pce {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.pce
        public final void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("267b7fce", new Object[]{this, map});
                return;
            }
            WeexRootView.access$setDisallowParentIntercept$p(WeexRootView.this, ckf.b(map.get("state"), Boolean.TRUE));
            pce access$getMCustomGestureEventListener$p = WeexRootView.access$getMCustomGestureEventListener$p(WeexRootView.this);
            if (access$getMCustomGestureEventListener$p != null) {
                access$getMCustomGestureEventListener$p.a(map);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements dde {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.dde
        public final void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4568a0fc", new Object[]{this, map});
                return;
            }
            Object obj = map.get("pixels");
            if (obj != null) {
                if (((Double) obj).doubleValue() > vu3.b.GEO_NOT_SUPPORT) {
                    WeexRootView.access$setDisallowParentIntercept$p(WeexRootView.this, false);
                }
                dde access$getMCustomScrollListener$p = WeexRootView.access$getMCustomScrollListener$p(WeexRootView.this);
                if (access$getMCustomScrollListener$p != null) {
                    access$getMCustomScrollListener$p.a(map);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Double");
        }
    }

    static {
        t2o.a(852492342);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeexRootView(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    public static final /* synthetic */ pce access$getMCustomGestureEventListener$p(WeexRootView weexRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pce) ipChange.ipc$dispatch("8ec07d22", new Object[]{weexRootView});
        }
        return weexRootView.mCustomGestureEventListener;
    }

    public static final /* synthetic */ dde access$getMCustomScrollListener$p(WeexRootView weexRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dde) ipChange.ipc$dispatch("3642662a", new Object[]{weexRootView});
        }
        return weexRootView.mCustomScrollListener;
    }

    public static final /* synthetic */ void access$setDisallowParentIntercept$p(WeexRootView weexRootView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a706e4e", new Object[]{weexRootView, new Boolean(z)});
        } else {
            weexRootView.disallowParentIntercept = z;
        }
    }

    public static /* synthetic */ Object ipc$super(WeexRootView weexRootView, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/widget/group/WeexRootView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        ckf.g(motionEvent, "ev");
        if (motionEvent.getAction() == 0) {
            this.disallowParentIntercept = true;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.disallowParentIntercept);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final pce getGestureListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pce) ipChange.ipc$dispatch("1e9502dc", new Object[]{this});
        }
        return this.gestureListener;
    }

    public final dde getScrollListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dde) ipChange.ipc$dispatch("33793f90", new Object[]{this});
        }
        return this.scrollListener;
    }

    public final void setCustomGestureListener(pce pceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("416ec0ad", new Object[]{this, pceVar});
            return;
        }
        ckf.g(pceVar, DataReceiveMonitor.CB_LISTENER);
        this.mCustomGestureEventListener = pceVar;
    }

    public final void setCustomScrollListener(dde ddeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532c8727", new Object[]{this, ddeVar});
            return;
        }
        ckf.g(ddeVar, DataReceiveMonitor.CB_LISTENER);
        this.mCustomScrollListener = ddeVar;
    }
}
