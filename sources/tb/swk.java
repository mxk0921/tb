package tb;

import android.text.TextUtils;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class swk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final swk f28324a = new swk();

        static {
            t2o.a(625999925);
        }

        public static /* synthetic */ swk a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (swk) ipChange.ipc$dispatch("afb7d270", new Object[0]);
            }
            return f28324a;
        }
    }

    static {
        t2o.a(625999924);
    }

    public static swk c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (swk) ipChange.ipc$dispatch("be62a3d5", new Object[0]);
        }
        return a.a();
    }

    public boolean a(com.alibaba.poplayer.trigger.a aVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eac7ac4a", new Object[]{this, aVar})).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        try {
            if (aVar.K() == null) {
                return false;
            }
            BaseConfigItem.FrequencyConfigInfo frequencyConfigInfo = aVar.K().freqConfigs;
            if (frequencyConfigInfo == null) {
                return true;
            }
            String O = aVar.O();
            if (TextUtils.isEmpty(O)) {
                O = "";
            }
            long j = frequencyConfigInfo.onceShowCount;
            if (j <= 0) {
                wdm.d("OnceShowFrequency.checkFreq.indexId=" + O + ".onceShowCount=" + j + ".ignore", new Object[0]);
                return true;
            }
            OnePopModule k = aVar.k();
            if (k == null) {
                return true;
            }
            if (j > k.i) {
                z = true;
            } else {
                z = false;
            }
            wdm.d("OnceShowFrequency.checkFreq.indexId=" + O + ".showTimes=" + k.i + ".onceShowCount=" + j + ".shouldPop=" + z, new Object[0]);
            return z;
        } catch (Throwable th) {
            wdm.h("OnceShowFrequency.checkFreq.error", th);
            return true;
        }
    }

    public void b(com.alibaba.poplayer.trigger.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a864f1", new Object[]{this, aVar});
        } else if (aVar != null) {
            try {
                OnePopModule k = aVar.k();
                if (k != null) {
                    k.i++;
                    wdm.d("OnceShowFrequency.costTire.indexId=" + aVar.O() + ".showTimes=" + k.i, new Object[0]);
                }
            } catch (Throwable th) {
                wdm.h("OnceShowFrequency.costTire.error", th);
            }
        }
    }
}
