package tb;

import anetwork.channel.aidl.ParcelableInputStream;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yaf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ParcelableInputStream f31936a;
    public final BufferedInputStream b;

    static {
        t2o.a(774897895);
    }

    public yaf() {
    }

    public void a() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        ParcelableInputStream parcelableInputStream = this.f31936a;
        if (parcelableInputStream != null) {
            e2n.c(parcelableInputStream);
        }
        BufferedInputStream bufferedInputStream = this.b;
        if (bufferedInputStream != null) {
            e2n.d(bufferedInputStream);
        }
    }

    public int b(byte[] bArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ed24497", new Object[]{this, bArr})).intValue();
        }
        ParcelableInputStream parcelableInputStream = this.f31936a;
        if (parcelableInputStream != null) {
            return parcelableInputStream.read(bArr);
        }
        BufferedInputStream bufferedInputStream = this.b;
        if (bufferedInputStream != null) {
            return bufferedInputStream.read(bArr);
        }
        return -1;
    }

    public yaf(ParcelableInputStream parcelableInputStream) {
        this.f31936a = parcelableInputStream;
    }

    public yaf(InputStream inputStream) {
        this.b = new BufferedInputStream(inputStream, 8192);
    }
}
