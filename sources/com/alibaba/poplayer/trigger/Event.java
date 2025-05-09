package com.alibaba.poplayer.trigger;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.config.model.predeal.PreDealCustomEventParams;
import com.android.alibaba.ip.runtime.IpChange;
import tb.abd;
import tb.f7l;
import tb.lyv;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Event implements Parcelable {
    public static final Parcelable.Creator<Event> CREATOR = new a();
    public final String attachKeyCode;
    private String augeCode;
    private long createSystemTime;
    private long createTimeStamp;
    public final String curPage;
    public final String curPageUrl;
    protected abd mProcessCallBack;
    public BaseConfigItem originConfigItem;
    public String originUri;
    public final String param;
    private PreDealCustomEventParams preDealCustomEventParams;
    public final int source;
    private String traceInfo;
    private JSONObject ucpBackFlowTrackInfo;
    public final String uri;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Parcelable.Creator<Event> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public Event createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Event) ipChange.ipc$dispatch("1995cf79", new Object[]{this, parcel});
            }
            return new Event(parcel);
        }

        /* renamed from: b */
        public Event[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Event[]) ipChange.ipc$dispatch("129e39e2", new Object[]{this, new Integer(i)});
            }
            return new Event[i];
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int BroadcastDirectly = 3;
        public static final int BroadcastPreDeal = 4;
        public static final int BroadcastSchema = 1;
        public static final int PageSwitch = 2;
        public static final int PopHub = 5;

        static {
            t2o.a(626000009);
        }

        public static boolean a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c00d6f09", new Object[]{new Integer(i)})).booleanValue();
            }
            if (i == 1 || i == 3 || i == 4 || i == 5) {
                return true;
            }
            return false;
        }

        public static String b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e5331230", new Object[]{new Integer(i)});
            }
            if (i == 1) {
                return "BroadcastSchema";
            }
            if (i == 2) {
                return "PageSwitch";
            }
            if (i == 3) {
                return "BroadcastDirectly";
            }
            if (i == 4) {
                return "BroadcastPreDeal";
            }
            if (i != 5) {
                return null;
            }
            return "PopHub";
        }
    }

    static {
        t2o.a(626000007);
    }

    public Event(String str, BaseConfigItem baseConfigItem, String str2, String str3, String str4, String str5, String str6, int i) {
        this.uri = str;
        this.originUri = str;
        this.traceInfo = str3;
        this.originConfigItem = baseConfigItem;
        this.param = str2;
        this.attachKeyCode = str4;
        this.curPage = str5;
        this.source = i;
        this.curPageUrl = str6;
        this.createTimeStamp = PopLayer.getReference().getCurrentTimeStamp(false);
        this.createSystemTime = SystemClock.elapsedRealtime();
    }

    public static boolean isDirectlyOpen(String str) {
        if (!str.startsWith("poplayer")) {
            return false;
        }
        return "directly".equals(Uri.parse(str).getQueryParameter("openType"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Event)) {
            return super.equals(obj);
        }
        Event event = (Event) obj;
        int i = event.source;
        int i2 = this.source;
        if (i != i2 || b.a(i2)) {
            return super.equals(obj);
        }
        if (!lyv.b(this.uri, event.uri) || !lyv.b(this.attachKeyCode, event.attachKeyCode) || !lyv.b(this.curPage, event.curPage) || !lyv.b(this.curPageUrl, event.curPageUrl)) {
            return false;
        }
        return true;
    }

    public String getAugeCode() {
        return this.augeCode;
    }

    public long getCreateSystemTime() {
        return this.createSystemTime;
    }

    public long getCreateTimeStamp() {
        return this.createTimeStamp;
    }

    public PreDealCustomEventParams getPreDealCustomEventParams() {
        return this.preDealCustomEventParams;
    }

    public abd getProcessCallBack() {
        return this.mProcessCallBack;
    }

    public String getTraceInfo() {
        return this.traceInfo;
    }

    public JSONObject getUcpBackFlowTrackInfo() {
        return this.ucpBackFlowTrackInfo;
    }

    public void setAugeCode(String str) {
        this.augeCode = str;
    }

    public void setProcessCallBack(abd abdVar) {
        this.mProcessCallBack = abdVar;
    }

    public void setUcpBackFlowTrackInfo(JSONObject jSONObject) {
        this.ucpBackFlowTrackInfo = jSONObject;
    }

    public String toString() {
        try {
            return "{uri:+ " + this.uri + ",param:" + this.param + ",keyCode:" + this.attachKeyCode + ",curPage:" + this.curPage + ",source:" + this.source + f7l.BRACKET_END_STR;
        } catch (Throwable th) {
            wdm.h("Event.toString.error", th);
            return "_event:" + this.uri;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeString(this.param);
        parcel.writeString(this.traceInfo);
        parcel.writeInt(this.source);
        parcel.writeString(this.attachKeyCode);
        parcel.writeString(this.curPage);
        parcel.writeString(this.curPageUrl);
        parcel.writeString(this.originUri);
        parcel.writeLong(this.createTimeStamp);
        parcel.writeSerializable(this.preDealCustomEventParams);
    }

    public Event(String str, String str2, String str3, String str4, PreDealCustomEventParams preDealCustomEventParams) {
        this(str, null, "", "", str2, str3, str4, 4);
        this.preDealCustomEventParams = preDealCustomEventParams;
    }

    public Event(Parcel parcel) {
        this.uri = parcel.readString();
        this.param = parcel.readString();
        this.traceInfo = parcel.readString();
        this.source = parcel.readInt();
        this.attachKeyCode = parcel.readString();
        this.curPage = parcel.readString();
        this.curPageUrl = parcel.readString();
        this.originUri = parcel.readString();
        this.createTimeStamp = parcel.readLong();
        this.preDealCustomEventParams = (PreDealCustomEventParams) parcel.readSerializable();
    }
}
