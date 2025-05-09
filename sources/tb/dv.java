package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class dv implements s0c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kmb f18082a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/touch/request/AbsDragStructureRequest$1");
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
            }
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            dv.b(dv.this).e().t().z0(2);
            lbq.b(c9x.CART_BIZ_NAME, "updateStructureRequest", mtopResponse.getRetCode(), mtopResponse.getRetMsg());
            UnifyLog.e("DragStructureRequest", "updateStructureRequest|error|" + mtopResponse.getRetCode(), "|", mtopResponse.getRetMsg());
        }
    }

    static {
        t2o.a(478151181);
        t2o.a(478151171);
    }

    public dv(kmb kmbVar) {
        this.f18082a = kmbVar;
    }

    public static /* synthetic */ kmb b(dv dvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("5cfceb93", new Object[]{dvVar});
        }
        return dvVar.f18082a;
    }

    public void c(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f01d0a", new Object[]{this, iDMComponent, iDMComponent2});
        } else {
            g(iDMComponent, "joinIntoGroup", kw7.h(iDMComponent2), kw7.f(iDMComponent2));
        }
    }

    public void d(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e51ebf0", new Object[]{this, iDMComponent, iDMComponent2});
        } else {
            g(iDMComponent, "removeFromGroup", kw7.h(iDMComponent2), kw7.f(iDMComponent2));
        }
    }

    public void e(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a03f14", new Object[]{this, iDMComponent, iDMComponent2});
        } else {
            g(iDMComponent, "reorderGroup", null, kw7.f(iDMComponent2));
        }
    }

    public void f(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6fe62f", new Object[]{this, iDMComponent, iDMComponent2});
        } else if (iDMComponent != null && iDMComponent2 != null) {
            g(iDMComponent, "reorderInGroup", kw7.h(iDMComponent2), null);
        }
    }

    public final void g(IDMComponent iDMComponent, String str, String str2, String str3) {
        gsb gsbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e64cb61", new Object[]{this, iDMComponent, str, str2, str3});
        } else if (iDMComponent == null) {
            lbq.b(c9x.CART_BIZ_NAME, str, "DRAG_COMP_NULL", "dragComponent is null");
            UnifyLog.e("DragStructureRequest", "updateStructure|error|dragComponent is null");
        } else {
            Map<String, List<gsb>> eventMap = iDMComponent.getEventMap();
            if (eventMap == null) {
                lbq.b(c9x.CART_BIZ_NAME, str, "DRAG_EVENT_MAP_NULL", "eventMap is null");
                UnifyLog.e("DragStructureRequest", "updateStructure|error|eventMap is null", iDMComponent.getKey());
                return;
            }
            List<gsb> list = eventMap.get("reorderGroupLongClick");
            if (list == null) {
                lbq.b(c9x.CART_BIZ_NAME, str, "DRAG_GROUP_LONG_CLICK_NULL", "reorderGroupLongClick is null");
                UnifyLog.e("DragStructureRequest", "updateStructure|error|reorderGroupLongClick is null", iDMComponent.getKey());
                return;
            }
            Iterator<gsb> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gsbVar = null;
                    break;
                }
                gsbVar = it.next();
                if ("reorderDrag".equals(gsbVar.getType())) {
                    break;
                }
            }
            if (gsbVar != null) {
                JSONObject fields = gsbVar.getFields();
                String r = cb4.r(iDMComponent);
                String p = cb4.p(iDMComponent);
                fields.put("type", (Object) str);
                fields.put("from", (Object) r);
                fields.put("fromBundleId", (Object) p);
                if (!TextUtils.isEmpty(str2)) {
                    fields.put("to", (Object) str2);
                } else {
                    fields.remove("to");
                }
                if (!TextUtils.isEmpty(str3)) {
                    fields.put("toBundleId", (Object) str3);
                } else {
                    fields.remove("toBundleId");
                }
                lcu h = this.f18082a.h();
                h.q("reorderGroupLongClick");
                h.i(iDMComponent);
                h.k(gsbVar);
                h.l(gsbVar.getType());
                String tag = iDMComponent.getTag();
                juv.a(this.f18082a, "Page_ShoppingCart_" + tag + "_reorderDrag", juv.f(fields));
                this.f18082a.o0(iDMComponent, h, true, new a(), null);
            }
        }
    }
}
