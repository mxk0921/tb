package com.taobao.weex.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.core.content.res.ResourcesCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.t2o;
import tb.zk4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ImgURIUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(985661807);
    }

    public static Drawable getDrawableFromLoaclSrc(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("e4261cd9", new Object[]{context, uri});
        }
        Resources resources = context.getResources();
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() != 1) {
            WXLogUtils.e("Local src format is invalid.");
            return null;
        }
        int identifier = resources.getIdentifier(pathSegments.get(0), zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, context.getPackageName());
        if (identifier == 0) {
            return null;
        }
        return ResourcesCompat.getDrawable(resources, identifier, null);
    }
}
