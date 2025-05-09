package com.taobao.android.dinamic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.bn7;
import tb.en7;
import tb.jn7;
import tb.qm7;
import tb.t2o;
import tb.vn7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DLoopLinearLayout extends DLinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DLoopLinearLayout";
    private int viewTypeFlag = 0;
    private Map<Integer, b> templateViews = new LinkedHashMap();
    public final a recycledPool = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<ArrayList<View>> f7276a = new SparseArray<>();
        public final SparseIntArray b = new SparseIntArray();

        static {
            t2o.a(444596418);
        }

        public View a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("848e8e32", new Object[]{this, new Integer(i)});
            }
            ArrayList<View> arrayList = this.f7276a.get(i);
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            int size = arrayList.size() - 1;
            View view = arrayList.get(size);
            arrayList.remove(size);
            return view;
        }

        public final ArrayList<View> b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("c332b9ba", new Object[]{this, new Integer(i)});
            }
            ArrayList<View> arrayList = this.f7276a.get(i);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f7276a.put(i, arrayList);
                if (this.b.indexOfKey(i) < 0) {
                    this.b.put(i, 10);
                }
            }
            return arrayList;
        }

        public void c(int i, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5dffc1b", new Object[]{this, new Integer(i), view});
                return;
            }
            ArrayList<View> b = b(i);
            if (this.b.get(i) > b.size()) {
                b.add(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f7277a;
        public View b;
        public String c;
        public String d;

        static {
            t2o.a(444596419);
        }

        public b(DLoopLinearLayout dLoopLinearLayout) {
        }
    }

    static {
        t2o.a(444596417);
    }

    public DLoopLinearLayout(Context context) {
        super(context);
    }

    private void addViewInfo(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ab2d1b7", new Object[]{this, view});
            return;
        }
        for (Map.Entry<Integer, b> entry : this.templateViews.entrySet()) {
            if (view == entry.getValue().b) {
                return;
            }
        }
        en7 c = vn7.c(view);
        b bVar = new b(this);
        bVar.b = view;
        bVar.f7277a = this.viewTypeFlag;
        bVar.d = c.f18692a;
        if (((HashMap) c.b).containsKey("dFilter")) {
            bVar.c = String.valueOf(((HashMap) c.b).get("dFilter"));
        } else {
            bVar.c = c.c.get("dFilter");
        }
        this.templateViews.put(Integer.valueOf(bVar.f7277a), bVar);
        view.setTag(jn7.VIEW_TYPE_KEY, Integer.valueOf(bVar.f7277a));
        this.viewTypeFlag++;
    }

    private Object getBindData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3036ff52", new Object[]{this, obj});
        }
        if (!(obj instanceof String)) {
            return obj;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("value", obj);
        return jSONObject;
    }

    private View getCacheView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3c4066ed", new Object[]{this, new Integer(i)});
        }
        return this.recycledPool.a(i);
    }

    public static /* synthetic */ Object ipc$super(DLoopLinearLayout dLoopLinearLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -579605410:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 64333381:
                return super.getChildAt(((Number) objArr[0]).intValue());
            case 1273305472:
                super.removeViewAt(((Number) objArr[0]).intValue());
                return null;
            case 1502719299:
                return new Integer(super.getChildCount());
            case 1992612095:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/view/DLoopLinearLayout");
        }
    }

    private boolean isViewGroup(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("465d6a1f", new Object[]{this, view})).booleanValue();
        }
        if (view instanceof DLoopLinearLayout) {
            return false;
        }
        if ((view instanceof DLinearLayout) || (view instanceof DFrameLayout)) {
            return true;
        }
        return false;
    }

    private void recursiveViewTree(View view, ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1972c54", new Object[]{this, view, arrayList});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            en7 en7Var = (en7) childAt.getTag(jn7.PROPERTY_KEY);
            if (en7Var != null && (!en7Var.c.isEmpty() || !en7Var.d.isEmpty())) {
                arrayList.remove(childAt);
            }
            if (isViewGroup(childAt)) {
                recursiveViewTree(childAt, arrayList);
            }
        }
    }

    private void recyleView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4827d8d5", new Object[]{this, new Integer(i)});
        } else if (i < super.getChildCount()) {
            View childAt = super.getChildAt(i);
            super.removeViewAt(i);
            Integer num = (Integer) childAt.getTag(jn7.VIEW_TYPE_KEY);
            if (num != null) {
                this.recycledPool.c(num.intValue(), childAt);
            }
        }
    }

    private void removeBindList(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("930e32ec", new Object[]{this, view});
            return;
        }
        ArrayList<View> arrayList = (ArrayList) getTag(jn7.TAG_DINAMIC_BIND_DATA_LIST);
        en7 en7Var = (en7) view.getTag(jn7.PROPERTY_KEY);
        if (!en7Var.c.isEmpty() || !en7Var.d.isEmpty()) {
            arrayList.remove(view);
        }
        if (isViewGroup(view)) {
            recursiveViewTree(view, arrayList);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a332ea78", new Object[]{this, view, layoutParams});
            return;
        }
        view.setLayoutParams(layoutParams);
        addViewInfo(view);
        removeBindList(view);
    }

    public void bindListData(bn7 bn7Var, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4a8b30", new Object[]{this, bn7Var, list});
        } else {
            bindChildView(bn7Var, list);
        }
    }

    public Map<Integer, b> cloneTemplateViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c1908a73", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.templateViews);
        return linkedHashMap;
    }

    public void setTemplateViews(Map<Integer, b> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9898f60c", new Object[]{this, map});
        } else {
            this.templateViews = map;
        }
    }

    public int getItemViewType(bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4790215", new Object[]{this, bn7Var})).intValue();
        }
        for (Map.Entry<Integer, b> entry : this.templateViews.entrySet()) {
            b value = entry.getValue();
            String str = value.c;
            if (str == null) {
                if (this.templateViews.size() == 1) {
                    return value.f7277a;
                }
            } else if ("true".equals(str)) {
                return value.f7277a;
            } else {
                Object a2 = qm7.a(value.c, value.d, bn7Var);
                if (a2 != null && (((a2 instanceof Boolean) && ((Boolean) a2).booleanValue()) || ((a2 instanceof String) && "true".equals(a2.toString())))) {
                    return value.f7277a;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void bindChildView(tb.bn7 r10, java.util.List r11) {
        /*
            r9 = this;
            r0 = 0
            r1 = -1
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.dinamic.view.DLoopLinearLayout.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0019
            java.lang.String r1 = "f9b4e10f"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r9
            r4[r2] = r10
            r10 = 2
            r4[r10] = r11
            r3.ipc$dispatch(r1, r4)
            return
        L_0x0019:
            java.util.Map<java.lang.Integer, com.taobao.android.dinamic.view.DLoopLinearLayout$b> r3 = r9.templateViews
            int r3 = r3.size()
            if (r3 == 0) goto L_0x00e7
            if (r11 == 0) goto L_0x00e7
            int r3 = r11.size()
            if (r3 != 0) goto L_0x002b
            goto L_0x00e7
        L_0x002b:
            int r3 = r9.getChildCount()
            int r4 = r11.size()
            if (r3 <= r4) goto L_0x0045
            int r3 = r9.getChildCount()
            int r3 = r3 - r2
        L_0x003a:
            int r4 = r11.size()
            if (r3 < r4) goto L_0x0045
            r9.recyleView(r3)
            int r3 = r3 + r1
            goto L_0x003a
        L_0x0045:
            java.lang.String r3 = r10.c()
            tb.q65 r3 = tb.q65.q(r3)
            java.lang.Object r4 = r10.a()
        L_0x0051:
            int r5 = r11.size()
            if (r0 >= r5) goto L_0x00e3
            java.lang.Object r5 = r11.get(r0)
            java.lang.Object r5 = r9.getBindData(r5)
            r10.f(r5)
            int r5 = r9.getItemViewType(r10)
            if (r5 != r1) goto L_0x0078
            com.taobao.android.dinamic.view.CompatibleView r5 = new com.taobao.android.dinamic.view.CompatibleView
            android.content.Context r6 = r9.getContext()
            java.lang.String r7 = "no view match data"
            r5.<init>(r6, r7)
            super.addView(r5, r0)
            goto L_0x00e0
        L_0x0078:
            int r6 = r9.getChildCount()
            if (r0 >= r6) goto L_0x0096
            android.view.View r6 = r9.getChildAt(r0)
            int r7 = tb.jn7.VIEW_TYPE_KEY
            java.lang.Object r7 = r6.getTag(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x0093
            int r7 = r7.intValue()
            if (r5 != r7) goto L_0x0093
            goto L_0x0097
        L_0x0093:
            r9.recyleView(r0)
        L_0x0096:
            r6 = 0
        L_0x0097:
            if (r6 != 0) goto L_0x00cf
            android.view.View r6 = r9.getCacheView(r5)
            if (r6 != 0) goto L_0x00c8
            java.util.Map<java.lang.Integer, com.taobao.android.dinamic.view.DLoopLinearLayout$b> r6 = r9.templateViews
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r6.get(r7)
            com.taobao.android.dinamic.view.DLoopLinearLayout$b r6 = (com.taobao.android.dinamic.view.DLoopLinearLayout.b) r6
            android.view.View r6 = r6.b
            android.content.Context r7 = r9.getContext()
            tb.tfw r6 = r3.j(r6, r7, r10)
            android.view.View r7 = r6.d()
            int r8 = tb.jn7.TAG_ROOT_VIEW_RESULT
            r7.setTag(r8, r6)
            int r6 = tb.jn7.VIEW_TYPE_KEY
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7.setTag(r6, r5)
            r6 = r7
        L_0x00c8:
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            super.addView(r6, r0, r5)
        L_0x00cf:
            int r5 = tb.jn7.TAG_ROOT_VIEW_RESULT
            java.lang.Object r5 = r6.getTag(r5)
            tb.tfw r5 = (tb.tfw) r5
            if (r5 == 0) goto L_0x00e0
            java.util.ArrayList r5 = r5.a()
            r3.g(r5, r10)
        L_0x00e0:
            int r0 = r0 + r2
            goto L_0x0051
        L_0x00e3:
            r10.f(r4)
            return
        L_0x00e7:
            int r10 = r9.getChildCount()
            int r10 = r10 - r2
        L_0x00ec:
            if (r10 < 0) goto L_0x00f3
            r9.recyleView(r10)
            int r10 = r10 + r1
            goto L_0x00ec
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamic.view.DLoopLinearLayout.bindChildView(tb.bn7, java.util.List):void");
    }

    public DLoopLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DLoopLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
