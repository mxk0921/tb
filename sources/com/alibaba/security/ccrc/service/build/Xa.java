package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.http.model.VersionInfo;
import com.alibaba.security.wukong.config.WukongConfigData;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface Xa {
    void a();

    void a(xb xbVar);

    void a(WukongConfigData wukongConfigData);

    void a(Map<String, String> map);

    boolean a(VersionInfo versionInfo);

    boolean a(String str);

    WukongConfigData b();

    void b(VersionInfo versionInfo);

    void c();

    boolean d();

    String e();

    void release();
}
