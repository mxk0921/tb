package com.taobao.android.litecreator.sdk.framework.container.ut;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UtParams extends HashMap<String, String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705529);
    }

    public static /* synthetic */ Object ipc$super(UtParams utParams, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/framework/container/ut/UtParams");
    }

    public static UtParams newInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UtParams) ipChange.ipc$dispatch("49b7c6c", new Object[0]);
        }
        return new UtParams();
    }

    public UtParams putParams(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UtParams) ipChange.ipc$dispatch("203f99b8", new Object[]{this, str, str2});
        }
        put(str, str2);
        return this;
    }

    public UtParams safePutParams(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UtParams) ipChange.ipc$dispatch("221468e5", new Object[]{this, str, str2});
        }
        if (!TextUtils.isEmpty(str2)) {
            put(str, str2);
        }
        return this;
    }
}
