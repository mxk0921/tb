package com.vivo.push.sdk.service;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CommandClientService extends CommandService {
    @Override // com.vivo.push.sdk.service.CommandService
    public final boolean a(String str) {
        return "com.vivo.pushclient.action.RECEIVE".equals(str);
    }
}
