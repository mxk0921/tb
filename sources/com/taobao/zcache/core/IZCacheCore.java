package com.taobao.zcache.core;

import com.taobao.zcache.IZCacheClientListener;
import com.taobao.zcache.ResourceResponse;
import com.taobao.zcache.ResourceResponseCallback;
import com.taobao.zcache.ZCacheConfig;
import java.util.List;
import tb.ekl;
import tb.fkl;
import tb.y8o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IZCacheCore extends IZCacheClientListener {
    void cleanup();

    void clear(String str);

    void clearResource(String str, String str2, String str3);

    @Override // com.taobao.zcache.IZCacheClientListener
    void clientActived();

    @Override // com.taobao.zcache.IZCacheClientListener
    void clientDeactived();

    String getACacheRootPath(String str, String str2);

    long getAccessAPI();

    ResourceResponse getResource(y8o y8oVar);

    void getResource(y8o y8oVar, ResourceResponseCallback resourceResponseCallback);

    void installPreload(String str);

    boolean isInstalled(ekl eklVar);

    boolean isResourceInstalled(y8o y8oVar);

    void prefetch(List<String> list, String str);

    void registerAccept(String str, String str2, String str3);

    void removePack(ekl eklVar);

    void setDefaultConfig(ZCacheConfig zCacheConfig);

    void setPackMinSeq(String str, long j, String str2);

    void setup(String str, String str2, int i);

    void setupSubProcess();

    void startUpdate();

    void syncSubProcessConfig();

    void updatePack(ekl eklVar, PackUpdateCallback packUpdateCallback, fkl fklVar);
}
