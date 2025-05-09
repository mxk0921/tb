package tb;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.NotImplementedError;
import tb.v4z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class yzy extends kkz implements v4z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public float e;
    public float f;
    public float g;
    public float h;
    public final String i;

    static {
        t2o.a(598736996);
        t2o.a(598737151);
    }

    public /* synthetic */ yzy(float f, float f2, float f3, float f4, String str, a07 a07Var) {
        this(f, f2, f3, f4, str);
    }

    public static /* synthetic */ Object ipc$super(yzy yzyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/graphics/BorderNode");
    }

    @Override // tb.v4z
    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42d3ac29", new Object[]{this})).floatValue();
        }
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // tb.v4z
    public float c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c83f406", new Object[]{this, new Float(f)})).floatValue();
        }
        return v4z.a.b(this, f);
    }

    @Override // tb.v4z
    public int f(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa51101b", new Object[]{this, new Float(f)})).intValue();
        }
        return v4z.a.a(this, f);
    }

    @Override // tb.kkz
    public void n(jkz jkzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea16b542", new Object[]{this, jkzVar});
            return;
        }
        ckf.g(jkzVar, "props");
        if (jkzVar instanceof fzy) {
            ((fzy) jkzVar).w(new vzy(p(), r(), q(), o(), Color.parseColor(this.i)));
        }
    }

    public final float o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3c0c290", new Object[]{this})).floatValue();
        }
        return this.h;
    }

    public final float p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62301ab4", new Object[]{this})).floatValue();
        }
        return this.e;
    }

    public final float q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ecad69eb", new Object[]{this})).floatValue();
        }
        return this.g;
    }

    public final float r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ef9e952", new Object[]{this})).floatValue();
        }
        return this.f;
    }

    public final void s(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b517f120", new Object[]{this, new Float(f)});
        } else {
            this.h = f;
        }
    }

    public final void t(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("570a707c", new Object[]{this, new Float(f)});
        } else {
            this.e = f;
        }
    }

    public final void u(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23518d", new Object[]{this, new Float(f)});
        } else {
            this.g = f;
        }
    }

    public final void v(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81498c06", new Object[]{this, new Float(f)});
        } else {
            this.f = f;
        }
    }

    public yzy(float f, float f2, float f3, float f4, String str) {
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
        this.i = str;
    }
}
