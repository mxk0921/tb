package com.taobao.search.sf.widgets.onesearch;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.search.mmd.datasource.bean.OneSearchBean;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.tao.Globals;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.weex.WXSDKInstance;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import tb.acx;
import tb.b4p;
import tb.f6p;
import tb.fml;
import tb.hxk;
import tb.igw;
import tb.ixk;
import tb.kgw;
import tb.mec;
import tb.n6p;
import tb.o02;
import tb.o4p;
import tb.phw;
import tb.q1p;
import tb.t2o;
import tb.ude;
import tb.uyv;
import tb.vfw;
import tb.zuo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b extends phw<C0662b, FrameLayout, acx<? extends o02<? extends BaseSearchResult, ?>>> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeexPageFragment f11731a;
    public WXSDKInstance b;
    public boolean c;
    public int d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends WeexPageFragment.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.search.sf.widgets.onesearch.b$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C0661a implements WXSDKInstance.t {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0661a() {
            }

            @Override // com.taobao.weex.WXSDKInstance.t
            public WXSDKInstance.u a(String str, String str2, JSONArray jSONArray, JSONObject jSONObject) {
                JSONObject s2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (WXSDKInstance.u) ipChange.ipc$dispatch("b97efc31", new Object[]{this, str, str2, jSONArray, jSONObject});
                }
                try {
                    if (!TextUtils.equals("push", str2) || !TextUtils.equals(str, "navigator") || (s2 = b.s2(b.this, jSONArray)) == null) {
                        return null;
                    }
                    Uri parse = Uri.parse(s2.getString("url"));
                    if (!TextUtils.isEmpty(parse.getQueryParameter("spm"))) {
                        return null;
                    }
                    s2.put("url", (Object) parse.buildUpon().appendQueryParameter("spm", b.C2(b.this.getModel())).build().toString());
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            }
        }

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 578309873) {
                super.onException((WXSDKInstance) objArr[0], ((Boolean) objArr[1]).booleanValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/onesearch/SFWeexOnesearchWidget$1");
        }

        public final void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef07f4e7", new Object[]{this, str, str2});
                return;
            }
            b.this.hide();
            b.v2(b.this, true);
            b.this.postEvent(hxk.a());
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.b
        public void onException(WXSDKInstance wXSDKInstance, boolean z, String str, String str2) {
            String str3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22784ef1", new Object[]{this, wXSDKInstance, new Boolean(z), str, str2});
                return;
            }
            super.onException(wXSDKInstance, z, str, str2);
            if (!z || !b.u2(b.this)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("down", z);
                    str3 = jSONObject.toString();
                } catch (JSONException e) {
                    e.printStackTrace();
                    str3 = null;
                }
                n6p.b("weex_exception", str3, str, str2);
                if (z) {
                    a(str, str2);
                }
                b4p.o("SFWeexOnesearchWidget", str + "\n" + str2);
                return;
            }
            b4p.b("SFWeexOnesearchWidget", "已经降级过了");
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.b, tb.gbe
        public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            } else {
                igw.b(b.t2(b.this), 0);
            }
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.b, tb.gbe
        public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
                return;
            }
            b.q2(b.this, wXSDKInstance);
            b.this.postEvent(ixk.a());
            if (wXSDKInstance != null && o4p.F2()) {
                wXSDKInstance.J0("navigator", new C0661a());
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.search.sf.widgets.onesearch.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class C0662b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int HEIGHT_MODE_EXACTLY = 1;
        public static final int HEIGHT_MODE_FULL = 0;
        public static final int HEIGHT_MODE_MATCH_PARENT = 2;
        public static final int HEIGHT_MODE_NOT_SET = -1;
        public static final int SIZE_NOT_SET = -1;

        /* renamed from: a  reason: collision with root package name */
        public int f11734a = -1;
        public int b = -1;
        public String c;
        public String d;
        public boolean e;

        static {
            t2o.a(815793716);
        }

        public static C0662b a(OneSearchBean oneSearchBean) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0662b) ipChange.ipc$dispatch("be41fc6b", new Object[]{oneSearchBean});
            }
            C0662b bVar = new C0662b();
            bVar.b = 1 ^ (oneSearchBean.isFull ? 1 : 0);
            bVar.f11734a = oneSearchBean.height;
            bVar.c = oneSearchBean.from;
            bVar.d = oneSearchBean.url;
            bVar.e = oneSearchBean.isSearchBarHidden;
            return bVar;
        }
    }

    static {
        t2o.a(815793713);
    }

    public b(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, viewGroup, vfwVar);
        ensureView();
    }

    public static int D2(C0662b bVar, boolean z, Activity activity) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a34e0ff", new Object[]{bVar, new Boolean(z), activity})).intValue();
        }
        if (bVar == null) {
            return -1;
        }
        if (bVar.b == 1) {
            return bVar.f11734a;
        }
        int dimension = (int) Globals.getApplication().getResources().getDimension(R.dimen.tbsearch_searchbar_height);
        if (!z) {
            if (!(activity instanceof mec) || !((mec) activity).o2()) {
                i = dimension;
            } else {
                i = dimension + SystemBarDecorator.getStatusBarHeight(activity);
            }
        }
        if (bVar.b == 0) {
            return zuo.b(activity, i);
        }
        return -1;
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == 593843865) {
            super.onCtxDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/onesearch/SFWeexOnesearchWidget");
    }

    public static /* synthetic */ WXSDKInstance q2(b bVar, WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("e90df419", new Object[]{bVar, wXSDKInstance});
        }
        bVar.b = wXSDKInstance;
        return wXSDKInstance;
    }

    public static /* synthetic */ JSONObject s2(b bVar, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e26b435a", new Object[]{bVar, jSONArray});
        }
        return bVar.z2(jSONArray);
    }

    public static /* synthetic */ ViewGroup t2(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("6bfbe622", new Object[]{bVar});
        }
        return bVar.mContainer;
    }

    public static /* synthetic */ boolean u2(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb020e18", new Object[]{bVar})).booleanValue();
        }
        return bVar.c;
    }

    public static /* synthetic */ boolean v2(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1c6002", new Object[]{bVar, new Boolean(z)})).booleanValue();
        }
        bVar.c = z;
        return z;
    }

    public final String A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c93e478", new Object[]{this});
        }
        return "tbsearch_wx_frag_" + System.currentTimeMillis();
    }

    public WXSDKInstance B2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("d63d3e9e", new Object[]{this});
        }
        return this.b;
    }

    /* renamed from: E2 */
    public FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(getActivity());
        frameLayout.setOnClickListener(this);
        int a2 = kgw.a();
        this.d = a2;
        frameLayout.setId(a2);
        return frameLayout;
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "SFWeexOnesearchWidget";
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else if (getView() != 0) {
            ((FrameLayout) getView()).setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        }
    }

    @Override // tb.abx
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
        } else {
            y2();
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
        y2();
    }

    public void onEventMainThread(fml fmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7dbb382", new Object[]{this, fmlVar});
            return;
        }
        WeexPageFragment weexPageFragment = this.f11731a;
        if (weexPageFragment != null) {
            weexPageFragment.onActivityResult(fmlVar.f19408a, fmlVar.b, fmlVar.c);
        }
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (getView() != 0) {
            ((FrameLayout) getView()).setVisibility(0);
        }
    }

    public final void w2(C0662b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658cea43", new Object[]{this, bVar});
            return;
        }
        int D2 = D2(bVar, bVar.e, getActivity());
        ViewGroup.LayoutParams layoutParams = ((FrameLayout) getView()).getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.MarginLayoutParams(-1, D2);
        } else {
            layoutParams.width = -1;
            layoutParams.height = D2;
        }
        ((FrameLayout) getView()).setLayoutParams(layoutParams);
    }

    public void y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.f11731a != null) {
            b4p.a("SFWeexOnesearchWidget", "destroy weex instance");
            try {
                this.f11731a.destroyWeex();
                this.f11731a = null;
                this.b = null;
            } catch (Exception e) {
                b4p.p("SFWeexOnesearchWidget", "error destroy weex", e);
            }
        }
    }

    /* renamed from: x2 */
    public void bindWithData(C0662b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c105c8b", new Object[]{this, bVar});
        } else if (bVar == null) {
            Log.e("SFWeexOnesearchWidget", "bean为空或weex实例为空");
            hide();
            y2();
        } else {
            show();
            w2(bVar);
            attachToContainer();
            String str = bVar.d;
            String h = f6p.h(str, uyv.WX_TPL);
            Map<String, String> g = f6p.g(bVar.d);
            g.remove(uyv.WX_TPL);
            String c = f6p.c(h, g);
            if (!TextUtils.isEmpty(c)) {
                bVar.d = c;
                str = c;
            }
            String str2 = bVar.d;
            String b = f6p.b(str, "_s_nx_from", bVar.c);
            if (TextUtils.isEmpty(str2)) {
                hide();
                y2();
                return;
            }
            this.c = false;
            new HashMap().put("bundleUrl", b);
            b4p.a("SFWeexOnesearchWidget", "bundleUrl: " + b);
            b4p.a("SFWeexOnesearchWidget", "jsUrl: " + str2);
            WeexPageFragment weexPageFragment = this.f11731a;
            if (weexPageFragment == null) {
                FragmentActivity fragmentActivity = (FragmentActivity) getActivity();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                String a2 = q1p.a(q1p.PAGE_NAME_NX);
                if (a2 == null) {
                    a2 = "";
                }
                try {
                    jSONObject.put("iconData", a2);
                    jSONObject.put("spm", "aaa.aaa.aaa.aaa");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                WeexPageFragment weexPageFragment2 = (WeexPageFragment) WeexPageFragment.newInstanceWithUrl(fragmentActivity, WeexPageFragment.class, b, str2, null, jSONObject.toString(), this.d, A2());
                this.f11731a = weexPageFragment2;
                weexPageFragment2.setUserTrackEnable(false);
                this.f11731a.setRenderListener(new a());
                return;
            }
            weexPageFragment.replace(b, str2);
        }
    }

    public static String C2(acx<? extends o02<? extends BaseSearchResult, ?>> acxVar) {
        CommonSearchResult commonSearchResult;
        Map<String, String> map;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9c82396", new Object[]{acxVar});
        }
        if (acxVar == null || !(acxVar.e() instanceof CommonBaseDatasource) || (commonSearchResult = (CommonSearchResult) ((CommonBaseDatasource) acxVar.e()).getTotalSearchResult()) == null || (map = commonSearchResult.getMainInfo().pageTraceArgs) == null) {
            return null;
        }
        String str = map.get("spm-cnt");
        if (TextUtils.isEmpty(str) || (split = str.split("\\.")) == null || split.length < 2) {
            return str;
        }
        return split[0] + "." + split[1] + ".pinzhuan.0";
    }

    public final JSONObject z2(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2b6c6624", new Object[]{this, jSONArray});
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (!TextUtils.isEmpty(jSONObject.getString("url"))) {
                    return jSONObject;
                }
            }
        }
        return null;
    }
}
