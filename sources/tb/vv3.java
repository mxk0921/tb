package tb;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vv3 extends CharacterStyle implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f30275a;
    public final float b;
    public final float c;
    public final int d;

    static {
        t2o.a(444597243);
        t2o.a(444597246);
    }

    public vv3(float f, float f2, float f3, int i) {
        this.c = f;
        this.f30275a = f2;
        this.b = f3;
        this.d = i;
    }

    public static /* synthetic */ Object ipc$super(vv3 vv3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/view/richtext/span/CloneableShadowSpan");
    }

    public Object clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        return new vv3(this.c, this.f30275a, this.b, this.d);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
        } else {
            textPaint.setShadowLayer(this.c, this.f30275a, this.b, this.d);
        }
    }
}
