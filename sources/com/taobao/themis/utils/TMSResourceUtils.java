package com.taobao.themis.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.uyv;
import tb.was;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSResourceUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum ResourceType {
        ONLINE,
        BASE64,
        INTERNAL;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ResourceType resourceType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/utils/TMSResourceUtils$ResourceType");
        }

        public static ResourceType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ResourceType) ipChange.ipc$dispatch("993b455b", new Object[]{str});
            }
            return (ResourceType) Enum.valueOf(ResourceType.class, str);
        }
    }

    static {
        t2o.a(849346574);
    }

    public static ResourceType a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResourceType) ipChange.ipc$dispatch("d0565411", new Object[]{str});
        }
        if (str.startsWith(uyv.HTTPS_SCHEMA) || str.startsWith("http:")) {
            return ResourceType.ONLINE;
        }
        if (was.a(str)) {
            return ResourceType.BASE64;
        }
        return ResourceType.INTERNAL;
    }
}
