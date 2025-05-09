package com.taobao.android.weex_uikit.widget.input;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.input.c;
import com.taobao.weex.common.Constants;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import tb.bmv;
import tb.cxh;
import tb.dwh;
import tb.egl;
import tb.fxh;
import tb.glt;
import tb.hu6;
import tb.itt;
import tb.lvl;
import tb.mmt;
import tb.nxh;
import tb.pvh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTR_MAX = "max";
    public static final String ATTR_MIN = "min";
    public static final String ATTR_RETURN_KEY_TYPE = "returnKeyType";
    public static final int DEFAULT_TEXT_ALIGN = 3;
    public static final boolean DEF_AUTO_FOCUS = false;
    public static final int DEF_COLOR = -16777216;
    public static final int DEF_FONT_SIZE = mmt.DEFAULT_FONT_SIZE;
    public static final int DEF_PLACE_HOLDER_COLOR = -6710887;
    public static final int DEF_RETURN_TYPE = 0;
    public static final boolean DEF_SINGLE_LINE = true;
    public static final String DEF_TYPE = "text";
    public static final String EXTRA_ACTION_ID = "actionId";

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.weex_uikit.widget.input.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class C0523a implements c.AbstractC0524c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UINode f10014a;
        public final /* synthetic */ Context b;

        public C0523a(UINode uINode, Context context) {
            this.f10014a = uINode;
            this.b = context;
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cffe6859", new Object[]{this, new Boolean(z)});
            } else if (this.f10014a.hasEvent("keyboard")) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isShow", (Object) Boolean.valueOf(z));
                if (z) {
                    Rect rect = new Rect();
                    ((Activity) this.b).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                    Context context = this.b;
                    jSONObject.put("keyboardSize", (Object) Float.valueOf(fxh.m(context, nxh.c(context) - (rect.bottom - rect.top))));
                }
                this.f10014a.fireEvent("keyboard", jSONObject);
                if (!z) {
                    a.b(this.f10014a);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public glt f10015a;

        static {
            t2o.a(986710155);
        }
    }

    static {
        t2o.a(986710153);
    }

    public static void A(UINode uINode, String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7843fb43", new Object[]{uINode, str});
        } else if (TextUtils.isEmpty(str)) {
            uINode.setAttribute("filter", null);
        } else {
            try {
                i = (int) fxh.f(str, uINode.getInstance().getRpxPerRem());
            } catch (Exception unused) {
                i = Integer.MAX_VALUE;
            }
            uINode.setAttribute("filter", new InputFilter.LengthFilter(i));
        }
    }

    public static void B(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2432078a", new Object[]{uINode, str});
        } else {
            A(uINode, str);
        }
    }

    public static void C(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("740912db", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("min", str);
        }
    }

    public static void D(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3642c17a", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("placeholder", str);
        }
    }

    public static void E(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("223edb19", new Object[]{uINode, str});
        } else if (TextUtils.isEmpty(str)) {
            uINode.setAttribute(Constants.Name.PLACEHOLDER_COLOR, -6710887);
        } else {
            uINode.setAttribute(Constants.Name.PLACEHOLDER_COLOR, Integer.valueOf(cxh.c(str)));
        }
    }

    public static void G(UINode uINode, int i, int i2) {
        EditText editText;
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("829d1b8e", new Object[]{uINode, new Integer(i), new Integer(i2)});
        } else if (uINode.isMounted() && i <= (length = (editText = (EditText) uINode.getMountContent()).length()) && i2 <= length) {
            d(uINode);
            editText.setSelection(i, i2);
        }
    }

    public static void H(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9af7b4f1", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute(Constants.Name.SINGLELINE, Boolean.valueOf(z));
        }
    }

    public static void J(UINode uINode, JSONObject jSONObject, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58fe2086", new Object[]{uINode, jSONObject, bVar});
            return;
        }
        try {
            String string = jSONObject.getString("formatRule");
            String string2 = jSONObject.getString("formatReplace");
            String string3 = jSONObject.getString("recoverRule");
            String string4 = jSONObject.getString("recoverReplace");
            lvl m = m(string, string2);
            lvl m2 = m(string3, string4);
            if (m != null && m2 != null) {
                bVar.f10015a = new glt(m, m2);
            }
        } catch (Throwable th) {
            dwh.i(th);
        }
    }

    public static void K(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f9f7d2f", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("type", str);
        }
    }

    public static void L(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7806475c", new Object[]{uINode, str});
            return;
        }
        uINode.setAttribute("value", str);
        uINode.setExtra("value", str);
    }

    public static void M(Context context, EditText editText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c5f48c", new Object[]{context, editText});
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 1);
        }
    }

    public static void a(String str, EditText editText, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a278d686", new Object[]{str, editText, uINode});
            return;
        }
        str.hashCode();
        if (str.equals("date")) {
            editText.setOnClickListener(new hu6(uINode));
        } else if (!str.equals("time")) {
            editText.setOnClickListener(null);
        } else {
            editText.setOnClickListener(new itt(uINode));
        }
    }

    public static void b(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbb9ada", new Object[]{uINode});
        } else if (uINode.isMounted()) {
            EditText editText = (EditText) uINode.getMountContent();
            if (editText.isFocused()) {
                h(uINode.getInstance().getUIContext(), editText);
                editText.clearFocus();
            }
        }
    }

    public static void c(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3da172b4", new Object[]{uINode});
        } else if (uINode.isMounted()) {
            ((EditText) uINode.getMountContent()).setText("");
        }
    }

    public static void d(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a87a09", new Object[]{uINode});
        } else if (uINode.isMounted()) {
            EditText editText = (EditText) uINode.getMountContent();
            if (editText != null) {
                editText.requestFocus();
            }
            M(uINode.getInstance().getUIContext(), (EditText) uINode.getMountContent());
        }
    }

    public static void g(UINode uINode, EditText editText, egl<c.d> eglVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ca97b26", new Object[]{uINode, editText, eglVar});
        } else if (uINode.hasEvent("keyboard")) {
            Context context = editText.getContext();
            if (context instanceof Activity) {
                eglVar.c(c.b((Activity) context, new C0523a(uINode, context)));
            }
        }
    }

    public static void h(Context context, EditText editText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c1ed191", new Object[]{context, editText});
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    public static EditText i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("ef3600d2", new Object[]{context});
        }
        return new EditText(context);
    }

    public static void k(UINode uINode, egl<b> eglVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2149c6d5", new Object[]{uINode, eglVar});
        } else {
            eglVar.c(new b());
        }
    }

    public static void n(UINode uINode, EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99121fd", new Object[]{uINode, editText, new Integer(i)});
        } else {
            editText.setTextColor(i);
        }
    }

    public static void o(UINode uINode, EditText editText, InputFilter.LengthFilter lengthFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f52036e", new Object[]{uINode, editText, lengthFilter});
        } else if (lengthFilter == null) {
            editText.setFilters(new InputFilter[0]);
        } else {
            editText.setFilters(new InputFilter[]{lengthFilter});
        }
    }

    public static void p(UINode uINode, EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b51cfa", new Object[]{uINode, editText, new Integer(i)});
        } else {
            editText.setTextSize(0, i);
        }
    }

    public static void q(UINode uINode, EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe8c080", new Object[]{uINode, editText, str});
        } else {
            editText.setHint(str);
        }
    }

    public static void r(UINode uINode, EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("922d835a", new Object[]{uINode, editText, new Integer(i)});
        } else {
            editText.setHintTextColor(i);
        }
    }

    public static void s(UINode uINode, EditText editText, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2569529f", new Object[]{uINode, editText, new Boolean(z)});
        } else {
            editText.setSingleLine(z);
        }
    }

    public static void t(UINode uINode, EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83b6f068", new Object[]{uINode, editText, new Integer(i)});
        } else {
            editText.setGravity(i);
        }
    }

    public static void u(UINode uINode, EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c8627d", new Object[]{uINode, editText, str});
            return;
        }
        editText.setInputType(e(editText, str));
        a(str, editText, uINode);
    }

    public static void v(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a0820fa", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute(Constants.Name.AUTOFOCUS, Boolean.valueOf(z));
        }
    }

    public static void w(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78e1b32a", new Object[]{uINode, str});
        } else if (TextUtils.isEmpty(str)) {
            uINode.setAttribute("color", -16777216);
        } else {
            uINode.setAttribute("color", Integer.valueOf(cxh.c(str)));
        }
    }

    public static void y(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22fbbdb9", new Object[]{uINode, str});
        } else if (TextUtils.isEmpty(str)) {
            uINode.setAttribute("fontSize", Float.valueOf(32.0f));
        } else {
            uINode.setAttribute("fontSize", Integer.valueOf(Math.round(fxh.a(fxh.h(str, uINode.getInstance().getRpxPerRem())))));
        }
    }

    public static void z(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d77989", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("max", str);
        }
    }

    public static void l(UINode uINode, MUSDKInstance mUSDKInstance, EditText editText, com.taobao.android.weex_uikit.widget.input.b bVar, c.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8879a3d9", new Object[]{uINode, mUSDKInstance, editText, bVar, dVar});
            return;
        }
        if (editText.getText() != null) {
            uINode.setExtra("value", editText.getText().subSequence(0, editText.getText().length()));
        }
        editText.removeTextChangedListener(bVar);
        editText.setOnEditorActionListener(null);
        if (dVar != null) {
            dVar.execute();
        }
    }

    public static void x(UINode uINode, EditText editText, String str, Object obj) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c90b9f2", new Object[]{uINode, editText, str, obj});
        } else if (editText != null) {
            str.hashCode();
            if (str.equals(EXTRA_ACTION_ID)) {
                if (obj != null) {
                    i = ((Integer) obj).intValue();
                }
                editText.setImeOptions(i);
            } else if (str.equals("value")) {
                if (obj == null) {
                    obj = "";
                }
                if (TextUtils.isEmpty(editText.getText())) {
                    String valueOf = String.valueOf(obj);
                    editText.setText(valueOf);
                    editText.setSelection(valueOf.length());
                    return;
                }
                int selectionStart = editText.getSelectionStart();
                int selectionEnd = editText.getSelectionEnd();
                String valueOf2 = String.valueOf(obj);
                editText.setText(valueOf2);
                if (valueOf2.length() < selectionStart || valueOf2.length() < selectionEnd) {
                    editText.setSelection(valueOf2.length());
                } else {
                    editText.setSelection(selectionStart, selectionEnd);
                }
            }
        }
    }

    public static void f(UINode uINode, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff20f23", new Object[]{uINode, pvhVar});
        } else if (uINode.isMounted()) {
            EditText editText = (EditText) uINode.getMountContent();
            JSONObject jSONObject = new JSONObject();
            int selectionStart = editText.getSelectionStart();
            int selectionEnd = editText.getSelectionEnd();
            if (!editText.hasFocus()) {
                selectionStart = 0;
                selectionEnd = 0;
            }
            jSONObject.put(Constants.Name.SELECTION_START, (Object) Integer.valueOf(selectionStart));
            jSONObject.put(Constants.Name.SELECTION_END, (Object) Integer.valueOf(selectionEnd));
            pvhVar.b(jSONObject);
        }
    }

    public static void j(UINode uINode, MUSDKInstance mUSDKInstance, EditText editText, egl<com.taobao.android.weex_uikit.widget.input.b> eglVar, b bVar, egl<c.d> eglVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f57d261e", new Object[]{uINode, mUSDKInstance, editText, eglVar, bVar, eglVar2});
            return;
        }
        editText.setBackgroundColor(0);
        CharSequence charSequence = (CharSequence) uINode.getExtra("value");
        if (charSequence != null) {
            uINode.setExtra("value", null);
            editText.setText(charSequence);
        } else {
            editText.setText("");
        }
        editText.setSingleLine(((Boolean) uINode.getAttribute(Constants.Name.SINGLELINE)).booleanValue());
        editText.setHintTextColor(((Integer) uINode.getAttribute(Constants.Name.PLACEHOLDER_COLOR)).intValue());
        editText.setHint((CharSequence) uINode.getAttribute("placeholder"));
        editText.setGravity(((Integer) uINode.getAttribute(Constants.Name.TEXT_ALIGN)).intValue());
        u(uINode, editText, (String) uINode.getAttribute("type"));
        editText.setTextColor(((Integer) uINode.getAttribute("color")).intValue());
        Integer num = (Integer) uINode.getExtra(EXTRA_ACTION_ID);
        editText.setImeOptions(num == null ? 0 : num.intValue());
        editText.setTextSize(0, ((Integer) uINode.getAttribute("fontSize")).intValue());
        InputFilter inputFilter = (InputFilter) uINode.getAttribute("filter");
        if (inputFilter == null) {
            editText.setFilters(new InputFilter[0]);
        } else {
            editText.setFilters(new InputFilter[]{inputFilter});
        }
        if (((Boolean) uINode.getAttribute(Constants.Name.AUTOFOCUS)).booleanValue()) {
            editText.setFocusable(true);
            editText.requestFocus();
            editText.setFocusableInTouchMode(true);
            M(mUSDKInstance.getUIContext(), editText);
        } else {
            h(mUSDKInstance.getUIContext(), editText);
        }
        eglVar.c(new com.taobao.android.weex_uikit.widget.input.b(uINode, bVar));
        editText.addTextChangedListener(eglVar.a());
        g(uINode, editText, eglVar2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r8.equals("left") != false) goto L_0x0058;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void I(com.taobao.android.weex_uikit.ui.UINode r7, java.lang.String r8) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.weex_uikit.widget.input.a.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "6aadc115"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r2[r0] = r8
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0015:
            if (r8 != 0) goto L_0x0019
            java.lang.String r8 = ""
        L_0x0019:
            int r3 = r8.hashCode()
            r4 = 4
            r5 = 5
            r6 = 3
            switch(r3) {
                case -1364013995: goto L_0x004d;
                case -1046836013: goto L_0x0043;
                case 3317767: goto L_0x0039;
                case 108511772: goto L_0x002e;
                case 762737387: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x0057
        L_0x0024:
            java.lang.String r1 = "centerVertical"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0057
            r1 = 4
            goto L_0x0058
        L_0x002e:
            java.lang.String r1 = "right"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0057
            r1 = 3
            goto L_0x0058
        L_0x0039:
            java.lang.String r3 = "left"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0043:
            java.lang.String r1 = "allDirectionCenter"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0057
            r1 = 5
            goto L_0x0058
        L_0x004d:
            java.lang.String r1 = "center"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0057
            r1 = 2
            goto L_0x0058
        L_0x0057:
            r1 = -1
        L_0x0058:
            java.lang.String r8 = "textAlign"
            if (r1 == r2) goto L_0x0087
            if (r1 == r6) goto L_0x007f
            if (r1 == r4) goto L_0x0075
            if (r1 == r5) goto L_0x006b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r7.setAttribute(r8, r0)
            goto L_0x008e
        L_0x006b:
            r0 = 17
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.setAttribute(r8, r0)
            goto L_0x008e
        L_0x0075:
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.setAttribute(r8, r0)
            goto L_0x008e
        L_0x007f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r7.setAttribute(r8, r0)
            goto L_0x008e
        L_0x0087:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.setAttribute(r8, r0)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.input.a.I(com.taobao.android.weex_uikit.ui.UINode, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r7.equals(com.taobao.weex.common.Constants.Value.DATETIME) != false) goto L_0x0087;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int e(android.widget.EditText r6, java.lang.String r7) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.weex_uikit.widget.input.a.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "a2f35f27"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r0] = r7
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            return r6
        L_0x001c:
            int r3 = r7.hashCode()
            r4 = 3
            r5 = 4
            switch(r3) {
                case -1034364087: goto L_0x007b;
                case 114715: goto L_0x0070;
                case 116079: goto L_0x0065;
                case 3076014: goto L_0x005b;
                case 3556653: goto L_0x004f;
                case 3560141: goto L_0x0044;
                case 96619420: goto L_0x003a;
                case 1216985755: goto L_0x002f;
                case 1793702779: goto L_0x0026;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x0086
        L_0x0026:
            java.lang.String r3 = "datetime"
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L_0x0086
            goto L_0x0087
        L_0x002f:
            java.lang.String r2 = "password"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x0086
            r2 = 4
            goto L_0x0087
        L_0x003a:
            java.lang.String r2 = "email"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x0086
            r2 = 3
            goto L_0x0087
        L_0x0044:
            java.lang.String r2 = "time"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x0086
            r2 = 0
            goto L_0x0087
        L_0x004f:
            java.lang.String r2 = "text"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x0086
            r2 = 8
            goto L_0x0087
        L_0x005b:
            java.lang.String r2 = "date"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x0086
            r2 = 1
            goto L_0x0087
        L_0x0065:
            java.lang.String r2 = "url"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x0086
            r2 = 6
            goto L_0x0087
        L_0x0070:
            java.lang.String r2 = "tel"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x0086
            r2 = 5
            goto L_0x0087
        L_0x007b:
            java.lang.String r2 = "number"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x0086
            r2 = 7
            goto L_0x0087
        L_0x0086:
            r2 = -1
        L_0x0087:
            switch(r2) {
                case 0: goto L_0x00a2;
                case 1: goto L_0x00a2;
                case 2: goto L_0x00a0;
                case 3: goto L_0x009d;
                case 4: goto L_0x0093;
                case 5: goto L_0x0091;
                case 6: goto L_0x008e;
                case 7: goto L_0x008b;
                default: goto L_0x008a;
            }
        L_0x008a:
            goto L_0x00a6
        L_0x008b:
            r0 = 8194(0x2002, float:1.1482E-41)
            goto L_0x00a6
        L_0x008e:
            r0 = 17
            goto L_0x00a6
        L_0x0091:
            r0 = 3
            goto L_0x00a6
        L_0x0093:
            android.text.method.PasswordTransformationMethod r7 = android.text.method.PasswordTransformationMethod.getInstance()
            r6.setTransformationMethod(r7)
            r0 = 129(0x81, float:1.81E-43)
            goto L_0x00a6
        L_0x009d:
            r0 = 33
            goto L_0x00a6
        L_0x00a0:
            r0 = 4
            goto L_0x00a6
        L_0x00a2:
            r6.setFocusable(r1)
            r0 = 0
        L_0x00a6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.input.a.e(android.widget.EditText, java.lang.String):int");
    }

    public static lvl m(String str, String str2) {
        Pattern pattern;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lvl) ipChange.ipc$dispatch("49348b33", new Object[]{str, str2});
        }
        if (str == null || str2 == null) {
            return null;
        }
        if (!Pattern.compile("/[\\S]+/[i]?[m]?[g]?").matcher(str).matches()) {
            dwh.v("Illegal js pattern syntax: ".concat(str));
            return null;
        }
        String substring = str.substring(str.lastIndexOf("/") + 1);
        String substring2 = str.substring(str.indexOf("/") + 1, str.lastIndexOf("/"));
        if (substring.contains(bmv.MSGTYPE_INTERVAL)) {
            i = 2;
        }
        if (substring.contains("m")) {
            i |= 32;
        }
        boolean contains = substring.contains(at.f);
        try {
            pattern = Pattern.compile(substring2, i);
        } catch (PatternSyntaxException unused) {
            dwh.v("Pattern syntax error: " + substring2);
            pattern = null;
        }
        if (pattern == null) {
            return null;
        }
        lvl lvlVar = new lvl();
        lvlVar.f23594a = contains;
        lvlVar.b = pattern;
        lvlVar.c = str2;
        return lvlVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r8.equals("go") == false) goto L_0x0022;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void F(com.taobao.android.weex_uikit.ui.UINode r7, java.lang.String r8) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            r3 = 0
            r4 = 2
            com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.android.weex_uikit.widget.input.a.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x0017
            java.lang.String r0 = "31fae8e4"
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r7
            r1[r2] = r8
            r5.ipc$dispatch(r0, r1)
            return
        L_0x0017:
            r8.hashCode()
            r5 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -906336856: goto L_0x0050;
                case 3304: goto L_0x0047;
                case 3089282: goto L_0x003c;
                case 3377907: goto L_0x0030;
                case 3526536: goto L_0x0024;
                default: goto L_0x0022;
            }
        L_0x0022:
            r2 = -1
            goto L_0x005b
        L_0x0024:
            java.lang.String r2 = "send"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x002e
            goto L_0x0022
        L_0x002e:
            r2 = 4
            goto L_0x005b
        L_0x0030:
            java.lang.String r2 = "next"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x003a
            goto L_0x0022
        L_0x003a:
            r2 = 3
            goto L_0x005b
        L_0x003c:
            java.lang.String r2 = "done"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x0045
            goto L_0x0022
        L_0x0045:
            r2 = 2
            goto L_0x005b
        L_0x0047:
            java.lang.String r6 = "go"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L_0x005b
            goto L_0x0022
        L_0x0050:
            java.lang.String r2 = "search"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x005a
            goto L_0x0022
        L_0x005a:
            r2 = 0
        L_0x005b:
            switch(r2) {
                case 0: goto L_0x0066;
                case 1: goto L_0x0064;
                case 2: goto L_0x0062;
                case 3: goto L_0x0060;
                case 4: goto L_0x0067;
                default: goto L_0x005e;
            }
        L_0x005e:
            r0 = 0
            goto L_0x0067
        L_0x0060:
            r0 = 5
            goto L_0x0067
        L_0x0062:
            r0 = 6
            goto L_0x0067
        L_0x0064:
            r0 = 2
            goto L_0x0067
        L_0x0066:
            r0 = 3
        L_0x0067:
            java.lang.String r1 = "returnKeyType"
            r7.setAttribute(r1, r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "actionId"
            r7.setExtra(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.input.a.F(com.taobao.android.weex_uikit.ui.UINode, java.lang.String):void");
    }
}
