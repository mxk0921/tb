package tb;

import android.app.Activity;
import android.text.TextUtils;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.CommonContainerActivity;
import com.taobao.android.layoutmanager.container.secondpage.biz.GGSecPageViewPager;
import com.taobao.android.layoutmanager.container.secondpage.biz.GGSecWebViewPage;
import com.taobao.android.layoutmanager.container.secondpage.impl.VPSecPageWrapper;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d3a extends VPSecPageWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final xe h;
    public Object i;
    public String j;
    public String k = null;
    public Map l = new HashMap();
    public String m = null;
    public Map n = new HashMap();
    public Object o = null;
    public boolean p = false;
    public Object q;

    static {
        t2o.a(502268066);
    }

    public d3a(Activity activity) {
        this.h = null;
        this.b = activity;
        UTAnalytics.getInstance().getDefaultTracker().skipPage(E());
        if (activity instanceof CommonContainerActivity) {
            if (ufs.d()) {
                this.h = new sa7();
            } else {
                this.h = new GGSecWebViewPage();
            }
        } else if (ufs.e()) {
            this.h = new sa7();
        } else {
            this.h = new GGSecWebViewPage();
        }
    }

    public static /* synthetic */ Object ipc$super(d3a d3aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1917587522:
                super.s(((Number) objArr[0]).intValue());
                return null;
            case -1603404838:
                return new Boolean(super.x((anl) objArr[0], ((Number) objArr[1]).intValue()));
            case -1512649357:
                super.k();
                return null;
            case -18099179:
                super.u(((Number) objArr[0]).intValue());
                return null;
            case 797441118:
                super.j();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/secondpage/biz/GGSecPageWrapper");
        }
    }

    public String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("232786a5", new Object[]{this});
        }
        return this.k;
    }

    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19bb6e35", new Object[]{this});
        }
        return this.m;
    }

    public Map C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6ae7090a", new Object[]{this});
        }
        return this.n;
    }

    public Object D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e1f89714", new Object[]{this});
        }
        return this.o;
    }

    public final Object E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("27df11d7", new Object[]{this});
        }
        Object obj = this.q;
        if (obj != null) {
            return obj;
        }
        return this.b;
    }

    public void F(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9039d46", new Object[]{this, obj});
        } else {
            this.o = obj;
        }
    }

    @Override // tb.ye
    public xe c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xe) ipChange.ipc$dispatch("409eb109", new Object[]{this});
        }
        return this.h;
    }

    @Override // tb.w4e
    public Map getFirstPageProperty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8efdfe9a", new Object[]{this});
        }
        return this.l;
    }

    @Override // tb.ye
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            c().f();
        }
    }

    @Override // tb.ye
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.j();
        c().d();
    }

    @Override // tb.ye
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.k();
        c().e();
    }

    @Override // com.taobao.android.layoutmanager.container.secondpage.impl.VPSecPageWrapper
    public ViewPager r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("6c9f0991", new Object[]{this});
        }
        GGSecPageViewPager gGSecPageViewPager = new GGSecPageViewPager(this.b);
        gGSecPageViewPager.setSecPageWrapper(this);
        return gGSecPageViewPager;
    }

    @Override // com.taobao.android.layoutmanager.container.secondpage.impl.VPSecPageWrapper
    public void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8db3efbe", new Object[]{this, new Integer(i)});
            return;
        }
        super.s(i);
        if (this.f32008a != null) {
            this.p = true;
        }
    }

    @Override // tb.w4e
    public void setFirstPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76692fd9", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.k = str;
        }
    }

    @Override // tb.w4e
    public void setFirstPageProperty(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48f12cc", new Object[]{this, map});
        } else if (map != null) {
            this.l = map;
        }
    }

    @Override // tb.w4e
    public void setSecondPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e7e79e1", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.m = str;
        }
    }

    @Override // tb.w4e
    public void setSecondPageProperty(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2309c4", new Object[]{this, map});
        } else if (map != null) {
            this.n = map;
        }
    }

    @Override // com.taobao.android.layoutmanager.container.secondpage.impl.VPSecPageWrapper
    public void t(int i) {
        bod bodVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f394f0cd", new Object[]{this, new Integer(i)});
            return;
        }
        if (i == 0) {
            c().g();
            UTAnalytics.getInstance().getDefaultTracker().pageAppear(E(), A());
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(E(), getFirstPageProperty());
        }
        if (this.p && (bodVar = this.f32008a) != null) {
            bodVar.onPageSelected(i);
            this.p = false;
        }
    }

    @Override // com.taobao.android.layoutmanager.container.secondpage.impl.VPSecPageWrapper
    public void u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feebd415", new Object[]{this, new Integer(i)});
            return;
        }
        super.u(i);
        this.p = false;
        if (i == 0) {
            if (i == 0) {
                UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(E());
            }
            c().a(this.i, this.j);
            ViewPager viewPager = this.d;
            if (viewPager instanceof GGSecPageViewPager) {
                ((GGSecPageViewPager) viewPager).triggerTransitionStartEvent();
            }
        }
    }

    @Override // com.taobao.android.layoutmanager.container.secondpage.impl.VPSecPageWrapper
    public boolean x(anl anlVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a06dfbda", new Object[]{this, anlVar, new Integer(i)})).booleanValue();
        }
        xe xeVar = this.h;
        if (xeVar instanceof sa7) {
            ((sa7) xeVar).k(anlVar);
        }
        this.q = anlVar.getUTObject();
        return super.x(anlVar, i);
    }

    public void y(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57859915", new Object[]{this, obj, str});
        } else if (obj != null) {
            this.i = obj;
            this.j = str;
        }
    }

    public Object z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c46297b5", new Object[]{this});
        }
        return this.i;
    }

    public d3a() {
        this.h = null;
        this.h = new sa7();
    }
}
