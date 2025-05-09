package com.taobao.android.weex_uikit.widget.slide;

import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.weex.common.Constants;
import java.util.List;
import tb.dwh;
import tb.egl;
import tb.fxh;
import tb.kwt;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DEFAULT_AUTO_PLAY = false;
    public static final int DEFAULT_INDEX = 0;
    public static final boolean DEFAULT_INFINITE = true;
    public static final int DEFAULT_INTERVAL = 1;
    public static final int DEFAULT_NEXT_MARGIN = 0;
    public static final int DEFAULT_PREVIOUS_MARGIN = 0;
    public static final boolean DEFAULT_SCROLLABLE = true;
    public static final String KEY_INDEX = "index";

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.weex_uikit.widget.slide.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class C0527a {

        /* renamed from: a  reason: collision with root package name */
        public int f10025a = -1;

        static {
            t2o.a(986710236);
        }
    }

    static {
        t2o.a(986710235);
    }

    public static int a(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2a80de38", new Object[]{uINode})).intValue();
        }
        return ((Integer) uINode.getAttribute("index")).intValue();
    }

    public static int b(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf449179", new Object[]{uINode})).intValue();
        }
        return ((Integer) uINode.getAttribute(Constants.Name.INTERVAL)).intValue();
    }

    public static boolean c(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e37a438", new Object[]{uINode})).booleanValue();
        }
        return ((Boolean) uINode.getAttribute("autoplay")).booleanValue();
    }

    public static boolean d(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab055f47", new Object[]{uINode})).booleanValue();
        }
        return ((Boolean) uINode.getAttribute("infinite")).booleanValue();
    }

    public static boolean e(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d534914", new Object[]{uINode})).booleanValue();
        }
        return ((Boolean) uINode.getAttribute("scrollable")).booleanValue();
    }

    public static void f(UINode uINode, MUSDKInstance mUSDKInstance, SlideDelegateNode slideDelegateNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("171a9ace", new Object[]{uINode, mUSDKInstance, slideDelegateNode});
        } else {
            slideDelegateNode.setInstance(mUSDKInstance);
        }
    }

    public static SlideContainer g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SlideContainer) ipChange.ipc$dispatch("169b66d6", new Object[]{context});
        }
        return new SlideContainer(context);
    }

    public static void i(UINode uINode, egl<SlideDelegateNode> eglVar, egl<C0527a> eglVar2, egl<ViewPager.OnPageChangeListener> eglVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("200baa6b", new Object[]{uINode, eglVar, eglVar2, eglVar3});
            return;
        }
        eglVar2.c(new C0527a());
        b bVar = new b(uINode, eglVar2.a());
        eglVar.c(new SlideDelegateNode(uINode.getNodeId(), bVar));
        bVar.b(eglVar.a());
        eglVar3.c(new DefaultPageImpl(uINode, eglVar2.a()));
    }

    public static void j(UINode uINode, List<Runnable> list, SlideDelegateNode slideDelegateNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35075e6b", new Object[]{uINode, list, slideDelegateNode});
        } else {
            slideDelegateNode.collectBatchTasks(list);
        }
    }

    public static void k(UINode uINode, MUSDKInstance mUSDKInstance, SlideContainer slideContainer, ViewPager.OnPageChangeListener onPageChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b522d", new Object[]{uINode, mUSDKInstance, slideContainer, onPageChangeListener});
        } else {
            slideContainer.unmount(onPageChangeListener);
        }
    }

    public static void l(UINode uINode, SlideContainer slideContainer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65695097", new Object[]{uINode, slideContainer, new Boolean(z)});
        } else {
            slideContainer.setAutoPlay(z);
        }
    }

    public static void m(UINode uINode, SlideContainer slideContainer, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67a6a5a5", new Object[]{uINode, slideContainer, jSONObject});
        } else {
            slideContainer.updateEffect(jSONObject);
        }
    }

    public static void n(UINode uINode, SlideContainer slideContainer, int i, C0527a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c694f93", new Object[]{uINode, slideContainer, new Integer(i), aVar});
            return;
        }
        slideContainer.setIndex(i);
        aVar.f10025a = i;
    }

    public static void o(UINode uINode, SlideContainer slideContainer, boolean z, SlideDelegateNode slideDelegateNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f169c60e", new Object[]{uINode, slideContainer, new Boolean(z), slideDelegateNode});
        } else {
            slideContainer.setInfinite(slideDelegateNode.getNodeTreeList(), z);
        }
    }

    public static void p(UINode uINode, SlideContainer slideContainer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231b3bc4", new Object[]{uINode, slideContainer, new Integer(i)});
        } else {
            slideContainer.setInterval(i);
        }
    }

    public static void q(UINode uINode, SlideContainer slideContainer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cea703b3", new Object[]{uINode, slideContainer, new Boolean(z)});
        } else {
            slideContainer.setScrollable(z);
        }
    }

    public static void r(UINode uINode, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33394aa", new Object[]{uINode, new Integer(i), new Boolean(z)});
            return;
        }
        SlideContainer slideContainer = (SlideContainer) uINode.getMountContent();
        if (slideContainer != null) {
            slideContainer.scrollTo(i, z);
        }
    }

    public static void s(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb8aa58", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute("autoplay", Boolean.valueOf(z));
        }
    }

    public static void t(UINode uINode, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf9ea682", new Object[]{uINode, jSONObject});
        } else {
            uINode.setAttribute(kwt.UPLOAD_TYPE_EFFECT, jSONObject);
        }
    }

    public static void u(UINode uINode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ee54cd2", new Object[]{uINode, new Integer(i)});
        } else {
            uINode.setAttribute("index", Integer.valueOf(i));
        }
    }

    public static void v(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bba25129", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute("infinite", Boolean.valueOf(z));
        }
    }

    public static void w(UINode uINode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc3e7e49", new Object[]{uINode, new Integer(i)});
            return;
        }
        if (i < 1) {
            dwh.a("[Slide]:interval can't be smaller than 1");
            i = 1;
        }
        uINode.setAttribute(Constants.Name.INTERVAL, Integer.valueOf(i));
    }

    public static void x(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0195e88", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("nextMargin", Integer.valueOf((int) fxh.e(str)));
        }
    }

    public static void y(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e245a204", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("previousMargin", Integer.valueOf((int) fxh.e(str)));
        }
    }

    public static void z(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a132fc", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute("scrollable", Boolean.valueOf(z));
        }
    }

    public static void h(UINode uINode, MUSDKInstance mUSDKInstance, SlideContainer slideContainer, SlideDelegateNode slideDelegateNode, ViewPager.OnPageChangeListener onPageChangeListener, C0527a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3da7aa62", new Object[]{uINode, mUSDKInstance, slideContainer, slideDelegateNode, onPageChangeListener, aVar});
            return;
        }
        int i = aVar.f10025a;
        if (i < 0) {
            i = a(uINode);
        }
        aVar.f10025a = i;
        int intValue = ((Integer) uINode.getAttribute("previousMargin")).intValue();
        if (intValue != ((Integer) uINode.getAttribute("nextMargin")).intValue()) {
            dwh.e("previousMargin 和 nextMargin 不一致,以 previousMargin 为准");
        }
        slideContainer.mount(onPageChangeListener, mUSDKInstance, slideDelegateNode.getNodeTreeList(), d(uINode), e(uINode), c(uINode), i, b(uINode), intValue, (JSONObject) uINode.getAttribute(kwt.UPLOAD_TYPE_EFFECT));
    }
}
