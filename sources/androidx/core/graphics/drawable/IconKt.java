package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.z8k;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0005H\u0087\b¨\u0006\u0006"}, d2 = {"toAdaptiveIcon", "Landroid/graphics/drawable/Icon;", "Landroid/graphics/Bitmap;", "toIcon", "Landroid/net/Uri;", "", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class IconKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final Icon toAdaptiveIcon(Bitmap bitmap) {
        Icon createWithAdaptiveBitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return z8k.a(ipChange.ipc$dispatch("47d13682", new Object[]{bitmap}));
        }
        createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
        return createWithAdaptiveBitmap;
    }

    public static final Icon toIcon(Bitmap bitmap) {
        Icon createWithBitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return z8k.a(ipChange.ipc$dispatch("3ca356ec", new Object[]{bitmap}));
        }
        createWithBitmap = Icon.createWithBitmap(bitmap);
        return createWithBitmap;
    }

    public static final Icon toIcon(Uri uri) {
        Icon createWithContentUri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return z8k.a(ipChange.ipc$dispatch("8e103b3", new Object[]{uri}));
        }
        createWithContentUri = Icon.createWithContentUri(uri);
        return createWithContentUri;
    }

    public static final Icon toIcon(byte[] bArr) {
        Icon createWithData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return z8k.a(ipChange.ipc$dispatch("87a7dd5d", new Object[]{bArr}));
        }
        createWithData = Icon.createWithData(bArr, 0, bArr.length);
        return createWithData;
    }
}
