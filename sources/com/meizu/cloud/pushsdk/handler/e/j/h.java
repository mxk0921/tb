package com.meizu.cloud.pushsdk.handler.e.j;

import android.os.Parcel;
import android.os.Parcelable;
import com.meizu.cloud.pushinternal.DebugLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private b f5901a;
    private String b;
    private int c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Parcelable.Creator<h> {
        /* renamed from: a */
        public h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        /* renamed from: a */
        public h[] newArray(int i) {
            return new h[i];
        }
    }

    public h(Parcel parcel) {
        this.f5901a = (b) parcel.readParcelable(b.class.getClassLoader());
        this.b = parcel.readString();
        this.c = parcel.readInt();
    }

    public b a() {
        return this.f5901a;
    }

    public int b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "WithDrawMessage{controlMessage=" + this.f5901a + ", revokePackageName='" + this.b + "', notifyId=" + this.c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f5901a, i);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
    }

    public h(String str, String str2, String str3, String str4, String str5) {
        this.b = str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull("notifyId")) {
                this.c = jSONObject.getInt("notifyId");
            }
        } catch (JSONException e) {
            DebugLogger.e("WithDrawMessage", "parse WithDrawMessage error " + e.getMessage());
        }
        this.f5901a = new b(str3, str4, str5);
    }
}
