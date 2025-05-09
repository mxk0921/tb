package com.taobao.android.fluid.framework.data.remote.base;

import mtopsdk.mtop.domain.IMTOPDataObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IMTOPRequest extends IMTOPDataObject {
    String getApi();

    String getVersion();

    boolean isNeedEcode();

    boolean isNeedSession();
}
