package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.bmi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xff extends wx1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(689963147);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final float f31350a;
        public final float b;
        public final float c;
        public final float d;

        static {
            t2o.a(689963148);
        }

        public b(float f, float f2, float f3, float f4) {
            this.f31350a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("171ad653", new Object[]{this})).floatValue();
            }
            return this.d;
        }

        public final float b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d172d868", new Object[]{this})).floatValue();
            }
            return this.c;
        }

        public final float c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6bb14f9a", new Object[]{this})).floatValue();
            }
            return this.f31350a;
        }

        public final float d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6bbf671b", new Object[]{this})).floatValue();
            }
            return this.b;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "{ratioX=" + this.f31350a + "，ratioY=" + this.b + "，ratioWidth=" + this.c + "，ratioHeight=" + this.d + '}';
        }
    }

    static {
        t2o.a(689963146);
    }

    public static /* synthetic */ Object ipc$super(xff xffVar, String str, Object... objArr) {
        if (str.hashCode() == 1380888358) {
            super.o((bmi) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/message/observer/InteractMessageObserver");
    }

    public JSONObject F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("baaa6a68", new Object[]{this});
        }
        vgh.c(this, "InteractMessageObserver", "获取H5互动本地配置");
        return new JSONObject();
    }

    public JSONObject G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("27808a9b", new Object[]{this});
        }
        vgh.c(this, "InteractMessageObserver", "获取H5互动远程配置");
        return new JSONObject();
    }

    public final void H(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30866288", new Object[]{this, bmiVar});
        } else {
            d0();
        }
    }

    public final void I(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("418176f7", new Object[]{this, bmiVar});
            return;
        }
        JSONObject a2 = bmiVar.a();
        if (a2 != null) {
            String string = a2.getString("taskType");
            ckf.f(string, BaseMnnRunUnit.KEY_TASK_NAME);
            JSONObject e0 = e0(string);
            bmi.a b2 = bmiVar.b();
            if (b2 != null) {
                b2.onResult(e0);
            }
        }
    }

    public final void J(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc9be347", new Object[]{this, bmiVar});
            return;
        }
        JSONObject F = F();
        bmi.a b2 = bmiVar.b();
        if (b2 != null) {
            b2.onResult(F);
        }
    }

    public final void K(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e299a2aa", new Object[]{this, bmiVar});
            return;
        }
        JSONObject G = G();
        bmi.a b2 = bmiVar.b();
        if (b2 != null) {
            b2.onResult(G);
        }
    }

    public final void L(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6a0817", new Object[]{this, bmiVar});
            return;
        }
        JSONObject f0 = f0();
        bmi.a b2 = bmiVar.b();
        if (b2 != null) {
            b2.onResult(f0);
        }
    }

    public final void M(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a4a745", new Object[]{this, bmiVar});
            return;
        }
        JSONObject a2 = bmiVar.a();
        if (a2 != null) {
            String string = a2.getString("taskType");
            String string2 = a2.getString("state");
            ckf.f(string, BaseMnnRunUnit.KEY_TASK_NAME);
            ckf.f(string2, "taskState");
            g0(string, string2);
        }
    }

    public final void N(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a0bdd47", new Object[]{this, bmiVar});
        } else {
            h0();
        }
    }

    public final void O(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9efd600d", new Object[]{this, bmiVar});
        } else {
            i0();
        }
    }

    public final void P(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67dd2f0a", new Object[]{this, bmiVar});
        } else {
            j0();
        }
    }

    public final void Q(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3514fc6", new Object[]{this, bmiVar});
            return;
        }
        JSONObject a2 = bmiVar.a();
        if (a2 != null) {
            Object obj = a2.get(vff.INTERACTION_TASK_COMPLETED_ARGS_ACCOUNT_AMOUNT);
            if (!(obj instanceof Integer)) {
                vgh.c(this, "InteractMessageObserver", "处理其他互动任务完成的消息，accountAmount无效");
            } else {
                k0(((Number) obj).intValue());
            }
        }
    }

    public final void R(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a71f21", new Object[]{this, bmiVar});
        } else {
            l0();
        }
    }

    public final void S(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9613b7d4", new Object[]{this, bmiVar});
            return;
        }
        JSONObject Z = Z();
        bmi.a b2 = bmiVar.b();
        if (b2 != null) {
            b2.onResult(Z);
        }
    }

    public final void T(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c196c51", new Object[]{this, bmiVar});
            return;
        }
        JSONObject a0 = a0();
        bmi.a b2 = bmiVar.b();
        if (b2 != null) {
            b2.onResult(a0);
        }
    }

    public final void U(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed7786ba", new Object[]{this, bmiVar});
            return;
        }
        JSONObject b0 = b0();
        bmi.a b2 = bmiVar.b();
        if (b2 != null) {
            b2.onResult(b0);
        }
    }

    public final void V(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a52a0ba", new Object[]{this, bmiVar});
            return;
        }
        JSONObject c0 = c0();
        bmi.a b2 = bmiVar.b();
        if (b2 != null) {
            b2.onResult(c0);
        }
    }

    public final void W(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38627756", new Object[]{this, bmiVar});
            return;
        }
        JSONObject a2 = bmiVar.a();
        if (a2 != null) {
            Object obj = a2.get("triggerType");
            if (!(obj instanceof String) || ((CharSequence) obj).length() == 0) {
                vgh.c(this, "InteractMessageObserver", "处理刷新浏览挂角数据的消息，triggerType无效");
            } else {
                n0((String) obj);
            }
        }
    }

    public final void Y(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe776b48", new Object[]{this, bmiVar});
        } else {
            m0();
        }
    }

    public JSONObject Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c698c945", new Object[]{this});
        }
        vgh.c(this, "InteractMessageObserver", "是否发生了浏览挂角倒计时完成");
        return new JSONObject();
    }

    public JSONObject a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b40182f2", new Object[]{this});
        }
        vgh.c(this, "InteractMessageObserver", "是否发生了互动新用户简化链路升级");
        return new JSONObject();
    }

    public JSONObject b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fe57caab", new Object[]{this});
        }
        vgh.c(this, "InteractMessageObserver", "是否展示剩余的浏览挂角");
        return new JSONObject();
    }

    public JSONObject c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cb52c11b", new Object[]{this});
        }
        vgh.c(this, "InteractMessageObserver", "是否展示互动任务面板");
        return new JSONObject();
    }

    public void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47332070", new Object[]{this});
        } else {
            vgh.c(this, "InteractMessageObserver", "浏览提现气泡隐藏的时机");
        }
    }

    public JSONObject e0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b01b2061", new Object[]{this, str});
        }
        ckf.g(str, "name");
        vgh.c(this, "InteractMessageObserver", "获取" + str + " 的任务状态");
        return new JSONObject();
    }

    public JSONObject f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4a31eb7", new Object[]{this});
        }
        vgh.c(this, "InteractMessageObserver", "尝试获得native左侧挂角状态");
        return new JSONObject();
    }

    public void g0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f6d864b", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, BaseMnnRunUnit.KEY_TASK_NAME);
        ckf.g(str2, "state");
        vgh.c(this, "InteractMessageObserver", "H5任务状态发生变化:" + str + " => " + str2);
    }

    public void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3266526", new Object[]{this});
        } else {
            vgh.c(this, "InteractMessageObserver", "H5互动组件首次渲染完成的时机");
        }
    }

    public void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec54c9e", new Object[]{this});
        } else {
            vgh.c(this, "InteractMessageObserver", "互动开关引导弹窗中按钮点击的时机");
        }
    }

    public void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3dbcf69", new Object[]{this});
        } else {
            vgh.c(this, "InteractMessageObserver", "互动新用户简化链路升级弹窗渲染完成的时机");
        }
    }

    public void k0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5020e9", new Object[]{this, new Integer(i)});
            return;
        }
        vgh.c(this, "InteractMessageObserver", "其他互动任务完成的时机（上滑任务、签到任务等），accountAmount=" + i);
    }

    public void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15d0d280", new Object[]{this});
        } else {
            vgh.c(this, "InteractMessageObserver", "互动任务面板中浏览视频按钮点击的时机");
        }
    }

    public void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34bb52d9", new Object[]{this});
        } else {
            vgh.c(this, "InteractMessageObserver", "WebView重新加载的时机");
        }
    }

    public void n0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d383b31", new Object[]{this, str});
            return;
        }
        ckf.g(str, "triggerType");
        vgh.c(this, "InteractMessageObserver", "刷新浏览挂角数据，triggerType=".concat(str));
    }

    @Override // tb.wx1, tb.wa
    public void o(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("524eaf26", new Object[]{this, bmiVar});
            return;
        }
        ckf.g(bmiVar, "message");
        super.o(bmiVar);
        String c = bmiVar.c();
        switch (c.hashCode()) {
            case -1901326432:
                if (c.equals(vff.REFRESH_BROWSER_BADGE_DATA_NAME)) {
                    W(bmiVar);
                    return;
                }
                break;
            case -1831284064:
                if (c.equals(vff.H5_INTERACTION_COMPONENT_RENDER_FINISHED_NAME)) {
                    N(bmiVar);
                    return;
                }
                break;
            case -1670435775:
                if (c.equals(vff.GET_INTERACT_LOCAL_CONFIG_NAME)) {
                    J(bmiVar);
                    return;
                }
                break;
            case -1540958447:
                if (c.equals(vff.GET_NATIVE_LEFT_BUBBLE_STATE_NAME)) {
                    L(bmiVar);
                    return;
                }
                break;
            case -1135983631:
                if (c.equals(vff.GET_BROWSE_TASK_STATE_NAME)) {
                    I(bmiVar);
                    return;
                }
                break;
            case -1076308870:
                if (c.equals(vff.INTERACTION_TASK_PANEL_BROWSER_BUTTON_CLICKED_NAME)) {
                    R(bmiVar);
                    return;
                }
                break;
            case -804530589:
                if (c.equals(vff.INTERACTION_NEW_USER_UPGRADE_POP_RENDERED_NAME)) {
                    P(bmiVar);
                    return;
                }
                break;
            case -308674101:
                if (c.equals(vff.IS_INTERACTION_NEW_USER_UPGRADED_NAME)) {
                    T(bmiVar);
                    return;
                }
                break;
            case -270043148:
                if (c.equals(vff.GET_INTERACT_REMOTE_CONFIG_NAME)) {
                    K(bmiVar);
                    return;
                }
                break;
            case -68820876:
                if (c.equals(vff.IS_SHOW_INTERACTION_TASK_PANEL_NAME)) {
                    V(bmiVar);
                    return;
                }
                break;
            case 66575282:
                if (c.equals(vff.SET_DELEGATE_H5_AREAS_NAME)) {
                    X(bmiVar);
                    return;
                }
                break;
            case 240314903:
                if (c.equals(vff.INTERACT_SWITCH_GUIDE_POP_BUTTON_CLICK_NAME)) {
                    O(bmiVar);
                    return;
                }
                break;
            case 510443562:
                if (c.equals(vff.BROWSE_WITHDRAW_BUBBLE_HIDDEN_NAME)) {
                    H(bmiVar);
                    return;
                }
                break;
            case 658079250:
                if (c.equals(vff.WEB_VIEW_RELOAD_NAME)) {
                    Y(bmiVar);
                    return;
                }
                break;
            case 659538846:
                if (c.equals(vff.IS_BROWSER_BADGE_COUNTDOWN_FINISHED_NAME)) {
                    S(bmiVar);
                    return;
                }
                break;
            case 868326996:
                if (c.equals(vff.INTERACTION_TASK_COMPLETED_NAME)) {
                    Q(bmiVar);
                    return;
                }
                break;
            case 1420132356:
                if (c.equals(vff.IS_SHOW_EXTRA_BROWSER_BADGE_NAME)) {
                    U(bmiVar);
                    return;
                }
                break;
            case 1851942876:
                if (c.equals(vff.H5_TASK_STATE_CHANGE_NAME)) {
                    M(bmiVar);
                    return;
                }
                break;
        }
        vgh.c(this, "InteractMessageObserver", "收到其他消息，message=" + bmiVar);
    }

    public void o0(List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea4e92a", new Object[]{this, list});
            return;
        }
        ckf.g(list, "areaList");
        vgh.c(this, "InteractMessageObserver", "设置托管给H5的区域，areaList=" + list);
    }

    public final void X(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56d878", new Object[]{this, bmiVar});
            return;
        }
        JSONObject a2 = bmiVar.a();
        if (a2 != null) {
            Object obj = a2.get(vff.SET_DELEGATE_H5_AREAS_ARGS_AREAS);
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray.size() != 0) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<Object> it = jSONArray.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof JSONObject) {
                            JSONObject jSONObject = (JSONObject) next;
                            Object obj2 = jSONObject.get("x");
                            Object obj3 = jSONObject.get("y");
                            Object obj4 = jSONObject.get("width");
                            Object obj5 = jSONObject.get("height");
                            if ((obj2 instanceof Number) && (obj3 instanceof Number) && (obj4 instanceof Number) && (obj5 instanceof Number)) {
                                float floatValue = ((Number) obj2).floatValue();
                                float floatValue2 = ((Number) obj3).floatValue();
                                float floatValue3 = ((Number) obj4).floatValue();
                                float floatValue4 = ((Number) obj5).floatValue();
                                float f = 0;
                                if (floatValue >= f && floatValue3 >= f) {
                                    float f2 = 1;
                                    if (floatValue + floatValue3 <= f2 && floatValue2 >= f && floatValue4 >= f && floatValue2 + floatValue4 <= f2) {
                                        arrayList.add(new b(floatValue, floatValue2, floatValue3, floatValue4));
                                    }
                                }
                            }
                        }
                    }
                    o0(arrayList);
                }
            }
        }
    }
}
