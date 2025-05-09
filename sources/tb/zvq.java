package tb;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zvq implements jqw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<View> f33058a;
    public JSONObject b;
    public ux9 c;

    static {
        t2o.a(779093268);
        t2o.a(989856388);
    }

    public void b(ux9 ux9Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b8c74b", new Object[]{this, ux9Var, jSONObject});
            return;
        }
        this.b = jSONObject;
        this.c = ux9Var;
    }

    public void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6afe94c", new Object[]{this, view});
        } else {
            this.f33058a = new WeakReference<>(view);
        }
    }

    public final void a(JSONObject jSONObject) {
        View view;
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9362fc2", new Object[]{this, jSONObject});
        } else if (Boolean.parseBoolean(jSONObject.getJSONObject("param").getString("subscribeState")) && (view = this.f33058a.get()) != null && (view.getParent() instanceof ViewGroup) && (viewGroup = (ViewGroup) view.getParent()) != null) {
            viewGroup.removeAllViews();
            viewGroup.setPadding(0, 0, 0, 0);
        }
    }

    @Override // tb.jqw
    public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
        }
        if (3005 == i) {
            Object obj = objArr[0];
            if (obj instanceof String) {
                try {
                    JSONObject d = fkx.d((String) obj);
                    String str = (String) d.get("event");
                    if ("TaoliveRoomSubscribeStateNotify".equals(str)) {
                        if (this.b == null || this.c == null) {
                            a(d);
                        } else {
                            sjr.g().c(uyg.EVENT_RANK_LIVE_QUERY_GROWTH_DATA, null, this.c.C());
                        }
                    } else if ("taoLiveAnchorStartNotify".equals(str)) {
                        a(d);
                    }
                } catch (Throwable th) {
                    v7t.d("SubscriberSuccessListener", th.toString());
                }
            }
        }
        return null;
    }
}
