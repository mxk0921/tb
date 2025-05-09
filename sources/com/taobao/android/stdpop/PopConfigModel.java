package com.taobao.android.stdpop;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class PopConfigModel implements Parcelable {
    public static final Parcelable.Creator<PopConfigModel> CREATOR = new a();
    public boolean animateBackground;
    public String animation;
    public boolean droidFullScreen;
    public boolean droidPanEnable;
    public boolean droidShouldHandleBack;
    public boolean enableBindingX;
    public boolean enableSendEventToFromPage;
    public boolean enableWindowChangeNotify;
    public boolean recoverWindow;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Parcelable.Creator<PopConfigModel> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public PopConfigModel createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PopConfigModel) ipChange.ipc$dispatch("ea6e26aa", new Object[]{this, parcel});
            }
            return new PopConfigModel(parcel);
        }

        /* renamed from: b */
        public PopConfigModel[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PopConfigModel[]) ipChange.ipc$dispatch("46d5e53", new Object[]{this, new Integer(i)});
            }
            return new PopConfigModel[i];
        }
    }

    static {
        t2o.a(786432008);
    }

    public PopConfigModel() {
        this.enableWindowChangeNotify = true;
        this.enableSendEventToFromPage = false;
        this.animation = null;
        this.animateBackground = false;
        this.droidFullScreen = true;
        this.droidShouldHandleBack = true;
        this.droidPanEnable = false;
        this.enableBindingX = false;
        this.recoverWindow = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PopConfigModel{enableWindowChangeNotify=" + this.enableWindowChangeNotify + ", enableSendEventToFromPage=" + this.enableSendEventToFromPage + ", animation='" + this.animation + "', animateBackground=" + this.animateBackground + "', droidFullScreen='" + this.droidFullScreen + "', droidShouldHandleBack='" + this.droidShouldHandleBack + "', droidPanEnable='" + this.droidPanEnable + "', enableBindingX='" + this.enableBindingX + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.enableWindowChangeNotify ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableSendEventToFromPage ? (byte) 1 : (byte) 0);
        parcel.writeString(this.animation);
        parcel.writeByte(this.animateBackground ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.droidFullScreen ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.droidShouldHandleBack ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.droidPanEnable ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableBindingX ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.recoverWindow ? (byte) 1 : (byte) 0);
    }

    public PopConfigModel(Parcel parcel) {
        boolean z = true;
        this.enableWindowChangeNotify = true;
        this.enableSendEventToFromPage = false;
        this.animation = null;
        this.animateBackground = false;
        this.droidFullScreen = true;
        this.droidShouldHandleBack = true;
        this.droidPanEnable = false;
        this.enableBindingX = false;
        this.recoverWindow = false;
        this.enableWindowChangeNotify = parcel.readByte() != 0;
        this.enableSendEventToFromPage = parcel.readByte() != 0;
        this.animation = parcel.readString();
        this.animateBackground = parcel.readByte() != 0;
        this.droidFullScreen = parcel.readByte() != 0;
        this.droidShouldHandleBack = parcel.readByte() != 0;
        this.droidPanEnable = parcel.readByte() != 0;
        this.enableBindingX = parcel.readByte() != 0;
        this.recoverWindow = parcel.readByte() == 0 ? false : z;
    }
}
