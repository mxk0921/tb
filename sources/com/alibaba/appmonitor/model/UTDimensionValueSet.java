package com.alibaba.appmonitor.model;

import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import java.util.Map;
import tb.asl;
import tb.oeh;
import tb.t2o;
import tb.to1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UTDimensionValueSet extends DimensionValueSet {
    static {
        t2o.a(962593047);
    }

    public static UTDimensionValueSet create(Map<String, String> map) {
        return (UTDimensionValueSet) to1.a().d(UTDimensionValueSet.class, map);
    }

    @Override // com.alibaba.mtl.appmonitor.model.DimensionValueSet, tb.rbo
    public void clean() {
        super.clean();
    }

    @Override // com.alibaba.mtl.appmonitor.model.DimensionValueSet, tb.rbo
    public void fill(Object... objArr) {
        super.fill(objArr);
    }

    public Integer getEventId() {
        int i;
        String str;
        Map<String, String> map = this.map;
        if (!(map == null || (str = map.get(oeh.EVENTID)) == null)) {
            try {
                i = asl.a(str);
            } catch (NumberFormatException unused) {
            }
            return Integer.valueOf(i);
        }
        i = 0;
        return Integer.valueOf(i);
    }
}
