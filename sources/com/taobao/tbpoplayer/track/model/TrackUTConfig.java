package com.taobao.tbpoplayer.track.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.auv;
import tb.t2o;
import tb.vem;
import tb.wdm;
import tb.y9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TrackUTConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile boolean enable = true;
    public Map<String, Boolean> hitResultMap = new HashMap();
    public Map<String, Integer> percentMap;

    static {
        t2o.a(790626498);
    }

    public Map<String, Boolean> generateHitMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1311559a", new Object[]{this});
        }
        Map<String, Integer> map = this.percentMap;
        if (map == null || map.isEmpty()) {
            HashMap hashMap = new HashMap();
            this.hitResultMap = hashMap;
            return hashMap;
        }
        Map<String, Boolean> map2 = this.hitResultMap;
        if (map2 == null) {
            this.hitResultMap = new HashMap();
        } else {
            map2.clear();
        }
        try {
            long f = vem.f(y9u.f().d() + System.currentTimeMillis());
            for (String str : this.percentMap.keySet()) {
                this.hitResultMap.put(str, Boolean.valueOf(vem.d(this.percentMap.get(str).intValue(), f)));
            }
        } catch (Throwable th) {
            wdm.h("TrackUTConfig.generateHitMap.error", th);
        }
        return this.hitResultMap;
    }

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
        if (map == null || !map.containsKey(str)) {
            return auv.a().b(str);
        }
        return this.hitResultMap.get(str).booleanValue();
    }
}
