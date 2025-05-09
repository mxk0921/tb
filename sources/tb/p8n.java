package tb;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.mini.result.QueryVendorPayStatusResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class p8n implements Parcelable.Creator {
    /* renamed from: a */
    public final QueryVendorPayStatusResult createFromParcel(Parcel parcel) {
        return new QueryVendorPayStatusResult(parcel);
    }

    /* renamed from: b */
    public final QueryVendorPayStatusResult[] newArray(int i) {
        return new QueryVendorPayStatusResult[i];
    }
}
