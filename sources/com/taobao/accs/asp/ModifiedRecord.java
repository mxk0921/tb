package com.taobao.accs.asp;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ModifiedRecord implements Parcelable {
    public static final Parcelable.Creator<ModifiedRecord> CREATOR = new a();
    boolean isClear;
    Bundle modified;
    String name;
    long timestampVersion;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Parcelable.Creator<ModifiedRecord> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public ModifiedRecord createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ModifiedRecord) ipChange.ipc$dispatch("f4011939", new Object[]{this, parcel});
            }
            return new ModifiedRecord(parcel, null);
        }

        /* renamed from: b */
        public ModifiedRecord[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ModifiedRecord[]) ipChange.ipc$dispatch("ed0983a2", new Object[]{this, new Integer(i)});
            }
            return new ModifiedRecord[i];
        }
    }

    static {
        t2o.a(343932981);
    }

    public /* synthetic */ ModifiedRecord(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeBundle(this.modified);
        parcel.writeInt(this.isClear ? 1 : 0);
        parcel.writeLong(this.timestampVersion);
    }

    private ModifiedRecord(Parcel parcel) {
        this.name = parcel.readString();
        this.modified = parcel.readBundle(getClass().getClassLoader());
        this.isClear = parcel.readInt() != 1 ? false : true;
        this.timestampVersion = parcel.readLong();
    }

    public ModifiedRecord(String str) {
        this.name = str;
    }
}
