package tb;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.android.dinamicx.expression.event.DXTextInputEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import tb.x1s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a2s extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INPUT_TYPE_DIALOG = "dialog";
    public static final String INPUT_TYPE_INPUT = "input";
    public String C0;

    /* renamed from: a  reason: collision with root package name */
    public String f15514a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public int g;
    public static final String WIDGET_NAME = "tdTextInput";
    public static final long DX_WIDGET_ID = k06.a(WIDGET_NAME);
    public static final int ID_TV_TEXT = R.id.trade_id_text;
    public static final int ID_KEY_BOARD = R.id.trade_id_key_board;
    public static final int ID_MAX_LENGTH = R.id.trade_id_max_length;
    public static final int ID_PLACE_HOLDER = R.id.trade_id_place_holder;
    public static final int ID_PLACE_HOLDER_COLOR = R.id.trade_id_place_holder_color;
    public static final int h = R.id.trade_id_text_watcher;
    public static final long i = k06.a("placeholder");
    public static final long j = k06.a(RemoteMessageConst.INPUT_TYPE);
    public static final long k = k06.a("textUnit");
    public static final long D0 = k06.a("inputTitle");
    public static final long l = k06.a(Constants.Name.PLACEHOLDER_COLOR);
    public static final long m = k06.a("keyboard");
    public static final long n = k06.a(Constants.Name.MAX_LENGTH);
    public static final long o = k06.a("onFinish");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f15515a;
        public final Context b;

        /* compiled from: Taobao */
        /* renamed from: tb.a2s$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class View$OnTouchListenerC0874a implements View.OnTouchListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f15516a;

            /* compiled from: Taobao */
            /* renamed from: tb.a2s$a$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
            public class C0875a implements x1s.c {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public C0875a() {
                }

                @Override // tb.x1s.c
                public void onClick(DialogInterface dialogInterface, CharSequence charSequence) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("bdadd41a", new Object[]{this, dialogInterface, charSequence});
                        return;
                    }
                    View$OnTouchListenerC0874a aVar = View$OnTouchListenerC0874a.this;
                    a aVar2 = a.this;
                    aVar2.e(aVar.f15516a, a.b(aVar2));
                }
            }

            public View$OnTouchListenerC0874a(View view) {
                this.f15516a = view;
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
                x1s x1sVar = new x1s(a.a(a.this));
                x1sVar.j(a2s.a(a2s.this));
                x1sVar.h((EditText) this.f15516a);
                x1sVar.i(new C0875a());
                x1sVar.show();
                return true;
            }
        }

        static {
            t2o.a(301989931);
        }

        public a(Context context, String str) {
            this.b = context;
            this.f15515a = str;
        }

        public static /* synthetic */ Context a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("518c1658", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c6f5f47e", new Object[]{aVar});
            }
            return aVar.f15515a;
        }

        public final void c(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a30575c5", new Object[]{this, view});
                return;
            }
            c cVar = (c) view.getTag(a2s.m0());
            if (cVar != null) {
                ((EditText) view).removeTextChangedListener(cVar);
            }
            EditText editText = (EditText) view;
            c cVar2 = new c(editText, this.f15515a);
            view.setTag(a2s.m0(), cVar2);
            editText.addTextChangedListener(cVar2);
        }

        public void d(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("369e9e1e", new Object[]{this, view});
            } else if (view instanceof EditText) {
                c(view);
                ViewProxy.setOnTouchListener(view, new View$OnTouchListenerC0874a(view));
            }
        }

        public void e(View view, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6aa34c5f", new Object[]{this, view, str});
            } else if ("dialog".equals(str)) {
                ArrayList arrayList = new ArrayList(5);
                arrayList.add("dialog");
                arrayList.add(((EditText) view).getText());
                view.setTag(mgw.DINAMICX_3_CUSTOM_INPUT_KEY, arrayList);
                a2s.n0(a2s.this, ((EditText) view).getText());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(301989930);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new a2s();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final EditText f15518a;
        public final String b;

        static {
            t2o.a(301989934);
        }

        public c(EditText editText, String str) {
            this.f15518a = editText;
            this.b = str;
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
            } else if (this.f15518a.isFocusable() && "input".equals(this.b)) {
                ArrayList arrayList = new ArrayList(5);
                arrayList.add("input");
                arrayList.add(this.f15518a.getText());
                this.f15518a.setTag(sf.ID_DX_INPUT_TAG, arrayList);
                a2s.n0(a2s.this, this.f15518a.getText());
            }
        }
    }

    public static /* synthetic */ String a(a2s a2sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a00db64b", new Object[]{a2sVar});
        }
        return a2sVar.C0;
    }

    public static /* synthetic */ Object ipc$super(a2s a2sVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -732824995:
                super.onBeforeMeasure((TextView) objArr[0]);
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/dinamicX/widget/TDTextInputWidgetNode");
        }
    }

    public static /* synthetic */ int m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b88b92d", new Object[0])).intValue();
        }
        return h;
    }

    public static /* synthetic */ void n0(a2s a2sVar, Editable editable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14aebb43", new Object[]{a2sVar, editable});
        } else {
            a2sVar.w(editable);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new a2s();
    }

    @Override // tb.gi6
    public void onBeforeMeasure(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d451fa5d", new Object[]{this, textView});
            return;
        }
        super.onBeforeMeasure(textView);
        x(textView);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j2)});
            return;
        }
        super.onBindEvent(context, view, j2);
        if (o == j2) {
            new a(context, this.c).d(view);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof a2s) {
            a2s a2sVar = (a2s) dXWidgetNode;
            this.f15514a = a2sVar.f15514a;
            this.d = a2sVar.d;
            this.b = a2sVar.b;
            this.C0 = a2sVar.C0;
            this.e = a2sVar.e;
            this.f = a2sVar.f;
            this.g = a2sVar.g;
            this.c = a2sVar.c;
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        EditText editText = new EditText(context);
        editText.setPadding(0, 0, 0, 0);
        editText.setBackgroundDrawable(null);
        return editText;
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        if (!TextUtils.isEmpty(this.d)) {
            setText(this.f15514a + this.d);
        }
        super.onRenderView(context, view);
        x(view);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j2), new Integer(i2)});
            return;
        }
        super.onSetIntAttribute(j2, i2);
        if (l == j2) {
            this.e = i2;
        } else if (m == j2) {
            this.f = i2;
        } else if (n == j2) {
            this.g = i2;
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j2), str});
            return;
        }
        super.onSetStringAttribute(j2, str);
        if (38178040921L == j2) {
            this.f15514a = str;
        } else if (i == j2) {
            this.b = str;
        } else if (j == j2) {
            this.c = str;
        } else if (k == j2) {
            this.d = str;
        } else if (D0 == j2) {
            this.C0 = str;
        }
    }

    public final void v(EditText editText, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1e8ba", new Object[]{this, editText, new Boolean(z)});
        } else if (editText != null) {
            editText.setFocusable(z);
            editText.setFocusableInTouchMode(z);
        }
    }

    public final void w(Editable editable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f13dcf9", new Object[]{this, editable});
            return;
        }
        DXTextInputEvent dXTextInputEvent = new DXTextInputEvent(o);
        dXTextInputEvent.setText(editable);
        postEvent(dXTextInputEvent);
    }

    public final void x(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("567e6447", new Object[]{this, view});
        } else if (view instanceof EditText) {
            view.setTag(ID_TV_TEXT, this.f15514a);
            EditText editText = (EditText) view;
            xn7.b(editText, this.e);
            view.setTag(ID_PLACE_HOLDER_COLOR, Integer.valueOf(this.e));
            xn7.c(editText, this.f);
            view.setTag(ID_KEY_BOARD, Integer.valueOf(this.f));
            xn7.d(editText, this.g);
            view.setTag(ID_MAX_LENGTH, Integer.valueOf(this.g));
            if (!TextUtils.isEmpty(this.b)) {
                xn7.a(editText, this.b);
                view.setTag(ID_PLACE_HOLDER, this.b);
            }
            if (!TextUtils.isEmpty(this.c)) {
                v(editText, "input".equalsIgnoreCase(this.c));
            }
        }
    }

    static {
        t2o.a(301989929);
    }
}
