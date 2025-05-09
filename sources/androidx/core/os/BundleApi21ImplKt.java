package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/core/os/BundleApi21ImplKt;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "", "key", "Landroid/util/Size;", "value", "Ltb/xhv;", "putSize", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/Size;)V", "Landroid/util/SizeF;", "putSizeF", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/SizeF;)V", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class BundleApi21ImplKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final BundleApi21ImplKt INSTANCE = new BundleApi21ImplKt();

    private BundleApi21ImplKt() {
    }

    @JvmStatic
    public static final void putSize(Bundle bundle, String str, Size size) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8961ff2c", new Object[]{bundle, str, size});
        } else {
            bundle.putSize(str, size);
        }
    }

    @JvmStatic
    public static final void putSizeF(Bundle bundle, String str, SizeF sizeF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6607b8", new Object[]{bundle, str, sizeF});
        } else {
            bundle.putSizeF(str, sizeF);
        }
    }
}
