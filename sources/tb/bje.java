package tb;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.ShowLightOffMessage;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.handler.AbilityCenter;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import com.taobao.android.detail.ttdetail.widget.ExtraHeightLinearLayout;
import com.taobao.android.detail.ttdetail.widget.TTObservedImageView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bje extends u3a implements d8c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final zy9 d = new zy9(-1, -1, 17);

    static {
        t2o.a(912261429);
        t2o.a(912263016);
    }

    public bje(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, dataEntryArr);
    }

    public static /* synthetic */ List H(bje bjeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("be04c061", new Object[]{bjeVar});
        }
        return bjeVar.I();
    }

    public static /* synthetic */ Object ipc$super(bje bjeVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -267981795) {
            return super.B();
        }
        if (hashCode == 395904714) {
            super.disAppear();
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/component/module/ImageComponent");
    }

    @Override // tb.u3a
    public JSONObject B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f006ec1d", new Object[]{this});
        }
        JSONObject B = super.B();
        JSONObject f = this.mComponentData.f();
        if (f != null) {
            B.put("image_url", (Object) f.getString("url"));
        }
        return B;
    }

    public final List<ir> I() {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f27c99f3", new Object[]{this});
        }
        rql i = this.mComponentData.i();
        if (i == null || (d = i.d()) == null || !d.getBooleanValue(tx9.KEY_ENABLE_LIGHT_OFF)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) y3l.EVENT_TYPE);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "userTrack");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("arg1", (Object) "Page_Detail_Button_DetailPic_industry");
        jSONObject3.put("eventId", (Object) "2101");
        jSONObject3.put("page", (Object) "Page_Detail");
        JSONObject c = UtUtils.c(this.mDetailContext.e());
        c.put("spm", (Object) "a2141.7631564.detailpic");
        c.putAll(B());
        jSONObject3.put("args", (Object) c);
        jSONObject2.put("fields", (Object) jSONObject3);
        arrayList.add(new ir(jSONObject));
        arrayList.add(new ir(jSONObject2));
        return arrayList;
    }

    public View J(View view) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9a22db9a", new Object[]{this, view});
        }
        if (view == null || view.getId() != R.id.fl_image_frame_container) {
            PreRenderManager g = PreRenderManager.g(this.mContext);
            if (g != null) {
                view = g.j(this.mContext, R.layout.tt_detail_image_component, null, true);
            } else {
                view = LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_image_component, (ViewGroup) null);
            }
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_image_content);
        String d = jov.d(K());
        if (imageView instanceof TTObservedImageView) {
            ((TTObservedImageView) imageView).setObserveListener(this.c);
        }
        ExtraHeightLinearLayout extraHeightLinearLayout = (ExtraHeightLinearLayout) view.findViewById(R.id.iv_image_mask_container);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_image_mask);
        boolean M = M();
        if (!M) {
            i = 8;
        }
        extraHeightLinearLayout.setVisibility(i);
        if (M) {
            int c = rua.c(this.mContext, this.mDetailContext.g().o(), (wua) this.mDetailContext.e().e(a4a.PARSER_ID));
            extraHeightLinearLayout.setExtraHeight(c);
            ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            layoutParams.height = c;
            imageView2.setLayoutParams(layoutParams);
            N(d, imageView2, c);
        } else {
            cg2.p(this.mDetailContext.i().b(), imageView2, null, 0, 0, false);
        }
        mpe.m(imageView, d);
        imageView.setOnClickListener(new a());
        if (vbl.z0()) {
            O(view);
        }
        return view;
    }

    public String K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75cd89af", new Object[]{this});
        }
        JSONObject f = this.mComponentData.f();
        if (f != null) {
            return f.getString("url");
        }
        return null;
    }

    public final JSONObject L() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d5512db9", new Object[]{this});
        }
        JSONObject f = this.mComponentData.f();
        if (f == null || (jSONObject = f.getJSONObject("extra")) == null) {
            return null;
        }
        return jSONObject.getJSONObject("suspectedAI");
    }

    public final boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68ec0716", new Object[]{this})).booleanValue();
        }
        return rua.h(this.mContext, (wua) this.mDetailContext.e().e(a4a.PARSER_ID));
    }

    public final void N(String str, ImageView imageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f9dce1", new Object[]{this, str, imageView, new Integer(i)});
        } else if (TextUtils.isEmpty(str)) {
            tgh.b("ImageComponent", "loadBgMask url is empty");
        } else {
            cg2.p(this.mDetailContext.i().b(), imageView, str, rua.e(this.mContext, C()), i, false);
        }
    }

    @Override // tb.oa4
    public void disAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("179906ca", new Object[]{this});
        } else {
            super.disAppear();
        }
    }

    @Override // tb.d8c
    public Rect f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("f682b1e3", new Object[]{this});
        }
        View view = this.mView;
        if (view == null || view.getWindowToken() == null) {
            return null;
        }
        int[] iArr = new int[2];
        this.mView.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], this.mView.getWidth() + i, iArr[1] + this.mView.getHeight());
    }

    @Override // tb.oa4
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        return J(view);
    }

    @Override // tb.oa4
    public zy9 onGetFrameSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zy9) ipChange.ipc$dispatch("5fd8d0bf", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return this.d;
    }

    @Override // tb.u3a
    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2c1fb0f", new Object[]{this});
        }
        return K();
    }

    public final void O(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8217771", new Object[]{this, view});
            return;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ai_float_view);
        JSONObject L = L();
        if (L != null) {
            String string = L.getString("iconUrl");
            String string2 = L.getString("text");
            if (!TextUtils.isEmpty(string) || !TextUtils.isEmpty(string2)) {
                if (linearLayout.getVisibility() != 0) {
                    linearLayout.setVisibility(0);
                }
                ImageView imageView = (ImageView) view.findViewById(R.id.ai_icon);
                if (!TextUtils.isEmpty(string)) {
                    imageView.setVisibility(0);
                    mpe.m(imageView, string);
                } else {
                    imageView.setVisibility(8);
                }
                TextView textView = (TextView) view.findViewById(R.id.ai_text);
                if (!TextUtils.isEmpty(string2)) {
                    textView.setVisibility(0);
                    textView.setText(string2);
                    return;
                }
                textView.setVisibility(8);
            } else if (linearLayout.getVisibility() != 8) {
                linearLayout.setVisibility(8);
            }
        } else if (linearLayout.getVisibility() != 8) {
            linearLayout.setVisibility(8);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            sx9 sx9Var = (sx9) bje.this.getParentComponent();
            String g = sx9Var != null ? ((tx9) sx9Var.getComponentData()).g() : null;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            if (vbl.u()) {
                AbilityCenter b = bje.this.mDetailContext.b();
                List<ir> H = bje.H(bje.this);
                bje bjeVar = bje.this;
                RuntimeAbilityParam runtimeAbilityParam = new RuntimeAbilityParam(y3l.KEY_OPEN_SOURCE, ShowLightOffMessage.Source.IMAGE_COMPONENT);
                RuntimeAbilityParam runtimeAbilityParam2 = new RuntimeAbilityParam(y3l.KEY_FRAME_COMPONENT_ID, g);
                int i = iArr[0];
                b.g(H, bjeVar.appendTriggerComponent(false, runtimeAbilityParam, runtimeAbilityParam2, new RuntimeAbilityParam(y3l.KEY_TRIGGER_VIEW_RECT, new Rect(i, iArr[1], i + view.getWidth(), iArr[1] + view.getHeight()))));
                return;
            }
            bje bjeVar2 = bje.this;
            RuntimeAbilityParam runtimeAbilityParam3 = new RuntimeAbilityParam(y3l.KEY_OPEN_SOURCE, ShowLightOffMessage.Source.IMAGE_COMPONENT);
            RuntimeAbilityParam runtimeAbilityParam4 = new RuntimeAbilityParam(y3l.KEY_FRAME_COMPONENT_ID, g);
            int i2 = iArr[0];
            bjeVar2.triggerClickEvent(runtimeAbilityParam3, runtimeAbilityParam4, new RuntimeAbilityParam(y3l.KEY_TRIGGER_VIEW_RECT, new Rect(i2, iArr[1], view.getWidth() + i2, iArr[1] + view.getHeight())));
        }
    }
}
