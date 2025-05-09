package android.taobao.windvane.jsbridge;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MegaBridgeJS$LAZY_BRIDGE_JS$2 extends Lambda implements d1a<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MegaBridgeJS$LAZY_BRIDGE_JS$2 INSTANCE = new MegaBridgeJS$LAZY_BRIDGE_JS$2();

    public MegaBridgeJS$LAZY_BRIDGE_JS$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(MegaBridgeJS$LAZY_BRIDGE_JS$2 megaBridgeJS$LAZY_BRIDGE_JS$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/MegaBridgeJS$LAZY_BRIDGE_JS$2");
    }

    @Override // tb.d1a
    public final String invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this}) : MegaBridgeJS.a(MegaBridgeJS.INSTANCE);
    }
}
