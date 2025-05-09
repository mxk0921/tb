package com.taobao.android.dressup;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/taobao/android/dressup/BundleInfo;", "", "()V", "Companion", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class BundleInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Companion Companion = new Companion(null);

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/taobao/android/dressup/BundleInfo$Companion;", "", "()V", "getVersion", "", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(918552579);
        }

        public Companion() {
        }

        @JvmStatic
        public final String getVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
            }
            return "null";
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552578);
    }

    @JvmStatic
    public static final String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[0]);
        }
        return Companion.getVersion();
    }
}
