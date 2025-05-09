package tb;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import tb.mlt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nlt extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INPUT_TYPE_DIALOG = "dialog";
    public static final String INPUT_TYPE_INPUT = "input";

    /* renamed from: a  reason: collision with root package name */
    public String f24814a;
    public String b;
    public int c;
    public int d;
    public int e;
    public String f;
    public static final long DX_WIDGET_ID = k06.a("skuTextInput");
    public static final long g = k06.a("placeholder");
    public static final long h = k06.a(Constants.Name.PLACEHOLDER_COLOR);
    public static final long i = k06.a("keyboard");
    public static final long j = k06.a(Constants.Name.MAX_LENGTH);
    public static final long k = k06.a(RemoteMessageConst.INPUT_TYPE);
    public static final long l = k06.a("onFinish");
    public static final int ID_TV_TEXT = R.id.sku_id_text;
    public static final int ID_KEY_BOARD = R.id.sku_id_key_board;
    public static final int ID_MAX_LENGTH = R.id.sku_id_max_length;
    public static final int ID_PLACE_HOLDER = R.id.sku_id_place_holder;
    public static final int ID_PLACE_HOLDER_COLOR = R.id.sku_id_place_holder_color;
    public static final int m = R.id.sku_text_watcher;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f24815a;

        /* compiled from: Taobao */
        /* renamed from: tb.nlt$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class View$OnClickListenerC1008a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f24816a;

            /* compiled from: Taobao */
            /* renamed from: tb.nlt$a$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
            public class C1009a implements mlt.c {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public C1009a() {
                }

                @Override // tb.mlt.c
                public void onClick(DialogInterface dialogInterface, CharSequence charSequence) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("bdadd41a", new Object[]{this, dialogInterface, charSequence});
                        return;
                    }
                    View$OnClickListenerC1008a aVar = View$OnClickListenerC1008a.this;
                    a aVar2 = a.this;
                    aVar2.c(aVar.f24816a, a.a(aVar2), charSequence);
                }
            }

            public View$OnClickListenerC1008a(View view) {
                this.f24816a = view;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (!view.isFocusable()) {
                    mlt mltVar = new mlt(view.getContext());
                    mltVar.h((EditText) this.f24816a);
                    mltVar.i(new C1009a());
                    mltVar.show();
                }
            }
        }

        static {
            t2o.a(442499185);
        }

        public a(String str) {
            this.f24815a = str;
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f38a33c6", new Object[]{aVar});
            }
            return aVar.f24815a;
        }

        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("369e9e1e", new Object[]{this, view});
            } else if (view instanceof EditText) {
                b bVar = (b) view.getTag(nlt.t());
                if (bVar != null) {
                    ((EditText) view).removeTextChangedListener(bVar);
                }
                EditText editText = (EditText) view;
                b bVar2 = new b(editText, this.f24815a);
                view.setTag(nlt.t(), bVar2);
                editText.addTextChangedListener(bVar2);
                ViewProxy.setOnClickListener(view, new View$OnClickListenerC1008a(view));
            }
        }

        public void c(View view, String str, CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a473c403", new Object[]{this, view, str, charSequence});
            } else if ("dialog".equals(str)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(String.valueOf(charSequence));
                view.setTag(mgw.DINAMICX_3_CUSTOM_INPUT_KEY, arrayList);
                nlt.this.postEvent(new DXEvent(nlt.u()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final EditText f24818a;
        public final String b;

        static {
            t2o.a(442499188);
        }

        public b(EditText editText, String str) {
            this.f24818a = editText;
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
            } else if (this.f24818a.isFocusable() && "input".equals(this.b)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(String.valueOf(this.f24818a.getText()));
                this.f24818a.setTag(mgw.DINAMICX_3_CUSTOM_INPUT_KEY, arrayList);
                nlt.this.postEvent(new DXEvent(nlt.u()));
            }
        }
    }

    public static /* synthetic */ Object ipc$super(nlt nltVar, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/dinamicx/widget/TextInputWidgetNode");
        }
    }

    public static /* synthetic */ int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue();
        }
        return m;
    }

    public static /* synthetic */ long u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26a27ded", new Object[0])).longValue();
        }
        return l;
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        if (cjz.a()) {
            SkuLogUtils.x("TextInputWidgetNode.build");
        }
        return new nlt();
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
        if (l == j2) {
            new a(this.f).b(view);
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
        if (dXWidgetNode instanceof nlt) {
            nlt nltVar = (nlt) dXWidgetNode;
            this.f24814a = nltVar.f24814a;
            this.b = nltVar.b;
            this.c = nltVar.c;
            this.d = nltVar.d;
            this.e = nltVar.e;
            this.f = nltVar.f;
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
        if (h == j2) {
            this.c = i2;
        } else if (i == j2) {
            this.d = i2;
        } else if (j == j2) {
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
            this.f24814a = str;
        } else if (g == j2) {
            this.b = str;
        } else if (k == j2) {
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
            view.setTag(ID_TV_TEXT, this.f24814a);
            EditText editText = (EditText) view;
            ao7.b(editText, this.c);
            view.setTag(ID_PLACE_HOLDER_COLOR, Integer.valueOf(this.c));
            ao7.c(editText, this.d);
            view.setTag(ID_KEY_BOARD, Integer.valueOf(this.d));
            ao7.d(editText, this.e);
            view.setTag(ID_MAX_LENGTH, Integer.valueOf(this.e));
            if (!TextUtils.isEmpty(this.b)) {
                ao7.a(editText, this.b);
                view.setTag(ID_PLACE_HOLDER, this.b);
            } else if (!TextUtils.isEmpty(this.f)) {
                v(editText, "input".equalsIgnoreCase(this.f));
            }
        }
    }

    static {
        t2o.a(442499183);
    }
}
