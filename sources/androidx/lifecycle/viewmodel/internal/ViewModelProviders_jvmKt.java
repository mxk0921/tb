package androidx.lifecycle.viewmodel.internal;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.wyf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"*\u0010\u0006\u001a\u0004\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"", "T", "Ltb/wyf;", "", "getCanonicalName", "(Ltb/wyf;)Ljava/lang/String;", "canonicalName", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ViewModelProviders_jvmKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final <T> String getCanonicalName(wyf<T> wyfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1425d37c", new Object[]{wyfVar});
        }
        ckf.g(wyfVar, "<this>");
        return wyfVar.c();
    }
}
