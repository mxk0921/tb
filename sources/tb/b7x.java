package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.uikit.DebugFrameLayout;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXErrorCode;
import java.util.HashMap;
import java.util.Map;
import tb.cbk;
import tb.f64;
import tb.uz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b7x extends tce implements uz.d, cbk.a, x91, cnx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TemplateBean f16238a;
    public uz b;
    public WeexBean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public JSONObject g;
    public zce h;
    public int i = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements DebugFrameLayout.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(b7x b7xVar) {
        }
    }

    static {
        t2o.a(993002186);
        t2o.a(993002193);
        t2o.a(993002197);
        t2o.a(993001875);
        t2o.a(993001879);
        t2o.a(993002201);
        t2o.a(993002012);
    }

    public b7x(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, TemplateBean templateBean, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, viewGroup, vfwVar);
        this.f16238a = templateBean;
        ensureView();
    }

    public static /* synthetic */ Object ipc$super(b7x b7xVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1743784140:
                return super.dumpDebugInfo();
            case 217607196:
                super.onCtxResume();
                return null;
            case 299066517:
                super.onCtxPause();
                return null;
            case 593843865:
                super.onCtxDestroy();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/weex/mod/WeexModWidget");
        }
    }

    public void A2(cnx cnxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61f287d", new Object[]{this, cnxVar});
            return;
        }
        uz uzVar = this.b;
        if (uzVar != null) {
            uzVar.J(cnxVar);
        }
    }

    public void B2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff43f93", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void C2(zce zceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b071b7a4", new Object[]{this, zceVar});
            return;
        }
        this.h = zceVar;
        if (this.d) {
            ((bi9) zceVar).f(this.b.r());
        } else if (this.e) {
            ((bi9) zceVar).b();
        }
    }

    public void D2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7de514", new Object[]{this});
        } else if (getView() != 0) {
            ((FrameLayout) getView()).getLayoutParams().height = -2;
            ((FrameLayout) getView()).setLayoutParams(((FrameLayout) getView()).getLayoutParams());
        }
    }

    public final void E2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f121f34", new Object[]{this});
        } else if (this.d) {
            uz uzVar = this.b;
            if (uzVar != null) {
                uzVar.H();
            }
        } else if (!this.f) {
            this.f = true;
        }
    }

    public final void F2() {
        uz uzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44210596", new Object[]{this});
            return;
        }
        if (this.f) {
            this.f = false;
        }
        if (this.d && (uzVar = this.b) != null) {
            uzVar.I();
        }
    }

    public void H(cbk cbkVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed0b776", new Object[]{this, cbkVar, str, str2});
            return;
        }
        if (getRoot() instanceof t48) {
            ((t48) getRoot()).n0(this, this.f16238a.templateName, cbkVar, str, str2);
        }
        D2();
        this.e = true;
        zce zceVar = this.h;
        if (zceVar != null) {
            ((bi9) zceVar).b();
        }
    }

    public void K1(cbk cbkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51db503d", new Object[]{this, cbkVar});
            return;
        }
        this.d = true;
        this.b.j((ViewGroup) getView(), cbkVar, false);
        t2();
        D2();
        zce zceVar = this.h;
        if (zceVar != null) {
            ((bi9) zceVar).f(cbkVar);
        }
    }

    @Override // tb.x91
    public void S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("995ac804", new Object[]{this});
        } else {
            E2();
        }
    }

    @Override // tb.uz.d
    public void Y1(cbk cbkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9957aa4", new Object[]{this, cbkVar});
            return;
        }
        this.d = true;
        t2();
        D2();
        zce zceVar = this.h;
        if (zceVar != null) {
            ((bi9) zceVar).f(cbkVar);
        }
    }

    @Override // tb.abx
    public JSONObject dumpDebugInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("980ff734", new Object[]{this});
        }
        JSONObject dumpDebugInfo = super.dumpDebugInfo();
        JSONObject jSONObject = this.g;
        if (jSONObject != null) {
            dumpDebugInfo.put("查看init_data", (Object) jSONObject);
        }
        return dumpDebugInfo;
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "WeexModWidget";
    }

    @Override // tb.x91
    public void j2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31762942", new Object[]{this});
        } else {
            F2();
        }
    }

    @Override // tb.cnx
    public boolean m2(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ac25dbb", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        postEvent(f64.a(str, jSONObject, aVar, aVar2));
        return true;
    }

    @Override // tb.abx
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        uz uzVar = this.b;
        if (uzVar != null) {
            uzVar.o();
        }
    }

    @Override // tb.abx
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        uz uzVar = this.b;
        if (uzVar != null) {
            uzVar.o();
        }
    }

    @Override // tb.abx
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        uz uzVar = this.b;
        if (uzVar != null) {
            uzVar.u();
        }
    }

    @Override // tb.abx
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        uz uzVar = this.b;
        if (uzVar != null) {
            uzVar.w();
        }
    }

    @Override // tb.cbk.a
    public void r2(String str, JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bfe7a2d", new Object[]{this, str, jSONObject, jSCallback, jSCallback2});
        } else {
            postEvent(f64.a(str, jSONObject, zak.a(jSCallback), zak.a(jSCallback2)));
        }
    }

    public uz s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uz) ipChange.ipc$dispatch("835f0cb2", new Object[]{this});
        }
        return new dbk(this.mActivity, c(), this, this, this.f16238a, getModel());
    }

    public final void t2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e331b708", new Object[]{this});
        } else if (this.f) {
            this.f = false;
            uz uzVar = this.b;
            if (uzVar != null) {
                uzVar.H();
            }
        }
    }

    public WeexBean u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexBean) ipChange.ipc$dispatch("eac4d162", new Object[]{this});
        }
        return this.c;
    }

    public Map<String, Object> v2(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("84f8845f", new Object[]{this, weexBean});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, weexBean.rn);
        hashMap.put("bucketId", weexBean.abtest);
        hashMap.put("pageType", weexBean.pageType);
        hashMap.put(TBSearchChiTuJSBridge.ABTEST, weexBean.abtest);
        o02 e = getModel().e();
        if (e != null) {
            hashMap.put("keyword", e.getKeyword());
        }
        JSONObject extraStatus = getModel().e().getExtraStatus();
        if (extraStatus != null) {
            for (String str : extraStatus.keySet()) {
                hashMap.put(str, extraStatus.get(str));
            }
        }
        JSONObject jSONObject = weexBean.pageInfoExtraStatus;
        if (jSONObject != null) {
            hashMap.put(HorizontalXslComponent.ATTR_PAGE_INFO, jSONObject);
        }
        z2(hashMap);
        hashMap.putAll(weexBean.extraStatus);
        HashMap hashMap2 = new HashMap();
        hashMap2.putAll(weexBean.mStorage);
        hashMap2.put(enx.INDEX_KEY, "mod");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("__nxType__", weexBean.type);
        hashMap3.put("model", weexBean.model);
        hashMap3.put("status", hashMap);
        hashMap3.put(WXStorageModule.NAME, hashMap2);
        return hashMap3;
    }

    public TemplateBean w2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("aebe3cb9", new Object[]{this});
        }
        return this.f16238a;
    }

    /* renamed from: y2 */
    public FrameLayout onCreateView() {
        DebugFrameLayout debugFrameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        if (c().g().isDebug()) {
            DebugFrameLayout debugFrameLayout2 = new DebugFrameLayout(getActivity());
            debugFrameLayout2.setDebugClickListener(new a(this));
            debugFrameLayout = debugFrameLayout2;
        } else {
            debugFrameLayout = new FrameLayout(getActivity());
        }
        debugFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return debugFrameLayout;
    }

    public void z2(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d5d87ab", new Object[]{this, map});
        }
    }

    public int x2(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a85417e8", new Object[]{this, weexBean})).intValue();
        }
        if (weexBean == null) {
            c().l().d("WeexModWidget", "obtainFixHeightFromTemplate:weex bean is null");
            return 0;
        }
        TemplateBean q = this.b.q(weexBean);
        if (q != null) {
            return q.listHeight;
        }
        c().l().d("WeexModWidget", "obtainFixHeightFromTemplate:template is null");
        return 0;
    }

    @Override // tb.cnx
    public boolean K(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f36856c", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        str.hashCode();
        if (str.equals("requestLostFocus")) {
            q5i.b(aVar);
            return true;
        } else if (!str.equals("updateStorage")) {
            return false;
        } else {
            WeexBean weexBean = this.c;
            if (weexBean != null) {
                weexBean.mStorage.putAll(jSONObject.getInnerMap());
            }
            return true;
        }
    }

    /* renamed from: q2 */
    public void bindWithData(WeexBean weexBean) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce67407", new Object[]{this, weexBean});
        } else if (weexBean == null) {
            c().l().d("WeexModWidget", "bean is null");
        } else {
            WeexBean weexBean2 = this.c;
            boolean z2 = weexBean2 != null && !TextUtils.equals(weexBean.type, weexBean2.type);
            this.c = weexBean;
            uz uzVar = this.b;
            if (uzVar != null && z2) {
                uzVar.o();
            }
            this.d = false;
            this.e = false;
            Map<String, Object> v2 = v2(weexBean);
            if (c().g().isDebug()) {
                this.g = c().t().b(v2);
            }
            if (this.b == null) {
                c().l().c("WeexModWidget", "render weex cell: %s", weexBean);
                uz s2 = s2();
                this.b = s2;
                s2.K(this.i);
                this.b.J(this);
                z = this.b.D(weexBean, v2);
            } else {
                c().l().c("WeexModWidget", "refresh weex cell: %s", weexBean);
                z = this.b.C(weexBean, v2);
            }
            int x2 = x2(weexBean);
            if (!z) {
                H((cbk) this.b.r(), WXErrorCode.WX_DEGRAD_ERR_INSTANCE_CREATE_FAILED.getErrorCode(), "template or data illegal");
                c4p l = c().l();
                l.d("WeexModWidget", "render failed:" + weexBean);
            } else if (x2 > 0) {
                ((FrameLayout) getView()).getLayoutParams().height = x2;
                ((FrameLayout) getView()).setLayoutParams(((FrameLayout) getView()).getLayoutParams());
            }
        }
    }
}
