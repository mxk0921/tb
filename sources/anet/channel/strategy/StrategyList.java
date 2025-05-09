package anet.channel.strategy;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StrategyList implements Serializable, Parcelable {
    public static final Parcelable.Creator<StrategyList> CREATOR = new Parcelable.Creator<StrategyList>() { // from class: anet.channel.strategy.StrategyList.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StrategyList createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (StrategyList) ipChange.ipc$dispatch("a13eab80", new Object[]{this, parcel}) : new StrategyList(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StrategyList[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (StrategyList[]) ipChange.ipc$dispatch("9a4715e9", new Object[]{this, new Integer(i)}) : new StrategyList[i];
        }
    };
    private static final String TAG = "awcn.StrategyList";
    private static final long serialVersionUID = -258058881561327174L;
    private boolean containsStaticIp;
    private Map<Integer, ConnHistoryItem> historyItemMap;
    private List<IPConnStrategy> ipStrategyList;
    protected transient boolean isChanged;

    static {
        t2o.a(607125871);
    }

    public StrategyList() {
        this.ipStrategyList = new ArrayList();
        this.historyItemMap = new SerialLruCache(40);
        this.containsStaticIp = false;
        this.isChanged = false;
    }

    public synchronized void clearIpStrategyList(IPConnStrategy iPConnStrategy) {
        ALog.e(TAG, "[channel process] clearIpStrategyList", null, new Object[0]);
        if (iPConnStrategy != null) {
            if (this.historyItemMap.get(Integer.valueOf(iPConnStrategy.getUniqueId())) != null) {
                this.historyItemMap.remove(Integer.valueOf(iPConnStrategy.getUniqueId()));
                this.ipStrategyList.remove(iPConnStrategy);
                ALog.e(TAG, "[channel process] clearIpStrategyList，remove ipStrategy=" + iPConnStrategy.toString(), null, new Object[0]);
            }
        }
    }

    public synchronized boolean clearStrategy() {
        ALog.e(TAG, "[channel process] clearStrategy", null, new Object[0]);
        this.isChanged = false;
        synchronized (this.ipStrategyList) {
            Iterator<IPConnStrategy> it = this.ipStrategyList.iterator();
            int i = 0;
            while (it.hasNext()) {
                IPConnStrategy next = it.next();
                ConnHistoryItem connHistoryItem = this.historyItemMap.get(Integer.valueOf(next.getUniqueId()));
                if (connHistoryItem != null) {
                    if (connHistoryItem.isUsed() && (!connHistoryItem.isUsed() || connHistoryItem.isExpireStrategy())) {
                        this.historyItemMap.remove(Integer.valueOf(next.getUniqueId()));
                        it.remove();
                        this.isChanged = true;
                        ALog.e(TAG, "[channel process] clearIpStrategyList 2，remove ipStrategy=" + next.toString(), null, new Object[0]);
                    }
                    i++;
                    if (i > 2) {
                        this.historyItemMap.remove(Integer.valueOf(next.getUniqueId()));
                        it.remove();
                        this.isChanged = true;
                        ALog.e(TAG, "[channel process] clearIpStrategyList 1，remove ipStrategy=" + next.toString(), null, new Object[0]);
                    }
                }
            }
        }
        return this.isChanged;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<Integer, ConnHistoryItem> getHistoryItemMap(String str) {
        return this.historyItemMap;
    }

    public List<IPConnStrategy> getIpStrategyList(String str) {
        return this.ipStrategyList;
    }

    public boolean isContainsStaticIp() {
        return this.containsStaticIp;
    }

    public String toString() {
        return new ArrayList(this.ipStrategyList).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
        parcel.writeList(this.ipStrategyList);
        parcel.writeMap(this.historyItemMap);
        parcel.writeInt(this.containsStaticIp ? 1 : 0);
    }

    public StrategyList(List<IPConnStrategy> list) {
        this.ipStrategyList = new ArrayList();
        this.historyItemMap = new SerialLruCache(40);
        this.containsStaticIp = false;
        this.isChanged = false;
        this.ipStrategyList = list;
    }

    public StrategyList(List<IPConnStrategy> list, Map<Integer, ConnHistoryItem> map, boolean z) {
        this.ipStrategyList = new ArrayList();
        new SerialLruCache(40);
        this.isChanged = false;
        this.ipStrategyList = list;
        this.historyItemMap = map;
        this.containsStaticIp = z;
    }

    public StrategyList(Parcel parcel) {
        this.ipStrategyList = new ArrayList();
        this.historyItemMap = new SerialLruCache(40);
        boolean z = false;
        this.containsStaticIp = false;
        this.isChanged = false;
        int readInt = parcel.readInt();
        if (readInt == 1) {
            this.ipStrategyList = parcel.createTypedArrayList(IPConnStrategy.CREATOR);
            parcel.readMap(this.historyItemMap, ConnHistoryItem.class.getClassLoader());
            this.containsStaticIp = parcel.readInt() == 1 ? true : z;
            return;
        }
        throw new IllegalArgumentException("StrategyList Unsupported Parcelable version: " + readInt);
    }
}
