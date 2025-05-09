package com.taobao.search.common.jsbridge;

import android.app.Activity;
import android.graphics.Bitmap;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileOutputStream;
import tb.gl4;
import tb.kpw;
import tb.nsw;
import tb.opw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchScreenShotBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_NAME = "screenShot";
    public static final String API_NAME = "SearchScreenShot";
    private static final String FILE_NAME = "SearchScreenShot.png";

    static {
        t2o.a(815792181);
    }

    public static /* synthetic */ Object ipc$super(SearchScreenShotBridge searchScreenShotBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/common/jsbridge/SearchScreenShotBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!TextUtils.equals(ACTION_NAME, str)) {
            return false;
        }
        View decorView = ((Activity) getContext()).getWindow().getDecorView();
        decorView.setDrawingCacheEnabled(true);
        decorView.buildDrawingCache();
        Bitmap createBitmap = Bitmap.createBitmap(decorView.getDrawingCache());
        try {
            String b = opw.e().b(true);
            FileOutputStream fileOutputStream = new FileOutputStream(b + "/SearchScreenShot.png");
            createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            String absolutePath = new File(b, FILE_NAME).getAbsolutePath();
            nsw nswVar = new nsw();
            nswVar.b(gl4.CONFIG_LOCAL_PATH, absolutePath);
            wVCallBackContext.success(nswVar);
        } catch (Throwable unused) {
            wVCallBackContext.error();
        }
        return true;
    }
}
