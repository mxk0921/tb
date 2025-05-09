package tb;

import android.graphics.Rect;
import android.net.Uri;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.web.WebMaskView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.vessel.VesselView;
import com.taobao.weex.adapter.IWXComputeScreenAdapter;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class o1x extends sz implements epk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Float FLOAT_MAX_WIDTH = Float.valueOf(375.0f);
    public static final int INT_MAX_WIDTH = 375;
    public static final String KEY_HEIGHT = "height";
    public static final String KEY_USE_BRIDGE = "useBridge";
    public static final String KEY_WIDTH = "width";
    public VesselView d;
    public gzw e;
    public final String f;
    public String g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements IWXComputeScreenAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f25091a;

        public a(o1x o1xVar, ViewGroup viewGroup) {
            this.f25091a = viewGroup;
        }

        @Override // com.taobao.weex.adapter.IWXComputeScreenAdapter
        public Rect computeCurrentScreenMetrics() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rect) ipChange.ipc$dispatch("e162c6e5", new Object[]{this});
            }
            Rect rect = new Rect();
            this.f25091a.getGlobalVisibleRect(rect);
            return rect;
        }
    }

    static {
        t2o.a(157286769);
        t2o.a(157286546);
    }

    public o1x(ViewEngine viewEngine, String str) {
        super(viewEngine);
        this.f = str;
        if (viewEngine != null) {
            viewEngine.S0(this);
        }
    }

    public static /* synthetic */ Object ipc$super(o1x o1xVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/web/WebViewHolder");
    }

    @Override // tb.sz
    public void d(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fbfb67", new Object[]{this, iDMComponent});
        } else if (this.d != null && iDMComponent != null && this.f != null) {
            JSONObject fields = iDMComponent.getFields();
            String str = this.f;
            if (fields != null) {
                str = g(str, fields);
            }
            if (str == null || !str.equals(this.g)) {
                this.g = str;
                gzw gzwVar = new gzw(this.f28365a);
                this.e = gzwVar;
                gzwVar.a(iDMComponent);
                this.d.setVesselViewCallback(this.e);
                this.d.loadUrl(str);
                if (this.d.findViewWithTag("WebMaskView") == null) {
                    this.d.setOnLoadListener(new lzw(new WebMaskView(this.d, str), str, this.f28365a.I()));
                }
            }
        }
    }

    public String g(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74f4d5e5", new Object[]{this, str, jSONObject});
        }
        if (jSONObject == null) {
            return str;
        }
        if (jSONObject.containsKey(KEY_USE_BRIDGE) && Boolean.TRUE.toString().equals(jSONObject.getString(KEY_USE_BRIDGE))) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (parse == null) {
            return null;
        }
        Uri.Builder buildUpon = parse.buildUpon();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (entry != null) {
                buildUpon.appendQueryParameter(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return buildUpon.build().toString();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ViewEngine viewEngine = this.f28365a;
        if (viewEngine != null) {
            viewEngine.q1(this);
        }
        VesselView vesselView = this.d;
        if (vesselView != null) {
            vesselView.onDestroy();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // tb.sz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View e(android.view.ViewGroup r5) {
        /*
            r4 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.o1x.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "14914f88"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            r0 = 1
            r3[r0] = r5
            java.lang.Object r5 = r1.ipc$dispatch(r2, r3)
            android.view.View r5 = (android.view.View) r5
            return r5
        L_0x0018:
            com.taobao.vessel.VesselView r1 = new com.taobao.vessel.VesselView
            com.alibaba.android.ultron.vfw.core.ViewEngine r2 = r4.f28365a
            android.content.Context r2 = r2.K()
            r1.<init>(r2)
            r4.d = r1
            com.alibaba.android.ultron.vfw.core.ViewEngine r2 = r4.f28365a
            java.lang.String r2 = r2.I()
            java.lang.String r3 = "doNotCallWebCoreDestroy"
            boolean r0 = tb.vav.a(r2, r3, r0)
            r1.setDoNotCallCoreDestroy(r0)
            java.lang.String r0 = r4.f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0047
            com.alibaba.android.ultron.vfw.core.ViewEngine r5 = r4.f28365a
            android.content.Context r5 = r5.K()
            android.view.View r5 = tb.mgw.a(r5)
            return r5
        L_0x0047:
            java.lang.String r0 = r4.f
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = "height"
            java.lang.String r1 = r0.getQueryParameter(r1)
            java.lang.String r2 = "width"
            java.lang.String r0 = r0.getQueryParameter(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = -1
            if (r2 != 0) goto L_0x0067
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: Exception -> 0x0066
            goto L_0x0068
        L_0x0066:
        L_0x0067:
            r1 = -1
        L_0x0068:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0074
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: Exception -> 0x0073
            goto L_0x0075
        L_0x0073:
        L_0x0074:
            r0 = -1
        L_0x0075:
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r3, r3)
            if (r1 <= 0) goto L_0x008e
            float r1 = (float) r1
            java.lang.Float r3 = tb.o1x.FLOAT_MAX_WIDTH
            float r3 = r3.floatValue()
            float r1 = r1 / r3
            int r3 = r5.getWidth()
            float r3 = (float) r3
            float r1 = r1 * r3
            int r1 = (int) r1
            r2.height = r1
        L_0x008e:
            if (r0 <= 0) goto L_0x00a8
            r1 = 375(0x177, float:5.25E-43)
            if (r0 <= r1) goto L_0x0096
            r0 = 375(0x177, float:5.25E-43)
        L_0x0096:
            float r0 = (float) r0
            java.lang.Float r1 = tb.o1x.FLOAT_MAX_WIDTH
            float r1 = r1.floatValue()
            float r0 = r0 / r1
            int r1 = r5.getWidth()
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = (int) r0
            r2.width = r0
        L_0x00a8:
            com.taobao.vessel.VesselView r0 = r4.d
            r0.setLayoutParams(r2)
            com.taobao.vessel.VesselView r0 = r4.d
            tb.o1x$a r1 = new tb.o1x$a
            r1.<init>(r4, r5)
            r0.setComputeScreenAdapter(r1)
            com.taobao.vessel.VesselView r5 = r4.d
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.o1x.e(android.view.ViewGroup):android.view.View");
    }
}
