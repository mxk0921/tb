package com.alibaba.ability.impl.clipboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.cu;
import tb.jpu;
import tb.kdb;
import tb.t2o;
import tb.v3i;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ClipboardAbility extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_GET = "get";
    public static final String API_SET = "set";
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(101711875);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(101711874);
    }

    public static /* synthetic */ Object ipc$super(ClipboardAbility clipboardAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/clipboard/ClipboardAbility");
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        Context applicationContext;
        String str2;
        ClipData.Item itemAt;
        CharSequence coerceToText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context == null || (applicationContext = context.getApplicationContext()) == null) {
            return new ErrorResult("400", "NoAppCtx", (Map) null, 4, (a07) null);
        }
        int hashCode = str.hashCode();
        if (hashCode != 102230) {
            if (hashCode == 113762 && str.equals("set")) {
                String w = MegaUtils.w(map, "text", null);
                if (w == null) {
                    w = MegaUtils.w(map, "value", null);
                }
                if (w == null) {
                    return new ErrorResult("400", "NoValue", (Map) null, 4, (a07) null);
                }
                Object systemService = applicationContext.getSystemService("clipboard");
                if (systemService != null) {
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("commentValue", w));
                    Boolean bool = Boolean.TRUE;
                    if (!ckf.b(MegaUtils.g(map, NotificationCompat.GROUP_KEY_SILENT, bool), bool)) {
                        Toast.makeText(applicationContext, applicationContext.getString(R.string.app_copy_success), 0).show();
                    }
                    return new FinishResult(null, null, 3, null);
                }
                throw new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
            }
        } else if (str.equals("get")) {
            Object systemService2 = applicationContext.getSystemService("clipboard");
            if (systemService2 != null) {
                ClipData primaryClip = ((ClipboardManager) systemService2).getPrimaryClip();
                if (primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null || (coerceToText = itemAt.coerceToText(applicationContext)) == null || (str2 = coerceToText.toString()) == null) {
                    str2 = "";
                }
                vqVar.c(new FinishResult(new JSONObject(v3i.f(jpu.a("result", str2))), "onSuccess"));
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
        }
        return new ErrorResult("404", (String) null, (Map) null, 6, (a07) null);
    }
}
