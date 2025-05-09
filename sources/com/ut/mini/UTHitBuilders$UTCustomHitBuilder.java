package com.ut.mini;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.g1v;
import tb.hsq;
import tb.m3i;
import tb.oeh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UTHitBuilders$UTCustomHitBuilder extends g1v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593160);
    }

    public UTHitBuilders$UTCustomHitBuilder(String str) {
        if (!hsq.f(str)) {
            super.setProperty(g1v.FIELD_ARG1, str);
        }
        super.setProperty(g1v.FIELD_EVENT_ID, "19999");
        super.setProperty(g1v.FIELD_ARG3, "0");
        super.setProperty("_priority", "4");
    }

    public static /* synthetic */ Object ipc$super(UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -835590806) {
            return super.build();
        }
        if (hashCode == 807983230) {
            return super.setProperty((String) objArr[0], (String) objArr[1]);
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/ut/mini/UTHitBuilders$UTCustomHitBuilder");
    }

    @Override // tb.g1v
    public Map<String, String> build() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ce31e56a", new Object[]{this});
        }
        Map<String, String> build = super.build();
        if (build == null) {
            return build;
        }
        String str = build.get("PAGE");
        String str2 = build.get(oeh.ARG1);
        if (str2 == null) {
            return build;
        }
        build.remove(oeh.ARG1);
        build.remove("PAGE");
        Map<String, String> c = m3i.c(build);
        c.put(oeh.ARG1, str2);
        c.put("PAGE", str);
        return c;
    }

    public UTHitBuilders$UTCustomHitBuilder setDurationOnEvent(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTHitBuilders$UTCustomHitBuilder) ipChange.ipc$dispatch("4198c607", new Object[]{this, new Long(j)});
        }
        if (j < 0) {
            j = 0;
        }
        super.setProperty(g1v.FIELD_ARG3, String.valueOf(j));
        return this;
    }

    public UTHitBuilders$UTCustomHitBuilder setEventPage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTHitBuilders$UTCustomHitBuilder) ipChange.ipc$dispatch("833cffe7", new Object[]{this, str});
        }
        if (!hsq.f(str)) {
            super.setProperty(g1v.FIELD_PAGE, str);
        }
        return this;
    }
}
