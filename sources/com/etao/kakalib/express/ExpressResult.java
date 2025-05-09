package com.etao.kakalib.express;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import tb.p1g;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ExpressResult implements Parcelable {
    public static final Parcelable.Creator<ExpressResult> CREATOR = new Parcelable.Creator<ExpressResult>() { // from class: com.etao.kakalib.express.ExpressResult.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ExpressResult createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ExpressResult) ipChange.ipc$dispatch("dd0fdc1a", new Object[]{this, parcel}) : new ExpressResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ExpressResult[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ExpressResult[]) ipChange.ipc$dispatch("ed9aea03", new Object[]{this, new Integer(i)}) : new ExpressResult[i];
        }
    };
    public String companyName;
    public String mExpressCode;
    public List<String> order;
    public ExpressSection[] stepInfo;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class ExpressSection implements Parcelable {
        public static final Parcelable.Creator<ExpressSection> CREATOR = new Parcelable.Creator<ExpressSection>() { // from class: com.etao.kakalib.express.ExpressResult.ExpressSection.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ExpressSection createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ExpressSection) ipChange.ipc$dispatch("b34bd703", new Object[]{this, parcel}) : new ExpressSection(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ExpressSection[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ExpressSection[]) ipChange.ipc$dispatch("d16819fa", new Object[]{this, new Integer(i)}) : new ExpressSection[i];
            }
        };
        private SimpleDateFormat mDataFormat;
        private SimpleDateFormat mShowDataFormat;
        public String sinceNow;
        public String statusDesc;
        public String statusTime;

        static {
            t2o.a(760217603);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getSinceNow() {
            return this.sinceNow;
        }

        public String getStatusDesc() {
            return this.statusDesc;
        }

        public String getStatusTime() {
            return this.statusTime;
        }

        public void setSinceNow(String str) {
            this.sinceNow = str;
        }

        public void setStatusDesc(String str) {
            this.statusDesc = str;
        }

        public void setStatusTime(String str) {
            long j;
            try {
                j = this.mDataFormat.parse(str).getTime();
            } catch (ParseException e) {
                e.printStackTrace();
                j = 0;
            }
            this.statusTime = this.mShowDataFormat.format(new Date(j));
            this.sinceNow = p1g.e(j);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.statusDesc);
            parcel.writeString(this.statusTime);
            parcel.writeString(this.sinceNow);
        }

        private ExpressSection(Parcel parcel) {
            this.statusDesc = parcel.readString();
            this.statusTime = parcel.readString();
            this.sinceNow = parcel.readString();
        }

        public ExpressSection() {
            this.mDataFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            this.mShowDataFormat = new SimpleDateFormat("MM-dd HH:mm");
        }
    }

    static {
        t2o.a(760217601);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getOrderId() {
        String str;
        List<String> list = this.order;
        if (list != null) {
            str = list.get(0);
        } else {
            str = "0";
        }
        return Long.parseLong(str);
    }

    public List<String> getOrderList() {
        return this.order;
    }

    public boolean isTaobaoExpress() {
        List<String> list = this.order;
        if (list == null || list.size() <= 0) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeArray(this.stepInfo);
    }

    private ExpressResult(Parcel parcel) {
        this.stepInfo = (ExpressSection[]) parcel.readArray(ExpressResult.class.getClassLoader());
    }

    private ExpressResult() {
    }
}
