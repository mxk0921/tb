package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class p16 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_RITEMEXPOSURE = 7882392389048015465L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseSectionModel f25808a;
        public final /* synthetic */ BaseSectionModel b;

        public a(BaseSectionModel baseSectionModel, BaseSectionModel baseSectionModel2) {
            this.f25808a = baseSectionModel;
            this.b = baseSectionModel2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                p16.a(p16.this, this.f25808a, this.b);
            }
        }
    }

    static {
        t2o.a(486539366);
    }

    public static /* synthetic */ void a(p16 p16Var, BaseSectionModel baseSectionModel, BaseSectionModel baseSectionModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ff3cd4f", new Object[]{p16Var, baseSectionModel, baseSectionModel2});
        } else {
            p16Var.c(baseSectionModel, baseSectionModel2);
        }
    }

    public static /* synthetic */ Object ipc$super(p16 p16Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/eventhandler/DXItemExposureEventHandler");
    }

    public final void b(BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2) {
        JSONObject args;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afcb1e06", new Object[]{this, baseSectionModel, baseSectionModel2});
            return;
        }
        if (f(baseSectionModel) && (args = baseSectionModel2.getArgs()) != null) {
            args.put("dataFlag", (Object) "1");
        }
        vve.f(baseSectionModel, baseSectionModel2);
        if (baseSectionModel2.getString("adNamespace") == null) {
            baseSectionModel2.put("adNamespace", (Object) "tb_recmd_homePage");
        }
    }

    public final void c(BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f24a75", new Object[]{this, baseSectionModel, baseSectionModel2});
            return;
        }
        b(baseSectionModel, baseSectionModel2);
        vve.p(baseSectionModel2, null);
        due.c(baseSectionModel2.getExposureParam());
    }

    public final JSONObject d(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("75f6de51", new Object[]{this, obj, new Integer(i)});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            if (jSONArray.size() <= i) {
                return null;
            }
            return jSONArray.getJSONObject(i);
        } else if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        } else {
            return null;
        }
    }

    public final BaseSectionModel<?> e(BaseSectionModel<?> baseSectionModel, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("9fc51dc7", new Object[]{this, baseSectionModel, obj, new Integer(i)});
        }
        JSONObject d = d(obj, i);
        if (d != null) {
            return baseSectionModel.createBaseSectionModel(d);
        }
        fve.e("DXItemExposureEventHandler", "sectionJson is null");
        return null;
    }

    public final boolean f(BaseSectionModel<?> baseSectionModel) {
        JSONObject args;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18973e2", new Object[]{this, baseSectionModel})).booleanValue();
        }
        if (!baseSectionModel.getExt().getBooleanValue("isBannerCard") || (args = baseSectionModel.getArgs()) == null) {
            return false;
        }
        return "1".equals(args.getString("dataFlag"));
    }

    public final int g(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fdf5ca74", new Object[]{this, dXEvent})).intValue();
        }
        if (dXEvent instanceof DXPageChangeEvent) {
            return ((DXPageChangeEvent) dXEvent).pageIndex;
        }
        return 0;
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length < 1) {
            fve.e("DXItemExposureEventHandler", "args exception");
        } else {
            BaseSectionModel<?> e = j18.e(dXRuntimeContext);
            if (e == null) {
                fve.e("DXItemExposureEventHandler", "originSection is null");
                return;
            }
            BaseSectionModel<?> e2 = e(e, objArr[0], g(dXEvent));
            if (e2 == null) {
                fve.e("DXItemExposureEventHandler", "frameSection is null");
            } else {
                get.a().i(new a(e, e2));
            }
        }
    }
}
