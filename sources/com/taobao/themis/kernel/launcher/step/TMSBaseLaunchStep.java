package com.taobao.themis.kernel.launcher.step;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import tb.a9s;
import tb.bbs;
import tb.eas;
import tb.lwd;
import tb.mcs;
import tb.ncs;
import tb.q9s;
import tb.rds;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TMSBaseLaunchStep f13585a;
    public final bbs b;
    public String c;
    public String d;
    public eas f;
    public final a9s h;
    public final lwd j;
    public final Long i = Long.valueOf(rds.g());
    public final String e = "Themis/Launch/" + c();
    public Status g = Status.BEFORE_EXECUTE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum Status {
        BEFORE_EXECUTE,
        EXECUTING,
        SUCCESS,
        ERROR;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Status status, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/launcher/step/TMSBaseLaunchStep$Status");
        }

        public static Status valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Status) ipChange.ipc$dispatch("56c4896e", new Object[]{str});
            }
            return (Status) Enum.valueOf(Status.class, str);
        }
    }

    static {
        t2o.a(839909747);
    }

    public TMSBaseLaunchStep(bbs bbsVar, a9s a9sVar) {
        this.b = bbsVar;
        this.h = a9sVar;
        this.j = a9sVar.m();
        String d = ncs.d(bbsVar);
        this.d = d;
        this.c = mcs.d(d);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        this.g = Status.EXECUTING;
        mcs.e(this.e, mcs.EVENT_ON_EXECUTE, this.d, this.c, new JSONObject());
        f();
        TMSLogger.b("TMSLaunchStep", c());
        rds.a(c() + "#onExecuting", this.i.longValue(), null);
        h();
    }

    public a9s b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a9s) ipChange.ipc$dispatch("bf71416", new Object[]{this});
        }
        return this.h;
    }

    public abstract String c();

    public void d() {
        lwd lwdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d45dfa", new Object[]{this});
            return;
        }
        if (this.f13585a == null && (lwdVar = this.j) != null) {
            lwdVar.b();
        }
        TMSBaseLaunchStep tMSBaseLaunchStep = this.f13585a;
        if (tMSBaseLaunchStep != null) {
            tMSBaseLaunchStep.a();
        }
    }

    public abstract void e();

    public abstract void f();

    public void g(eas easVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d9c76e7", new Object[]{this, easVar});
            return;
        }
        rds.c(c() + "#onExecuting", this.i.longValue(), null);
        if (q9s.O()) {
            if (this.g == Status.ERROR) {
                return;
            }
        } else if (this.g != Status.EXECUTING) {
            return;
        }
        this.g = Status.ERROR;
        lwd lwdVar = this.j;
        if (lwdVar != null) {
            lwdVar.d(easVar);
        }
        this.f = easVar;
        e();
        mcs.a(this.e, mcs.EVENT_ON_ERROR, this.d, this.c, easVar.f18428a, easVar.b, null);
    }

    public abstract void h();

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            return;
        }
        rds.c(c() + "#onExecuting", this.i.longValue(), null);
        if (this.g == Status.EXECUTING) {
            this.g = Status.SUCCESS;
            mcs.e(this.e, mcs.EVENT_ON_SUCCESS, this.d, this.c, new JSONObject());
            e();
            d();
        }
    }

    public TMSBaseLaunchStep j(TMSBaseLaunchStep tMSBaseLaunchStep) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSBaseLaunchStep) ipChange.ipc$dispatch("96f4ce3a", new Object[]{this, tMSBaseLaunchStep});
        }
        this.f13585a = tMSBaseLaunchStep;
        return tMSBaseLaunchStep;
    }
}
