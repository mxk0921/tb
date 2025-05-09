package mtopsdk.network.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.OutputStream;
import tb.l3o;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ParcelableRequestBodyImpl extends l3o implements Parcelable {
    public static final Parcelable.Creator<ParcelableRequestBodyImpl> CREATOR = new a();
    private byte[] content;
    private String contentType;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a implements Parcelable.Creator<ParcelableRequestBodyImpl> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public ParcelableRequestBodyImpl createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ParcelableRequestBodyImpl) ipChange.ipc$dispatch("beacf20d", new Object[]{this, parcel});
            }
            return new ParcelableRequestBodyImpl(parcel);
        }

        /* renamed from: b */
        public ParcelableRequestBodyImpl[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ParcelableRequestBodyImpl[]) ipChange.ipc$dispatch("feb270b6", new Object[]{this, new Integer(i)});
            }
            return new ParcelableRequestBodyImpl[i];
        }
    }

    static {
        t2o.a(589300024);
    }

    public ParcelableRequestBodyImpl(String str, byte[] bArr) {
        this.content = bArr;
        this.contentType = str;
    }

    @Override // tb.l3o
    public long contentLength() {
        byte[] bArr = this.content;
        if (bArr != null) {
            return bArr.length;
        }
        return super.contentLength();
    }

    @Override // tb.l3o
    public String contentType() {
        return this.contentType;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // tb.l3o
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.content);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.contentType);
        parcel.writeByteArray(this.content);
    }

    public ParcelableRequestBodyImpl(Parcel parcel) {
        this.contentType = parcel.readString();
        this.content = parcel.createByteArray();
    }
}
