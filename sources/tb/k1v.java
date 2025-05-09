package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.config.UTCollectConfig;
import com.taobao.tao.log.logger.EventLogger;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class k1v extends ynb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public g2v d = null;
    public UTCollectConfig e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends g2v {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final UTCollectConfig f22356a;
        public final int[] b;

        static {
            t2o.a(615514139);
        }

        public a(UTCollectConfig uTCollectConfig, int[] iArr) {
            this.f22356a = uTCollectConfig;
            this.b = iArr;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -2066387105) {
                return super.onEventDispatch((String) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3], (String) objArr[4], (Map) objArr[5]);
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/diagnose/collector/UTInfoCollector$UTCollectPlugin");
        }

        @Override // tb.g2v
        public int[] getAttentionEventIds() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (int[]) ipChange.ipc$dispatch("873e4cb7", new Object[]{this});
            }
            return this.b;
        }

        @Override // tb.g2v
        public String getPluginName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fd12a725", new Object[]{this});
            }
            return "UTInfoCollector";
        }

        @Override // tb.g2v
        public Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("84d56f5f", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
            }
            if (i == 2101) {
                idh.a("UTInfoCollector", "Click Event: Page: " + str + ", Button: " + str2);
                if (this.f22356a.clickPageWhiteList.contains(str)) {
                    EventLogger.builder(7).setPageID(uk7.i().g().j()).setData("page", str).setData("click", str2).log();
                }
            }
            return super.onEventDispatch(str, i, str2, str3, str4, map);
        }
    }

    static {
        t2o.a(615514138);
    }

    public k1v(Application application, qk7 qk7Var) {
        super(application, qk7Var);
    }

    public static /* synthetic */ Object ipc$super(k1v k1vVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/diagnose/collector/UTInfoCollector");
    }

    @Override // tb.ynb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        try {
            UTCollectConfig j = mk7.j();
            this.e = j;
            if (!j.isEnable) {
                idh.a("UTInfoCollector", "The UT Collect is disable");
                return;
            }
            ArrayList arrayList = new ArrayList();
            UTCollectConfig uTCollectConfig = this.e;
            if (uTCollectConfig.isClickEnable && !uTCollectConfig.clickPageWhiteList.isEmpty()) {
                arrayList.add(2101);
            }
            if (!arrayList.isEmpty() && this.d == null) {
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Integer) arrayList.get(i)).intValue();
                    idh.a("UTInfoCollector", "Register ut event: " + iArr[i]);
                }
                this.d = new a(this.e, iArr);
                UTAnalytics.getInstance().registerPlugin(this.d, false, null, null);
                idh.a("UTInfoCollector", "Register ut plugin!");
            }
        } catch (Exception e) {
            idh.c("UTInfoCollector", "init ", e);
        }
    }
}
