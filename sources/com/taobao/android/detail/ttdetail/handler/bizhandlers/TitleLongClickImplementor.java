package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.axo;
import tb.ir;
import tb.kc1;
import tb.mr7;
import tb.oa4;
import tb.t2o;
import tb.yc4;
import tb.ze7;
import tb.zre;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TitleLongClickImplementor implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "titleLongClick";

    /* renamed from: a  reason: collision with root package name */
    public final Activity f6823a;
    public final ze7 b;
    public PopupWindow c;
    public View d;
    public final int e;
    public final int f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f6824a;

        public a(b bVar) {
            this.f6824a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            b bVar = this.f6824a;
            JSONArray jSONArray = bVar.b;
            if (jSONArray == null) {
                TitleLongClickImplementor.b(TitleLongClickImplementor.this).dismiss();
                return;
            }
            String str = bVar.d;
            String str2 = bVar.e;
            for (int i = 0; i < jSONArray.size(); i++) {
                TitleLongClickImplementor.c(TitleLongClickImplementor.this, str, str2, jSONArray.getJSONObject(i));
            }
            TitleLongClickImplementor.b(TitleLongClickImplementor.this).dismiss();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public String f6825a;
        public JSONArray b;
        public JSONArray c;
        public String d;
        public String e;

        static {
            t2o.a(912261956);
        }

        public b(TitleLongClickImplementor titleLongClickImplementor) {
        }
    }

    static {
        t2o.a(912261951);
        t2o.a(912261826);
    }

    public TitleLongClickImplementor(Context context, ze7 ze7Var) {
        if (context instanceof Activity) {
            this.f6823a = (Activity) context;
        }
        this.b = ze7Var;
        this.e = mr7.f(this.f6823a);
        this.f = mr7.e(this.f6823a);
    }

    public static /* synthetic */ PopupWindow b(TitleLongClickImplementor titleLongClickImplementor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow) ipChange.ipc$dispatch("6fb78c95", new Object[]{titleLongClickImplementor});
        }
        return titleLongClickImplementor.c;
    }

    public static /* synthetic */ void c(TitleLongClickImplementor titleLongClickImplementor, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2fa329c", new Object[]{titleLongClickImplementor, str, str2, jSONObject});
        } else {
            titleLongClickImplementor.f(str, str2, jSONObject);
        }
    }

    public final View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fe9333c6", new Object[]{this});
        }
        View view = new View(this.f6823a);
        view.setLayoutParams(new LinearLayout.LayoutParams(1, -1));
        view.setBackgroundColor(-1);
        return view;
    }

    public final TextView e(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("2e3711bb", new Object[]{this, bVar});
        }
        if (bVar == null || bVar.f6825a == null) {
            return null;
        }
        TextView textView = new TextView(this.f6823a);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        int a2 = axo.a(this.f6823a, 15.0f);
        int a3 = axo.a(this.f6823a, 8.0f);
        textView.setPadding(a2, a3, a2, a3);
        textView.setText(bVar.f6825a);
        textView.setOnClickListener(new a(bVar));
        return textView;
    }

    public final void h(List<b> list) {
        TextView e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc7bc7e", new Object[]{this, list});
            return;
        }
        View inflate = LayoutInflater.from(this.f6823a).inflate(R.layout.tt_detail_main_title_copypopup_new, (ViewGroup) null);
        this.d = inflate;
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.ll_tab_container);
        this.d.findViewById(R.id.v_triangle).setBackgroundDrawable(new kc1(Color.parseColor("#dd000000")));
        int size = list.size();
        for (int i = 0; i < size; i++) {
            b bVar = list.get(i);
            if (!(bVar == null || (e = e(bVar)) == null)) {
                linearLayout.addView(e);
                if (i != size - 1) {
                    linearLayout.addView(d());
                }
            }
        }
    }

    public final b i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c585fe15", new Object[]{this, jSONObject});
        }
        b bVar = new b(this);
        bVar.f6825a = jSONObject.getString("actionTitle");
        bVar.d = jSONObject.getString("actionType");
        bVar.e = jSONObject.getString("itemId");
        bVar.b = jSONObject.getJSONObject("events").getJSONArray("clickMenu");
        bVar.c = jSONObject.getJSONArray("exposureItem");
        return bVar;
    }

    public final void j(JSONArray jSONArray, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20d6b0", new Object[]{this, jSONArray, view});
        } else if (jSONArray != null) {
            ArrayList arrayList = new ArrayList();
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(i(jSONArray.getJSONObject(i)));
            }
            if (this.c == null) {
                h(arrayList);
                this.d.measure(View.MeasureSpec.makeMeasureSpec(this.e, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f / 3, Integer.MIN_VALUE));
                View view2 = this.d;
                this.c = new PopupWindow(view2, view2.getMeasuredWidth(), this.d.getMeasuredHeight());
            }
            if (this.c.isShowing()) {
                this.c.dismiss();
                this.c.setFocusable(false);
                return;
            }
            if (!this.f6823a.isFinishing()) {
                this.c.showAsDropDown(view, (this.e - this.c.getWidth()) / 2, -(view.getHeight() + this.c.getHeight()));
                this.c.setFocusable(true);
                this.c.update();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                JSONArray jSONArray2 = ((b) it.next()).c;
                if (jSONArray2 != null && !jSONArray2.isEmpty()) {
                    for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                        g(jSONArray2.getJSONObject(i2));
                    }
                }
            }
        }
    }

    public final void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4abd997", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            this.b.b().h(new ir(new JSONObject(jSONObject.getString("type"), jSONObject.getJSONObject("fields")) { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.TitleLongClickImplementor.4
                public final /* synthetic */ String val$eventType;
                public final /* synthetic */ JSONObject val$fields;

                {
                    this.val$eventType = r2;
                    this.val$fields = r3;
                    put("type", (Object) r2);
                    put("fields", (Object) r3);
                }
            }), new RuntimeAbilityParam[0]);
        }
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        oa4 i = yc4.i(runtimeAbilityParamArr);
        if (i == null || (f = i.getComponentData().f()) == null) {
            return false;
        }
        j(f.getJSONArray("titleTapMenus"), yc4.j(runtimeAbilityParamArr));
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        if (r3.equals("userTrack") == false) goto L_0x0051;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.String r8, java.lang.String r9, com.alibaba.fastjson.JSONObject r10) {
        /*
            r7 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.detail.ttdetail.handler.bizhandlers.TitleLongClickImplementor.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r4 = "e586df2c"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r7
            r5[r1] = r8
            r5[r0] = r9
            r8 = 3
            r5[r8] = r10
            r3.ipc$dispatch(r4, r5)
            return
        L_0x001b:
            java.lang.String r3 = "type"
            java.lang.String r3 = r10.getString(r3)
            java.lang.String r4 = "fields"
            com.alibaba.fastjson.JSONObject r10 = r10.getJSONObject(r4)
            java.lang.String r4 = "share"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0046
            tb.ir r4 = new tb.ir
            com.taobao.android.detail.ttdetail.handler.bizhandlers.TitleLongClickImplementor$2 r5 = new com.taobao.android.detail.ttdetail.handler.bizhandlers.TitleLongClickImplementor$2
            r5.<init>(r10)
            r4.<init>(r5)
            tb.ze7 r5 = r7.b
            com.taobao.android.detail.ttdetail.handler.AbilityCenter r5 = r5.b()
            com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam[] r6 = new com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam[r2]
            r5.h(r4, r6)
        L_0x0046:
            if (r10 != 0) goto L_0x0049
            return
        L_0x0049:
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -1263203643: goto L_0x0068;
                case 328712004: goto L_0x005d;
                case 329301056: goto L_0x0053;
                default: goto L_0x0051;
            }
        L_0x0051:
            r0 = -1
            goto L_0x0073
        L_0x0053:
            java.lang.String r1 = "userTrack"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0073
            goto L_0x0051
        L_0x005d:
            java.lang.String r0 = "copyContent"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0066
            goto L_0x0051
        L_0x0066:
            r0 = 1
            goto L_0x0073
        L_0x0068:
            java.lang.String r0 = "openUrl"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0072
            goto L_0x0051
        L_0x0072:
            r0 = 0
        L_0x0073:
            switch(r0) {
                case 0: goto L_0x00c0;
                case 1: goto L_0x008d;
                case 2: goto L_0x0077;
                default: goto L_0x0076;
            }
        L_0x0076:
            return
        L_0x0077:
            tb.ir r8 = new tb.ir
            com.taobao.android.detail.ttdetail.handler.bizhandlers.TitleLongClickImplementor$3 r9 = new com.taobao.android.detail.ttdetail.handler.bizhandlers.TitleLongClickImplementor$3
            r9.<init>(r10)
            r8.<init>(r9)
            tb.ze7 r9 = r7.b
            com.taobao.android.detail.ttdetail.handler.AbilityCenter r9 = r9.b()
            com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam[] r10 = new com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam[r2]
            r9.h(r8, r10)
            goto L_0x00cc
        L_0x008d:
            java.lang.String r0 = "content"
            java.lang.String r10 = r10.getString(r0)
            android.app.Activity r0 = r7.f6823a
            tb.qv3.a(r0, r10)
            if (r9 != 0) goto L_0x009b
            goto L_0x00cc
        L_0x009b:
            java.lang.String r10 = "CopyTitle"
            boolean r10 = r10.equals(r8)
            r0 = 0
            java.lang.String r1 = "1"
            if (r10 == 0) goto L_0x00ae
            com.taobao.alimama.AlimamaAdvertising r8 = com.taobao.alimama.AlimamaAdvertising.instance()
            r8.commitCpsInitiativeAction(r9, r1, r1, r0)
            goto L_0x00cc
        L_0x00ae:
            java.lang.String r10 = "CopyLink"
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto L_0x00cc
            com.taobao.alimama.AlimamaAdvertising r8 = com.taobao.alimama.AlimamaAdvertising.instance()
            java.lang.String r10 = "2"
            r8.commitCpsInitiativeAction(r9, r1, r10, r0)
            goto L_0x00cc
        L_0x00c0:
            java.lang.String r8 = "url"
            java.lang.String r8 = r10.getString(r8)
            android.app.Activity r9 = r7.f6823a
            tb.jov.k(r9, r8)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.handler.bizhandlers.TitleLongClickImplementor.f(java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject):void");
    }
}
