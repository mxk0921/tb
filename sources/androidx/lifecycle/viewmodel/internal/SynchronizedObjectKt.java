package androidx.lifecycle.viewmodel.internal;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import kotlin.Metadata;
import tb.ckf;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"T", "Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;", OConstant.DIMEN_FILE_LOCK, "Lkotlin/Function0;", "action", "synchronized", "(Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;Ltb/d1a;)Ljava/lang/Object;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class SynchronizedObjectKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: synchronized  reason: not valid java name */
    public static final <T> T m30synchronized(SynchronizedObject synchronizedObject, d1a<? extends T> d1aVar) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("8380e5d0", new Object[]{synchronizedObject, d1aVar});
        }
        ckf.g(synchronizedObject, OConstant.DIMEN_FILE_LOCK);
        ckf.g(d1aVar, "action");
        synchronized (synchronizedObject) {
            t = (T) d1aVar.invoke();
        }
        return t;
    }
}
