package tb;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class ge8 {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f19927a;
    public final Context b;
    public final CheckableImageButton c;

    public ge8(TextInputLayout textInputLayout) {
        this.f19927a = textInputLayout;
        this.b = textInputLayout.getContext();
        this.c = textInputLayout.getEndIconView();
    }

    public abstract void a();

    public boolean b(int i) {
        return true;
    }

    public boolean d() {
        return this instanceof DropdownMenuEndIconDelegate;
    }

    public void c(boolean z) {
    }
}
