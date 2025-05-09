package tb;

import android.app.Application;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.solution.BHRSolution;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class g00 implements xl0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract void initialize(Application application, String str, String str2);

    public abstract void registerConfig(String str, String str2) throws Exception;

    public abstract void registerSolution(String str, BHRSolution bHRSolution);

    public abstract void triggerEvent(String str, JSONObject jSONObject);

    public abstract void unRegisterSolution(String str, BHRSolution bHRSolution);
}
