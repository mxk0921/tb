package com.taobao.tab2interact.pageadapter.guangguang.turbo.message.observer;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import java.util.Map;
import tb.a07;
import tb.a3a;
import tb.bmi;
import tb.ckf;
import tb.t2o;
import tb.vgh;
import tb.wx1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class GGPageMessageObserver extends wx1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum InteractSwitchState {
        ON,
        OFF;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(InteractSwitchState interactSwitchState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/pageadapter/guangguang/turbo/message/observer/GGPageMessageObserver$InteractSwitchState");
        }

        public static InteractSwitchState valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("b50c36e2", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(InteractSwitchState.class, str);
            }
            return (InteractSwitchState) valueOf;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(689963231);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(689963230);
    }

    public static /* synthetic */ Object ipc$super(GGPageMessageObserver gGPageMessageObserver, String str, Object... objArr) {
        if (str.hashCode() == 1380888358) {
            super.o((bmi) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/pageadapter/guangguang/turbo/message/observer/GGPageMessageObserver");
    }

    public final void F(bmi bmiVar) {
        InteractSwitchState interactSwitchState;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26d6d52d", new Object[]{this, bmiVar});
            return;
        }
        JSONObject a2 = bmiVar.a();
        if (a2 != null) {
            Object obj = a2.get(BaseOuterComponent.b.ARGS);
            if (!(obj instanceof Map)) {
                vgh.c(this, "GGPageMessageObserver", "处理互动开关状态发生改变的消息，innerArgs无效");
                return;
            }
            Object obj2 = ((Map) obj).get("state");
            if (ckf.b(obj2, "on")) {
                interactSwitchState = InteractSwitchState.ON;
            } else if (ckf.b(obj2, "off")) {
                interactSwitchState = InteractSwitchState.OFF;
            } else {
                vgh.c(this, "GGPageMessageObserver", "处理互动开关状态发生改变的消息，state无效");
                return;
            }
            G(interactSwitchState);
        }
    }

    public void G(InteractSwitchState interactSwitchState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54354e46", new Object[]{this, interactSwitchState});
            return;
        }
        ckf.g(interactSwitchState, "interactSwitchState");
        vgh.c(this, "GGPageMessageObserver", "互动开关状态发生改变的时机，interactSwitchState=" + interactSwitchState);
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
        if (c.hashCode() == 1613846521 && c.equals(a3a.INTERACT_SWITCH_STATE_CHANGE_NAME)) {
            F(bmiVar);
            return;
        }
        vgh.c(this, "GGPageMessageObserver", "收到其他消息，message=" + bmiVar);
    }
}
