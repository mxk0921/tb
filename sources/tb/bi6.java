package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.model.DXJSONObjectForVM;
import com.taobao.android.dinamicx.p;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;
import com.taobao.android.dinamicx.widget.k;
import com.taobao.android.dinamicx.widget.r;
import com.taobao.android.dinamicx.widget.recycler.nested.DXNestedScrollerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bi6 extends k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTEMPLATE_ASPECTRATIO = 7594222789952419722L;
    public static final long DXTEMPLATE_BINDSLOT = 1454898352104842311L;
    public static final long DXTEMPLATE_CELLTYPE = 1744786664651967082L;
    public static final long DXTEMPLATE_COLSPAN = 4730601489860228727L;
    public static final long DXTEMPLATE_HASPARAMS = -1664973152736847703L;
    public static final long DXTEMPLATE_HASSLOT = 4914428794176997221L;
    public static final long DXTEMPLATE_HEADER = 9346574058106415L;
    public static final long DXTEMPLATE_IF = 795925;
    public static final int DXTEMPLATE_IF_FALSE = 0;
    public static final int DXTEMPLATE_IF_TRUE = 1;
    public static final long DXTEMPLATE_I_F = 754805;
    public static final long DXTEMPLATE_NAME = 36442092789L;
    public static final long DXTEMPLATE_NEEDRESETSTICKYHEIGHT_ANDROID = -714078668611843156L;
    public static final long DXTEMPLATE_ONSTICKYCHANGE = 2228800223520853672L;
    public static final long DXTEMPLATE_REUSEIDENTIFIER = 7681326167334452278L;
    public static final long DXTEMPLATE_SLOTID = 10150200245776565L;
    public static final long DXTEMPLATE_STICKY = 10152462037879005L;
    public static final long DXTEMPLATE_STICKYOFFSET = 2669229465858660874L;
    public static final int DXTEMPLATE_STICKY_FALSE = 0;
    public static final int DXTEMPLATE_STICKY_TRUE = 1;
    public static final long DXTEMPLATE_TEMPLATE = -2672413305820574652L;
    public static final long DXTEMPLATE_UNIQUEID = 7055731275164326220L;
    public static final long DXTEMPLATE_URL = 528128262;
    public static final long DXTEMPLATE_VERSION = 5435381891761953165L;
    public static final long DXTEMPLATE__SLOTINFOLIST = 7864077457524918358L;
    public static final long DXTEMPLATE__TEMPLATEDATA = 324196793780517186L;
    public static final long DXTEMPLATE__TEMPLATEDATAV4 = -1939491623719046706L;
    public static final long DXTEMPLATE___STORAGETYPE = -4416109363904538046L;
    public static final int STORAGE_TYPE_RESULT_TYPE_CONSTANT_DESCRIPTION = 2;
    public static final int STORAGE_TYPE_RESULT_TYPE_DYNAMIC_DESCRIPTION = 3;
    public static final int STORAGE_TYPE_RESULT_TYPE_INLINE = 1;
    public static final ka6 w = new ka6();

    /* renamed from: a  reason: collision with root package name */
    public int f16399a;
    public String c;
    public int d;
    public int e;
    public String f;
    public String g;
    public int h;
    public int i;
    public vy8 j;
    public boolean k;
    public String l;
    public JSONObject m;
    public JSONObject n;
    public JSONObject o;
    public List<String> p;
    public boolean r;
    public String s;
    public boolean t;
    public boolean u;
    public String v;
    public int b = 1;
    public double q = vu3.b.GEO_NOT_SUPPORT;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597399);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new bi6();
        }
    }

    static {
        t2o.a(444597398);
    }

    public bi6() {
        this.disableFlatten = true;
    }

    public static /* synthetic */ Object ipc$super(bi6 bi6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1834790766:
                super.onBeforeBindChildData();
                return null;
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -1070855414:
                super.setDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
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
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXTemplateWidgetNode");
        }
    }

    public String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6974952", new Object[]{this});
        }
        return this.s;
    }

    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fafff3aa", new Object[]{this});
        }
        return this.l;
    }

    public vy8 C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vy8) ipChange.ipc$dispatch("fbeec18", new Object[]{this});
        }
        return this.j;
    }

    public int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bab4dcc", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39b086fb", new Object[]{this});
        }
        return this.c + "_" + this.g;
    }

    public String F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("206169f7", new Object[]{this});
        }
        return this.v;
    }

    public String G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.f;
    }

    public int H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6dd599b9", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public JSONObject I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5a2baab4", new Object[]{this});
        }
        return this.m;
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2c40ce", new Object[]{this})).booleanValue();
        }
        if (this.f16399a > 1 || L()) {
            return true;
        }
        return false;
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7c38787", new Object[]{this})).booleanValue();
        }
        if (L() || this.u) {
            return true;
        }
        return false;
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b2496be", new Object[]{this})).booleanValue();
        }
        if (this.d == 1) {
            return true;
        }
        return false;
    }

    public final JSONObject O(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("72fd5c2d", new Object[]{this, dXWidgetNode});
        }
        if (dXWidgetNode == null) {
            return null;
        }
        DXWidgetNode queryRootWidgetNode = dXWidgetNode.queryRootWidgetNode();
        if (queryRootWidgetNode != null) {
            DXWidgetNode dXWidgetNode2 = queryRootWidgetNode.parentWidget;
            if (dXWidgetNode2 instanceof bi6) {
                bi6 bi6Var = (bi6) dXWidgetNode2;
                JSONObject jSONObject = bi6Var.n;
                if (jSONObject == null) {
                    return O(bi6Var);
                }
                String e = getDXRuntimeContext().p().e();
                JSONObject jSONObject2 = jSONObject.getJSONObject(e);
                if (jSONObject2 == null) {
                    la6.b("对应的父节点 " + e + "找不到slot信息");
                    return null;
                }
                JSONObject jSONObject3 = jSONObject2.getJSONObject(this.l);
                if (jSONObject3 == null) {
                    la6.b("对应的slotId " + this.l + " 找不到slot信息");
                }
                h36.a("找到slot信息" + JSON.toJSONString(jSONObject3));
                return jSONObject3;
            }
        }
        h36.c("坑位 " + this.l + " 发生错误 找不到slot信息");
        return null;
    }

    public final void P(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33723d6", new Object[]{this, jSONObject});
            return;
        }
        this.o = null;
        this.p = null;
        if (jSONObject != null) {
            this.m = jSONObject;
        }
    }

    public void Q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd26222", new Object[]{this, new Boolean(z)});
        } else {
            this.u = z;
        }
    }

    public void S(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d881fe16", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void T(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d019bb2", new Object[]{this, jSONObject});
        } else {
            this.o = jSONObject;
        }
    }

    public void U(vy8 vy8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d01c52e", new Object[]{this, vy8Var});
        } else {
            this.j = vy8Var;
        }
    }

    public void V(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c68cd48", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        DXEvent dXEvent = new DXEvent(2228800223520853672L);
        HashMap hashMap = new HashMap();
        hashMap.put("index", mw5.K(i));
        hashMap.put("sticky", mw5.G(z));
        dXEvent.setArgs(hashMap);
        postEvent(dXEvent);
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f836cf", new Object[]{this, obj});
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new bi6();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public DXWidgetNode deepClone(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("442ee468", new Object[]{this, dXRuntimeContext});
        }
        return t(dXRuntimeContext, false);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public DXWidgetNode deepCloneForEmbed(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("5042318", new Object[]{this, dXRuntimeContext});
        }
        return t(dXRuntimeContext, true);
    }

    public double getAspectRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b371752", new Object[]{this})).doubleValue();
        }
        return this.q;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXTEMPLATE_IF || j == 754805) {
            return 1;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.c;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return this.g;
    }

    public boolean isRemote() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf69e69b", new Object[]{this})).booleanValue();
        }
        if (this.h == 3) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
        } else {
            super.onBeforeBindChildData();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeginParser(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9f4e04", new Object[]{this, new Boolean(z)});
            return;
        }
        this.o = null;
        this.p = null;
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
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof bi6)) {
            super.onClone(dXWidgetNode, z);
            bi6 bi6Var = (bi6) dXWidgetNode;
            this.f16399a = bi6Var.f16399a;
            this.b = bi6Var.b;
            this.c = bi6Var.c;
            this.d = bi6Var.d;
            this.e = bi6Var.e;
            this.f = bi6Var.f;
            this.g = bi6Var.g;
            this.h = bi6Var.h;
            this.j = bi6Var.j;
            this.m = bi6Var.m;
            this.o = bi6Var.o;
            this.p = bi6Var.p;
            this.k = bi6Var.k;
            this.l = bi6Var.l;
            this.n = bi6Var.n;
            this.r = bi6Var.r;
            this.s = bi6Var.s;
            this.i = bi6Var.i;
            this.t = bi6Var.t;
            this.q = bi6Var.q;
            this.v = bi6Var.v;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return super.onCreateView(context);
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
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        DXRootView L;
        DXNestedScrollerView dxNestedScrollerView;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (getDXRuntimeContext() != null && (L = getDXRuntimeContext().L()) != null && (dxNestedScrollerView = L.getDxNestedScrollerView(getDXRuntimeContext())) != null) {
            if (L()) {
                int measuredHeight = getMeasuredHeight() + this.e;
                if (!nb6.h() || !this.dXRuntimeContext.b0()) {
                    z = false;
                }
                dxNestedScrollerView.setStickyHeight(measuredHeight, z);
            } else if (this.t) {
                dxNestedScrollerView.resetStickyHeight();
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (j == DXTEMPLATE__SLOTINFOLIST) {
            this.n = sc6.b(jSONArray);
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j == 324196793780517186L) {
            P(jSONObject);
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j != DXTEMPLATE_CELLTYPE) {
            if (j == 36442092789L) {
                this.c = str;
            } else if (j == 528128262) {
                this.f = str;
            } else if (j == 5435381891761953165L) {
                this.g = str;
            } else if (j != DXTEMPLATE_BINDSLOT) {
                if (j == DXTEMPLATE_SLOTID) {
                    this.l = str;
                } else if (j == DXTEMPLATE_REUSEIDENTIFIER) {
                    this.s = str;
                } else if (j == DXTEMPLATE_UNIQUEID) {
                    this.v = str;
                } else if (j != DXTEMPLATE__TEMPLATEDATAV4) {
                    super.onSetStringAttribute(j, str);
                } else if (str == null) {
                    onSetMapAttribute(324196793780517186L, null);
                } else {
                    onSetMapAttribute(324196793780517186L, JSON.parseObject(str));
                }
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void processUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410f1b9c", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.userId)) {
            DXWidgetNode queryRootWidgetNode = queryRootWidgetNode();
            if ((queryRootWidgetNode instanceof j) || (queryRootWidgetNode instanceof r)) {
                Map<String, WeakReference<DXWidgetNode>> dxUserIdMap = queryRootWidgetNode.getDxUserIdMap();
                WeakReference<DXWidgetNode> weakReference = dxUserIdMap.get(this.userId);
                if (weakReference != null) {
                    DXWidgetNode dXWidgetNode = weakReference.get();
                    if (dXWidgetNode != null && (getParentWidget() instanceof DXAbsContainerBaseLayout)) {
                        DXAbsContainerBaseLayout dXAbsContainerBaseLayout = (DXAbsContainerBaseLayout) getParentWidget();
                        if (dXAbsContainerBaseLayout.y() == null || dXAbsContainerBaseLayout.y().indexOf(dXWidgetNode) == -1) {
                            dxUserIdMap.put(this.userId, new WeakReference<>(this));
                            return;
                        }
                        return;
                    }
                    return;
                }
                dxUserIdMap.put(this.userId, new WeakReference<>(this));
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 6;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void setDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c02c0b0a", new Object[]{this, new Long(j), new Double(d)});
        } else if (7594222789952419722L == j) {
            this.q = d;
        } else {
            super.setDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public Object shallowClone(DXRuntimeContext dXRuntimeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("10620bbf", new Object[]{this, dXRuntimeContext, new Boolean(z)});
        }
        DXWidgetNode build = build(null);
        if (build == null) {
            return null;
        }
        if (dXRuntimeContext != null) {
            build.dXRuntimeContext = dXRuntimeContext.b(build);
        }
        build.onClone(this, z);
        return build;
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public DXWidgetNode t(DXRuntimeContext dXRuntimeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("2fae43f0", new Object[]{this, dXRuntimeContext, new Boolean(z)});
        }
        DXWidgetNode dXWidgetNode = (DXWidgetNode) shallowClone(dXRuntimeContext, true);
        DXRuntimeContext b = dXRuntimeContext.b(this);
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f7343a = this.c;
        try {
            if (!TextUtils.isEmpty(this.g)) {
                dXTemplateItem.b = Long.valueOf(this.g).longValue();
            }
        } catch (NumberFormatException e) {
            xv5.b(e);
        }
        dXTemplateItem.c = this.f;
        if (isV4Node() && getChildrenCount() > 0 && H() == 2) {
            DXWidgetNode childAt = getChildAt(0);
            if (childAt != null) {
                xh6 xh6Var = new xh6();
                xh6Var.f31396a = childAt.getDXRuntimeContext().p().k.f31396a;
                xh6Var.b = childAt.getDXRuntimeContext().p().k.b;
                dXTemplateItem.k = xh6Var;
                DinamicXEngine.j0();
            }
        } else if (!(dXRuntimeContext.p() == null || dXRuntimeContext.p().k == null)) {
            xh6 xh6Var2 = new xh6();
            xh6Var2.f31396a = dXRuntimeContext.p().k.f31396a;
            xh6Var2.b = dXRuntimeContext.p().k.b;
            dXTemplateItem.k = xh6Var2;
            DinamicXEngine.j0();
        }
        b.i0(dXTemplateItem);
        if (this.children != null) {
            dXWidgetNode.children = new ArrayList();
            for (int i = 0; i < this.children.size(); i++) {
                if (z) {
                    dXWidgetNode.addChild(this.children.get(i).deepCloneForEmbed(b), false);
                } else {
                    dXWidgetNode.addChild(this.children.get(i).deepClone(b), false);
                }
            }
        }
        return dXWidgetNode;
    }

    public DXWidgetNode u(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("e78c2554", new Object[]{this, dXRuntimeContext});
        }
        DXWidgetNode dXWidgetNode = (DXWidgetNode) shallowClone(dXRuntimeContext, true);
        dXWidgetNode.setSourceWidget(getSourceWidget());
        r26.a(dXWidgetNode);
        if (isRemote()) {
            return dXWidgetNode;
        }
        DXWidgetNode childAt = getChildAt(0);
        if (!(childAt == null || childAt.getDXRuntimeContext() == null)) {
            DXRuntimeContext b = childAt.getDXRuntimeContext().b(childAt);
            if (dXRuntimeContext.O() instanceof JSONObject) {
                b.f0((JSONObject) dXRuntimeContext.O());
            } else if (dXRuntimeContext.w0() && (dXRuntimeContext.O() instanceof Object)) {
                DXJSONObjectForVM dXJSONObjectForVM = new DXJSONObjectForVM();
                dXJSONObjectForVM.setData(dXRuntimeContext.O());
                b.f0(dXJSONObjectForVM);
                a(dXJSONObjectForVM);
            }
            if (b.O() == null) {
                b.q0(dXRuntimeContext.O());
            }
            b.r0(dXRuntimeContext.P());
            dXWidgetNode.addChild(r26.c(childAt, b, false), false);
        }
        return dXWidgetNode;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void updateRefreshType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22ac2b0", new Object[]{this, new Integer(i)});
            return;
        }
        DXRuntimeContext dXRuntimeContext = this.dXRuntimeContext;
        if (dXRuntimeContext != null) {
            dXRuntimeContext.o0(i);
        }
        if (getChildrenCount() > 0) {
            for (DXWidgetNode dXWidgetNode : this.children) {
                dXWidgetNode.updateRefreshType(i);
            }
        }
    }

    public int v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cfea405e", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final ka6 w() {
        DXTemplateItem dxTemplateItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ka6) ipChange.ipc$dispatch("4dd3dc33", new Object[]{this});
        }
        if (zg5.k5()) {
            return w;
        }
        if (getDXRuntimeContext() == null || getDXRuntimeContext().s() == null || getDXRuntimeContext().s().f() == null) {
            return null;
        }
        DinamicXEngine f = getDXRuntimeContext().s().f();
        DXRootView L = getDXRuntimeContext().L();
        if (L == null || (dxTemplateItem = L.getDxTemplateItem()) == null) {
            return null;
        }
        ka6 ka6Var = f.C().get(dxTemplateItem.d());
        if (ka6Var != null) {
            return ka6Var;
        }
        ka6 ka6Var2 = new ka6();
        f.C().put(dxTemplateItem.d(), ka6Var2);
        return ka6Var2;
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4455430d", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public List<String> y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("76a4fa08", new Object[]{this});
        }
        return this.p;
    }

    public JSONObject z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9e8abe12", new Object[]{this});
        }
        return this.o;
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af787ca8", new Object[]{this});
            return;
        }
        if (this.r && DinamicXEngine.j0()) {
            h36.c("hasProcessContainsSlotIdTemplate: " + E());
        }
        JSONObject O = O(this);
        if (O != null) {
            this.c = sc6.a(getDXRuntimeContext(), "name", O);
            this.g = sc6.a(getDXRuntimeContext(), "version", O);
            this.f = sc6.a(getDXRuntimeContext(), "url", O);
            this.m = O;
        }
        this.r = true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void bindRuntimeContext(DXRuntimeContext dXRuntimeContext, boolean z) {
        int i;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9a0548", new Object[]{this, dXRuntimeContext, new Boolean(z)});
        } else if (dXRuntimeContext != null) {
            if (z) {
                obj = this.dXRuntimeContext.O();
                i = this.dXRuntimeContext.P();
            } else {
                obj = null;
                i = 0;
            }
            DXRuntimeContext dXRuntimeContext2 = this.dXRuntimeContext;
            if (dXRuntimeContext2 != dXRuntimeContext) {
                Map<String, mw5> t = dXRuntimeContext2.t();
                DXRuntimeContext b = dXRuntimeContext.b(this);
                this.dXRuntimeContext = b;
                b.j0(t);
                if (z) {
                    this.dXRuntimeContext.q0(obj);
                    this.dXRuntimeContext.r0(i);
                }
            }
            DXWidgetNode childAt = getChildAt(0);
            if (childAt == null || childAt.getDXRuntimeContext() == null) {
                h36.g(h36.TAG, "template deepCopyChildNode child or child runtimeContext is null!!!");
                return;
            }
            DXRuntimeContext b2 = childAt.getDXRuntimeContext().b(childAt);
            b2.a(dXRuntimeContext);
            if (b2.L() == null || b2.L() != dXRuntimeContext.L()) {
                b2.p0(dXRuntimeContext.L());
            }
            if (obj instanceof JSONObject) {
                b2.f0((JSONObject) obj);
            } else if (dXRuntimeContext.w0() && (dXRuntimeContext.O() instanceof Object)) {
                DXJSONObjectForVM dXJSONObjectForVM = new DXJSONObjectForVM();
                dXJSONObjectForVM.setData(dXRuntimeContext.O());
                b2.f0(dXJSONObjectForVM);
                a(dXJSONObjectForVM);
            }
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.f7343a = this.c;
            dXTemplateItem.b = Long.parseLong(this.g);
            b2.i0(dXTemplateItem);
            childAt.bindRuntimeContext(b2, z);
        }
    }

    public final void M(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69aa6cc", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            if (isRemote() && getChildrenCount() <= 0) {
                if (!TextUtils.isEmpty(this.l)) {
                    N();
                }
                removeAllChild();
                DXTemplateItem dXTemplateItem = new DXTemplateItem();
                dXTemplateItem.f7343a = getName();
                if (!TextUtils.isEmpty(getVersion())) {
                    dXTemplateItem.b = Long.parseLong(getVersion());
                }
                dXTemplateItem.c = G();
                ka6 w2 = w();
                if (w2 != null) {
                    p h = w2.h(getDXRuntimeContext());
                    if (h == null) {
                        la6.b("dxRemoteChildTemplateManager.getTemplateManger(getDXRuntimeContext()) == null");
                    }
                    DXTemplateItem g = w2.g(h, dXTemplateItem);
                    if (w2.i(g, dXTemplateItem)) {
                        DXWidgetNode e = w2.e(g, getDXRuntimeContext(), h, i);
                        if (e != null) {
                            addChild(e, false);
                            return;
                        }
                        la6.b("同步获取模版失败" + dXTemplateItem.d());
                        return;
                    }
                    if (g != null) {
                        DXWidgetNode e2 = w2.e(g, getDXRuntimeContext(), h, i);
                        if (e2 != null) {
                            addChild(e2, false);
                        } else {
                            la6.b("同步获取模版失败" + dXTemplateItem.d());
                        }
                    }
                    DXEngineConfig c = getDXRuntimeContext().s().c();
                    if ((c == null ? 1 : c.o()) == 1) {
                        w2.f(dXTemplateItem, getDXRuntimeContext(), this, h);
                    } else {
                        w2.j(dXTemplateItem, getDXRuntimeContext(), this, h, i);
                    }
                }
            }
        } catch (Throwable th) {
            if (DinamicXEngine.j0()) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == -4416109363904538046L) {
            h36.a("onSetIntAttribute");
            this.h = i;
        } else if (j == 4730601489860228727L) {
            this.f16399a = i;
        } else if (j == DXTEMPLATE_IF || j == 754805) {
            this.b = i;
        } else if (j == DXTEMPLATE_STICKY) {
            this.d = i;
        } else if (j == DXTEMPLATE_STICKYOFFSET) {
            this.e = i;
        } else if (j != -1664973152736847703L) {
            if (j == DXTEMPLATE_HASSLOT) {
                if (i != 1) {
                    z = false;
                }
                this.k = z;
            } else if (j == DXTEMPLATE_NEEDRESETSTICKYHEIGHT_ANDROID) {
                if (i != 1) {
                    z = false;
                }
                this.t = z;
            } else if (j != DXTEMPLATE_HEADER) {
                super.onSetIntAttribute(j, i);
            }
        }
    }
}
