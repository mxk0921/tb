package com.alibaba.mtl.appmonitor;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.alibaba.analytics.AnalyticsMgr;
import com.alibaba.analytics.IAnalytics;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;
import tb.nhh;
import tb.t2o;
import tb.to1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Transaction implements Parcelable {
    public static Parcelable.Creator<Transaction> CREATOR = new Parcelable.Creator<Transaction>() { // from class: com.alibaba.mtl.appmonitor.Transaction.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Transaction createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Transaction) ipChange.ipc$dispatch("26b8e3fb", new Object[]{this, parcel}) : Transaction.readFromParcel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Transaction[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Transaction[]) ipChange.ipc$dispatch("3743f1e4", new Object[]{this, new Integer(i)}) : new Transaction[i];
        }
    };
    public DimensionValueSet dimensionValues;
    public Integer eventId;
    private Object lock;
    public String module;
    public String monitorPoint;
    public String transactionId;

    static {
        t2o.a(962593099);
    }

    public Transaction(Integer num, String str, String str2, DimensionValueSet dimensionValueSet) {
        this.eventId = num;
        this.module = str;
        this.monitorPoint = str2;
        this.transactionId = UUID.randomUUID().toString();
        this.dimensionValues = dimensionValueSet;
        this.lock = new Object();
    }

    public static Transaction readFromParcel(Parcel parcel) {
        Transaction transaction = new Transaction();
        try {
            transaction.dimensionValues = (DimensionValueSet) parcel.readParcelable(Transaction.class.getClassLoader());
            transaction.eventId = Integer.valueOf(parcel.readInt());
            transaction.module = parcel.readString();
            transaction.monitorPoint = parcel.readString();
            transaction.transactionId = parcel.readString();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return transaction;
    }

    public void addDimensionValues(DimensionValueSet dimensionValueSet) {
        synchronized (this.lock) {
            try {
                DimensionValueSet dimensionValueSet2 = this.dimensionValues;
                if (dimensionValueSet2 == null) {
                    this.dimensionValues = dimensionValueSet;
                } else {
                    dimensionValueSet2.addValues(dimensionValueSet);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void begin(String str) {
        nhh.d();
        IAnalytics iAnalytics = AnalyticsMgr.b;
        if (iAnalytics != null) {
            try {
                iAnalytics.transaction_begin(this, str);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void end(String str) {
        nhh.d();
        IAnalytics iAnalytics = AnalyticsMgr.b;
        if (iAnalytics != null) {
            try {
                iAnalytics.transaction_end(this, str);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.dimensionValues, i);
        parcel.writeInt(this.eventId.intValue());
        parcel.writeString(this.module);
        parcel.writeString(this.monitorPoint);
        parcel.writeString(this.transactionId);
    }

    public void addDimensionValues(String str, String str2) {
        synchronized (this.lock) {
            try {
                if (this.dimensionValues == null) {
                    this.dimensionValues = (DimensionValueSet) to1.a().d(DimensionValueSet.class, new Object[0]);
                }
                this.dimensionValues.setValue(str, str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Transaction() {
    }
}
