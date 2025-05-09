package com.meizu.cloud.pushsdk.notification.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0294a();

    /* renamed from: a  reason: collision with root package name */
    private int f5912a;
    private String b;

    /* compiled from: Taobao */
    /* renamed from: com.meizu.cloud.pushsdk.notification.model.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class C0294a implements Parcelable.Creator<a> {
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
        this.f5912a = 0;
    }

    public static a b(MessageV3 messageV3) {
        a aVar;
        try {
            aVar = !TextUtils.isEmpty(messageV3.getNotificationMessage()) ? a(new JSONObject(messageV3.getNotificationMessage()).getJSONObject("data").getJSONObject("extra").getJSONObject("no")) : null;
        } catch (Exception e) {
            DebugLogger.e("NotifyOption", "parse flyme NotifyOption setting error " + e.getMessage() + " so get from notificationMessage");
            aVar = a(messageV3.getNotificationMessage());
        }
        DebugLogger.i("NotifyOption", "current notify option is " + aVar);
        return aVar;
    }

    public int a() {
        return this.f5912a;
    }

    public void c(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "NotifyOption{notifyId=" + this.f5912a + ", notifyKey='" + this.b + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5912a);
        parcel.writeString(this.b);
    }

    public a(Parcel parcel) {
        this.f5912a = 0;
        this.f5912a = parcel.readInt();
        this.b = parcel.readString();
    }

    public static int a(MessageV3 messageV3) {
        a b = b(messageV3);
        if (b != null) {
            return b.a();
        }
        return 0;
    }

    public static a b(String str) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e) {
                DebugLogger.e("NotifyOption", "parse json string error " + e.getMessage());
            }
            return a(jSONObject);
        }
        jSONObject = null;
        return a(jSONObject);
    }

    private static a a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return b(new JSONObject(str).getString("no"));
            }
        } catch (JSONException e) {
            DebugLogger.e("NotifyOption", "parse notificationMessage error " + e.getMessage());
        }
        return null;
    }

    public String b() {
        return this.b;
    }

    public static a a(JSONObject jSONObject) {
        String str;
        a aVar = new a();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull("ni")) {
                    aVar.a(jSONObject.getInt("ni"));
                }
                if (!jSONObject.isNull("nk")) {
                    aVar.c(jSONObject.getString("nk"));
                }
            } catch (JSONException e) {
                str = "parse json obj error " + e.getMessage();
            }
            return aVar;
        }
        str = "no such tag NotifyOption";
        DebugLogger.e("NotifyOption", str);
        return aVar;
    }

    public void a(int i) {
        this.f5912a = i;
    }
}
