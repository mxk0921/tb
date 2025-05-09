package com.taobao.calendar.bridge.model;

import android.os.Parcel;
import android.os.Parcelable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ScheduleDTOModule implements Parcelable {
    public static final Parcelable.Creator<ScheduleDTOModule> CREATOR = new a();
    private long alartTime;
    private String bizId;
    private String endTime;
    private String link;
    private String outId;
    private int remind;
    private int repeatDays;
    private String startTime;
    private String subTitle;
    private String title;
    private int update;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Parcelable.Creator<ScheduleDTOModule> {
        /* renamed from: a */
        public ScheduleDTOModule createFromParcel(Parcel parcel) {
            return new ScheduleDTOModule(parcel);
        }

        /* renamed from: b */
        public ScheduleDTOModule[] newArray(int i) {
            return new ScheduleDTOModule[i];
        }
    }

    static {
        t2o.a(693108757);
    }

    public ScheduleDTOModule() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getAlartTime() {
        return this.alartTime;
    }

    public String getBizId() {
        return this.bizId;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getLink() {
        return this.link;
    }

    public String getOutId() {
        return this.outId;
    }

    public int getRemind() {
        return this.remind;
    }

    public int getRepeatDays() {
        return this.repeatDays;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public int getUpdate() {
        return this.update;
    }

    public void setAlartTime(long j) {
        this.alartTime = j;
    }

    public void setBizId(String str) {
        this.bizId = str;
    }

    public void setEndTime(String str) {
        this.endTime = str;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setOutId(String str) {
        this.outId = str;
    }

    public void setRemind(int i) {
        this.remind = i;
    }

    public void setRepeatDays(int i) {
        this.repeatDays = i;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public void setSubTitle(String str) {
        this.subTitle = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUpdate(int i) {
        this.update = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.bizId);
        parcel.writeString(this.outId);
        parcel.writeString(this.startTime);
        parcel.writeString(this.endTime);
        parcel.writeInt(this.remind);
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        parcel.writeString(this.link);
        parcel.writeLong(this.alartTime);
        parcel.writeInt(this.update);
        parcel.writeInt(this.repeatDays);
    }

    public ScheduleDTOModule(Parcel parcel) {
        this.bizId = parcel.readString();
        this.outId = parcel.readString();
        this.startTime = parcel.readString();
        this.endTime = parcel.readString();
        this.remind = parcel.readInt();
        this.title = parcel.readString();
        this.subTitle = parcel.readString();
        this.link = parcel.readString();
        this.alartTime = parcel.readLong();
        this.update = parcel.readInt();
        this.repeatDays = parcel.readInt();
    }
}
