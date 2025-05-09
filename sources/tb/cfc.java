package tb;

import com.taobao.infoflow.protocol.subservice.ISubService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface cfc {
    <T extends ISubService> T a(Class<T> cls);

    arb getContainerType();
}
