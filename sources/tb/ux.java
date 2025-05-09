package tb;

import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamOtherResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class ux implements ojd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886118);
        t2o.a(83886128);
    }

    public void c(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daca3f86", new Object[]{this, list});
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a41f8de", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean e(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4610746", new Object[]{this, new Integer(i), mtopResponse, obj})).booleanValue();
        }
        return false;
    }

    public void f(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0da171b", new Object[]{this, new Integer(i), mtopResponse, obj});
        }
    }

    public void g(StreamOtherResponse streamOtherResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("608b8323", new Object[]{this, streamOtherResponse});
        }
    }

    public void h(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8700e9de", new Object[]{this, new Integer(i), mtopResponse, obj});
        }
    }

    public void i(int i, MtopResponse mtopResponse, Object obj, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c18694c3", new Object[]{this, new Integer(i), mtopResponse, obj, map});
        }
    }

    public void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb65f11d", new Object[]{this, jSONObject});
        }
    }

    public void k(fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da0b4acd", new Object[]{this, fsbVar});
        }
    }

    public void l(fsb fsbVar, StreamRemoteMainResponse streamRemoteMainResponse, List<AttachedResponse> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64a3aac8", new Object[]{this, fsbVar, streamRemoteMainResponse, list});
        }
    }

    public void m(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62f29e56", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
        }
    }

    public boolean n(String str, List<AttachedResponse> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a91f55b", new Object[]{this, str, list})).booleanValue();
        }
        if (list == null || list.isEmpty() || !list.get(0).getReqId().equals(str)) {
            return false;
        }
        return true;
    }
}
