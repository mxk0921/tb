package tb;

import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.Ingore;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fa extends rf8 implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Column("module")
    public String module;
    @Column("mp")
    public String monitorPoint;
    @Column("offline")
    public String offline;
    @Ingore
    private HashMap<String, fa> relationMap;
    @Column(StatisticRecord.ET_CP)
    private int sampling;

    static {
        t2o.a(962593063);
    }

    private boolean checkSelfOffline() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8989bda", new Object[]{this})).booleanValue();
        }
        return "1".equalsIgnoreCase(this.offline);
    }

    public static /* synthetic */ Object ipc$super(fa faVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/appmonitor/sample/AMConifg");
    }

    private boolean sampling(int i, ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eee7b8f9", new Object[]{this, new Integer(i), arrayList})).booleanValue();
        }
        if (arrayList == null || arrayList.size() == 0) {
            return checkSelfSampling(i);
        }
        String remove = arrayList.remove(0);
        if (isContains(remove)) {
            return this.relationMap.get(remove).sampling(i, arrayList);
        }
        return checkSelfSampling(i);
    }

    public synchronized void add(String str, fa faVar) {
        HashMap<String, fa> hashMap;
        HashMap<String, fa> hashMap2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad38637d", new Object[]{this, str, faVar});
            return;
        }
        if (this.relationMap == null) {
            this.relationMap = new HashMap<>();
        }
        if (isContains(str)) {
            fa faVar2 = this.relationMap.get(str);
            if (!(faVar2 == null || (hashMap = faVar2.relationMap) == null || (hashMap2 = faVar.relationMap) == null)) {
                hashMap2.putAll(hashMap);
            }
            nhh.v("config object order errror", "config:", faVar + "");
        }
        this.relationMap.put(str, faVar);
    }

    public Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        return super.clone();
    }

    public void enableOffline() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cfaeb67", new Object[]{this});
        } else {
            this.offline = "1";
        }
    }

    public String getModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1e176d7", new Object[]{this});
        }
        return this.module;
    }

    public synchronized fa getNext(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fa) ipChange.ipc$dispatch("8be15d67", new Object[]{this, str});
        }
        if (this.relationMap == null) {
            this.relationMap = new HashMap<>();
        }
        return this.relationMap.get(str);
    }

    public synchronized fa getOrBulidNext(String str) {
        fa faVar;
        CloneNotSupportedException e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fa) ipChange.ipc$dispatch("23c20462", new Object[]{this, str});
        }
        fa next = getNext(str);
        if (next == null) {
            try {
                faVar = (fa) clone();
                try {
                    faVar.module = str;
                } catch (CloneNotSupportedException e2) {
                    e = e2;
                    e.printStackTrace();
                    next = faVar;
                    this.relationMap.put(str, next);
                    return next;
                }
            } catch (CloneNotSupportedException e3) {
                faVar = next;
                e = e3;
            }
            next = faVar;
        }
        this.relationMap.put(str, next);
        return next;
    }

    public synchronized boolean isContains(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28b4733e", new Object[]{this, str})).booleanValue();
        }
        HashMap<String, fa> hashMap = this.relationMap;
        if (hashMap == null) {
            return false;
        }
        return hashMap.containsKey(str);
    }

    public boolean isOffline(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a08a78", new Object[]{this, str, str2})).booleanValue();
        }
        ArrayList<String> arrayList = new ArrayList<>(2);
        arrayList.add(str);
        arrayList.add(str2);
        return isOffline(arrayList);
    }

    public boolean isSampled(int i, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1f06e89", new Object[]{this, new Integer(i), str, str2, map})).booleanValue();
        }
        ArrayList<String> arrayList = new ArrayList<>(2);
        arrayList.add(str);
        arrayList.add(str2);
        return sampling(i, arrayList);
    }

    public void setSampling(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a69aa93", new Object[]{this, new Integer(i)});
        } else {
            this.sampling = i;
        }
    }

    @Deprecated
    public void enableOffline(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1263344d", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.offline = "1";
        } else {
            this.offline = null;
        }
    }

    public boolean checkSelfSampling(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ef32fc5", new Object[]{this, new Integer(i)})).booleanValue();
        }
        nhh.r("AMConifg", "sampling module", this.module, "monitorPoint", this.monitorPoint, "samplingSeed", Integer.valueOf(i), "sampling", Integer.valueOf(this.sampling));
        return i < this.sampling;
    }

    private boolean isOffline(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5bb304e", new Object[]{this, arrayList})).booleanValue();
        }
        if (arrayList == null || arrayList.size() == 0) {
            return checkSelfOffline();
        }
        String remove = arrayList.remove(0);
        if (isContains(remove)) {
            return this.relationMap.get(remove).isOffline(arrayList);
        }
        return checkSelfOffline();
    }
}
