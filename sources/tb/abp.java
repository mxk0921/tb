package tb;

import android.text.TextUtils;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class abp extends iy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends o3o {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ux b;
        public final /* synthetic */ String c;
        public final /* synthetic */ RequestConfig d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ux uxVar, ux uxVar2, String str, RequestConfig requestConfig) {
            super(uxVar);
            this.b = uxVar2;
            this.c = str;
            this.d = requestConfig;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/request/SendStructureRequest$1");
        }

        @Override // tb.o3o, tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            ux uxVar = this.b;
            if (uxVar != null) {
                uxVar.a(i, mtopResponse, obj, z, map);
            }
            if (mtopResponse != null) {
                fdv.b("SendStructureRequest", fdv.F_NETWORK_REQUEST, mtopResponse.getRetCode(), mtopResponse.getRetMsg(), "");
                UnifyLog.m(((vc3) abp.this.f21638a.x()).c(), "SendStructureRequest", "updateStructureRequest", "error");
                if (!zsj.b(mtopResponse) || !"cartSelect".equals(this.c)) {
                    be3.c(abp.this.b, mtopResponse.getRetMsg());
                }
            }
        }

        @Override // tb.o3o, tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                return;
            }
            ux uxVar = this.b;
            if (uxVar != null) {
                uxVar.b(i, mtopResponse, obj, fsbVar, map);
            }
            cb4.Y(abp.this.d);
            abp.this.f21638a.s();
            abp.this.h(this.d);
        }
    }

    static {
        t2o.a(479199334);
    }

    public abp(zxb zxbVar) {
        super(zxbVar);
    }

    public static /* synthetic */ Object ipc$super(abp abpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/request/SendStructureRequest");
    }

    @Override // tb.jod
    public String a(RequestConfig requestConfig, ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("523b998e", new Object[]{this, requestConfig, uxVar});
        }
        btq btqVar = new btq(this.f21638a, this.b, k());
        lcu k = requestConfig.k();
        IDMComponent b = requestConfig.b();
        if (k == null) {
            return null;
        }
        String d = k.d();
        if (b != null) {
            ((DMComponent) b).setTriggerEvent(k.g() + "." + d);
        }
        requestConfig.m = true;
        fsb c = this.f21638a.c();
        JSONObject M = ((u55) c).M();
        ArrayList arrayList = new ArrayList();
        m(k, arrayList);
        this.c.g(arrayList);
        Map<String, String> i = btqVar.c().i();
        JSONObject c2 = c(i);
        i(c2, requestConfig);
        i.put("exParams", c2.toJSONString());
        btqVar.j(b);
        c.g(this.c);
        g(d);
        btqVar.h(new a(uxVar, uxVar, d, requestConfig), c, requestConfig.g());
        ((u55) c).E0(M);
        return btqVar.f();
    }

    public final b3o k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b3o) ipChange.ipc$dispatch("b3f98fbb", new Object[]{this});
        }
        return zs6.f(this.d);
    }

    public final void l(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b057c", new Object[]{this, str, list});
        } else if (str.contains(",")) {
            String[] split = str.split(",");
            if (split != null && split.length > 0) {
                for (String str2 : split) {
                    IDMComponent k = cb4.k(this.f21638a.c(), str2);
                    if (k != null) {
                        list.add(k.getKey());
                    }
                }
            }
        } else {
            IDMComponent k2 = cb4.k(this.f21638a.c(), str);
            if (k2 != null) {
                list.add(k2.getKey());
            }
        }
    }

    public final void m(lcu lcuVar, List<String> list) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31afb2d9", new Object[]{this, lcuVar, list});
        } else if ((lcuVar.c() instanceof gsb) && (fields = ((gsb) lcuVar.c()).getFields()) != null) {
            String string = fields.getString("fromBundleId");
            String string2 = fields.getString("toBundleId");
            String string3 = fields.getString("from");
            if ("addItemToGroup".equals(fields.getString("type")) && !TextUtils.isEmpty(string3)) {
                l(string3, list);
            }
            if (!TextUtils.isEmpty(string)) {
                for (IDMComponent iDMComponent : cb4.l(cb4.j(this.f21638a.c(), string))) {
                    list.add(iDMComponent.getKey());
                }
            }
            if (!TextUtils.isEmpty(string2)) {
                IDMComponent i = cb4.i(this.f21638a.c(), string2);
                if (i != null) {
                    list.add(i.getKey());
                    return;
                }
                ArrayList arrayList = new ArrayList();
                cb4.h(arrayList, cb4.j(this.f21638a.c(), string2));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    list.add(((IDMComponent) it.next()).getKey());
                }
            }
        }
    }
}
