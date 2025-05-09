package com.taobao.alivfssdk.fresco.cache.disk;

import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import tb.mjx;
import tb.ps2;
import tb.sa2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface a extends Closeable {

    /* compiled from: Taobao */
    /* renamed from: com.taobao.alivfssdk.fresco.cache.disk.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface AbstractC0322a {
        String getId();

        long getSize();

        long getTimestamp();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void a(mjx mjxVar, ps2 ps2Var, Object obj) throws IOException;

        sa2 b(ps2 ps2Var, Object obj) throws IOException;

        boolean cleanUp();
    }

    void J() throws IOException;

    Collection<AbstractC0322a> K0() throws IOException;

    b P(String str, ps2 ps2Var, Object obj) throws IOException;

    long Q(String str, ps2 ps2Var) throws IOException;

    boolean b0(String str, ps2 ps2Var, Object obj) throws IOException;

    void clearAll() throws IOException;

    List<String> f(String str);

    sa2 h(String str, ps2 ps2Var, Object obj) throws IOException;

    boolean isExternal();

    long k(AbstractC0322a aVar) throws IOException;

    String r0();
}
