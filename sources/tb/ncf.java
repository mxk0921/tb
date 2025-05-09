package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.manager.PageHorizontalScrollManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ncf implements PageHorizontalScrollManager.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final oxj f24639a;
    public final dh7 b;

    static {
        t2o.a(352321861);
        t2o.a(352322071);
    }

    public ncf(oxj oxjVar, dh7 dh7Var) {
        this.f24639a = oxjVar;
        this.b = dh7Var;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9db5be58", new Object[]{this, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isOpenSecondPage", (Object) Boolean.valueOf(z));
        this.b.M0("nativeSlideCallBack", jSONObject);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31643262", new Object[]{this});
            return;
        }
        txj.e(txj.TAG_SECOND_PAGE, "从ND页开始滑动");
        this.f24639a.y("NewDetail", true);
        this.f24639a.D(PageHorizontalScrollManager.PAGE_TYPE_SECOND_PAGE);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca9dd20", new Object[]{this});
            return;
        }
        txj.e(txj.TAG_SECOND_PAGE, "从二级页开始滑动");
        this.f24639a.y(PageHorizontalScrollManager.PAGE_TYPE_SECOND_PAGE, true);
        this.f24639a.D("NewDetail");
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49e1bcc3", new Object[]{this, new Boolean(z)});
            return;
        }
        txj.e(txj.TAG_SECOND_PAGE, "滑动到ND页，页面是否切换" + z);
        this.f24639a.E(PageHorizontalScrollManager.PAGE_TYPE_SECOND_PAGE);
        this.f24639a.B("NewDetail");
        if (!z) {
            a(false);
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91b18bc3", new Object[]{this, new Boolean(z)});
            return;
        }
        txj.e(txj.TAG_SECOND_PAGE, "滑动到二级页，页面是否切换" + z);
        this.f24639a.E("NewDetail");
        this.f24639a.B(PageHorizontalScrollManager.PAGE_TYPE_SECOND_PAGE);
        if (z) {
            a(true);
        }
    }
}
