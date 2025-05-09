package tb;

import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qwk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final qwk f26971a = new qwk();

        static {
            t2o.a(625999923);
        }

        public static /* synthetic */ qwk a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qwk) ipChange.ipc$dispatch("6dcfa22c", new Object[0]);
            }
            return f26971a;
        }
    }

    static {
        t2o.a(625999922);
    }

    public static qwk c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qwk) ipChange.ipc$dispatch("55829027", new Object[0]);
        }
        return a.a();
    }

    public boolean a(com.alibaba.poplayer.trigger.a aVar) {
        BaseConfigItem.FrequencyConfigInfo frequencyConfigInfo;
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
            if ((!aVar.t() && !aVar.y() && !aVar.w()) || (frequencyConfigInfo = aVar.K().freqConfigs) == null) {
                return true;
            }
            String O = aVar.O();
            long j = frequencyConfigInfo.onceExposeCount;
            if (j <= 0) {
                wdm.d("OnceAddFrequency.checkFreq.indexId=" + O + ".onceExposeCount=" + j + ".ignore", new Object[0]);
                return true;
            }
            OnePopModule k = aVar.k();
            if (k == null) {
                return true;
            }
            int i = k.h;
            if (j > i) {
                z = true;
            } else {
                z = false;
            }
            wdm.d("OnceAddFrequency.checkFreq.indexId=" + O + ".count=" + i + ".onceExposeCount=" + j + ".shouldPop=" + z, new Object[0]);
            return z;
        } catch (Throwable th) {
            wdm.h("OnceAddFrequency.checkFreq.error", th);
            return true;
        }
    }

    public void b(com.alibaba.poplayer.trigger.a aVar) {
        OnePopModule k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a864f1", new Object[]{this, aVar});
        } else if (aVar != null) {
            try {
                if ((aVar.t() || aVar.y() || aVar.w()) && (k = aVar.k()) != null) {
                    k.h++;
                    wdm.d("OnceAddFrequency.costTire.indexId=" + aVar.O() + ".exposeTimes=" + k.h, new Object[0]);
                }
            } catch (Throwable th) {
                wdm.h("OnceAddFrequency.costTire.error", th);
            }
        }
    }
}
