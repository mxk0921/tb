package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¨\u0006\u0005"}, d2 = {"toDrawable", "Landroid/graphics/drawable/BitmapDrawable;", "Landroid/graphics/Bitmap;", VideoControllerManager.ARRAY_KEY_RESOURCES, "Landroid/content/res/Resources;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class BitmapDrawableKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final BitmapDrawable toDrawable(Bitmap bitmap, Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("dac2b338", new Object[]{bitmap, resources});
        }
        return new BitmapDrawable(resources, bitmap);
    }
}
