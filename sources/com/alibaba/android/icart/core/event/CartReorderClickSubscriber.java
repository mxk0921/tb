package com.alibaba.android.icart.core.event;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.icart.core.data.DataBizContext;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.be3;
import tb.cb4;
import tb.fsb;
import tb.juv;
import tb.kcu;
import tb.kmb;
import tb.lcu;
import tb.lmb;
import tb.t2o;
import tb.ub3;
import tb.ux;
import tb.zxb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CartReorderClickSubscriber extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String m = Localization.q(R.string.taobao_app_1028_1_21662);
    public static final String n = Localization.q(R.string.taobao_app_1028_1_21655);
    public InputDialog l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class InputDialog extends Dialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public EditText f2195a;
        public View.OnClickListener b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(InputDialog inputDialog) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class b implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    InputDialog.this.dismiss();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class c implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    InputDialog.this.dismiss();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                InputDialog.b(InputDialog.this).requestFocus();
                InputMethodManager inputMethodManager = (InputMethodManager) InputDialog.this.getContext().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.toggleSoftInput(1, 2);
                }
            }
        }

        static {
            t2o.a(479199407);
        }

        public InputDialog(Activity activity) {
            super(activity, R.style.CartICartEditGroupNameDialog);
        }

        public static /* synthetic */ View.OnClickListener a(InputDialog inputDialog) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View.OnClickListener) ipChange.ipc$dispatch("dc5fb4dd", new Object[]{inputDialog});
            }
            return inputDialog.b;
        }

        public static /* synthetic */ EditText b(InputDialog inputDialog) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EditText) ipChange.ipc$dispatch("8af23c02", new Object[]{inputDialog});
            }
            return inputDialog.f2195a;
        }

        public static /* synthetic */ Object ipc$super(InputDialog inputDialog, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -641568046) {
                super.onCreate((Bundle) objArr[0]);
                return null;
            } else if (hashCode == -340027132) {
                super.show();
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/icart/core/event/CartReorderClickSubscriber$InputDialog");
            }
        }

        public final void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("847be2a0", new Object[]{this, str});
            } else if (this.f2195a == null) {
            } else {
                if (!TextUtils.isEmpty(str)) {
                    this.f2195a.setText(str);
                    this.f2195a.setSelection(str.length());
                    return;
                }
                this.f2195a.setText("");
            }
        }

        public void d(View.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2590c6e8", new Object[]{this, onClickListener});
            } else {
                this.b = onClickListener;
            }
        }

        public void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20d609ce", new Object[]{this, str});
                return;
            }
            super.show();
            c(str);
            f();
        }

        public final void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5fd2fa4a", new Object[]{this});
            } else {
                this.f2195a.postDelayed(new d(), 200L);
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
                return;
            }
            super.onCreate(bundle);
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.icart_alert_input, (ViewGroup) null);
            setContentView(inflate);
            ViewProxy.setOnClickListener(inflate, new a(this));
            Window window = getWindow();
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.clearFlags(131080);
            window.setSoftInputMode(18);
            EditText editText = (EditText) inflate.findViewById(R.id.edit_text);
            this.f2195a = editText;
            editText.setHint(CartReorderClickSubscriber.v());
            this.f2195a.setInputType(1);
            this.f2195a.setImeOptions(4);
            ViewProxy.setOnClickListener(inflate.findViewById(R.id.close_btn), new b());
            this.f2195a.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.alibaba.android.icart.core.event.CartReorderClickSubscriber.InputDialog.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.TextView.OnEditorActionListener
                public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i), keyEvent})).booleanValue();
                    }
                    if (i != 4) {
                        return false;
                    }
                    if (TextUtils.isEmpty(textView.getText().toString().trim())) {
                        be3.c(InputDialog.this.getContext(), CartReorderClickSubscriber.w());
                        ub3.f(CartReorderClickSubscriber.w());
                        return true;
                    }
                    InputDialog.this.dismiss();
                    if (InputDialog.a(InputDialog.this) != null) {
                        InputDialog.a(InputDialog.this).onClick(textView);
                    }
                    return true;
                }
            });
            ViewProxy.setOnClickListener(inflate, new c());
            f();
        }

        @Override // android.app.Dialog
        public void show() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            } else {
                e("");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f2199a;
        public final /* synthetic */ String b;

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.android.icart.core.event.CartReorderClickSubscriber$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class C0067a extends ux {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0067a() {
            }

            public static /* synthetic */ Object ipc$super(C0067a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartReorderClickSubscriber$1$1");
            }

            @Override // tb.ojd
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                    return;
                }
                CartReorderClickSubscriber.A(CartReorderClickSubscriber.this).getFields().put("title", (Object) a.this.b);
                CartReorderClickSubscriber.B(CartReorderClickSubscriber.this).e().D();
            }

            @Override // tb.ojd
            public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                }
            }
        }

        public a(String str, String str2) {
            this.f2199a = str;
            this.b = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (view instanceof EditText) {
                String obj = ((EditText) view).getText().toString();
                JSONObject p = CartReorderClickSubscriber.p(CartReorderClickSubscriber.this);
                p.clear();
                p.put("type", (Object) this.f2199a);
                p.put("name", (Object) obj);
                p.put("fromBundleId", (Object) cb4.p(CartReorderClickSubscriber.q(CartReorderClickSubscriber.this)));
                DataBizContext.CartGroupContext h = CartReorderClickSubscriber.x(CartReorderClickSubscriber.this).B().h();
                if (h != null) {
                    h.setName(obj);
                }
                if (!cb4.O(CartReorderClickSubscriber.y(CartReorderClickSubscriber.this))) {
                    CartReorderClickSubscriber.z(CartReorderClickSubscriber.this).e().D();
                } else {
                    CartReorderClickSubscriber.C(CartReorderClickSubscriber.this, new C0067a());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartReorderClickSubscriber$2");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
            }
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
            } else {
                CartReorderClickSubscriber.D(CartReorderClickSubscriber.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ux f2202a;
        public final /* synthetic */ String b;
        public final /* synthetic */ IDMComponent c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    CartReorderClickSubscriber.r(CartReorderClickSubscriber.this).e().K(0);
                }
            }
        }

        public c(ux uxVar, String str, IDMComponent iDMComponent) {
            this.f2202a = uxVar;
            this.b = str;
            this.c = iDMComponent;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartReorderClickSubscriber$3");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            ux uxVar = this.f2202a;
            if (uxVar != null) {
                uxVar.a(i, mtopResponse, obj, z, map);
            }
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                return;
            }
            ux uxVar = this.f2202a;
            if (uxVar != null) {
                uxVar.b(i, mtopResponse, obj, fsbVar, map);
            }
            if (!"createGroup".equals(this.b) || !"confirmEditGroup".equals(CartReorderClickSubscriber.E(CartReorderClickSubscriber.this).g())) {
                IDMComponent iDMComponent = this.c;
                if (iDMComponent != null) {
                    CartReorderClickSubscriber.t(CartReorderClickSubscriber.this, iDMComponent);
                    return;
                }
                return;
            }
            CartReorderClickSubscriber.s(CartReorderClickSubscriber.this).e().o().post(new a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f2204a;
        public final /* synthetic */ int b;

        public d(RecyclerView recyclerView, int i) {
            this.f2204a = recyclerView;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f2204a.getLayoutManager();
            int m0 = CartReorderClickSubscriber.u(CartReorderClickSubscriber.this).e().m0();
            int measuredHeight = this.f2204a.getMeasuredHeight() / 3;
            UnifyLog.e("CartReorderClickSubscriber", "scrollToLastPositionMiddle scrollY=" + m0 + ",offset=" + measuredHeight);
            if (m0 >= measuredHeight) {
                linearLayoutManager.scrollToPositionWithOffset(this.b, measuredHeight);
            }
        }
    }

    static {
        t2o.a(479199400);
    }

    public static /* synthetic */ IDMComponent A(CartReorderClickSubscriber cartReorderClickSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("c594c096", new Object[]{cartReorderClickSubscriber});
        }
        return cartReorderClickSubscriber.e;
    }

    public static /* synthetic */ kmb B(CartReorderClickSubscriber cartReorderClickSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("b1b4c1fa", new Object[]{cartReorderClickSubscriber});
        }
        return cartReorderClickSubscriber.j;
    }

    public static /* synthetic */ void C(CartReorderClickSubscriber cartReorderClickSubscriber, ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffa42a5", new Object[]{cartReorderClickSubscriber, uxVar});
        } else {
            cartReorderClickSubscriber.M(uxVar);
        }
    }

    public static /* synthetic */ void D(CartReorderClickSubscriber cartReorderClickSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c42c82f", new Object[]{cartReorderClickSubscriber});
        } else {
            cartReorderClickSubscriber.K();
        }
    }

    public static /* synthetic */ lcu E(CartReorderClickSubscriber cartReorderClickSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcu) ipChange.ipc$dispatch("a967f83d", new Object[]{cartReorderClickSubscriber});
        }
        return cartReorderClickSubscriber.f23048a;
    }

    public static /* synthetic */ Object ipc$super(CartReorderClickSubscriber cartReorderClickSubscriber, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartReorderClickSubscriber");
    }

    public static /* synthetic */ JSONObject p(CartReorderClickSubscriber cartReorderClickSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("36c13057", new Object[]{cartReorderClickSubscriber});
        }
        return cartReorderClickSubscriber.c();
    }

    public static /* synthetic */ IDMComponent q(CartReorderClickSubscriber cartReorderClickSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("54af731a", new Object[]{cartReorderClickSubscriber});
        }
        return cartReorderClickSubscriber.e;
    }

    public static /* synthetic */ kmb r(CartReorderClickSubscriber cartReorderClickSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("6e95bd31", new Object[]{cartReorderClickSubscriber});
        }
        return cartReorderClickSubscriber.j;
    }

    public static /* synthetic */ kmb s(CartReorderClickSubscriber cartReorderClickSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("b7acc3d0", new Object[]{cartReorderClickSubscriber});
        }
        return cartReorderClickSubscriber.j;
    }

    public static /* synthetic */ void t(CartReorderClickSubscriber cartReorderClickSubscriber, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a30a36e", new Object[]{cartReorderClickSubscriber, iDMComponent});
        } else {
            cartReorderClickSubscriber.L(iDMComponent);
        }
    }

    public static /* synthetic */ kmb u(CartReorderClickSubscriber cartReorderClickSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("49dad10e", new Object[]{cartReorderClickSubscriber});
        }
        return cartReorderClickSubscriber.j;
    }

    public static /* synthetic */ String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6b45c36", new Object[0]);
        }
        return n;
    }

    public static /* synthetic */ String w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2b5eb15", new Object[0]);
        }
        return m;
    }

    public static /* synthetic */ zxb x(CartReorderClickSubscriber cartReorderClickSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxb) ipChange.ipc$dispatch("b0cc0463", new Object[]{cartReorderClickSubscriber});
        }
        return cartReorderClickSubscriber.k;
    }

    public static /* synthetic */ IDMComponent y(CartReorderClickSubscriber cartReorderClickSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("8d2219d8", new Object[]{cartReorderClickSubscriber});
        }
        return cartReorderClickSubscriber.e;
    }

    public static /* synthetic */ kmb z(CartReorderClickSubscriber cartReorderClickSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("1f86b4bc", new Object[]{cartReorderClickSubscriber});
        }
        return cartReorderClickSubscriber.j;
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbde01", new Object[]{this});
        } else {
            M(new b());
        }
    }

    public final String G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("769aa0f", new Object[]{this, str});
        }
        if ("item".equals(this.e.getTag())) {
            return cb4.r(this.e);
        }
        if ("cancelGroup".equals(str)) {
            return cb4.s(cb4.q(this.e));
        }
        return "";
    }

    public final IDMComponent H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("998df889", new Object[]{this});
        }
        List<IDMComponent> data = this.j.e().t().H().getData();
        int indexOf = data.indexOf(this.e);
        if (indexOf <= 0) {
            return null;
        }
        for (int i = indexOf - 1; i >= 0; i--) {
            IDMComponent iDMComponent = data.get(i);
            if (iDMComponent != null && "item".equals(iDMComponent.getTag())) {
                return data.get(i);
            }
        }
        return null;
    }

    public final IDMComponent I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("ed0131b8", new Object[]{this});
        }
        String string = c().getString("from");
        List<IDMComponent> data = this.j.e().t().H().getData();
        int indexOf = data.indexOf(this.e);
        if (indexOf <= 0) {
            return null;
        }
        for (int i = indexOf - 1; i >= 0; i--) {
            IDMComponent iDMComponent = data.get(i);
            if (iDMComponent != null && "item".equals(iDMComponent.getTag()) && !string.contains(iDMComponent.getFields().getString("cartId"))) {
                return data.get(i);
            }
        }
        return null;
    }

    public final String J(lcu lcuVar) {
        IDMComponent a2;
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e21fab7d", new Object[]{this, lcuVar});
        }
        if (lcuVar == null || (a2 = lcuVar.a()) == null || (fields = a2.getFields()) == null) {
            return null;
        }
        String string = fields.getString("title");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        DataBizContext.CartGroupContext h = this.k.B().h();
        if (h != null) {
            return h.getName();
        }
        return null;
    }

    public final void L(IDMComponent iDMComponent) {
        kcu d2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb48c11", new Object[]{this, iDMComponent});
        } else if (iDMComponent != null && (d2 = this.j.d().d()) != null) {
            List<IDMComponent> a2 = d2.a();
            while (true) {
                if (i >= a2.size()) {
                    i = -1;
                    break;
                }
                IDMComponent iDMComponent2 = a2.get(i);
                if (iDMComponent2 != null && iDMComponent2.getKey() != null && iDMComponent2.getKey().equals(iDMComponent.getKey())) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                RecyclerView recyclerView = (RecyclerView) this.j.e().o();
                recyclerView.post(new d(recyclerView, i));
            }
        }
    }

    public final void M(ux uxVar) {
        String str;
        IDMComponent iDMComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e895a843", new Object[]{this, uxVar});
            return;
        }
        IDMComponent iDMComponent2 = this.e;
        if (iDMComponent2 != null) {
            str = iDMComponent2.getTag();
        } else {
            str = "";
        }
        JSONObject c2 = c();
        juv.a(this.j, "Page_ShoppingCart_" + str + "_reorderClick", juv.f(c2));
        String string = c2.getString("type");
        if ("topGroup".equals(string)) {
            iDMComponent = H();
        } else if ("addItemToGroup".equals(string)) {
            iDMComponent = this.e;
        } else {
            iDMComponent = ("editGroup".equals(string) || "resetGroup".equals(string)) ? I() : null;
        }
        this.j.o0(this.e, this.f23048a, true, new c(uxVar, string, iDMComponent), null);
    }

    public final void N(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40871817", new Object[]{this, str});
            return;
        }
        JSONObject c2 = c();
        String G = G(str);
        String p = cb4.p(this.e);
        if (!TextUtils.isEmpty(G)) {
            c2.put("from", (Object) G);
        }
        c2.put("fromBundleId", (Object) p);
        if (!"joinIntoGroup".equals(str)) {
            c2.put("toBundleId", (Object) p);
        }
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539042b2", new Object[]{this});
            return;
        }
        List<IDMComponent> v = cb4.v(this.d);
        if (v == null || v.isEmpty()) {
            String q = Localization.q(R.string.taobao_app_1028_1_21645);
            be3.c(this.b, q);
            ub3.f(q);
            return;
        }
        c().put("to", (Object) cb4.s(v));
        M(null);
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
        } else if ("settlementClick".equals(this.f23048a.g())) {
            O();
        } else {
            String valueOf = String.valueOf(c().getString("type"));
            N(valueOf);
            if (valueOf.equals("createAndJoinIntoGroup")) {
                F();
            } else if (!valueOf.equals("editGroupName")) {
                M(null);
            } else {
                if (this.l == null) {
                    this.l = new InputDialog(this.j.getContext());
                }
                String J = J(lcuVar);
                this.l.d(new a(valueOf, J));
                this.l.e(J);
            }
        }
    }

    public final void K() {
        IDMComponent i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee311c8", new Object[]{this});
            return;
        }
        String p = cb4.p(this.d.getComponentByName(this.e.getKey()));
        if (p != null && (i = cb4.i(this.d, p)) != null) {
            String str = "editGroup";
            boolean containsKey = i.getEventMap().containsKey(str);
            if (containsKey) {
                i.getExtMap().put("type", 0);
            }
            if (!containsKey) {
                str = "addItemToGroup";
            }
            cb4.f(this.j, i.getKey(), str);
        }
    }
}
