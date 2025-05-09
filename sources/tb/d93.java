package tb;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.tbpoplayer.nativerender.dsl.StateModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel;
import com.taobao.tbpoplayer.nativerender.dsl.WidgetAnimModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class d93 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final oe8 f17661a;
    public View b;
    public final List<ubm> c = new CopyOnWriteArrayList();

    static {
        t2o.a(790626374);
    }

    public d93(oe8 oe8Var) {
        this.f17661a = oe8Var;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.b = null;
        }
    }

    public View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9fad90ad", new Object[]{this});
        }
        return this.b;
    }

    public View e(StateModel stateModel, StateVersionModel stateVersionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2845a8a9", new Object[]{this, stateModel, stateVersionModel});
        }
        if (stateModel != null && stateModel.isValid()) {
            me8 j = this.f17661a.j();
            j.N(null);
            j.Q(null);
            j.S(null);
            this.b = null;
            StyleModel styleModel = stateModel.style;
            if (styleModel == null) {
                return null;
            }
            Context e = j.e();
            try {
                int h = plj.h(this.f17661a, styleModel.width);
                int h2 = plj.h(this.f17661a, styleModel.height);
                j.T(h);
                j.P(h2);
                FrameLayout frameLayout = new FrameLayout(e);
                frameLayout.setId(R.id.poplayer_native_state_id);
                this.b = frameLayout;
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(h, h2));
                f(stateModel, stateVersionModel, frameLayout);
                return frameLayout;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static /* synthetic */ int d(AtomicBoolean atomicBoolean, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a617eb2", new Object[]{atomicBoolean, jSONObject, jSONObject2})).intValue();
        }
        try {
            return jSONObject.getJSONObject("style").getIntValue(pg1.ATOM_EXT_zIndex) - jSONObject2.getJSONObject("style").getIntValue(pg1.ATOM_EXT_zIndex);
        } catch (Throwable unused) {
            atomicBoolean.set(false);
            return 0;
        }
    }

    public final void f(StateModel stateModel, StateVersionModel stateVersionModel, FrameLayout frameLayout) {
        ubm a2;
        WidgetAnimModel widgetAnimModel;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6db117f4", new Object[]{this, stateModel, stateVersionModel, frameLayout});
            return;
        }
        StateModel stateModel2 = stateVersionModel != 0 ? stateVersionModel : stateModel;
        me8 j = this.f17661a.j();
        j.Q(stateModel);
        j.S(stateVersionModel);
        j.N(stateModel2);
        j.L(a1n.h(this.f17661a, stateModel2.style.backgroundUrl, false));
        try {
            StyleModel styleModel = stateModel2.style;
            if (!(styleModel == null || (widgetAnimModel = styleModel.widgetAnimBackground) == null || (str = widgetAnimModel.imgSrcList) == null)) {
                j.M(JSON.parseArray(a1n.h(this.f17661a, str, false), String.class));
            }
        } catch (Exception e) {
            wdm.a("parse backgroundUrlList error :" + e);
        }
        this.f17661a.u();
        List<JSONObject> arrayList = new ArrayList(stateModel2.children);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        Collections.sort(arrayList, new Comparator() { // from class: tb.c93
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int d;
                d = d93.d(atomicBoolean, (JSONObject) obj, (JSONObject) obj2);
                return d;
            }
        });
        if (!atomicBoolean.get()) {
            arrayList = stateModel2.children;
        }
        this.f17661a.j().a0(plj.f(this.f17661a, arrayList, false));
        for (JSONObject jSONObject : arrayList) {
            String string = jSONObject.getString("type");
            if (!Boolean.FALSE.equals(jSONObject.getBoolean("vConditionResult")) && !vbm.TYPE_CLOSE_BTN.equals(string) && (a2 = vbm.a(jSONObject, this.f17661a, false, false)) != null) {
                frameLayout.addView(a2.e());
                ((CopyOnWriteArrayList) this.c).add(a2);
            }
        }
        if (frameLayout.getChildCount() == 0) {
            this.f17661a.s("StateNoUiContent", "");
        }
    }
}
