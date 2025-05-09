package com.ali.user.mobile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SNSSignInAccount implements Parcelable {
    public static final Parcelable.Creator<SNSSignInAccount> CREATOR = new Parcelable.Creator<SNSSignInAccount>() { // from class: com.ali.user.mobile.model.SNSSignInAccount.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SNSSignInAccount createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SNSSignInAccount) ipChange.ipc$dispatch("243dbead", new Object[]{this, parcel}) : new SNSSignInAccount(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SNSSignInAccount[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SNSSignInAccount[]) ipChange.ipc$dispatch("bb4db016", new Object[]{this, new Integer(i)}) : new SNSSignInAccount[i];
        }
    };
    public boolean alipayInstalled;
    public String app_id;
    public String bindProtocolUrl;
    public String changeBindToken;
    public String email;
    public String firstName;
    public String lastName;
    public boolean regXianyu;
    public String snsType;
    public boolean supportOverseaMobile = true;
    public String token;
    public String userId;
    public String utPageName;

    static {
        t2o.a(68157548);
    }

    public SNSSignInAccount() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SNSSignInAccount{snsType='" + this.snsType + "', userId='" + this.userId + "', token='" + this.token + "', email='" + this.email + "', firstName='" + this.firstName + "', lastName='" + this.lastName + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.snsType);
        parcel.writeString(this.userId);
        parcel.writeString(this.token);
        parcel.writeString(this.email);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
    }

    public SNSSignInAccount(Parcel parcel) {
        this.snsType = parcel.readString();
        this.userId = parcel.readString();
        this.token = parcel.readString();
        this.email = parcel.readString();
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
    }
}
