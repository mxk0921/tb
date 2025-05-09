package com.taobao.android.label;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LabelStyle implements ILabelStyle {
    public static final Parcelable.Creator<LabelStyle> CREATOR = new a();
    public int dotSrc;
    public int dotWidth;
    public int height;
    public int iconSrc;
    public String iconUrl;
    public int labelBgLeft;
    public int labelBgRight;
    public int lineColor;
    public int lineWidth;
    public int textColor;
    public int textSize;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Parcelable.Creator<LabelStyle> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public LabelStyle createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LabelStyle) ipChange.ipc$dispatch("148379bd", new Object[]{this, parcel});
            }
            return new LabelStyle(parcel);
        }

        /* renamed from: b */
        public LabelStyle[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LabelStyle[]) ipChange.ipc$dispatch("3c885c74", new Object[]{this, new Integer(i)});
            }
            return new LabelStyle[i];
        }
    }

    static {
        t2o.a(926941203);
        t2o.a(926941189);
    }

    public LabelStyle() {
        this.height = 20;
        this.textSize = 11;
        this.textColor = -1;
        this.dotSrc = 0;
        this.dotWidth = 16;
        this.iconSrc = 0;
        this.iconUrl = "";
        this.lineColor = -1;
        this.lineWidth = 14;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean showDot() {
        if (this.dotSrc != 0) {
            return true;
        }
        return false;
    }

    public boolean showIcon() {
        if (this.iconSrc != 0 || !TextUtils.isEmpty(this.iconUrl)) {
            return true;
        }
        return false;
    }

    public boolean showLine() {
        if (this.lineColor != 0) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.textSize);
        parcel.writeInt(this.textColor);
        parcel.writeInt(this.dotSrc);
        parcel.writeInt(this.iconSrc);
        parcel.writeString(this.iconUrl);
        parcel.writeInt(this.labelBgLeft);
        parcel.writeInt(this.labelBgRight);
        parcel.writeInt(this.lineColor);
        parcel.writeInt(this.height);
    }

    public LabelStyle(Parcel parcel) {
        this.height = 20;
        this.textSize = 11;
        this.textColor = -1;
        this.dotSrc = 0;
        this.dotWidth = 16;
        this.iconSrc = 0;
        this.iconUrl = "";
        this.lineColor = -1;
        this.lineWidth = 14;
        this.textSize = parcel.readInt();
        this.textColor = parcel.readInt();
        this.dotSrc = parcel.readInt();
        this.iconSrc = parcel.readInt();
        this.iconUrl = parcel.readString();
        this.labelBgLeft = parcel.readInt();
        this.labelBgRight = parcel.readInt();
        this.lineColor = parcel.readInt();
        this.height = parcel.readInt();
    }
}
