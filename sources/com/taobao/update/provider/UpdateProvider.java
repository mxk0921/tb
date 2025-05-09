package com.taobao.update.provider;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UpdateProvider extends FileProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(947912762);
    }

    public static Uri getUriForFile(Context context, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("34061e0", new Object[]{context, file});
        }
        return FileProvider.getUriForFile(context, context.getPackageName() + ".update.provider", file);
    }

    public static /* synthetic */ Object ipc$super(UpdateProvider updateProvider, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/provider/UpdateProvider");
    }
}
