package com.taobao.android.weex_uikit.widget.slide;

import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.slide.a;
import tb.dwh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DefaultPageImpl extends ViewPager.SimpleOnPageChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final UINode f10023a;
    public final a.C0527a b;

    static {
        t2o.a(986710238);
    }

    public DefaultPageImpl(UINode uINode, a.C0527a aVar) {
        this.f10023a = uINode;
        this.b = aVar;
    }

    public static /* synthetic */ Object ipc$super(DefaultPageImpl defaultPageImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/slide/DefaultPageImpl");
    }

    public final void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809247df", new Object[]{this, str, new Boolean(z)});
        } else if (this.f10023a.hasEvent(str)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isDrag", (Object) String.valueOf(z));
            this.f10023a.getInstance().fireEventOnNode(this.f10023a.getNodeId(), str, jSONObject);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        SlideContainer slideContainer = (SlideContainer) this.f10023a.getMountContent();
        if (slideContainer != null) {
            int realPosition = slideContainer.getRealPosition(i);
            a.C0527a aVar = this.b;
            if (aVar.f10025a != realPosition) {
                aVar.f10025a = realPosition;
                if (this.f10023a.getNodeInfo().n("change") && this.f10023a.getInstance() != null && !this.f10023a.getInstance().isDestroyed()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("index", (Object) Integer.valueOf(realPosition));
                    this.f10023a.getInstance().fireEventOnNode(this.f10023a.getNodeId(), "change", jSONObject);
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            return;
        }
        SlideContainer slideContainer = (SlideContainer) this.f10023a.getMountContent();
        if (slideContainer != null) {
            slideContainer.updateState(i);
            if (i == 0) {
                a("scrollend", slideContainer.isTouching());
                if (dwh.r()) {
                    dwh.a("Slide-ScrollEnd isDrag = " + slideContainer.isTouching());
                }
                slideContainer.resetTouching();
            } else if (i == 1) {
                a("scrollstart", slideContainer.isTouching());
                if (dwh.r()) {
                    dwh.a("Slide-ScrollStart isDrag = " + slideContainer.isTouching());
                }
            }
        }
    }
}
