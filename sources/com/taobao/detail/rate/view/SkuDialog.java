package com.taobao.detail.rate.view;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.detail.rate.widget.RateSkuTagLayout;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.dx1;
import tb.fs3;
import tb.gyd;
import tb.mf6;
import tb.pg1;
import tb.r2q;
import tb.rqd;
import tb.s8d;
import tb.uqd;
import tb.zhn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SkuDialog extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View c;
    public TUrlImageView d;
    public TextView e;
    public TextView f;
    public TextView g;
    public LinearLayout h;
    public uqd i;
    public List<RateSkuTagLayout> j;
    public HashMap<Integer, String> k;
    public StringBuilder l;
    public StringBuilder m;
    public rqd o;
    public View p;
    public String q;
    public JSONArray s;
    public JSONObject t;

    /* renamed from: a  reason: collision with root package name */
    public final float f10363a = 1.0f;
    public Map<Integer, String> n = new HashMap();
    public final AtomicBoolean r = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                SkuDialog.this.dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
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
                SkuDialog.this.dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            BitmapDrawable drawable;
            int j;
            Bitmap D;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (!(succPhenixEvent == null || (drawable = succPhenixEvent.getDrawable()) == null || SkuDialog.p2(SkuDialog.this) == null || (D = zhn.D(drawable.getBitmap(), SkuDialog.p2(SkuDialog.this).getWidth(), SkuDialog.p2(SkuDialog.this).getHeight(), j, j, j, (j = zhn.j(12.0f)))) == null)) {
                SkuDialog.p2(SkuDialog.this).setImageBitmap(D);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            SkuDialog.r2(SkuDialog.this);
            if (SkuDialog.s2(SkuDialog.this) != null) {
                SkuDialog.s2(SkuDialog.this).a(-1, null, true, 0, DMComponent.RESET);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (SkuDialog.s2(SkuDialog.this) != null) {
                SkuDialog.s2(SkuDialog.this).a(-1, null, true, 0, "confirm");
            }
            SkuDialog.this.dismiss();
        }
    }

    public static /* synthetic */ String A2(SkuDialog skuDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5efb4cbb", new Object[]{skuDialog});
        }
        return skuDialog.q;
    }

    public static /* synthetic */ void B2(SkuDialog skuDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6530f024", new Object[]{skuDialog});
        } else {
            skuDialog.R2();
        }
    }

    public static /* synthetic */ rqd C2(SkuDialog skuDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rqd) ipChange.ipc$dispatch("d0e813e4", new Object[]{skuDialog});
        }
        return skuDialog.o;
    }

    public static /* synthetic */ Object ipc$super(SkuDialog skuDialog, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == -185779930) {
            super.onCancel((DialogInterface) objArr[0]);
            return null;
        } else if (hashCode == 2089880052) {
            super.onDismiss((DialogInterface) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/detail/rate/view/SkuDialog");
        }
    }

    public static /* synthetic */ TUrlImageView p2(SkuDialog skuDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("e79d1d51", new Object[]{skuDialog});
        }
        return skuDialog.d;
    }

    public static /* synthetic */ void r2(SkuDialog skuDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c639e6a", new Object[]{skuDialog});
        } else {
            skuDialog.E2();
        }
    }

    public static /* synthetic */ uqd s2(SkuDialog skuDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uqd) ipChange.ipc$dispatch("80823332", new Object[]{skuDialog});
        }
        return skuDialog.i;
    }

    public static /* synthetic */ JSONArray u2(SkuDialog skuDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("34bf2b96", new Object[]{skuDialog});
        }
        return skuDialog.s;
    }

    public static /* synthetic */ Map v2(SkuDialog skuDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4b4e913c", new Object[]{skuDialog});
        }
        return skuDialog.n;
    }

    public static /* synthetic */ void z2(SkuDialog skuDialog, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6cdd130", new Object[]{skuDialog, str});
        } else {
            skuDialog.N2(str);
        }
    }

    public void D2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aea6176", new Object[]{this});
            return;
        }
        Map<Integer, String> map = this.n;
        if (map != null) {
            map.clear();
        }
    }

    public void J2(int i, boolean z, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd5b713", new Object[]{this, new Integer(i), new Boolean(z), list});
            return;
        }
        List<RateSkuTagLayout> list2 = this.j;
        if (list2 != null && i < list2.size()) {
            this.j.get(i).setCanSelect(z, list);
        }
    }

    public void K2(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4457adb", new Object[]{this, jSONArray});
        } else {
            this.s = jSONArray;
        }
    }

    public void M2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511b5446", new Object[]{this, jSONObject});
        } else {
            this.t = jSONObject;
        }
    }

    public final void N2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071ba0b", new Object[]{this, str});
            return;
        }
        TUrlImageView tUrlImageView = this.d;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(str);
        }
    }

    public void O2(uqd uqdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a8fe317", new Object[]{this, uqdVar});
        } else {
            this.i = uqdVar;
        }
    }

    public void Q2(rqd rqdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b6a7cd2", new Object[]{this, rqdVar});
        } else {
            this.o = rqdVar;
        }
    }

    public final void R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5caab15a", new Object[]{this});
            return;
        }
        this.l = new StringBuilder();
        if (this.k.size() == this.n.size()) {
            for (int i = 0; i < this.k.size(); i++) {
                StringBuilder sb = this.l;
                sb.append("\"");
                sb.append(this.k.get(Integer.valueOf(i)));
                sb.append("\"  ");
            }
            this.g.setVisibility(8);
            if (this.n.size() == 0) {
                this.f.setVisibility(8);
            } else {
                this.f.setVisibility(0);
            }
            TextView textView = this.f;
            textView.setText(dx1.b(R.string.rate_select_1) + ((Object) this.l));
            return;
        }
        this.m = new StringBuilder();
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            if (this.n.containsKey(Integer.valueOf(i2))) {
                StringBuilder sb2 = this.l;
                sb2.append("\"");
                sb2.append(this.k.get(Integer.valueOf(i2)));
                sb2.append("\"  ");
            } else {
                StringBuilder sb3 = this.m;
                sb3.append(this.k.get(Integer.valueOf(i2)));
                sb3.append("  ");
            }
        }
        if (this.n.size() == 0) {
            this.f.setVisibility(8);
        } else {
            this.f.setVisibility(0);
        }
        TextView textView2 = this.f;
        textView2.setText(dx1.b(R.string.rate_select_1) + ((Object) this.l));
        this.g.setVisibility(0);
        TextView textView3 = this.g;
        textView3.setText(dx1.b(R.string.rate_please_select_1) + ((Object) this.m));
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
            return;
        }
        super.onCancel(dialogInterface);
        this.r.set(false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setStyle(0, R.style.Theme_RateSKUDialog);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            return;
        }
        super.onDismiss(dialogInterface);
        this.r.set(false);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc71dc71", new Object[]{this, fragmentManager, str});
        } else if (this.r.compareAndSet(false, true)) {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            if (isAdded()) {
                beginTransaction.remove(this).commit();
                return;
            }
            beginTransaction.setTransition(4097);
            beginTransaction.add(this, str);
            beginTransaction.commitAllowingStateLoss();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements gyd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RateSkuTagLayout f10369a;

        public f(RateSkuTagLayout rateSkuTagLayout) {
            this.f10369a = rateSkuTagLayout;
        }

        @Override // tb.gyd
        public void a(String str, boolean z, int i, Object obj) {
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("555fd6d7", new Object[]{this, str, new Boolean(z), new Integer(i), obj});
                return;
            }
            while (true) {
                if (i2 >= SkuDialog.u2(SkuDialog.this).size()) {
                    break;
                }
                JSONObject jSONObject = SkuDialog.u2(SkuDialog.this).getJSONObject(i2);
                if (jSONObject == null || !jSONObject.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID).equals(str)) {
                    i2++;
                } else if (z) {
                    SkuDialog.v2(SkuDialog.this).put(Integer.valueOf(i2), jSONObject.getString("name"));
                } else {
                    SkuDialog.v2(SkuDialog.this).remove(Integer.valueOf(i2));
                }
            }
            if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2.getString("image") instanceof String) {
                    String string = jSONObject2.getString("image");
                    if (!z) {
                        SkuDialog skuDialog = SkuDialog.this;
                        SkuDialog.z2(skuDialog, SkuDialog.A2(skuDialog));
                    } else if (!TextUtils.isEmpty(string)) {
                        SkuDialog.z2(SkuDialog.this, string);
                    }
                }
            }
            SkuDialog.B2(SkuDialog.this);
            if (SkuDialog.s2(SkuDialog.this) != null) {
                SkuDialog.s2(SkuDialog.this).a(this.f10369a.getPostion(), str, z, i, obj);
            }
        }
    }

    public final void E2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd36a71b", new Object[]{this});
            return;
        }
        ((HashMap) this.n).clear();
        if (this.s != null) {
            for (int i = 0; i < this.s.size(); i++) {
                JSONObject jSONObject = this.s.getJSONObject(i);
                if (jSONObject != null) {
                    JSONArray jSONArray = jSONObject.getJSONArray(pg1.ATOM_values);
                    for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                        jSONArray.getJSONObject(i2).put(mf6.TYPE_SELECTED, (Object) Boolean.FALSE);
                    }
                    ((RateSkuTagLayout) ((ArrayList) this.j).get(i)).setData(jSONObject);
                    ((RateSkuTagLayout) ((ArrayList) this.j).get(i)).reset();
                }
            }
        }
        R2();
        View view = this.p;
        if (view != null) {
            view.postDelayed(new r2q(this), 100L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = layoutInflater.inflate(R.layout.rate_sku_fragment, (ViewGroup) null);
        this.p = inflate;
        inflate.findViewById(R.id.skv_container).setBackground(new fs3(-1, 50, 50, 0, 0));
        if (this.k == null) {
            this.k = new HashMap<>();
        }
        if (this.n == null) {
            this.n = new HashMap();
        }
        View findViewById = this.p.findViewById(R.id.sku_dialog_close);
        this.c = findViewById;
        findViewById.setContentDescription(dx1.b(R.string.rate_accessibility_close_button));
        ViewProxy.setOnClickListener(this.c, new a());
        ViewProxy.setOnClickListener(this.p, new b());
        this.d = (TUrlImageView) this.p.findViewById(R.id.sku_item_pic);
        this.e = (TextView) this.p.findViewById(R.id.sku_item_title);
        JSONObject jSONObject = this.t;
        if (jSONObject != null) {
            String string = jSONObject.getString("image");
            this.q = string;
            if (!TextUtils.isEmpty(string)) {
                this.d.succListener(new c());
                this.d.setImageUrl(this.q);
            }
            if (!TextUtils.isEmpty(this.t.getString("title"))) {
                this.e.setText(this.t.getString("title"));
            }
        }
        this.f = (TextView) this.p.findViewById(R.id.sku_selected_sku);
        TextView textView = (TextView) this.p.findViewById(R.id.sku_select_sku_tip);
        this.g = textView;
        textView.setVisibility(8);
        ((TextView) this.p.findViewById(R.id.rate_sku_reset)).setOnClickListener(new d());
        ((TextView) this.p.findViewById(R.id.rate_sku_confirm)).setOnClickListener(new e());
        this.h = (LinearLayout) this.p.findViewById(R.id.rate_sku_item_container_layout);
        this.j = new ArrayList();
        JSONArray jSONArray = this.s;
        if (jSONArray != null && jSONArray.size() > 0) {
            int size = this.s.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = this.s.getJSONObject(i);
                RateSkuTagLayout rateSkuTagLayout = new RateSkuTagLayout(getActivity(), jSONObject2);
                rateSkuTagLayout.setPostion(i);
                this.k.put(Integer.valueOf(i), jSONObject2.getString("name"));
                ((ArrayList) this.j).add(rateSkuTagLayout);
                this.h.addView(rateSkuTagLayout.getView());
                rateSkuTagLayout.setTagSelectListener(new f(rateSkuTagLayout));
                if (i < size - 1) {
                    View inflate2 = LayoutInflater.from(getActivity()).inflate(R.layout.rate_sku_divider, (ViewGroup) null);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
                    layoutParams.setMargins(zhn.j(12.0f), zhn.j(15.0f), zhn.j(12.0f), 0);
                    this.h.addView(inflate2, layoutParams);
                }
            }
        }
        this.p.setAlpha(this.f10363a);
        R2();
        rqd rqdVar = this.o;
        if (rqdVar != null) {
            rqdVar.init();
        }
        return this.p;
    }
}
