package tb;

import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.common.view.DWPenetrateFrameLayout;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lga extends vx1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final FluidContext g;
    public final ViewGroup h;
    public boolean i;
    public WVUCWebView j;
    public String k;
    public long l = -1;
    public int m = -1;

    static {
        t2o.a(468713909);
    }

    public lga(FluidContext fluidContext, ViewGroup viewGroup, String str) {
        this.g = fluidContext;
        this.h = viewGroup;
        this.k = str;
    }

    public static /* synthetic */ FluidContext B(lga lgaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("91f6abd1", new Object[]{lgaVar});
        }
        return lgaVar.g;
    }

    public static /* synthetic */ Object ipc$super(lga lgaVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 950806339) {
            super.r((String) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/framework/card/cards/base/layer/interactive/eventhandler/GoodsH5MessageHandler");
        }
    }

    public static /* synthetic */ int t(lga lgaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d05930af", new Object[]{lgaVar})).intValue();
        }
        return lgaVar.m;
    }

    public static /* synthetic */ int u(lga lgaVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d89c963c", new Object[]{lgaVar, new Integer(i)})).intValue();
        }
        lgaVar.m = i;
        return i;
    }

    public static /* synthetic */ long v(lga lgaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de655a8f", new Object[]{lgaVar})).longValue();
        }
        return lgaVar.l;
    }

    public static /* synthetic */ boolean w(lga lgaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f8efa20", new Object[]{lgaVar, new Boolean(z)})).booleanValue();
        }
        lgaVar.i = z;
        return z;
    }

    public static /* synthetic */ void x(lga lgaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa7dae59", new Object[]{lgaVar});
        } else {
            lgaVar.E();
        }
    }

    public static /* synthetic */ boolean z(lga lgaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("889d83c", new Object[]{lgaVar})).booleanValue();
        }
        return lgaVar.F();
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee02ed4b", new Object[]{this});
            return;
        }
        View view = this.d;
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = this.h;
            if (parent != viewGroup) {
                viewGroup.removeAllViews();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, pr9.c(this.h.getContext(), 427));
                layoutParams.gravity = 80;
                this.h.addView(this.d, layoutParams);
            }
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9b3882", new Object[]{this});
        } else if (this.i && this.e != 3 && !((HashSet) this.f).isEmpty()) {
            this.e = 2;
        }
    }

    public final void G(vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9358d7", new Object[]{this, vrpVar});
        } else if (TextUtils.isEmpty(this.k)) {
            this.e = 3;
        } else {
            if (this.k.contains("?")) {
                this.k += "&sessionId=" + vrpVar.d;
            } else {
                this.k += "?sessionId=" + vrpVar.d;
            }
            this.l = System.currentTimeMillis();
            DWPenetrateFrameLayout dWPenetrateFrameLayout = new DWPenetrateFrameLayout(this.h.getContext());
            WVUCWebView wVUCWebView = new WVUCWebView(this.h.getContext());
            this.j = wVUCWebView;
            wVUCWebView.setTag(R.id.fluid_sdk_fluid_intance, this.g);
            this.j.setContentDescription(null);
            this.j.setTag(((IMessageService) this.g.getService(IMessageService.class)).getMessageCenter());
            String str = this.k;
            this.j.setWebViewClient(new kga(this, this.h.getContext(), str, dWPenetrateFrameLayout));
            this.j.setBackgroundColor(0);
            p(dWPenetrateFrameLayout);
            this.d.setTag(((IMessageService) this.g.getService(IMessageService.class)).getMessageCenter());
            this.d.setBackgroundResource(R.drawable.fluid_sdk_video_goods_list_bg);
            this.j.getSettings().setJavaScriptEnabled(true);
            this.j.loadUrl(this.k);
            soa.c(this.g, ((ICardService) this.g.getService(ICardService.class)).getActiveCard(), "3", str);
            dWPenetrateFrameLayout.addView(this.j, new ViewGroup.LayoutParams(-1, -1));
            C();
        }
    }

    public final void I(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c83a25e", new Object[]{this, list});
        } else if (((HashSet) this.f).isEmpty()) {
            this.f.addAll(list);
            E();
            F();
        }
    }

    @Override // tb.vx1, tb.lr9
    public boolean j(vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36367361", new Object[]{this, vrpVar})).booleanValue();
        }
        if (vrpVar.c.equals("VSMSG_registerFilter") && (!vrp.BIZ_GOODS_LIST.equals(vrpVar.f30209a) || !l(vrpVar.d))) {
            return false;
        }
        if (((HashSet) this.f).isEmpty()) {
            return true;
        }
        if (!((HashSet) this.f).contains(vrpVar.c) || (!l(vrpVar.d) && !"VSMSG_syncPageMap".equals(vrpVar.c) && !"VSMSG_syncProcessMap".equals(vrpVar.c))) {
            return false;
        }
        return true;
    }

    @Override // tb.vx1, tb.lr9
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        WVUCWebView wVUCWebView = this.j;
        if (wVUCWebView != null) {
            wVUCWebView.destroy();
            this.j = null;
        }
    }

    @Override // tb.vx1
    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ac2743", new Object[]{this, str});
            return;
        }
        super.r(str);
        C();
    }

    public final boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c22b2343", new Object[]{this})).booleanValue();
        }
        if (this.e != 2 || ((ArrayList) this.f30309a).isEmpty()) {
            return false;
        }
        Iterator it = ((ArrayList) this.f30309a).iterator();
        while (it.hasNext()) {
            vrp vrpVar = (vrp) it.next();
            if (((HashSet) this.f).contains(vrpVar.c) && l(vrpVar.d)) {
                WVStandardEventCenter.postNotificationToJS(this.j, "onShortVideoMessage", JSON.toJSONString(vrpVar.a()));
            } else if (vrpVar.c.equals("VSMSG_initWebView")) {
                ir9.b("GoodsH5MessageHandler", "initWebView lost:" + vrpVar.d + "  current:" + this.b);
                Log.e("GoodsH5MessageHandler", "initWebView lost:" + vrpVar.d + "  current:" + this.b);
            }
        }
        ((ArrayList) this.f30309a).clear();
        return true;
    }

    @Override // tb.vx1, tb.lr9
    public void k(vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff433aad", new Object[]{this, vrpVar});
        } else if (!vrp.BIZ_GOODS_LIST.equals(vrpVar.f30209a) || !vrpVar.c.equals("VSMSG_registerFilter")) {
            boolean equals = vrpVar.c.equals("VSMSG_updateGoodsListData");
            WVUCWebView wVUCWebView = this.j;
            if (wVUCWebView != null || !equals) {
                int i = this.e;
                if (i == 2) {
                    WVStandardEventCenter.postNotificationToJS(wVUCWebView, "onShortVideoMessage", JSON.toJSONString(vrpVar.a(), SerializerFeature.DisableCircularReferenceDetect));
                } else if (i != 3 && i != 4) {
                    if (((ArrayList) this.f30309a).size() < 200) {
                        ((ArrayList) this.f30309a).add(vrpVar);
                    } else {
                        ir9.b("GoodsH5MessageHandler", "pendingMsg reach 200");
                    }
                }
            } else {
                G(vrpVar);
                HashMap hashMap = new HashMap();
                Map b = wmi.b(this.g, vrpVar);
                b.put("TTMC", Long.valueOf(this.l));
                hashMap.put("options", b);
                hashMap.put("data", vrpVar.h);
                hashMap.put("startTime", Long.valueOf(System.currentTimeMillis()));
                ((ArrayList) this.f30309a).add(new vrp("VSMSG_initWebView", vrpVar.d, hashMap));
            }
        } else {
            List o = o(vrpVar);
            if (o != null) {
                I(o);
            }
        }
    }
}
