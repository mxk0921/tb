package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zdp extends kd7<aep> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final View h;
    public final ImageView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;

    static {
        t2o.a(912262396);
    }

    public zdp(Context context) {
        super(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_miaoshifu, (ViewGroup) null);
        this.h = inflate;
        this.i = (ImageView) inflate.findViewById(R.id.icon);
        this.j = (TextView) inflate.findViewById(R.id.title);
        this.k = (TextView) inflate.findViewById(R.id.subtitle);
        this.l = (TextView) inflate.findViewById(R.id.tips);
    }

    public static /* synthetic */ Object ipc$super(zdp zdpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/ServiceViewHolder");
    }

    /* renamed from: e */
    public void h(aep aepVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a4cd5b1", new Object[]{this, aepVar});
        }
    }

    /* renamed from: k */
    public boolean m(aep aepVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cde01c35", new Object[]{this, aepVar})).booleanValue();
        }
        return false;
    }

    /* renamed from: x */
    public View j(aep aepVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c9beaba5", new Object[]{this, aepVar});
        }
        if (!TextUtils.isEmpty(aepVar.k)) {
            mpe.m(this.i, aepVar.k);
        }
        if (!TextUtils.isEmpty(aepVar.l)) {
            this.j.setText(aepVar.l);
        } else {
            this.j.setVisibility(8);
        }
        if (!TextUtils.isEmpty(aepVar.m)) {
            this.k.setText(aepVar.m);
        } else {
            this.k.setVisibility(8);
        }
        if (!TextUtils.isEmpty(aepVar.n)) {
            this.l.setText(aepVar.n);
        }
        if (!TextUtils.isEmpty(aepVar.o)) {
            ViewProxy.setOnClickListener(this.h, new a(aepVar.o));
        }
        return this.h;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32697a;

        public a(String str) {
            this.f32697a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", (Object) this.f32697a);
            q84.f(zdp.this.f22590a, new rc7("open_url", jSONObject, new RuntimeAbilityParam("appendURLParamsOnly", Boolean.TRUE)));
        }
    }
}
