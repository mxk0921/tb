package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.pub.titlebar.action.PubAddIconAction;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import tb.qx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class lxt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final lxt INSTANCE = new lxt();

    static {
        t2o.a(835715212);
    }

    public static final /* synthetic */ JSONObject a(lxt lxtVar, View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1e6388d9", new Object[]{lxtVar, view, view2});
        }
        return lxtVar.c(view, view2);
    }

    public static final /* synthetic */ String b(lxt lxtVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("434d6781", new Object[]{lxtVar, str});
        }
        return lxtVar.d(str);
    }

    @JvmStatic
    public static final void e(ViewGroup viewGroup, View view, qx qxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c90832e8", new Object[]{viewGroup, view, qxVar});
            return;
        }
        ckf.g(viewGroup, "titleView");
        ckf.g(qxVar, "pubTitleBarPosition");
        Context context = viewGroup.getContext();
        if (context != null) {
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new a(viewGroup, qxVar, context, view));
        }
    }

    public final String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59a264dc", new Object[]{this, str});
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1076424827:
                    if (str.equals(w2n.TAG)) {
                        return "custom";
                    }
                    break;
                case -227554118:
                    if (str.equals(t2n.TAG)) {
                        return "back";
                    }
                    break;
                case -112219213:
                    if (str.equals(PubAddIconAction.TAG)) {
                        return "add-icon";
                    }
                    break;
                case 683420444:
                    if (str.equals("PubMoreCloseAction")) {
                        return "menu";
                    }
                    break;
                case 1097315781:
                    if (str.equals("PubAppNameAction")) {
                        return "title";
                    }
                    break;
            }
        }
        return "";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f23629a;
        public final /* synthetic */ qx b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ View d;

        public a(ViewGroup viewGroup, qx qxVar, Context context, View view) {
            this.f23629a = viewGroup;
            this.b = qxVar;
            this.c = context;
            this.d = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            View childAt = this.f23629a.getChildAt(0);
            ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup != null) {
                qx.c leftPanel = this.b.getLeftPanel();
                View view = this.d;
                JSONObject a2 = lxt.a(lxt.INSTANCE, viewGroup, view);
                if (a2 != null) {
                    Object obj = a2.get("height");
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    leftPanel.f(num == null ? 0 : num.intValue());
                    Object obj2 = a2.get("width");
                    Integer num2 = obj2 instanceof Integer ? (Integer) obj2 : null;
                    leftPanel.i(num2 == null ? 0 : num2.intValue());
                    Object obj3 = a2.get("x");
                    Integer num3 = obj3 instanceof Integer ? (Integer) obj3 : null;
                    leftPanel.g(num3 == null ? 0 : num3.intValue());
                    Object obj4 = a2.get("y");
                    Integer num4 = obj4 instanceof Integer ? (Integer) obj4 : null;
                    leftPanel.h(num4 == null ? 0 : num4.intValue());
                    leftPanel.b().clear();
                    int childCount = viewGroup.getChildCount();
                    int i = 0;
                    while (i < childCount) {
                        i++;
                        View childAt2 = viewGroup.getChildAt(i);
                        qx.b bVar = new qx.b();
                        lxt lxtVar = lxt.INSTANCE;
                        JSONObject a3 = lxt.a(lxtVar, childAt2, view);
                        if (a3 != null) {
                            Object obj5 = a3.get("height");
                            Integer num5 = obj5 instanceof Integer ? (Integer) obj5 : null;
                            bVar.f(num5 == null ? 0 : num5.intValue());
                            Object obj6 = a3.get("width");
                            Integer num6 = obj6 instanceof Integer ? (Integer) obj6 : null;
                            bVar.j(num6 == null ? 0 : num6.intValue());
                            Object obj7 = a3.get("x");
                            Integer num7 = obj7 instanceof Integer ? (Integer) obj7 : null;
                            bVar.g(num7 == null ? 0 : num7.intValue());
                            Object obj8 = a3.get("y");
                            Integer num8 = obj8 instanceof Integer ? (Integer) obj8 : null;
                            bVar.h(num8 == null ? 0 : num8.intValue());
                            Object tag = childAt2.getTag();
                            bVar.i(lxt.b(lxtVar, tag instanceof String ? (String) tag : null));
                            leftPanel.b().add(bVar);
                        }
                    }
                    ViewGroup viewGroup2 = this.f23629a;
                    View childAt3 = viewGroup2.getChildAt(viewGroup2.getChildCount() - 1);
                    ViewGroup viewGroup3 = childAt3 instanceof ViewGroup ? (ViewGroup) childAt3 : null;
                    if (viewGroup3 != null) {
                        qx.c rightPanel = this.b.getRightPanel();
                        View view2 = this.d;
                        JSONObject a4 = lxt.a(lxt.INSTANCE, viewGroup3, view2);
                        if (a4 != null) {
                            Object obj9 = a4.get("height");
                            Integer num9 = obj9 instanceof Integer ? (Integer) obj9 : null;
                            rightPanel.f(num9 == null ? 0 : num9.intValue());
                            Object obj10 = a4.get("width");
                            Integer num10 = obj10 instanceof Integer ? (Integer) obj10 : null;
                            rightPanel.i(num10 == null ? 0 : num10.intValue());
                            Object obj11 = a4.get("x");
                            Integer num11 = obj11 instanceof Integer ? (Integer) obj11 : null;
                            rightPanel.g(num11 == null ? 0 : num11.intValue());
                            Object obj12 = a4.get("y");
                            Integer num12 = obj12 instanceof Integer ? (Integer) obj12 : null;
                            rightPanel.h(num12 == null ? 0 : num12.intValue());
                            rightPanel.b().clear();
                            int childCount2 = viewGroup3.getChildCount();
                            int i2 = 0;
                            while (i2 < childCount2) {
                                i2++;
                                View childAt4 = viewGroup3.getChildAt(i2);
                                qx.b bVar2 = new qx.b();
                                lxt lxtVar2 = lxt.INSTANCE;
                                JSONObject a5 = lxt.a(lxtVar2, childAt4, view2);
                                if (a5 == null) {
                                    viewGroup3 = viewGroup3;
                                } else {
                                    Object obj13 = a5.get("height");
                                    viewGroup3 = viewGroup3;
                                    Integer num13 = obj13 instanceof Integer ? (Integer) obj13 : null;
                                    bVar2.f(num13 == null ? 0 : num13.intValue());
                                    Object obj14 = a5.get("width");
                                    Integer num14 = obj14 instanceof Integer ? (Integer) obj14 : null;
                                    bVar2.j(num14 == null ? 0 : num14.intValue());
                                    Object obj15 = a5.get("x");
                                    Integer num15 = obj15 instanceof Integer ? (Integer) obj15 : null;
                                    bVar2.g(num15 == null ? 0 : num15.intValue());
                                    Object obj16 = a5.get("y");
                                    Integer num16 = obj16 instanceof Integer ? (Integer) obj16 : null;
                                    bVar2.h(num16 == null ? 0 : num16.intValue());
                                    Object tag2 = childAt4.getTag();
                                    bVar2.i(lxt.b(lxtVar2, tag2 instanceof String ? (String) tag2 : null));
                                    rightPanel.b().add(bVar2);
                                }
                            }
                            qx.c centerPanel = this.b.getCenterPanel();
                            qx qxVar = this.b;
                            centerPanel.h(leftPanel.d());
                            centerPanel.g(leftPanel.c() + leftPanel.e());
                            centerPanel.f(leftPanel.a());
                            centerPanel.i(qxVar.getRightPanel().c() - qxVar.getLeftPanel().e());
                            this.b.setTitleBarHeight(xcs.f(this.c, this.f23629a.getHeight() - xcs.d(this.c)));
                            this.b.commit();
                        }
                    }
                }
            }
        }
    }

    public final JSONObject c(View view, View view2) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e7369e", new Object[]{this, view, view2});
        }
        if (view == null || (context = view.getContext()) == null) {
            return null;
        }
        if (view2 == null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "x", (String) Integer.valueOf(xcs.f(context, iArr[0])));
            jSONObject.put((JSONObject) "y", (String) Integer.valueOf(xcs.f(context, iArr[1])));
            jSONObject.put((JSONObject) "width", (String) Integer.valueOf(xcs.f(context, view.getWidth())));
            jSONObject.put((JSONObject) "height", (String) Integer.valueOf(xcs.f(context, view.getHeight())));
            return jSONObject;
        }
        Pair<Integer, Integer> e = les.e(view, view2);
        if (e == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "x", (String) Integer.valueOf(xcs.f(context, e.getFirst().intValue())));
        jSONObject2.put((JSONObject) "y", (String) Integer.valueOf(xcs.f(context, e.getSecond().intValue())));
        jSONObject2.put((JSONObject) "width", (String) Integer.valueOf(xcs.f(context, view.getWidth())));
        jSONObject2.put((JSONObject) "height", (String) Integer.valueOf(xcs.f(context, view.getHeight())));
        return jSONObject2;
    }
}
