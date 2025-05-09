package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.mytaobao.pop.bean.MTBIconLocalIndexProtocol;
import com.taobao.mytaobao.pop.bean.MTBIconPixelInfoBean;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rsh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public uoc f27583a;
    public woc b;
    public Animator c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MTBIconLocalIndexProtocol f27584a;

        public a(MTBIconLocalIndexProtocol mTBIconLocalIndexProtocol) {
            this.f27584a = mTBIconLocalIndexProtocol;
        }

        @Override // java.lang.Runnable
        public void run() {
            DXWidgetNode b;
            View c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (rsh.a(rsh.this) != null && rsh.b(rsh.this) != null) {
                String str = this.f27584a.nodeId;
                if (!TextUtils.isEmpty(str) && (b = rsh.a(rsh.this).b(str)) != null && (c = rsh.c(rsh.this, b)) != null) {
                    String str2 = this.f27584a.moduleTag;
                    if (str2 == null || !str2.contains("basementTip")) {
                        rsh.e(rsh.this, c);
                    } else {
                        rsh.d(rsh.this, this.f27584a.nodeId);
                    }
                }
            }
        }
    }

    static {
        t2o.a(745538016);
    }

    public static /* synthetic */ uoc a(rsh rshVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uoc) ipChange.ipc$dispatch("565d071d", new Object[]{rshVar});
        }
        return rshVar.f27583a;
    }

    public static /* synthetic */ woc b(rsh rshVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (woc) ipChange.ipc$dispatch("2d6cb3a6", new Object[]{rshVar});
        }
        return rshVar.b;
    }

    public static /* synthetic */ View c(rsh rshVar, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("425520b9", new Object[]{rshVar, dXWidgetNode});
        }
        return rshVar.h(dXWidgetNode);
    }

    public static /* synthetic */ void d(rsh rshVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68b321", new Object[]{rshVar, str});
        } else {
            rshVar.n(str);
        }
    }

    public static /* synthetic */ void e(rsh rshVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("565ad8dc", new Object[]{rshVar, view});
        } else {
            rshVar.m(view);
        }
    }

    public final MTBIconPixelInfoBean f(MTBIconLocalIndexProtocol mTBIconLocalIndexProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTBIconPixelInfoBean) ipChange.ipc$dispatch("4bbf6fc0", new Object[]{this, mTBIconLocalIndexProtocol});
        }
        String str = mTBIconLocalIndexProtocol.nodeId;
        if (TextUtils.isEmpty(str)) {
            return new MTBIconPixelInfoBean();
        }
        DXWidgetNode b = this.f27583a.b(str);
        if (b == null) {
            return new MTBIconPixelInfoBean();
        }
        View h = h(b);
        if (h == null) {
            return new MTBIconPixelInfoBean();
        }
        return this.b.b(h);
    }

    public final View h(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1e598ad1", new Object[]{this, dXWidgetNode});
        }
        WeakReference<View> wRView = dXWidgetNode.getWRView();
        if (wRView != null) {
            return wRView.get();
        }
        return null;
    }

    public MTBIconPixelInfoBean i(String str) {
        woc wocVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTBIconPixelInfoBean) ipChange.ipc$dispatch("cbca088e", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || this.f27583a == null || (wocVar = this.b) == null) {
            return new MTBIconPixelInfoBean();
        }
        MTBIconLocalIndexProtocol a2 = wocVar.a(str);
        if (a2 == null) {
            return new MTBIconPixelInfoBean();
        }
        String str2 = a2.moduleTag;
        if (str2 == null || !str2.startsWith("basementTip")) {
            return f(a2);
        }
        return g(a2);
    }

    public void j(String str) {
        woc wocVar;
        MTBIconLocalIndexProtocol a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26dda215", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && this.f27583a != null && (wocVar = this.b) != null && (a2 = wocVar.a(str)) != null) {
            this.f27583a.getRootView().postDelayed(new a(a2), 600L);
        }
    }

    public void k(uoc uocVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1479ca02", new Object[]{this, uocVar});
        } else {
            this.f27583a = uocVar;
        }
    }

    public void l(woc wocVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349a8b3c", new Object[]{this, wocVar});
        } else {
            this.b = wocVar;
        }
    }

    public final void m(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef7970f", new Object[]{this, view});
            return;
        }
        Animator animator = this.c;
        if (animator != null) {
            animator.cancel();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, 1.0f, 0.3f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f, 0.3f, 1.0f));
        animatorSet.setDuration(700L);
        animatorSet.start();
        this.c = animatorSet;
    }

    public final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e9e68e", new Object[]{this, str});
        } else if (this.f27583a != null && str != null) {
            TLog.loge("mytaobao", "notify weex zoom animation");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tabItemId", (Object) str);
            jSONObject.put("uuid", (Object) UUID.randomUUID());
            this.f27583a.e("notifyTabItemZoom", jSONObject);
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409f1b4a", new Object[]{this});
            return;
        }
        this.f27583a = null;
        Animator animator = this.c;
        if (animator != null) {
            animator.cancel();
            this.c = null;
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6927cba", new Object[]{this});
        } else {
            this.b = null;
        }
    }

    public final MTBIconPixelInfoBean g(MTBIconLocalIndexProtocol mTBIconLocalIndexProtocol) {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTBIconPixelInfoBean) ipChange.ipc$dispatch("f5b7f3", new Object[]{this, mTBIconLocalIndexProtocol});
        }
        MTBIconPixelInfoBean mTBIconPixelInfoBean = new MTBIconPixelInfoBean();
        Pair<Rect, Boolean> f = this.f27583a.f();
        String str = mTBIconLocalIndexProtocol.nodeId;
        if (f == null || TextUtils.isEmpty(str) || (d = this.f27583a.d(mTBIconLocalIndexProtocol.nodeId)) == null) {
            return mTBIconPixelInfoBean;
        }
        Rect rect = (Rect) f.first;
        if (((Boolean) f.second).booleanValue()) {
            mTBIconPixelInfoBean.setFindIcon(true);
            int intValue = d.getIntValue("x");
            int intValue2 = d.getIntValue("y");
            mTBIconPixelInfoBean.centerX2rpx = intValue;
            mTBIconPixelInfoBean.centerY2rpx = sgj.g(rect.top) + intValue2;
        }
        return mTBIconPixelInfoBean;
    }
}
