package com.meizu.cloud.pushsdk.handler.e.j;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.security.ccrc.service.build.Ba;
import com.meizu.cloud.pushinternal.DebugLogger;
import org.json.JSONException;
import org.json.JSONObject;
import tb.l2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private String f5899a;
    private String b;
    private boolean c;
    private String d;
    private String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Parcelable.Creator<f> {
        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        /* renamed from: a */
        public f[] newArray(int i) {
            return new f[i];
        }
    }

    public f() {
        this.c = false;
    }

    public static f a(JSONObject jSONObject) {
        String str;
        f fVar = new f();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull(l2o.COL_TASK)) {
                    fVar.c(jSONObject.getString(l2o.COL_TASK));
                }
                if (!jSONObject.isNull("time")) {
                    fVar.d(jSONObject.getString("time"));
                }
                if (!jSONObject.isNull("pushExtra")) {
                    fVar.a(jSONObject.getInt("pushExtra") == 0);
                }
            } catch (JSONException e) {
                str = " parse statics message error " + e.getMessage();
            }
            return fVar;
        }
        str = "no control statics can parse ";
        DebugLogger.e(Ba.c, str);
        return fVar;
    }

    public void b(String str) {
        this.e = str;
    }

    public String c() {
        return this.e;
    }

    public String d() {
        return this.f5899a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.b;
    }

    public String toString() {
        return "Statics{taskId='" + this.f5899a + "', time='" + this.b + "', pushExtra=" + this.c + ", deviceId='" + this.d + "', seqId='" + this.e + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5899a);
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }

    public f(Parcel parcel) {
        boolean z = false;
        this.c = false;
        this.f5899a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readByte() != 0 ? true : z;
        this.d = parcel.readString();
        this.e = parcel.readString();
    }

    public String a() {
        return this.d;
    }

    public boolean b() {
        return this.c;
    }

    public void c(String str) {
        this.f5899a = str;
    }

    public void d(String str) {
        this.b = str;
    }

    public void a(String str) {
        this.d = str;
    }

    public void a(boolean z) {
        this.c = z;
    }
}
