package com.alibaba.android.split.manager;

import android.content.Context;
import com.alibaba.android.split.manager.IPluginContext;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Set;
import tb.jcq;
import tb.ocq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface a<C extends IPluginContext> {
    boolean a(ocq ocqVar);

    boolean b(ocq ocqVar);

    void c(String str);

    void d(jcq jcqVar);

    void e(Context context, Collection<File> collection) throws Exception;

    void f(String str, IPluginContext.Status status);

    boolean g(Context context, ClassLoader classLoader) throws Exception;

    void h(ocq ocqVar);

    C i(String str);

    boolean j(ClassLoader classLoader, boolean z, boolean z2, boolean z3, ocq ocqVar);

    boolean k(String str);

    boolean l(ocq ocqVar) throws Exception;

    boolean m(Set<ocq> set) throws Exception;

    boolean n(Context context, String str);

    boolean o(ClassLoader classLoader, ocq ocqVar, boolean z, boolean z2) throws IOException;
}
