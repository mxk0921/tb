package tb;

import anetwork.channel.aidl.ParcelableInputStream;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tb implements o55 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ParcelableInputStream f28606a;

    public tb(ParcelableInputStream parcelableInputStream) {
        this.f28606a = parcelableInputStream;
    }

    @Override // tb.o55
    public void close() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.f28606a.close();
        }
    }

    @Override // tb.o55
    public int read(byte[] bArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ed24497", new Object[]{this, bArr})).intValue();
        }
        return this.f28606a.read(bArr);
    }
}
