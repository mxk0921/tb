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
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import tb.y1s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class z1s extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INPUT_TYPE_DIALOG = "dialog";
    public static final String INPUT_TYPE_INPUT = "input";

    /* renamed from: a  reason: collision with root package name */
    public String f32466a;
    public String b;
    public int c;
    public int d;
    public int e;
    public String f;
    public String g;
    public static final long DX_WIDGET_ID = k06.a(a2s.WIDGET_NAME);
    public static final long h = k06.a("placeholder");
    public static final long i = k06.a(Constants.Name.PLACEHOLDER_COLOR);
    public static final long j = k06.a("keyboard");
    public static final long k = k06.a(Constants.Name.MAX_LENGTH);
    public static final long l = k06.a(RemoteMessageConst.INPUT_TYPE);
    public static final long m = k06.a("textUnit");
    public static final long n = k06.a("onFinish");
    public static final int ID_TV_TEXT = R.id.trade_id_text;
    public static final int ID_KEY_BOARD = R.id.trade_id_key_board;
    public static final int ID_MAX_LENGTH = R.id.trade_id_max_length;
    public static final int ID_PLACE_HOLDER = R.id.trade_id_place_holder;
    public static final int ID_PLACE_HOLDER_COLOR = R.id.trade_id_place_holder_color;
    public static final int o = R.id.trade_text_watcher;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(155189286);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new z1s();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f32467a;

        static {
            t2o.a(155189287);
        }

        public b(String str) {
            this.f32467a = str;
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("da94a8a1", new Object[]{bVar});
            }
            return bVar.f32467a;
        }

        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("369e9e1e", new Object[]{this, view});
            } else if (view instanceof EditText) {
                c cVar = (c) view.getTag(z1s.t());
                if (cVar != null) {
                    ((EditText) view).removeTextChangedListener(cVar);
                }
                c cVar2 = new c(view, this.f32467a);
                view.setTag(z1s.t(), cVar2);
                ((EditText) view).addTextChangedListener(cVar2);
                ViewProxy.setOnTouchListener(view, new a(view));
            }
        }

        public void c(View view, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6aa34c5f", new Object[]{this, view, str});
            } else if ("dialog".equals(str)) {
                ArrayList arrayList = new ArrayList(5);
                arrayList.add("dialog");
                arrayList.add(((EditText) view).getText());
                view.setTag(mgw.DINAMICX_3_CUSTOM_INPUT_KEY, arrayList);
                z1s.this.postEvent(new DXEvent(z1s.u()));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements View.OnTouchListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f32468a;

            /* compiled from: Taobao */
            /* renamed from: tb.z1s$b$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
            public class C1111a implements y1s.c {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public C1111a() {
                }

                @Override // tb.y1s.c
                public void onClick(DialogInterface dialogInterface, CharSequence charSequence) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("bdadd41a", new Object[]{this, dialogInterface, charSequence});
                        return;
                    }
                    a aVar = a.this;
                    b bVar = b.this;
                    bVar.c(aVar.f32468a, b.a(bVar));
                }
            }

            public a(View view) {
                this.f32468a = view;
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
                Context context = view.getContext();
                if (vav.a("ultron", "checkViewContextOnTextInput", true) && (context instanceof bew)) {
                    bew bewVar = (bew) context;
                    if (bewVar.b() != null) {
                        context = bewVar.b();
                    }
                }
                y1s y1sVar = new y1s(context);
                y1sVar.h((EditText) this.f32468a);
                y1sVar.i(new C1111a());
                y1sVar.show();
                return true;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final View f32470a;
        public final String b;

        static {
            t2o.a(155189290);
        }

        public c(View view, String str) {
            this.f32470a = view;
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
            } else if (this.f32470a.isFocusable() && "input".equals(this.b)) {
                ArrayList arrayList = new ArrayList(5);
                arrayList.add("input");
                arrayList.add(((EditText) this.f32470a).getText());
                this.f32470a.setTag(mgw.DINAMICX_3_CUSTOM_INPUT_KEY, arrayList);
                z1s.this.postEvent(new DXEvent(z1s.u()));
            }
        }
    }

    public static /* synthetic */ Object ipc$super(z1s z1sVar, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/dinamicx3/constructor/TDTextInputWidgetNode");
        }
    }

    public static /* synthetic */ int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue();
        }
        return o;
    }

    public static /* synthetic */ long u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26a27ded", new Object[0])).longValue();
        }
        return n;
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new z1s();
    }

    @Override // tb.gi6
    public void onBeforeMeasure(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d451fa5d", new Object[]{this, textView});
            return;
        }
        super.onBeforeMeasure(textView);
        w(textView);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j2)});
            return;
        }
        super.onBindEvent(context, view, j2);
        if (n == j2) {
            new b(this.g).b(view);
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
        if (dXWidgetNode instanceof z1s) {
            z1s z1sVar = (z1s) dXWidgetNode;
            this.f32466a = z1sVar.f32466a;
            this.f = z1sVar.f;
            this.b = z1sVar.b;
            this.c = z1sVar.c;
            this.d = z1sVar.d;
            this.e = z1sVar.e;
            this.g = z1sVar.g;
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
        return editText;
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        if (!TextUtils.isEmpty(this.f)) {
            setText(this.f32466a + this.f);
        }
        super.onRenderView(context, view);
        w(view);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j2), new Integer(i2)});
            return;
        }
        super.onSetIntAttribute(j2, i2);
        if (i == j2) {
            this.c = i2;
        } else if (j == j2) {
            this.d = i2;
        } else if (k == j2) {
            this.e = i2;
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
            this.f32466a = str;
        } else if (h == j2) {
            this.b = str;
        } else if (l == j2) {
            this.g = str;
        } else if (m == j2) {
            this.f = str;
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

    public final void w(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("567e6447", new Object[]{this, view});
        } else if (view instanceof EditText) {
            view.setTag(ID_TV_TEXT, this.f32466a);
            EditText editText = (EditText) view;
            yn7.b(editText, this.c);
            view.setTag(ID_PLACE_HOLDER_COLOR, Integer.valueOf(this.c));
            yn7.c(editText, this.d);
            view.setTag(ID_KEY_BOARD, Integer.valueOf(this.d));
            yn7.d(editText, this.e);
            view.setTag(ID_MAX_LENGTH, Integer.valueOf(this.e));
            if (!TextUtils.isEmpty(this.b)) {
                yn7.a(editText, this.b);
                view.setTag(ID_PLACE_HOLDER, this.b);
            } else if (!TextUtils.isEmpty(this.g)) {
                v(editText, "input".equalsIgnoreCase(this.g));
            }
        }
    }

    static {
        t2o.a(155189285);
    }
}
