package com.taobao.tbpoplayer.track.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;
import tb.vem;
import tb.y9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TrackAppMonitorConfig extends TrackUTConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile boolean useConfigCheckFail = false;
    public volatile boolean onePopOnlyResult = false;
    public volatile int jumpLoseJumpCount = 3;

    static {
        t2o.a(790626496);
    }

    public static /* synthetic */ Object ipc$super(TrackAppMonitorConfig trackAppMonitorConfig, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/track/model/TrackAppMonitorConfig");
    }

    @Override // com.taobao.tbpoplayer.track.model.TrackUTConfig
    public boolean getCategoryHit(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79248f08", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (z) {
            return vem.d(this.percentMap.get(str).intValue(), vem.f(y9u.f().d() + System.currentTimeMillis()));
        }
        Map<String, Boolean> map = this.hitResultMap;
        if (map == null || (map.containsKey(str) && !this.hitResultMap.get(str).booleanValue())) {
            return false;
        }
        return true;
    }
}
