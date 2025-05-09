package com.taobao.themis.taobao.utils;

import android.content.Context;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.container.utils.TMSSwitchUtils;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.ckf;
import tb.ges;
import tb.hds;
import tb.mpj;
import tb.t2o;
import tb.tsq;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\t"}, d2 = {"Lcom/taobao/themis/taobao/utils/TMSUrlChecker;", "Ljava/io/Serializable;", "()V", "isTMSUrl", "", "context", "Landroid/content/Context;", NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, "Landroid/net/Uri;", "themis_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSUrlChecker implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TMSUrlChecker INSTANCE = new TMSUrlChecker();

    static {
        t2o.a(847249549);
    }

    private TMSUrlChecker() {
    }

    @JvmStatic
    public static final boolean isTMSUrl(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b2d7bc9", new Object[]{context, uri})).booleanValue();
        }
        ckf.g(context, "context");
        if (uri != null) {
            String uri2 = uri.toString();
            ckf.f(uri2, "uri.toString()");
            if (!tsq.I(uri2, "tbopen://", false, 2, null)) {
                String uri3 = uri.toString();
                ckf.f(uri3, "uri.toString()");
                return TMSSwitchUtils.isEnterTMS(context, uri) || ges.m(uri) || hds.INSTANCE.b(new mpj(uri3, uri, context));
            }
        }
        return false;
    }
}
