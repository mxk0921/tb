package com.alibaba.android.split.manager;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IPluginContext {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum Status {
        UN_VERIFIED,
        VERIFIED,
        EMULATED,
        INSTALLED,
        LOADED,
        UPDATED;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Status status, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/manager/IPluginContext$Status");
        }

        public static Status valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Status) ipChange.ipc$dispatch("ea10341f", new Object[]{str});
            }
            return (Status) Enum.valueOf(Status.class, str);
        }
    }

    void a(Status status);

    boolean b();

    File c();

    String d();

    boolean e();
}
