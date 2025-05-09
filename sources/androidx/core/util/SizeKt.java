package androidx.core.util;

import android.util.Size;
import android.util.SizeF;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\n\u001a\r\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0087\n\u001a\r\u0010\u0000\u001a\u00020\u0003*\u00020\u0005H\u0086\n\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0087\n\u001a\r\u0010\u0006\u001a\u00020\u0003*\u00020\u0004H\u0087\n\u001a\r\u0010\u0006\u001a\u00020\u0003*\u00020\u0005H\u0086\n¨\u0006\u0007"}, d2 = {"component1", "", "Landroid/util/Size;", "", "Landroid/util/SizeF;", "Landroidx/core/util/SizeFCompat;", "component2", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SizeKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final int component1(Size size) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2332650b", new Object[]{size})).intValue() : size.getWidth();
    }

    public static final int component2(Size size) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1f33f3ea", new Object[]{size})).intValue() : size.getHeight();
    }

    public static final float component1(SizeF sizeF) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("431f7c62", new Object[]{sizeF})).floatValue() : sizeF.getWidth();
    }

    public static final float component2(SizeF sizeF) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c74fc963", new Object[]{sizeF})).floatValue() : sizeF.getHeight();
    }

    public static final float component1(SizeFCompat sizeFCompat) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("847eb516", new Object[]{sizeFCompat})).floatValue() : sizeFCompat.getWidth();
    }

    public static final float component2(SizeFCompat sizeFCompat) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("98268897", new Object[]{sizeFCompat})).floatValue() : sizeFCompat.getHeight();
    }
}
