package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.scroller.MUSHorizontalScrollView;
import com.taobao.android.weex_uikit.widget.scroller.MUScrollView;
import com.taobao.weex.common.Constants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class g57 implements pxh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final UINode f19733a;

    static {
        t2o.a(986710220);
        t2o.a(986710222);
    }

    public g57(UINode uINode) {
        this.f19733a = uINode;
    }

    public static void a(UINode uINode, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b0c3ee9", new Object[]{uINode, str, jSONObject});
        } else {
            uINode.getInstance().fireEventOnNode(uINode.getNodeId(), str, jSONObject);
        }
    }

    public final boolean b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49a06ec2", new Object[]{this, view})).booleanValue();
        }
        if (view instanceof MUScrollView) {
            return ((MUScrollView) view).isTouching();
        }
        if (view instanceof MUSHorizontalScrollView) {
            return ((MUSHorizontalScrollView) view).isTouching();
        }
        return false;
    }

    public final void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a76199f9", new Object[]{this, view});
        } else if (view instanceof MUScrollView) {
            ((MUScrollView) view).resetTouching();
        } else if (view instanceof MUSHorizontalScrollView) {
            ((MUSHorizontalScrollView) view).resetTouching();
        }
    }

    @Override // tb.pxh
    public void onRealTimeScroll(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931d4", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // tb.pxh
    public void onScrollChange(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea33e4f", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        MUSDKInstance instance = this.f19733a.getInstance();
        if (this.f19733a.hasEvent("scroll") && instance != null && !instance.isDestroyed()) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("x", (Object) Integer.valueOf((int) fxh.m(view.getContext(), i)));
            jSONObject2.put("y", (Object) Integer.valueOf((int) fxh.m(view.getContext(), i2)));
            jSONObject.put(Constants.Name.CONTENT_OFFSET, (Object) jSONObject2);
            jSONObject.put("isDrag", (Object) String.valueOf(b(view)));
            a(this.f19733a, "scroll", jSONObject);
        }
    }

    @Override // tb.pxh
    public void onScrollEnd(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a368b45c", new Object[]{this, view});
            return;
        }
        MUSDKInstance instance = this.f19733a.getInstance();
        boolean b = b(view);
        c(view);
        if (dwh.r()) {
            dwh.a("Scroller-ScrollEnd isDrag = " + b);
        }
        if (this.f19733a.hasEvent("scrollend") && instance != null && !instance.isDestroyed()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isDrag", (Object) String.valueOf(b));
            a(this.f19733a, "scrollend", jSONObject);
        }
    }

    @Override // tb.pxh
    public void onScrollStart(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b975f5", new Object[]{this, view});
            return;
        }
        MUSDKInstance instance = this.f19733a.getInstance();
        if (dwh.r()) {
            dwh.a("Scroller-ScrollStart isDrag = " + b(view));
        }
        if (this.f19733a.hasEvent("scrollstart") && instance != null && !instance.isDestroyed()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isDrag", (Object) String.valueOf(b(view)));
            a(this.f19733a, "scrollstart", jSONObject);
        }
    }
}
