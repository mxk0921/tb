package com.alibaba.security.realidentity;

import android.os.Message;
import com.alibaba.security.realidentity.algo.wrapper.entity.ABDetectPhase;
import com.alibaba.security.realidentity.algo.wrapper.entity.result.ALBiometricsResult;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class s0 extends z0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String h = "StateMachine";
    public t0 c;
    public q d;
    public RPBizConfig e;
    public b0 f;
    public l0 g;

    public s0(t0 t0Var) {
        this.c = t0Var;
        q j = t0Var.j();
        this.d = j;
        this.e = j.c();
        this.f = this.c.x();
        this.g = this.c.i();
    }

    public static /* synthetic */ Object ipc$super(s0 s0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/s0");
    }

    public final void a(y0 y0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3a1039b", new Object[]{this, y0Var});
        } else {
            this.c.b(y0Var);
        }
    }

    public final void b(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeca26bc", new Object[]{this, message});
        } else {
            this.c.d(message);
        }
    }

    public ABDetectPhase d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ABDetectPhase) ipChange.ipc$dispatch("8a87d41e", new Object[]{this});
        }
        return this.c.v();
    }

    public ALBiometricsResult e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ALBiometricsResult) ipChange.ipc$dispatch("6806cbe1", new Object[]{this});
        }
        return this.c.r();
    }

    public void a(ABDetectPhase aBDetectPhase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4458ecdb", new Object[]{this, aBDetectPhase});
        } else {
            this.c.a(aBDetectPhase);
        }
    }
}
