package tb;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tv3 extends ClickableSpan implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public du3 f28979a;

    static {
        t2o.a(444597240);
        t2o.a(444597246);
    }

    public static /* synthetic */ Object ipc$super(tv3 tv3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/view/richtext/span/CloneableNoStyleClickSpan");
    }

    public du3 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (du3) ipChange.ipc$dispatch("d182c847", new Object[]{this});
        }
        return this.f28979a;
    }

    public void b(du3 du3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea8da027", new Object[]{this, du3Var});
        } else {
            this.f28979a = du3Var;
        }
    }

    public Object clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        tv3 tv3Var = new tv3();
        tv3Var.f28979a = this.f28979a;
        return tv3Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        du3 du3Var = this.f28979a;
        if (du3Var != null) {
            du3Var.onClick(view);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
        }
    }
}
