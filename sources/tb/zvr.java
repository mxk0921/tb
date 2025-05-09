package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zvr extends amo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_TBSEARCH = "tbMainSearch";
    public static volatile zvr l = null;

    static {
        t2o.a(815793381);
    }

    public zvr(String str, yko ykoVar) {
        super(str, ykoVar);
    }

    public static /* synthetic */ Object ipc$super(zvr zvrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/TBSearchTemplateMonitor");
    }

    public static zvr u(yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zvr) ipChange.ipc$dispatch("8c4d7da6", new Object[]{ykoVar});
        }
        if (l == null) {
            synchronized (zvr.class) {
                try {
                    if (l == null) {
                        l = new zvr(BIZ_TBSEARCH, ykoVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return l;
    }

    public static String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad9cd5e5", new Object[0]);
        }
        return BIZ_TBSEARCH;
    }

    @Override // tb.amo
    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4431af83", new Object[]{this});
        }
        return v();
    }
}
