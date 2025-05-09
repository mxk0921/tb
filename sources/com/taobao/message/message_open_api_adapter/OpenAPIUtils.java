package com.taobao.message.message_open_api_adapter;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URI;
import java.net.URISyntaxException;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;
import tb.wsq;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\u0006"}, d2 = {"Lcom/taobao/message/message_open_api_adapter/OpenAPIUtils;", "", "()V", "getUrlWithoutParameters", "", "url", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OpenAPIUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final OpenAPIUtils INSTANCE = new OpenAPIUtils();

    static {
        t2o.a(529531068);
    }

    private OpenAPIUtils() {
    }

    public final String getUrlWithoutParameters(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9484fc76", new Object[]{this, str});
        }
        try {
            Uri parse = Uri.parse(str);
            ckf.c(parse, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
            return new URI(parse.getScheme(), parse.getAuthority(), parse.getPath(), null, parse.getFragment()).toString();
        } catch (URISyntaxException e) {
            e.printStackTrace();
            if (str == null) {
                return null;
            }
            Object[] array = wsq.z0(str, new String[]{"\\?"}, false, 0, 6, null).toArray(new String[0]);
            if (array != null) {
                return ((String[]) array)[0];
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
