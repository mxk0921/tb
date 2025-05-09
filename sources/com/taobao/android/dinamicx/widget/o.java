package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollLayoutBaseExposeEvent;
import com.taobao.android.dinamicx.expression.event.DXViewEvent;
import com.taobao.android.dinamicx.r;
import com.taobao.android.dinamicx.videoc.DXVideoControlConfig;
import com.taobao.android.dinamicx.view.DXNativeRecyclerView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.recycler.event.DXRecyclerLayoutOnExposeEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.axb;
import tb.cxb;
import tb.exb;
import tb.gp8;
import tb.hm6;
import tb.jb6;
import tb.l4c;
import tb.lvk;
import tb.mw5;
import tb.t2o;
import tb.t8e;
import tb.wq2;
import tb.xv5;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class o extends k implements l4c, t8e, exb, axb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXSCROLLLAYOUTBASE_BLANKCLICKABLE_ANDROID = 4112388971831108280L;
    public static final long DXSCROLLLAYOUTBASE_ENABLENESTEDPLAYCONTROL = -8291646690741297832L;
    public static final long DXSCROLLLAYOUTBASE_EXPOSURECONFIG = 6442732320864020959L;
    public static final long DXSCROLLLAYOUTBASE_REINITEXPOSE_ANDROID = -4595233111595062221L;
    public static final long DXSCROLLLAYOUTBASE_VIDEOCONTROLCONFIG = -7801350391660369312L;
    public static final long DX_SCROLL_LAYOUT_BASE = -116275953006946184L;
    public static final long DX_SCROLL_LAYOUT_BASE_INDICATOR_ID = 7196296497982840181L;
    public static final long DX_SCROLL_LAYOUT_BASE_ON_PAGE_APPEAR = -8975334121118753601L;
    public static final long DX_SCROLL_LAYOUT_BASE_ON_PAGE_DISAPPEAR = -5201408949358043646L;
    public static final long DX_SCROLL_LAYOUT_BASE_ON_SCROLL = 5288751146867425108L;
    public static final long DX_SCROLL_LAYOUT_BASE_ON_SCROLL_BEGIN = 9144262755562405950L;
    public static final long DX_SCROLL_LAYOUT_BASE_ON_SCROLL_END = 2691126191158604142L;
    public static final long DX_SCROLL_LAYOUT_BASE_SCROLL_ENABLED = -8352681166307095225L;
    public static final long DX_SCROLL_LAYOUT_BASE_SHOW_INDICATOR = -3765027987112450965L;
    private List<DXWidgetNode> appearWidgets;
    public int contentHorizontalLength;
    public int contentVerticalLength;
    private JSONObject exposeConfig;
    public gp8 exposeHelper;
    public String indicatorId;
    public DXWidgetNode indicatorWidgetNode;
    public ArrayList<DXWidgetNode> itemWidgetNodes;
    public com.taobao.android.dinamicx.o pipeline;
    private Object videoControlConfig;
    private hm6 videoControlManager;
    public Map<Integer, e> viewModels;
    private boolean enableNestedPlayControl = false;
    private boolean blankClickable = false;
    private boolean reinitExpose = true;
    public boolean showIndicator = true;
    public boolean scrollEnabled = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements lvk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3bebbcb", new Object[]{this});
            } else {
                o.this.onTapEvent();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements DXNativeRecyclerView.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f7448a;

        public b(boolean z) {
            this.f7448a = z;
        }

        public void a(int i, ArrayList<DXWidgetNode> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa1e8891", new Object[]{this, new Integer(i), arrayList});
                return;
            }
            if (zg5.w3()) {
                if (arrayList != null && arrayList.size() != 0) {
                    i %= arrayList.size();
                } else {
                    return;
                }
            }
            e viewModel = o.this.getViewModel(i);
            if ((viewModel == null || !viewModel.a()) && arrayList != null && i < arrayList.size()) {
                DXWidgetNode dXWidgetNode = arrayList.get(i);
                if (dXWidgetNode != null) {
                    o.this.postEvent(new DXScrollLayoutBaseExposeEvent(i, dXWidgetNode.getDXRuntimeContext().O()));
                    dXWidgetNode.postEvent(new DXViewEvent(5288689083281052505L));
                }
                o.access$000(o.this, i);
            }
        }

        public void b(int i, ArrayList<DXWidgetNode> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("16aed30c", new Object[]{this, new Integer(i), arrayList});
                return;
            }
            e viewModel = o.this.getViewModel(i);
            if ((viewModel == null || !viewModel.b() || this.f7448a) && arrayList != null && i < arrayList.size()) {
                DXWidgetNode dXWidgetNode = arrayList.get(i);
                if (dXWidgetNode != null) {
                    o.this.postEvent(new DXRecyclerLayoutOnExposeEvent(DXRecyclerLayout.DXRECYCLERLAYOUT_ONREPEATEXPOSE, i, dXWidgetNode.getDXRuntimeContext().O()));
                    DXEvent dXViewEvent = new DXViewEvent(5288689083281052505L);
                    HashMap hashMap = new HashMap();
                    hashMap.put("isRepeat", mw5.G(true));
                    dXViewEvent.setArgs(hashMap);
                    dXWidgetNode.postEvent(dXViewEvent);
                }
                o.access$100(o.this, i, true);
            }
        }

        public void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("53de4476", new Object[]{this, new Integer(i)});
            } else {
                o.access$100(o.this, i, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                o.this.triggerExposure();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7450a;

        public d(int i) {
            this.f7450a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DXRuntimeContext dXRuntimeContext = o.this.dXRuntimeContext;
            if (dXRuntimeContext != null) {
                dXRuntimeContext.o0(this.f7450a);
            }
            ArrayList<DXWidgetNode> arrayList = o.this.itemWidgetNodes;
            if (arrayList != null) {
                Iterator<DXWidgetNode> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().updateRefreshType(this.f7450a);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f7451a;
        public boolean b;

        static {
            t2o.a(444597364);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4a8bf621", new Object[]{this})).booleanValue();
            }
            return this.f7451a;
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6131d794", new Object[]{this})).booleanValue();
            }
            return this.b;
        }

        public void c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb901b8f", new Object[]{this, new Boolean(z)});
            } else {
                this.f7451a = z;
            }
        }

        public void d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60a5750c", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }
    }

    static {
        t2o.a(444597359);
        t2o.a(444597127);
        t2o.a(444597131);
        t2o.a(444597112);
        t2o.a(444597111);
    }

    public o() {
        this.markContainer = true;
    }

    public static /* synthetic */ void access$000(o oVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64e4e4d", new Object[]{oVar, new Integer(i)});
        } else {
            oVar.saveExposed(i);
        }
    }

    public static /* synthetic */ void access$100(o oVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61dd3206", new Object[]{oVar, new Integer(i), new Boolean(z)});
        } else {
            oVar.saveCanRepeatExpose(i, z);
        }
    }

    private void forceUniformHeight(List<DXWidgetNode> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d065bb", new Object[]{this, list, new Integer(i)});
            return;
        }
        int c2 = DXWidgetNode.DXMeasureSpec.c(getMeasuredHeight(), 1073741824);
        for (DXWidgetNode dXWidgetNode : list) {
            if (!(dXWidgetNode == null || dXWidgetNode.getVisibility() == 2 || dXWidgetNode.layoutHeight != -1)) {
                int i2 = dXWidgetNode.layoutWidth;
                dXWidgetNode.layoutWidth = dXWidgetNode.getMeasuredWidth();
                measureChildWithMargins(dXWidgetNode, i, 0, c2, 0);
                dXWidgetNode.layoutWidth = i2;
            }
        }
    }

    private void forceUniformWidth(List<DXWidgetNode> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("571a43ae", new Object[]{this, list, new Integer(i)});
            return;
        }
        int c2 = DXWidgetNode.DXMeasureSpec.c(getMeasuredWidth(), 1073741824);
        for (DXWidgetNode dXWidgetNode : list) {
            if (!(dXWidgetNode == null || dXWidgetNode.getVisibility() == 2 || dXWidgetNode.layoutWidth != -1)) {
                int i2 = dXWidgetNode.layoutHeight;
                dXWidgetNode.layoutHeight = dXWidgetNode.getMeasuredHeight();
                measureChildWithMargins(dXWidgetNode, c2, 0, i, 0);
                dXWidgetNode.layoutHeight = i2;
            }
        }
    }

    private void initVideoPlayControl(RecyclerView recyclerView) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c32b2492", new Object[]{this, recyclerView});
        } else if (recyclerView != null) {
            try {
                if (this.videoControlManager == null) {
                    DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
                    hm6 F = dXRuntimeContext.s().f().F();
                    this.videoControlManager = F;
                    if (F != null && (this.videoControlConfig instanceof DXVideoControlConfig) && F.h()) {
                        if (TextUtils.isEmpty(dXRuntimeContext.c())) {
                            str = "";
                        } else {
                            str = dXRuntimeContext.c();
                        }
                        if (TextUtils.isEmpty(this.userId)) {
                            str2 = "DXScrollLayoutBase";
                        } else {
                            str2 = this.userId;
                        }
                        this.videoControlManager.d(recyclerView);
                        this.videoControlManager.i(recyclerView, (DXVideoControlConfig) this.videoControlConfig, str + "_" + str2);
                        this.videoControlManager.k(recyclerView);
                        this.videoControlManager.f(recyclerView);
                    }
                }
            } catch (Exception e2) {
                xv5.b(e2);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(o oVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1834790766:
                super.onBeforeBindChildData();
                return null;
            case -1756697323:
                return super.queryWTByAutoId(((Number) objArr[0]).intValue());
            case -1399192248:
                super.bindRuntimeContext((DXRuntimeContext) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -857616453:
                super.setBackground((View) objArr[0]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 757047317:
                super.setMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case 895336024:
                super.onBeforeBindChildDataWithButter();
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1172714098:
                return super.queryWTByUserId((String) objArr[0]);
            case 1694530481:
                super.onSetObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXScrollLayoutBase");
        }
    }

    private void saveCanRepeatExpose(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab7776a", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        e viewModel = getViewModel(i);
        if (viewModel != null) {
            viewModel.d(z);
        }
    }

    private void saveExposed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b61059", new Object[]{this, new Integer(i)});
            return;
        }
        e viewModel = getViewModel(i);
        if (viewModel != null) {
            viewModel.c(true);
        }
    }

    public ArrayList<DXWidgetNode> _getItemWidgetNodes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("49e2a404", new Object[]{this});
        }
        return this.itemWidgetNodes;
    }

    public void addAppearWidget(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d17e4e", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode != null) {
            if (this.appearWidgets == null) {
                this.appearWidgets = new ArrayList();
            }
            this.appearWidgets.add(dXWidgetNode);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void bindRuntimeContext(DXRuntimeContext dXRuntimeContext, boolean z) {
        ArrayList<DXWidgetNode> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9a0548", new Object[]{this, dXRuntimeContext, new Boolean(z)});
            return;
        }
        super.bindRuntimeContext(dXRuntimeContext, z);
        if (dXRuntimeContext != null && (arrayList = this.itemWidgetNodes) != null) {
            Iterator<DXWidgetNode> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().bindRuntimeContext(dXRuntimeContext, z);
            }
        }
    }

    @Override // tb.l4c
    public void clearExposureCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("972e4af5", new Object[]{this});
            return;
        }
        View D = getDXRuntimeContext().D();
        if (D instanceof DXNativeRecyclerView) {
            ((DXNativeRecyclerView) D).clearExposeCache();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == -8352681166307095225L || j == -3765027987112450965L) {
            return 1;
        }
        if (j == DXSCROLLLAYOUTBASE_ENABLENESTEDPLAYCONTROL || j == DXSCROLLLAYOUTBASE_BLANKCLICKABLE_ANDROID) {
            return 0;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    public e getViewModel(int i) {
        ArrayList<DXWidgetNode> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("740e141f", new Object[]{this, new Integer(i)});
        }
        if (!zg5.q3() || (arrayList = this.itemWidgetNodes) == null || this.viewModels == null || i < 0 || i > arrayList.size() - 1) {
            return null;
        }
        if (this.viewModels.get(Integer.valueOf(i)) == null) {
            this.viewModels.put(Integer.valueOf(i), new e());
        }
        return this.viewModels.get(Integer.valueOf(i));
    }

    public boolean isBlankClickable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ee09443", new Object[]{this})).booleanValue();
        }
        return this.blankClickable;
    }

    public boolean isEnableNestedPlayControl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("496cec50", new Object[]{this})).booleanValue();
        }
        return this.enableNestedPlayControl;
    }

    public boolean isPipelineDefaultCreateRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d04cd663", new Object[]{this})).booleanValue();
        }
        return this.videoControlConfig instanceof DXVideoControlConfig;
    }

    @Override // com.taobao.android.dinamicx.widget.k
    public void measureHorizontal(int i, int i2) {
        boolean z;
        int i3;
        ArrayList<DXWidgetNode> arrayList;
        boolean z2;
        int i4 = 2;
        boolean z3 = true;
        int i5 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b92dc9", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mTotalLength = 0;
        int a2 = DXWidgetNode.DXMeasureSpec.a(i2);
        ArrayList<DXWidgetNode> arrayList2 = this.itemWidgetNodes;
        if (arrayList2 != null) {
            Iterator<DXWidgetNode> it = arrayList2.iterator();
            int i6 = 0;
            i3 = 0;
            boolean z4 = true;
            z = false;
            while (it.hasNext()) {
                DXWidgetNode next = it.next();
                if (!(next == null || next.getVisibility() == i4)) {
                    measureChildWithMargins(next, measureSpecForChild(next.layoutWidth, i), 0, i2, 0);
                    if (a2 == 1073741824 || next.getLayoutHeight() != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                        z = true;
                    }
                    int marginTop = next.getMarginTop() + next.getMarginBottom();
                    int measuredHeight = next.getMeasuredHeight() + marginTop;
                    i3 = Math.max(i3, measuredHeight);
                    if (!z4 || next.layoutHeight != -1) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (!z2) {
                        marginTop = measuredHeight;
                    }
                    i6 = Math.max(i6, marginTop);
                    this.contentHorizontalLength += next.getMeasuredWidth() + next.getMarginLeft() + next.getMarginRight();
                    i4 = 2;
                }
            }
            i5 = i6;
            z3 = z4;
        } else {
            i3 = 0;
            z = false;
        }
        int resolveSize = DXWidgetNode.resolveSize(Math.max(getLayoutWidth(), getMinWidth()), i);
        if (z3 || a2 == 1073741824) {
            i5 = i3;
        }
        setMeasuredDimension(resolveSize, DXWidgetNode.resolveSize(Math.max(i5 + getPaddingTop() + getPaddingBottom(), getMinHeight()), i2));
        if (z && (arrayList = this.itemWidgetNodes) != null) {
            forceUniformHeight(arrayList, i);
        }
    }

    public int measureSpecForChild(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e582946", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i == -2) {
            return DXWidgetNode.DXMeasureSpec.c(8388607, 0);
        }
        return i2;
    }

    @Override // com.taobao.android.dinamicx.widget.k
    public void measureVertical(int i, int i2) {
        boolean z;
        int i3;
        ArrayList<DXWidgetNode> arrayList;
        boolean z2;
        int i4 = 2;
        boolean z3 = true;
        int i5 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25080b1b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mTotalLength = 0;
        int a2 = DXWidgetNode.DXMeasureSpec.a(i);
        ArrayList<DXWidgetNode> arrayList2 = this.itemWidgetNodes;
        if (arrayList2 != null) {
            Iterator<DXWidgetNode> it = arrayList2.iterator();
            int i6 = 0;
            i3 = 0;
            boolean z4 = true;
            z = false;
            while (it.hasNext()) {
                DXWidgetNode next = it.next();
                if (!(next == null || next.getVisibility() == i4)) {
                    measureChildWithMargins(next, i, 0, measureSpecForChild(next.layoutHeight, i2), 0);
                    if (a2 == 1073741824 || next.getLayoutWidth() != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                        z = true;
                    }
                    int marginLeft = next.getMarginLeft() + next.getMarginRight();
                    int measuredWidth = next.getMeasuredWidth() + marginLeft;
                    i3 = Math.max(i3, measuredWidth);
                    if (!z4 || next.layoutWidth != -1) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (!z2) {
                        marginLeft = measuredWidth;
                    }
                    i6 = Math.max(i6, marginLeft);
                    this.contentVerticalLength += next.getMeasuredHeight() + next.getMarginTop() + next.getMarginBottom();
                    i4 = 2;
                }
            }
            i5 = i6;
            z3 = z4;
        } else {
            i3 = 0;
            z = false;
        }
        int resolveSize = DXWidgetNode.resolveSize(Math.max(getLayoutHeight(), getMinHeight()), i2);
        if (z3 || a2 == 1073741824) {
            i5 = i3;
        }
        setMeasuredDimension(DXWidgetNode.resolveSize(Math.max(i5 + getPaddingLeft() + getPaddingRight(), getMinWidth()), i), resolveSize);
        if (z && (arrayList = this.itemWidgetNodes) != null) {
            forceUniformWidth(arrayList, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
            return;
        }
        super.onBeforeBindChildData();
        DXWidgetNode queryIndicatorNodeByUserId = queryIndicatorNodeByUserId(this.indicatorId);
        if (queryIndicatorNodeByUserId != null) {
            r.a(queryIndicatorNodeByUserId);
            if (this.showIndicator) {
                queryIndicatorNodeByUserId.setVisibility(0);
                this.indicatorWidgetNode = queryIndicatorNodeByUserId;
            } else {
                queryIndicatorNodeByUserId.setVisibility(2);
            }
        }
        if (getChildren() != null) {
            ArrayList<DXWidgetNode> arrayList = new ArrayList<>();
            this.itemWidgetNodes = arrayList;
            arrayList.addAll(getChildren());
        } else {
            this.itemWidgetNodes = new ArrayList<>();
        }
        this.viewModels = new HashMap();
        setDisableFlatten(true);
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildDataWithButter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("355dbe58", new Object[]{this});
        } else {
            super.onBeforeBindChildDataWithButter();
        }
    }

    public void onCanPlay(cxb<?, exb> cxbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c767ef", new Object[]{this, cxbVar, str});
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof o) {
            o oVar = (o) dXWidgetNode;
            this.indicatorId = oVar.indicatorId;
            this.scrollEnabled = oVar.scrollEnabled;
            this.showIndicator = oVar.showIndicator;
            this.itemWidgetNodes = oVar.itemWidgetNodes;
            this.indicatorWidgetNode = oVar.indicatorWidgetNode;
            this.pipeline = oVar.pipeline;
            this.contentHorizontalLength = oVar.contentHorizontalLength;
            this.contentVerticalLength = oVar.contentVerticalLength;
            this.appearWidgets = oVar.appearWidgets;
            this.exposeConfig = oVar.exposeConfig;
            this.videoControlConfig = oVar.videoControlConfig;
            this.videoControlManager = oVar.videoControlManager;
            this.enableNestedPlayControl = oVar.enableNestedPlayControl;
            this.viewModels = oVar.viewModels;
            this.blankClickable = oVar.blankClickable;
            this.reinitExpose = oVar.reinitExpose;
        }
    }

    public void onDidFinishPlayingLastItem(int i, boolean z, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2206a3f", new Object[]{this, new Integer(i), new Boolean(z), str, map});
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.pipeline == null) {
            this.pipeline = new com.taobao.android.dinamicx.o(getDXRuntimeContext().s(), 3, UUID.randomUUID().toString(), isPipelineDefaultCreateRootView());
        }
        ArrayList arrayList = new ArrayList();
        if (this.listData == null) {
            arrayList.addAll(this.children);
        }
        removeAllChild();
        super.onMeasure(i, i2);
        if (this.listData == null) {
            this.children.addAll(arrayList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (getDxv4Properties().h().get(com.taobao.android.dinamicx.widget.DXRecyclerLayout.DXRECYCLERLAYOUT_ONREPEATEXPOSE) != null) goto L_0x0088;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
        if (getEventHandlersExprNode().get(com.taobao.android.dinamicx.widget.DXRecyclerLayout.DXRECYCLERLAYOUT_ONREPEATEXPOSE) != null) goto L_0x0088;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onRenderView(android.content.Context r7, android.view.View r8) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.dinamicx.widget.o.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "ede516ab"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            r4[r0] = r7
            r7 = 2
            r4[r7] = r8
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0018:
            super.onRenderView(r7, r8)
            boolean r7 = r8 instanceof com.taobao.android.dinamicx.view.DXNativeRecyclerView
            if (r7 == 0) goto L_0x00b9
            boolean r7 = r6.isV4Node()
            r2 = 7221816040243224000(0x64390b6cffea5dc0, double:6.194298875674411E174)
            r4 = 6278152710403332930(0x57207aa0853f1b42, double:4.953812614132487E111)
            if (r7 == 0) goto L_0x0065
            tb.sl6 r7 = r6.getDxv4Properties()
            com.taobao.android.dinamicx.model.DXReadWriteLongSparseArray r7 = r7.h()
            if (r7 == 0) goto L_0x0049
            tb.sl6 r7 = r6.getDxv4Properties()
            com.taobao.android.dinamicx.model.DXReadWriteLongSparseArray r7 = r7.h()
            java.lang.Object r7 = r7.get(r4)
            if (r7 == 0) goto L_0x0049
            r7 = 1
            goto L_0x004a
        L_0x0049:
            r7 = 0
        L_0x004a:
            tb.sl6 r4 = r6.getDxv4Properties()
            com.taobao.android.dinamicx.model.DXReadWriteLongSparseArray r4 = r4.h()
            if (r4 == 0) goto L_0x0063
            tb.sl6 r4 = r6.getDxv4Properties()
            com.taobao.android.dinamicx.model.DXReadWriteLongSparseArray r4 = r4.h()
            java.lang.Object r2 = r4.get(r2)
            if (r2 == 0) goto L_0x0063
            goto L_0x0088
        L_0x0063:
            r0 = 0
            goto L_0x0088
        L_0x0065:
            androidx.collection.LongSparseArray r7 = r6.getEventHandlersExprNode()
            if (r7 == 0) goto L_0x0077
            androidx.collection.LongSparseArray r7 = r6.getEventHandlersExprNode()
            java.lang.Object r7 = r7.get(r4)
            if (r7 == 0) goto L_0x0077
            r7 = 1
            goto L_0x0078
        L_0x0077:
            r7 = 0
        L_0x0078:
            androidx.collection.LongSparseArray r4 = r6.getEventHandlersExprNode()
            if (r4 == 0) goto L_0x0063
            androidx.collection.LongSparseArray r4 = r6.getEventHandlersExprNode()
            java.lang.Object r2 = r4.get(r2)
            if (r2 == 0) goto L_0x0063
        L_0x0088:
            boolean r1 = r6.isBlankClickable()
            if (r1 == 0) goto L_0x0099
            r1 = r8
            com.taobao.android.dinamicx.view.DXNativeRecyclerView r1 = (com.taobao.android.dinamicx.view.DXNativeRecyclerView) r1
            com.taobao.android.dinamicx.widget.o$a r2 = new com.taobao.android.dinamicx.widget.o$a
            r2.<init>()
            r1.setOnTapListener(r2)
        L_0x0099:
            if (r7 == 0) goto L_0x00ac
            r7 = r8
            com.taobao.android.dinamicx.view.DXNativeRecyclerView r7 = (com.taobao.android.dinamicx.view.DXNativeRecyclerView) r7
            com.alibaba.fastjson.JSONObject r1 = r6.exposeConfig
            boolean r2 = r6.reinitExpose
            java.util.ArrayList<com.taobao.android.dinamicx.widget.DXWidgetNode> r3 = r6.itemWidgetNodes
            com.taobao.android.dinamicx.widget.o$b r4 = new com.taobao.android.dinamicx.widget.o$b
            r4.<init>(r0)
            r7.initExposeHelper(r1, r2, r3, r4)
        L_0x00ac:
            com.taobao.android.dinamicx.widget.o$c r7 = new com.taobao.android.dinamicx.widget.o$c
            r7.<init>()
            r8.post(r7)
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            r6.initVideoPlayControl(r8)
        L_0x00b9:
            int r7 = r6.getChildrenCount()
            if (r7 <= 0) goto L_0x00d0
            com.taobao.android.dinamicx.DXRuntimeContext r7 = r6.getDXRuntimeContext()
            com.taobao.android.dinamicx.widget.DXWidgetNode r7 = r7.W()
            if (r7 != 0) goto L_0x00ca
            return
        L_0x00ca:
            r7.removeAllChild()
            r6.removeAllChild()
        L_0x00d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.o.onRenderView(android.content.Context, android.view.View):void");
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == -3765027987112450965L) {
            if (i == 0) {
                z = false;
            }
            this.showIndicator = z;
        } else if (j == -8352681166307095225L) {
            if (i == 0) {
                z = false;
            }
            this.scrollEnabled = z;
        } else if (j == DXSCROLLLAYOUTBASE_ENABLENESTEDPLAYCONTROL) {
            if (i == 0) {
                z = false;
            }
            this.enableNestedPlayControl = z;
        } else if (j == DXSCROLLLAYOUTBASE_BLANKCLICKABLE_ANDROID) {
            if (i == 0) {
                z = false;
            }
            this.blankClickable = z;
        } else if (j == DXSCROLLLAYOUTBASE_REINITEXPOSE_ANDROID) {
            if (i == 0) {
                z = false;
            }
            this.reinitExpose = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (j == -7801350391660369312L) {
            this.videoControlConfig = obj;
        } else {
            super.onSetObjAttribute(j, obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 7196296497982840181L) {
            this.indicatorId = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public void onShouldStop(cxb<?, exb> cxbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c812a17e", new Object[]{this, cxbVar, str});
        }
    }

    public DXWidgetNode queryIndicatorNodeByUserId(String str) {
        DXWidgetNode parentWidget;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("a788e96", new Object[]{this, str});
        }
        if (str == null || (parentWidget = getParentWidget()) == null) {
            return null;
        }
        DXWidgetNode dXWidgetNode = null;
        int i2 = -1;
        int i3 = -1;
        for (DXWidgetNode dXWidgetNode2 : parentWidget.getChildren()) {
            if (dXWidgetNode2 == this) {
                i2 = i;
            } else if (str.equals(dXWidgetNode2.getUserId())) {
                i3 = i;
                dXWidgetNode = dXWidgetNode2;
            }
            if (!(i2 == -1 || i3 == -1)) {
                return dXWidgetNode;
            }
            i++;
        }
        return null;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public DXWidgetNode queryWTByAutoId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("974aed15", new Object[]{this, new Integer(i)});
        }
        DXWidgetNode queryWTByAutoId = super.queryWTByAutoId(i);
        if (queryWTByAutoId == null) {
            ArrayList<DXWidgetNode> arrayList = this.itemWidgetNodes;
            if (arrayList == null) {
                return null;
            }
            Iterator<DXWidgetNode> it = arrayList.iterator();
            while (it.hasNext() && (queryWTByAutoId = it.next().queryWTByAutoId(i)) == null) {
            }
        }
        return queryWTByAutoId;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public DXWidgetNode queryWTByUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("45e63272", new Object[]{this, str});
        }
        DXWidgetNode queryWTByUserId = super.queryWTByUserId(str);
        if (queryWTByUserId == null) {
            ArrayList<DXWidgetNode> arrayList = this.itemWidgetNodes;
            if (arrayList == null) {
                return null;
            }
            Iterator<DXWidgetNode> it = arrayList.iterator();
            while (it.hasNext() && (queryWTByUserId = it.next().queryWTByUserId(str)) == null) {
            }
        }
        return queryWTByUserId;
    }

    public boolean removeAppearWidget(DXWidgetNode dXWidgetNode) {
        List<DXWidgetNode> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5592cf", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if (dXWidgetNode == null || (list = this.appearWidgets) == null) {
            return false;
        }
        return list.remove(dXWidgetNode);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void sendBroadcastEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6df6ca", new Object[]{this, dXEvent});
        } else if (dXEvent != null) {
            if (5288671110273408574L == dXEvent.getEventId()) {
                postEvent(dXEvent);
                List<DXWidgetNode> list = this.appearWidgets;
                if (!(list == null || list.size() == 0)) {
                    for (DXWidgetNode dXWidgetNode : this.appearWidgets) {
                        DXViewEvent dXViewEvent = new DXViewEvent(-8975334121118753601L);
                        dXViewEvent.setItemIndex(dXWidgetNode.getDXRuntimeContext().P());
                        dXWidgetNode.sendBroadcastEvent(dXViewEvent);
                    }
                }
            } else if (5388973340095122049L == dXEvent.getEventId()) {
                postEvent(dXEvent);
                List<DXWidgetNode> list2 = this.appearWidgets;
                if (!(list2 == null || list2.size() == 0)) {
                    for (DXWidgetNode dXWidgetNode2 : this.appearWidgets) {
                        DXViewEvent dXViewEvent2 = new DXViewEvent(-5201408949358043646L);
                        dXViewEvent2.setItemIndex(dXWidgetNode2.getDXRuntimeContext().P());
                        dXWidgetNode2.sendBroadcastEvent(dXViewEvent2);
                    }
                }
            } else {
                postEvent(dXEvent);
                List<DXWidgetNode> list3 = this.appearWidgets;
                if (list3 != null && list3.size() > 0) {
                    for (DXWidgetNode dXWidgetNode3 : this.appearWidgets) {
                        dXWidgetNode3.sendBroadcastEvent(dXEvent);
                    }
                }
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void setBackground(View view) {
        wq2 cLipRadiusHandler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce1cfbb", new Object[]{this, view});
            return;
        }
        if (hasCornerRadius()) {
            DXNativeRecyclerView dXNativeRecyclerView = (DXNativeRecyclerView) view;
            wq2 wq2Var = new wq2();
            if (getCornerRadius() > 0) {
                wq2Var.j(view, getCornerRadius());
            } else {
                wq2Var.k(view, getCornerRadiusLeftTop(), getCornerRadiusRightTop(), getCornerRadiusLeftBottom(), getCornerRadiusRightBottom());
            }
            dXNativeRecyclerView.setClipRadiusHandler(wq2Var);
        } else if ((view instanceof DXNativeRecyclerView) && (cLipRadiusHandler = ((DXNativeRecyclerView) view).getCLipRadiusHandler()) != null) {
            cLipRadiusHandler.j(view, 0.0f);
        }
        super.setBackground(view);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void setMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1fa015", new Object[]{this, new Long(j), jSONObject});
        } else if (j == 6442732320864020959L) {
            this.exposeConfig = jSONObject;
        } else {
            super.setMapAttribute(j, jSONObject);
        }
    }

    public void stopVideoPlayControl() {
        hm6 hm6Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6dacb7", new Object[]{this});
            return;
        }
        View D = getDXRuntimeContext().D();
        if ((D instanceof DXNativeRecyclerView) && (hm6Var = this.videoControlManager) != null) {
            hm6Var.a((RecyclerView) D);
        }
    }

    @Override // tb.l4c
    public void triggerExposure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b318fbe6", new Object[]{this});
            return;
        }
        View D = getDXRuntimeContext().D();
        if (D instanceof DXNativeRecyclerView) {
            ((DXNativeRecyclerView) D).triggerExpose();
        }
    }

    public void triggerVideoPlayControl() {
        hm6 hm6Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e421036d", new Object[]{this});
            return;
        }
        View D = getDXRuntimeContext().D();
        if ((D instanceof DXNativeRecyclerView) && (hm6Var = this.videoControlManager) != null) {
            hm6Var.l((RecyclerView) D);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void updateRefreshType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22ac2b0", new Object[]{this, new Integer(i)});
        } else if (!zg5.E2() || !getDXRuntimeContext().b0() || i != 0) {
            DXRuntimeContext dXRuntimeContext = this.dXRuntimeContext;
            if (dXRuntimeContext != null) {
                dXRuntimeContext.o0(i);
            }
            ArrayList<DXWidgetNode> arrayList = this.itemWidgetNodes;
            if (arrayList != null) {
                Iterator<DXWidgetNode> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().updateRefreshType(i);
                }
            }
        } else {
            jb6.n(new d(i));
        }
    }
}
