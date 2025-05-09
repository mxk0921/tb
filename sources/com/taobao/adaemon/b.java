package com.taobao.adaemon;

import androidx.constraintlayout.widget.Constraints;
import com.android.alibaba.ip.runtime.IpChange;
import tb.s55;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BG_TYPE_BACK = "back";
    public static final String BG_TYPE_INIT = "init";
    public static final int INVALID_PID = -1;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6144a;
    public final boolean b;
    public final int c;
    public int d;
    public boolean e;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.adaemon.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class C0316b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(349175821);
        }

        public b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8a9e19f7", new Object[]{this});
            }
            return new b(this);
        }
    }

    static {
        t2o.a(349175819);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Constraints{mRequiresBackground=" + this.f6144a + ", mRequiresPressBackToBg=" + this.b + ", mBackgroundInterval=" + this.c + ", targetPid=" + this.d + '}';
    }

    public b(C0316b bVar) {
        this.d = -1;
        this.e = false;
        bVar.getClass();
        this.f6144a = true;
        this.b = true;
        this.c = 10;
        s55.g(Constraints.TAG, "Constraints:" + toString(), new Object[0]);
    }
}
