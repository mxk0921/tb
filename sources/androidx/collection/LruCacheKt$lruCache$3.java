package androidx.collection;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.xhv;
import tb.y1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0001H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "K", "V", "", "<anonymous parameter 0>", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "Ltb/xhv;", "invoke", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class LruCacheKt$lruCache$3 extends Lambda implements y1a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final LruCacheKt$lruCache$3 INSTANCE = new LruCacheKt$lruCache$3();

    public LruCacheKt$lruCache$3() {
        super(4);
    }

    public static /* synthetic */ Object ipc$super(LruCacheKt$lruCache$3 lruCacheKt$lruCache$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/LruCacheKt$lruCache$3");
    }

    public final void invoke(boolean z, Object obj, Object obj2, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ccc5e89", new Object[]{this, new Boolean(z), obj, obj2, obj3});
            return;
        }
        ckf.g(obj, "<anonymous parameter 1>");
        ckf.g(obj2, "<anonymous parameter 2>");
    }

    @Override // tb.y1a
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke(((Boolean) obj).booleanValue(), obj2, obj3, obj4);
        return xhv.INSTANCE;
    }
}
