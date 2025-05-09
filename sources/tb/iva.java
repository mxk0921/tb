package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.bui;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class iva {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f21599a = cui.a("heic");
    public static final bui HEIF = new bui("HEIF", "HEIF", new String[]{"heic"}, new a());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements bui.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.bui.a
        public boolean a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cc02bff5", new Object[]{this, bArr})).booleanValue();
            }
            if (bArr == null || bArr.length < 4 || !cui.n(bArr, 20, iva.a())) {
                return false;
            }
            return true;
        }
    }

    public static /* synthetic */ byte[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ddeae846", new Object[0]);
        }
        return f21599a;
    }
}
