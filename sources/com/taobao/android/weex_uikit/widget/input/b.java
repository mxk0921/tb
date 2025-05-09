package com.taobao.android.weex_uikit.widget.input;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.input.a;
import tb.glt;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b implements TextWatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final UINode f10016a;
    public final a.b b;
    public int c;

    static {
        t2o.a(986710172);
    }

    public b(UINode uINode, a.b bVar) {
        this.f10016a = uINode;
        this.b = bVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        glt gltVar;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        EditText editText = (EditText) this.f10016a.getMountContent();
        if (editText != null && (gltVar = this.b.f10015a) != null) {
            String a2 = this.b.f10015a.a(gltVar.b(charSequence.toString()));
            if (a2.equals(charSequence.toString()) || (i4 = this.c) >= 3) {
                this.c = 0;
                return;
            }
            this.c = i4 + 1;
            int selectionStart = editText.getSelectionStart();
            glt gltVar2 = this.b.f10015a;
            int length = gltVar2.a(gltVar2.b(charSequence.subSequence(0, selectionStart).toString())).length();
            editText.setText(a2);
            editText.setSelection(length);
        }
    }
}
