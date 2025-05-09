package tb;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.view.HImageView;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fbz implements View.OnClickListener, a.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HImageView f19180a;
    public JSONObject b;
    public h9z c;
    public ViewGroup d;
    public final srs e;
    public boolean f;
    public long g = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                fbz.c(fbz.this).p(h9z.EVENT_ON_APPEAR, fbz.b(fbz.this));
            } catch (Throwable th) {
                th.printStackTrace();
                sfh.d("LeftIconWidget", " EVENT_ON_APPEAR error  " + Log.getStackTraceString(th));
            }
        }
    }

    static {
        t2o.a(729809540);
        t2o.a(729809499);
    }

    public fbz(srs srsVar) {
        this.e = srsVar;
    }

    public static /* synthetic */ JSONObject b(fbz fbzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("60a38e35", new Object[]{fbzVar});
        }
        return fbzVar.b;
    }

    public static /* synthetic */ h9z c(fbz fbzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h9z) ipChange.ipc$dispatch("a0c510ef", new Object[]{fbzVar});
        }
        return fbzVar.c;
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.e
    public void a(int i, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff5e72f", new Object[]{this, new Integer(i), jSONObject, new Boolean(z)});
            return;
        }
        HImageView hImageView = this.f19180a;
        if (hImageView != null && hImageView.getVisibility() == 0) {
            boolean q = this.e.q();
            if (this.f != this.e.q()) {
                this.f = q;
                String g = g(this.b, q);
                if (!TextUtils.isEmpty(g)) {
                    this.f19180a.setImageUrl(g);
                }
            }
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.e
    public void d(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5a3619e", new Object[]{this, new Integer(i), jSONObject});
        }
    }

    public void e(JSONObject jSONObject, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10331422", new Object[]{this, jSONObject, new Boolean(z), new Boolean(z2)});
            return;
        }
        sfh.d("LeftIconWidget", " bindData  " + z2);
        this.b = jSONObject;
        this.f = z;
        if (!z2 || jSONObject == null) {
            sfh.d("LeftIconWidget", " data  is null ");
            this.f19180a.setVisibility(8);
            return;
        }
        String g = g(jSONObject, z);
        if (!TextUtils.isEmpty(g)) {
            this.f19180a.setVisibility(0);
            this.f19180a.setImageUrl(g);
            if (this.c != null) {
                this.f19180a.post(new a());
                return;
            }
            return;
        }
        sfh.d("LeftIconWidget", " url is null ");
        this.f19180a.setVisibility(8);
    }

    public final String g(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c073b48b", new Object[]{this, jSONObject, new Boolean(z)});
        }
        if (z) {
            return i(jSONObject, vaj.DARK_MODEL_IMG);
        }
        return i(jSONObject, "img");
    }

    public int h() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2581970c", new Object[]{this})).intValue();
        }
        HImageView hImageView = this.f19180a;
        if (hImageView == null || hImageView.getVisibility() != 0) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = this.f19180a.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        }
        return this.f19180a.getWidth() + i;
    }

    public final String i(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1de4b5f3", new Object[]{this, jSONObject, str});
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("item");
        if (jSONObject4 == null || (jSONObject2 = jSONObject4.getJSONObject("0")) == null || (jSONObject3 = jSONObject2.getJSONObject("content")) == null) {
            return null;
        }
        return jSONObject3.getString(str);
    }

    public void j(h9z h9zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c643bfb8", new Object[]{this, h9zVar});
        } else {
            this.c = h9zVar;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (System.currentTimeMillis() - this.g >= 500) {
            this.g = System.currentTimeMillis();
            h9z h9zVar = this.c;
            if (h9zVar != null) {
                try {
                    h9zVar.p("onClick", null);
                } catch (Throwable th) {
                    th.printStackTrace();
                    sfh.d("LeftIconWidget", " EVENT_ON_CLICK error  " + Log.getStackTraceString(th));
                }
            }
        }
    }

    public void f(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50080207", new Object[]{this, viewGroup});
        } else if (this.f19180a == null || viewGroup != this.d) {
            if (viewGroup != this.d) {
                sfh.d("LeftIconWidget", " createView  容器View 重建了 ");
            }
            this.d = viewGroup;
            HImageView hImageView = new HImageView(viewGroup.getContext());
            this.f19180a = hImageView;
            hImageView.setId(R.id.iv_left_top_icon);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(trs.a(viewGroup.getContext(), 18.0f), trs.a(viewGroup.getContext(), 19.0f));
            layoutParams.setMarginStart(trs.a(viewGroup.getContext(), 12.0f));
            layoutParams.gravity = 16;
            this.f19180a.setLayoutParams(layoutParams);
            this.f19180a.setVisibility(8);
            this.f19180a.setOnClickListener(this);
            this.f19180a.setContentDescription("切换地区");
            this.f19180a.setScaleType(ImageView.ScaleType.FIT_XY);
            viewGroup.addView(this.f19180a, 0);
        }
    }
}
