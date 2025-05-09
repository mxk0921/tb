package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.m3.M3CellBean;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class p4m implements n4m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f25877a;
    public boolean c;
    public final HashSet<o4m> b = new HashSet<>();
    public final Observer d = new Observer() { // from class: tb.pjz
        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            p4m.h(p4m.this, observable, obj);
        }
    };

    static {
        t2o.a(815792424);
        t2o.a(815792422);
    }

    public p4m(Activity activity) {
        ckf.g(activity, "activity");
        this.f25877a = activity;
    }

    public static final void h(p4m p4mVar, Observable observable, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e28065e", new Object[]{p4mVar, observable, obj});
            return;
        }
        ckf.g(p4mVar, "this$0");
        JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        if (jSONObject != null) {
            p4mVar.e(jSONObject.getJSONObject("data").getBooleanValue("openPk"));
        }
    }

    @Override // tb.n4m
    public void D(o4m o4mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876541ae", new Object[]{this, o4mVar});
            return;
        }
        ckf.g(o4mVar, "observer");
        this.b.remove(o4mVar);
        if (this.b.size() == 0) {
            g();
        }
    }

    @Override // tb.n4m
    public boolean Q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fdab9ba", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    @Override // tb.n4m
    public void S2(o4m o4mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96dd215", new Object[]{this, o4mVar});
            return;
        }
        ckf.g(o4mVar, "observer");
        this.b.add(o4mVar);
        if (this.b.size() == 1) {
            f();
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            g();
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a941bbb", new Object[]{this});
            return;
        }
        Iterator<o4m> it = this.b.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            o4m next = it.next();
            ckf.f(next, "next(...)");
            next.b();
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b52f6915", new Object[]{this});
            return;
        }
        Iterator<o4m> it = this.b.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            o4m next = it.next();
            ckf.f(next, "next(...)");
            next.a();
        }
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa3b7e1", new Object[]{this, new Boolean(z)});
        } else if (z != this.c) {
            this.c = z;
            if (z) {
                d();
            } else {
                c();
            }
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fb6f1e", new Object[]{this});
        } else {
            wnl.INSTANCE.e(this.f25877a, "pkSwitch", this.d);
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd1caa25", new Object[]{this});
        } else {
            wnl.INSTANCE.f(this.f25877a, "pkSwitch", this.d);
        }
    }

    @Override // tb.n4m
    public void x1(M3CellBean m3CellBean, boolean z) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0fa9677", new Object[]{this, m3CellBean, new Boolean(z)});
            return;
        }
        ckf.g(m3CellBean, "bean");
        if (z) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put((JSONObject) "itemLabels", (String) jSONArray);
            List<SearchDomBean> titleIcons = m3CellBean.getTitleIcons();
            if (titleIcons != null) {
                for (SearchDomBean searchDomBean : titleIcons) {
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put((JSONObject) "img", searchDomBean.image);
                    jSONObject3.put((JSONObject) "width", String.valueOf(searchDomBean.width));
                    jSONObject3.put((JSONObject) "height", String.valueOf(searchDomBean.height));
                    jSONObject2.put((JSONObject) "light", (String) jSONObject3);
                    jSONArray.add(jSONObject2);
                }
            }
            jSONObject.put((JSONObject) mh1.PRD_PICURL, m3CellBean.getPicPath());
            pwm priceInfo = m3CellBean.getPriceInfo();
            jSONObject.put((JSONObject) "price", priceInfo != null ? priceInfo.i() : null);
            jSONObject.put((JSONObject) "title", m3CellBean.getTitle());
            JSONArray extraParams = m3CellBean.getExtraParams();
            if (extraParams != null) {
                int size = extraParams.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    JSONObject jSONObject4 = extraParams.getJSONObject(i);
                    if (jSONObject4 != null) {
                        String string = jSONObject4.getString("key");
                        if (ckf.b(string, q2q.KEY_SKU_ID)) {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put((JSONObject) string, jSONObject4.getString("value"));
                            jSONObject.put((JSONObject) "extraParams", (String) jSONObject5);
                            break;
                        }
                    }
                    i++;
                }
            }
            if (m3CellBean.getWfTitleLines() > 1) {
                z2 = true;
            }
            jSONObject.put((JSONObject) "wfTwoLineTitle", String.valueOf(z2));
            cca ccaVar = cca.INSTANCE;
            f4m pkInfo = m3CellBean.getPkInfo();
            ckf.d(pkInfo);
            String b = pkInfo.b();
            String str = m3CellBean.itemId;
            ckf.f(str, "itemId");
            ccaVar.a(b, str, jSONObject);
            return;
        }
        cca ccaVar2 = cca.INSTANCE;
        f4m pkInfo2 = m3CellBean.getPkInfo();
        ckf.d(pkInfo2);
        String b2 = pkInfo2.b();
        String str2 = m3CellBean.itemId;
        ckf.f(str2, "itemId");
        ccaVar2.b(b2, str2);
    }
}
