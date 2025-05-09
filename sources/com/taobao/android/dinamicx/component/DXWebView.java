package com.taobao.android.dinamicx.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXRecyclerEvent;
import com.taobao.android.dinamicx.widget.DXWebViewWidgetNode;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.uc.webview.export.WebResourceError;
import com.uc.webview.export.WebResourceRequest;
import com.uc.webview.export.WebView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import tb.a07;
import tb.ckf;
import tb.jpu;
import tb.la6;
import tb.mw5;
import tb.pb6;
import tb.srf;
import tb.xhv;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0007*\u0001d\u0018\u00002\u00020\u0001:\u0001iB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J7\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0014¢\u0006\u0004\b!\u0010\u000eJ\r\u0010\"\u001a\u00020\n¢\u0006\u0004\b\"\u0010\u000eJW\u0010,\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u0019H\u0016¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\n¢\u0006\u0004\b.\u0010\u000eJ\r\u0010/\u001a\u00020\u0019¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\n¢\u0006\u0004\b1\u0010\u000eJ\u0019\u00103\u001a\u00020\n2\b\u00102\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b3\u0010\fJ\u0017\u00106\u001a\u00020\u00192\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J#\u0010<\u001a\u00020\n2\b\u00109\u001a\u0004\u0018\u0001082\b\u0010;\u001a\u0004\u0018\u00010:H\u0007¢\u0006\u0004\b<\u0010=J)\u0010A\u001a\u00020\n2\u0006\u0010>\u001a\u00020\b2\u0012\b\u0002\u0010@\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010?¢\u0006\u0004\bA\u0010BJ\u0015\u0010C\u001a\u00020\n2\u0006\u0010;\u001a\u00020:¢\u0006\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010IR\u0016\u0010K\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010LR\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010NR\u0016\u0010O\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010LR\u0016\u0010P\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010LR\u0016\u0010Q\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010LR\u0016\u0010R\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010IR\u0016\u0010S\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010IR\u0016\u0010V\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010LR\u0016\u0010W\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010LR\"\u0010X\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010I\u001a\u0004\bY\u00100\"\u0004\bZ\u0010[R\"\u0010]\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0016\u0010c\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010^R\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010g\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010LR\u0016\u0010h\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010L¨\u0006j"}, d2 = {"Lcom/taobao/android/dinamicx/component/DXWebView;", "Landroid/taobao/windvane/extra/uc/WVUCWebView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "msg", "Ltb/xhv;", "loge", "(Ljava/lang/String;)V", "callBackToHome", "()V", "correctScrollY", "", "dx", "dy", "onScrollWithControl", "(II)V", "Landroidx/recyclerview/widget/RecyclerView;", "findRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "postScrollEvent", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "onDetachedFromWindow", "resetRequestStatus", "deltaX", "deltaY", "scrollX", "scrollY", "scrollRangeX", "scrollRangeY", "maxOverScrollX", "maxOverScrollY", "isTouchEvent", "coreOverScrollBy", "(IIIIIIIIZ)Z", "resetAnchorState", "isWebReachTop", "()Z", "scrollToTop", "url", "loadUrl", "Landroid/view/MotionEvent;", "event", "coreDispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lcom/alibaba/fastjson/JSONObject;", "config", "Lcom/taobao/android/dinamicx/widget/DXWebViewWidgetNode;", "widgetNode", "setScrollConfig", "(Lcom/alibaba/fastjson/JSONObject;Lcom/taobao/android/dinamicx/widget/DXWebViewWidgetNode;)V", "funcString", "Landroid/webkit/ValueCallback;", "callback", "callJS", "(Ljava/lang/String;Landroid/webkit/ValueCallback;)V", "updateWidget", "(Lcom/taobao/android/dinamicx/widget/DXWebViewWidgetNode;)V", "Lcom/taobao/android/dinamicx/expression/event/DXRecyclerEvent;", "onScrollEvent", "Lcom/taobao/android/dinamicx/expression/event/DXRecyclerEvent;", "enableScrollEventCallback", "Z", "enableAnchorCallback", "translateYLimited", TLogTracker.LEVEL_INFO, "anchorOffsetY", "Lcom/taobao/android/dinamicx/widget/DXWebViewWidgetNode;", "offsetY", "offsetX", "vectorOffsetY", "limitedEdgeChecked", "anchorState", "Ljava/lang/String;", "preIsReachTop", "onTouchDealtX", "onTouchDealtY", "enableInterceptTopScroll", "getEnableInterceptTopScroll", "setEnableInterceptTopScroll", "(Z)V", "Lcom/taobao/android/dinamicx/component/DXWebView$STATUS;", "requestStatus", "Lcom/taobao/android/dinamicx/component/DXWebView$STATUS;", "getRequestStatus", "()Lcom/taobao/android/dinamicx/component/DXWebView$STATUS;", "setRequestStatus", "(Lcom/taobao/android/dinamicx/component/DXWebView$STATUS;)V", "preRequestStatus", "com/taobao/android/dinamicx/component/DXWebView$a", "webViewCallback", "Lcom/taobao/android/dinamicx/component/DXWebView$a;", "mLastRawY", "mLastRawX", "STATUS", "TBDinamicX_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class DXWebView extends WVUCWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int anchorOffsetY;
    private String anchorState;
    private boolean enableAnchorCallback;
    private boolean enableInterceptTopScroll;
    private boolean enableScrollEventCallback;
    private boolean limitedEdgeChecked;
    private int mLastRawX;
    private int mLastRawY;
    private int offsetX;
    private int offsetY;
    private final DXRecyclerEvent onScrollEvent;
    private int onTouchDealtX;
    private int onTouchDealtY;
    private boolean preIsReachTop;
    private STATUS preRequestStatus;
    private STATUS requestStatus;
    private int translateYLimited;
    private int vectorOffsetY;
    private final a webViewCallback;
    private DXWebViewWidgetNode widgetNode;

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/android/dinamicx/component/DXWebView$STATUS;", "", "(Ljava/lang/String;I)V", ModuleConstants.VI_MODULE_NAME_INIT, "START", "FAILED", "SUCCEED", "TBDinamicX_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum STATUS {
        INIT,
        START,
        FAILED,
        SUCCEED;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(STATUS status, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/component/DXWebView$STATUS");
        }

        public static STATUS valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("5235c8f6", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(STATUS.class, str);
            }
            return (STATUS) valueOf;
        }
    }

    public DXWebView(Context context) {
        this(context, null, 2, null);
    }

    public static final /* synthetic */ STATUS access$getPreRequestStatus$p(DXWebView dXWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (STATUS) ipChange.ipc$dispatch("6752d895", new Object[]{dXWebView});
        }
        return dXWebView.preRequestStatus;
    }

    public static final /* synthetic */ DXWebViewWidgetNode access$getWidgetNode$p(DXWebView dXWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWebViewWidgetNode) ipChange.ipc$dispatch("50535a20", new Object[]{dXWebView});
        }
        return dXWebView.widgetNode;
    }

    public static final /* synthetic */ void access$loge(DXWebView dXWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47d1abc3", new Object[]{dXWebView, str});
        } else {
            dXWebView.loge(str);
        }
    }

    public static final /* synthetic */ void access$setPreRequestStatus$p(DXWebView dXWebView, STATUS status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8531e2e7", new Object[]{dXWebView, status});
        } else {
            dXWebView.preRequestStatus = status;
        }
    }

    public static final /* synthetic */ void access$setWidgetNode$p(DXWebView dXWebView, DXWebViewWidgetNode dXWebViewWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a705fce2", new Object[]{dXWebView, dXWebViewWidgetNode});
        } else {
            dXWebView.widgetNode = dXWebViewWidgetNode;
        }
    }

    private final void callBackToHome() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf91afc6", new Object[]{this});
        }
    }

    public static /* synthetic */ void callJS$default(DXWebView dXWebView, String str, ValueCallback valueCallback, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbe04619", new Object[]{dXWebView, str, valueCallback, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            valueCallback = null;
        }
        dXWebView.callJS(str, valueCallback);
    }

    private final void correctScrollY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28777ae9", new Object[]{this});
            return;
        }
        DXWebViewWidgetNode dXWebViewWidgetNode = this.widgetNode;
        if (dXWebViewWidgetNode != null) {
            DXRuntimeContext dXRuntimeContext = dXWebViewWidgetNode.getDXRuntimeContext();
            ckf.f(dXRuntimeContext, "it.dxRuntimeContext");
            Object q = dXRuntimeContext.q();
            if (!(q instanceof WeakReference)) {
                q = null;
            }
            WeakReference weakReference = (WeakReference) q;
            if (weakReference != null) {
                weakReference.get();
            }
        }
    }

    private final RecyclerView findRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("d44d670b", new Object[]{this});
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof RecyclerView) {
                return (RecyclerView) parent;
            }
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(DXWebView dXWebView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1988789126:
                super.loadUrl((String) objArr[0]);
                return null;
            case -1253202540:
                return new Boolean(super.coreDispatchTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 143825882:
                return new Boolean(super.coreOverScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue()));
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/component/DXWebView");
        }
    }

    private final void loge(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ada172", new Object[]{this, str});
        } else {
            la6.b(str);
        }
    }

    private final void postScrollEvent(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b6e074", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.onScrollEvent.setDeltaX(i);
        this.onScrollEvent.setDeltaY(i2);
        this.onScrollEvent.setOffsetX(this.offsetX);
        this.onScrollEvent.setOffsetY(this.offsetY);
        DXWebViewWidgetNode dXWebViewWidgetNode = this.widgetNode;
        if (dXWebViewWidgetNode != null) {
            this.onScrollEvent.setUserId(dXWebViewWidgetNode.getUserId());
            this.onScrollEvent.setSelfWidget(dXWebViewWidgetNode);
            this.onScrollEvent.setDataToArgs();
            dXWebViewWidgetNode.postEvent(this.onScrollEvent);
        }
    }

    public final void callJS(String str, ValueCallback<String> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c507d3e", new Object[]{this, str, valueCallback});
            return;
        }
        ckf.g(str, "funcString");
        evaluateJavascript(str, valueCallback);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreDispatchTouchEvent(MotionEvent motionEvent) {
        DXWebViewWidgetNode dXWebViewWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b54da594", new Object[]{this, motionEvent})).booleanValue();
        }
        ckf.g(motionEvent, "event");
        STATUS status = this.requestStatus;
        STATUS status2 = STATUS.SUCCEED;
        if (status == status2 || this.preRequestStatus == status2) {
            int rawY = (int) motionEvent.getRawY();
            int rawX = (int) motionEvent.getRawX();
            if (motionEvent.getAction() == 0) {
                loge("coreDispatchTouchEvent MotionEvent.ACTION_DOWN");
                RecyclerView findRecyclerView = findRecyclerView();
                if (findRecyclerView != null) {
                    findRecyclerView.requestDisallowInterceptTouchEvent(true);
                }
                this.mLastRawY = rawY;
                this.mLastRawX = rawX;
            } else if (motionEvent.getAction() == 2) {
                int i = this.mLastRawY - rawY;
                int i2 = this.mLastRawX - rawX;
                this.mLastRawY = rawY;
                this.mLastRawX = rawX;
                this.offsetY += i;
                this.offsetX += i2;
                this.onTouchDealtX = i2;
                this.onTouchDealtY = i;
                if (DinamicXEngine.j0()) {
                    loge("coreDispatchTouchEvent scroll dx:" + i2 + " dy:" + i + " offsetY:" + this.offsetY + " offsetX:" + this.offsetX);
                }
            }
            return super.coreDispatchTouchEvent(motionEvent);
        }
        loge("coreDispatchTouchEvent requestStatus = " + this.requestStatus + " + preRequestStatus = " + this.preRequestStatus);
        RecyclerView findRecyclerView2 = findRecyclerView();
        if (findRecyclerView2 != null) {
            findRecyclerView2.requestDisallowInterceptTouchEvent(false);
        }
        STATUS status3 = this.requestStatus;
        STATUS status4 = STATUS.INIT;
        if (status3 == status4 && this.preRequestStatus == status4 && (dXWebViewWidgetNode = this.widgetNode) != null) {
            dXWebViewWidgetNode.E();
        }
        return super.coreDispatchTouchEvent(motionEvent);
    }

    public final boolean getEnableInterceptTopScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c193244", new Object[]{this})).booleanValue();
        }
        return this.enableInterceptTopScroll;
    }

    public final STATUS getRequestStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (STATUS) ipChange.ipc$dispatch("5e0159dd", new Object[]{this});
        }
        return this.requestStatus;
    }

    public final boolean isWebReachTop() {
        View coreView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc888d57", new Object[]{this})).booleanValue();
        }
        if (this.requestStatus != STATUS.SUCCEED || (getScrollY() == 0 && (coreView = getCoreView()) != null && coreView.getScrollY() == 0)) {
            return true;
        }
        return false;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, android.taobao.windvane.webview.IWVWebView
    public void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
            return;
        }
        loge("loadUrl:".concat(String.valueOf(str)));
        super.loadUrl(str);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        try {
            super.onDetachedFromWindow();
        } catch (Exception e) {
            if (DinamicXEngine.j0()) {
                StringBuilder sb = new StringBuilder("onDetachedFromWindow error");
                e.printStackTrace();
                sb.append(xhv.INSTANCE);
                loge(sb.toString());
            }
            this.requestStatus = STATUS.FAILED;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onLayout error");
            e.printStackTrace();
            sb.append(xhv.INSTANCE);
            loge(sb.toString());
            this.requestStatus = STATUS.FAILED;
        }
    }

    public final void resetRequestStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c0bdd9", new Object[]{this});
            return;
        }
        STATUS status = STATUS.INIT;
        this.requestStatus = status;
        this.preRequestStatus = status;
    }

    public final void scrollToTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2787c14", new Object[]{this});
            return;
        }
        evaluateJavascript("window.subscriptionFrontEndCommonUtils.scrollToTop()", null);
        resetAnchorState();
    }

    public final void setEnableInterceptTopScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9950c708", new Object[]{this, new Boolean(z)});
        } else {
            this.enableInterceptTopScroll = z;
        }
    }

    public final void setRequestStatus(STATUS status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bf4e99f", new Object[]{this, status});
            return;
        }
        ckf.g(status, "<set-?>");
        this.requestStatus = status;
    }

    public final void updateWidget(DXWebViewWidgetNode dXWebViewWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d273050", new Object[]{this, dXWebViewWidgetNode});
            return;
        }
        ckf.g(dXWebViewWidgetNode, "widgetNode");
        this.widgetNode = dXWebViewWidgetNode;
    }

    public /* synthetic */ DXWebView(Context context, AttributeSet attributeSet, int i, a07 a07Var) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final void resetAnchorState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb2a414", new Object[]{this});
            return;
        }
        this.offsetY = 0;
        this.offsetX = 0;
        this.vectorOffsetY = 0;
        this.limitedEdgeChecked = false;
        if (this.enableAnchorCallback && ckf.b(this.anchorState, "reach")) {
            Map<String, mw5> args = this.onScrollEvent.getArgs();
            ckf.f(args, "onScrollEvent.args");
            String lowerCase = "leave".toLowerCase();
            ckf.f(lowerCase, "(this as java.lang.String).toLowerCase()");
            args.put("anchorState", mw5.O(lowerCase));
            postScrollEvent(0, 0);
        }
        this.anchorState = "none";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
        this.onScrollEvent = new DXRecyclerEvent(5288751146867425108L);
        this.translateYLimited = Integer.MAX_VALUE;
        this.anchorOffsetY = -1;
        this.anchorState = "none";
        STATUS status = STATUS.INIT;
        this.requestStatus = status;
        this.preRequestStatus = status;
        this.webViewCallback = new a(context, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void onScrollWithControl(int r11, int r12) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.component.DXWebView.onScrollWithControl(int, int):void");
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8929bda", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)})).booleanValue();
        }
        if (Math.abs(this.onTouchDealtX) >= 20 && Math.abs(this.onTouchDealtX) >= Math.abs(this.onTouchDealtY)) {
            loge("rv requestDisallowInterceptTouchEvent x");
            RecyclerView findRecyclerView = findRecyclerView();
            if (findRecyclerView != null) {
                findRecyclerView.requestDisallowInterceptTouchEvent(false);
            }
        }
        if (i4 == 0 && this.onTouchDealtY < 0 && this.enableInterceptTopScroll) {
            RecyclerView findRecyclerView2 = findRecyclerView();
            if (findRecyclerView2 != null) {
                findRecyclerView2.requestDisallowInterceptTouchEvent(false);
            }
            correctScrollY();
            loge("rv requestDisallowInterceptTouchEvent y");
        }
        if (this.preIsReachTop != (i4 == 0)) {
            callBackToHome();
            if (i4 != 0) {
                z2 = false;
            }
            this.preIsReachTop = z2;
            loge("coreOverScrollBy callBackToHome");
        }
        if (DinamicXEngine.j0()) {
            loge("coreOverScrollBy deltaY:" + i2 + " scrollY:" + i4 + " deltaX:" + i + " scrollX:" + i3 + " scrollRangeX:" + i5);
        }
        onScrollWithControl(this.onTouchDealtX, this.onTouchDealtY);
        return super.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    public final void setScrollConfig(JSONObject jSONObject, DXWebViewWidgetNode dXWebViewWidgetNode) {
        int i;
        int i2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862fa9d4", new Object[]{this, jSONObject, dXWebViewWidgetNode});
            return;
        }
        setWebViewClient(this.webViewCallback);
        if (jSONObject == null || jSONObject.isEmpty()) {
            this.widgetNode = null;
            return;
        }
        this.widgetNode = dXWebViewWidgetNode;
        Boolean bool = Boolean.FALSE;
        Boolean c = srf.c("enableScrollEventCallback", jSONObject, bool);
        ckf.f(c, "JSONUtils.getBoolean(\"en…Callback\", config, false)");
        this.enableScrollEventCallback = c.booleanValue();
        Boolean c2 = srf.c("enableAnchorCallback", jSONObject, bool);
        ckf.f(c2, "JSONUtils.getBoolean(\"en…Callback\", config, false)");
        this.enableAnchorCallback = c2.booleanValue();
        if (jSONObject.containsKey("translateYLimited")) {
            if (dXWebViewWidgetNode != null) {
                i2 = pb6.d(dXWebViewWidgetNode.getEngine(), DinamicXEngine.x(), jSONObject.getIntValue("translateYLimited"));
            } else {
                i2 = pb6.c(DinamicXEngine.x(), jSONObject.getIntValue("translateYLimited"));
            }
            this.translateYLimited = i2;
        }
        if (jSONObject.containsKey("anchorOffsetY")) {
            if (dXWebViewWidgetNode != null) {
                i = pb6.d(dXWebViewWidgetNode.getEngine(), DinamicXEngine.x(), jSONObject.getIntValue("anchorOffsetY"));
            } else {
                i = pb6.c(DinamicXEngine.x(), jSONObject.getIntValue("anchorOffsetY"));
            }
            this.anchorOffsetY = i;
        }
        boolean z2 = this.enableAnchorCallback;
        if (this.anchorOffsetY <= 0) {
            z = false;
        }
        this.enableAnchorCallback = z2 & z;
        HashMap hashMap = new HashMap();
        mw5 K = mw5.K(this.translateYLimited);
        ckf.f(K, "DXExprVar.ofInt(translateYLimited.toLong())");
        hashMap.put("translateYLimited", K);
        mw5 K2 = mw5.K(this.anchorOffsetY);
        ckf.f(K2, "DXExprVar.ofInt(anchorOffsetY.toLong())");
        hashMap.put("anchorOffsetY", K2);
        this.onScrollEvent.setDataToArgs(hashMap);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Context context, Context context2) {
            super(context2);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -332805219) {
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == 149094962) {
                super.onReceivedError((WebView) objArr[0], (WebResourceRequest) objArr[1], (WebResourceError) objArr[2]);
                return null;
            } else if (hashCode == 534767588) {
                super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/component/DXWebView$webViewCallback$1");
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
                return;
            }
            super.onPageStarted(webView, str, bitmap);
            if (DinamicXEngine.j0()) {
                DXWebView.access$loge(DXWebView.this, "webViewCallback onPageStarted ret:".concat(String.valueOf(str)));
            }
            DXWebView dXWebView = DXWebView.this;
            DXWebView.access$setPreRequestStatus$p(dXWebView, dXWebView.getRequestStatus());
            DXWebView.this.setRequestStatus(STATUS.START);
        }

        @Override // com.uc.webview.export.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e30232", new Object[]{this, webView, webResourceRequest, webResourceError});
                return;
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (DinamicXEngine.j0()) {
                DXWebView.access$loge(DXWebView.this, "webViewCallback onReceivedError ret:".concat(String.valueOf(webResourceRequest)));
            }
            DXWebView.this.setRequestStatus(STATUS.FAILED);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            super.onPageFinished(webView, str);
            if (DinamicXEngine.j0()) {
                DXWebView.access$loge(DXWebView.this, "webViewCallback onPageFinished ret:".concat(String.valueOf(str)));
            }
            if (yz3.l(STATUS.START, STATUS.INIT).contains(DXWebView.this.getRequestStatus())) {
                DXWebView.this.setRequestStatus(STATUS.SUCCEED);
            }
            DXWebViewWidgetNode access$getWidgetNode$p = DXWebView.access$getWidgetNode$p(DXWebView.this);
            if (access$getWidgetNode$p != null) {
                DXEvent dXEvent = new DXEvent(DXWebViewWidgetNode.DXWEBVIEW_ONWEBEVENT);
                Pair a2 = jpu.a("eventName", mw5.O("load"));
                if (DXWebView.this.getRequestStatus() == STATUS.FAILED) {
                    str2 = "404";
                } else {
                    str2 = "200";
                }
                Pair a3 = jpu.a("status", mw5.O(str2));
                String url = DXWebView.this.getUrl();
                if (url == null) {
                    url = "null";
                }
                dXEvent.setArgs(kotlin.collections.a.j(a2, a3, jpu.a("url", mw5.O(url)), jpu.a("androidRequestStatus", mw5.O(String.valueOf(DXWebView.this.getRequestStatus())))));
                xhv xhvVar = xhv.INSTANCE;
                access$getWidgetNode$p.postEvent(dXEvent);
            }
        }
    }
}
