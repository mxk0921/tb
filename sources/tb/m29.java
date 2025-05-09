package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.business.interact.favor.FavorRequest;
import com.taobao.taolive.sdk.business.interact.favor.FavorResponse;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class m29 extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long l = 0;
    public long m = 0;

    static {
        t2o.a(806356013);
    }

    public m29(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(m29 m29Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/interact/favor/FavorBusiness");
    }

    public long L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2754", new Object[]{this})).longValue();
        }
        return this.l;
    }

    public long M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ffb341c", new Object[]{this})).longValue();
        }
        return this.m;
    }

    public void K(long j, long j2, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c541cd", new Object[]{this, new Long(j), new Long(j2), str, str2, map});
            return;
        }
        FavorRequest favorRequest = new FavorRequest();
        this.l = j;
        this.m = j2;
        favorRequest.count = j;
        favorRequest.topic = str;
        favorRequest.relatedTopic = str2;
        if (map != null && map.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            if (map.keySet() != null && map.keySet().size() > 0) {
                for (String str3 : map.keySet()) {
                    jSONObject.put(str3, (Object) map.get(str3));
                }
            }
            favorRequest.extraFlag = JSON.toJSONString(jSONObject);
        }
        C(1, favorRequest, FavorResponse.class);
        giv.f().f("like_test", new HashMap());
    }
}
