package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXTextInputEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.icart.widget.DXCartTextInputWidgetNode;
import com.taobao.weex.common.Constants;
import tb.jn7;
import tb.pb6;
import tb.qub;
import tb.t2o;
import tb.tkt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class q extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_TEXT_COLOR = -16777216;
    public static final int INPUT_TYPE_DIGIT = 1;
    public static final int INPUT_TYPE_NORMAL = 0;
    public static final int INPUT_TYPE_PHONE = 2;
    public static int i = 0;
    public float c;
    public int d;
    public int e;
    public int f;
    public String g;
    public int h = tkt.DEFAULT_SHADOW_COLOR;

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f7457a = "";
    public int b = -16777216;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ EditText f7458a;

        public a(q qVar, EditText editText) {
            this.f7458a = editText;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            if (motionEvent.getActionMasked() == 1) {
                this.f7458a.setCursorVisible(true);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597408);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new q();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final q f7459a;
        public final View b;
        public final DXTextInputEvent c = new DXTextInputEvent(5288679823228297259L);

        static {
            t2o.a(444597410);
        }

        public c(q qVar, View view) {
            this.f7459a = qVar;
            this.b = view;
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
                return;
            }
            this.c.setText(((EditText) this.b).getText());
            this.f7459a.postEvent(this.c);
        }
    }

    static {
        t2o.a(444597406);
        t2o.a(444597451);
    }

    public q() {
        this.d = 0;
        if (i == 0 && DinamicXEngine.x() != null) {
            i = pb6.f(DinamicXEngine.x(), 12.0f);
        }
        this.c = i;
        this.d = 0;
        setAccessibility(1);
    }

    public static /* synthetic */ Object ipc$super(q qVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -857616453:
                super.setBackground((View) objArr[0]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXTextInputWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new q();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 5737767606580872653L) {
            return -16777216;
        }
        if (j == 6751005219504497256L) {
            return i;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    public String getPlaceholder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53215adc", new Object[]{this});
        }
        return this.g;
    }

    public int getPlaceholderColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f95912a0", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public CharSequence getText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("27ef5fd0", new Object[]{this});
        }
        return this.f7457a;
    }

    public int getTextColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43c263fa", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public float getTextSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("835f3abb", new Object[]{this})).floatValue();
        }
        return this.c;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else if (j == 5288679823228297259L) {
            int i2 = jn7.TEXT_WATCHER;
            c cVar = (c) view.getTag(i2);
            if (cVar != null) {
                ((EditText) view).removeTextChangedListener(cVar);
            }
            c cVar2 = new c(this, view);
            view.setTag(i2, cVar2);
            ((EditText) view).addTextChangedListener(cVar2);
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof q) {
            q qVar = (q) dXWidgetNode;
            this.f7457a = qVar.f7457a;
            this.b = qVar.b;
            this.c = qVar.c;
            this.d = qVar.d;
            this.e = qVar.e;
            this.g = qVar.g;
            this.f = qVar.f;
            this.h = qVar.h;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        EditText editText = new EditText(context);
        editText.setLines(1);
        editText.setSingleLine();
        editText.setImeOptions(6);
        editText.setEllipsize(null);
        return editText;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i2, int i3) {
        boolean z;
        int i4;
        boolean z2 = true;
        int i5 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(i2);
        int a3 = DXWidgetNode.DXMeasureSpec.a(i3);
        if (a2 == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (a3 != 1073741824) {
            z2 = false;
        }
        if (z) {
            i4 = DXWidgetNode.DXMeasureSpec.b(i2);
        } else {
            i4 = 0;
        }
        if (z2) {
            i5 = DXWidgetNode.DXMeasureSpec.b(i3);
        }
        setMeasuredDimension(i4, i5);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i2)});
        } else if (5737767606580872653L == j) {
            this.b = i2;
        } else if (-1564827143683948874L == j) {
            this.d = i2;
        } else if (DXCartTextInputWidgetNode.DXCARTTEXTINPUT_MAXLENGTH == j) {
            this.f = i2;
        } else if (DXCartTextInputWidgetNode.DXCARTTEXTINPUT_PLACEHOLDERCOLOR == j) {
            this.h = i2;
        } else if (6751005219504497256L == j) {
            this.c = i2;
        } else if (DXCartTextInputWidgetNode.DXCARTTEXTINPUT_KEYBOARD == j) {
            this.e = i2;
        } else {
            super.onSetIntAttribute(j, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (38178040921L == j) {
            this.f7457a = str;
        } else if (DXCartTextInputWidgetNode.DXCARTTEXTINPUT_PLACEHOLDER == j) {
            this.g = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 3;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void setBackground(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce1cfbb", new Object[]{this, view});
            return;
        }
        super.setBackground(view);
        if (!this.needSetBackground) {
            view.setBackgroundColor(0);
        }
    }

    public void setKeyBoardType(EditText editText, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d862b4e", new Object[]{this, editText, new Integer(i2)});
        } else if (i2 == 0) {
            editText.setInputType(1);
        } else if (i2 == 1) {
            editText.setInputType(2);
        } else if (i2 != 2) {
            editText.setInputType(1);
        } else {
            editText.setInputType(3);
        }
    }

    public void setNativeTextGravity(EditText editText, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5866a2f3", new Object[]{this, editText, new Integer(i2)});
        } else if (i2 == 0) {
            editText.setGravity(51);
        } else if (i2 == 1) {
            editText.setGravity(17);
        } else if (i2 == 2) {
            editText.setGravity(53);
        } else {
            editText.setGravity(16);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue();
        }
        if (getClass() == q.class) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view != null && (view instanceof EditText)) {
            EditText editText = (EditText) view;
            editText.setHint(this.g);
            editText.setHintTextColor(tryFetchDarkModeColor(Constants.Name.PLACEHOLDER_COLOR, 0, this.h));
            editText.setText(this.f7457a);
            editText.setTextSize(0, this.c);
            editText.setTextColor(tryFetchDarkModeColor("textColor", 0, this.b));
            setNativeTextGravity(editText, this.d);
            setKeyBoardType(editText, this.e);
            editText.setCursorVisible(false);
            editText.setOnTouchListener(new a(this, editText));
            if (this.f <= 0) {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Integer.MAX_VALUE)});
            } else {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f)});
            }
        }
    }
}
