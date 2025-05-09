package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ConnectInfo implements IMessageEntity {
    @Packed

    /* renamed from: a  reason: collision with root package name */
    private List<String> f5476a;
    @Packed
    private List<Scope> b;
    @Packed
    private String c;
    @Packed
    private String d;

    public ConnectInfo() {
    }

    public List<String> getApiNameList() {
        return this.f5476a;
    }

    public String getFingerprint() {
        return this.c;
    }

    public List<Scope> getScopeList() {
        return this.b;
    }

    public String getSubAppID() {
        return this.d;
    }

    public void setApiNameList(List<String> list) {
        this.f5476a = list;
    }

    public void setFingerprint(String str) {
        this.c = str;
    }

    public void setScopeList(List<Scope> list) {
        this.b = list;
    }

    public void setSubAppID(String str) {
        this.d = str;
    }

    public ConnectInfo(List<String> list, List<Scope> list2, String str, String str2) {
        this.f5476a = list;
        this.b = list2;
        this.c = str;
        this.d = str2;
    }
}
