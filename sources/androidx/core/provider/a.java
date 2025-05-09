package androidx.core.provider;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.core.provider.FontProvider;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final /* synthetic */ class a {
    public static FontProvider.ContentQueryWrapper a(Context context, Uri uri) {
        if (Build.VERSION.SDK_INT < 24) {
            return new FontProvider.ContentQueryWrapperApi16Impl(context, uri);
        }
        return new FontProvider.ContentQueryWrapperApi24Impl(context, uri);
    }
}
