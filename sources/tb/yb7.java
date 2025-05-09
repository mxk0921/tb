package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yb7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DELTA_PASS_PARAMS = "deltaPassParams";
    public static final String IS_REPLACE_DELTA_PASS_PARAMS = "isReplaceDeltaPassParams";

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f31960a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final yb7 f31961a = new yb7();

        static {
            t2o.a(729809841);
        }

        public static /* synthetic */ yb7 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (yb7) ipChange.ipc$dispatch("557c8ef8", new Object[0]);
            }
            return f31961a;
        }
    }

    static {
        t2o.a(729809840);
    }

    public static yb7 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yb7) ipChange.ipc$dispatch("bba99ebd", new Object[0]);
        }
        return a.a();
    }

    public void b(AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9dc808a", new Object[]{this, awesomeGetContainerData});
            return;
        }
        JSONObject deltaExt = awesomeGetContainerData.getDeltaExt();
        if (deltaExt == null) {
            JSONObject ext = awesomeGetContainerData.getExt();
            if (ext != null && "true".equals(ext.getString(IS_REPLACE_DELTA_PASS_PARAMS))) {
                this.f31960a = ext.getJSONObject(DELTA_PASS_PARAMS);
            }
        } else if ("true".equals(deltaExt.getString(IS_REPLACE_DELTA_PASS_PARAMS))) {
            this.f31960a = deltaExt.getJSONObject(DELTA_PASS_PARAMS);
        }
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d709b6", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = this.f31960a;
        if (jSONObject2 != null) {
            jSONObject.put(DELTA_PASS_PARAMS, (Object) jSONObject2);
            this.f31960a = null;
        }
    }
}
