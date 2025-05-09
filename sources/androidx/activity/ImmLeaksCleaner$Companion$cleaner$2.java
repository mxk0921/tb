package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.activity.ImmLeaksCleaner;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/activity/ImmLeaksCleaner$Cleaner;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ImmLeaksCleaner$Companion$cleaner$2 extends Lambda implements d1a<ImmLeaksCleaner.Cleaner> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ImmLeaksCleaner$Companion$cleaner$2 INSTANCE = new ImmLeaksCleaner$Companion$cleaner$2();

    public ImmLeaksCleaner$Companion$cleaner$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(ImmLeaksCleaner$Companion$cleaner$2 immLeaksCleaner$Companion$cleaner$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/activity/ImmLeaksCleaner$Companion$cleaner$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final ImmLeaksCleaner.Cleaner invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImmLeaksCleaner.Cleaner) ipChange.ipc$dispatch("ac3fe909", new Object[]{this});
        }
        try {
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            declaredField3.setAccessible(true);
            return new ImmLeaksCleaner.ValidCleaner(declaredField3, declaredField, declaredField2);
        } catch (NoSuchFieldException unused) {
            return ImmLeaksCleaner.FailedInitialization.INSTANCE;
        }
    }
}
