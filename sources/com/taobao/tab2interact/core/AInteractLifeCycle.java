package com.taobao.tab2interact.core;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a07;
import tb.ckf;
import tb.jmi;
import tb.t2o;
import tb.vgh;
import tb.vv1;
import tb.xff;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class AInteractLifeCycle extends xff {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public State b = State.NOT_INIT;
    public final Context c;
    public final FrameLayout d;
    public final jmi e;
    public final vv1 f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum State {
        NOT_INIT("notInit"),
        INIT("init"),
        START("start"),
        STOP("stop"),
        DESTROY("destroy");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String text;

        State(String str) {
            this.text = str;
        }

        public static /* synthetic */ Object ipc$super(State state, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/AInteractLifeCycle$State");
        }

        public static State valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("1573c543", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(State.class, str);
            }
            return (State) valueOf;
        }

        @Override // java.lang.Enum
        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return this.text;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(689963011);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(689963010);
    }

    public AInteractLifeCycle(Context context, FrameLayout frameLayout, jmi jmiVar, vv1 vv1Var) {
        ckf.g(context, "context");
        ckf.g(frameLayout, "interactHostView");
        ckf.g(jmiVar, "messageCenter");
        ckf.g(vv1Var, "baseInfoManager");
        this.c = context;
        this.d = frameLayout;
        this.e = jmiVar;
        this.f = vv1Var;
    }

    public static /* synthetic */ Object ipc$super(AInteractLifeCycle aInteractLifeCycle, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/AInteractLifeCycle");
    }

    public void A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            vgh.c(this, "AInteractLayerComponent", "开启互动组件或互动层");
        }
    }

    public final void B0() {
        State state;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f4c269", new Object[]{this});
            return;
        }
        State state2 = this.b;
        if (state2 != State.NOT_INIT && state2 != (state = State.START) && state2 != State.DESTROY) {
            A0();
            this.b = state;
        }
    }

    public void C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            vgh.c(this, "AInteractLayerComponent", "暂停互动组件或互动层");
        }
    }

    public final void D0() {
        State state;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8fac9", new Object[]{this});
            return;
        }
        State state2 = this.b;
        if (state2 != State.NOT_INIT && state2 != State.INIT && state2 != (state = State.STOP) && state2 != State.DESTROY) {
            C0();
            this.b = state;
        }
    }

    public void p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            vgh.c(this, "AInteractLayerComponent", "销毁互动组件或互动层");
        }
    }

    public final void q0() {
        State state;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d89f37d1", new Object[]{this});
            return;
        }
        State state2 = this.b;
        if (state2 != State.NOT_INIT && state2 != (state = State.DESTROY)) {
            p0();
            this.b = state;
        }
    }

    public final vv1 r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vv1) ipChange.ipc$dispatch("fd25c38a", new Object[]{this});
        }
        return this.f;
    }

    public final Context s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.c;
    }

    public final jmi t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jmi) ipChange.ipc$dispatch("736529cb", new Object[]{this});
        }
        return this.e;
    }

    public abstract View u0();

    public abstract FrameLayout.LayoutParams v0();

    public abstract void x0();

    public final void y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a888fb", new Object[]{this});
            return;
        }
        State state = this.b;
        State state2 = State.INIT;
        if (state != state2 && state != State.START && state != State.STOP && state != State.DESTROY) {
            w0();
            this.b = state2;
        }
    }

    public abstract void z0();

    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        vgh.c(this, "AInteractLayerComponent", "初始化互动组件或互动层");
        x0();
        z0();
        View u0 = u0();
        if (u0 != null) {
            this.d.addView(u0, 0, v0());
        }
    }
}
