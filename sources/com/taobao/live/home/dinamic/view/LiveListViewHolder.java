package com.taobao.live.home.dinamic.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.LiveHomeController;
import com.taobao.live.home.base.BaseViewHolder;
import com.taobao.live.home.dinamic.model.DinamicDataObject;
import com.taobao.live.home.dinamic.model.TemplateObject;
import com.taobao.taobao.R;
import java.util.HashMap;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.am7;
import tb.e2h;
import tb.eqd;
import tb.l00;
import tb.r0h;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LiveListViewHolder extends BaseViewHolder<IMTOPDataObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String f = LiveListViewHolder.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final Context f10959a;
    public final ViewGroup b;
    public am7 c;
    public eqd d;
    public final Rect e = new Rect();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements l00.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(l00 l00Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8294106b", new Object[]{this, l00Var});
            } else {
                r0h.b(LiveListViewHolder.e0(), "Dinamic card inflate fail.");
            }
        }

        public void b(l00 l00Var, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71f55392", new Object[]{this, l00Var, view});
                return;
            }
            if (LiveListViewHolder.c0(LiveListViewHolder.this) != null) {
                LiveListViewHolder.c0(LiveListViewHolder.this).setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                LiveListViewHolder.c0(LiveListViewHolder.this).removeAllViews();
                LiveListViewHolder.c0(LiveListViewHolder.this).addView(view);
            }
            LiveListViewHolder.d0(LiveListViewHolder.this).m();
            if (!e2h.n()) {
                LiveListViewHolder.d0(LiveListViewHolder.this).o();
            }
            LiveListViewHolder.d0(LiveListViewHolder.this).l(true);
            LiveListViewHolder.this.i0();
        }
    }

    static {
        t2o.a(806355451);
    }

    public LiveListViewHolder(Context context, ViewGroup viewGroup, int i) {
        super(viewGroup, i);
        this.f10959a = context;
        View view = this.itemView;
        if (view != null) {
            ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.live_dinamic_card_container);
            this.b = viewGroup2;
            viewGroup2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        }
    }

    public static /* synthetic */ ViewGroup c0(LiveListViewHolder liveListViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("24f8ccb4", new Object[]{liveListViewHolder});
        }
        return liveListViewHolder.b;
    }

    public static /* synthetic */ am7 d0(LiveListViewHolder liveListViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (am7) ipChange.ipc$dispatch("ecf96313", new Object[]{liveListViewHolder});
        }
        return liveListViewHolder.c;
    }

    public static /* synthetic */ String e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("682607c7", new Object[0]);
        }
        return f;
    }

    public static /* synthetic */ Object ipc$super(LiveListViewHolder liveListViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/view/LiveListViewHolder");
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        am7 am7Var = this.c;
        if (am7Var != null) {
            am7Var.a();
        }
    }

    public void f0(IMTOPDataObject iMTOPDataObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79b11129", new Object[]{this, iMTOPDataObject, new Integer(i)});
        } else if (iMTOPDataObject instanceof DinamicDataObject) {
            DinamicDataObject dinamicDataObject = (DinamicDataObject) iMTOPDataObject;
            dinamicDataObject.mPosition = i;
            HashMap<String, JSONObject> hashMap = dinamicDataObject.data;
            if (hashMap != null) {
                JSONObject jSONObject = hashMap.get("data");
                if (jSONObject != null) {
                    jSONObject.put("index", (Object) Integer.valueOf(i));
                }
                am7 am7Var = this.c;
                if (am7Var != null) {
                    if (dinamicDataObject == am7Var.j()) {
                        this.c.d();
                        onDidAppear();
                        this.c.h();
                        if (!e2h.n()) {
                            this.c.o();
                        }
                        this.c.l(true);
                        this.c.e();
                        i0();
                        this.c.m();
                        return;
                    }
                    TemplateObject template = LiveHomeController.instance().getTemplate(dinamicDataObject.templateName);
                    if (!(this.c.j() == null || template == null || !template.equals(this.c.k()))) {
                        this.c.d();
                        onDidAppear();
                        this.c.r(dinamicDataObject);
                        this.c.h();
                        if (!e2h.n()) {
                            this.c.o();
                        }
                        this.c.l(true);
                        this.c.e();
                        i0();
                        this.c.m();
                        return;
                    }
                }
                am7 am7Var2 = new am7(dinamicDataObject, this.f10959a, this.b);
                this.c = am7Var2;
                am7Var2.t(this.d);
                this.c.u(LiveHomeController.instance().getTemplate(dinamicDataObject.templateName));
                this.c.g(new a());
                this.c.n();
            }
        }
    }

    public DinamicDataObject g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicDataObject) ipChange.ipc$dispatch("26a54eaa", new Object[]{this});
        }
        am7 am7Var = this.c;
        if (am7Var == null) {
            return null;
        }
        return am7Var.j();
    }

    public float h0() {
        int height;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf11fc60", new Object[]{this})).floatValue();
        }
        View view = this.itemView;
        if (view == null || (height = view.getHeight()) == 0) {
            return 0.0f;
        }
        this.itemView.getLocalVisibleRect(this.e);
        return (this.e.height() * 1.0f) / height;
    }

    public void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321cdedb", new Object[]{this});
            return;
        }
        am7 am7Var = this.c;
        if (am7Var != null) {
            am7Var.p();
        }
    }

    public void j0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d55950", new Object[]{this, new Integer(i)});
        } else if (i != 1 && i != 2) {
        } else {
            if (h0() < 0.2f) {
                k0();
                onDidAppear();
                return;
            }
            l0();
            i0();
        }
    }

    public void k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        am7 am7Var = this.c;
        if (am7Var != null) {
            am7Var.d();
        }
    }

    public void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        am7 am7Var = this.c;
        if (am7Var != null) {
            am7Var.e();
        }
    }

    public void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("319962e", new Object[]{this});
            return;
        }
        am7 am7Var = this.c;
        if (am7Var != null) {
            am7Var.s();
        }
    }

    public void n0(eqd eqdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("705b98dd", new Object[]{this, eqdVar});
        } else {
            this.d = eqdVar;
        }
    }

    public void o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c2756a9", new Object[]{this});
            return;
        }
        am7 am7Var = this.c;
        if (am7Var != null) {
            am7Var.w();
        }
    }

    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        am7 am7Var = this.c;
        if (am7Var != null) {
            am7Var.q();
        }
    }

    public void onScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
        } else if (i == 0 && e2h.g()) {
            l0();
            am7 am7Var = this.c;
            if (am7Var != null) {
                am7Var.p();
            }
        }
    }
}
