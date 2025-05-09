package androidx.activity.result;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ActivityResultRegistry$generateRandomNumber$1 extends Lambda implements d1a<Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ActivityResultRegistry$generateRandomNumber$1 INSTANCE = new ActivityResultRegistry$generateRandomNumber$1();

    public ActivityResultRegistry$generateRandomNumber$1() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(ActivityResultRegistry$generateRandomNumber$1 activityResultRegistry$generateRandomNumber$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/activity/result/ActivityResultRegistry$generateRandomNumber$1");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final Integer invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("14feca66", new Object[]{this}) : Integer.valueOf(Random.Default.nextInt(2147418112) + 65536);
    }
}
