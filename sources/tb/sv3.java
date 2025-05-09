package tb;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sv3 extends CharacterStyle implements UpdateAppearance, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public rjh f28295a;

    static {
        t2o.a(444597239);
        t2o.a(444597246);
    }

    public static /* synthetic */ Object ipc$super(sv3 sv3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/view/richtext/span/CloneableLongClickSpan");
    }

    public rjh a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rjh) ipChange.ipc$dispatch("238a77b1", new Object[]{this});
        }
        return this.f28295a;
    }

    public boolean b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
        }
        rjh rjhVar = this.f28295a;
        if (rjhVar != null) {
            return rjhVar.onLongClick(view);
        }
        return false;
    }

    public void c(rjh rjhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c3da35", new Object[]{this, rjhVar});
        } else {
            this.f28295a = rjhVar;
        }
    }

    public Object clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        sv3 sv3Var = new sv3();
        sv3Var.f28295a = this.f28295a;
        return sv3Var;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
        }
    }
}
