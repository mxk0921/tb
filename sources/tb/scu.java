package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.dinamicX.widget.MeasurableEditText;
import com.taobao.android.dinamicx.expression.event.DXTextInputEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;
import com.taobao.android.dinamicx.widget.q;
import com.taobao.weex.common.Constants;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class scu extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBBUYTEXTINPUTVIEW_CURSORCOLOR = -1990674490194665048L;
    public static final long DXTBBUYTEXTINPUTVIEW_MAXMULTILINEHEIGHT = -8253726656337564092L;
    public static final long DXTBBUYTEXTINPUTVIEW_MAXNUMLINES = 3831871169682765180L;
    public static final long DXTBBUYTEXTINPUTVIEW_ONOVERMAXLENGTH = 7091590746998031376L;
    public static final long DXTBBUYTEXTINPUTVIEW_TBBUYTEXTINPUTVIEW = 7157895207420284776L;
    public int j;
    public MeasurableEditText l;
    public String m;
    public int n;
    public int k = 2;
    public final q26 o = new q26();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MeasurableEditText f27956a;

        public a(MeasurableEditText measurableEditText) {
            this.f27956a = measurableEditText;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            this.f27956a.requestFocus();
            this.f27956a.setCursorVisible(true);
            scu.t(scu.this, this.f27956a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MeasurableEditText f27957a;

        public b(scu scuVar, MeasurableEditText measurableEditText) {
            this.f27957a = measurableEditText;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            if (motionEvent.getActionMasked() == 1) {
                this.f27957a.setCursorVisible(true);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(301989940);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new scu();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final scu f27958a;
        public final EditText b;
        public final DXTextInputEvent c = new DXTextInputEvent(5288679823228297259L);
        public final DXTextInputEvent d = new DXTextInputEvent(scu.DXTBBUYTEXTINPUTVIEW_ONOVERMAXLENGTH);

        static {
            t2o.a(301989941);
        }

        public d(scu scuVar, EditText editText) {
            this.f27958a = scuVar;
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
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            int lineCount = this.b.getLineCount();
            if (lineCount > scu.u(this.f27958a)) {
                Editable text = this.b.getText();
                text.delete(this.b.getSelectionStart() - 1, this.b.getSelectionEnd());
                if (!text.toString().equals(scu.v(this.f27958a))) {
                    scu.w(this.f27958a, text.toString());
                    this.f27958a.postEvent(this.d);
                    return;
                }
                return;
            }
            this.b.setLines(lineCount);
            if (scu.x(this.f27958a) != lineCount) {
                DXWidgetNode dXWidgetNode = (DXWidgetNode) this.b.getTag(DXWidgetNode.TAG_WIDGET_NODE);
                scu.y(this.f27958a, lineCount);
                scu.z(this.f27958a, 38178040921L, charSequence.toString());
                if (dXWidgetNode == null || dXWidgetNode.getDXRuntimeContext() == null) {
                    this.f27958a.getDXRuntimeContext().W().requestLayout();
                } else {
                    DXWidgetNode referenceNode = dXWidgetNode.getReferenceNode();
                    if (referenceNode != null) {
                        referenceNode.requestLayout();
                    } else {
                        this.f27958a.getDXRuntimeContext().W().requestLayout();
                    }
                }
            }
            this.c.setText(this.b.getText());
            this.f27958a.postEvent(this.c);
        }
    }

    static {
        t2o.a(301989937);
    }

    public static /* synthetic */ Object ipc$super(scu scuVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1775895211) {
            super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
            return null;
        } else if (hashCode == -740240234) {
            super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 2119721610) {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/buy/dinamicX/widget/TradeInputViewWidgetNode");
        }
    }

    public static /* synthetic */ void t(scu scuVar, EditText editText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c5020c7", new Object[]{scuVar, editText});
        } else {
            scuVar.C(editText);
        }
    }

    public static /* synthetic */ int u(scu scuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f7a2e4a", new Object[]{scuVar})).intValue();
        }
        return scuVar.k;
    }

    public static /* synthetic */ String v(scu scuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a3d242a", new Object[]{scuVar});
        }
        return scuVar.m;
    }

    public static /* synthetic */ String w(scu scuVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8485bf22", new Object[]{scuVar, str});
        }
        scuVar.m = str;
        return str;
    }

    public static /* synthetic */ int x(scu scuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a40f9808", new Object[]{scuVar})).intValue();
        }
        return scuVar.n;
    }

    public static /* synthetic */ int y(scu scuVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a43b4403", new Object[]{scuVar, new Integer(i)})).intValue();
        }
        scuVar.n = i;
        return i;
    }

    public static /* synthetic */ void z(scu scuVar, long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb917e1a", new Object[]{scuVar, new Long(j), str});
        } else {
            scuVar.onSetStringAttribute(j, str);
        }
    }

    public final void C(EditText editText) {
        InputMethodManager inputMethodManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34e2d035", new Object[]{this, editText});
        } else if (editText != null && getDXRuntimeContext() != null && getDXRuntimeContext().h() != null) {
            if ((!(getDXRuntimeContext().h() instanceof Activity) || !((Activity) getDXRuntimeContext().h()).isFinishing()) && (inputMethodManager = (InputMethodManager) getDXRuntimeContext().h().getSystemService("input_method")) != null) {
                editText.requestFocus();
                editText.requestFocusFromTouch();
                inputMethodManager.showSoftInput(editText, 0);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.q, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new scu();
    }

    public void onBeforeMeasure(EditText editText) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a1758", new Object[]{this, editText});
            return;
        }
        if (this.n != editText.getLineCount()) {
            this.l.setText(getText());
        }
        int layoutGravity = getLayoutGravity();
        this.o.f26456a = getLayoutWidth();
        this.o.b = getLayoutHeight();
        q26 q26Var = this.o;
        getWeight();
        q26Var.getClass();
        q26 q26Var2 = this.o;
        if (layoutGravity != q26Var2.d) {
            q26Var2.c = kl6.f(DXWidgetNode.getAbsoluteGravity(layoutGravity, getDirection()));
            this.o.d = layoutGravity;
        }
        j jVar = (j) getParentWidget();
        ViewGroup.LayoutParams layoutParams2 = editText.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = jVar.generateLayoutParams(this.o);
        } else {
            layoutParams = jVar.generateLayoutParams(this.o, layoutParams2);
        }
        editText.setLayoutParams(layoutParams);
    }

    @Override // com.taobao.android.dinamicx.widget.q, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else if (j == 5288679823228297259L) {
            int i = jn7.TEXT_WATCHER;
            d dVar = (d) view.getTag(i);
            EditText editText = (EditText) view;
            if (dVar != null) {
                editText.removeTextChangedListener(dVar);
            }
            d dVar2 = new d(this, editText);
            view.setTag(i, dVar2);
            editText.addTextChangedListener(dVar2);
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.q, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof scu)) {
            super.onClone(dXWidgetNode, z);
            scu scuVar = (scu) dXWidgetNode;
            this.k = scuVar.k;
            this.j = scuVar.j;
            this.l = scuVar.l;
            this.m = scuVar.m;
            this.n = scuVar.n;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.q, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        if (this.l == null) {
            this.l = A(getDXRuntimeContext().h());
        }
        return this.l;
    }

    @Override // com.taobao.android.dinamicx.widget.q, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(i);
        int a3 = DXWidgetNode.DXMeasureSpec.a(i2);
        if (this.l == null) {
            this.l = A(getDXRuntimeContext().h());
        }
        if (a2 == 1073741824 && a3 == 1073741824) {
            setMeasuredDimension(i, i2);
            return;
        }
        onBeforeMeasure(this.l);
        this.l.onMeasure(i, i2);
        setMeasuredDimension(this.l.getMeasuredWidthAndState(), Math.max(this.l.getMeasuredHeightAndState(), getMinHeight()));
    }

    @Override // com.taobao.android.dinamicx.widget.q, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        }
    }

    @Override // com.taobao.android.dinamicx.widget.q, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == -1990674490194665048L) {
            this.j = i;
        } else if (j != DXTBBUYTEXTINPUTVIEW_MAXMULTILINEHEIGHT) {
            if (j == DXTBBUYTEXTINPUTVIEW_MAXNUMLINES) {
                this.k = i;
            } else {
                super.onSetIntAttribute(j, i);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.q, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 3;
    }

    @Override // com.taobao.android.dinamicx.widget.q, com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final MeasurableEditText A(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeasurableEditText) ipChange.ipc$dispatch("a210aa54", new Object[]{this, context});
        }
        MeasurableEditText measurableEditText = new MeasurableEditText(context);
        measurableEditText.setImeOptions(6);
        measurableEditText.setEllipsize(null);
        measurableEditText.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        measurableEditText.setHint(getPlaceholder());
        measurableEditText.setHintTextColor(tryFetchDarkModeColor(Constants.Name.PLACEHOLDER_COLOR, 0, getPlaceholderColor()));
        measurableEditText.setText(getText());
        measurableEditText.setTextSize(0, getTextSize());
        measurableEditText.setTextColor(tryFetchDarkModeColor("textColor", 0, getTextColor()));
        measurableEditText.setGravity(16);
        measurableEditText.setCursorVisible(false);
        int i = this.j;
        if (i != 0) {
            B(measurableEditText, i);
        }
        measurableEditText.setOnClickListener(new a(measurableEditText));
        measurableEditText.setOnTouchListener(new b(this, measurableEditText));
        return measurableEditText;
    }

    public void B(EditText editText, int i) {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable[] drawableArr = {editText.getContext().getResources().getDrawable(i2), editText.getContext().getResources().getDrawable(i2)};
            Drawable drawable = drawableArr[0];
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(i, mode);
            drawableArr[1].setColorFilter(i, mode);
            declaredField3.set(obj, drawableArr);
        } catch (Throwable unused) {
            h36.g(h36.TAG, "textInput 游标颜色设置失败");
        }
    }
}
