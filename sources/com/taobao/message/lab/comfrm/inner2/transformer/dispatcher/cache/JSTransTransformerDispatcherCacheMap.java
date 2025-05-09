package com.taobao.message.lab.comfrm.inner2.transformer.dispatcher.cache;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.inner2.JSTransformDispatcher;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/taobao/message/lab/comfrm/inner2/transformer/dispatcher/cache/JSTransTransformerDispatcherCacheMap;", "", "<init>", "()V", "", "key", "Lcom/taobao/message/lab/comfrm/inner2/JSTransformDispatcher;", "transformer", "Ltb/xhv;", "put", "(Ljava/lang/String;Lcom/taobao/message/lab/comfrm/inner2/JSTransformDispatcher;)V", "get", "(Ljava/lang/String;)Lcom/taobao/message/lab/comfrm/inner2/JSTransformDispatcher;", "Ljava/util/concurrent/ConcurrentHashMap;", "map", "Ljava/util/concurrent/ConcurrentHashMap;", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class JSTransTransformerDispatcherCacheMap {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final JSTransTransformerDispatcherCacheMap INSTANCE = new JSTransTransformerDispatcherCacheMap();
    private static final ConcurrentHashMap<String, JSTransformDispatcher> map = new ConcurrentHashMap<>();

    static {
        t2o.a(537919748);
    }

    private JSTransTransformerDispatcherCacheMap() {
    }

    public final JSTransformDispatcher get(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSTransformDispatcher) ipChange.ipc$dispatch("38e29055", new Object[]{this, str});
        }
        ckf.g(str, "key");
        return map.get(str);
    }

    public final void put(String str, JSTransformDispatcher jSTransformDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9065c66", new Object[]{this, str, jSTransformDispatcher});
            return;
        }
        ckf.g(str, "key");
        ckf.g(jSTransformDispatcher, "transformer");
        map.put(str, jSTransformDispatcher);
    }
}
