package com.alibaba.ariver.kernel.api.node;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface DataNode extends Node {
    <T> T getData(Class<T> cls);

    <T> T getData(Class<T> cls, boolean z);

    <T> void setData(Class<T> cls, T t);
}
