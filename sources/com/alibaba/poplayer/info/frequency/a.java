package com.alibaba.poplayer.info.frequency;

import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.info.frequency.FrequencyManager;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a extends FrequencyManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.poplayer.info.frequency.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class C0090a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final a f2521a = new a();

        static {
            t2o.a(625999927);
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4c622725", new Object[0]);
            }
            return f2521a;
        }
    }

    static {
        t2o.a(625999926);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -703726301) {
            super.m();
            return null;
        } else if (hashCode == 466319906) {
            return aVar.e();
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/poplayer/info/frequency/PopFrequencyInfoFileHelper");
        }
    }

    public static a t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("734c1760", new Object[0]);
        }
        return C0090a.a();
    }

    @Override // com.alibaba.poplayer.info.frequency.FrequencyManager
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("787e7f7c", new Object[]{this});
        }
        return "poplayer_frequency_page";
    }

    @Override // com.alibaba.poplayer.info.frequency.FrequencyManager
    public long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c588d500", new Object[]{this})).longValue();
        }
        return 604800L;
    }

    @Override // com.alibaba.poplayer.info.frequency.FrequencyManager
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d60dfd23", new Object[]{this});
        } else {
            super.m();
        }
    }

    public int p(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64ff5ec2", new Object[]{this, baseConfigItem})).intValue();
        }
        if (baseConfigItem == null || baseConfigItem.freqConfigs == null) {
            return -1;
        }
        String s = s();
        String str = baseConfigItem.indexID;
        long startTimeStamp = baseConfigItem.getStartTimeStamp();
        long currentTimeStamp = PopLayer.getReference().getCurrentTimeStamp();
        BaseConfigItem.FrequencyConfigInfo frequencyConfigInfo = baseConfigItem.freqConfigs;
        return a(s, str, startTimeStamp, currentTimeStamp, frequencyConfigInfo.freqSecs, frequencyConfigInfo.freqMaxCount, frequencyConfigInfo.freqFirstOffset, frequencyConfigInfo.freqEnableSection, frequencyConfigInfo.freqIntervalSecs);
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77dbfce4", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(s());
        b(arrayList);
    }

    public FrequencyManager.FrequencyInfo r(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrequencyManager.FrequencyInfo) ipChange.ipc$dispatch("9840448d", new Object[]{this, baseConfigItem});
        }
        return f(s(), baseConfigItem.indexID);
    }

    public final String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("267b573e", new Object[]{this});
        }
        return "config_frequency_info";
    }

    public void u(List<BaseConfigItem> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99310ae4", new Object[]{this, list, new Boolean(z)});
        } else if (list != null) {
            HashSet hashSet = new HashSet();
            for (BaseConfigItem baseConfigItem : list) {
                BaseConfigItem.FrequencyConfigInfo frequencyConfigInfo = baseConfigItem.freqConfigs;
                if (frequencyConfigInfo != null && i(frequencyConfigInfo.freqSecs, frequencyConfigInfo.freqIntervalSecs)) {
                    hashSet.add(baseConfigItem.indexID);
                }
            }
            l(s(), hashSet, z);
        }
    }

    public void v(Set<String> set, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc944f4", new Object[]{this, set, new Boolean(z)});
        } else if (set != null) {
            l(s(), set, z);
        }
    }

    public boolean w(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f5f6214", new Object[]{this, baseConfigItem})).booleanValue();
        }
        if (baseConfigItem == null || baseConfigItem.freqConfigs == null) {
            return false;
        }
        String s = s();
        String str = baseConfigItem.indexID;
        long startTimeStamp = baseConfigItem.getStartTimeStamp();
        long currentTimeStamp = PopLayer.getReference().getCurrentTimeStamp();
        BaseConfigItem.FrequencyConfigInfo frequencyConfigInfo = baseConfigItem.freqConfigs;
        if (o(s, str, startTimeStamp, currentTimeStamp, frequencyConfigInfo.freqSecs, frequencyConfigInfo.freqMaxCount, frequencyConfigInfo.freqIntervalSecs) == 0) {
            return true;
        }
        return false;
    }
}
