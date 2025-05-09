package com.taobao.message.util;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.message.activity.LoadingChatActivity;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.nav.InterceptChatProcessor;
import com.taobao.message.sp.chat.widget.SimpleChatActivity;
import com.taobao.tao.log.TLog;
import com.taobao.wangxin.utils.WXConstantsOut;
import java.util.Set;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001e\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¨\u0006\n"}, d2 = {"Lcom/taobao/message/util/SimpleChatInterceptProcessor;", "Lcom/taobao/message/nav/InterceptChatProcessor;", "()V", "getUrl", "", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "parseIntent", "Landroid/os/Bundle;", "extBundle", "message_base_tb_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SimpleChatInterceptProcessor implements InterceptChatProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(530579506);
        t2o.a(529531074);
    }

    private final Bundle parseIntent(Intent intent, Bundle bundle) {
        Bundle bundle2;
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("57173a85", new Object[]{this, intent, bundle});
        }
        if (intent == null) {
            return new Bundle();
        }
        try {
            bundle2 = intent.getExtras();
        } catch (IllegalArgumentException unused) {
            bundle2 = null;
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        Uri data = intent.getData();
        if (!(data == null || (queryParameterNames = data.getQueryParameterNames()) == null || queryParameterNames.isEmpty())) {
            for (String str : queryParameterNames) {
                if (!bundle2.containsKey(str)) {
                    bundle2.putString(str, data.getQueryParameter(str));
                }
            }
        }
        return bundle2;
    }

    public static /* synthetic */ Bundle parseIntent$default(SimpleChatInterceptProcessor simpleChatInterceptProcessor, Intent intent, Bundle bundle, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("b6dd9da2", new Object[]{simpleChatInterceptProcessor, intent, bundle, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        return simpleChatInterceptProcessor.parseIntent(intent, bundle);
    }

    @Override // com.taobao.message.nav.InterceptChatProcessor
    public String getUrl(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79bd1043", new Object[]{this, intent});
        }
        ckf.h(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        Bundle parseIntent$default = parseIntent$default(this, intent, null, 2, null);
        if (parseIntent$default.containsKey("bizType")) {
            try {
                String string = parseIntent$default.getString("bizType");
                if (string != null) {
                    int parseInt = Integer.parseInt(string);
                    if (parseInt >= 0 && 10999 >= parseInt) {
                        return LoadingChatActivity.LOAD_CHAT_URL;
                    }
                } else {
                    ckf.s();
                    throw null;
                }
            } catch (Throwable unused) {
                return LoadingChatActivity.LOAD_CHAT_URL;
            }
        }
        if (!parseIntent$default.containsKey(WXConstantsOut.TOUSER) && !parseIntent$default.containsKey("targetId") && !parseIntent$default.containsKey("ccode")) {
            TLog.loge("SimpleChatInterceptProcessor", "lack params");
            return LoadingChatActivity.LOAD_CHAT_URL;
        } else if (ConfigUtil.getSamplingValue("mpm_data_switch", "useLoadingChatV6", 10000L)) {
            return SimpleChatActivity.URL;
        } else {
            return LoadingChatActivity.LOAD_CHAT_URL;
        }
    }
}
