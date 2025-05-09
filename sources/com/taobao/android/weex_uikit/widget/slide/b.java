package com.taobao.android.weex_uikit.widget.slide;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.slide.SlideDelegateNode;
import com.taobao.android.weex_uikit.widget.slide.a;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b implements SlideDelegateNode.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final UINode f10026a;
    public SlideDelegateNode b;
    public final a.C0527a c;

    static {
        t2o.a(986710237);
        t2o.a(986710245);
    }

    public b(UINode uINode, a.C0527a aVar) {
        this.f10026a = uINode;
        this.c = aVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defaf7d5", new Object[]{this});
            return;
        }
        SlideContainer slideContainer = (SlideContainer) this.f10026a.getMountContent();
        if (slideContainer != null) {
            slideContainer.refresh(this.f10026a.getInstance(), this.b.getNodeTreeList(), Math.max(this.c.f10025a, 0));
        }
    }

    public void b(SlideDelegateNode slideDelegateNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51642818", new Object[]{this, slideDelegateNode});
        } else {
            this.b = slideDelegateNode;
        }
    }
}
