package anetwork.channel.interceptor;

import anet.channel.request.Request;
import java.util.concurrent.Future;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface Interceptor {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface Chain {
        Callback callback();

        Future proceed(Request request, Callback callback);

        Request request();
    }

    Future intercept(Chain chain);
}
