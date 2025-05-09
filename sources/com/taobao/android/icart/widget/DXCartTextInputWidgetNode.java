package com.taobao.android.icart.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.taobao.weex.common.Constants;
import tb.c9x;
import tb.hav;
import tb.jn7;
import tb.kmb;
import tb.pb6;
import tb.t2o;
import tb.yn2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXCartTextInputWidgetNode extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXCARTTEXTINPUT_CARTTEXTINPUT = 7725616973349109612L;
    public static final long DXCARTTEXTINPUT_FOCUS = 17608939249605L;
    public static final long DXCARTTEXTINPUT_KEYBOARD = 4100686809917705561L;
    public static final int DXCARTTEXTINPUT_KEYBOARD_DIGIT = 1;
    public static final int DXCARTTEXTINPUT_KEYBOARD_NORMAL = 0;
    public static final int DXCARTTEXTINPUT_KEYBOARD_PHONE = 2;
    public static final long DXCARTTEXTINPUT_MAXLENGTH = -2628107586387168847L;
    public static final long DXCARTTEXTINPUT_ONCHANGE = 5288679823228297259L;
    public static final long DXCARTTEXTINPUT_ONFINISH = 5288693272742377286L;
    public static final long DXCARTTEXTINPUT_PLACEHOLDER = 5980555813819279758L;
    public static final long DXCARTTEXTINPUT_PLACEHOLDERCOLOR = 1205272363096125842L;
    public static final long DXCARTTEXTINPUT_RETURNTYPE = -2488226218508878772L;
    public static final int DXCARTTEXTINPUT_RETURNTYPE_DONE = 2;
    public static final int DXCARTTEXTINPUT_RETURNTYPE_GO = 0;
    public static final int DXCARTTEXTINPUT_RETURNTYPE_SEARCH = 1;
    public static final long DXCARTTEXTINPUT_TEXT = 38178040921L;
    public static final long DXCARTTEXTINPUT_TEXTCOLOR = 5737767606580872653L;
    public static final long DXCARTTEXTINPUT_TEXTGRAVITY = -1564827143683948874L;
    public static final int DXCARTTEXTINPUT_TEXTGRAVITY_CENTER = 1;
    public static final int DXCARTTEXTINPUT_TEXTGRAVITY_LEFT = 0;
    public static final int DXCARTTEXTINPUT_TEXTGRAVITY_RIGHT = 2;
    public static final long DXCARTTEXTINPUT_TEXTSIZE = 6751005219504497256L;
    public int d;
    public int g;
    public int i;

    /* renamed from: a  reason: collision with root package name */
    public int f8084a = 0;
    public int b = 0;
    public String c = "null";
    public int e = 0;
    public String f = "";
    public int h = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LinearLayout f8085a;
        public final /* synthetic */ EditText b;

        public a(DXCartTextInputWidgetNode dXCartTextInputWidgetNode, LinearLayout linearLayout, EditText editText) {
            this.f8085a = linearLayout;
            this.b = editText;
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
            int i4 = 4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            LinearLayout linearLayout = this.f8085a;
            if (this.b.isFocused() && charSequence != null && charSequence.length() > 0) {
                i4 = 0;
            }
            linearLayout.setVisibility(i4);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ EditText f8086a;

        public b(DXCartTextInputWidgetNode dXCartTextInputWidgetNode, EditText editText) {
            this.f8086a = editText;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f8086a.getText().clear();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements View.OnFocusChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final View f8087a;

        static {
            t2o.a(478151095);
        }

        public c(View view) {
            this.f8087a = view;
        }

        public final void a(EditText editText, boolean z) {
            View findViewWithTag;
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f409895f", new Object[]{this, editText, new Boolean(z)});
                return;
            }
            View view = this.f8087a;
            if (view != null && (findViewWithTag = view.findViewWithTag("iconFontRootView")) != null) {
                if (editText.getText().length() <= 0 || !z) {
                    i = 4;
                }
                findViewWithTag.setVisibility(i);
            }
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                return;
            }
            EditText editText = (EditText) view;
            InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                if (z) {
                    inputMethodManager.toggleSoftInput(1, 2);
                } else {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
                a(editText, z);
                editText.setCursorVisible(z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final DXCartTextInputWidgetNode f8088a;
        public final DXEvent b = new DXEvent(5288679823228297259L);

        static {
            t2o.a(478151096);
        }

        public d(DXCartTextInputWidgetNode dXCartTextInputWidgetNode) {
            this.f8088a = dXCartTextInputWidgetNode;
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
            } else {
                this.f8088a.postEvent(this.b);
            }
        }
    }

    static {
        t2o.a(478151090);
    }

    public static /* synthetic */ Object ipc$super(DXCartTextInputWidgetNode dXCartTextInputWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/DXCartTextInputWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXCartTextInputWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXCARTTEXTINPUT_FOCUS || j == DXCARTTEXTINPUT_KEYBOARD || j == DXCARTTEXTINPUT_MAXLENGTH || j == DXCARTTEXTINPUT_RETURNTYPE || j == -1564827143683948874L) {
            return 0;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)});
        }
        if (j == DXCARTTEXTINPUT_PLACEHOLDER) {
            return "null";
        }
        if (j == 38178040921L) {
            return "";
        }
        return super.getDefaultValueForStringAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        super.onBindEvent(context, view, j);
        final EditText editText = (EditText) view.findViewWithTag("editText");
        if (j == 5288693272742377286L) {
            editText.setOnFocusChangeListener(new c(view));
            editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.taobao.android.icart.widget.DXCartTextInputWidgetNode.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.TextView.OnEditorActionListener
                public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i), keyEvent})).booleanValue();
                    }
                    if (i != 2 && i != 6 && i != 3) {
                        return false;
                    }
                    DXCartTextInputWidgetNode.this.postEvent(new DXEvent(j));
                    editText.clearFocus();
                    return true;
                }
            });
        } else if (j == 5288679823228297259L) {
            int i = jn7.TEXT_WATCHER;
            d dVar = (d) editText.getTag(i);
            if (dVar != null) {
                editText.removeTextChangedListener(dVar);
            }
            d dVar2 = new d(this);
            editText.setTag(i, dVar2);
            editText.addTextChangedListener(dVar2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof DXCartTextInputWidgetNode)) {
            super.onClone(dXWidgetNode, z);
            DXCartTextInputWidgetNode dXCartTextInputWidgetNode = (DXCartTextInputWidgetNode) dXWidgetNode;
            this.f8084a = dXCartTextInputWidgetNode.f8084a;
            this.b = dXCartTextInputWidgetNode.b;
            this.c = dXCartTextInputWidgetNode.c;
            this.d = dXCartTextInputWidgetNode.d;
            this.e = dXCartTextInputWidgetNode.e;
            this.f = dXCartTextInputWidgetNode.f;
            this.g = dXCartTextInputWidgetNode.g;
            this.h = dXCartTextInputWidgetNode.h;
            this.i = dXCartTextInputWidgetNode.i;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        int d0;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        kmb t = t();
        LinearLayout linearLayout = new LinearLayout(context);
        EditText editText = new EditText(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        editText.setLines(1);
        editText.setSingleLine();
        editText.setImeOptions(3);
        editText.setEllipsize(null);
        editText.setLayoutParams(layoutParams);
        editText.setBackgroundDrawable(null);
        editText.setPadding(0, 0, 0, 0);
        if (t == null) {
            d0 = pb6.c(context, 15.0f);
        } else {
            d0 = t.e().d0(15.0f);
        }
        editText.setTextSize(d0);
        editText.setTag("editText");
        LinearLayout linearLayout2 = new LinearLayout(context);
        if (t == null) {
            i = pb6.c(context, 36.0f);
        } else {
            i = t.e().d0(36.0f);
        }
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(i, -1));
        linearLayout2.setGravity(21);
        linearLayout2.setTag("iconFontRootView");
        TIconFontTextView tIconFontTextView = new TIconFontTextView(context);
        tIconFontTextView.setTextColor(Color.parseColor("#BBBBBB"));
        tIconFontTextView.setText(context.getString(R.string.clear_text_icon));
        tIconFontTextView.setGravity(17);
        if (t == null) {
            i2 = pb6.c(context, 15.0f);
        } else {
            i2 = t.e().d0(15.0f);
        }
        tIconFontTextView.setLayoutParams(new ViewGroup.LayoutParams(i2, i2));
        editText.addTextChangedListener(new a(this, linearLayout2, editText));
        linearLayout2.setOnClickListener(new b(this, editText));
        linearLayout.addView(editText);
        linearLayout2.addView(tIconFontTextView);
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j != DXCARTTEXTINPUT_FOCUS) {
            if (j == DXCARTTEXTINPUT_KEYBOARD) {
                this.f8084a = i;
            } else if (j == DXCARTTEXTINPUT_MAXLENGTH) {
                this.b = i;
            } else if (j == DXCARTTEXTINPUT_PLACEHOLDERCOLOR) {
                this.d = i;
            } else if (j == DXCARTTEXTINPUT_RETURNTYPE) {
                this.e = i;
            } else if (j == 5737767606580872653L) {
                this.g = i;
            } else if (j == -1564827143683948874L) {
                this.h = i;
            } else if (j == 6751005219504497256L) {
                this.i = i;
            } else {
                super.onSetIntAttribute(j, i);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXCARTTEXTINPUT_PLACEHOLDER) {
            this.c = str;
        } else if (j == 38178040921L) {
            this.f = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public void setKeyBoardType(EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d862b4e", new Object[]{this, editText, new Integer(i)});
        } else if (i == 0) {
            editText.setInputType(1);
        } else if (i == 1) {
            editText.setInputType(2);
        } else if (i != 2) {
            editText.setInputType(1);
        } else {
            editText.setInputType(3);
        }
    }

    public void setNativeTextGravity(EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5866a2f3", new Object[]{this, editText, new Integer(i)});
        } else if (i == 0) {
            editText.setGravity(19);
        } else if (i == 1) {
            editText.setGravity(17);
        } else if (i == 2) {
            editText.setGravity(21);
        } else {
            editText.setGravity(16);
        }
    }

    public final kmb t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("5d2c502", new Object[]{this});
        }
        kmb b2 = yn2.b(getDXRuntimeContext());
        if (b2 != null) {
            return b2;
        }
        hav.b(c9x.CART_BIZ_NAME, "CartTextInput", "cartPresenter is null");
        return null;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        EditText editText = (EditText) view.findViewWithTag("editText");
        editText.setHint(this.c);
        editText.setHintTextColor(tryFetchDarkModeColor(Constants.Name.PLACEHOLDER_COLOR, 0, this.d));
        editText.setText(this.f);
        editText.setTextSize(0, this.i);
        editText.setTextColor(tryFetchDarkModeColor("textColor", 0, this.g));
        setNativeTextGravity(editText, this.h);
        setKeyBoardType(editText, this.f8084a);
        if (this.b <= 0) {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Integer.MAX_VALUE)});
        } else {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.b)});
        }
        int i = this.e;
        if (i == 0) {
            editText.setImeOptions(2);
        } else if (i == 2) {
            editText.setImeOptions(6);
        } else {
            editText.setImeOptions(3);
        }
    }
}
