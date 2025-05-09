package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import tb.ysm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wkz extends ftm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(wkz wkzVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/preload/random/RandomPreloadTaskLoader");
    }

    @Override // tb.ftm
    public void l(JSONObject jSONObject, ddt ddtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7bc1dc6", new Object[]{this, jSONObject, ddtVar});
            return;
        }
        PreloadTaskEntity preloadTaskEntity = null;
        try {
            preloadTaskEntity = PreloadTaskEntity.parser(jSONObject, this.h, true);
            m(preloadTaskEntity, ddtVar);
        } catch (Exception e) {
            wsm.b(csm.a("RecommendPreloadTaskLoader"), "random预加载批量接口任务执行失败", e);
            if (ddtVar != null) {
                ((ysm.a) ddtVar).a(preloadTaskEntity, e);
            }
        }
    }
}
