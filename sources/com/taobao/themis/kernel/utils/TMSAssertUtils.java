package com.taobao.themis.kernel.utils;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSAssertUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean ENABLE_ASSERT = false;
    public static final TMSAssertUtils INSTANCE = new TMSAssertUtils();

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/taobao/themis/kernel/utils/TMSAssertUtils$TMSAssertError;", "Ljava/lang/Error;", "Lkotlin/Error;", "message", "", "(Ljava/lang/String;)V", "themis_kernel_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class TMSAssertError extends Error {
        static {
            t2o.a(839909963);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TMSAssertError(String str) {
            super(str);
            ckf.g(str, "message");
        }
    }

    static {
        t2o.a(839909962);
    }

    @JvmStatic
    public static final void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("338c002f", new Object[]{new Boolean(z), str});
        } else {
            ckf.g(str, "message");
        }
    }
}
