package com.taobao.android.detail.ttdetail.floatview;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import com.taobao.android.detail.ttdetail.widget.LiveIconAnimaView;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import tb.ir;
import tb.jxd;
import tb.mr7;
import tb.rg0;
import tb.t2o;
import tb.tgh;
import tb.u5m;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTReplaceLiveFloatController implements jxd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TTReplaceLiveFloatController";

    /* renamed from: a  reason: collision with root package name */
    public final Context f6778a;
    public final ze7 b;
    public View c;
    public View d;
    public LiveIconAnimaView e;
    public TextView f;
    public TextView g;
    public boolean h;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail.ttdetail.floatview.TTReplaceLiveFloatController$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6779a;
        public final /* synthetic */ JSONObject b;

        public AnonymousClass1(String str, JSONObject jSONObject) {
            this.f6779a = str;
            this.b = jSONObject;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TTReplaceLiveFloatController.a(TTReplaceLiveFloatController.this).b().h(new ir(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.floatview.TTReplaceLiveFloatController.1.1
                {
                    put("type", "openUrl");
                    put("fields", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.floatview.TTReplaceLiveFloatController.1.1.1
                        {
                            put("url", (Object) AnonymousClass1.this.f6779a);
                        }
                    });
                }
            }), new RuntimeAbilityParam[0]);
            UtUtils.f(2101, "Page_Detail_Button_NativeReplaceLive", this.b);
        }
    }

    static {
        t2o.a(912261791);
        t2o.a(912261767);
    }

    public TTReplaceLiveFloatController(Context context, ze7 ze7Var) {
        this.f6778a = context;
        this.b = ze7Var;
    }

    public static /* synthetic */ ze7 a(TTReplaceLiveFloatController tTReplaceLiveFloatController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("d6aa6209", new Object[]{tTReplaceLiveFloatController});
        }
        return tTReplaceLiveFloatController.b;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        LiveIconAnimaView liveIconAnimaView = this.e;
        if (liveIconAnimaView != null) {
            liveIconAnimaView.stopAnimation();
        }
    }

    public View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.c;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ae98f5c", new Object[]{this});
        } else if (this.c == null) {
            PreRenderManager g = PreRenderManager.g(this.f6778a);
            if (g != null) {
                this.c = g.j(this.f6778a, R.layout.tt_detail_replace_live_float, null, true);
            } else {
                this.c = LayoutInflater.from(this.f6778a).inflate(R.layout.tt_detail_replace_live_float, (ViewGroup) null);
            }
            this.d = this.c.findViewById(R.id.ll_live_float_content);
            this.e = (LiveIconAnimaView) this.c.findViewById(R.id.live_img);
            this.f = (TextView) this.c.findViewById(R.id.live_text);
            this.g = (TextView) this.c.findViewById(R.id.live_sub_text);
        }
    }

    public boolean e(JSONObject jSONObject) {
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27a64d52", new Object[]{this, jSONObject})).booleanValue();
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("params").getJSONArray("infos").getJSONObject(0).getJSONObject("bizDataExt");
            String string = jSONObject2.getString("title");
            String string2 = jSONObject2.getString(rg0.JUMP_URL);
            String string3 = jSONObject2.getString("icon");
            String string4 = jSONObject2.getString(SimpleProfile.KEY_DISPLAYNAME);
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string3) || TextUtils.isEmpty(string2)) {
                return false;
            }
            d();
            this.f.setText(string);
            this.g.setText(string4);
            boolean isEmpty = TextUtils.isEmpty(string4);
            TextView textView = this.g;
            if (isEmpty) {
                i = 8;
            }
            textView.setVisibility(i);
            TextView textView2 = this.f;
            if (isEmpty) {
                str = "#111111";
            } else {
                str = "#FF0040";
            }
            textView2.setTextColor(Color.parseColor(str));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f.getLayoutParams();
            layoutParams.topMargin = mr7.a(isEmpty ? 8.0f : 3.0f);
            this.f.setLayoutParams(layoutParams);
            JSONObject c = UtUtils.c(this.b.e());
            c.put("title", (Object) string);
            c.put(rg0.JUMP_URL, (Object) string2);
            ViewProxy.setOnClickListener(this.d, new AnonymousClass1(string2, c));
            this.e.startAnimation();
            UtUtils.f(2201, "Page_Detail_Show_NativeReplaceLive", c);
            if (!this.h) {
                u5m.h(this.f6778a, string2);
                this.h = true;
            }
            return true;
        } catch (Exception e) {
            tgh.c(TAG, "refresh parse error", e);
            return false;
        }
    }
}
