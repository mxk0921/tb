package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.canvas.extension.page.GameQkingJSRuntimeExtension;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.open.extension.IJSRuntimeFactoryExtension;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class csf implements IJSRuntimeFactoryExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public IJSRuntimeFactoryExtension.Type f17287a = IJSRuntimeFactoryExtension.Type.Qking;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(834666533);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(834666534);
            int[] iArr = new int[IJSRuntimeFactoryExtension.Type.values().length];
            iArr[IJSRuntimeFactoryExtension.Type.Qking.ordinal()] = 1;
            iArr[IJSRuntimeFactoryExtension.Type.V8.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(834666532);
        t2o.a(843055250);
    }

    public csf(bbs bbsVar) {
        ckf.g(bbsVar, "instance");
    }

    @Override // tb.t4c
    public void N(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
        } else {
            IJSRuntimeFactoryExtension.a.a(this, bbsVar);
        }
    }

    @Override // com.taobao.themis.open.extension.IJSRuntimeFactoryExtension
    public void Z(IJSRuntimeFactoryExtension.Type type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff0f05a2", new Object[]{this, type});
            return;
        }
        ckf.g(type, "type");
        TMSLogger.b("JSRuntimeFactoryExtension", ckf.p("设置JS引擎类型: ", type));
        this.f17287a = type;
    }

    @Override // tb.t4c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            IJSRuntimeFactoryExtension.a.b(this);
        }
    }

    @Override // com.taobao.themis.open.extension.IJSRuntimeFactoryExtension
    public IJSRuntimeFactoryExtension.Type q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IJSRuntimeFactoryExtension.Type) ipChange.ipc$dispatch("cc09125e", new Object[]{this});
        }
        return this.f17287a;
    }

    @Override // com.taobao.themis.open.extension.IJSRuntimeFactoryExtension
    public s8c i0(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s8c) ipChange.ipc$dispatch("a5ed5a94", new Object[]{this, iTMSPage});
        }
        ckf.g(iTMSPage, "page");
        int i = b.$EnumSwitchMapping$0[this.f17287a.ordinal()];
        if (i == 1) {
            return new GameQkingJSRuntimeExtension(iTMSPage);
        }
        if (i == 2) {
            return new o4a(iTMSPage);
        }
        throw new NoWhenBranchMatchedException();
    }
}
