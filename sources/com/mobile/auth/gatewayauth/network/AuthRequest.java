package com.mobile.auth.gatewayauth.network;

import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.mobile.auth.OO00OOO;
import com.nirvana.tools.jsoner.JsonerTag;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AuthRequest extends OO00OOO {
    @JsonerTag(keyName = HeaderConstant.HEADER_KEY_VERSION)
    private String Version = "2017-05-25";
    @JsonerTag(keyName = "Format")
    private String Format = "JSON";
}
