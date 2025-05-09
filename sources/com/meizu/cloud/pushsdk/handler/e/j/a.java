package com.meizu.cloud.pushsdk.handler.e.j;

import android.os.Parcel;
import android.os.Parcelable;
import com.meizu.cloud.pushinternal.DebugLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0291a();

    /* renamed from: a  reason: collision with root package name */
    private int f5892a;
    private int b;
    private int c;

    /* compiled from: Taobao */
    /* renamed from: com.meizu.cloud.pushsdk.handler.e.j.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class C0291a implements Parcelable.Creator<a> {
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: a */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    public a() {
    }

    public int a() {
        return this.f5892a;
    }

    public void b(int i) {
        this.b = i;
    }

    public void c(int i) {
        this.f5892a = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Control{pushType=" + this.f5892a + ", cached=" + this.b + ", cacheNum=" + this.c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5892a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public a(Parcel parcel) {
        this.f5892a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }

    public static a a(JSONObject jSONObject) {
        String str;
        a aVar = new a();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull("pushType")) {
                    aVar.c(jSONObject.getInt("pushType"));
                }
                if (!jSONObject.isNull("cached")) {
                    aVar.b(jSONObject.getInt("cached"));
                }
                if (!jSONObject.isNull("cacheNum")) {
                    aVar.a(jSONObject.getInt("cacheNum"));
                }
            } catch (JSONException e) {
                str = " parse control message error " + e.getMessage();
            }
            return aVar;
        }
        str = "no control message can parse ";
        DebugLogger.e("ctl", str);
        return aVar;
    }

    public void a(int i) {
        this.c = i;
    }
}
