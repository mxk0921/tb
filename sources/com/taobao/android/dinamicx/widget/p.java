package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.tab.DXOnTabChangeEvent;
import com.taobao.android.dinamicx.expression.event.tab.DXOnTabClickEvent;
import com.taobao.android.dinamicx.o;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.widget.viewpager.tab.view.DXTabItem;
import com.taobao.android.dinamicx.widget.viewpager.tab.view.DXTabLayout;
import com.taobao.android.dinamicx.widget.viewpager.tab.view.TabLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.eb5;
import tb.f76;
import tb.h36;
import tb.kl6;
import tb.mf6;
import tb.mop;
import tb.qub;
import tb.t26;
import tb.t2o;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class p extends k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTABHEADERLAYOUT_DATASOURCE = -5948810534719014123L;
    public static final long DXTABHEADERLAYOUT_ENABLESCROLL = -8426770838617723422L;
    public static final long DXTABHEADERLAYOUT_INDICATORBOTTOMGAP = 1170909693104794716L;
    public static final long DXTABHEADERLAYOUT_INDICATORCOLOR = -5151416374116397110L;
    public static final long DXTABHEADERLAYOUT_INDICATORCOLORMAP = -9087820153495724821L;
    public static final long DXTABHEADERLAYOUT_INDICATORHEIGHT = -3761529437537503451L;
    public static final long DXTABHEADERLAYOUT_INDICATORIMAGEURL = 5400402516109499876L;
    public static final long DXTABHEADERLAYOUT_INDICATORRADIUS = -3394712782565958860L;
    public static final long DXTABHEADERLAYOUT_INDICATORWIDTH = -5149988469975039285L;
    public static final long DXTABHEADERLAYOUT_INDICATORZINDEX = -3104225124614969570L;
    public static final long DXTABHEADERLAYOUT_ITEMMATCHPARENTHEIGHT_ANDROID = -2388227689824506212L;
    public static final long DXTABHEADERLAYOUT_ITEMWIDTH = -5480582194049152328L;
    public static final long DXTABHEADERLAYOUT_LAZYLOADITEM = -8415387862592909349L;
    public static final long DXTABHEADERLAYOUT_ONCHANGE = 5288679823228297259L;
    public static final long DXTABHEADERLAYOUT_ONTABCLICK = 5327268914103406564L;
    public static final long DXTABHEADERLAYOUT_RELATEDCOMPONENTANIMATED = 1821589090930999503L;
    public static final long DXTABHEADERLAYOUT_RELATEDCOMPONENTID = -4472384284971071661L;
    public static final long DXTABHEADERLAYOUT_SELECTEDINDEX = 4437946449641611086L;
    public static final long DXTABHEADERLAYOUT_SHOWINDICATOR = -3765027987112450965L;
    public static final int DXTABHEADERLAYOUT_SHOWINDICATOR_FALSE = 1;
    public static final int DXTABHEADERLAYOUT_SHOWINDICATOR_TRUE = 0;
    public static final long DXTABHEADERLAYOUT_TABHEADERLAYOUT = 5297988424120091629L;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public String i;
    public int k;
    public boolean l;
    public JSONObject m;
    public JSONObject n;
    public List<DXTabItem> p;
    public List<View> q;
    public List<View> r;
    public o s;
    public DXViewPager t;
    public TabLayout.c u;
    public TabLayout.b v;
    public int w;
    public ArrayList<DXWidgetNode> x;
    public Map<Integer, Boolean> y;
    public boolean z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f7452a = false;
    public int g = 1;
    public boolean j = false;
    public boolean o = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements TabLayout.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXTabLayout f7453a;

        public a(DXTabLayout dXTabLayout) {
            this.f7453a = dXTabLayout;
        }

        @Override // com.taobao.android.dinamicx.widget.viewpager.tab.view.TabLayout.c
        public void a(TabLayout.e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0b2d467", new Object[]{this, eVar});
            } else if (eVar.b() != null) {
                ((DXTabItem) eVar.b()).setSelected(false);
            }
        }

        @Override // com.taobao.android.dinamicx.widget.viewpager.tab.view.TabLayout.c
        public void b(TabLayout.e eVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a4f6896", new Object[]{this, eVar, new Integer(i)});
                return;
            }
            int d = eVar.d();
            if (eVar.b() != null && p.y(p.this) != null) {
                p.y(p.this).d0(d, false, i);
            }
        }

        @Override // com.taobao.android.dinamicx.widget.viewpager.tab.view.TabLayout.c
        public void c(TabLayout.e eVar, int i) {
            JSONObject jSONObject;
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aaa416a3", new Object[]{this, eVar, new Integer(i)});
                return;
            }
            int t = p.t(p.this);
            int d = eVar.d();
            if (eVar.b() != null) {
                ((DXTabItem) eVar.b()).setSelected(true);
                p.u(p.this, d);
                if (p.v(p.this) != null) {
                    p.w(p.this, this.f7453a);
                }
                p pVar = p.this;
                if (pVar != null) {
                    JSONArray listData = pVar.getListData();
                    if (p.x(p.this).containsKey(Integer.valueOf(d))) {
                        z = ((Boolean) p.x(p.this).get(Integer.valueOf(d))).booleanValue();
                    }
                    if (!z) {
                        p.x(p.this).put(Integer.valueOf(d), Boolean.valueOf(!z));
                    }
                    if (listData == null || listData.size() <= d) {
                        jSONObject = null;
                    } else {
                        jSONObject = listData.getJSONObject(d);
                    }
                    pVar.postEvent(new DXOnTabChangeEvent(d, t, jSONObject, !z, eVar.g(), i));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements TabLayout.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.dinamicx.widget.viewpager.tab.view.TabLayout.b
        public void a(TabLayout.e eVar) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8366d7f", new Object[]{this, eVar});
                return;
            }
            int d = eVar.d();
            p pVar = p.this;
            if (pVar != null) {
                JSONArray listData = pVar.getListData();
                int t = p.t(p.this);
                if (listData == null) {
                    jSONObject = null;
                } else {
                    jSONObject = listData.getJSONObject(d);
                }
                pVar.postEvent(new DXOnTabClickEvent(d, t, jSONObject));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ mf6 f7455a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ DXNativeFrameLayout d;

        public c(mf6 mf6Var, int i, int i2, DXNativeFrameLayout dXNativeFrameLayout) {
            this.f7455a = mf6Var;
            this.b = i;
            this.c = i2;
            this.d = dXNativeFrameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            FrameLayout.LayoutParams layoutParams;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            View dXNativeFrameLayout = new DXNativeFrameLayout(p.this.getDXRuntimeContext().h());
            o z = p.z(p.this);
            mf6 mf6Var = this.f7455a;
            z.k(mf6Var, null, dXNativeFrameLayout, mf6Var.getDXRuntimeContext(), 2, 9, this.b, this.c, -1);
            ViewGroup.LayoutParams layoutParams2 = dXNativeFrameLayout.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams = new FrameLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            } else {
                layoutParams = new FrameLayout.LayoutParams(this.f7455a.getMeasuredWidth(), this.f7455a.getMeasuredHeight());
            }
            layoutParams.gravity = kl6.f(DXWidgetNode.getAbsoluteGravity(this.f7455a.getLayoutGravity(), this.f7455a.getDirection()));
            dXNativeFrameLayout.setLayoutParams(layoutParams);
            this.d.addView(dXNativeFrameLayout);
            if (this.d.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                this.d.getLayoutParams().width = dXNativeFrameLayout.getLayoutParams().width;
                this.d.getLayoutParams().height = dXNativeFrameLayout.getLayoutParams().height;
                ((FrameLayout.LayoutParams) this.d.getLayoutParams()).gravity = layoutParams.gravity;
                return;
            }
            this.d.setLayoutParams(new FrameLayout.LayoutParams(layoutParams2.width, layoutParams2.height));
            ((FrameLayout.LayoutParams) this.d.getLayoutParams()).gravity = layoutParams.gravity;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597397);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new p();
        }
    }

    static {
        t2o.a(444597393);
    }

    public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 28626114:
                super.onEndParser();
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1524202196:
                return super.getNodePropByKey((String) objArr[0]);
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXTabHeaderLayoutWidgetNode");
        }
    }

    public static /* synthetic */ int t(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c8270f3", new Object[]{pVar})).intValue();
        }
        return pVar.w;
    }

    public static /* synthetic */ int u(p pVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b58ce334", new Object[]{pVar, new Integer(i)})).intValue();
        }
        pVar.w = i;
        return i;
    }

    public static /* synthetic */ JSONObject v(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3a238b61", new Object[]{pVar});
        }
        return pVar.m;
    }

    public static /* synthetic */ void w(p pVar, DXTabLayout dXTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("665b5a1b", new Object[]{pVar, dXTabLayout});
        } else {
            pVar.G(dXTabLayout);
        }
    }

    public static /* synthetic */ Map x(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b8600bb8", new Object[]{pVar});
        }
        return pVar.y;
    }

    public static /* synthetic */ DXViewPager y(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXViewPager) ipChange.ipc$dispatch("c369c58f", new Object[]{pVar});
        }
        return pVar.t;
    }

    public static /* synthetic */ o z(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("d8a32a4f", new Object[]{pVar});
        }
        return pVar.s;
    }

    public void A(DXViewPager dXViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdcd1025", new Object[]{this, dXViewPager});
            return;
        }
        DXTabLayout dXTabLayout = (DXTabLayout) getDXRuntimeContext().D();
        if (dXTabLayout != null) {
            if (dXViewPager instanceof DXViewPager) {
                dXTabLayout.setupWithViewPager((ViewPager) dXViewPager.getDXRuntimeContext().D());
            }
            if (dXViewPager != null && dXViewPager.y() != null) {
                int size = dXViewPager.y().size();
                for (int i = 0; i < size; i++) {
                    TabLayout.e tabAt = dXTabLayout.getTabAt(i);
                    if (i == this.w) {
                        if (i >= this.p.size()) {
                            break;
                        }
                        DXTabItem dXTabItem = this.p.get(i);
                        dXTabItem.setSelected(true);
                        tabAt.m(dXTabItem);
                        h36.b("DXTabHeaderLayoutWidgetNode", "bindViewPager set " + i + " view " + tabAt.b());
                    } else if (i >= this.p.size()) {
                        break;
                    } else {
                        DXTabItem dXTabItem2 = this.p.get(i);
                        dXTabItem2.setSelected(false);
                        tabAt.m(dXTabItem2);
                        h36.b("DXTabHeaderLayoutWidgetNode", "bindViewPager set " + i + " view " + tabAt.b());
                    }
                }
                int i2 = this.w;
                if (i2 != 0) {
                    this.t.d0(i2, false, 1);
                } else {
                    this.y.put(0, Boolean.TRUE);
                }
            }
        }
    }

    public final mf6 B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mf6) ipChange.ipc$dispatch("a6ed0b34", new Object[]{this});
        }
        if (this.x == null) {
            return null;
        }
        for (int i = 0; i < this.x.size(); i++) {
            mf6 mf6Var = (mf6) this.x.get(i);
            if (mf6Var.t()) {
                return mf6Var;
            }
        }
        return null;
    }

    public List<DXWidgetNode> C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3208f138", new Object[]{this});
        }
        return this.x;
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fce3405", new Object[]{this})).booleanValue();
        }
        return this.f7452a;
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65309fd0", new Object[]{this});
        } else if (this.n != null && this.x != null) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, Object> entry : this.n.entrySet()) {
                try {
                    String key = entry.getKey();
                    if (!TextUtils.isEmpty(key)) {
                        int i = 0;
                        while (true) {
                            if (i >= this.x.size()) {
                                break;
                            } else if (key.equals(this.x.get(i).getUserId())) {
                                jSONObject.put(String.valueOf(i / 2), (Object) Integer.valueOf(Color.parseColor(String.valueOf(entry.getValue()))));
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                } catch (Exception e) {
                    xv5.b(e);
                }
            }
            this.m = jSONObject;
        }
    }

    public final void F(DXTabLayout dXTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eee7fbd", new Object[]{this, dXTabLayout});
            return;
        }
        E();
        if (this.l) {
            G(dXTabLayout);
            dXTabLayout.setSelectedTabIndicatorHeight(this.d);
            dXTabLayout.setSelectedTabIndicatorWidth(this.f);
            dXTabLayout.setSelectedTabIndicatorRadius(this.e);
            dXTabLayout.setSelectedTabIndicatorBottomGap(this.b);
            dXTabLayout.setSelectedTabIndicatorZIndex(this.g);
            return;
        }
        G(dXTabLayout);
        dXTabLayout.setSelectedTabIndicatorHeight(this.d);
    }

    public final void G(DXTabLayout dXTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df1991ec", new Object[]{this, dXTabLayout});
        } else if (!this.l) {
            dXTabLayout.setSelectedTabIndicatorColor(0);
        } else if (this.m == null) {
            dXTabLayout.setSelectedTabIndicatorColor(this.c);
        } else {
            String valueOf = String.valueOf(this.w);
            if (this.m.containsKey(valueOf)) {
                dXTabLayout.setSelectedTabIndicatorColor(this.m.getInteger(valueOf).intValue());
            } else {
                dXTabLayout.setSelectedTabIndicatorColor(this.c);
            }
        }
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c3cce7d", new Object[]{this});
            return;
        }
        Map<Integer, Boolean> map = this.y;
        if (map == null) {
            this.y = new HashMap();
            return;
        }
        map.clear();
        this.y.put(Integer.valueOf(this.w), Boolean.TRUE);
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new p();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXTABHEADERLAYOUT_ENABLESCROLL) {
            return 0;
        }
        if (j == DXTABHEADERLAYOUT_INDICATORZINDEX) {
            return 1;
        }
        if (j == DXTABHEADERLAYOUT_RELATEDCOMPONENTANIMATED || j == DXTABHEADERLAYOUT_ITEMMATCHPARENTHEIGHT_ANDROID) {
            return 0;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.j, tb.hwb
    public Object getNodePropByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ad97ad4", new Object[]{this, str});
        }
        if (mop.KEY_SELECTED_INDEX.equals(str)) {
            return Integer.valueOf(this.w);
        }
        return super.getNodePropByKey(str);
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        DXWidgetNode dXWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
            return;
        }
        if (getChildren() != null && this.originItems == null) {
            if (!eb5.y()) {
                ArrayList arrayList = new ArrayList();
                this.originItems = arrayList;
                arrayList.addAll(getChildren());
            } else {
                f76 f76Var = this.originInfo;
                if (!(f76Var == null || (dXWidgetNode = f76Var.f19063a) == null)) {
                    this.originItems = dXWidgetNode.getChildren();
                }
            }
        }
        if (this.y == null) {
            this.y = new HashMap();
        }
        if ((this.propertyInitFlag & 2) != 0) {
            JSONArray jSONArray = this.listData;
            if (jSONArray == null || jSONArray.isEmpty() || getChildren() == null) {
                removeAllChild();
                return;
            }
            new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < this.originItems.size(); i++) {
                arrayList2.add(this.originItems.get(i).deepClone(getDXRuntimeContext()));
            }
            ArrayList<DXWidgetNode> generateWidgetNodeByData = generateWidgetNodeByData(0, getListData(), arrayList2);
            this.x = new ArrayList<>();
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                this.x.add((DXWidgetNode) arrayList2.get(i2));
            }
            for (int i3 = 0; i3 < generateWidgetNodeByData.size(); i3++) {
                this.x.add(generateWidgetNodeByData.get(i3));
            }
            removeAllChild();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof p)) {
            super.onClone(dXWidgetNode, z);
            p pVar = (p) dXWidgetNode;
            this.b = pVar.b;
            this.c = pVar.c;
            this.d = pVar.d;
            this.e = pVar.e;
            this.f = pVar.f;
            this.g = pVar.g;
            this.h = pVar.h;
            this.i = pVar.i;
            this.j = pVar.j;
            this.k = pVar.k;
            this.l = pVar.l;
            this.s = pVar.s;
            this.q = pVar.q;
            this.r = pVar.r;
            this.p = pVar.p;
            this.w = pVar.w;
            this.y = pVar.y;
            this.x = pVar.x;
            this.v = pVar.v;
            this.u = pVar.u;
            this.t = pVar.t;
            this.m = pVar.m;
            this.n = pVar.n;
            this.f7452a = pVar.f7452a;
            this.o = pVar.o;
            this.z = pVar.z;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new DXTabLayout(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onEndParser() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4ccc2", new Object[]{this});
        } else {
            super.onEndParser();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.s == null) {
            this.s = new o(getDXRuntimeContext().s(), 3, UUID.randomUUID().toString());
        }
        super.onMeasure(i, i2);
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        DXWidgetNode H;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if ((view instanceof DXTabLayout) && (H = getDXRuntimeContext().H()) != null) {
            DXTabLayout dXTabLayout = (DXTabLayout) view;
            dXTabLayout.clearOnTabClickListeners();
            dXTabLayout.clearOnTabSelectedListeners();
            dXTabLayout.setViewPagerSmoothScroll(this.j);
            H(dXTabLayout);
            F(dXTabLayout);
            a aVar = new a(dXTabLayout);
            this.u = aVar;
            dXTabLayout.addOnTabSelectedListener(aVar);
            TabLayout.b bVar = this.v;
            if (bVar != null) {
                dXTabLayout.removeOnTabClickListener(bVar);
            }
            b bVar2 = new b();
            this.v = bVar2;
            dXTabLayout.addOnTabClickListener(bVar2);
            DXViewPager dXViewPager = (DXViewPager) H.queryWidgetNodeByUserId(this.i);
            this.t = dXViewPager;
            if (dXViewPager != null) {
                dXViewPager.f0(this);
                if (this.t.getDXRuntimeContext().D() != null) {
                    h36.b("DXTabHeaderLayoutWidgetNode", "触发重新绑定");
                    A(this.t);
                }
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXTABHEADERLAYOUT_INDICATORBOTTOMGAP) {
            if (i <= 0) {
                this.b = 0;
            } else {
                this.b = i;
            }
        } else if (j == -5151416374116397110L) {
            this.c = i;
        } else if (j == DXTABHEADERLAYOUT_INDICATORHEIGHT) {
            if (i <= 0) {
                this.d = 0;
            } else {
                this.d = i;
            }
        } else if (j == DXTABHEADERLAYOUT_INDICATORRADIUS) {
            if (i <= 0) {
                this.e = 0;
            } else {
                this.e = i;
            }
        } else if (j == DXTABHEADERLAYOUT_INDICATORWIDTH) {
            if (i <= 0) {
                this.f = 0;
            } else {
                this.f = i;
            }
        } else if (j == -5480582194049152328L) {
            if (i <= 0) {
                this.h = 0;
            } else {
                this.h = i;
            }
        } else if (j == DXTABHEADERLAYOUT_SELECTEDINDEX) {
            if (i <= 0) {
                this.k = 0;
            } else {
                this.k = i;
            }
            this.w = this.k;
        } else if (j == -3765027987112450965L) {
            if (i != 1) {
                z = false;
            }
            this.l = z;
        } else if (j == DXTABHEADERLAYOUT_ENABLESCROLL) {
            if (i == 0) {
                z = false;
            }
            this.f7452a = z;
        } else if (j == DXTABHEADERLAYOUT_INDICATORZINDEX) {
            this.g = i;
        } else if (j == DXTABHEADERLAYOUT_RELATEDCOMPONENTANIMATED) {
            if (i == 0) {
                z = false;
            }
            this.j = z;
        } else if (j == DXTABHEADERLAYOUT_ITEMMATCHPARENTHEIGHT_ANDROID) {
            if (i == 0) {
                z = false;
            }
            this.o = z;
        } else if (j == DXTABHEADERLAYOUT_LAZYLOADITEM) {
            if (i == 0) {
                z = false;
            }
            this.z = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (t26.DX_PARSER_LISTDATA == j) {
            setListData(jSONArray);
            setStatFlag(2);
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j != DXTABHEADERLAYOUT_INDICATORCOLORMAP) {
            super.onSetMapAttribute(j, jSONObject);
        } else if (jSONObject != null) {
            this.n = jSONObject;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j != DXTABHEADERLAYOUT_INDICATORIMAGEURL) {
            if (j == DXTABHEADERLAYOUT_RELATEDCOMPONENTID) {
                this.i = str;
            } else {
                super.onSetStringAttribute(j, str);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void sendBroadcastEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6df6ca", new Object[]{this, dXEvent});
        } else if (dXEvent != null) {
            if (getReferenceNode() != null && isSelfResponseEvent()) {
                postEvent(dXEvent);
            }
            ArrayList<DXWidgetNode> arrayList = this.x;
            if (arrayList != null) {
                Iterator<DXWidgetNode> it = arrayList.iterator();
                while (it.hasNext()) {
                    DXWidgetNode next = it.next();
                    if (isChildResponseEvent()) {
                        next.sendBroadcastEvent(dXEvent);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0202  */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(com.taobao.android.dinamicx.widget.viewpager.tab.view.DXTabLayout r29) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.p.H(com.taobao.android.dinamicx.widget.viewpager.tab.view.DXTabLayout):void");
    }
}
