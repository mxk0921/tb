package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class h1v extends g1v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593162);
    }

    public h1v(String str) {
        if (!hsq.f(str)) {
            super.setProperty(g1v.FIELD_PAGE, str);
        }
        super.setProperty(g1v.FIELD_EVENT_ID, "2001");
        super.setProperty(g1v.FIELD_ARG3, "0");
    }

    public static /* synthetic */ Object ipc$super(h1v h1vVar, String str, Object... objArr) {
        if (str.hashCode() == 807983230) {
            return super.setProperty((String) objArr[0], (String) objArr[1]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/UTHitBuilders$UTPageHitBuilder");
    }

    public h1v setDurationOnPage(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h1v) ipChange.ipc$dispatch("c27f128", new Object[]{this, new Long(j)});
        }
        if (j < 0) {
            j = 0;
        }
        super.setProperty(g1v.FIELD_ARG3, String.valueOf(j));
        return this;
    }

    public h1v setReferPage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h1v) ipChange.ipc$dispatch("ab8cb523", new Object[]{this, str});
        }
        if (!hsq.f(str)) {
            super.setProperty(g1v.FIELD_ARG1, str);
        }
        return this;
    }
}
