package com.meizu.cloud.pushsdk.handler.e.j;

import android.os.Parcel;
import android.os.Parcelable;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private int f5900a;
    private boolean b;
    private List<String> c;
    private b d;
    private String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Parcelable.Creator<g> {
        /* renamed from: a */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        /* renamed from: a */
        public g[] newArray(int i) {
            return new g[i];
        }
    }

    public g(Parcel parcel) {
        this.f5900a = parcel.readInt();
        this.b = parcel.readByte() != 0;
        this.c = parcel.createStringArrayList();
        this.d = (b) parcel.readParcelable(b.class.getClassLoader());
        this.e = parcel.readString();
    }

    public b a() {
        return this.d;
    }

    public List<String> b() {
        return this.c;
    }

    public int c() {
        return this.f5900a;
    }

    public boolean d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "UploadLogMessage{maxSize=" + this.f5900a + ", wifiUpload=" + this.b + ", fileList=" + this.c + ", controlMessage=" + this.d + ", uploadMessage='" + this.e + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5900a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
    }

    public g(String str, String str2, String str3, String str4) {
        this.e = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull("max_size")) {
                this.f5900a = jSONObject.getInt("max_size");
            }
            if (!jSONObject.isNull("wifi_upload")) {
                this.b = jSONObject.getBoolean("wifi_upload");
            }
            if (!jSONObject.isNull("upload_files")) {
                JSONArray jSONArray = jSONObject.getJSONArray("upload_files");
                this.c = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.c.add(jSONArray.getString(i));
                }
            }
        } catch (JSONException e) {
            DebugLogger.e("UploadLogMessage", "parse upload message error " + e.getMessage());
        }
        this.d = new b(str2, str3, str4);
    }
}
