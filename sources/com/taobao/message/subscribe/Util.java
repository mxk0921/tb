package com.taobao.message.subscribe;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.taobao.R;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.bud;
import tb.ckf;
import tb.t2o;
import tb.tsq;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0006"}, d2 = {"Lcom/taobao/message/subscribe/Util;", "", "()V", "processUIText", "", "text", "message_base_tb_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class Util {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Util INSTANCE = new Util();

    static {
        t2o.a(530579496);
    }

    private Util() {
    }

    @JvmStatic
    public static final String processUIText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e73531f", new Object[]{str});
        }
        ckf.h(str, "text");
        try {
            if (!TBRevisionSwitchManager.c().d(bud.KEY_NEW_CONTENT_ENABLE)) {
                return str;
            }
            String localizedString = DisplayUtil.localizedString(R.string.mp_follow);
            ckf.c(localizedString, "DisplayUtil.localizedString(R.string.mp_follow)");
            String localizedString2 = DisplayUtil.localizedString(R.string.mp_subscribe);
            ckf.c(localizedString2, "DisplayUtil.localizedString(R.string.mp_subscribe)");
            return tsq.E(str, localizedString, localizedString2, false, 4, null);
        } catch (Throwable unused) {
            return str;
        }
    }
}
