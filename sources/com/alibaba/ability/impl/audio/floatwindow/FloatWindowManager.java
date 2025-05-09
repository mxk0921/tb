package com.alibaba.ability.impl.audio.floatwindow;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a07;
import tb.ckf;
import tb.ko9;
import tb.njg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FloatWindowManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final njg b = kotlin.a.b(FloatWindowManager$Companion$instance$2.INSTANCE);

    /* renamed from: a  reason: collision with root package name */
    public ko9 f1927a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(98566211);
        }

        public a() {
        }

        public final FloatWindowManager a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("d304b35d", new Object[]{this});
            } else {
                value = FloatWindowManager.a().getValue();
            }
            return (FloatWindowManager) value;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(98566210);
    }

    public FloatWindowManager() {
    }

    public static final /* synthetic */ njg a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("fb99327c", new Object[0]);
        }
        return b;
    }

    public final void b(Context context, AbsFloatWindow absFloatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b7f014c", new Object[]{this, context, absFloatWindow});
            return;
        }
        ckf.g(context, "context");
        ckf.g(absFloatWindow, "floatWindow");
        if (this.f1927a == null) {
            ko9 ko9Var = new ko9(context);
            this.f1927a = ko9Var;
            ko9Var.c();
        }
        ko9 ko9Var2 = this.f1927a;
        ckf.d(ko9Var2);
        if (!ko9Var2.d().containsFloatWindow(absFloatWindow)) {
            ko9 ko9Var3 = this.f1927a;
            ckf.d(ko9Var3);
            ko9Var3.d().addViewByLevel(absFloatWindow, absFloatWindow.level);
        }
    }

    public final void c(Context context, AbsFloatWindow absFloatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6d3b689", new Object[]{this, context, absFloatWindow});
            return;
        }
        ckf.g(context, "context");
        ckf.g(absFloatWindow, "floatWindow");
        ko9 ko9Var = this.f1927a;
        if (ko9Var != null && ko9Var.d().containsFloatWindow(absFloatWindow)) {
            ko9Var.d().removeView(absFloatWindow);
            if (ko9Var.d().isEmpty()) {
                ko9Var.b();
                this.f1927a = null;
            }
        }
    }

    public /* synthetic */ FloatWindowManager(a07 a07Var) {
        this();
    }
}
