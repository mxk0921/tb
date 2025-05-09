package tb;

import android.text.TextUtils;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.android.ultron.vfw.viewholder.BundleLineComponent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.ParseModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ar6 extends xu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HIDE_SWIPE_ITEM = "_hideSwipeItem";
    public RequestConfig j;
    public boolean k;
    public boolean l;
    public boolean m;
    public IDMComponent n;
    public final List<IDMComponent> b = new ArrayList();
    public final List<IDMComponent> c = new ArrayList();
    public final List<IDMComponent> d = new ArrayList();
    public final List<IDMComponent> e = new ArrayList();
    public final List<IDMComponent> f = new ArrayList();
    public final Map<String, List<IDMComponent>> g = new HashMap();
    public final Set<String> h = new HashSet();
    public final Set<String> i = new HashSet();
    public boolean o = false;

    static {
        t2o.a(479199289);
    }

    public ar6(zxb zxbVar) {
        super(zxbVar);
    }

    public static /* synthetic */ Object ipc$super(ar6 ar6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/chain/impl/DataLoopHandleProcessor");
    }

    @Override // tb.xu
    public void e(fsb fsbVar, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc977bbd", new Object[]{this, fsbVar, requestConfig});
            return;
        }
        if (this.k) {
            lbq.a(c9x.CART_BIZ_NAME, "dataIntegrality", "NotFoundItem", "店铺商品组件为空");
        }
        if (!this.l) {
            lbq.a(c9x.CART_BIZ_NAME, "dataIntegrality", "NotFoundSubmit", "未找到提交栏组件");
        }
    }

    @Override // tb.xu
    public void f(fsb fsbVar, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bca381e", new Object[]{this, fsbVar, requestConfig});
            return;
        }
        this.m = false;
        this.j = requestConfig;
        this.n = null;
        this.f31607a.m(fsbVar);
        ((ArrayList) this.b).clear();
        ((ArrayList) this.d).clear();
        ((ArrayList) this.c).clear();
        ((ArrayList) this.e).clear();
        ((ArrayList) this.f).clear();
        ((HashSet) this.h).clear();
        ((HashSet) this.i).clear();
        ((HashMap) this.g).clear();
        kcu kcuVar = new kcu(this.b, this.d, this.c);
        kcuVar.i(this.e);
        kcuVar.h(this.f);
        this.f31607a.n(kcuVar);
        this.f31607a.T(this.g);
        fsb c = this.f31607a.c();
        if (c == null || !c.d() || !vav.a(c9x.CART_BIZ_NAME, "disableHandleCheckHoldOfCache", true)) {
            this.o = false;
        } else {
            this.o = true;
        }
    }

    @Override // tb.xu
    public void g(IDMComponent iDMComponent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31396c29", new Object[]{this, iDMComponent, new Integer(i), new Integer(i2)});
            return;
        }
        k(iDMComponent);
        p(iDMComponent);
        i(iDMComponent);
        j(iDMComponent);
        m(iDMComponent, i, i2);
    }

    @Override // tb.xu
    public void h(IDMComponent iDMComponent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed986f7", new Object[]{this, iDMComponent, new Integer(i), new Integer(i2)});
            return;
        }
        n(iDMComponent);
        if (!this.o) {
            o(iDMComponent, i, i2);
        }
        if (iDMComponent != null && "tabCard".equals(iDMComponent.getTag())) {
            this.f31607a.B().J("header".equals(iDMComponent.getPosition()));
        }
    }

    public final void k(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d9e3e5", new Object[]{this, iDMComponent});
            return;
        }
        if (iDMComponent != null) {
            nb3.g(iDMComponent);
            String h = ParseModule.h(iDMComponent);
            if ("footer".equals(h)) {
                ((ArrayList) this.c).add(iDMComponent);
                return;
            } else if ("header".equals(h)) {
                ((ArrayList) this.b).add(iDMComponent);
                return;
            } else if ("stickyTop".equals(h)) {
                ((ArrayList) this.e).add(iDMComponent);
                return;
            } else if ("stickyBottom".equals(h)) {
                ((ArrayList) this.f).add(iDMComponent);
                return;
            }
        }
        if (iDMComponent != null) {
            ((ArrayList) this.d).add(iDMComponent);
        }
    }

    public final void l(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba367f86", new Object[]{this, iDMComponent});
        } else if (!this.m && "item".equals(iDMComponent.getTag()) && cb4.a(iDMComponent) && !cb4.P(iDMComponent)) {
            this.m = true;
        }
    }

    public final void n(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55370be3", new Object[]{this, iDMComponent});
        } else if (iDMComponent != null && !BundleLineComponent.COMPONENT_TAG.equals(iDMComponent.getTag())) {
            List list = (List) ((HashMap) this.g).get(iDMComponent.getTag());
            if (list == null) {
                list = new ArrayList();
                ((HashMap) this.g).put(iDMComponent.getTag(), list);
            }
            list.add(iDMComponent);
        }
    }

    public final void o(IDMComponent iDMComponent, int i, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bfa164e", new Object[]{this, iDMComponent, new Integer(i), new Integer(i2)});
        } else if (!this.f31607a.I()) {
            r(iDMComponent);
            if (q(i, i2)) {
                CheckHoldManager i3 = CheckHoldManager.i();
                Set<String> set = this.h;
                Set<String> set2 = this.i;
                if (this.f31607a.x().R() == null) {
                    z = false;
                }
                i3.n(2, set, set2, z);
            }
        }
    }

    public final void p(IDMComponent iDMComponent) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe1c85", new Object[]{this, iDMComponent});
        } else if (iDMComponent != null && "item".equals(iDMComponent.getTag()) && (fields = iDMComponent.getFields()) != null && !fields.containsKey(HIDE_SWIPE_ITEM)) {
            fields.put(HIDE_SWIPE_ITEM, (Object) Boolean.TRUE);
        }
    }

    public final boolean q(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79cf0078", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i == i2 - 1) {
            return true;
        }
        return false;
    }

    public final void r(IDMComponent iDMComponent) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a12fd870", new Object[]{this, iDMComponent});
        } else if (iDMComponent != null && (fields = iDMComponent.getFields()) != null && "item".equals(iDMComponent.getTag()) && cb4.P(iDMComponent) && cb4.a(iDMComponent)) {
            String string = fields.getString("cartId");
            if (!TextUtils.isEmpty(string)) {
                if (fields.getBooleanValue("isRepeatBuy")) {
                    ((HashSet) this.i).add(string);
                } else {
                    ((HashSet) this.h).add(string);
                }
            }
        }
    }

    public final void i(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15e11b21", new Object[]{this, iDMComponent});
        } else if (iDMComponent != null) {
            if ("shop".equals(iDMComponent.getTag()) || "bundleHeader".equals(iDMComponent.getTag())) {
                IDMComponent parent = iDMComponent.getParent();
                if (parent == null) {
                    this.k = true;
                    return;
                }
                List<IDMComponent> d = bd4.d(parent);
                if (d == null) {
                    this.k = true;
                    return;
                }
                for (IDMComponent iDMComponent2 : d) {
                    if (iDMComponent2 != null && "item".equals(iDMComponent2.getTag())) {
                        return;
                    }
                }
                this.k = true;
            }
        }
    }

    public final void j(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc0a1ed", new Object[]{this, iDMComponent});
        } else if (iDMComponent != null && "submit".equals(iDMComponent.getTag())) {
            this.l = true;
        }
    }

    public final void m(IDMComponent iDMComponent, int i, int i2) {
        RequestConfig requestConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f92ea3b3", new Object[]{this, iDMComponent, new Integer(i), new Integer(i2)});
        } else if (iDMComponent != null) {
            if (this.n == null) {
                this.n = this.f31607a.u("submit");
            }
            if (cb4.P(this.n) && !this.f31607a.B().y() && (requestConfig = this.j) != null && requestConfig.r()) {
                l(iDMComponent);
                if (q(i, i2) && cb4.P(this.n) && this.m) {
                    cb4.Z(this.n, false);
                }
            }
        }
    }
}
