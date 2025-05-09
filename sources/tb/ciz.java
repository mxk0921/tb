package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.base.hostingview.NCHostingView;
import com.taobao.android.nanocompose.runtime.context.NCBusinessContext;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ciz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final NCBusinessContext f17091a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598736907);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final ciz a(c6z c6zVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ciz) ipChange.ipc$dispatch("4012752b", new Object[]{this, c6zVar});
            }
            ckf.g(c6zVar, "engineConfig");
            return new ciz(c6zVar.a(), c6zVar, null);
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8ced2a4f", new Object[]{this})).booleanValue();
            }
            return ciz.a();
        }

        @JvmStatic
        public final boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ebe8ead9", new Object[]{this})).booleanValue();
            }
            return b();
        }

        public a() {
        }
    }

    static {
        t2o.a(598736906);
    }

    public /* synthetic */ ciz(String str, c6z c6zVar, a07 a07Var) {
        this(str, c6zVar);
    }

    public static final /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c9e1298", new Object[0])).booleanValue();
        }
        return false;
    }

    public final NCHostingView b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NCHostingView) ipChange.ipc$dispatch("2cf7b4cf", new Object[]{this, context});
        }
        ckf.g(context, "context");
        return new NCHostingView(context);
    }

    public final mlz c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mlz) ipChange.ipc$dispatch("e812f20c", new Object[]{this});
        }
        return this.f17091a.f();
    }

    public final void d(qhz qhzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d19765c", new Object[]{this, qhzVar});
            return;
        }
        ckf.g(qhzVar, "renderParams");
        qhzVar.b().renderHostingView$nanocompose_slimRelease(qhzVar, this.f17091a, c());
    }

    public ciz(String str, c6z c6zVar) {
        this.f17091a = NCBusinessContext.Companion.a(c6zVar);
    }
}
