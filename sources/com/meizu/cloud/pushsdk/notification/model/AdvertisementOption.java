package com.meizu.cloud.pushsdk.notification.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AdvertisementOption implements Parcelable {
    public static final String ADVERTISEMENT_OPTION = "ado";
    public static final String AD_INSTALL_PACKAGE = "aip";
    public static final String AD_PACKAGE = "ap";
    public static final Parcelable.Creator<AdvertisementOption> CREATOR = new a();
    public static final String PRIORITY_VALID_TIME = "pt";
    public static final String TAG = "AdvertisementOption";
    private String mAdInstallPackage;
    private String mAdPackage;
    private int mPriorityValidTime;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Parcelable.Creator<AdvertisementOption> {
        /* renamed from: a */
        public AdvertisementOption createFromParcel(Parcel parcel) {
            return new AdvertisementOption(parcel);
        }

        /* renamed from: a */
        public AdvertisementOption[] newArray(int i) {
            return new AdvertisementOption[i];
        }
    }

    public AdvertisementOption() {
    }

    public static AdvertisementOption parse(String str) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e) {
                DebugLogger.e(TAG, "parse json string error " + e.getMessage());
            }
            return parse(jSONObject);
        }
        jSONObject = null;
        return parse(jSONObject);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdInstallPackage() {
        return this.mAdInstallPackage;
    }

    public String getAdPackage() {
        return this.mAdPackage;
    }

    public int getPriorityValidTime() {
        return this.mPriorityValidTime;
    }

    public void setAdInstallPackage(String str) {
        this.mAdInstallPackage = str;
    }

    public void setAdPackage(String str) {
        this.mAdPackage = str;
    }

    public void setPriorityValidTime(int i) {
        this.mPriorityValidTime = i;
    }

    public String toString() {
        return "AdvertisementOption{mAdPackage=" + this.mAdPackage + "mPriorityValidTime=" + this.mPriorityValidTime + "mAdInstallPackage=" + this.mAdInstallPackage + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mAdPackage);
        parcel.writeInt(this.mPriorityValidTime);
        parcel.writeString(this.mAdInstallPackage);
    }

    public AdvertisementOption(Parcel parcel) {
        this.mAdPackage = parcel.readString();
        this.mPriorityValidTime = parcel.readInt();
        this.mAdInstallPackage = parcel.readString();
    }

    public static AdvertisementOption parse(JSONObject jSONObject) {
        String str;
        AdvertisementOption advertisementOption = new AdvertisementOption();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull("ap")) {
                    advertisementOption.setAdPackage(jSONObject.getString("ap"));
                }
                if (!jSONObject.isNull(PRIORITY_VALID_TIME)) {
                    advertisementOption.setPriorityValidTime(jSONObject.getInt(PRIORITY_VALID_TIME));
                }
                if (!jSONObject.isNull(AD_INSTALL_PACKAGE)) {
                    advertisementOption.setAdInstallPackage(jSONObject.getString(AD_INSTALL_PACKAGE));
                }
            } catch (JSONException e) {
                str = "parse json obj error " + e.getMessage();
            }
            return advertisementOption;
        }
        str = "no such tag AdvertisementOption";
        DebugLogger.e(TAG, str);
        return advertisementOption;
    }
}
