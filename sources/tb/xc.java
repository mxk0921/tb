package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.bui;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xc {
    public static final bui APNG = new bui("PNG", "apng", true, new String[]{"png"}, (bui.a) new a());

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
            if (bArr == null || bArr.length < 41 || !cui.n(bArr, 0, cui.PNG_HEADER) || !cui.b(bArr)) {
                return false;
            }
            return true;
        }
    }
}
