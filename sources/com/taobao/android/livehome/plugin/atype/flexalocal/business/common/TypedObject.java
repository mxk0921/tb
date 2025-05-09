package com.taobao.android.livehome.plugin.atype.flexalocal.business.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TypedObject implements IMTOPDataObject, Parcelable {
    public static final Parcelable.Creator<TypedObject> CREATOR = new a();
    public int dataType;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Parcelable.Creator<TypedObject> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public TypedObject createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TypedObject) ipChange.ipc$dispatch("c33e6361", new Object[]{this, parcel});
            }
            return new TypedObject(parcel);
        }

        /* renamed from: b */
        public TypedObject[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TypedObject[]) ipChange.ipc$dispatch("69e34f98", new Object[]{this, new Integer(i)});
            }
            return new TypedObject[i];
        }
    }

    static {
        t2o.a(310378517);
        t2o.a(589299906);
    }

    public TypedObject() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.dataType);
    }

    public TypedObject(Parcel parcel) {
        this();
        this.dataType = parcel.readInt();
    }
}
