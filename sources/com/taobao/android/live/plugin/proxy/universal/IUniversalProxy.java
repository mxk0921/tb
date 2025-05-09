package com.taobao.android.live.plugin.proxy.universal;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import com.taobao.android.live.plugin.proxy.IBTypeProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.nzc;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IUniversalProxy extends IBTypeProxy {
    public static final String KEY = "IUniversalProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void a(String str, String str2, String str3);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void a(long j, long j2);

        void b(long j, long j2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        void a(String str);

        void destroy();

        void init(Context context);
    }

    nzc createNegativeFeedbackHandler(Context context, TBLiveDataModel tBLiveDataModel, ux9 ux9Var);

    DialogFragment createStreamSwitchDialog(String str, String str2);

    DialogFragment createTaoliveQualityDialog(ux9 ux9Var, String str, boolean z);

    a getLiveBizRequestManager();

    b getLiveEventReportInstance();

    c getVolumeChangeUploadManager();
}
