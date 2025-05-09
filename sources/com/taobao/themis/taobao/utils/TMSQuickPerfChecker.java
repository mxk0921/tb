package com.taobao.themis.taobao.utils;

import android.content.Context;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;
import tb.z80;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/taobao/utils/TMSQuickPerfChecker;", "Ltb/z80;", "Ljava/io/Serializable;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/net/Uri;", NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, "", "process", "(Landroid/content/Context;Landroid/net/Uri;)Z", "", "getName", "()Ljava/lang/String;", "themis_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSQuickPerfChecker implements z80, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(847249548);
    }

    @Override // tb.z80
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "TMS";
    }

    @Override // tb.z80
    public boolean process(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9683279", new Object[]{this, context, uri})).booleanValue();
        }
        ckf.g(context, "context");
        ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return TMSUrlChecker.isTMSUrl(context, uri);
    }
}
