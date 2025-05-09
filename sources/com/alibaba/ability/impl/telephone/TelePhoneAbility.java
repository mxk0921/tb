package com.alibaba.ability.impl.telephone;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.cu;
import tb.kdb;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class TelePhoneAbility extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_PHONECALL = "call";
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(136314883);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(136314882);
    }

    public static /* synthetic */ Object ipc$super(TelePhoneAbility telePhoneAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/telephone/TelePhoneAbility");
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return ErrorResult.a.Companion.g("NoCtx");
        }
        if (str.hashCode() != 3045982 || !str.equals("call")) {
            return ErrorResult.a.Companion.a("Api Not Found");
        }
        Intent intent = new Intent("android.intent.action.DIAL");
        String w = MegaUtils.w(map, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, null);
        if ((w == null || w.length() == 0) && (w = MegaUtils.w(map, "tel", null)) == null) {
            return ErrorResult.a.Companion.g("Empty Tel");
        }
        intent.setData(Uri.parse(w));
        try {
            context.startActivity(intent);
            return new FinishResult(null, null, 3, null);
        } catch (ActivityNotFoundException unused) {
            return ErrorResult.a.Companion.g("Device Not Support");
        }
    }
}
