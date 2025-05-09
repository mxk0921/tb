package androidx.activity;

import android.content.res.Resources;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/res/Resources;", "invoke", "(Landroid/content/res/Resources;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SystemBarStyle$Companion$dark$1 extends Lambda implements g1a<Resources, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final SystemBarStyle$Companion$dark$1 INSTANCE = new SystemBarStyle$Companion$dark$1();

    public SystemBarStyle$Companion$dark$1() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(SystemBarStyle$Companion$dark$1 systemBarStyle$Companion$dark$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/activity/SystemBarStyle$Companion$dark$1");
    }

    public final Boolean invoke(Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("cdc6f57f", new Object[]{this, resources});
        }
        ckf.g(resources, "<anonymous parameter 0>");
        return Boolean.TRUE;
    }
}
