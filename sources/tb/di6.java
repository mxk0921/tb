package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXTextInputEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.q;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class di6 extends q implements hwb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXORDERTEXTINPUTVIEWCHEN_CURSORCOLOR = -1990674490194665048L;
    public static final long DXTEXTINPUTVIEW_COUNTNUMCOLOR = 9071837297406208101L;
    public static final long DXTEXTINPUTVIEW_ISSHOWHINTNUM = 2472129721305181261L;
    public static final long DXTEXTINPUTVIEW_ISSINGLELINE = 9201315914461489362L;
    public static final long DXTEXTINPUTVIEW_MULTILINEMAXHEIGHT = 2175688563532828996L;
    public static final long DXTEXTINPUTVIEW_TEXTINPUTVIEW = -7398276613927103139L;
    public static final long DXTEXTINPUTVIEW_TOTALNUMCOLOR = 36296692771444064L;
    public int j;
    public int l;
    public int m;
    public int n;
    public boolean k = true;
    public boolean o = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ EditText f17836a;

        public a(EditText editText) {
            this.f17836a = editText;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            this.f17836a.requestFocus();
            this.f17836a.setCursorVisible(true);
            di6.t(di6.this, this.f17836a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextView f17837a;
        public final /* synthetic */ View b;
        public final /* synthetic */ EditText c;

        public b(TextView textView, View view, EditText editText) {
            this.f17837a = textView;
            this.b = view;
            this.c = editText;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.c.setMaxHeight((this.b.getHeight() - this.f17837a.getMeasuredHeight()) - ((RelativeLayout.LayoutParams) this.f17837a.getLayoutParams()).bottomMargin);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ EditText f17838a;

        public c(di6 di6Var, EditText editText) {
            this.f17838a = editText;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            if (motionEvent.getActionMasked() == 1) {
                this.f17838a.setCursorVisible(true);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597404);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new di6();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final di6 f17839a;
        public final View b;
        public final DXTextInputEvent c = new DXTextInputEvent(5288679823228297259L);

        static {
            t2o.a(444597405);
        }

        public e(di6 di6Var, View view) {
            this.f17839a = di6Var;
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
            View view = this.b;
            if (view instanceof RelativeLayout) {
                ((TextView) view.findViewById(R.id.tv_word_count)).setText(String.valueOf(charSequence.length()));
                this.c.setText(((EditText) this.b.findViewById(R.id.dx_multi_line_input)).getText());
                this.f17839a.postEvent(this.c);
                return;
            }
            this.c.setText(((EditText) view).getText());
            this.f17839a.postEvent(this.c);
        }
    }

    static {
        t2o.a(444597400);
        t2o.a(444597457);
    }

    public static /* synthetic */ Object ipc$super(di6 di6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXTextInputViewWidgetNode");
        }
    }

    public static /* synthetic */ void t(di6 di6Var, EditText editText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74fb3dd5", new Object[]{di6Var, editText});
        } else {
            di6Var.v(editText);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.q, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new di6();
    }

    @Override // tb.hwb
    public Object getNodePropByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ad97ad4", new Object[]{this, str});
        }
        if (!"inputText".equals(str)) {
            return null;
        }
        View D = getDXRuntimeContext().D();
        if (D instanceof RelativeLayout) {
            return ((EditText) D.findViewById(R.id.dx_multi_line_input)).getText();
        }
        return ((EditText) D).getText();
    }

    @Override // com.taobao.android.dinamicx.widget.q, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else if (j != 5288679823228297259L) {
            super.onBindEvent(context, view, j);
        } else if (view instanceof EditText) {
            super.onBindEvent(context, view, j);
        } else {
            int i = jn7.TEXT_WATCHER;
            e eVar = (e) view.getTag(i);
            EditText editText = (EditText) view.findViewById(R.id.dx_multi_line_input);
            if (eVar != null) {
                editText.removeTextChangedListener(eVar);
            }
            e eVar2 = new e(this, view);
            view.setTag(i, eVar2);
            editText.addTextChangedListener(eVar2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.q, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof di6) {
            di6 di6Var = (di6) dXWidgetNode;
            this.j = di6Var.j;
            this.k = di6Var.k;
            this.l = di6Var.l;
            this.o = di6Var.o;
            this.m = di6Var.m;
            this.n = di6Var.n;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.q, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        if (this.k) {
            return super.onCreateView(context);
        }
        View a2 = xb6.a(context, R.layout.multi_line_input_view);
        ((EditText) a2.findViewById(R.id.dx_multi_line_input)).setBackgroundColor(0);
        if (this.o) {
            ((TextView) a2.findViewById(R.id.tv_word_total)).setVisibility(0);
            ((TextView) a2.findViewById(R.id.tv_word_count)).setVisibility(0);
        }
        return a2;
    }

    @Override // com.taobao.android.dinamicx.widget.q, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!this.k) {
            setMeasuredDimension(i, this.j);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.q, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXTEXTINPUTVIEW_MULTILINEMAXHEIGHT) {
            this.j = i;
        } else if (j == -1990674490194665048L) {
            this.l = i;
        } else if (j == DXTEXTINPUTVIEW_COUNTNUMCOLOR) {
            this.m = i;
        } else if (j == DXTEXTINPUTVIEW_TOTALNUMCOLOR) {
            this.n = i;
        } else if (j == DXTEXTINPUTVIEW_ISSINGLELINE) {
            if (i == 0) {
                z = false;
            }
            this.k = z;
        } else if (j == DXTEXTINPUTVIEW_ISSHOWHINTNUM) {
            if (i == 0) {
                z = false;
            }
            this.o = z;
        } else {
            super.onSetIntAttribute(j, i);
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

    public final void v(EditText editText) {
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

    @Override // com.taobao.android.dinamicx.widget.q, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view == null) {
        } else {
            if ((view instanceof EditText) || (view instanceof RelativeLayout)) {
                if (!this.k) {
                    editText = (EditText) view.findViewById(R.id.dx_multi_line_input);
                    TextView textView = (TextView) view.findViewById(R.id.tv_word_total);
                    if (this.f > 0) {
                        textView.setText("/" + this.f);
                    }
                    int i = this.m;
                    if (i != 0) {
                        ((TextView) view.findViewById(R.id.tv_word_count)).setTextColor(tryFetchDarkModeColor("textColor", 0, i));
                    }
                    int i2 = this.n;
                    if (i2 != 0) {
                        textView.setTextColor(tryFetchDarkModeColor("textColor", 0, i2));
                    }
                    ViewProxy.setOnClickListener(view, new a(editText));
                    if (this.o) {
                        view.post(new b(textView, view, editText));
                    }
                } else {
                    editText = (EditText) view;
                    setKeyBoardType(editText, this.e);
                }
                editText.setHint(this.g);
                editText.setHintTextColor(tryFetchDarkModeColor(Constants.Name.PLACEHOLDER_COLOR, 0, this.h));
                editText.setText(this.f7457a);
                editText.setTextSize(0, this.c);
                editText.setTextColor(tryFetchDarkModeColor("textColor", 0, this.b));
                setNativeTextGravity(editText, this.d);
                editText.setCursorVisible(false);
                int i3 = this.l;
                if (i3 != 0) {
                    u(editText, i3);
                }
                editText.setOnTouchListener(new c(this, editText));
                if (this.f <= 0) {
                    editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Integer.MAX_VALUE)});
                } else {
                    editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f)});
                }
            }
        }
    }

    public void u(EditText editText, int i) {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
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
            } else {
                editText.setTextCursorDrawable(new ColorDrawable(i));
            }
        } catch (Throwable unused) {
            h36.g(h36.TAG, "textInput 游标颜色设置失败");
        }
    }
}
