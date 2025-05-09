package tb;

import android.util.Pair;
import com.alibaba.android.ultron.trade.event.model.OpenPopupWindowEventModel;
import com.alibaba.android.ultron.vfw.popupwindow.PopupWindowManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class h4l extends l12 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements PopupWindowManager.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ lcu f20406a;

        public a(lcu lcuVar) {
            this.f20406a = lcuVar;
        }

        @Override // com.alibaba.android.ultron.vfw.popupwindow.PopupWindowManager.e
        public void onCancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("379d4540", new Object[]{this});
                return;
            }
            this.f20406a.h();
            if (h4l.p(h4l.this)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("status", (Object) "H5Back");
                h4l h4lVar = h4l.this;
                h4lVar.n(h4lVar.g(), jSONObject);
                h4l.this.c.d().g(h4l.this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(155189317);
        }

        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7f2a18e9", new Object[]{this})).intValue();
            }
            return 0;
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4b78ea2f", new Object[]{this})).booleanValue();
            }
            return false;
        }
    }

    static {
        t2o.a(155189315);
    }

    public h4l() {
        b();
    }

    public static /* synthetic */ Object ipc$super(h4l h4lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/event/OpenPopupWindowSubscriber");
    }

    public static /* synthetic */ boolean p(h4l h4lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7c6d92a", new Object[]{h4lVar})).booleanValue();
        }
        return h4lVar.q();
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        OpenPopupWindowEventModel openPopupWindowEventModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        gsb g = g();
        if (g != null && g.getFields() != null) {
            b bVar = null;
            try {
                openPopupWindowEventModel = (OpenPopupWindowEventModel) JSON.parseObject(g.getFields().toJSONString(), OpenPopupWindowEventModel.class);
            } catch (Exception unused) {
                openPopupWindowEventModel = null;
            }
            List<IDMComponent> components = g.getComponents();
            v8j v8jVar = new v8j(components);
            v8jVar.b();
            lcuVar.p(v8jVar);
            a aVar = new a(lcuVar);
            fdd fddVar = this.c;
            if (fddVar instanceof kz1) {
                bVar = ((kz1) fddVar).l(g);
            }
            if (bVar == null || !bVar.b()) {
                this.c.e().U(components, openPopupWindowEventModel, aVar);
            } else {
                this.c.e().S(components, openPopupWindowEventModel, aVar, bVar.a());
            }
            this.c.e().R(new Pair<>(this.e, g));
            this.c.g().p(lcuVar);
        }
    }

    public final boolean q() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d41ae066", new Object[]{this})).booleanValue();
        }
        JSONObject c = c();
        if (c == null || (jSONObject = c.getJSONObject("options")) == null) {
            return false;
        }
        return Boolean.valueOf(jSONObject.getString(d3l.KEY_NEED_CALL_ADJUST_WHEN_CLOSE)).booleanValue();
    }
}
