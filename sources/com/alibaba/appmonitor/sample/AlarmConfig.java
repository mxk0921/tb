package com.alibaba.appmonitor.sample;

import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.TableName;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Map;
import tb.fa;
import tb.nhh;
import tb.t2o;

/* compiled from: Taobao */
@TableName("ap_alarm")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AlarmConfig extends fa {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Column("scp")
    public int successSampling = 0;
    @Column("fcp")
    public int failSampling = 0;

    static {
        t2o.a(962593067);
    }

    public static /* synthetic */ Object ipc$super(AlarmConfig alarmConfig, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/appmonitor/sample/AlarmConfig");
    }

    public boolean isSampled(int i, String str, String str2, Boolean bool, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f654759c", new Object[]{this, new Integer(i), str, str2, bool, map})).booleanValue();
        }
        ArrayList<String> arrayList = new ArrayList<>(2);
        arrayList.add(str);
        arrayList.add(str2);
        return sampling(i, arrayList, bool.booleanValue());
    }

    @Override // tb.fa
    public void setSampling(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a69aa93", new Object[]{this, new Integer(i)});
            return;
        }
        this.successSampling = i;
        this.failSampling = i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AlarmConfig{module=" + this.module + ", monitorPoint=" + this.monitorPoint + ", offline=" + this.offline + ", failSampling=" + this.failSampling + ", successSampling=" + this.successSampling + '}';
    }

    private boolean sampling(int i, ArrayList<String> arrayList, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee101883", new Object[]{this, new Integer(i), arrayList, new Boolean(z)})).booleanValue();
        }
        if (arrayList == null || arrayList.size() == 0) {
            return checkSelfSampling(i, z);
        }
        String remove = arrayList.remove(0);
        if (isContains(remove)) {
            return ((AlarmConfig) getNext(remove)).sampling(i, arrayList, z);
        }
        return checkSelfSampling(i, z);
    }

    @Deprecated
    public boolean isSampled(int i, String str, String str2, Boolean bool) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c13ce251", new Object[]{this, new Integer(i), str, str2, bool})).booleanValue() : isSampled(i, str, str2, bool, null);
    }

    private boolean checkSelfSampling(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f737b37", new Object[]{this, new Integer(i), new Boolean(z)})).booleanValue();
        }
        if (z) {
            nhh.r("AlarmConfig", "samplingSeed", Integer.valueOf(i), "sampling", Integer.valueOf(this.successSampling));
            return i < this.successSampling;
        }
        nhh.r("AlarmConfig", "samplingSeed", Integer.valueOf(i), "sampling", Integer.valueOf(this.failSampling));
        return i < this.failSampling;
    }
}
