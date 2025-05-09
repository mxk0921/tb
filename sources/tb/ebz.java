package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ebz extends mjz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public float e;
    public boolean f;

    static {
        t2o.a(598737131);
    }

    public ebz(float f, boolean z) {
        this.e = f;
        this.f = z;
    }

    public static /* synthetic */ Object ipc$super(ebz ebzVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/layout/modifier/LayoutWeightNode");
    }

    @Override // tb.mjz
    public ofz n(ofz ofzVar) {
        cmz cmzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ofz) ipChange.ipc$dispatch("cf612a21", new Object[]{this, ofzVar});
        }
        if (ofzVar instanceof cmz) {
            cmzVar = (cmz) ofzVar;
        } else {
            cmzVar = null;
        }
        if (cmzVar == null) {
            cmzVar = new cmz(0.0f, false, null, 7, null);
        }
        cmzVar.e(p());
        cmzVar.d(o());
        return cmzVar;
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50533e04", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public final float p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("975182e5", new Object[]{this})).floatValue();
        }
        return this.e;
    }

    public final void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1668f548", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public final void r(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e944b6df", new Object[]{this, new Float(f)});
        } else {
            this.e = f;
        }
    }
}
