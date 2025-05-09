package com.alibaba.ut.abtest.internal.debug;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ku0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Debug implements Parcelable {
    public static final Parcelable.Creator<Debug> CREATOR = new a();
    private static final String TAG = "Debug";
    @JSONField(name = "debug_key")
    public String debugKey;
    @JSONField(name = "debug_sampling_option")
    public String debugSamplingOption;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a implements Parcelable.Creator<Debug> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public Debug createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Debug) ipChange.ipc$dispatch("1eefc23c", new Object[]{this, parcel});
            }
            Debug debug = new Debug();
            debug.debugKey = parcel.readString();
            debug.debugSamplingOption = parcel.readString();
            return debug;
        }

        /* renamed from: b */
        public Debug[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Debug[]) ipChange.ipc$dispatch("b5ffb3a5", new Object[]{this, new Integer(i)});
            }
            return new Debug[i];
        }
    }

    static {
        t2o.a(961544356);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeString(this.debugKey);
            parcel.writeString(this.debugSamplingOption);
        } catch (Throwable th) {
            ku0.j("Debug.writeToParcel", th);
        }
    }
}
