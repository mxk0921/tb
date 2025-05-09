package com.taobao.tao.messagekit.core.model;

import java.io.Serializable;
import java.util.Map;
import tb.cs6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IProtocol extends Serializable {
    void assemble();

    int bizCode();

    long createTime();

    void fromProtocol(cs6 cs6Var);

    String getID();

    int monitorTag();

    int msgType();

    boolean needACK();

    byte qosLevel();

    String routerId();

    int statusCode();

    int subType();

    int sysCode();

    Map<String, Object> toMap();

    byte[] toProtocol();

    String topic();

    int type();

    String userId();
}
