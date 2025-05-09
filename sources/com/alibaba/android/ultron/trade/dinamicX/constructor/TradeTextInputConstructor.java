package com.alibaba.android.ultron.trade.dinamicX.constructor;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.mmd.datasource.bean.PromotionFilterBean;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Map;
import tb.adu;
import tb.b24;
import tb.bn7;
import tb.do7;
import tb.em7;
import tb.en7;
import tb.om7;
import tb.owo;
import tb.sn7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TradeTextInputConstructor extends sn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_TEXT_COLOR = -16777216;
    private static final int DEFAULT_TEXT_SIZE = 12;
    private static final int ELLIPSIZE_END = 3;
    private static final int ELLIPSIZE_MIDDLE = 2;
    private static final int ELLIPSIZE_NONE = 0;
    private static final int ELLIPSIZE_START = 1;
    private static final String ET_KEYBOARD = "dKeyboard";
    private static final String ET_MAX_LENGTH = "dMaxLength";
    private static final String ET_PLACE_HOLDER = "dPlaceholder";
    private static final String ET_PLACE_HOLDER_COLOR = "dPlaceholderColor";
    private static final String INPUT_TYPE = "dInputType";
    public static final String INPUT_TYPE_DIALOG = "dialog";
    public static final String INPUT_TYPE_INPUT = "input";
    private static final int TEXT_ALIGNMENT_CENTER = 1;
    private static final int TEXT_ALIGNMENT_LEFT = 0;
    private static final int TEXT_ALIGNMENT_RIGHT = 2;
    private static final int TEXT_STYLE_BOLD = 1;
    private static final int TEXT_STYLE_BOLD_ITALIC = 3;
    private static final int TEXT_STYLE_ITALIC = 2;
    private static final int TEXT_STYLE_NORMAL = 0;
    private static final String TV_LINE_BREAK_MODE = "dLineBreakMode";
    private static final String TV_TEXT = "dText";
    private static final String TV_TEXT_ALIGNMENT = "dTextAlignment";
    private static final String TV_TEXT_COLOR = "dTextColor";
    private static final String TV_TEXT_GRAVITY = "dTextGravity";
    private static final String TV_TEXT_SIZE = "dTextSize";
    private static final String VIEW_ACCESSIBILITY_TEXT_HIDDEN = "dAccessibilityTextHidden";
    private static final String VIEW_EVENT_ON_FINISH = "onFinish";
    public static final String VIEW_TAG = "TradeTextInput";
    public static final int ID_TV_TEXT = R.id.trade_id_text;
    public static final int ID_KEY_BOARD = R.id.trade_id_key_board;
    public static final int ID_MAX_LENGTH = R.id.trade_id_max_length;
    public static final int ID_PLACE_HOLDER = R.id.trade_id_place_holder;
    public static final int ID_PLACE_HOLDER_COLOR = R.id.trade_id_place_holder_color;
    private static final int TEXT_WATCHER = R.id.trade_text_watcher;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a extends om7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.android.ultron.trade.dinamicX.constructor.TradeTextInputConstructor$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class View$OnTouchListenerC0071a implements View.OnTouchListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f2299a;
            public final /* synthetic */ Map b;
            public final /* synthetic */ bn7 c;
            public final /* synthetic */ en7 d;

            /* compiled from: Taobao */
            /* renamed from: com.alibaba.android.ultron.trade.dinamicX.constructor.TradeTextInputConstructor$a$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
            public class C0072a implements adu.c {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public C0072a() {
                }

                @Override // tb.adu.c
                public void onClick(DialogInterface dialogInterface, CharSequence charSequence) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("bdadd41a", new Object[]{this, dialogInterface, charSequence});
                        return;
                    }
                    View$OnTouchListenerC0071a aVar = View$OnTouchListenerC0071a.this;
                    a.this.f(aVar.f2299a, aVar.c, aVar.d, (String) View$OnTouchListenerC0071a.this.b.get("onFinish"));
                }
            }

            public View$OnTouchListenerC0071a(View view, Map map, bn7 bn7Var, en7 en7Var) {
                this.f2299a = view;
                this.b = map;
                this.c = bn7Var;
                this.d = en7Var;
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                if (motionEvent.getActionMasked() != 1 || view.isFocusable()) {
                    return false;
                }
                adu aduVar = new adu(view.getContext());
                aduVar.h((EditText) this.f2299a);
                aduVar.i(new C0072a());
                aduVar.show();
                return true;
            }
        }

        static {
            t2o.a(155189266);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/dinamicX/constructor/TradeTextInputConstructor$InputEventHandlerWorker");
        }

        @Override // tb.om7
        public void b(View view, bn7 bn7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99602391", new Object[]{this, view, bn7Var});
            } else {
                e(view, bn7Var);
            }
        }

        public void e(View view, bn7 bn7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65f0cc4d", new Object[]{this, view, bn7Var});
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.setFocusable(true);
                viewGroup.setFocusableInTouchMode(true);
            }
            en7 en7Var = (en7) view.getTag(em7.PROPERTY_KEY);
            if (en7Var != null) {
                Map<String, String> map = en7Var.d;
                if (!map.isEmpty()) {
                    b bVar = (b) view.getTag(TradeTextInputConstructor.access$000());
                    if (bVar != null) {
                        ((EditText) view).removeTextChangedListener(bVar);
                    }
                    b bVar2 = new b(this, view, en7Var);
                    bVar2.a(bn7Var);
                    view.setTag(TradeTextInputConstructor.access$000(), bVar2);
                    ((EditText) view).addTextChangedListener(bVar2);
                    ViewProxy.setOnTouchListener(view, new View$OnTouchListenerC0071a(view, map, bn7Var, en7Var));
                }
            }
        }

        public void f(View view, bn7 bn7Var, en7 en7Var, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f95c326", new Object[]{this, view, bn7Var, en7Var, str});
            } else if (!TextUtils.isEmpty(str)) {
                ArrayList arrayList = new ArrayList(5);
                arrayList.add("dialog");
                arrayList.add(((EditText) view).getText());
                view.setTag(em7.VIEW_PARAMS, arrayList);
                om7.d(view, bn7Var, en7Var, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public bn7 f2301a;
        public final en7 b;
        public final String c;
        public final View d;

        static {
            t2o.a(155189269);
        }

        public b(a aVar, View view, en7 en7Var) {
            this.b = en7Var;
            this.d = view;
            Map<String, String> map = en7Var.d;
            if (!map.isEmpty()) {
                this.c = map.get("onFinish");
            }
        }

        public void a(bn7 bn7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("903d17ed", new Object[]{this, bn7Var});
            } else {
                this.f2301a = bn7Var;
            }
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
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            } else if (this.d.isFocusable() && !TextUtils.isEmpty(this.c)) {
                ArrayList arrayList = new ArrayList(5);
                arrayList.add("input");
                arrayList.add(((EditText) this.d).getText());
                this.d.setTag(em7.VIEW_PARAMS, arrayList);
                om7.d(this.d, this.f2301a, this.b, this.c);
            }
        }
    }

    static {
        t2o.a(155189265);
    }

    public static /* synthetic */ int access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue();
        }
        return TEXT_WATCHER;
    }

    private void enableEditTextFocus(EditText editText, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1e8ba", new Object[]{this, editText, new Boolean(z)});
        } else if (editText != null) {
            editText.setFocusable(z);
            editText.setFocusableInTouchMode(z);
        }
    }

    public static /* synthetic */ Object ipc$super(TradeTextInputConstructor tradeTextInputConstructor, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1908967275) {
            super.applyDefaultProperty((View) objArr[0], (Map) objArr[1], (bn7) objArr[2]);
            return null;
        } else if (hashCode == -1372344534) {
            super.setAttributes((View) objArr[0], (Map) objArr[1], (ArrayList) objArr[2], (bn7) objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/ultron/trade/dinamicX/constructor/TradeTextInputConstructor");
        }
    }

    private void setBackground(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff662732", new Object[]{this, editText, str});
        } else {
            editText.setBackgroundColor(b24.e(str, -16777216));
        }
    }

    @Override // tb.sn7
    public void applyDefaultProperty(View view, Map<String, Object> map, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e377895", new Object[]{this, view, map, bn7Var});
            return;
        }
        super.applyDefaultProperty(view, map, bn7Var);
        EditText editText = (EditText) view;
        editText.setLines(1);
        editText.setSingleLine();
        editText.setImeOptions(6);
        if (!map.containsKey("dTextSize")) {
            editText.setTextSize(1, 12.0f);
        }
        if (!map.containsKey("dTextColor")) {
            editText.setTextColor(-16777216);
        }
        if (!map.containsKey(TV_LINE_BREAK_MODE)) {
            editText.setEllipsize(null);
        }
        if (!map.containsKey(TV_TEXT_GRAVITY) && !map.containsKey(TV_TEXT_ALIGNMENT)) {
            editText.setGravity(16);
        }
        if (!map.containsKey(VIEW_ACCESSIBILITY_TEXT_HIDDEN)) {
            setAccessibilityHidden(view, true);
        }
    }

    @Override // tb.sn7
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet});
        }
        return new EditText(context, attributeSet);
    }

    @Override // tb.sn7
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae33af2a", new Object[]{this, view, map, arrayList, bn7Var});
            return;
        }
        super.setAttributes(view, map, arrayList, bn7Var);
        EditText editText = (EditText) view;
        if (arrayList.contains(TV_TEXT)) {
            String str = (String) map.get(TV_TEXT);
            do7.e(editText, str);
            view.setTag(ID_TV_TEXT, str);
        }
        if (arrayList.contains("dTextSize")) {
            setTextSize(editText, (String) map.get("dTextSize"));
        }
        if (arrayList.contains("dTextColor")) {
            setTextColor(editText, (String) map.get("dTextColor"));
        }
        if (arrayList.contains(TV_TEXT_GRAVITY) || arrayList.contains(TV_TEXT_ALIGNMENT)) {
            setTextGravity(editText, (String) map.get(TV_TEXT_GRAVITY), (String) map.get(TV_TEXT_ALIGNMENT));
        }
        if (arrayList.contains(ET_PLACE_HOLDER)) {
            String str2 = (String) map.get(ET_PLACE_HOLDER);
            do7.a(editText, str2);
            view.setTag(ID_PLACE_HOLDER, str2);
        }
        if (arrayList.contains(ET_PLACE_HOLDER_COLOR)) {
            String str3 = (String) map.get(ET_PLACE_HOLDER_COLOR);
            do7.b(editText, str3);
            view.setTag(ID_PLACE_HOLDER_COLOR, str3);
        }
        if (arrayList.contains(ET_KEYBOARD)) {
            String str4 = (String) map.get(ET_KEYBOARD);
            do7.c(editText, str4);
            view.setTag(ID_KEY_BOARD, str4);
        }
        if (arrayList.contains(ET_MAX_LENGTH)) {
            String str5 = (String) map.get(ET_MAX_LENGTH);
            do7.d(editText, str5);
            view.setTag(ID_MAX_LENGTH, str5);
        }
        if (arrayList.contains(INPUT_TYPE)) {
            enableEditTextFocus(editText, "input".equalsIgnoreCase((String) map.get(INPUT_TYPE)));
        }
    }

    public void setDeleteLine(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8868001", new Object[]{this, editText, str});
        } else if (TextUtils.equals(PromotionFilterBean.SINGLE, str)) {
            editText.getPaint().setFlags(16);
        }
    }

    @Override // tb.sn7
    public void setEvents(View view, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e6e73e3", new Object[]{this, view, bn7Var});
        } else {
            new a().b(view, bn7Var);
        }
    }

    public void setMaxLines(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97dfbc45", new Object[]{this, editText, str});
            return;
        }
        Integer valueOf = Integer.valueOf(str);
        if (valueOf.intValue() <= 0) {
            editText.setMaxLines(Integer.MAX_VALUE);
        } else if (valueOf.intValue() == 1) {
            editText.setMaxLines(1);
        } else {
            editText.setMaxLines(valueOf.intValue());
        }
    }

    public void setMaxWidth(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ce8f29e", new Object[]{this, editText, str});
            return;
        }
        int e = owo.e(editText.getContext(), str, -1);
        if (e != -1) {
            editText.setMaxWidth(e);
        }
    }

    public void setTextAlignment(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f828fee", new Object[]{this, editText, str});
            return;
        }
        int intValue = Integer.valueOf(str).intValue();
        if (intValue == 0) {
            editText.setGravity(19);
        } else if (intValue == 1) {
            editText.setGravity(17);
        } else if (intValue == 2) {
            editText.setGravity(21);
        }
    }

    public void setTextColor(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd291ee", new Object[]{this, editText, str});
        } else {
            editText.setTextColor(b24.e(str, -16777216));
        }
    }

    public void setTextGravity(EditText editText, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea1126ed", new Object[]{this, editText, str, str2});
        } else if (str == null) {
            setTextAlignment(editText, str2);
        } else if ("left".equals(str)) {
            editText.setGravity(19);
        } else if ("center".equals(str)) {
            editText.setGravity(17);
        } else if ("right".equals(str)) {
            editText.setGravity(21);
        } else {
            editText.setGravity(16);
        }
    }

    public void setTextLineBreakMode(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442d9d43", new Object[]{this, editText, str});
            return;
        }
        int intValue = Integer.valueOf(str).intValue();
        if (intValue == 0) {
            editText.setEllipsize(null);
        } else if (intValue == 1) {
            editText.setEllipsize(TextUtils.TruncateAt.START);
        } else if (intValue == 2) {
            editText.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if (intValue == 3) {
            editText.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public void setTextSize(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92642512", new Object[]{this, editText, str});
            return;
        }
        int e = owo.e(editText.getContext(), str, -1);
        if (e == -1) {
            editText.setTextSize(1, 12.0f);
        } else {
            editText.setTextSize(0, e);
        }
    }

    public void setTextStyle(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2ca35e0", new Object[]{this, editText, str});
        } else if (TextUtils.isEmpty(str)) {
            editText.setTypeface(Typeface.defaultFromStyle(0));
        } else {
            int intValue = Integer.valueOf(str).intValue();
            if (intValue == 0) {
                editText.setTypeface(Typeface.defaultFromStyle(0));
            } else if (intValue == 1) {
                editText.setTypeface(Typeface.defaultFromStyle(1));
            } else if (intValue == 2) {
                editText.setTypeface(Typeface.defaultFromStyle(2));
            } else if (intValue == 3) {
                editText.setTypeface(Typeface.defaultFromStyle(3));
            }
        }
    }

    public void setTextTheme(EditText editText, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be991292", new Object[]{this, editText, str, str2});
        } else if (str == null) {
            setTextStyle(editText, str2);
        } else if ("normal".equals(str)) {
            editText.setTypeface(Typeface.defaultFromStyle(0));
        } else if ("bold".equals(str)) {
            editText.setTypeface(Typeface.defaultFromStyle(1));
        } else if ("italic".equals(str)) {
            editText.setTypeface(Typeface.defaultFromStyle(2));
        } else {
            editText.setTypeface(Typeface.defaultFromStyle(0));
        }
    }
}
