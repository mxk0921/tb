package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbwaitpay.impl.event.submit.business.default")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ozr implements xcb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String USER_CONTEXT_KEY_SUBMIT_CALLBACK = "submit_callback";
    public static final String USER_CONTEXT_KEY_SUBMIT_RPC_PARAMS = "submit_rpc_params";

    /* renamed from: a  reason: collision with root package name */
    public lo f25771a;
    public final pt<AURAParseIO> b = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends pt<AURAParseIO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/waitpay/extension/modify/TBWaitPayModifyParamsExtension$1");
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
            }
        }

        @Override // tb.pt
        public void c(yk<AURAParseIO> ykVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
            } else if (ykVar != null) {
                AURAParseIO b = ykVar.b();
                if (b instanceof AURAParseIO) {
                    AURAParseIO aURAParseIO = b;
                    if (!aURAParseIO.getData().isEmpty() && aURAParseIO.getData().get(0) != null && ozr.r(ozr.this) != null) {
                        bn0.c(ozr.r(ozr.this).f());
                        gfb gfbVar = (gfb) ozr.r(ozr.this).g("submit_callback", gfb.class);
                        if (gfbVar != null) {
                            gfbVar.a(aURAParseIO.getData().get(0).b());
                        }
                    }
                }
            }
        }
    }

    static {
        t2o.a(725614630);
        t2o.a(81789120);
    }

    public static /* synthetic */ lo r(ozr ozrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("a0204f59", new Object[]{ozrVar});
        }
        return ozrVar.f25771a;
    }

    @Override // tb.xcb
    public pt<AURAParseIO> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pt) ipChange.ipc$dispatch("f2ced9e", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f25771a = loVar;
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        }
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }
}
