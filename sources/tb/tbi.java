package tb;

import android.text.SpannableString;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tbi implements Comparable<tbi> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f28615a;
    public SpannableString b;

    static {
        t2o.a(295698687);
    }

    /* renamed from: a */
    public int compareTo(tbi tbiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d12325ab", new Object[]{this, tbiVar})).intValue();
        }
        return this.f28615a - tbiVar.f28615a;
    }
}
