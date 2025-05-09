package com.taobao.android.litecreator.base.data;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.Serializable;
import tb.b5s;
import tb.cg9;
import tb.eag;
import tb.fno;
import tb.odg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FileBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FileBean";
    public static final int TYPE_MEDIA_STORE = 1;
    public static final int TYPE_MEDIA_STORE_CAN_READ = 2;
    public static final int TYPE_SANDBOX = 0;
    public int id;
    public String mimeType;
    public String path;
    public int type = 0;
    public String uri;

    static {
        t2o.a(511705111);
    }

    public String getFileSuffix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("183306f6", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mimeType)) {
            return b5s.LOG_SUFFIX_DATA;
        }
        try {
            return "." + this.mimeType.split("/")[1];
        } catch (Throwable unused) {
            return b5s.LOG_SUFFIX_DATA;
        }
    }

    public boolean isSandBoxFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45e3e144", new Object[]{this})).booleanValue();
        }
        if (this.type == 0) {
            return true;
        }
        return false;
    }

    public Uri uri() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("758372a", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.uri)) {
            return null;
        }
        return Uri.parse(this.uri);
    }

    public boolean copyToSandBox(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b449418", new Object[]{this, context, str})).booleanValue();
        }
        if (this.type == 0) {
            return true;
        }
        String j = fno.j(String.valueOf(this.id), "");
        if (cg9.l(j)) {
            odg.d(TAG, "copyToSandBox. cache exist! skip copy! file : " + j);
            this.path = j;
            this.type = 0;
            return true;
        } else if (!eag.H() || !cg9.l(this.path) || !new File(this.path).canRead()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (cg9.g(context, uri(), str) || cg9.c(context, uri(), str)) {
                odg.c(TAG, "copyToSandBox. copy file success! cost=" + (System.currentTimeMillis() - currentTimeMillis) + "ms, file : " + str);
                this.path = str;
                this.type = 0;
                fno.p(String.valueOf(this.id), this.path);
                return true;
            }
            odg.c(TAG, "copyToSandBox. copy file failed!");
            return false;
        } else {
            this.type = 2;
            odg.c(TAG, "copyToSandBox.file can read, no need copy again!");
            return true;
        }
    }
}
