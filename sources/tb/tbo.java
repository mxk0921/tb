package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.bean.YuvDiffCheckerConfig;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import java.util.ArrayList;
import tb.bs6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class tbo extends ss3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long G = lg4.U2();
    public static final int H = lg4.V2();
    public static final float I = lg4.T2();
    public static final int J = lg4.W2();
    public final qu3 F = new qu3("client");

    static {
        t2o.a(730857638);
    }

    public tbo(Context context, CaptureManager captureManager) {
        super(context, "planB_ManualObjectDetector", captureManager);
        mzu.k(p73.f25916a, "startForcedDetect", new String[0]);
    }

    public static /* synthetic */ Object ipc$super(tbo tboVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                tboVar.destroy();
                return null;
            case -1915068725:
                tboVar.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1481951945:
                tboVar.onDeviceStable();
                return null;
            case -1458089064:
                tboVar.d(((Boolean) objArr[0]).booleanValue());
                return null;
            case -558272972:
                tboVar.resume();
                return null;
            case -172787659:
                return tboVar.getRootView();
            case 241349955:
                tboVar.c((fzb) objArr[0]);
                return null;
            case 365356045:
                tboVar.onDeviceMove();
                return null;
            case 453062841:
                tboVar.b((byte[]) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 756739016:
                tboVar.z();
                return null;
            case 1532019825:
                tboVar.h(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1713617801:
                tboVar.stop();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/intelli/RevealAllDetailObjectDetector");
        }
    }

    @Override // tb.py1, tb.m2d
    public qu3 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qu3) ipChange.ipc$dispatch("3941f463", new Object[]{this});
        }
        return this.F.b(this.B.R(), this.A);
    }

    @Override // tb.ss3
    public float s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be0042fd", new Object[]{this})).floatValue();
        }
        return I;
    }

    @Override // tb.ss3
    public long t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd66e0b2", new Object[]{this})).longValue();
        }
        return G;
    }

    @Override // tb.ss3
    public long u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81c688cf", new Object[]{this})).longValue();
        }
        return J;
    }

    @Override // tb.ss3
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28339085", new Object[]{this});
        } else {
            this.u.set(true);
        }
    }

    @Override // tb.ss3
    public xox w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xox) ipChange.ipc$dispatch("85bc8d9f", new Object[]{this});
        }
        YuvDiffCheckerConfig X2 = lg4.X2();
        return new xox(X2.graySize, H, X2.frameCountThreshold, X2.timeThreshold);
    }

    @Override // tb.ss3
    public void n(byte[] bArr, int i, int i2, boolean z, int i3, fzb fzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cd5203", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3), fzbVar});
            return;
        }
        agh.a("planB_ManualObjectDetector", "autoDetectProcess");
        if (this.B.q() != null) {
            this.B.q().h(false);
        }
        B(true);
        q7l q7lVar = new q7l();
        byte[] bArr2 = new byte[bArr.length];
        q7lVar.f26562a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        q7lVar.c = i;
        q7lVar.d = i2;
        q7lVar.e = this.j;
        q7lVar.f = this.k;
        q7lVar.b = z;
        r7l a2 = r7l.a(new ArrayList(1), new ArrayList(1), ((bs6.b) bs6.a(q7lVar.f26562a, q7lVar.c, q7lVar.d, i3, z)).b(q7lVar.e, q7lVar.f).a(), 0L, null);
        jl0 jl0Var = new jl0("ForcedDetect", "");
        mzu.k(p73.f25916a, "ForcedDetect", new String[0]);
        y(a2, jl0Var, g());
        fzbVar.e();
    }
}
