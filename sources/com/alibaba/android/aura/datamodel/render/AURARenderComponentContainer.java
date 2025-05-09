package com.alibaba.android.aura.datamodel.render;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Collections;
import java.util.Set;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURARenderComponentContainer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String containerType;
    public String identifySuffix;
    public boolean isPreset;
    public String md5;
    public String name;
    public Set<String> types;
    public String url;
    public String version;

    static {
        t2o.a(80740395);
    }

    public AURARenderComponentContainer() {
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AURARenderComponentContainer{containerType='" + this.containerType + "', name='" + this.name + "', types=" + this.types + ", url='" + this.url + "', version='" + this.version + "', md5='" + this.md5 + "', isPreset=" + this.isPreset + '}';
    }

    public AURARenderComponentContainer(String str, String str2, String str3, Set<String> set, String str4, String str5) {
        this.containerType = str;
        this.name = str2;
        this.version = str3;
        this.types = set != null ? Collections.unmodifiableSet(set) : null;
        this.url = str4;
        this.md5 = str5;
    }
}
