package tb;

import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamOtherResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class o3o extends ux {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ux f25127a;

    static {
        t2o.a(479199314);
    }

    public o3o(ux uxVar) {
        this.f25127a = uxVar;
    }

    public static /* synthetic */ Object ipc$super(o3o o3oVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1706952482:
                return new Boolean(super.d());
            case -1000274106:
                return new Boolean(super.e(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]));
            case -882511587:
                super.j((JSONObject) objArr[0]);
                return null;
            case -636794163:
                super.k((fsb) objArr[0]);
                return null;
            case 177337691:
                return new Boolean(super.n((String) objArr[0], (List) objArr[1]));
            case 1660067414:
                super.m(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2], (fsb) objArr[3], (Map) objArr[4]);
                return null;
            case 1688447688:
                super.l((fsb) objArr[0], (StreamRemoteMainResponse) objArr[1], (List) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/config/bizRequest/RequestCallbackWrapper");
        }
    }

    @Override // tb.ojd
    public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
            return;
        }
        ux uxVar = this.f25127a;
        if (uxVar != null) {
            uxVar.a(i, mtopResponse, obj, z, map);
        }
    }

    @Override // tb.ojd
    public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
            return;
        }
        ux uxVar = this.f25127a;
        if (uxVar != null) {
            uxVar.b(i, mtopResponse, obj, fsbVar, map);
        }
    }

    @Override // tb.ux
    public void c(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daca3f86", new Object[]{this, list});
            return;
        }
        ux uxVar = this.f25127a;
        if (uxVar != null) {
            uxVar.c(list);
        }
    }

    @Override // tb.ux
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a41f8de", new Object[]{this})).booleanValue();
        }
        ux uxVar = this.f25127a;
        if (uxVar != null) {
            return uxVar.d();
        }
        return super.d();
    }

    @Override // tb.ux
    public boolean e(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4610746", new Object[]{this, new Integer(i), mtopResponse, obj})).booleanValue();
        }
        ux uxVar = this.f25127a;
        if (uxVar != null) {
            return uxVar.e(i, mtopResponse, obj);
        }
        return super.e(i, mtopResponse, obj);
    }

    @Override // tb.ux
    public void g(StreamOtherResponse streamOtherResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("608b8323", new Object[]{this, streamOtherResponse});
            return;
        }
        ux uxVar = this.f25127a;
        if (uxVar != null) {
            uxVar.g(streamOtherResponse);
        }
    }

    @Override // tb.ux
    public void h(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8700e9de", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        ux uxVar = this.f25127a;
        if (uxVar != null) {
            uxVar.h(i, mtopResponse, obj);
        }
    }

    @Override // tb.ux
    public void i(int i, MtopResponse mtopResponse, Object obj, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c18694c3", new Object[]{this, new Integer(i), mtopResponse, obj, map});
            return;
        }
        ux uxVar = this.f25127a;
        if (uxVar != null) {
            uxVar.i(i, mtopResponse, obj, map);
        }
    }

    @Override // tb.ux
    public void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb65f11d", new Object[]{this, jSONObject});
            return;
        }
        super.j(jSONObject);
        ux uxVar = this.f25127a;
        if (uxVar != null) {
            uxVar.j(jSONObject);
        }
    }

    @Override // tb.ux
    public void k(fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da0b4acd", new Object[]{this, fsbVar});
            return;
        }
        super.k(fsbVar);
        ux uxVar = this.f25127a;
        if (uxVar != null) {
            uxVar.k(fsbVar);
        }
    }

    @Override // tb.ux
    public void l(fsb fsbVar, StreamRemoteMainResponse streamRemoteMainResponse, List<AttachedResponse> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64a3aac8", new Object[]{this, fsbVar, streamRemoteMainResponse, list});
            return;
        }
        super.l(fsbVar, streamRemoteMainResponse, list);
        ux uxVar = this.f25127a;
        if (uxVar != null) {
            uxVar.l(fsbVar, streamRemoteMainResponse, list);
        }
    }

    @Override // tb.ux
    public void m(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62f29e56", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
            return;
        }
        super.m(i, mtopResponse, obj, fsbVar, map);
        ux uxVar = this.f25127a;
        if (uxVar != null) {
            uxVar.m(i, mtopResponse, obj, fsbVar, map);
        }
    }

    @Override // tb.ux
    public boolean n(String str, List<AttachedResponse> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a91f55b", new Object[]{this, str, list})).booleanValue();
        }
        ux uxVar = this.f25127a;
        if (uxVar != null) {
            return uxVar.n(str, list);
        }
        return super.n(str, list);
    }
}
