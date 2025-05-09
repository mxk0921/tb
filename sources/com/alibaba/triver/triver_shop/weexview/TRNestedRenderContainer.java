package com.alibaba.triver.triver_shop.weexview;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ariver.engine.api.Render;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Timer;
import java.util.TimerTask;
import tb.qjs;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TRNestedRenderContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mWeexViewID;
    private RecyclerView recyclerView;
    private Render render;
    private float startX;
    private float startY;
    private String url;
    private boolean hasScrollHorizontally = false;
    private boolean innerScrollHorizontally = false;
    private float firstMoveOffsetY = 0.0f;
    private float lastSendOffsetY = 0.0f;
    private float currentSendOffsetY = 0.0f;
    private boolean scrollOnTop = true;
    private boolean touchEnded = false;
    private Timer timer = new Timer(true);
    private boolean touchMoveDispatched = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/weexview/TRNestedRenderContainer$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            if (TRNestedRenderContainer.access$000(TRNestedRenderContainer.this) != null && message.what == 1 && !TextUtils.isEmpty(TRNestedRenderContainer.access$100(TRNestedRenderContainer.this)) && TRNestedRenderContainer.access$100(TRNestedRenderContainer.this).indexOf("flagship_loft_show=1") < 0 && !TRNestedRenderContainer.access$200(TRNestedRenderContainer.this) && Math.abs(TRNestedRenderContainer.access$300(TRNestedRenderContainer.this) - TRNestedRenderContainer.access$400(TRNestedRenderContainer.this)) > 1.0f) {
                TRNestedRenderContainer.access$000(TRNestedRenderContainer.this).evaluateJavascript("if(window.__WEEX_SCROLL__ && typeof window.__WEEX_SCROLL__ === 'function') {window['__WEEX_SCROLL(" + TRNestedRenderContainer.access$500(TRNestedRenderContainer.this) + ")__'](" + qjs.f(TRNestedRenderContainer.this.getContext(), -TRNestedRenderContainer.access$300(TRNestedRenderContainer.this)) + ")}");
                TRNestedRenderContainer tRNestedRenderContainer = TRNestedRenderContainer.this;
                TRNestedRenderContainer.access$402(tRNestedRenderContainer, TRNestedRenderContainer.access$300(tRNestedRenderContainer));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Handler f3370a;

        public b(Handler handler) {
            this.f3370a = handler;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/weexview/TRNestedRenderContainer$2");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Message message = new Message();
            message.what = 1;
            this.f3370a.sendMessage(message);
        }
    }

    static {
        t2o.a(766510497);
    }

    public TRNestedRenderContainer(Context context) {
        super(context);
        this.timer.schedule(new b(new a()), 0L, 16L);
    }

    public static /* synthetic */ Render access$000(TRNestedRenderContainer tRNestedRenderContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Render) ipChange.ipc$dispatch("db30c9db", new Object[]{tRNestedRenderContainer});
        }
        return tRNestedRenderContainer.render;
    }

    public static /* synthetic */ String access$100(TRNestedRenderContainer tRNestedRenderContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f42aceec", new Object[]{tRNestedRenderContainer});
        }
        return tRNestedRenderContainer.url;
    }

    public static /* synthetic */ boolean access$200(TRNestedRenderContainer tRNestedRenderContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b164917", new Object[]{tRNestedRenderContainer})).booleanValue();
        }
        return tRNestedRenderContainer.touchEnded;
    }

    public static /* synthetic */ float access$300(TRNestedRenderContainer tRNestedRenderContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed60fde2", new Object[]{tRNestedRenderContainer})).floatValue();
        }
        return tRNestedRenderContainer.currentSendOffsetY;
    }

    public static /* synthetic */ float access$400(TRNestedRenderContainer tRNestedRenderContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6fabb2c1", new Object[]{tRNestedRenderContainer})).floatValue();
        }
        return tRNestedRenderContainer.lastSendOffsetY;
    }

    public static /* synthetic */ float access$402(TRNestedRenderContainer tRNestedRenderContainer, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c227581", new Object[]{tRNestedRenderContainer, new Float(f)})).floatValue();
        }
        tRNestedRenderContainer.lastSendOffsetY = f;
        return f;
    }

    public static /* synthetic */ String access$500(TRNestedRenderContainer tRNestedRenderContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9849e2f0", new Object[]{tRNestedRenderContainer});
        }
        return tRNestedRenderContainer.mWeexViewID;
    }

    private boolean canScrollHorizontall(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b1d7456", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        return this.hasScrollHorizontally;
    }

    public static /* synthetic */ Object ipc$super(TRNestedRenderContainer tRNestedRenderContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -572887227) {
            super.addView((View) objArr[0]);
            return null;
        } else if (hashCode == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/weexview/TRNestedRenderContainer");
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddda6f45", new Object[]{this, view});
        } else {
            super.addView(view);
        }
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4259e1", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount() - 1;
            while (childCount >= 0) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i2 + scrollX;
                if (i6 < childAt.getLeft() || i6 >= childAt.getRight() || (i5 = i3 + scrollY) < childAt.getTop() || i5 >= childAt.getBottom()) {
                    i4 = childCount;
                } else {
                    i4 = childCount;
                    if (canScroll(childAt, true, i, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                        return true;
                    }
                }
                childCount = i4 - 1;
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.render = null;
        this.recyclerView = null;
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46db97ca", new Object[]{this, recyclerView});
        } else {
            this.recyclerView = recyclerView;
        }
    }

    public void setRender(Render render) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("849b1299", new Object[]{this, render});
        } else {
            this.render = render;
        }
    }

    public void setScrollOnTop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb91126", new Object[]{this, new Boolean(z)});
        } else {
            this.scrollOnTop = z;
        }
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.url = str;
        }
    }

    public void setWeexViewID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e9ada34", new Object[]{this, str});
        } else {
            this.mWeexViewID = str;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.touchEnded = false;
            this.startX = motionEvent.getX();
            this.startY = motionEvent.getY();
            this.hasScrollHorizontally = false;
            this.innerScrollHorizontally = false;
            super.dispatchTouchEvent(motionEvent);
            return false;
        } else if (action == 1) {
            this.touchEnded = true;
            this.touchMoveDispatched = false;
            setScrollOnTop(false);
            RecyclerView recyclerView = this.recyclerView;
            if (recyclerView != null && ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition() == 0) {
                setScrollOnTop(true);
            }
            this.firstMoveOffsetY = 0.0f;
            this.lastSendOffsetY = 0.0f;
            this.currentSendOffsetY = 0.0f;
            if (this.render != null && !TextUtils.isEmpty(this.url) && this.url.indexOf("flagship_loft_show=1") < 0) {
                if (TextUtils.isEmpty(this.mWeexViewID)) {
                    this.render.evaluateJavascript("if(window.__WEEX_SCROLL__ && typeof window.__WEEX_SCROLL__ === 'function') {window.__WEEX_SCROLL__('onTouchEnd')}");
                } else {
                    this.render.evaluateJavascript("if(window.__WEEX_SCROLL__ && typeof window.__WEEX_SCROLL__ === 'function') {window['__WEEX_SCROLL(" + this.mWeexViewID + ")__']('onTouchEnd')}");
                }
            }
            if (this.hasScrollHorizontally) {
                this.hasScrollHorizontally = false;
                if (!this.innerScrollHorizontally) {
                    return false;
                }
                this.innerScrollHorizontally = false;
                return super.dispatchTouchEvent(motionEvent);
            }
            super.dispatchTouchEvent(motionEvent);
            return false;
        } else if (action == 2) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float f = x - this.startX;
            float f2 = y - this.startY;
            if (!this.touchMoveDispatched) {
                this.touchMoveDispatched = true;
                if (Math.abs(f) > Math.abs(f2)) {
                    this.hasScrollHorizontally = true;
                } else {
                    this.hasScrollHorizontally = false;
                }
            }
            if (canScrollHorizontall(f, f2)) {
                this.hasScrollHorizontally = true;
                if (!canScroll(this, false, (int) f, (int) x, (int) y)) {
                    return false;
                }
                this.innerScrollHorizontally = true;
                return super.dispatchTouchEvent(motionEvent);
            }
            this.hasScrollHorizontally = false;
            this.innerScrollHorizontally = false;
            if (!this.scrollOnTop) {
                this.firstMoveOffsetY = f2;
            } else {
                this.currentSendOffsetY = f2 - this.firstMoveOffsetY;
            }
            return super.dispatchTouchEvent(motionEvent);
        } else if (action == 3) {
            return super.dispatchTouchEvent(motionEvent);
        } else {
            super.dispatchTouchEvent(motionEvent);
            return false;
        }
    }
}
