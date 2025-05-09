package com.taobao.android.meta.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.LocalDataManager;
import tb.a07;
import tb.ckf;
import tb.t2o;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class DummyLocalManager implements LocalDataManager {
    public static final a CREATOR = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a implements Parcelable.Creator<DummyLocalManager> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(993001484);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        /* renamed from: a */
        public DummyLocalManager createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DummyLocalManager) ipChange.ipc$dispatch("ae921792", new Object[]{this, parcel});
            }
            ckf.g(parcel, "parcel");
            return new DummyLocalManager(parcel);
        }

        /* renamed from: b */
        public DummyLocalManager[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DummyLocalManager[]) ipChange.ipc$dispatch("70092c7b", new Object[]{this, new Integer(i)});
            }
            return new DummyLocalManager[i];
        }

        public a() {
        }
    }

    static {
        t2o.a(993001483);
        t2o.a(993001763);
    }

    public DummyLocalManager() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DummyLocalManager(Parcel parcel) {
        this();
        ckf.g(parcel, "parcel");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
