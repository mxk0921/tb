package com.alibaba.poplayer.info.frequency;

import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.t2o;
import tb.wdm;
import tb.ycm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class FrequencyManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FREQUENCY_CHECK_FAILED = 1;
    public static final int FREQUENCY_CHECK_FAILED_INTERVAL = 5;
    public static final int FREQUENCY_CHECK_FAILED_NOT_STARTED = 2;
    public static final int FREQUENCY_CHECK_FAILED_REACH_MAX = 3;
    public static final int FREQUENCY_CHECK_FAILED_UNABLE_SECTION = 4;
    public static final int FREQUENCY_CHECK_NOT_ENABLE = -1;
    public static final int FREQUENCY_CHECK_SUCCESS = 0;

    /* renamed from: a  reason: collision with root package name */
    public volatile JSONObject f2520a;
    public final ycm b = new ycm(d());

    static {
        t2o.a(625999919);
    }

    public static boolean h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54eb5074", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i == -1 || i == 0) {
            return true;
        }
        return false;
    }

    public void b(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d69953c", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            synchronized (this) {
                try {
                    for (String str : list) {
                        if (this.f2520a.containsKey(str)) {
                            this.f2520a.put(str, (Object) new JSONObject());
                        }
                    }
                    n();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final long c(long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64e979d6", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4)})).longValue();
        }
        long j5 = j2 - j3;
        if (j5 <= 0) {
            return -1L;
        }
        long j6 = j5 / 1000;
        if (j4 < 0) {
            j4 = 0;
        }
        if (j4 <= 0) {
            return j6 / j;
        }
        if (j6 < j4) {
            return 0L;
        }
        return ((j6 - j4) / j) + 1;
    }

    public abstract String d();

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this});
        }
        return this.b.d();
    }

    public FrequencyInfo f(String str, String str2) {
        FrequencyInfo frequencyInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrequencyInfo) ipChange.ipc$dispatch("ba5e8439", new Object[]{this, str, str2});
        }
        try {
            synchronized (this) {
                JSONObject jSONObject = this.f2520a;
                if (jSONObject == null) {
                    return null;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                if (jSONObject2 == null) {
                    return null;
                }
                if (jSONObject2.containsKey(str2)) {
                    frequencyInfo = (FrequencyInfo) jSONObject2.getObject(str2, FrequencyInfo.class);
                } else {
                    frequencyInfo = null;
                }
                return frequencyInfo;
            }
        } catch (Throwable th) {
            wdm.h("FrequencyManager.getFrequencyInfo.error.", th);
            return null;
        }
    }

    public abstract long g();

    public boolean i(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53e94270", new Object[]{this, new Long(j), new Long(j2)})).booleanValue();
        }
        if (j > 0 || j2 > 0) {
            return true;
        }
        return false;
    }

    public final boolean j(long j, long j2, long j3, long j4, long j5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a90a6ce", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5)})).booleanValue();
        }
        if (j5 <= 0 || j5 >= j) {
            return true;
        }
        long j6 = j2 - j3;
        if (j6 <= 0) {
            return false;
        }
        long j7 = j6 / 1000;
        if (j4 < 0) {
            j4 = 0;
        }
        if (j4 <= 0 || j7 >= j4) {
            if (j7 - ((((j7 - j4) / j) * j) + j4) < j5) {
                return true;
            }
            return false;
        } else if (j7 < j5) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean k(FrequencyInfo frequencyInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("218db5e1", new Object[]{this, frequencyInfo})).booleanValue();
        }
        if ((PopLayer.getReference().getCurrentTimeStamp(false) - frequencyInfo.lastIncreaseTime) / 1000 > g()) {
            return true;
        }
        return false;
    }

    public void l(String str, Set<String> set, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf16f8fe", new Object[]{this, str, set, new Boolean(z)});
        } else if (set != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        wdm.a("Please don't execute on UI Thread.");
                        return;
                    }
                    synchronized (this) {
                        JSONObject jSONObject = this.f2520a;
                        if (jSONObject != null && !TextUtils.isEmpty(str)) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                            JSONObject jSONObject3 = new JSONObject();
                            ArrayList arrayList = new ArrayList(set);
                            if (jSONObject2 != null) {
                                for (String str2 : jSONObject2.keySet()) {
                                    if (!TextUtils.isEmpty(str2)) {
                                        FrequencyInfo frequencyInfo = (FrequencyInfo) jSONObject2.getJSONObject(str2).toJavaObject(FrequencyInfo.class);
                                        if (!arrayList.contains(str2) && k(frequencyInfo)) {
                                        }
                                        FrequencyInfo frequencyInfo2 = new FrequencyInfo();
                                        frequencyInfo.reduceMapSize(100);
                                        frequencyInfo2.popInfoMap = frequencyInfo.popInfoMap;
                                        frequencyInfo2.curFIndex = frequencyInfo.curFIndex;
                                        frequencyInfo2.lastIncreaseTime = frequencyInfo.lastIncreaseTime;
                                        jSONObject3.put(str2, (Object) frequencyInfo2);
                                        arrayList.remove(str2);
                                    }
                                }
                            }
                            if (z) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    jSONObject3.put((String) it.next(), (Object) new FrequencyInfo());
                                }
                            }
                            jSONObject.put(str, (Object) jSONObject3);
                            n();
                        }
                    }
                }
            } catch (Throwable th) {
                wdm.h("FrequencyManager.putFrequencyInfos.error.", th);
            }
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d60dfd23", new Object[]{this});
        } else {
            this.f2520a = this.b.f();
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a19c8fb", new Object[]{this});
        } else {
            this.b.g(this.f2520a.toJSONString());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class FrequencyInfo implements Serializable, Parcelable {
        public static final Parcelable.Creator<FrequencyInfo> CREATOR = new a();
        public long curFIndex;
        public long lastIncreaseTime;
        public Map<Long, Integer> popInfoMap;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static class a implements Parcelable.Creator<FrequencyInfo> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a */
            public FrequencyInfo createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (FrequencyInfo) ipChange.ipc$dispatch("af3abd11", new Object[]{this, parcel});
                }
                return new FrequencyInfo(parcel);
            }

            /* renamed from: b */
            public FrequencyInfo[] newArray(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (FrequencyInfo[]) ipChange.ipc$dispatch("7997437a", new Object[]{this, new Integer(i)});
                }
                return new FrequencyInfo[i];
            }
        }

        static {
            t2o.a(625999920);
        }

        public FrequencyInfo() {
            this.curFIndex = 0L;
            this.popInfoMap = new HashMap();
            this.lastIncreaseTime = 0L;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void reduceMapSize(int i) {
            if (i > 0) {
                try {
                    int size = this.popInfoMap.size();
                    if (size > i) {
                        ArrayList arrayList = new ArrayList(this.popInfoMap.keySet());
                        Collections.sort(arrayList);
                        for (int i2 = 0; i2 < size - i; i2++) {
                            this.popInfoMap.remove(arrayList.get(i2));
                        }
                    }
                } catch (Throwable th) {
                    wdm.h("FrequencyManager.reduceMapSize.error.", th);
                }
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.curFIndex);
            parcel.writeLong(this.lastIncreaseTime);
            parcel.writeInt(this.popInfoMap.size());
            for (Map.Entry<Long, Integer> entry : this.popInfoMap.entrySet()) {
                parcel.writeLong(entry.getKey().longValue());
                parcel.writeInt(entry.getValue().intValue());
            }
        }

        public FrequencyInfo(Parcel parcel) {
            this.curFIndex = 0L;
            this.popInfoMap = new HashMap();
            this.lastIncreaseTime = 0L;
            this.curFIndex = parcel.readLong();
            this.lastIncreaseTime = parcel.readLong();
            int readInt = parcel.readInt();
            for (int i = 0; i < readInt; i++) {
                this.popInfoMap.put(Long.valueOf(parcel.readLong()), Integer.valueOf(parcel.readInt()));
            }
        }
    }

    public int o(String str, String str2, long j, long j2, long j3, int i, long j4) {
        FrequencyInfo frequencyInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b56bdc", new Object[]{this, str, str2, new Long(j), new Long(j2), new Long(j3), new Integer(i), new Long(j4)})).intValue();
        }
        try {
            if (i(j3, j4) && j2 > 0 && j > 0) {
                if (TextUtils.isEmpty(str)) {
                    wdm.f(wdm.CATEGORY_CONFIG_CHECK, str2, "updateFrequencyInfo.infoKey=null");
                    return 1;
                }
                synchronized (this) {
                    JSONObject jSONObject = this.f2520a;
                    if (jSONObject == null) {
                        wdm.f(wdm.CATEGORY_CONFIG_CHECK, str2, "updateFrequencyInfo.mFileJsonObject=null");
                        return 1;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                    if (jSONObject2 == null) {
                        wdm.f(wdm.CATEGORY_CONFIG_CHECK, str2, "updateFrequencyInfo.infoJsonConfigObject=null");
                        return 1;
                    }
                    if (jSONObject2.containsKey(str2)) {
                        frequencyInfo = (FrequencyInfo) jSONObject2.getJSONObject(str2).toJavaObject(FrequencyInfo.class);
                    } else {
                        frequencyInfo = new FrequencyInfo();
                    }
                    if (j2 - j <= 0) {
                        wdm.f(wdm.CATEGORY_CONFIG_CHECK, str2, "FrequencyManager.updateFrequencyInfo.not started.");
                        return 2;
                    }
                    long j5 = frequencyInfo.curFIndex;
                    if (frequencyInfo.popInfoMap.get(Long.valueOf(j5)) == null) {
                        frequencyInfo.popInfoMap.put(Long.valueOf(j5), 1);
                        frequencyInfo.lastIncreaseTime = j2;
                        wdm.f(wdm.CATEGORY_CONFIG_CHECK, str2, "FrequencyManager.updateFrequencyInfo.init update.curFPopTimes=1.");
                    } else if (i <= 0 || frequencyInfo.popInfoMap.get(Long.valueOf(j5)).intValue() < i) {
                        int intValue = frequencyInfo.popInfoMap.get(Long.valueOf(j5)).intValue() + 1;
                        frequencyInfo.popInfoMap.put(Long.valueOf(j5), Integer.valueOf(intValue));
                        frequencyInfo.lastIncreaseTime = j2;
                        wdm.f(wdm.CATEGORY_CONFIG_CHECK, str2, "FrequencyManager.updateFrequencyInfo.update.curFPopTimes=" + intValue);
                    } else {
                        wdm.f(wdm.CATEGORY_CONFIG_CHECK, str2, "FrequencyManager.checkFrequencyInfo.same index.curFPopTimes=" + frequencyInfo.popInfoMap.get(Long.valueOf(j5)) + " is max.Can't open.index=" + j5);
                        return 3;
                    }
                    jSONObject2.put(str2, (Object) frequencyInfo);
                    jSONObject.put(str, (Object) jSONObject2);
                    n();
                    return 0;
                }
            }
            return -1;
        } catch (Throwable th) {
            wdm.h("FrequencyManager.updateFrequencyInfo.error.", th);
            return 1;
        }
    }

    public int a(String str, String str2, long j, long j2, long j3, int i, long j4, long j5, long j6) {
        JSONObject jSONObject;
        String str3;
        FrequencyInfo frequencyInfo;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        int i2 = 4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("850519db", new Object[]{this, str, str2, new Long(j), new Long(j2), new Long(j3), new Integer(i), new Long(j4), new Long(j5), new Long(j6)})).intValue();
        }
        try {
            if (i(j3, j6) && j2 > 0 && j > 0) {
                synchronized (this) {
                    JSONObject jSONObject4 = this.f2520a;
                    if (jSONObject4 != null && !TextUtils.isEmpty(str)) {
                        JSONObject jSONObject5 = jSONObject4.getJSONObject(str);
                        if (jSONObject5 == null) {
                            wdm.f(wdm.CATEGORY_CONFIG_CHECK, str2, "checkFrequencyInfo.infoJsonConfigObject=null");
                            return 1;
                        }
                        if (jSONObject5.containsKey(str2)) {
                            str3 = "FrequencyManager.checkFrequencyInfo.index=";
                            jSONObject = jSONObject5;
                            frequencyInfo = (FrequencyInfo) jSONObject5.getJSONObject(str2).toJavaObject(FrequencyInfo.class);
                        } else {
                            jSONObject = jSONObject5;
                            str3 = "FrequencyManager.checkFrequencyInfo.index=";
                            frequencyInfo = new FrequencyInfo();
                        }
                        if (j6 > 0) {
                            jSONObject2 = jSONObject4;
                            long j7 = frequencyInfo.lastIncreaseTime;
                            if (j7 > 0 && (j2 - j7) / 1000 < j6) {
                                wdm.f(wdm.CATEGORY_CONFIG_CHECK, str2, "checkFrequencyInfo.interval.fail.");
                                return 5;
                            }
                        } else {
                            jSONObject2 = jSONObject4;
                        }
                        if (j3 <= 0) {
                            wdm.f(wdm.CATEGORY_CONFIG_CHECK, str2, "checkFrequencyInfo.frequencySecs<=0.");
                            return 0;
                        }
                        long c = c(j3, j2, j, j4);
                        if (c < 0) {
                            wdm.f(wdm.CATEGORY_CONFIG_CHECK, str2, "FrequencyManager.checkFrequencyInfo.not started.");
                            return 2;
                        }
                        frequencyInfo.curFIndex = c;
                        if (j(j3, j2, j, j4, j5)) {
                            if (frequencyInfo.popInfoMap.get(Long.valueOf(c)) == null) {
                                frequencyInfo.popInfoMap.put(Long.valueOf(c), 0);
                            } else if (i > 0 && frequencyInfo.popInfoMap.get(Long.valueOf(c)).intValue() >= i) {
                                wdm.f(wdm.CATEGORY_CONFIG_CHECK, str2, str3 + c + ".curFPopTimes" + frequencyInfo.popInfoMap.get(Long.valueOf(c)) + "is max.Can't open.");
                                return 3;
                            }
                            jSONObject3 = jSONObject;
                            i2 = 0;
                        } else {
                            wdm.f(wdm.CATEGORY_CONFIG_CHECK, str2, "FrequencyManager.checkFrequencyInfo.not inEnableSection.index=" + c);
                            jSONObject3 = jSONObject;
                        }
                        jSONObject3.put(str2, (Object) frequencyInfo);
                        jSONObject2.put(str, (Object) jSONObject3);
                        n();
                        return i2;
                    }
                    wdm.f(wdm.CATEGORY_CONFIG_CHECK, str2, "checkFrequencyInfo.mFileJsonObject=null");
                    return 1;
                }
            }
            return -1;
        } catch (Throwable th) {
            wdm.h("FrequencyManager.checkFrequencyInfo.error.", th);
            return 1;
        }
    }
}
