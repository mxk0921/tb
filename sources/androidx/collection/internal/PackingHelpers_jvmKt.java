package androidx.collection.internal;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0081\b¨\u0006\u0004"}, d2 = {"floatFromBits", "", "bits", "", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class PackingHelpers_jvmKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final float floatFromBits(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58355880", new Object[]{new Integer(i)})).floatValue();
        }
        return Float.intBitsToFloat(i);
    }
}
