package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.wukong.bx.algo.BxData;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Oa implements Na {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2566a = "LegacyBhDataParser";

    @Override // com.alibaba.security.ccrc.service.build.Na
    public BxData.a a(Map<String, Object> map, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BxData.a) ipChange.ipc$dispatch("2d37b458", new Object[]{this, map, str});
        }
        String str3 = null;
        if (map.containsKey(BxData.OP_CONF)) {
            str2 = (String) map.get(BxData.OP_CONF);
            map.remove(BxData.OP_CONF);
        } else {
            str2 = null;
        }
        if (map.containsKey(BxData.WORK_CONF)) {
            str3 = (String) map.get(BxData.WORK_CONF);
            map.remove(BxData.WORK_CONF);
        }
        return BxData.doParseSeqResult(str3, str2, str, map);
    }
}
