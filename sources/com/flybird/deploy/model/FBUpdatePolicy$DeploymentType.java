package com.flybird.deploy.model;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum FBUpdatePolicy$DeploymentType {
    BasicDeployment("1"),
    EnhancedDeployment("0"),
    PackageDeployment("2");
    
    public final String inEventLogValue;

    FBUpdatePolicy$DeploymentType(String str) {
        this.inEventLogValue = str;
    }
}
