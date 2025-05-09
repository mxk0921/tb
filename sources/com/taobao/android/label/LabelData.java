package com.taobao.android.label;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LabelData implements Parcelable, Serializable {
    public static final Parcelable.Creator<LabelData> CREATOR = new a();
    public static final int TYPE_ITEM = 1;
    public static final int TYPE_TEXT = 0;
    public static final int sDirectionLeft = 0;
    public static final int sDirectionNone = -1;
    public static final int sDirectionRight = 1;
    public String content;
    public int direction;
    public HashMap<String, Object> extra;
    public String iconUrl;
    public String id;
    public LabelStyle labelStyle;
    public int labelType;
    public String minText;
    public double posX;
    public double posY;
    public String tagId;
    public int x;
    public int y;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Parcelable.Creator<LabelData> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public LabelData createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LabelData) ipChange.ipc$dispatch("736a365e", new Object[]{this, parcel});
            }
            return new LabelData(parcel);
        }

        /* renamed from: b */
        public LabelData[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LabelData[]) ipChange.ipc$dispatch("6c72a0c7", new Object[]{this, new Integer(i)});
            }
            return new LabelData[i];
        }
    }

    static {
        t2o.a(926941199);
    }

    public LabelData() {
        this.direction = -1;
        this.labelType = 0;
        this.minText = "三个字";
        this.extra = new HashMap<>();
    }

    public static LabelData fromJsonObject(JSONObject jSONObject) {
        LabelData labelData = new LabelData();
        labelData.x = jSONObject.optInt("x");
        labelData.y = jSONObject.optInt("y");
        labelData.direction = jSONObject.optInt("direction");
        labelData.posX = jSONObject.optInt("posX");
        labelData.posY = jSONObject.optInt("posY");
        labelData.id = jSONObject.optString("id");
        labelData.tagId = jSONObject.optString("tagId");
        labelData.content = jSONObject.optString("content");
        labelData.iconUrl = jSONObject.optString("iconUrl");
        labelData.labelType = jSONObject.optInt("labelType");
        return labelData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public JSONObject toJsonData() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", this.x);
            jSONObject.put("y", this.y);
            jSONObject.put("direction", this.direction);
            jSONObject.put("posX", this.posX);
            jSONObject.put("posY", this.posY);
            jSONObject.put("id", this.id);
            jSONObject.put("tagId", this.tagId);
            jSONObject.put("content", this.content);
            jSONObject.put("iconUrl", this.iconUrl);
            jSONObject.put("labelType", this.labelType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "LabelData{x=" + this.x + ", y=" + this.y + ", direction=" + this.direction + ", posX=" + this.posX + ", posY=" + this.posY + ", id='" + this.id + "', tagId='" + this.tagId + "', content='" + this.content + "', iconUrl='" + this.iconUrl + "', labelType=" + this.labelType + ", minText='" + this.minText + "', labelStyle=" + this.labelStyle + ", extra=" + this.extra + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.direction);
        parcel.writeDouble(this.posX);
        parcel.writeDouble(this.posY);
        parcel.writeString(this.id);
        parcel.writeString(this.content);
        parcel.writeString(this.iconUrl);
        parcel.writeInt(this.labelType);
        parcel.writeString(this.tagId);
        parcel.writeParcelable(this.labelStyle, i);
        parcel.writeSerializable(this.extra);
        parcel.writeString(this.minText);
    }

    public LabelData(String str, String str2) {
        this.direction = -1;
        this.labelType = 0;
        this.minText = "三个字";
        this.extra = new HashMap<>();
        this.id = str;
        this.content = str2;
    }

    public LabelData(Parcel parcel) {
        this.direction = -1;
        this.labelType = 0;
        this.minText = "三个字";
        this.extra = new HashMap<>();
        this.x = parcel.readInt();
        this.y = parcel.readInt();
        this.direction = parcel.readInt();
        this.posX = parcel.readDouble();
        this.posY = parcel.readDouble();
        this.id = parcel.readString();
        this.content = parcel.readString();
        this.iconUrl = parcel.readString();
        this.labelType = parcel.readInt();
        this.tagId = parcel.readString();
        this.labelStyle = (LabelStyle) parcel.readParcelable(LabelStyle.class.getClassLoader());
        this.extra = (HashMap) parcel.readSerializable();
        this.minText = parcel.readString();
    }
}
