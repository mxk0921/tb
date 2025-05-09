package tb;

import android.app.Activity;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.megadesign.viewpager.CustomTabLayout;
import com.taobao.android.stdpop.api.PopGravity;
import com.taobao.android.stdpop.api.viewpager.PanelViewPagerFragment;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class llq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean b;
    public PopGravity d;
    public int e;
    public String h;

    /* renamed from: a  reason: collision with root package name */
    public float f23400a = 0.75f;
    public zfm c = new zfm(0.0f, 0.0f, 0.0f, 0.0f);
    public final String f = String.valueOf(System.currentTimeMillis());
    public int g = xbm.a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Activity b;

        public a(Activity activity) {
            this.b = activity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                olq.a(this.b, llq.a(llq.this));
            }
        }
    }

    static {
        t2o.a(786432020);
    }

    public static final /* synthetic */ String a(llq llqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("725bbf54", new Object[]{llqVar});
        }
        return llqVar.f;
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb1c2f", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public final void c(PopGravity popGravity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc712862", new Object[]{this, popGravity});
        } else {
            this.d = popGravity;
        }
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6ba1dd", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public final void e(zfm zfmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f56b20c2", new Object[]{this, zfmVar});
            return;
        }
        ckf.g(zfmVar, "<set-?>");
        this.c = zfmVar;
    }

    public final void f(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff43450", new Object[]{this, new Float(f)});
        } else {
            this.f23400a = f;
        }
    }

    public final void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40fb2baf", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public final zao h(Activity activity, List<mpl> list, mlq mlqVar, CustomTabLayout.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zao) ipChange.ipc$dispatch("fca7e30f", new Object[]{this, activity, list, mlqVar, aVar});
        }
        ckf.g(activity, "act");
        ckf.g(list, c4o.KEY_DATA_SOURCE);
        PanelViewPagerFragment panelViewPagerFragment = new PanelViewPagerFragment();
        panelViewPagerFragment.p2(list);
        panelViewPagerFragment.r2(this.e);
        if (aVar != null) {
            panelViewPagerFragment.u2(aVar);
        }
        panelViewPagerFragment.s2(new a(activity));
        if (this.f23400a == 1.0f) {
            this.g = 0;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "maxHeight", (String) Float.valueOf(this.f23400a));
        jSONObject.put((JSONObject) "maxWidth", (String) 1);
        jSONObject.put((JSONObject) "panEnable", (String) Boolean.valueOf(this.b));
        jSONObject.put((JSONObject) "leftMargin", (String) Float.valueOf(this.c.b()));
        jSONObject.put((JSONObject) "rightMargin", (String) Float.valueOf(this.c.c()));
        jSONObject.put((JSONObject) "topMargin", (String) Float.valueOf(this.c.d()));
        PopGravity popGravity = this.d;
        jSONObject.put((JSONObject) "gravity", popGravity != null ? popGravity.getValue() : null);
        jSONObject.put((JSONObject) "bottomMargin", (String) Float.valueOf(this.c.a()));
        jSONObject.put((JSONObject) "autoRotate", (String) Boolean.valueOf(gxv.l(activity)));
        jSONObject.put((JSONObject) hij.KEY_CORNER_RADIUS, (String) Integer.valueOf(this.g));
        String str = this.h;
        if (str != null) {
            jSONObject.put((JSONObject) "contentBackColor", str);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) h9.KEY_POP_CONFIG, (String) jSONObject);
        jSONObject2.put((JSONObject) "popId", this.f);
        xhv xhvVar = xhv.INSTANCE;
        return olq.g(activity, panelViewPagerFragment, jSONObject2, mlqVar);
    }
}
