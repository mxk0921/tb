package tb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class vns extends hrj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DetailDivision";
    public final View c;
    public String e;
    public String f;
    public int g;
    public String h;
    public boolean d = false;
    public String i = "";

    static {
        t2o.a(912262563);
    }

    public vns(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, dataEntryArr);
        this.mContext = context;
        PreRenderManager g = PreRenderManager.g(context);
        if (g != null) {
            this.c = g.j(context, R.layout.tt_detail_container_divider, null, true);
        } else {
            this.c = LayoutInflater.from(context).inflate(R.layout.tt_detail_container_divider, (ViewGroup) null);
        }
        y(nb4Var);
    }

    public static /* synthetic */ Object ipc$super(vns vnsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/division/TTDetailDivisionComponent");
    }

    @Override // tb.hrj, tb.ozc
    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2314fd0", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.oa4
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        return this.c;
    }

    @Override // tb.hrj, tb.ozc
    public View r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c3161e04", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.hrj
    public TTDetailScrollerLayout.LayoutParams u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailScrollerLayout.LayoutParams) ipChange.ipc$dispatch("99746aed", new Object[]{this});
        }
        return new TTDetailScrollerLayout.LayoutParams(-1, -2);
    }

    @Override // tb.hrj
    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("978e443e", new Object[]{this});
        }
        return this.i;
    }

    public void y(nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63be2b8b", new Object[]{this, nb4Var});
            return;
        }
        JSONObject f = nb4Var.f();
        if (f != null) {
            f.getString("name");
            this.i = f.getString("bizId");
            JSONObject jSONObject = f.getJSONObject("payload");
            if (jSONObject != null) {
                this.e = jSONObject.getString("displayType");
                jSONObject.getString("iconUrl");
                this.f = jSONObject.getString("title");
                jSONObject.getString("fgcolor");
                this.g = jSONObject.getIntValue("height");
                this.h = jSONObject.getString("bgcolor");
                z();
            }
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (!this.d) {
            a();
        }
    }

    @Override // tb.hrj, tb.ozc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c57fdb6", new Object[]{this});
            return;
        }
        if ("text".equals(this.e) || "textHighlight".equals(this.e)) {
            ((TextView) this.c.findViewById(R.id.divider_text)).setText(this.f);
        } else if ("gone".equals(this.e)) {
            this.c.findViewById(R.id.divider_center).setVisibility(8);
            this.c.findViewById(R.id.divider_line).setVisibility(8);
            if (this.g >= 0) {
                View view = new View(tq4.d(this.c));
                if (this.c instanceof FrameLayout) {
                    view.setLayoutParams(new ViewGroup.LayoutParams(-1, this.g));
                    ((FrameLayout) this.c).addView(view);
                }
                String str = this.h;
                if (str != null) {
                    view.setBackgroundColor(w14.a(str));
                }
            }
        }
        this.d = true;
    }
}
