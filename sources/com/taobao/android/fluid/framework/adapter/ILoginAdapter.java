package com.taobao.android.fluid.framework.adapter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface ILoginAdapter extends IAdapter {
    public static final String ADAPTER_NAME = "ILoginAdapter";

    String getNick();

    String getUserId();

    String getUserNickLink();

    boolean isSessionValid();
}
