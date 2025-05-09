package com.taobao.mediatrace;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.e5s;
import tb.f5s;
import tb.i6s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TLogMediaTraceUploader implements e5s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZ_CODE = "taobao_video_zip_21646297";

    static {
        t2o.a(944766978);
        t2o.a(767557728);
    }

    @Override // tb.e5s
    public void executeUploadTask(Context context, i6s i6sVar, f5s f5sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5595bbb", new Object[]{this, context, i6sVar, f5sVar});
        }
    }

    @Override // tb.e5s
    public String getBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
        }
        return BIZ_CODE;
    }

    @Override // tb.e5s
    public void onUploadDone(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca026d15", new Object[]{this, new Boolean(z), str});
        }
    }
}
