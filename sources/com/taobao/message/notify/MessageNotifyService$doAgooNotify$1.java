package com.taobao.message.notify;

import android.content.Intent;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Class;", "clazz", "Ltb/xhv;", "invoke", "(Ljava/lang/Class;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MessageNotifyService$doAgooNotify$1 extends Lambda implements g1a<Class<?>, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Intent $intent;
    public final /* synthetic */ String $invokeTag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageNotifyService$doAgooNotify$1(Intent intent, String str) {
        super(1);
        this.$intent = intent;
        this.$invokeTag = str;
    }

    public static /* synthetic */ Object ipc$super(MessageNotifyService$doAgooNotify$1 messageNotifyService$doAgooNotify$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/notify/MessageNotifyService$doAgooNotify$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Class<?> cls) {
        invoke2(cls);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Class<?> cls) {
        ckf.h(cls, "clazz");
        try {
            cls.getMethod("doAgooNotify", Intent.class, String.class).invoke(null, this.$intent, this.$invokeTag);
        } catch (Throwable th) {
            TLog.loge("MessageNotifyService", Log.getStackTraceString(th));
        }
    }
}
