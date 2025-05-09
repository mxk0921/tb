package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rnh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAC_ADDRESS_LENGTH = 6;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f27483a;

    static {
        t2o.a(789577864);
    }

    public rnh(byte[] bArr) {
        this.f27483a = new byte[6];
        this.f27483a = Arrays.copyOf(bArr, 6);
    }

    public static rnh b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rnh) ipChange.ipc$dispatch("2bf7c7b6", new Object[]{str, str2});
        }
        try {
            String[] split = str.split(str2);
            if (!(split == null || split.length == 0)) {
                if (split.length != 6) {
                    return b("00:00:00:00:00:00", ":");
                }
                byte[] bArr = new byte[6];
                for (int i = 0; i < 6; i++) {
                    bArr[i] = (byte) Integer.parseInt(split[i], 16);
                }
                return new rnh(bArr);
            }
            return b("00:00:00:00:00:00", ":");
        } catch (Exception unused) {
            return b("00:00:00:00:00:00", ":");
        }
    }

    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83167492", new Object[]{this})).longValue();
        }
        long j = 0;
        for (int i = 0; i < 6; i++) {
            j |= (this.f27483a[i] & 255) << ((5 - i) * 8);
        }
        return j;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rnh)) {
            return false;
        }
        return Arrays.equals(this.f27483a, ((rnh) obj).f27483a);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return Arrays.hashCode(this.f27483a);
    }

    public String toString() {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : this.f27483a) {
            if (sb.length() > 0) {
                sb.append(":");
            }
            sb.append(String.format("%02X", Integer.valueOf(b & 255)));
        }
        return sb.toString();
    }
}
