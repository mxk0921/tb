package com.ut.share.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.fwr;
import tb.t2o;
import tb.vbm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ImgShareHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean disableSuccessToast = false;
    public static boolean saveImageToClipboard = false;

    static {
        t2o.a(662700079);
    }

    public static void considerSaveImg2Clipboard(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0be8ad7", new Object[]{context, uri});
            return;
        }
        try {
            if (saveImageToClipboard) {
                saveImageToClipboard = false;
                if (Build.VERSION.SDK_INT >= 31) {
                    ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newUri(context.getContentResolver(), vbm.TYPE_IMAGE, uri));
                    Log.e("TBShare_SHARE", "保存图片至剪切板成功,uri=" + uri.toString());
                    TLog.loge(fwr.SHARE_TAG, fwr.SHARE, "保存图片至剪切板成功,uri=" + uri.toString());
                }
            }
        } catch (Throwable th) {
            TLog.loge(fwr.SHARE_TAG, fwr.SHARE, "保存图片至剪切板失败,error=" + th.toString());
        }
    }
}
