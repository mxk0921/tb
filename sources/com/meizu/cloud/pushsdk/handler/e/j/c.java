package com.meizu.cloud.pushsdk.handler.e.j;

import android.os.Parcel;
import android.os.Parcelable;
import com.meizu.cloud.pushsdk.handler.MessageV3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private MessageV3 f5894a;
    private String b;
    private int c;
    private int d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Parcelable.Creator<c> {
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        /* renamed from: a */
        public c[] newArray(int i) {
            return new c[i];
        }
    }

    public c(Parcel parcel) {
        this.f5894a = (MessageV3) parcel.readParcelable(MessageV3.class.getClassLoader());
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }

    public MessageV3 a() {
        return this.f5894a;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "NotificationState{messageV3=" + this.f5894a + ", notificationPkg='" + this.b + "', notificationId='" + this.c + "', state='" + this.d + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f5894a, i);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public c(MessageV3 messageV3) {
        this.f5894a = messageV3;
    }

    public void a(int i) {
        this.c = i;
    }

    public void b(int i) {
        this.d = i;
    }

    public void a(String str) {
        this.b = str;
    }
}
