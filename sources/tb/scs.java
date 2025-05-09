package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import com.taobao.themis.open.extension.IJSRuntimeFactoryExtension;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class scs extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(834666582);
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
            t2o.a(834666583);
            int[] iArr = new int[IJSRuntimeFactoryExtension.Type.values().length];
            iArr[IJSRuntimeFactoryExtension.Type.Qking.ordinal()] = 1;
            iArr[IJSRuntimeFactoryExtension.Type.V8.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(834666581);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public scs(bbs bbsVar, a9s a9sVar) {
        super(bbsVar, a9sVar);
        ckf.g(bbsVar, "instance");
        ckf.g(a9sVar, wzi.LAUNCHER);
    }

    public static /* synthetic */ Object ipc$super(scs scsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/canvas/launch_step/TMSRuntimeInitStep");
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return scs.class.getName();
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef60dff", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e2985e", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67daaada", new Object[]{this});
            return;
        }
        IJSRuntimeFactoryExtension iJSRuntimeFactoryExtension = (IJSRuntimeFactoryExtension) this.b.getExtension(IJSRuntimeFactoryExtension.class);
        if (iJSRuntimeFactoryExtension == null) {
            g(eas.e);
            return;
        }
        int i = b.$EnumSwitchMapping$0[k().ordinal()];
        if (i == 1) {
            iJSRuntimeFactoryExtension.Z(IJSRuntimeFactoryExtension.Type.Qking);
            bbs bbsVar = this.b;
            bbs bbsVar2 = this.b;
            ckf.f(bbsVar2, "mInstance");
            bbsVar.k0(new nas(bbsVar2));
        } else if (i == 2) {
            iJSRuntimeFactoryExtension.Z(IJSRuntimeFactoryExtension.Type.V8);
            bbs bbsVar3 = this.b;
            bbs bbsVar4 = this.b;
            ckf.f(bbsVar4, "mInstance");
            bbsVar3.k0(new oas(bbsVar4));
        }
        i();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:26:0x00b0
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:90)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public final com.taobao.themis.open.extension.IJSRuntimeFactoryExtension.Type k() {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.scs.k():com.taobao.themis.open.extension.IJSRuntimeFactoryExtension$Type");
    }
}
