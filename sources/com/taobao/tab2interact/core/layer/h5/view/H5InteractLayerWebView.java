package com.taobao.tab2interact.core.layer.h5.view;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import tb.ckf;
import tb.t2o;
import tb.xff;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class H5InteractLayerWebView extends WVUCWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<xff.b> delegateH5AreaList = yz3.i();
    private boolean isEventConsumedOnDown;

    static {
        t2o.a(689963132);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H5InteractLayerWebView(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    public static /* synthetic */ Object ipc$super(H5InteractLayerWebView h5InteractLayerWebView, String str, Object... objArr) {
        if (str.hashCode() == -1253202540) {
            return new Boolean(super.coreDispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/layer/h5/view/H5InteractLayerWebView");
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b54da594", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.isEventConsumedOnDown = false;
            Iterator<xff.b> it = this.delegateH5AreaList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                xff.b next = it.next();
                float c = next.c() * getWidth();
                float d = next.d() * getHeight();
                float b = next.b() * getWidth();
                float a2 = next.a() * getHeight();
                if (motionEvent.getX() >= c && motionEvent.getX() < c + b && motionEvent.getY() >= d && motionEvent.getY() < d + a2) {
                    this.isEventConsumedOnDown = super.coreDispatchTouchEvent(motionEvent);
                    break;
                }
            }
            return this.isEventConsumedOnDown;
        } else if (this.isEventConsumedOnDown) {
            return super.coreDispatchTouchEvent(motionEvent);
        } else {
            return false;
        }
    }

    public final void setDelegateH5Areas(List<xff.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea4e92a", new Object[]{this, list});
            return;
        }
        ckf.g(list, "areaList");
        this.delegateH5AreaList = list;
    }
}
