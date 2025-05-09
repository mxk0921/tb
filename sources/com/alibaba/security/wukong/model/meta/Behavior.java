package com.alibaba.security.wukong.model.meta;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Behavior extends BaseData {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, Object> behavior;

    public Behavior(Map<String, Object> map) {
        super(System.currentTimeMillis());
        this.behavior = map;
    }

    public static /* synthetic */ Object ipc$super(Behavior behavior, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/wukong/model/meta/Behavior");
    }

    @Override // com.alibaba.security.wukong.model.meta.Data
    public Map<String, Object> getRawMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("49177706", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(type(), this.behavior);
        return hashMap;
    }

    @Override // com.alibaba.security.wukong.model.meta.Data
    public int length() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("451fdc60", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.alibaba.security.wukong.model.meta.Data
    public String type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("426047ff", new Object[]{this});
        }
        return "behavior";
    }

    public Behavior(Map<String, Object> map, long j) {
        super(j);
        this.behavior = map;
    }

    public Behavior(long j) {
        super(j);
    }
}
