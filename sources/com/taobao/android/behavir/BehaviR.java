package com.taobao.android.behavir;

import android.app.Application;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.solution.BHRSolution;
import com.taobao.android.behavix.adapter.BXBRBridge;
import com.taobao.android.external.BHXVisualCenterItem;
import java.util.List;
import java.util.Map;
import tb.cqv;
import tb.dm1;
import tb.f82;
import tb.fm1;
import tb.g00;
import tb.ly1;
import tb.rm1;
import tb.t2o;
import tb.wm1;
import tb.zm1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BehaviR extends g00 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private dm1 mConfigCenter;
    private fm1 mDecisionEngine;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final BehaviR f6436a = new BehaviR();

        static {
            t2o.a(404750341);
        }

        public static /* synthetic */ BehaviR a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BehaviR) ipChange.ipc$dispatch("4d42e0d9", new Object[0]);
            }
            return f6436a;
        }
    }

    static {
        t2o.a(404750339);
    }

    public static void commitVisualCenter(String str, List<BHXVisualCenterItem> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31362586", new Object[]{str, list, new Boolean(z)});
        } else {
            cqv.v(str, list, z);
        }
    }

    private fm1 getDecisionEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fm1) ipChange.ipc$dispatch("565fadb6", new Object[]{this});
        }
        if (this.mDecisionEngine == null) {
            this.mDecisionEngine = fm1.f();
        }
        return this.mDecisionEngine;
    }

    public static BehaviR getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BehaviR) ipChange.ipc$dispatch("4ddae3ef", new Object[0]);
        }
        return b.a();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            BXBRBridge.a(zm1.a());
        }
    }

    public static /* synthetic */ Object ipc$super(BehaviR behaviR, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/BehaviR");
    }

    private boolean isBehaviREnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a0a22e7", new Object[]{this})).booleanValue();
        }
        if (!this.mConfigCenter.g() || !f82.j()) {
            return false;
        }
        return true;
    }

    public static void trackScrolling(String str, String str2, float f, float f2, List<rm1> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a08060f", new Object[]{str, str2, new Float(f), new Float(f2), list, map});
        } else {
            cqv.L(str, str2, f, f2, list, map);
        }
    }

    public void commitAppIn(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c137d5c", new Object[]{this, str, obj});
        } else {
            cqv.g(str, obj);
        }
    }

    public void commitAppOut(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c787c1b1", new Object[]{this, str, obj});
        } else {
            cqv.h(str, obj);
        }
    }

    public void commitCustom(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b473c752", new Object[]{this, str, str2, str3, strArr});
        } else {
            cqv.j(str, str2, str3, strArr);
        }
    }

    @Override // tb.xl0
    public void commitEnter(String str, String str2, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c564b847", new Object[]{this, str, str2, obj, strArr});
        } else {
            cqv.l(str, str2, obj, strArr);
        }
    }

    @Override // tb.xl0
    public void commitLeave(String str, String str2, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38feac8", new Object[]{this, str, str2, obj, strArr});
        } else {
            cqv.m(str, str2, obj, strArr);
        }
    }

    public void commitNewTap(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5efb220", new Object[]{this, str, str2, str3, strArr});
        } else {
            cqv.q(str, str2, str3, strArr);
        }
    }

    public void commitRequest(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce026f82", new Object[]{this, str, str2, str3, strArr});
        } else {
            cqv.s(str, str2, str3, strArr);
        }
    }

    @Override // tb.xl0
    public void commitTap(String str, String str2, String str3, String str4, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c09eea4", new Object[]{this, str, str2, str3, str4, strArr});
        } else {
            cqv.u(str, str2, str3, str4, strArr);
        }
    }

    public dm1 getConfigCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dm1) ipChange.ipc$dispatch("c898f9b0", new Object[]{this});
        }
        return this.mConfigCenter;
    }

    @Override // tb.g00
    public void initialize(Application application, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("408007bc", new Object[]{this, application, str, str2});
            return;
        }
        f82.f().i(application, str, str2);
        wm1.b();
    }

    @Override // tb.g00
    public void registerConfig(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a330e0", new Object[]{this, str, str2});
        } else if (isBehaviREnable()) {
            this.mConfigCenter.h(str2, str);
        }
    }

    @Override // tb.g00
    public void registerSolution(String str, BHRSolution bHRSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60fca446", new Object[]{this, str, bHRSolution});
        } else {
            dm1.c().i(str, bHRSolution);
        }
    }

    public void trackAppear(String str, String str2, String str3, View view, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("761a6532", new Object[]{this, str, str2, str3, view, strArr});
        } else {
            cqv.A(str, str2, str3, view, strArr);
        }
    }

    public void trackDisAppear(String str, String str2, String str3, View view, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9af0d2a", new Object[]{this, str, str2, str3, view, strArr});
        } else {
            cqv.C(str, str2, str3, view, strArr);
        }
    }

    public void trackScrollEnd(String str, String str2, int i, int i2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc0ea1", new Object[]{this, str, str2, new Integer(i), new Integer(i2), strArr});
        } else {
            cqv.G(str, str2, i, i2, strArr);
        }
    }

    public void trackScrollStart(String str, String str2, int i, int i2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee0ea7a", new Object[]{this, str, str2, new Integer(i), new Integer(i2), strArr});
        } else {
            cqv.K(str, str2, i, i2, strArr);
        }
    }

    @Override // tb.g00
    public void triggerEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac5f447d", new Object[]{this, str, jSONObject});
            return;
        }
        BHREvent bHREvent = new BHREvent();
        bHREvent.actionType = "internal";
        bHREvent.actionName = str;
        bHREvent.actionArgsJSON = jSONObject;
        getDecisionEngine().h(bHREvent);
    }

    @Override // tb.g00
    public void unRegisterSolution(String str, BHRSolution bHRSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53cb596d", new Object[]{this, str, bHRSolution});
        } else {
            dm1.c().j(str, bHRSolution);
        }
    }

    public void updateScene(String str, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90b3df15", new Object[]{this, str, obj, map});
        } else {
            cqv.O(str, obj, map);
        }
    }

    private BehaviR() {
        this.mConfigCenter = dm1.c();
        this.mDecisionEngine = null;
        init();
    }

    public static void trackScrollEnd(String str, String str2, float f, float f2, List<rm1> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af72b956", new Object[]{str, str2, new Float(f), new Float(f2), list, map});
        } else {
            cqv.D(str, str2, f, f2, list, map);
        }
    }

    public static void trackScrollStart(String str, String str2, float f, float f2, List<rm1> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("681797af", new Object[]{str, str2, new Float(f), new Float(f2), list, map});
        } else {
            cqv.H(str, str2, f, f2, list, map);
        }
    }

    public void commitLeave(String str, String str2, String str3, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ceb1ffe", new Object[]{this, str, str2, str3, obj, strArr});
        } else {
            cqv.o(str, str2, str3, obj, strArr);
        }
    }

    public void updateScene(ly1 ly1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d49cb2", new Object[]{this, ly1Var});
            return;
        }
        BHREvent e = fm1.f().e();
        if (e != null && ly1Var != null && TextUtils.equals(e.scene, ly1Var.d) && TextUtils.equals(e.sessionId, ly1Var.b) && e.seqId == ly1Var.f23634a) {
            e.bizArgs = ly1Var.l;
            e.bizArgsMap = ly1Var.t;
            e.bizArgKVMapObject = ly1Var.u;
        }
    }
}
