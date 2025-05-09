package tb;

import android.os.Parcel;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class n32 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mName;

    static {
        t2o.a(393216067);
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.mName;
    }

    public void readFromParcel(Parcel parcel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa5835d", new Object[]{this, parcel});
        } else {
            this.mName = parcel.readString();
        }
    }

    public void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.mName = str;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f87e20", new Object[]{this, parcel, new Integer(i)});
        } else {
            parcel.writeString(this.mName);
        }
    }
}
