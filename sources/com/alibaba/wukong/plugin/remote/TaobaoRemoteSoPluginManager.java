package com.alibaba.wukong.plugin.remote;

import com.alibaba.security.client.smart.core.core.remote.ITaobaoRemoteSoService;
import com.alibaba.security.client.smart.core.core.remote.OnRemoteSoLoadListener;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import tb.bzn;
import tb.l6h;
import tb.u5h;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TaobaoRemoteSoPluginManager implements ITaobaoRemoteSoService {
    private boolean isRemoteSoLibraryCompiled() {
        try {
            IpChange ipChange = bzn.$ipChange;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // com.alibaba.security.client.smart.core.core.remote.ITaobaoRemoteSoService
    public boolean isRemoteSoLoaded(String str) {
        if (!isRemoteSoLibraryCompiled()) {
            return false;
        }
        return bzn.d().load(str).i();
    }

    @Override // com.alibaba.security.client.smart.core.core.remote.ITaobaoRemoteSoService
    public void loadRemoteSo(final String str, final OnRemoteSoLoadListener onRemoteSoLoadListener) {
        if (!isRemoteSoLibraryCompiled()) {
            onRemoteSoLoadListener.onResult(str, false, "remote so module not compiled");
        } else {
            bzn.d().a(str, new u5h() { // from class: com.alibaba.wukong.plugin.remote.TaobaoRemoteSoPluginManager.1
                @Override // tb.u5h
                public void onLoadFinished(l6h l6hVar) {
                    String str2;
                    if (l6hVar == null) {
                        onRemoteSoLoadListener.onResult(str, false, "loadResult is null");
                    } else if (l6hVar.i()) {
                        onRemoteSoLoadListener.onResult(str, true, "success");
                    } else {
                        RSoException c = l6hVar.c();
                        OnRemoteSoLoadListener onRemoteSoLoadListener2 = onRemoteSoLoadListener;
                        String str3 = str;
                        if (c == null) {
                            str2 = "so exp is null";
                        } else {
                            str2 = c.getErrorMsg();
                        }
                        onRemoteSoLoadListener2.onResult(str3, false, str2);
                    }
                }
            });
        }
    }
}
