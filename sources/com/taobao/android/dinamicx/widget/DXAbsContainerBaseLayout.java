package com.taobao.android.dinamicx.widget;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXViewEvent;
import com.taobao.android.dinamicx.widget.recycler.WaterfallLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.bi6;
import tb.ic5;
import tb.jb6;
import tb.la6;
import tb.oz8;
import tb.s96;
import tb.t2o;
import tb.xv5;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class DXAbsContainerBaseLayout extends k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXABSCONTAINERBASELAYOUT_POSTEVENTSAMPLING = 6334795214712177940L;
    public static final long DXDXABSCONTAINERBASELAYOUT_DATASOURCE = -5948810534719014123L;
    public static final long DXDXABSCONTAINERBASELAYOUT_ONCREATE = 5288680013941347641L;
    public static final long DXDXABSCONTAINERBASELAYOUT_ONSCROLL = 5288751146867425108L;
    public static final long DXDXABSCONTAINERBASELAYOUT_ONSCROLLBEGIN = 9144262755562405950L;
    public static final long DXDXABSCONTAINERBASELAYOUT_ONSCROLLEND = 2691126191158604142L;
    public static final int DXRECYCLERLAYOUT_ISOPENLOADMORE_TRUE = 1;
    public static final int DXRECYCLERLAYOUT_ISOPENPULLTOREFRESH_TRUE = 1;
    public static final long DXRECYCLERLAYOUT_ONENDREACHED = -2277119638481222228L;
    public static final long DXRECYCLERLAYOUT_ORIENTATION = -7199229155167727177L;
    public static final int LOAD_MORE_EMPTY_INT = 6;
    public static final int LOAD_MORE_END = 4;
    public static final int LOAD_MORE_FAIL = 3;
    public static final int LOAD_MORE_IDLE = 1;
    public static final int LOAD_MORE_LOADING = 2;
    public static final int LOAD_MORE_NO_DATA = 5;
    public static final String TAG = "DXAbsContainerBaseLayout";

    /* renamed from: a  reason: collision with root package name */
    public List<Object> f7360a;
    public WaterfallLayout b;
    public ArrayList<DXWidgetNode> c;
    public ArrayList<DXWidgetNode> d;
    public JSONArray e;
    public List<WeakReference<DXWidgetNode>> f;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface LoadMoreStatus {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7361a;

        public a(int i) {
            this.f7361a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DXRuntimeContext dXRuntimeContext = DXAbsContainerBaseLayout.this.dXRuntimeContext;
            if (dXRuntimeContext != null) {
                dXRuntimeContext.o0(this.f7361a);
            }
            if (DXAbsContainerBaseLayout.this.y() != null) {
                for (DXWidgetNode dXWidgetNode : DXAbsContainerBaseLayout.this.y()) {
                    dXWidgetNode.updateRefreshType(this.f7361a);
                }
            }
        }
    }

    static {
        t2o.a(444597251);
        t2o.a(444597682);
    }

    public DXAbsContainerBaseLayout() {
        this.markContainer = true;
    }

    public static /* synthetic */ Object ipc$super(DXAbsContainerBaseLayout dXAbsContainerBaseLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1756697323:
                return super.queryWTByAutoId(((Number) objArr[0]).intValue());
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -428783541:
                super.onSetUserDefinedListAttribute(((Number) objArr[0]).longValue(), (List) objArr[1]);
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 545780165:
                return new Integer(super.getMarginLeft());
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 769574994:
                return new Integer(super.getMarginRight());
            case 1172714098:
                return super.queryWTByUserId((String) objArr[0]);
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2091670201:
                return super.exportMethods();
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXAbsContainerBaseLayout");
        }
    }

    public void A(List<DXWidgetNode> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eed48870", new Object[]{this, list});
        } else {
            this.c = (ArrayList) list;
        }
    }

    public void B(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af1f8a9d", new Object[]{this, new Integer(i), str, str2, str3});
        } else {
            ic5.s(getDXRuntimeContext().c(), getDXRuntimeContext().p(), "DX_RECYCLER", "DX_RECYCLER_ERROR", i, str);
        }
    }

    public void addAppearWidget(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d17e4e", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode != null) {
            if (this.f == null) {
                this.f = new ArrayList();
            }
            this.f.add(new WeakReference<>(dXWidgetNode));
            if (dXWidgetNode instanceof bi6) {
                ((bi6) dXWidgetNode).Q(true);
            }
        }
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
            if (this.dXRuntimeContext != dXRuntimeContext) {
                DXRuntimeContext b = dXRuntimeContext.b(this);
                this.dXRuntimeContext = b;
                if (z) {
                    b.q0(obj);
                    this.dXRuntimeContext.r0(i);
                }
            }
            if (y() != null) {
                for (DXWidgetNode dXWidgetNode : y()) {
                    dXWidgetNode.bindRuntimeContext(dXRuntimeContext, z);
                }
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new j();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public JSONArray exportMethods() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7cac5ab9", new Object[]{this});
        }
        if (this.e == null) {
            this.e = new JSONArray() { // from class: com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout.2
            };
            this.e.addAll(super.exportMethods());
        }
        return this.e;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)});
        }
        return super.getDefaultValueForStringAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getMarginLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2087f1c5", new Object[]{this})).intValue();
        }
        return super.getMarginLeft();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getMarginRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ddec852", new Object[]{this})).intValue();
        }
        return super.getMarginRight();
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
            return;
        }
        if (this.d == null) {
            ArrayList<DXWidgetNode> arrayList = new ArrayList<>();
            this.d = arrayList;
            arrayList.addAll(getChildren());
        }
        if (this.f7360a == null) {
            la6.b(getUserId() + " datasource 是空重新构建一个");
            this.f7360a = new JSONArray();
        }
        Iterator<DXWidgetNode> it = this.d.iterator();
        while (it.hasNext()) {
            t(it.next());
        }
        List<Object> list = this.f7360a;
        A(w(list, this.d, 0, list.size(), null));
        removeAllChild();
        if (zg5.L4()) {
            for (DXWidgetNode dXWidgetNode : y()) {
                addChild(dXWidgetNode, false);
            }
        }
        setDisableFlatten(true);
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode instanceof DXAbsContainerBaseLayout) {
            super.onClone(dXWidgetNode, z);
            DXAbsContainerBaseLayout dXAbsContainerBaseLayout = (DXAbsContainerBaseLayout) dXWidgetNode;
            this.f7360a = dXAbsContainerBaseLayout.f7360a;
            A(dXAbsContainerBaseLayout.y());
            this.f = dXAbsContainerBaseLayout.f;
            this.d = dXAbsContainerBaseLayout.d;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        return super.onEvent(dXEvent);
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        removeAllChild();
        super.onMeasure(i, i2);
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j != DXABSCONTAINERBASELAYOUT_POSTEVENTSAMPLING) {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (j != -5948810534719014123L) {
            super.onSetListAttribute(j, jSONArray);
        } else if (zg5.p3()) {
            List<Object> list = this.f7360a;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            this.f7360a = jSONArray;
            this.propertyInitFlag |= 2;
            if (jSONArray != null) {
                i2 = jSONArray.size();
            }
            if (i2 != i) {
                this.dataSizeChange = true;
            }
        } else {
            this.f7360a = jSONArray;
            this.propertyInitFlag |= 2;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetUserDefinedListAttribute(long j, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e671484b", new Object[]{this, new Long(j), list});
        } else if (-5948810534719014123L == j) {
            this.f7360a = list;
            this.propertyInitFlag |= 2;
        } else {
            super.onSetUserDefinedListAttribute(j, list);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public DXWidgetNode queryWTByAutoId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("974aed15", new Object[]{this, new Integer(i)});
        }
        DXWidgetNode queryWTByAutoId = super.queryWTByAutoId(i);
        if (queryWTByAutoId == null) {
            if (y() == null) {
                return null;
            }
            Iterator<DXWidgetNode> it = y().iterator();
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
            if (y() == null) {
                return null;
            }
            for (DXWidgetNode dXWidgetNode : y()) {
                DXWidgetNode queryWTByUserId2 = dXWidgetNode.queryWTByUserId(str);
                if (queryWTByUserId2 != null) {
                    return queryWTByUserId2;
                }
            }
        }
        return queryWTByUserId;
    }

    public boolean removeAppearWidget(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5592cf", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if (dXWidgetNode != null) {
            try {
                if (this.f != null) {
                    if (dXWidgetNode instanceof bi6) {
                        ((bi6) dXWidgetNode).Q(false);
                    }
                    Iterator<WeakReference<DXWidgetNode>> it = this.f.iterator();
                    if (it == null) {
                        return false;
                    }
                    while (it.hasNext()) {
                        WeakReference<DXWidgetNode> next = it.next();
                        if (!(next == null || next.get() == null)) {
                            if (next.get() == dXWidgetNode) {
                                it.remove();
                                return true;
                            }
                        }
                        it.remove();
                    }
                    return false;
                }
            } catch (Exception e) {
                xv5.b(e);
            }
        }
        return false;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void sendBroadcastEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6df6ca", new Object[]{this, dXEvent});
        } else if (dXEvent != null) {
            if (5288671110273408574L == dXEvent.getEventId()) {
                postEvent(dXEvent);
                u(new DXViewEvent(-8975334121118753601L));
            } else if (5388973340095122049L == dXEvent.getEventId()) {
                postEvent(dXEvent);
                u(new DXViewEvent(-5201408949358043646L));
            } else {
                postEvent(dXEvent);
                u(dXEvent);
            }
        }
    }

    public void t(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61ca6a16", new Object[]{this, dXWidgetNode});
            return;
        }
        if (dXWidgetNode.getSourceWidget() == null) {
            dXWidgetNode.setSourceWidget(dXWidgetNode);
        }
        List<DXWidgetNode> children = dXWidgetNode.getChildren();
        if (!(children == null || children.size() == 0)) {
            for (DXWidgetNode dXWidgetNode2 : children) {
                t(dXWidgetNode2);
            }
        }
    }

    public final void u(DXEvent dXEvent) {
        Iterator<WeakReference<DXWidgetNode>> it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8273f223", new Object[]{this, dXEvent});
            return;
        }
        try {
            List<WeakReference<DXWidgetNode>> list = this.f;
            if (list != null && list.size() != 0 && (it = this.f.iterator()) != null) {
                while (it.hasNext()) {
                    WeakReference<DXWidgetNode> next = it.next();
                    DXWidgetNode dXWidgetNode = next.get();
                    if (next.get() == null) {
                        it.remove();
                    } else if (dXEvent instanceof DXViewEvent) {
                        ((DXViewEvent) dXEvent).setItemIndex(dXWidgetNode.getDXRuntimeContext().P());
                    } else {
                        dXWidgetNode.sendBroadcastEvent(dXEvent);
                    }
                }
            }
        } catch (Exception e) {
            xv5.b(e);
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
            if (y() != null) {
                for (DXWidgetNode dXWidgetNode : y()) {
                    dXWidgetNode.updateRefreshType(i);
                }
            }
        } else {
            jb6.n(new a(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.bi6 v(com.taobao.android.dinamicx.widget.DXWidgetNode r6, java.lang.Object r7, int r8, tb.oz8 r9) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout.v(com.taobao.android.dinamicx.widget.DXWidgetNode, java.lang.Object, int, tb.oz8):tb.bi6");
    }

    public ArrayList<DXWidgetNode> w(List<Object> list, List<DXWidgetNode> list2, int i, int i2, oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("396c3eb9", new Object[]{this, list, list2, new Integer(i), new Integer(i2), oz8Var});
        }
        ArrayList<DXWidgetNode> arrayList = new ArrayList<>();
        if (list2 != null && !list2.isEmpty() && list != null && !list.isEmpty()) {
            while (i < i2) {
                Object obj = list.get(i);
                DXWidgetNode dXWidgetNode = null;
                for (int i3 = 0; i3 < list2.size() && (dXWidgetNode = v(list2.get(i3), obj, i, oz8Var)) == null; i3++) {
                }
                if (dXWidgetNode == null) {
                    dXWidgetNode = new s96();
                    dXWidgetNode.setDXRuntimeContext(getDXRuntimeContext().b(dXWidgetNode));
                    dXWidgetNode.setVisibility(2);
                }
                arrayList.add(dXWidgetNode);
                i++;
            }
        }
        return arrayList;
    }

    public List<Object> x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb16ea5", new Object[]{this});
        }
        return this.f7360a;
    }

    public List<DXWidgetNode> y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("886500dc", new Object[]{this});
        }
        return this.c;
    }

    public void z(DXRuntimeContext dXRuntimeContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f6b8ba4", new Object[]{this, dXRuntimeContext, new Integer(i)});
        }
    }
}
