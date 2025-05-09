package com.alibaba.triver.pha_engine.megabridge.middleware;

import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.common.Proxiable;
import java.util.Map;
import tb.kdb;
import tb.ndb;
import tb.pdb;
import tb.s2d;

/* compiled from: Taobao */
@DefaultImpl("com.alibaba.triver.pha_engine.megabridge.middleware.TriverMtopConfigMiddlewareImpl")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface ITriverMtopMiddle extends pdb, Proxiable {
    @Override // tb.pdb
    /* synthetic */ ExecuteResult invoke(String str, String str2, kdb kdbVar, Map map, s2d s2dVar, ndb ndbVar);
}
