package mtopsdk.network.impl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.request.BodyEntry;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.OutputStream;
import mtopsdk.network.domain.ParcelableRequestBodyImpl;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ParcelableRequestBodyEntry implements BodyEntry {
    public static final Parcelable.Creator<ParcelableRequestBodyEntry> CREATOR = new a();
    ParcelableRequestBodyImpl requestBody;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a implements Parcelable.Creator<ParcelableRequestBodyEntry> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public ParcelableRequestBodyEntry createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ParcelableRequestBodyEntry) ipChange.ipc$dispatch("71e0e73", new Object[]{this, parcel});
            }
            return new ParcelableRequestBodyEntry(parcel);
        }

        /* renamed from: b */
        public ParcelableRequestBodyEntry[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ParcelableRequestBodyEntry[]) ipChange.ipc$dispatch("748996aa", new Object[]{this, new Integer(i)});
            }
            return new ParcelableRequestBodyEntry[i];
        }
    }

    static {
        t2o.a(589300046);
        t2o.a(607125692);
    }

    public ParcelableRequestBodyEntry(ParcelableRequestBodyImpl parcelableRequestBodyImpl) {
        this.requestBody = parcelableRequestBodyImpl;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // anet.channel.request.BodyEntry
    public String getContentType() {
        return this.requestBody.contentType();
    }

    @Override // anet.channel.request.BodyEntry
    public int writeTo(OutputStream outputStream) throws IOException {
        this.requestBody.writeTo(outputStream);
        return (int) this.requestBody.contentLength();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.requestBody, i);
    }

    public ParcelableRequestBodyEntry(Parcel parcel) {
        this.requestBody = (ParcelableRequestBodyImpl) parcel.readParcelable(ParcelableRequestBodyImpl.class.getClassLoader());
    }
}
