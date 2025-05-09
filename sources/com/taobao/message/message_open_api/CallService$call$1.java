package com.taobao.message.message_open_api;

import android.content.Context;
import android.os.Handler;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ljava/lang/Class;", "clazz", "Ltb/xhv;", "invoke", "(Ljava/lang/Class;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class CallService$call$1 extends Lambda implements g1a<Class<?>, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $api;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ JSONObject $data;
    public final /* synthetic */ Map $ext;
    public final /* synthetic */ Handler $handler;
    public final /* synthetic */ IObserver $observer;
    public final /* synthetic */ Map $options;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallService$call$1(Handler handler, Context context, String str, JSONObject jSONObject, Map map, Map map2, IObserver iObserver) {
        super(1);
        this.$handler = handler;
        this.$context = context;
        this.$api = str;
        this.$data = jSONObject;
        this.$options = map;
        this.$ext = map2;
        this.$observer = iObserver;
    }

    public static /* synthetic */ Object ipc$super(CallService$call$1 callService$call$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/message_open_api/CallService$call$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Class<?> cls) {
        invoke2(cls);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5e481e", new Object[]{this, cls});
            return;
        }
        ckf.h(cls, "clazz");
        CallService.access$callImpl(CallService.INSTANCE, this.$handler, cls, this.$context, this.$api, this.$data, this.$options, this.$ext, this.$observer);
    }
}
