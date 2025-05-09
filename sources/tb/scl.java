package tb;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.widget.AKVerticalGestureHandler;
import com.taobao.android.order.bundle.widget.OffsetBodyWrapper;
import com.taobao.android.order.bundle.widget.recycle.ScrollListener;
import com.taobao.taobao.R;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class scl implements OffsetBodyWrapper.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f27950a;
    public int b;
    public ScrollListener c;
    public boolean d;
    public final OffsetBodyWrapper e;
    public String f;
    public final RecyclerView g;
    public boolean h = false;
    public b9c i;
    public float j;
    public float k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
            if (!(scl.f(scl.this) == null || scl.f(scl.this).getItemAnimator() == null)) {
                scl.f(scl.this).getItemAnimator().setChangeDuration(0L);
                scl.f(scl.this).getItemAnimator().setMoveDuration(0L);
            }
            scl.i(scl.this).o(scl.g(scl.this) - ((int) scl.h(scl.this).getTranslationY()));
        }
    }

    static {
        t2o.a(713032001);
        t2o.a(713031982);
    }

    public scl(OffsetBodyWrapper offsetBodyWrapper, RecyclerView recyclerView) {
        this.e = offsetBodyWrapper;
        this.g = recyclerView;
    }

    public static /* synthetic */ RecyclerView f(scl sclVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("fd44db93", new Object[]{sclVar});
        }
        return sclVar.g;
    }

    public static /* synthetic */ int g(scl sclVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e6f822a0", new Object[]{sclVar})).intValue();
        }
        return sclVar.f27950a;
    }

    public static /* synthetic */ OffsetBodyWrapper h(scl sclVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OffsetBodyWrapper) ipChange.ipc$dispatch("2e36db4b", new Object[]{sclVar});
        }
        return sclVar.e;
    }

    public static /* synthetic */ ScrollListener i(scl sclVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollListener) ipChange.ipc$dispatch("e3eb8431", new Object[]{sclVar});
        }
        return sclVar.c;
    }

    @Override // com.taobao.android.order.bundle.widget.OffsetBodyWrapper.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31e3cc05", new Object[]{this});
            return;
        }
        float r = pb6.r(this.e.getContext());
        this.b = Math.max((int) (this.j * r), 0);
        this.f27950a = Math.max((int) (r * this.k), 0);
        float f = this.j;
        if (f != 0.0f) {
            jjh.f22030a = f;
        }
    }

    @Override // com.taobao.android.order.bundle.widget.OffsetBodyWrapper.b
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("efced1f5", new Object[]{this})).intValue();
        }
        return this.b;
    }

    @Override // com.taobao.android.order.bundle.widget.OffsetBodyWrapper.b
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a06149d", new Object[]{this})).intValue();
        }
        return this.f27950a;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c5bdcb7", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public void k(b9c b9cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("907bc461", new Object[]{this, b9cVar});
        } else {
            this.i = b9cVar;
        }
    }

    public void l(ScrollListener scrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950e4d68", new Object[]{this, scrollListener});
        } else {
            this.c = scrollListener;
        }
    }

    @Override // com.taobao.android.order.bundle.widget.OffsetBodyWrapper.b
    public void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("437d0487", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            try {
                String str = null;
                JSONObject optJSONObject = jSONObject.optJSONObject("css") == null ? null : jSONObject.getJSONObject("css").optJSONObject("bodyPitInfo");
                boolean z = optJSONObject != null;
                this.d = z;
                this.j = (!z || !optJSONObject.has("normalHeightScale")) ? 0.0f : Float.parseFloat(optJSONObject.getString("normalHeightScale"));
                this.k = (!this.d || !optJSONObject.has("maxHeightScale")) ? 0.0f : Float.parseFloat(optJSONObject.getString("maxHeightScale"));
                this.f = jSONObject.optString("orderDetailType", null);
                float r = pb6.r(this.e.getContext());
                this.b = Math.max((int) (this.j * r), 0);
                this.f27950a = Math.max((int) (r * this.k), 0);
                float f = this.j;
                if (f != 0.0f) {
                    jjh.f22030a = f;
                }
                ScrollListener scrollListener = this.c;
                if (scrollListener != null && this.d) {
                    if (!this.h) {
                        this.g.addOnScrollListener(scrollListener);
                        this.h = true;
                    }
                    b9c b9cVar = this.i;
                    if (b9cVar instanceof AKVerticalGestureHandler) {
                        this.e.setGestureHandler((AKVerticalGestureHandler) b9cVar);
                    }
                    if (jSONObject.optJSONObject("css") != null) {
                        str = jSONObject.getJSONObject("css").optString("backGroundColor");
                    }
                    if (dbl.E()) {
                        Drawable drawable = this.e.getResources().getDrawable(R.drawable.babel_body_bg);
                        if ((drawable instanceof LayerDrawable) && !TextUtils.isEmpty(str)) {
                            LayerDrawable layerDrawable = (LayerDrawable) drawable;
                            try {
                                int parseColor = Color.parseColor(str);
                                ((GradientDrawable) layerDrawable.getDrawable(1)).setColors(new int[]{Color.argb(51, Color.red(parseColor), Color.green(parseColor), Color.blue(parseColor)), parseColor, parseColor});
                            } catch (Exception unused) {
                            }
                        }
                        this.e.setBackground(drawable);
                    }
                    this.e.post(new a());
                }
            } catch (Throwable th) {
                lor.c("OrderDetailMapBusiness", "shouldShowLogistic_error", th.toString());
            }
        }
    }

    @Override // com.taobao.android.order.bundle.widget.OffsetBodyWrapper.b
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71243f8e", new Object[]{this})).booleanValue();
        }
        return this.d && "logistic".equals(this.f);
    }
}
