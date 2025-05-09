package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xi2 extends xql {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CHILDREN = "children";

    static {
        t2o.a(912261654);
    }

    public xi2(JSONObject jSONObject, ob4 ob4Var) {
        super(jSONObject, ob4Var);
        n(jSONObject, ob4Var);
    }

    public static /* synthetic */ Object ipc$super(xi2 xi2Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1922236528) {
            return super.f((oc4) objArr[0]);
        }
        if (hashCode == 1365958442) {
            return super.d((oc4) objArr[0]);
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/data/layout/BottomBarLayoutNode");
    }

    @Override // tb.z4k
    public View d(oc4 oc4Var) {
        View componentView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("516adf2a", new Object[]{this, oc4Var});
        }
        if (oc4Var == null) {
            return null;
        }
        List m = m();
        if (m == null) {
            return super.d(oc4Var);
        }
        View view = this.f;
        if (view == null || !(view instanceof LinearLayout)) {
            LinearLayout linearLayout = new LinearLayout(oc4Var.e());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            this.f = linearLayout;
        }
        LinearLayout linearLayout2 = (LinearLayout) this.f;
        List<View> s = s(linearLayout2);
        int size = m.size();
        for (int i = 0; i < size; i++) {
            oa4 f = ((z4k) m.get(i)).f(oc4Var);
            if (!(f == null || (componentView = f.getComponentView(o(s, f))) == null)) {
                ygw.a(componentView);
                componentView.setTag(R.id.tt_detail_bottom_bar_layout_node_child_id, Integer.valueOf(f.hashCode()));
                ViewGroup.LayoutParams layoutParams = componentView.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(-1, -2);
                }
                linearLayout2.addView(componentView, layoutParams);
            }
        }
        return this.f;
    }

    @Override // tb.z4k
    public synchronized oa4 f(oc4 oc4Var) {
        int i = 0;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (oa4) ipChange.ipc$dispatch("8d6cff90", new Object[]{this, oc4Var});
            }
            List m = m();
            if (m != null) {
                i = m.size();
            }
            for (int i2 = i - 1; i2 > -1; i2--) {
                oa4 f = ((z4k) m.get(i2)).f(oc4Var);
                if (f != null) {
                    return f;
                }
            }
            return super.f(oc4Var);
        }
    }

    public final void n(JSONObject jSONObject, ob4 ob4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a5d2b5", new Object[]{this, jSONObject, ob4Var});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("children");
        if (jSONArray != null) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    j(new z4k(jSONObject2, ob4Var));
                }
            }
        }
    }

    public final View o(List<View> list, oa4 oa4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fbb30a5a", new Object[]{this, list, oa4Var});
        }
        for (View view : list) {
            Object tag = view.getTag(R.id.tt_detail_bottom_bar_layout_node_child_id);
            int hashCode = oa4Var.hashCode();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == hashCode) {
                return view;
            }
        }
        return null;
    }

    public void p() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("708c68c8", new Object[]{this});
            return;
        }
        List m = m();
        if (m != null) {
            i = m.size();
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            oa4 c = ((z4k) m.get(i2)).c();
            if (c != null) {
                c.create();
            }
        }
        oa4 c2 = c();
        if (c2 != null) {
            c2.create();
        }
    }

    public void q() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7102a16", new Object[]{this});
            return;
        }
        List m = m();
        if (m != null) {
            i = m.size();
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            oa4 c = ((z4k) m.get(i2)).c();
            if (c != null) {
                c.didAppear();
            }
        }
        oa4 c2 = c();
        if (c2 != null) {
            c2.didAppear();
        }
    }

    public void r() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65eae3d3", new Object[]{this});
            return;
        }
        List m = m();
        if (m != null) {
            i = m.size();
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            oa4 c = ((z4k) m.get(i2)).c();
            if (c != null) {
                c.willAppear();
            }
        }
        oa4 c2 = c();
        if (c2 != null) {
            c2.willAppear();
        }
    }

    public final List<View> s(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a01d2f30", new Object[]{this, viewGroup});
        }
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            arrayList.add(viewGroup.getChildAt(i));
        }
        viewGroup.removeAllViews();
        return arrayList;
    }
}
